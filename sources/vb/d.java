package vb;

import java.util.Arrays;
import kf.k0;
public abstract class d {
    public static final int[][] f45717a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] f45718b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] f45719c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(b bVar, boolean z4) {
        int i10;
        byte b10;
        int i11 = bVar.f45713b;
        int i12 = bVar.f45714c;
        if (z4) {
            i10 = i12;
        } else {
            i10 = i11;
        }
        if (!z4) {
            i11 = i12;
        }
        byte[][] bArr = bVar.f45712a;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            byte b11 = -1;
            int i15 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                if (z4) {
                    b10 = bArr[i14][i16];
                } else {
                    b10 = bArr[i16][i14];
                }
                if (b10 == b11) {
                    i15++;
                } else {
                    if (i15 >= 5) {
                        i13 += i15 - 2;
                    }
                    b11 = b10;
                    i15 = 1;
                }
            }
            if (i15 >= 5) {
                i13 = (i15 - 2) + i13;
            }
        }
        return i13;
    }

    public static void b(pb.a aVar, tb.b bVar, tb.e eVar, int i10, b bVar2) {
        char c3;
        char c10;
        byte[][] bArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z4;
        int i17;
        int i18;
        byte[][] bArr2 = bVar2.f45712a;
        int i19 = bVar2.f45713b;
        int i20 = bVar2.f45714c;
        for (byte[] bArr3 : bArr2) {
            Arrays.fill(bArr3, (byte) -1);
        }
        int length = f45717a[0].length;
        e(0, 0, bVar2);
        int i21 = i19 - length;
        e(i21, 0, bVar2);
        e(0, i21, bVar2);
        d(0, 7, bVar2);
        int i22 = i19 - 8;
        d(i22, 7, bVar2);
        d(0, i22, bVar2);
        f(7, 0, bVar2);
        int i23 = i20 - 8;
        f(i23, 0, bVar2);
        int i24 = i20 - 7;
        f(7, i24, bVar2);
        if (bVar2.a(8, i23) != 0) {
            bVar2.b(8, i23, 1);
            int i25 = eVar.f44700a;
            if (i25 < 2) {
                c10 = 1;
                c3 = 0;
            } else {
                c3 = 0;
                int[] iArr = f45719c[i25 - 1];
                c10 = 1;
                int length2 = iArr.length;
                int i26 = 0;
                while (i26 < length2) {
                    int i27 = iArr[i26];
                    if (i27 >= 0) {
                        int length3 = iArr.length;
                        int i28 = 0;
                        while (i28 < length3) {
                            int i29 = iArr[i28];
                            if (i29 >= 0 && g(bVar2.a(i29, i27))) {
                                int i30 = i29 - 2;
                                int i31 = i27 - 2;
                                bArr = bArr2;
                                i11 = i19;
                                int i32 = 0;
                                while (true) {
                                    if (i32 >= 5) {
                                        break;
                                    }
                                    int[] iArr2 = f45718b[i32];
                                    int i33 = i32;
                                    int i34 = 0;
                                    for (int i35 = 5; i34 < i35; i35 = 5) {
                                        int i36 = i34;
                                        bVar2.b(i30 + i34, i31 + i33, iArr2[i36]);
                                        i34 = i36 + 1;
                                        length3 = length3;
                                    }
                                    i32 = i33 + 1;
                                }
                            } else {
                                bArr = bArr2;
                                i11 = i19;
                            }
                            i28++;
                            bArr2 = bArr;
                            i19 = i11;
                            length3 = length3;
                        }
                    }
                    i26++;
                    bArr2 = bArr2;
                    i19 = i19;
                }
            }
            byte[][] bArr4 = bArr2;
            int i37 = i19;
            int i38 = 8;
            while (i38 < i22) {
                int i39 = i38 + 1;
                int i40 = i39 % 2;
                if (g(bVar2.a(i38, 6))) {
                    bVar2.b(i38, 6, i40);
                }
                if (g(bVar2.a(6, i38))) {
                    bVar2.b(6, i38, i40);
                }
                i38 = i39;
            }
            pb.a aVar2 = new pb.a();
            if (i10 >= 0 && i10 < 8) {
                int i41 = (bVar.f44686a << 3) | i10;
                aVar2.b(i41, 5);
                aVar2.b(c(i41, 1335), 10);
                pb.a aVar3 = new pb.a();
                aVar3.b(21522, 15);
                if (aVar2.f41118b == aVar3.f41118b) {
                    int i42 = 0;
                    while (true) {
                        int[] iArr3 = aVar2.f41117a;
                        if (i42 >= iArr3.length) {
                            break;
                        }
                        iArr3[i42] = iArr3[i42] ^ aVar3.f41117a[i42];
                        i42++;
                    }
                    if (aVar2.f41118b == 15) {
                        int i43 = 0;
                        while (true) {
                            int i44 = aVar2.f41118b;
                            if (i43 >= i44) {
                                break;
                            }
                            boolean d10 = aVar2.d((i44 - 1) - i43);
                            int[] iArr4 = d[i43];
                            int i45 = iArr4[c3];
                            byte[] bArr5 = bArr4[iArr4[c10]];
                            byte b10 = d10 ? (byte) 1 : (byte) 0;
                            bArr5[i45] = b10;
                            if (i43 < 8) {
                                i18 = (i37 - i43) - 1;
                                i17 = 8;
                            } else {
                                i17 = (i43 - 8) + i24;
                                i18 = 8;
                            }
                            bArr4[i17][i18] = b10;
                            i43++;
                        }
                        if (i25 >= 7) {
                            pb.a aVar4 = new pb.a();
                            aVar4.b(i25, 6);
                            aVar4.b(c(i25, 7973), 12);
                            if (aVar4.f41118b == 18) {
                                int i46 = 17;
                                for (int i47 = 0; i47 < 6; i47++) {
                                    for (int i48 = 0; i48 < 3; i48++) {
                                        boolean d11 = aVar4.d(i46);
                                        i46--;
                                        int i49 = (i20 - 11) + i48;
                                        byte[] bArr6 = bArr4[i49];
                                        byte b11 = d11 ? (byte) 1 : (byte) 0;
                                        bArr6[i47] = b11;
                                        bArr4[i47][i49] = b11;
                                    }
                                }
                            } else {
                                throw new Exception("should not happen but we got: " + aVar4.f41118b);
                            }
                        }
                        int i50 = i37 - 1;
                        int i51 = i20 - 1;
                        int i52 = 0;
                        int i53 = -1;
                        while (i50 > 0) {
                            if (i50 == 6) {
                                i50--;
                            }
                            while (i51 >= 0 && i51 < i20) {
                                for (int i54 = 0; i54 < 2; i54++) {
                                    int i55 = i50 - i54;
                                    if (g(bVar2.a(i55, i51))) {
                                        if (i52 < aVar.f41118b) {
                                            boolean d12 = aVar.d(i52);
                                            i52++;
                                            i12 = d12;
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i10 != -1) {
                                            switch (i10) {
                                                case 0:
                                                    i13 = i51 + i55;
                                                    i14 = i13 & 1;
                                                    break;
                                                case 1:
                                                    i14 = i51 & 1;
                                                    break;
                                                case 2:
                                                    i14 = i55 % 3;
                                                    break;
                                                case 3:
                                                    i14 = (i51 + i55) % 3;
                                                    break;
                                                case 4:
                                                    i14 = ((i55 / 3) + (i51 / 2)) & 1;
                                                    break;
                                                case 5:
                                                    int i56 = i51 * i55;
                                                    i14 = (i56 % 3) + (i56 & 1);
                                                    break;
                                                case 6:
                                                    int i57 = i51 * i55;
                                                    i15 = i57 & 1;
                                                    i16 = i57 % 3;
                                                    i13 = i16 + i15;
                                                    i14 = i13 & 1;
                                                    break;
                                                case 7:
                                                    i16 = (i51 * i55) % 3;
                                                    i15 = (i51 + i55) & 1;
                                                    i13 = i16 + i15;
                                                    i14 = i13 & 1;
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(k0.j(i10, "Invalid mask pattern: "));
                                            }
                                            if (i14 == 0) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            if (z4) {
                                                i12 = ~i12 ? 1 : 0;
                                            }
                                        }
                                        bArr4[i51][i55] = (byte) i12;
                                    }
                                }
                                i51 += i53;
                            }
                            i53 = -i53;
                            i51 += i53;
                            i50 -= 2;
                        }
                        if (i52 == aVar.f41118b) {
                            return;
                        }
                        throw new Exception("Not all bits consumed: " + i52 + '/' + aVar.f41118b);
                    }
                    throw new Exception("should not happen but we got: " + aVar2.f41118b);
                }
                throw new IllegalArgumentException("Sizes don't match");
            }
            throw new Exception("Invalid mask pattern");
        }
        throw new Exception();
    }

    public static int c(int i10, int i11) {
        if (i11 != 0) {
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i11);
            int i12 = 32 - numberOfLeadingZeros;
            int i13 = i10 << (31 - numberOfLeadingZeros);
            while (32 - Integer.numberOfLeadingZeros(i13) >= i12) {
                i13 ^= i11 << ((32 - Integer.numberOfLeadingZeros(i13)) - i12);
            }
            return i13;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void d(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (g(bVar.a(i13, i11))) {
                bVar.b(i13, i11, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static void e(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f45717a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.b(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void f(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (g(bVar.a(i10, i13))) {
                bVar.b(i10, i13, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static boolean g(int i10) {
        if (i10 == -1) {
            return true;
        }
        return false;
    }
}
