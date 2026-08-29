package q4;

import i7.p7;
import java.util.ArrayList;
public final class c implements j {
    public static final int[] f46257b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i10, ArrayList arrayList) {
        if (p7.c(i10, 0, 7, f46257b) != -1 && !arrayList.contains(Integer.valueOf(i10))) {
            arrayList.add(Integer.valueOf(i10));
        }
    }
}
