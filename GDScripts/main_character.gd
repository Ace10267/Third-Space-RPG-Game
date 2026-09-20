extends CharacterBody2D

@export var speed: float = 130.0

@onready var animated_sprite: AnimatedSprite2D = $AnimatedSprite2D

func _physics_process(_delta: float) -> void:
    # Get the movement direction from the arrow keys or WASD keys
    var direction := Input.get_vector("ui_left", "ui_right", "ui_up", "ui_down")
    
    # Application of velocity as speed in a specified direction
    if direction != Vector2.ZERO:
        velocity = direction * speed
        _update_animation(direction)
    else:
        velocity = Vector2.ZERO
        if animated_sprite and animated_sprite.sprite_frames:
            animated_sprite.play("idle")

    move_and_slide()

func _update_animation(direction: Vector2) -> void:
    if not animated_sprite:
        return

    # Playing the walking animation and flipping sprite based on inputted direction
    animated_sprite.play("walk")
    if direction.x != 0:
        animated_sprite.flip_h = direction.x < 0
        