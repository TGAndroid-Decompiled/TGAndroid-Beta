package sb;

import com.google.firebase.messaging.s;
import d5.p;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import mb.h;
import n2.v;

public abstract class c {

    public static final int[] f47833a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static final Charset f47834b = StandardCharsets.ISO_8859_1;

    public static void a(String str, qb.d dVar, mb.a aVar, Charset charset) throws s {
        int i10;
        int iOrdinal = dVar.ordinal();
        int i11 = 0;
        if (iOrdinal == 1) {
            int length = str.length();
            while (i11 < length) {
                int iCharAt = str.charAt(i11) - '0';
                int i12 = i11 + 2;
                if (i12 < length) {
                    aVar.b(((str.charAt(i11 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i12) - '0'), 10);
                    i11 += 3;
                } else {
                    i11++;
                    if (i11 < length) {
                        aVar.b((iCharAt * 10) + (str.charAt(i11) - '0'), 7);
                        i11 = i12;
                    } else {
                        aVar.b(iCharAt, 4);
                    }
                }
            }
            return;
        }
        if (iOrdinal == 2) {
            int length2 = str.length();
            while (i11 < length2) {
                char cCharAt = str.charAt(i11);
                int[] iArr = f47833a;
                int i13 = cCharAt < '`' ? iArr[cCharAt] : -1;
                if (i13 == -1) {
                    throw new s();
                }
                int i14 = i11 + 1;
                if (i14 < length2) {
                    char cCharAt2 = str.charAt(i14);
                    int i15 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                    if (i15 == -1) {
                        throw new s();
                    }
                    aVar.b((i13 * 45) + i15, 11);
                    i11 += 2;
                } else {
                    aVar.b(i13, 6);
                    i11 = i14;
                }
            }
            return;
        }
        if (iOrdinal == 4) {
            byte[] bytes = str.getBytes(charset);
            int length3 = bytes.length;
            while (i11 < length3) {
                aVar.b(bytes[i11], 8);
                i11++;
            }
            return;
        }
        if (iOrdinal != 6) {
            throw new s("Invalid mode: " + dVar);
        }
        Charset charset2 = h.f17946b;
        if (charset2 == null) {
            throw new s("SJIS Charset not supported on this platform");
        }
        byte[] bytes2 = str.getBytes(charset2);
        if (bytes2.length % 2 != 0) {
            throw new s("Kanji byte size not even");
        }
        int length4 = bytes2.length - 1;
        while (i11 < length4) {
            int i16 = ((bytes2[i11] & 255) << 8) | (bytes2[i11 + 1] & 255);
            int i17 = 33088;
            if (i16 >= 33088 && i16 <= 40956) {
                i10 = i16 - i17;
            } else if (i16 < 57408 || i16 > 60351) {
                i10 = -1;
            } else {
                i17 = 49472;
                i10 = i16 - i17;
            }
            if (i10 == -1) {
                throw new s("Invalid byte sequence");
            }
            aVar.b(((i10 >> 8) * 192) + (i10 & 255), 13);
            i11 += 2;
        }
    }

    public static boolean b(String str) {
        byte[] bytes = str.getBytes(h.f17946b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10 += 2) {
            int i11 = bytes[i10] & 255;
            if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(int i10, qb.e eVar, qb.b bVar) {
        int i11 = eVar.d;
        v vVar = eVar.f46200c[bVar.ordinal()];
        int i12 = vVar.f18186b;
        int i13 = 0;
        for (p pVar : (p[]) vVar.f18187c) {
            i13 += pVar.f4821a;
        }
        return i11 - (i13 * i12) >= (i10 + 7) / 8;
    }
}
