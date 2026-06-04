def readIntNum(message):
    
    try:
        num = input(message).strip().lower()
        if num == 'stop':
            return num
        return int(num)

    except:
        print("\nThe number must be int or type \"stop\" to finish")
        return None


def fillListUntilStop(originalaList):

    print("Start filling the list (Type \"stop\" to finish)\n\n")
    counter = 1

    while True:
        element = readIntNum(f"Enter element [{counter}] : ")

        if element == 'stop': break

        if element is not None:
            originalaList.append(element)
            counter += 1


def isEven(num):

    return num % 2 == 0


def isOdd(num):

    return num % 2 != 0


def filterListByCondition(originalList, condition):

    return [element for element in originalList if condition(element)]


def printList(elements, title):

    print(f"\n{title}")

    if not elements:
        print(" (Empty)")
    else:
        print(" " + " ".join(map(str, elements)))


def main():
    
    myList = []

    fillListUntilStop(myList)
    
    evensList = filterListByCondition(myList, isEven)
    oddsList = filterListByCondition(myList, isOdd)

    printList(myList, "Original List")
    printList(evensList, "Even Numbers")
    printList(oddsList, "Odd Numbers")
    print()

if __name__ == "__main__":
    main()    
