package rb;

import j3.r0;
import java.util.Arrays;
public abstract class d {
    public static final int[][] f47115a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] f47116b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] f47117c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(b bVar, boolean z10) {
        int i9;
        byte b10;
        int i10 = bVar.f47111b;
        int i11 = bVar.f47112c;
        if (z10) {
            i9 = i11;
        } else {
            i9 = i10;
        }
        if (!z10) {
            i10 = i11;
        }
        byte[][] bArr = bVar.f47110a;
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            byte b11 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                if (z10) {
                    b10 = bArr[i13][i15];
                } else {
                    b10 = bArr[i15][i13];
                }
                if (b10 == b11) {
                    i14++;
                } else {
                    if (i14 >= 5) {
                        i12 += i14 - 2;
                    }
                    b11 = b10;
                    i14 = 1;
                }
            }
            if (i14 >= 5) {
                i12 = (i14 - 2) + i12;
            }
        }
        return i12;
    }

    public static void b(lb.a aVar, pb.b bVar, pb.e eVar, int i9, b bVar2) {
        char c10;
        char c11;
        byte[][] bArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        byte[][] bArr2 = bVar2.f47110a;
        int i18 = bVar2.f47111b;
        int i19 = bVar2.f47112c;
        for (byte[] bArr3 : bArr2) {
            Arrays.fill(bArr3, (byte) -1);
        }
        int length = f47115a[0].length;
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
        if (bVar2.a(8, i22) != 0) {
            bVar2.b(8, i22, 1);
            int i24 = eVar.f45528a;
            if (i24 < 2) {
                c11 = 1;
                c10 = 0;
            } else {
                c10 = 0;
                int[] iArr = f47117c[i24 - 1];
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
                                bArr = bArr2;
                                i10 = i18;
                                int i31 = 0;
                                while (true) {
                                    if (i31 >= 5) {
                                        break;
                                    }
                                    int[] iArr2 = f47116b[i31];
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
                            } else {
                                bArr = bArr2;
                                i10 = i18;
                            }
                            i27++;
                            bArr2 = bArr;
                            i18 = i10;
                            length3 = length3;
                        }
                    }
                    i25++;
                    bArr2 = bArr2;
                    i18 = i18;
                }
            }
            byte[][] bArr4 = bArr2;
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
            lb.a aVar2 = new lb.a();
            if (i9 >= 0 && i9 < 8) {
                int i40 = (bVar.f45512a << 3) | i9;
                aVar2.b(i40, 5);
                aVar2.b(c(i40, 1335), 10);
                lb.a aVar3 = new lb.a();
                aVar3.b(21522, 15);
                if (aVar2.f16734b == aVar3.f16734b) {
                    int i41 = 0;
                    while (true) {
                        int[] iArr3 = aVar2.f16733a;
                        if (i41 >= iArr3.length) {
                            break;
                        }
                        iArr3[i41] = iArr3[i41] ^ aVar3.f16733a[i41];
                        i41++;
                    }
                    if (aVar2.f16734b == 15) {
                        int i42 = 0;
                        while (true) {
                            int i43 = aVar2.f16734b;
                            if (i42 >= i43) {
                                break;
                            }
                            boolean d9 = aVar2.d((i43 - 1) - i42);
                            int[] iArr4 = d[i42];
                            int i44 = iArr4[c10];
                            byte[] bArr5 = bArr4[iArr4[c11]];
                            byte b10 = d9 ? (byte) 1 : (byte) 0;
                            bArr5[i44] = b10;
                            if (i42 < 8) {
                                i17 = (i36 - i42) - 1;
                                i16 = 8;
                            } else {
                                i16 = (i42 - 8) + i23;
                                i17 = 8;
                            }
                            bArr4[i16][i17] = b10;
                            i42++;
                        }
                        if (i24 >= 7) {
                            lb.a aVar4 = new lb.a();
                            aVar4.b(i24, 6);
                            aVar4.b(c(i24, 7973), 12);
                            if (aVar4.f16734b == 18) {
                                int i45 = 17;
                                for (int i46 = 0; i46 < 6; i46++) {
                                    for (int i47 = 0; i47 < 3; i47++) {
                                        boolean d10 = aVar4.d(i45);
                                        i45--;
                                        int i48 = (i19 - 11) + i47;
                                        byte[] bArr6 = bArr4[i48];
                                        byte b11 = d10 ? (byte) 1 : (byte) 0;
                                        bArr6[i46] = b11;
                                        bArr4[i46][i48] = b11;
                                    }
                                }
                            } else {
                                throw new Exception("should not happen but we got: " + aVar4.f16734b);
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
                                        if (i51 < aVar.f16734b) {
                                            boolean d11 = aVar.d(i51);
                                            i51++;
                                            i11 = d11;
                                        } else {
                                            i11 = 0;
                                        }
                                        if (i9 != -1) {
                                            switch (i9) {
                                                case 0:
                                                    i12 = i50 + i54;
                                                    i13 = i12 & 1;
                                                    break;
                                                case 1:
                                                    i13 = i50 & 1;
                                                    break;
                                                case 2:
                                                    i13 = i54 % 3;
                                                    break;
                                                case 3:
                                                    i13 = (i50 + i54) % 3;
                                                    break;
                                                case 4:
                                                    i13 = ((i54 / 3) + (i50 / 2)) & 1;
                                                    break;
                                                case 5:
                                                    int i55 = i50 * i54;
                                                    i13 = (i55 % 3) + (i55 & 1);
                                                    break;
                                                case 6:
                                                    int i56 = i50 * i54;
                                                    i14 = i56 & 1;
                                                    i15 = i56 % 3;
                                                    i12 = i15 + i14;
                                                    i13 = i12 & 1;
                                                    break;
                                                case 7:
                                                    i15 = (i50 * i54) % 3;
                                                    i14 = (i50 + i54) & 1;
                                                    i12 = i15 + i14;
                                                    i13 = i12 & 1;
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(r0.l(i9, "Invalid mask pattern: "));
                                            }
                                            if (i13 == 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                i11 = ~i11 ? 1 : 0;
                                            }
                                        }
                                        bArr4[i50][i54] = (byte) i11;
                                    }
                                }
                                i50 += i52;
                            }
                            i52 = -i52;
                            i50 += i52;
                            i49 -= 2;
                        }
                        if (i51 == aVar.f16734b) {
                            return;
                        }
                        throw new Exception("Not all bits consumed: " + i51 + '/' + aVar.f16734b);
                    }
                    throw new Exception("should not happen but we got: " + aVar2.f16734b);
                }
                throw new IllegalArgumentException("Sizes don't match");
            }
            throw new Exception("Invalid mask pattern");
        }
        throw new Exception();
    }

    public static int c(int i9, int i10) {
        if (i10 != 0) {
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
            int i11 = 32 - numberOfLeadingZeros;
            int i12 = i9 << (31 - numberOfLeadingZeros);
            while (32 - Integer.numberOfLeadingZeros(i12) >= i11) {
                i12 ^= i10 << ((32 - Integer.numberOfLeadingZeros(i12)) - i11);
            }
            return i12;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void d(int i9, int i10, b bVar) {
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = i9 + i11;
            if (g(bVar.a(i12, i10))) {
                bVar.b(i12, i10, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static void e(int i9, int i10, b bVar) {
        for (int i11 = 0; i11 < 7; i11++) {
            int[] iArr = f47115a[i11];
            for (int i12 = 0; i12 < 7; i12++) {
                bVar.b(i9 + i12, i10 + i11, iArr[i12]);
            }
        }
    }

    public static void f(int i9, int i10, b bVar) {
        for (int i11 = 0; i11 < 7; i11++) {
            int i12 = i10 + i11;
            if (g(bVar.a(i9, i12))) {
                bVar.b(i9, i12, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static boolean g(int i9) {
        if (i9 == -1) {
            return true;
        }
        return false;
    }
}
