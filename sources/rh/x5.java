package rh;

import j$.util.Comparator$CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.tl.TL_iv;

public final class x5 {

    public final TL_iv.pageBlockTable f47588a;

    public int f47589b;

    public int f47590c;
    public TL_iv.pageTableCell[][] d;

    public int[][] f47591e;

    public int[][] f47592f;

    public final ArrayList f47593g = new ArrayList();

    public x5(TL_iv.pageBlockTable pageblocktable) {
        this.f47588a = pageblocktable;
        i();
    }

    public static void c(TL_iv.pageTableCell pagetablecell, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        pagetablecell.text = textplain;
        int i10 = pagetablecell.flags;
        int i11 = i10 | 128;
        pagetablecell.flags = i11;
        pagetablecell.flags = pagetablecell.colspan > 1 ? i10 | 130 : i11 & (-3);
        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
    }

    public static void d(TL_iv.pageTableCell pagetablecell, CharSequence charSequence) {
        pagetablecell.text = v5.f(charSequence);
        int i10 = pagetablecell.flags;
        int i11 = i10 | 128;
        pagetablecell.flags = i11;
        pagetablecell.flags = pagetablecell.colspan > 1 ? i10 | 130 : i11 & (-3);
        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
    }

    public static int[][] e(int[][] iArr, int i10) {
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr.length, i10);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int[] iArr3 = iArr[i11];
            int length = iArr3.length;
            System.arraycopy(iArr3, 0, iArr2[i11], 0, length);
            while (length < i10) {
                iArr2[i11][length] = -1;
                length++;
            }
        }
        return iArr2;
    }

    public static TL_iv.pageTableCell f() {
        TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
        c(pagetablecell, "");
        return pagetablecell;
    }

    public static String g(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        return (pagetablecell == null || (richText = pagetablecell.text) == null) ? "" : v5.l(richText);
    }

    public static CharSequence h(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        return (pagetablecell == null || (richText = pagetablecell.text) == null) ? "" : v5.r(richText, null, true);
    }

    public static void k(TL_iv.pageTableCell pagetablecell, int i10) {
        if (pagetablecell == null) {
            return;
        }
        boolean z10 = i10 == 1;
        pagetablecell.align_center = z10;
        boolean z11 = i10 == 2;
        pagetablecell.align_right = z11;
        int i11 = pagetablecell.flags;
        pagetablecell.flags = z10 ? i11 | 8 : i11 & (-9);
        int i12 = pagetablecell.flags;
        pagetablecell.flags = z11 ? i12 | 16 : i12 & (-17);
    }

    public static void l(TL_iv.pageTableCell pagetablecell, boolean z10) {
        if (pagetablecell == null) {
            return;
        }
        pagetablecell.header = z10;
        pagetablecell.flags = z10 ? pagetablecell.flags | 1 : pagetablecell.flags & (-2);
    }

    public static void m(TL_iv.pageTableCell pagetablecell, int i10) {
        if (pagetablecell == null) {
            return;
        }
        boolean z10 = i10 == 1;
        pagetablecell.valign_middle = z10;
        boolean z11 = i10 == 2;
        pagetablecell.valign_bottom = z11;
        int i11 = pagetablecell.flags;
        pagetablecell.flags = z10 ? i11 | 32 : i11 & (-33);
        int i12 = pagetablecell.flags;
        pagetablecell.flags = z11 ? i12 | 64 : i12 & (-65);
    }

    public static int n(TL_iv.pageTableCell pagetablecell) {
        int i10 = pagetablecell.colspan;
        if (i10 != 0) {
            return i10;
        }
        return 1;
    }

    public static int o(TL_iv.pageTableCell pagetablecell) {
        int i10 = pagetablecell.rowspan;
        if (i10 != 0) {
            return i10;
        }
        return 1;
    }

    public final int a(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < this.f47589b; i10++) {
            for (int i11 = 0; i11 < this.f47590c; i11++) {
                if (this.d[i10][i11] == pagetablecell) {
                    return this.f47592f[i10][i11];
                }
            }
        }
        return -1;
    }

    public final int b(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < this.f47589b; i10++) {
            for (int i11 = 0; i11 < this.f47590c; i11++) {
                if (this.d[i10][i11] == pagetablecell) {
                    return this.f47591e[i10][i11];
                }
            }
        }
        return -1;
    }

    public final void i() {
        int i10;
        int i11;
        int i12;
        TL_iv.pageBlockTable pageblocktable = this.f47588a;
        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
        this.f47589b = arrayList == null ? 0 : arrayList.size();
        int i13 = 0;
        int iMax = 0;
        while (true) {
            i10 = this.f47589b;
            if (i13 >= i10) {
                break;
            }
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i13);
            int iN = 0;
            for (int i14 = 0; i14 < pagetablerow.cells.size(); i14++) {
                iN += n(pagetablerow.cells.get(i14));
            }
            if (iN > iMax) {
                iMax = iN;
            }
            i13++;
        }
        TL_iv.pageTableCell[][] pagetablecellArr = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, Math.max(i10, 1), Math.max(iMax, 1));
        int[] iArr = {Math.max(this.f47589b, 1), Math.max(iMax, 1)};
        Class cls = Integer.TYPE;
        int[][] iArrE = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        int[][] iArrE2 = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.f47589b, 1), Math.max(iMax, 1));
        for (int i15 = 0; i15 < iArrE.length; i15++) {
            for (int i16 = 0; i16 < iArrE[0].length; i16++) {
                iArrE[i15][i16] = -1;
                iArrE2[i15][i16] = -1;
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i11 = this.f47589b;
            if (i17 >= i11) {
                break;
            }
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i17);
            int i19 = 0;
            int i20 = 0;
            while (i19 < pagetablerow2.cells.size()) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i19);
                int iN2 = n(pagetablecell);
                int i21 = pagetablecell.rowspan;
                if (i21 == 0) {
                    i21 = 1;
                }
                while (i20 < iMax && pagetablecellArr[i17][i20] != null) {
                    i20++;
                }
                int i22 = i20 + iN2;
                if (i22 > iMax) {
                    iMax = Math.max(i22, iMax * 2);
                    TL_iv.pageTableCell[][] pagetablecellArr2 = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, pagetablecellArr.length, iMax);
                    int i23 = 0;
                    while (i23 < pagetablecellArr.length) {
                        TL_iv.pageTableCell[] pagetablecellArr3 = pagetablecellArr[i23];
                        int i24 = i23;
                        System.arraycopy(pagetablecellArr3, 0, pagetablecellArr2[i24], 0, pagetablecellArr3.length);
                        i23 = i24 + 1;
                        pagetablecellArr = pagetablecellArr;
                        i17 = i17;
                    }
                    i12 = i17;
                    iArrE = e(iArrE, iMax);
                    iArrE2 = e(iArrE2, iMax);
                    pagetablecellArr = pagetablecellArr2;
                } else {
                    i12 = i17;
                }
                for (int i25 = i12; i25 < i12 + i21 && i25 < this.f47589b; i25++) {
                    for (int i26 = i20; i26 < i22; i26++) {
                        pagetablecellArr[i25][i26] = pagetablecell;
                        iArrE[i25][i26] = i12;
                        iArrE2[i25][i26] = i20;
                    }
                }
                if (i22 > i18) {
                    i18 = i22;
                }
                i19++;
                i20 = i22;
                i17 = i12;
            }
            i17++;
        }
        this.f47590c = i18;
        this.d = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, Math.max(i11, 1), Math.max(this.f47590c, 1));
        this.f47591e = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.f47589b, 1), Math.max(this.f47590c, 1));
        this.f47592f = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.f47589b, 1), Math.max(this.f47590c, 1));
        for (int i27 = 0; i27 < this.f47589b; i27++) {
            for (int i28 = 0; i28 < this.f47590c; i28++) {
                TL_iv.pageTableCell[][] pagetablecellArr4 = this.d;
                pagetablecellArr4[i27][i28] = pagetablecellArr[i27][i28];
                this.f47591e[i27][i28] = iArrE[i27][i28];
                this.f47592f[i27][i28] = iArrE2[i27][i28];
                if (pagetablecellArr4[i27][i28] == null) {
                    TL_iv.pageTableCell pagetablecellF = f();
                    this.d[i27][i28] = pagetablecellF;
                    this.f47591e[i27][i28] = i27;
                    this.f47592f[i27][i28] = i28;
                    pageblocktable.rows.get(i27).cells.add(pagetablecellF);
                }
            }
        }
        ArrayList arrayList2 = this.f47593g;
        arrayList2.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i29 = 0; i29 < this.f47589b; i29++) {
            int i30 = 0;
            while (true) {
                int i31 = this.f47590c;
                if (i30 < i31) {
                    if (i29 >= 0 && i30 >= 0 && i29 < this.f47589b && i30 < i31 && this.f47591e[i29][i30] == i29 && this.f47592f[i29][i30] == i30 && linkedHashSet.add(this.d[i29][i30])) {
                        arrayList2.add(this.d[i29][i30]);
                    }
                    i30++;
                }
            }
        }
    }

    public final void j(final IdentityHashMap identityHashMap, int i10) {
        TL_iv.pageBlockTable pageblocktable = this.f47588a;
        pageblocktable.rows.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : identityHashMap.entrySet()) {
                if (((int[]) entry.getValue())[0] == i11) {
                    arrayList.add((TL_iv.pageTableCell) entry.getKey());
                }
            }
            Collections.sort(arrayList, Comparator$CC.comparingInt(new ToIntFunction() {
                @Override
                public final int applyAsInt(Object obj) {
                    return ((int[]) identityHashMap.get((TL_iv.pageTableCell) obj))[1];
                }
            }));
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                int[] iArr = (int[]) identityHashMap.get(pagetablecell);
                int i13 = iArr[2];
                if (i13 <= 1) {
                    i13 = 0;
                }
                pagetablecell.rowspan = i13;
                int i14 = iArr[3];
                if (i14 <= 1) {
                    i14 = 0;
                }
                pagetablecell.colspan = i14;
                pagetablecell.flags = i13 != 0 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                pagetablecell.flags = i14 != 0 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                pagetablerow.cells.add(pagetablecell);
            }
            pageblocktable.rows.add(pagetablerow);
        }
    }

    public final boolean p(TL_iv.pageTableCell pagetablecell) {
        int iB = b(pagetablecell);
        int iA = a(pagetablecell);
        if (iB >= 0 && iA >= 0) {
            int i10 = pagetablecell.rowspan;
            if (i10 == 0) {
                i10 = 1;
            }
            int i11 = pagetablecell.colspan;
            if (i11 == 0) {
                i11 = 1;
            }
            if (i10 > 1 || i11 > 1) {
                pagetablecell.rowspan = 0;
                pagetablecell.colspan = 0;
                pagetablecell.flags &= -7;
                for (int i12 = iB; i12 < iB + i10 && i12 < this.f47589b; i12++) {
                    TL_iv.pageTableRow pagetablerow = this.f47588a.rows.get(i12);
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_iv.pageTableCell pagetablecell2 = arrayList2.get(i13);
                        i13++;
                        TL_iv.pageTableCell pagetablecell3 = pagetablecell2;
                        arrayList.add(new Object[]{pagetablecell3, Integer.valueOf(a(pagetablecell3))});
                    }
                    for (int i14 = iA; i14 < iA + i11; i14++) {
                        if (i12 != iB || i14 != iA) {
                            TL_iv.pageTableCell pagetablecell4 = new TL_iv.pageTableCell();
                            pagetablecell4.header = pagetablecell.header;
                            pagetablecell4.align_center = pagetablecell.align_center;
                            pagetablecell4.align_right = pagetablecell.align_right;
                            pagetablecell4.valign_middle = pagetablecell.valign_middle;
                            pagetablecell4.valign_bottom = pagetablecell.valign_bottom;
                            c(pagetablecell4, "");
                            arrayList.add(new Object[]{pagetablecell4, Integer.valueOf(i14)});
                        }
                    }
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new gf.d(19)));
                    pagetablerow.cells.clear();
                    int size2 = arrayList.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj)[0]);
                    }
                }
                i();
                return true;
            }
        }
        return false;
    }
}
