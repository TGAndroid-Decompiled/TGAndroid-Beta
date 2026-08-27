package sb;

import com.google.firebase.messaging.s;
import java.util.Arrays;

public abstract class d {

    public static final int[][] f47835a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    public static final int[][] f47836b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    public static final int[][] f47837c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(b bVar, boolean z10) {
        int i10 = bVar.f47831b;
        int i11 = bVar.f47832c;
        int i12 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        byte[][] bArr = bVar.f47830a;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            byte b10 = -1;
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                byte b11 = z10 ? bArr[i14][i16] : bArr[i16][i14];
                if (b11 == b10) {
                    i15++;
                } else {
                    if (i15 >= 5) {
                        i13 += i15 - 2;
                    }
                    b10 = b11;
                    i15 = 1;
                }
            }
            if (i15 >= 5) {
                i13 = (i15 - 2) + i13;
            }
        }
        return i13;
    }

    public static void b(mb.a aVar, qb.b bVar, qb.e eVar, int i10, b bVar2) throws s {
        char c10;
        char c11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        byte[][] bArr = bVar2.f47830a;
        int i18 = bVar2.f47831b;
        int i19 = bVar2.f47832c;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = f47835a[0].length;
        e(0, 0, bVar2);
        int i20 = i18 - length;
        e(i20, 0, bVar2);
        e(0, i20, bVar2);
        d(0, 7, bVar2);
        int i21 = i18 - 8;
        d(i21, 7, bVar2);
        d(0, i21, bVar2);
        f(7, 0, bVar2);
        int i22 = i19 - 8;
        f(i22, 0, bVar2);
        int i23 = i19 - 7;
        f(7, i23, bVar2);
        if (bVar2.a(8, i22) == 0) {
            throw new s();
        }
        bVar2.b(8, i22, 1);
        int i24 = eVar.f46198a;
        if (i24 < 2) {
            c11 = 1;
            c10 = 0;
        } else {
            c10 = 0;
            int[] iArr = f47837c[i24 - 1];
            c11 = 1;
            int length2 = iArr.length;
            int i25 = 0;
            while (i25 < length2) {
                int i26 = iArr[i25];
                if (i26 >= 0) {
                    int length3 = iArr.length;
                    int i27 = 0;
                    while (i27 < length3) {
                        int i28 = iArr[i27];
                        if (i28 >= 0 && g(bVar2.a(i28, i26))) {
                            int i29 = i28 - 2;
                            int i30 = i26 - 2;
                            int i31 = 0;
                            while (true) {
                                if (i31 >= 5) {
                                    break;
                                }
                                int[] iArr2 = f47836b[i31];
                                int i32 = i31;
                                int i33 = 0;
                                for (int i34 = 5; i33 < i34; i34 = 5) {
                                    int i35 = i33;
                                    bVar2.b(i29 + i33, i30 + i32, iArr2[i35]);
                                    i33 = i35 + 1;
                                    length3 = length3;
                                }
                                i31 = i32 + 1;
                            }
                        }
                        i27++;
                        bArr = bArr;
                        i18 = i18;
                        length3 = length3;
                    }
                }
                i25++;
                bArr = bArr;
                i18 = i18;
            }
        }
        byte[][] bArr3 = bArr;
        int i36 = i18;
        int i37 = 8;
        while (i37 < i21) {
            int i38 = i37 + 1;
            int i39 = i38 % 2;
            if (g(bVar2.a(i37, 6))) {
                bVar2.b(i37, 6, i39);
            }
            if (g(bVar2.a(6, i37))) {
                bVar2.b(6, i37, i39);
            }
            i37 = i38;
        }
        mb.a aVar2 = new mb.a();
        if (i10 < 0 || i10 >= 8) {
            throw new s("Invalid mask pattern");
        }
        int i40 = (bVar.f46182a << 3) | i10;
        aVar2.b(i40, 5);
        aVar2.b(c(i40, 1335), 10);
        mb.a aVar3 = new mb.a();
        aVar3.b(21522, 15);
        if (aVar2.f17918b != aVar3.f17918b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i41 = 0;
        while (true) {
            int[] iArr3 = aVar2.f17917a;
            if (i41 >= iArr3.length) {
                break;
            }
            iArr3[i41] = iArr3[i41] ^ aVar3.f17917a[i41];
            i41++;
        }
        if (aVar2.f17918b != 15) {
            throw new s("should not happen but we got: " + aVar2.f17918b);
        }
        int i42 = 0;
        while (true) {
            int i43 = aVar2.f17918b;
            if (i42 >= i43) {
                break;
            }
            boolean zD = aVar2.d((i43 - 1) - i42);
            int[] iArr4 = d[i42];
            int i44 = iArr4[c10];
            byte[] bArr4 = bArr3[iArr4[c11]];
            byte b10 = zD ? (byte) 1 : (byte) 0;
            bArr4[i44] = b10;
            if (i42 < 8) {
                i17 = (i36 - i42) - 1;
                i16 = 8;
            } else {
                i16 = (i42 - 8) + i23;
                i17 = 8;
            }
            bArr3[i16][i17] = b10;
            i42++;
        }
        if (i24 >= 7) {
            mb.a aVar4 = new mb.a();
            aVar4.b(i24, 6);
            aVar4.b(c(i24, 7973), 12);
            if (aVar4.f17918b != 18) {
                throw new s("should not happen but we got: " + aVar4.f17918b);
            }
            int i45 = 17;
            for (int i46 = 0; i46 < 6; i46++) {
                for (int i47 = 0; i47 < 3; i47++) {
                    boolean zD2 = aVar4.d(i45);
                    i45--;
                    int i48 = (i19 - 11) + i47;
                    byte[] bArr5 = bArr3[i48];
                    byte b11 = zD2 ? (byte) 1 : (byte) 0;
                    bArr5[i46] = b11;
                    bArr3[i46][i48] = b11;
                }
            }
        }
        int i49 = i36 - 1;
        int i50 = i19 - 1;
        int i51 = 0;
        int i52 = -1;
        while (i49 > 0) {
            if (i49 == 6) {
                i49--;
            }
            while (i50 >= 0 && i50 < i19) {
                for (int i53 = 0; i53 < 2; i53++) {
                    int i54 = i49 - i53;
                    if (g(bVar2.a(i54, i50))) {
                        if (i51 < aVar.f17918b) {
                            boolean zD3 = aVar.d(i51);
                            i51++;
                            i11 = zD3;
                        } else {
                            i11 = 0;
                        }
                        if (i10 != -1) {
                            switch (i10) {
                                case 0:
                                    i12 = i50 + i54;
                                    i13 = i12 & 1;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 1:
                                    i13 = i50 & 1;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 2:
                                    i13 = i54 % 3;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 3:
                                    i13 = (i50 + i54) % 3;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 4:
                                    i13 = ((i54 / 3) + (i50 / 2)) & 1;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 5:
                                    int i55 = i50 * i54;
                                    i13 = (i55 % 3) + (i55 & 1);
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 6:
                                    int i56 = i50 * i54;
                                    i14 = i56 & 1;
                                    i15 = i56 % 3;
                                    i12 = i15 + i14;
                                    i13 = i12 & 1;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                case 7:
                                    i15 = (i50 * i54) % 3;
                                    i14 = (i50 + i54) & 1;
                                    i12 = i15 + i14;
                                    i13 = i12 & 1;
                                    if (i13 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i11 = ~i11;
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException(i0.a.k(i10, "Invalid mask pattern: "));
                            }
                        }
                        bArr3[i50][i54] = (byte) i11;
                    }
                }
                i50 += i52;
            }
            i52 = -i52;
            i50 += i52;
            i49 -= 2;
        }
        if (i51 == aVar.f17918b) {
            return;
        }
        throw new s("Not all bits consumed: " + i51 + '/' + aVar.f17918b);
    }

    public static int c(int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i11);
        int i12 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i10 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i12) {
            iNumberOfLeadingZeros2 ^= i11 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i12);
        }
        return iNumberOfLeadingZeros2;
    }

    public static void d(int i10, int i11, b bVar) throws s {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!g(bVar.a(i13, i11))) {
                throw new s();
            }
            bVar.b(i13, i11, 0);
        }
    }

    public static void e(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f47835a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.b(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void f(int i10, int i11, b bVar) throws s {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!g(bVar.a(i10, i13))) {
                throw new s();
            }
            bVar.b(i10, i13, 0);
        }
    }

    public static boolean g(int i10) {
        return i10 == -1;
    }
}
