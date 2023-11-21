class ScreenLaptor:
    def __init__(self, size, resolution, screen_type):
        self.size = size
        self.resolution = resolution
        self.screen_type = screen_type
        self.is_on = False

    def turn_on(self):
        if not self.is_on:
            self.is_on = True
            print("The screen is now on.")
        else:
            print("The screen is already on.")

    def turn_off(self):
        if self.is_on:
            self.is_on = False
            print("The screen is now off.")
        else:
            print("The screen is already off.")

    def display_info(self):
        print(f"Screen Size: {self.size}")
        print(f"Resolution: {self.resolution}")
        print(f"Screen Type: {self.screen_type}")
        print(f"Screen Status: {'On' if self.is_on else 'Off'}")

