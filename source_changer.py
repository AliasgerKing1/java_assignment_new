import sys

# Check if at least one command-line argument is provided
if len(sys.argv) > 1:
    # Access the value passed as a command-line argument
    value_from_java = sys.argv[1]

    # Print or process the value as needed
    new_file = ""
    with open("./Runner_module.java", "r") as change_file:
        lines = change_file.readlines()
        for line in lines:
            if "String new_path" in line:
                line = f"\t\tString new_path = \"{value_from_java}\";\n"
            new_file += line

    with open("./Runner_module.java", "w") as change_file:
        change_file.write(new_file)

    # print("Value received from Java:", value_from_java)
else:
    print("No value provided by Java.")
