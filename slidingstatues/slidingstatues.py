#Dungeoneering Sliding Statues Puzzle

# In the actual dungeoneering room, there are 4 boards, in this case, we will create a class
# that we will create multiple instances of, and then compare the two correlating boards to
# confirm a matching statue positions
class Board:
    #Our board can be any size, the actual size is 5x5

    #size will represented as one number, since we know it needs to be a square e.g 5 = 5x5, 3 = 3x3
    def __init__(self, size):
        #set up board size
        self.size = size


class Statue:

    #initial, if the x and y are defined
    #we can also define the type as a number, 0 for white statue, 1 for black, by default None until assigned
    def __init__(self, x, y):
        self.type = None
        self.x = x
        self.y = y

    #if they are not defined, this should assign to the default position
    def Statue(self):
        self.x = 0
        self.y = 0

    def moveStatue(self, x, y):
        self.x = x
        self.y = y
        return (x, y)

    def setType(self, input):
        self.type = input
