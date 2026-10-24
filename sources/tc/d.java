package tc;

import c5.c0;
import e2.j0;
public abstract class d {
    public static final int[] f47377a = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public static final byte[] f47378b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String a(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (bArr == 0) {
            return null;
        }
        int length = (((((bArr.length * 8) + 5) / 6) + 3) / 4) * 4;
        StringBuilder sb2 = new StringBuilder(length);
        int i15 = 0;
        while (true) {
            int i16 = i15 / 8;
            if (bArr.length <= i16) {
                i12 = -1;
            } else {
                if (bArr.length - 1 == i16) {
                    i10 = 0;
                } else {
                    i10 = bArr[i16 + 1];
                }
                int i17 = (i15 % 24) / 6;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                i12 = 0;
                            } else {
                                i11 = bArr[i16];
                            }
                        } else {
                            i13 = (bArr[i16] << 2) & 60;
                            i14 = (i10 >> 6) & 3;
                        }
                    } else {
                        i13 = (bArr[i16] << 4) & 48;
                        i14 = (i10 >> 4) & 15;
                    }
                    i12 = i13 | i14;
                } else {
                    i11 = bArr[i16] >> 2;
                }
                i12 = i11 & 63;
            }
            if (i12 < 0) {
                break;
            }
            sb2.append((char) f47378b[i12]);
            i15 += 6;
        }
        for (int length2 = sb2.length(); length2 < length; length2++) {
            sb2.append('=');
        }
        return sb2.toString();
    }

    public static boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != ' ' && charAt != '\"' && charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}' && charAt != '(' && charAt != ')') {
                switch (charAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        break;
                    default:
                        switch (charAt) {
                            case '[':
                            case '\\':
                            case ']':
                                break;
                            default:
                        }
                }
            }
            return false;
        }
        return true;
    }

    public static void c(c0 c0Var, int[] iArr, int[] iArr2, j0 j0Var) {
        int i10;
        int s10;
        int s11;
        int i11 = 0;
        while (i11 < iArr2.length) {
            int i12 = j0Var.i(c0Var, iArr);
            if (i12 >= 0 && i12 <= 15) {
                iArr2[i11] = i12;
            } else {
                switch (i12) {
                    case 16:
                        i10 = iArr2[i11 - 1];
                        s10 = c0Var.s(2, iArr) + 3;
                        break;
                    case 17:
                        s11 = c0Var.s(3, iArr) + 3;
                        s10 = s11;
                        i10 = 0;
                        break;
                    case 18:
                        s11 = c0Var.s(7, iArr) + 11;
                        s10 = s11;
                        i10 = 0;
                        break;
                    default:
                        throw new Exception(String.format("[%s] Bad code length '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(i12), iArr));
                }
                for (int i13 = 0; i13 < s10; i13++) {
                    iArr2[i11 + i13] = i10;
                }
                i11 += s10 - 1;
            }
            i11++;
        }
    }

    public static int d(c0 c0Var, int[] iArr, j0 j0Var) {
        int i10;
        int i11 = j0Var.i(c0Var, iArr);
        int i12 = 2;
        int i13 = 5;
        switch (i11) {
            case 0:
            case 1:
            case 2:
            case 3:
                return i11 + 1;
            case 4:
                i12 = 1;
                break;
            case 5:
                i12 = 1;
                i13 = 7;
                break;
            case 6:
                i13 = 9;
                break;
            case 7:
                i13 = 13;
                break;
            case 8:
                i13 = 17;
                i12 = 3;
                break;
            case 9:
                i13 = 25;
                i12 = 3;
                break;
            case 10:
                i13 = 33;
                i12 = 4;
                break;
            case 11:
                i13 = 49;
                i12 = 4;
                break;
            case 12:
                i10 = 65;
                i12 = 5;
                i13 = i10;
                break;
            case 13:
                i10 = 97;
                i12 = 5;
                i13 = i10;
                break;
            case 14:
                i13 = 129;
                i12 = 6;
                break;
            case 15:
                i13 = 193;
                i12 = 6;
                break;
            case 16:
                i13 = 257;
                i12 = 7;
                break;
            case 17:
                i13 = 385;
                i12 = 7;
                break;
            case 18:
                i13 = 513;
                i12 = 8;
                break;
            case 19:
                i13 = 769;
                i12 = 8;
                break;
            case 20:
                i13 = 1025;
                i12 = 9;
                break;
            case 21:
                i13 = 1537;
                i12 = 9;
                break;
            case 22:
                i13 = 2049;
                i12 = 10;
                break;
            case 23:
                i13 = 3073;
                i12 = 10;
                break;
            case 24:
                i13 = 4097;
                i12 = 11;
                break;
            case 25:
                i13 = 6145;
                i12 = 11;
                break;
            case 26:
                i13 = 8193;
                i12 = 12;
                break;
            case 27:
                i13 = 12289;
                i12 = 12;
                break;
            case 28:
                i13 = 16385;
                i12 = 13;
                break;
            case 29:
                i13 = 24577;
                i12 = 13;
                break;
            default:
                throw new Exception(String.format("[%s] Bad distance code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(i11), Integer.valueOf(iArr[0])));
        }
        return c0Var.s(i12, iArr) + i13;
    }

    public static void e(c0 c0Var, int[] iArr, j0[] j0VarArr) {
        int s10 = c0Var.s(5, iArr) + 257;
        int s11 = c0Var.s(5, iArr) + 1;
        int s12 = c0Var.s(4, iArr) + 4;
        int[] iArr2 = new int[19];
        for (int i10 = 0; i10 < s12; i10++) {
            iArr2[f47377a[i10]] = (byte) c0Var.s(3, iArr);
        }
        j0 j0Var = new j0(iArr2);
        int[] iArr3 = new int[s10];
        c(c0Var, iArr, iArr3, j0Var);
        j0 j0Var2 = new j0(iArr3);
        int[] iArr4 = new int[s11];
        c(c0Var, iArr, iArr4, j0Var);
        j0 j0Var3 = new j0(iArr4);
        j0VarArr[0] = j0Var2;
        j0VarArr[1] = j0Var3;
    }

    public static int f(c0 c0Var, int[] iArr, int i10) {
        int i11;
        int i12 = 1;
        switch (i10) {
            case 257:
            case 258:
            case 259:
            case 260:
            case 261:
            case 262:
            case 263:
            case 264:
                return i10 - 254;
            case 265:
                i11 = 11;
                break;
            case 266:
                i11 = 13;
                break;
            case 267:
                i11 = 15;
                break;
            case 268:
                i11 = 17;
                break;
            case 269:
                i11 = 19;
                i12 = 2;
                break;
            case 270:
                i11 = 23;
                i12 = 2;
                break;
            case 271:
                i11 = 27;
                i12 = 2;
                break;
            case 272:
                i11 = 31;
                i12 = 2;
                break;
            case 273:
                i11 = 35;
                i12 = 3;
                break;
            case 274:
                i11 = 43;
                i12 = 3;
                break;
            case 275:
                i11 = 51;
                i12 = 3;
                break;
            case 276:
                i11 = 59;
                i12 = 3;
                break;
            case 277:
                i11 = 67;
                i12 = 4;
                break;
            case 278:
                i11 = 83;
                i12 = 4;
                break;
            case 279:
                i11 = 99;
                i12 = 4;
                break;
            case 280:
                i11 = 115;
                i12 = 4;
                break;
            case 281:
                i11 = 131;
                i12 = 5;
                break;
            case 282:
                i11 = 163;
                i12 = 5;
                break;
            case 283:
                i11 = 195;
                i12 = 5;
                break;
            case 284:
                i11 = 227;
                i12 = 5;
                break;
            case 285:
                return 258;
            default:
                throw new Exception(String.format("[%s] Bad literal/length code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(i10), Integer.valueOf(iArr[0])));
        }
        return c0Var.s(i12, iArr) + i11;
    }
}
