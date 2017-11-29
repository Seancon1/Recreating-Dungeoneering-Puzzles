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
        #assign coordinates for each statue, we cannot have a statue on the same spot
        self.statue1 = [0,0]
        self.statue2 = [0,1]
