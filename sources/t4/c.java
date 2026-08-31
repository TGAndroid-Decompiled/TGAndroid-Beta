package t4;

import java.util.ArrayList;
import k7.y7;
public final class c implements j {
    public static final int[] f47881b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i10, ArrayList arrayList) {
        if (y7.b(i10, 0, 7, f47881b) != -1 && !arrayList.contains(Integer.valueOf(i10))) {
            arrayList.add(Integer.valueOf(i10));
        }
    }
}
