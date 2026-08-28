package rb;

import d5.p;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import lb.h;
import n2.w;
public abstract class c {
    public static final int[] f47113a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset f47114b = StandardCharsets.ISO_8859_1;

    public static void a(java.lang.String r8, pb.d r9, lb.a r10, java.nio.charset.Charset r11) {
        throw new UnsupportedOperationException("Method not decompiled: rb.c.a(java.lang.String, pb.d, lb.a, java.nio.charset.Charset):void");
    }

    public static boolean b(String str) {
        byte[] bytes = str.getBytes(h.f16762b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i9 = 0; i9 < length; i9 += 2) {
            int i10 = bytes[i9] & 255;
            if ((i10 < 129 || i10 > 159) && (i10 < 224 || i10 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(int i9, pb.e eVar, pb.b bVar) {
        int i10 = eVar.d;
        w wVar = eVar.f45530c[bVar.ordinal()];
        int i11 = wVar.f18360b;
        int i12 = 0;
        for (p pVar : (p[]) wVar.f18361c) {
            i12 += pVar.f4376a;
        }
        if (i10 - (i12 * i11) < (i9 + 7) / 8) {
            return false;
        }
        return true;
    }
}
