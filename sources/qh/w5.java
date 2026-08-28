package qh;

import j$.util.Comparator$CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.tl.TL_iv;
public final class w5 {
    public final TL_iv.pageBlockTable f46778a;
    public int f46779b;
    public int f46780c;
    public TL_iv.pageTableCell[][] d;
    public int[][] f46781e;
    public int[][] f46782f;
    public final ArrayList f46783g = new ArrayList();

    public w5(TL_iv.pageBlockTable pageblocktable) {
        this.f46778a = pageblocktable;
        i();
    }

    public static void c(TL_iv.pageTableCell pagetablecell, String str) {
        int i9;
        int i10;
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        pagetablecell.text = textplain;
        int i11 = pagetablecell.flags;
        int i12 = i11 | 128;
        pagetablecell.flags = i12;
        if (pagetablecell.colspan > 1) {
            i9 = i11 | 130;
        } else {
            i9 = i12 & (-3);
        }
        pagetablecell.flags = i9;
        if (pagetablecell.rowspan > 1) {
            i10 = pagetablecell.flags | 4;
        } else {
            i10 = pagetablecell.flags & (-5);
        }
        pagetablecell.flags = i10;
    }

    public static void d(TL_iv.pageTableCell pagetablecell, CharSequence charSequence) {
        int i9;
        int i10;
        pagetablecell.text = u5.f(charSequence);
        int i11 = pagetablecell.flags;
        int i12 = i11 | 128;
        pagetablecell.flags = i12;
        if (pagetablecell.colspan > 1) {
            i9 = i11 | 130;
        } else {
            i9 = i12 & (-3);
        }
        pagetablecell.flags = i9;
        if (pagetablecell.rowspan > 1) {
            i10 = pagetablecell.flags | 4;
        } else {
            i10 = pagetablecell.flags & (-5);
        }
        pagetablecell.flags = i10;
    }

    public static int[][] e(int[][] iArr, int i9) {
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr.length, i9);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int[] iArr3 = iArr[i10];
            int length = iArr3.length;
            System.arraycopy(iArr3, 0, iArr2[i10], 0, length);
            while (length < i9) {
                iArr2[i10][length] = -1;
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
            return u5.l(richText);
        }
        return "";
    }

    public static CharSequence h(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        if (pagetablecell != null && (richText = pagetablecell.text) != null) {
            return u5.r(richText, null, true);
        }
        return "";
    }

    public static void k(TL_iv.pageTableCell pagetablecell, int i9) {
        boolean z10;
        int i10;
        int i11;
        if (pagetablecell == null) {
            return;
        }
        boolean z11 = false;
        if (i9 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        pagetablecell.align_center = z10;
        if (i9 == 2) {
            z11 = true;
        }
        pagetablecell.align_right = z11;
        int i12 = pagetablecell.flags;
        if (z10) {
            i10 = i12 | 8;
        } else {
            i10 = i12 & (-9);
        }
        pagetablecell.flags = i10;
        int i13 = pagetablecell.flags;
        if (z11) {
            i11 = i13 | 16;
        } else {
            i11 = i13 & (-17);
        }
        pagetablecell.flags = i11;
    }

    public static void l(TL_iv.pageTableCell pagetablecell, boolean z10) {
        int i9;
        if (pagetablecell == null) {
            return;
        }
        pagetablecell.header = z10;
        if (z10) {
            i9 = pagetablecell.flags | 1;
        } else {
            i9 = pagetablecell.flags & (-2);
        }
        pagetablecell.flags = i9;
    }

    public static void m(TL_iv.pageTableCell pagetablecell, int i9) {
        boolean z10;
        int i10;
        int i11;
        if (pagetablecell == null) {
            return;
        }
        boolean z11 = false;
        if (i9 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        pagetablecell.valign_middle = z10;
        if (i9 == 2) {
            z11 = true;
        }
        pagetablecell.valign_bottom = z11;
        int i12 = pagetablecell.flags;
        if (z10) {
            i10 = i12 | 32;
        } else {
            i10 = i12 & (-33);
        }
        pagetablecell.flags = i10;
        int i13 = pagetablecell.flags;
        if (z11) {
            i11 = i13 | 64;
        } else {
            i11 = i13 & (-65);
        }
        pagetablecell.flags = i11;
    }

    public static int n(TL_iv.pageTableCell pagetablecell) {
        int i9 = pagetablecell.colspan;
        if (i9 != 0) {
            return i9;
        }
        return 1;
    }

    public static int o(TL_iv.pageTableCell pagetablecell) {
        int i9 = pagetablecell.rowspan;
        if (i9 != 0) {
            return i9;
        }
        return 1;
    }

    public final int a(TL_iv.pageTableCell pagetablecell) {
        for (int i9 = 0; i9 < this.f46779b; i9++) {
            for (int i10 = 0; i10 < this.f46780c; i10++) {
                if (this.d[i9][i10] == pagetablecell) {
                    return this.f46782f[i9][i10];
                }
            }
        }
        return -1;
    }

    public final int b(TL_iv.pageTableCell pagetablecell) {
        for (int i9 = 0; i9 < this.f46779b; i9++) {
            for (int i10 = 0; i10 < this.f46780c; i10++) {
                if (this.d[i9][i10] == pagetablecell) {
                    return this.f46781e[i9][i10];
                }
            }
        }
        return -1;
    }

    public final void i() {
        int size;
        int i9;
        int i10;
        TL_iv.pageTableCell pagetablecell;
        int i11;
        int i12;
        TL_iv.pageBlockTable pageblocktable = this.f46778a;
        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        this.f46779b = size;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i9 = this.f46779b;
            if (i13 >= i9) {
                break;
            }
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i13);
            int i15 = 0;
            for (int i16 = 0; i16 < pagetablerow.cells.size(); i16++) {
                i15 += n(pagetablerow.cells.get(i16));
            }
            if (i15 > i14) {
                i14 = i15;
            }
            i13++;
        }
        TL_iv.pageTableCell[][] pagetablecellArr = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, Math.max(i9, 1), Math.max(i14, 1));
        int[] iArr = {Math.max(this.f46779b, 1), Math.max(i14, 1)};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance(cls, iArr);
        int[][] iArr3 = (int[][]) Array.newInstance(cls, Math.max(this.f46779b, 1), Math.max(i14, 1));
        for (int i17 = 0; i17 < iArr2.length; i17++) {
            for (int i18 = 0; i18 < iArr2[0].length; i18++) {
                iArr2[i17][i18] = -1;
                iArr3[i17][i18] = -1;
            }
        }
        int i19 = 0;
        int i20 = 0;
        while (true) {
            i10 = this.f46779b;
            if (i19 >= i10) {
                break;
            }
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i19);
            int i21 = 0;
            int i22 = 0;
            while (i21 < pagetablerow2.cells.size()) {
                TL_iv.pageTableCell pagetablecell2 = pagetablerow2.cells.get(i21);
                int n10 = n(pagetablecell2);
                int i23 = pagetablecell2.rowspan;
                if (i23 == 0) {
                    i23 = 1;
                }
                while (i22 < i14 && pagetablecellArr[i19][i22] != null) {
                    i22++;
                }
                int i24 = i22 + n10;
                if (i24 > i14) {
                    i14 = Math.max(i24, i14 * 2);
                    pagetablecell = pagetablecell2;
                    i11 = i23;
                    TL_iv.pageTableCell[][] pagetablecellArr2 = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, pagetablecellArr.length, i14);
                    int i25 = 0;
                    while (i25 < pagetablecellArr.length) {
                        TL_iv.pageTableCell[] pagetablecellArr3 = pagetablecellArr[i25];
                        int i26 = i25;
                        System.arraycopy(pagetablecellArr3, 0, pagetablecellArr2[i26], 0, pagetablecellArr3.length);
                        i25 = i26 + 1;
                        pagetablecellArr = pagetablecellArr;
                        i19 = i19;
                    }
                    i12 = i19;
                    iArr2 = e(iArr2, i14);
                    iArr3 = e(iArr3, i14);
                    pagetablecellArr = pagetablecellArr2;
                } else {
                    pagetablecell = pagetablecell2;
                    i11 = i23;
                    i12 = i19;
                }
                for (int i27 = i12; i27 < i12 + i11 && i27 < this.f46779b; i27++) {
                    for (int i28 = i22; i28 < i24; i28++) {
                        pagetablecellArr[i27][i28] = pagetablecell;
                        iArr2[i27][i28] = i12;
                        iArr3[i27][i28] = i22;
                    }
                }
                if (i24 > i20) {
                    i20 = i24;
                }
                i21++;
                i22 = i24;
                i19 = i12;
            }
            i19++;
        }
        this.f46780c = i20;
        this.d = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, Math.max(i10, 1), Math.max(this.f46780c, 1));
        this.f46781e = (int[][]) Array.newInstance(cls, Math.max(this.f46779b, 1), Math.max(this.f46780c, 1));
        this.f46782f = (int[][]) Array.newInstance(cls, Math.max(this.f46779b, 1), Math.max(this.f46780c, 1));
        for (int i29 = 0; i29 < this.f46779b; i29++) {
            for (int i30 = 0; i30 < this.f46780c; i30++) {
                TL_iv.pageTableCell[][] pagetablecellArr4 = this.d;
                pagetablecellArr4[i29][i30] = pagetablecellArr[i29][i30];
                this.f46781e[i29][i30] = iArr2[i29][i30];
                this.f46782f[i29][i30] = iArr3[i29][i30];
                if (pagetablecellArr4[i29][i30] == null) {
                    TL_iv.pageTableCell f10 = f();
                    this.d[i29][i30] = f10;
                    this.f46781e[i29][i30] = i29;
                    this.f46782f[i29][i30] = i30;
                    pageblocktable.rows.get(i29).cells.add(f10);
                }
            }
        }
        ArrayList arrayList2 = this.f46783g;
        arrayList2.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i31 = 0; i31 < this.f46779b; i31++) {
            int i32 = 0;
            while (true) {
                int i33 = this.f46780c;
                if (i32 < i33) {
                    if (i31 >= 0 && i32 >= 0 && i31 < this.f46779b && i32 < i33 && this.f46781e[i31][i32] == i31 && this.f46782f[i31][i32] == i32 && linkedHashSet.add(this.d[i31][i32])) {
                        arrayList2.add(this.d[i31][i32]);
                    }
                    i32++;
                }
            }
        }
    }

    public final void j(final IdentityHashMap identityHashMap, int i9) {
        int i10;
        int i11;
        TL_iv.pageBlockTable pageblocktable = this.f46778a;
        pageblocktable.rows.clear();
        for (int i12 = 0; i12 < i9; i12++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : identityHashMap.entrySet()) {
                if (((int[]) entry.getValue())[0] == i12) {
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
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                int[] iArr = (int[]) identityHashMap.get(pagetablecell);
                int i14 = iArr[2];
                if (i14 <= 1) {
                    i14 = 0;
                }
                pagetablecell.rowspan = i14;
                int i15 = iArr[3];
                if (i15 <= 1) {
                    i15 = 0;
                }
                pagetablecell.colspan = i15;
                if (i14 != 0) {
                    i10 = pagetablecell.flags | 4;
                } else {
                    i10 = pagetablecell.flags & (-5);
                }
                pagetablecell.flags = i10;
                if (i15 != 0) {
                    i11 = pagetablecell.flags | 2;
                } else {
                    i11 = pagetablecell.flags & (-3);
                }
                pagetablecell.flags = i11;
                pagetablerow.cells.add(pagetablecell);
            }
            pageblocktable.rows.add(pagetablerow);
        }
    }

    public final boolean p(TL_iv.pageTableCell pagetablecell) {
        int b10 = b(pagetablecell);
        int a2 = a(pagetablecell);
        if (b10 >= 0 && a2 >= 0) {
            int i9 = pagetablecell.rowspan;
            if (i9 == 0) {
                i9 = 1;
            }
            int i10 = pagetablecell.colspan;
            if (i10 == 0) {
                i10 = 1;
            }
            if (i9 > 1 || i10 > 1) {
                pagetablecell.rowspan = 0;
                pagetablecell.colspan = 0;
                pagetablecell.flags &= -7;
                for (int i11 = b10; i11 < b10 + i9 && i11 < this.f46779b; i11++) {
                    TL_iv.pageTableRow pagetablerow = this.f46778a.rows.get(i11);
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TL_iv.pageTableCell pagetablecell2 = arrayList2.get(i12);
                        i12++;
                        TL_iv.pageTableCell pagetablecell3 = pagetablecell2;
                        arrayList.add(new Object[]{pagetablecell3, Integer.valueOf(a(pagetablecell3))});
                    }
                    for (int i13 = a2; i13 < a2 + i10; i13++) {
                        if (i11 != b10 || i13 != a2) {
                            TL_iv.pageTableCell pagetablecell4 = new TL_iv.pageTableCell();
                            pagetablecell4.header = pagetablecell.header;
                            pagetablecell4.align_center = pagetablecell.align_center;
                            pagetablecell4.align_right = pagetablecell.align_right;
                            pagetablecell4.valign_middle = pagetablecell.valign_middle;
                            pagetablecell4.valign_bottom = pagetablecell.valign_bottom;
                            c(pagetablecell4, "");
                            arrayList.add(new Object[]{pagetablecell4, Integer.valueOf(i13)});
                        }
                    }
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new ff.d(19)));
                    pagetablerow.cells.clear();
                    int size2 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj = arrayList.get(i14);
                        i14++;
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
