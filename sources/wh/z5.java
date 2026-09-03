package wh;

import j$.util.Comparator$CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.tl.TL_iv;
public final class z5 {
    public final TL_iv.pageBlockTable f50259a;
    public int f50260b;
    public int f50261c;
    public TL_iv.pageTableCell[][] d;
    public int[][] f50262e;
    public int[][] f50263f;
    public final ArrayList f50264g = new ArrayList();

    public z5(TL_iv.pageBlockTable pageblocktable) {
        this.f50259a = pageblocktable;
        i();
    }

    public static void c(TL_iv.pageTableCell pagetablecell, String str) {
        int i10;
        int i11;
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        pagetablecell.text = textplain;
        int i12 = pagetablecell.flags;
        int i13 = i12 | 128;
        pagetablecell.flags = i13;
        if (pagetablecell.colspan > 1) {
            i10 = i12 | 130;
        } else {
            i10 = i13 & (-3);
        }
        pagetablecell.flags = i10;
        if (pagetablecell.rowspan > 1) {
            i11 = pagetablecell.flags | 4;
        } else {
            i11 = pagetablecell.flags & (-5);
        }
        pagetablecell.flags = i11;
    }

    public static void d(TL_iv.pageTableCell pagetablecell, CharSequence charSequence) {
        int i10;
        int i11;
        pagetablecell.text = x5.f(charSequence);
        int i12 = pagetablecell.flags;
        int i13 = i12 | 128;
        pagetablecell.flags = i13;
        if (pagetablecell.colspan > 1) {
            i10 = i12 | 130;
        } else {
            i10 = i13 & (-3);
        }
        pagetablecell.flags = i10;
        if (pagetablecell.rowspan > 1) {
            i11 = pagetablecell.flags | 4;
        } else {
            i11 = pagetablecell.flags & (-5);
        }
        pagetablecell.flags = i11;
    }

    public static int[][] e(int[][] iArr, int i10) {
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr.length, i10);
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
        if (pagetablecell != null && (richText = pagetablecell.text) != null) {
            return x5.l(richText);
        }
        return "";
    }

    public static CharSequence h(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        if (pagetablecell != null && (richText = pagetablecell.text) != null) {
            return x5.r(richText, null, true);
        }
        return "";
    }

    public static void k(TL_iv.pageTableCell pagetablecell, int i10) {
        boolean z4;
        int i11;
        int i12;
        if (pagetablecell == null) {
            return;
        }
        boolean z10 = false;
        if (i10 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        pagetablecell.align_center = z4;
        if (i10 == 2) {
            z10 = true;
        }
        pagetablecell.align_right = z10;
        int i13 = pagetablecell.flags;
        if (z4) {
            i11 = i13 | 8;
        } else {
            i11 = i13 & (-9);
        }
        pagetablecell.flags = i11;
        int i14 = pagetablecell.flags;
        if (z10) {
            i12 = i14 | 16;
        } else {
            i12 = i14 & (-17);
        }
        pagetablecell.flags = i12;
    }

    public static void l(TL_iv.pageTableCell pagetablecell, boolean z4) {
        int i10;
        if (pagetablecell == null) {
            return;
        }
        pagetablecell.header = z4;
        if (z4) {
            i10 = pagetablecell.flags | 1;
        } else {
            i10 = pagetablecell.flags & (-2);
        }
        pagetablecell.flags = i10;
    }

    public static void m(TL_iv.pageTableCell pagetablecell, int i10) {
        boolean z4;
        int i11;
        int i12;
        if (pagetablecell == null) {
            return;
        }
        boolean z10 = false;
        if (i10 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        pagetablecell.valign_middle = z4;
        if (i10 == 2) {
            z10 = true;
        }
        pagetablecell.valign_bottom = z10;
        int i13 = pagetablecell.flags;
        if (z4) {
            i11 = i13 | 32;
        } else {
            i11 = i13 & (-33);
        }
        pagetablecell.flags = i11;
        int i14 = pagetablecell.flags;
        if (z10) {
            i12 = i14 | 64;
        } else {
            i12 = i14 & (-65);
        }
        pagetablecell.flags = i12;
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
        for (int i10 = 0; i10 < this.f50260b; i10++) {
            for (int i11 = 0; i11 < this.f50261c; i11++) {
                if (this.d[i10][i11] == pagetablecell) {
                    return this.f50263f[i10][i11];
                }
            }
        }
        return -1;
    }

    public final int b(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < this.f50260b; i10++) {
            for (int i11 = 0; i11 < this.f50261c; i11++) {
                if (this.d[i10][i11] == pagetablecell) {
                    return this.f50262e[i10][i11];
                }
            }
        }
        return -1;
    }

    public final void i() {
        int size;
        int i10;
        int i11;
        TL_iv.pageTableCell pagetablecell;
        int i12;
        int i13;
        TL_iv.pageBlockTable pageblocktable = this.f50259a;
        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        this.f50260b = size;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = this.f50260b;
            if (i14 >= i10) {
                break;
            }
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i14);
            int i16 = 0;
            for (int i17 = 0; i17 < pagetablerow.cells.size(); i17++) {
                i16 += n(pagetablerow.cells.get(i17));
            }
            if (i16 > i15) {
                i15 = i16;
            }
            i14++;
        }
        TL_iv.pageTableCell[][] pagetablecellArr = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, Math.max(i10, 1), Math.max(i15, 1));
        int[] iArr = {Math.max(this.f50260b, 1), Math.max(i15, 1)};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance(cls, iArr);
        int[][] iArr3 = (int[][]) Array.newInstance(cls, Math.max(this.f50260b, 1), Math.max(i15, 1));
        for (int i18 = 0; i18 < iArr2.length; i18++) {
            for (int i19 = 0; i19 < iArr2[0].length; i19++) {
                iArr2[i18][i19] = -1;
                iArr3[i18][i19] = -1;
            }
        }
        int i20 = 0;
        int i21 = 0;
        while (true) {
            i11 = this.f50260b;
            if (i20 >= i11) {
                break;
            }
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i20);
            int i22 = 0;
            int i23 = 0;
            while (i22 < pagetablerow2.cells.size()) {
                TL_iv.pageTableCell pagetablecell2 = pagetablerow2.cells.get(i22);
                int n10 = n(pagetablecell2);
                int i24 = pagetablecell2.rowspan;
                if (i24 == 0) {
                    i24 = 1;
                }
                while (i23 < i15 && pagetablecellArr[i20][i23] != null) {
                    i23++;
                }
                int i25 = i23 + n10;
                if (i25 > i15) {
                    i15 = Math.max(i25, i15 * 2);
                    pagetablecell = pagetablecell2;
                    i12 = i24;
                    TL_iv.pageTableCell[][] pagetablecellArr2 = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, pagetablecellArr.length, i15);
                    int i26 = 0;
                    while (i26 < pagetablecellArr.length) {
                        TL_iv.pageTableCell[] pagetablecellArr3 = pagetablecellArr[i26];
                        int i27 = i26;
                        System.arraycopy(pagetablecellArr3, 0, pagetablecellArr2[i27], 0, pagetablecellArr3.length);
                        i26 = i27 + 1;
                        pagetablecellArr = pagetablecellArr;
                        i20 = i20;
                    }
                    i13 = i20;
                    iArr2 = e(iArr2, i15);
                    iArr3 = e(iArr3, i15);
                    pagetablecellArr = pagetablecellArr2;
                } else {
                    pagetablecell = pagetablecell2;
                    i12 = i24;
                    i13 = i20;
                }
                for (int i28 = i13; i28 < i13 + i12 && i28 < this.f50260b; i28++) {
                    for (int i29 = i23; i29 < i25; i29++) {
                        pagetablecellArr[i28][i29] = pagetablecell;
                        iArr2[i28][i29] = i13;
                        iArr3[i28][i29] = i23;
                    }
                }
                if (i25 > i21) {
                    i21 = i25;
                }
                i22++;
                i23 = i25;
                i20 = i13;
            }
            i20++;
        }
        this.f50261c = i21;
        this.d = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, Math.max(i11, 1), Math.max(this.f50261c, 1));
        this.f50262e = (int[][]) Array.newInstance(cls, Math.max(this.f50260b, 1), Math.max(this.f50261c, 1));
        this.f50263f = (int[][]) Array.newInstance(cls, Math.max(this.f50260b, 1), Math.max(this.f50261c, 1));
        for (int i30 = 0; i30 < this.f50260b; i30++) {
            for (int i31 = 0; i31 < this.f50261c; i31++) {
                TL_iv.pageTableCell[][] pagetablecellArr4 = this.d;
                pagetablecellArr4[i30][i31] = pagetablecellArr[i30][i31];
                this.f50262e[i30][i31] = iArr2[i30][i31];
                this.f50263f[i30][i31] = iArr3[i30][i31];
                if (pagetablecellArr4[i30][i31] == null) {
                    TL_iv.pageTableCell f10 = f();
                    this.d[i30][i31] = f10;
                    this.f50262e[i30][i31] = i30;
                    this.f50263f[i30][i31] = i31;
                    pageblocktable.rows.get(i30).cells.add(f10);
                }
            }
        }
        ArrayList arrayList2 = this.f50264g;
        arrayList2.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i32 = 0; i32 < this.f50260b; i32++) {
            int i33 = 0;
            while (true) {
                int i34 = this.f50261c;
                if (i33 < i34) {
                    if (i32 >= 0 && i33 >= 0 && i32 < this.f50260b && i33 < i34 && this.f50262e[i32][i33] == i32 && this.f50263f[i32][i33] == i33 && linkedHashSet.add(this.d[i32][i33])) {
                        arrayList2.add(this.d[i32][i33]);
                    }
                    i33++;
                }
            }
        }
    }

    public final void j(final IdentityHashMap identityHashMap, int i10) {
        int i11;
        int i12;
        TL_iv.pageBlockTable pageblocktable = this.f50259a;
        pageblocktable.rows.clear();
        for (int i13 = 0; i13 < i10; i13++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : identityHashMap.entrySet()) {
                if (((int[]) entry.getValue())[0] == i13) {
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
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                int[] iArr = (int[]) identityHashMap.get(pagetablecell);
                int i15 = iArr[2];
                if (i15 <= 1) {
                    i15 = 0;
                }
                pagetablecell.rowspan = i15;
                int i16 = iArr[3];
                if (i16 <= 1) {
                    i16 = 0;
                }
                pagetablecell.colspan = i16;
                if (i15 != 0) {
                    i11 = pagetablecell.flags | 4;
                } else {
                    i11 = pagetablecell.flags & (-5);
                }
                pagetablecell.flags = i11;
                if (i16 != 0) {
                    i12 = pagetablecell.flags | 2;
                } else {
                    i12 = pagetablecell.flags & (-3);
                }
                pagetablecell.flags = i12;
                pagetablerow.cells.add(pagetablecell);
            }
            pageblocktable.rows.add(pagetablerow);
        }
    }

    public final boolean p(TL_iv.pageTableCell pagetablecell) {
        int b10 = b(pagetablecell);
        int a2 = a(pagetablecell);
        if (b10 >= 0 && a2 >= 0) {
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
                for (int i12 = b10; i12 < b10 + i10 && i12 < this.f50260b; i12++) {
                    TL_iv.pageTableRow pagetablerow = this.f50259a.rows.get(i12);
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
                    for (int i14 = a2; i14 < a2 + i11; i14++) {
                        if (i12 != b10 || i14 != a2) {
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
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new lf.d(19)));
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
