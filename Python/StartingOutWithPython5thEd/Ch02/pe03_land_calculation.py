FEET_PER_ACRE = 43560
square_feet = float(input("Enter the total square feet in a trct of land: "))
print(f"The number of acres in a tract of land of {square_feet} feet is {square_feet/FEET_PER_ACRE:,.1f} acres")