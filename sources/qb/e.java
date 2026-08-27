package qb;

import d5.p;
import n2.v;

public final class e {

    public static final int[] f46196e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    public static final e[] f46197f = a();

    public final int f46198a;

    public final int[] f46199b;

    public final v[] f46200c;
    public final int d;

    public e(int i10, int[] iArr, v... vVarArr) {
        this.f46198a = i10;
        this.f46199b = iArr;
        this.f46200c = vVarArr;
        v vVar = vVarArr[0];
        int i11 = vVar.f18186b;
        int i12 = 0;
        for (p pVar : (p[]) vVar.f18187c) {
            i12 += (pVar.f4822b + i11) * pVar.f4821a;
        }
        this.d = i12;
    }

    public static e[] a() {
        return new e[]{new e(1, new int[0], new v(7, new p[]{new p(1, 19)}), new v(10, new p[]{new p(1, 16)}), new v(13, new p[]{new p(1, 13)}), new v(17, new p[]{new p(1, 9)})), new e(2, new int[]{6, 18}, new v(10, new p[]{new p(1, 34)}), new v(16, new p[]{new p(1, 28)}), new v(22, new p[]{new p(1, 22)}), new v(28, new p[]{new p(1, 16)})), new e(3, new int[]{6, 22}, new v(15, new p[]{new p(1, 55)}), new v(26, new p[]{new p(1, 44)}), new v(18, new p[]{new p(2, 17)}), new v(22, new p[]{new p(2, 13)})), new e(4, new int[]{6, 26}, new v(20, new p[]{new p(1, 80)}), new v(18, new p[]{new p(2, 32)}), new v(26, new p[]{new p(2, 24)}), new v(16, new p[]{new p(4, 9)})), new e(5, new int[]{6, 30}, new v(26, new p[]{new p(1, 108)}), new v(24, new p[]{new p(2, 43)}), new v(18, new p[]{new p(2, 15), new p(2, 16)}), new v(22, new p[]{new p(2, 11), new p(2, 12)})), new e(6, new int[]{6, 34}, new v(18, new p[]{new p(2, 68)}), new v(16, new p[]{new p(4, 27)}), new v(24, new p[]{new p(4, 19)}), new v(28, new p[]{new p(4, 15)})), new e(7, new int[]{6, 22, 38}, new v(20, new p[]{new p(2, 78)}), new v(18, new p[]{new p(4, 31)}), new v(18, new p[]{new p(2, 14), new p(4, 15)}), new v(26, new p[]{new p(4, 13), new p(1, 14)})), new e(8, new int[]{6, 24, 42}, new v(24, new p[]{new p(2, 97)}), new v(22, new p[]{new p(2, 38), new p(2, 39)}), new v(22, new p[]{new p(4, 18), new p(2, 19)}), new v(26, new p[]{new p(4, 14), new p(2, 15)})), new e(9, new int[]{6, 26, 46}, new v(30, new p[]{new p(2, 116)}), new v(22, new p[]{new p(3, 36), new p(2, 37)}), new v(20, new p[]{new p(4, 16), new p(4, 17)}), new v(24, new p[]{new p(4, 12), new p(4, 13)})), new e(10, new int[]{6, 28, 50}, new v(18, new p[]{new p(2, 68), new p(2, 69)}), new v(26, new p[]{new p(4, 43), new p(1, 44)}), new v(24, new p[]{new p(6, 19), new p(2, 20)}), new v(28, new p[]{new p(6, 15), new p(2, 16)})), new e(11, new int[]{6, 30, 54}, new v(20, new p[]{new p(4, 81)}), new v(30, new p[]{new p(1, 50), new p(4, 51)}), new v(28, new p[]{new p(4, 22), new p(4, 23)}), new v(24, new p[]{new p(3, 12), new p(8, 13)})), new e(12, new int[]{6, 32, 58}, new v(24, new p[]{new p(2, 92), new p(2, 93)}), new v(22, new p[]{new p(6, 36), new p(2, 37)}), new v(26, new p[]{new p(4, 20), new p(6, 21)}), new v(28, new p[]{new p(7, 14), new p(4, 15)})), new e(13, new int[]{6, 34, 62}, new v(26, new p[]{new p(4, 107)}), new v(22, new p[]{new p(8, 37), new p(1, 38)}), new v(24, new p[]{new p(8, 20), new p(4, 21)}), new v(22, new p[]{new p(12, 11), new p(4, 12)})), new e(14, new int[]{6, 26, 46, 66}, new v(30, new p[]{new p(3, 115), new p(1, 116)}), new v(24, new p[]{new p(4, 40), new p(5, 41)}), new v(20, new p[]{new p(11, 16), new p(5, 17)}), new v(24, new p[]{new p(11, 12), new p(5, 13)})), new e(15, new int[]{6, 26, 48, 70}, new v(22, new p[]{new p(5, 87), new p(1, 88)}), new v(24, new p[]{new p(5, 41), new p(5, 42)}), new v(30, new p[]{new p(5, 24), new p(7, 25)}), new v(24, new p[]{new p(11, 12), new p(7, 13)})), new e(16, new int[]{6, 26, 50, 74}, new v(24, new p[]{new p(5, 98), new p(1, 99)}), new v(28, new p[]{new p(7, 45), new p(3, 46)}), new v(24, new p[]{new p(15, 19), new p(2, 20)}), new v(30, new p[]{new p(3, 15), new p(13, 16)})), new e(17, new int[]{6, 30, 54, 78}, new v(28, new p[]{new p(1, 107), new p(5, 108)}), new v(28, new p[]{new p(10, 46), new p(1, 47)}), new v(28, new p[]{new p(1, 22), new p(15, 23)}), new v(28, new p[]{new p(2, 14), new p(17, 15)})), new e(18, new int[]{6, 30, 56, 82}, new v(30, new p[]{new p(5, 120), new p(1, 121)}), new v(26, new p[]{new p(9, 43), new p(4, 44)}), new v(28, new p[]{new p(17, 22), new p(1, 23)}), new v(28, new p[]{new p(2, 14), new p(19, 15)})), new e(19, new int[]{6, 30, 58, 86}, new v(28, new p[]{new p(3, 113), new p(4, 114)}), new v(26, new p[]{new p(3, 44), new p(11, 45)}), new v(26, new p[]{new p(17, 21), new p(4, 22)}), new v(26, new p[]{new p(9, 13), new p(16, 14)})), new e(20, new int[]{6, 34, 62, 90}, new v(28, new p[]{new p(3, 107), new p(5, 108)}), new v(26, new p[]{new p(3, 41), new p(13, 42)}), new v(30, new p[]{new p(15, 24), new p(5, 25)}), new v(28, new p[]{new p(15, 15), new p(10, 16)})), new e(21, new int[]{6, 28, 50, 72, 94}, new v(28, new p[]{new p(4, 116), new p(4, 117)}), new v(26, new p[]{new p(17, 42)}), new v(28, new p[]{new p(17, 22), new p(6, 23)}), new v(30, new p[]{new p(19, 16), new p(6, 17)})), new e(22, new int[]{6, 26, 50, 74, 98}, new v(28, new p[]{new p(2, 111), new p(7, 112)}), new v(28, new p[]{new p(17, 46)}), new v(30, new p[]{new p(7, 24), new p(16, 25)}), new v(24, new p[]{new p(34, 13)})), new e(23, new int[]{6, 30, 54, 78, 102}, new v(30, new p[]{new p(4, 121), new p(5, 122)}), new v(28, new p[]{new p(4, 47), new p(14, 48)}), new v(30, new p[]{new p(11, 24), new p(14, 25)}), new v(30, new p[]{new p(16, 15), new p(14, 16)})), new e(24, new int[]{6, 28, 54, 80, 106}, new v(30, new p[]{new p(6, 117), new p(4, 118)}), new v(28, new p[]{new p(6, 45), new p(14, 46)}), new v(30, new p[]{new p(11, 24), new p(16, 25)}), new v(30, new p[]{new p(30, 16), new p(2, 17)})), new e(25, new int[]{6, 32, 58, 84, 110}, new v(26, new p[]{new p(8, 106), new p(4, 107)}), new v(28, new p[]{new p(8, 47), new p(13, 48)}), new v(30, new p[]{new p(7, 24), new p(22, 25)}), new v(30, new p[]{new p(22, 15), new p(13, 16)})), new e(26, new int[]{6, 30, 58, 86, 114}, new v(28, new p[]{new p(10, 114), new p(2, 115)}), new v(28, new p[]{new p(19, 46), new p(4, 47)}), new v(28, new p[]{new p(28, 22), new p(6, 23)}), new v(30, new p[]{new p(33, 16), new p(4, 17)})), new e(27, new int[]{6, 34, 62, 90, 118}, new v(30, new p[]{new p(8, 122), new p(4, 123)}), new v(28, new p[]{new p(22, 45), new p(3, 46)}), new v(30, new p[]{new p(8, 23), new p(26, 24)}), new v(30, new p[]{new p(12, 15), new p(28, 16)})), new e(28, new int[]{6, 26, 50, 74, 98, 122}, new v(30, new p[]{new p(3, 117), new p(10, 118)}), new v(28, new p[]{new p(3, 45), new p(23, 46)}), new v(30, new p[]{new p(4, 24), new p(31, 25)}), new v(30, new p[]{new p(11, 15), new p(31, 16)})), new e(29, new int[]{6, 30, 54, 78, 102, 126}, new v(30, new p[]{new p(7, 116), new p(7, 117)}), new v(28, new p[]{new p(21, 45), new p(7, 46)}), new v(30, new p[]{new p(1, 23), new p(37, 24)}), new v(30, new p[]{new p(19, 15), new p(26, 16)})), new e(30, new int[]{6, 26, 52, 78, 104, 130}, new v(30, new p[]{new p(5, 115), new p(10, 116)}), new v(28, new p[]{new p(19, 47), new p(10, 48)}), new v(30, new p[]{new p(15, 24), new p(25, 25)}), new v(30, new p[]{new p(23, 15), new p(25, 16)})), new e(31, new int[]{6, 30, 56, 82, 108, 134}, new v(30, new p[]{new p(13, 115), new p(3, 116)}), new v(28, new p[]{new p(2, 46), new p(29, 47)}), new v(30, new p[]{new p(42, 24), new p(1, 25)}), new v(30, new p[]{new p(23, 15), new p(28, 16)})), new e(32, new int[]{6, 34, 60, 86, 112, 138}, new v(30, new p[]{new p(17, 115)}), new v(28, new p[]{new p(10, 46), new p(23, 47)}), new v(30, new p[]{new p(10, 24), new p(35, 25)}), new v(30, new p[]{new p(19, 15), new p(35, 16)})), new e(33, new int[]{6, 30, 58, 86, 114, 142}, new v(30, new p[]{new p(17, 115), new p(1, 116)}), new v(28, new p[]{new p(14, 46), new p(21, 47)}), new v(30, new p[]{new p(29, 24), new p(19, 25)}), new v(30, new p[]{new p(11, 15), new p(46, 16)})), new e(34, new int[]{6, 34, 62, 90, 118, 146}, new v(30, new p[]{new p(13, 115), new p(6, 116)}), new v(28, new p[]{new p(14, 46), new p(23, 47)}), new v(30, new p[]{new p(44, 24), new p(7, 25)}), new v(30, new p[]{new p(59, 16), new p(1, 17)})), new e(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new v(30, new p[]{new p(12, 121), new p(7, 122)}), new v(28, new p[]{new p(12, 47), new p(26, 48)}), new v(30, new p[]{new p(39, 24), new p(14, 25)}), new v(30, new p[]{new p(22, 15), new p(41, 16)})), new e(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new v(30, new p[]{new p(6, 121), new p(14, 122)}), new v(28, new p[]{new p(6, 47), new p(34, 48)}), new v(30, new p[]{new p(46, 24), new p(10, 25)}), new v(30, new p[]{new p(2, 15), new p(64, 16)})), new e(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new v(30, new p[]{new p(17, 122), new p(4, 123)}), new v(28, new p[]{new p(29, 46), new p(14, 47)}), new v(30, new p[]{new p(49, 24), new p(10, 25)}), new v(30, new p[]{new p(24, 15), new p(46, 16)})), new e(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new v(30, new p[]{new p(4, 122), new p(18, 123)}), new v(28, new p[]{new p(13, 46), new p(32, 47)}), new v(30, new p[]{new p(48, 24), new p(14, 25)}), new v(30, new p[]{new p(42, 15), new p(32, 16)})), new e(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new v(30, new p[]{new p(20, 117), new p(4, 118)}), new v(28, new p[]{new p(40, 47), new p(7, 48)}), new v(30, new p[]{new p(43, 24), new p(22, 25)}), new v(30, new p[]{new p(10, 15), new p(67, 16)})), new e(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new v(30, new p[]{new p(19, 118), new p(6, 119)}), new v(28, new p[]{new p(18, 47), new p(31, 48)}), new v(30, new p[]{new p(34, 24), new p(34, 25)}), new v(30, new p[]{new p(20, 15), new p(61, 16)}))};
    }

    public static e b(int i10) {
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        for (int i13 = 0; i13 < 34; i13++) {
            int i14 = f46196e[i13];
            if (i14 == i10) {
                return c(i13 + 7);
            }
            int iBitCount = Integer.bitCount(i14 ^ i10);
            if (iBitCount < i11) {
                i12 = i13 + 7;
                i11 = iBitCount;
            }
        }
        if (i11 <= 3) {
            return c(i12);
        }
        return null;
    }

    public static e c(int i10) {
        if (i10 < 1 || i10 > 40) {
            throw new IllegalArgumentException();
        }
        return f46197f[i10 - 1];
    }

    public final String toString() {
        return String.valueOf(this.f46198a);
    }
}
