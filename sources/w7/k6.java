package w7;

import org.telegram.messenger.DispatchQueue;
public abstract class k6 {
    public static DispatchQueue f48774a;

    public static void a(int i10, int i11, int[] iArr, int[] iArr2) {
        int i12;
        int i13;
        for (int i14 = 0; i14 < 315; i14++) {
            int i15 = i14 - 7;
            if (i15 >= 0 && i15 < 288) {
                i13 = iArr[(i15 * i11) + i10];
            } else {
                i13 = 0;
            }
            iArr2[i14] = i13;
        }
        int i16 = 0;
        while (i16 < 315) {
            iArr2[i16 + 315] = iArr2[i16];
            int i17 = i16 + 1;
            while (true) {
                i12 = i16 + 15;
                if (i17 >= i12) {
                    break;
                }
                iArr2[i17 + 315] = Math.max(iArr2[i17 + 314], iArr2[i17]);
                i17++;
            }
            iArr2[i16 + 644] = iArr2[i16 + 14];
            for (int i18 = i16 + 13; i18 >= i16; i18--) {
                iArr2[i18 + 630] = Math.max(iArr2[i18 + 631], iArr2[i18]);
            }
            i16 = i12;
        }
        for (int i19 = 0; i19 < 288; i19++) {
            iArr[(i19 * i11) + i10] = Math.max(iArr2[i19 + 630], iArr2[i19 + 329]);
        }
    }
}
