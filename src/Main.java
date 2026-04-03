void main() {
    Scanner scan = new Scanner(System.in);

    ArrayList<String> strings = new ArrayList<>();

    System.out.println("Input file name: ");
    String in = scan.nextLine();
    try (Scanner reader = new Scanner(new File(in))){
        while (reader.hasNextLine()){
            String next = reader.nextLine().strip();
            try {
                if (!next.isEmpty())
                    strings.add(next);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.print("Error");
            }

        }
    }
    catch (FileNotFoundException e){
        System.out.println("File not found");
    }

    String[] sort = new String[strings.size()];

    for (int i = 0; i < strings.size(); i++){
        sort[i] = strings.get(i);
    }

    RadixSort radixSort = new RadixSort(sort);

    System.out.println(Arrays.toString(radixSort.sort()));//[a, ap, d, cba, de]
}
