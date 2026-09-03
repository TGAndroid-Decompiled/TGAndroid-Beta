package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k7.c6;
import k7.l8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.x9;
public final class i5 extends z implements b6, l9 {
    public y2 B;
    public z5 C;
    public boolean D;
    public final LinkedHashSet E;
    public f5 F;
    public final i G;
    public final g6 f49833n;
    public final e1 f49834r;
    public final org.telegram.ui.g2 f49835s;
    public final k5 v;
    public final h5 f49836w;
    public final ArrayList f49837x;
    public boolean f49838y;

    public i5(Context context, g6 g6Var) {
        super(context);
        this.f49837x = new ArrayList();
        this.E = new LinkedHashSet();
        this.G = new i(this, 3);
        this.f49833n = g6Var;
        setClipChildren(false);
        setClipToPadding(false);
        e1 e1Var = new e1(context, g6Var);
        this.f49834r = e1Var;
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(49);
        e1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        e1Var.setIncludeFontPadding(false);
        e1Var.setMinHeight(0);
        e1Var.setBackground(null);
        e1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), 0);
        e1Var.setHint(LocaleController.getString(R.string.ArticleTableTitleHint));
        e1Var.setCenterEmptyHint(true);
        e1Var.setListener(new oh.h4(this, 28));
        e1Var.setDelegate(new sf.h(this, 19));
        addView(e1Var);
        org.telegram.ui.g2 g2Var = new org.telegram.ui.g2(this, context, 2);
        this.f49835s = g2Var;
        g2Var.setClipChildren(false);
        g2Var.setClipToPadding(false);
        g2Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(g2Var, c6.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        k5 k5Var = new k5(context, g6Var);
        this.v = k5Var;
        h5 h5Var = new h5(this, context);
        this.f49836w = h5Var;
        h5Var.addView(k5Var);
        g2Var.addView(h5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m9 m9Var;
        super.dispatchDraw(canvas);
        if (this.C != null) {
            y2 y2Var = this.B;
            if (y2Var != null) {
                m9Var = y2Var.f50207a.getTextSelectionHelper();
            } else {
                m9Var = null;
            }
            if (m9Var != null) {
                ArrayList arrayList = this.f49837x;
                arrayList.clear();
                fillTextLayoutBlocks(arrayList);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    x9 x9Var = (x9) arrayList.get(i10);
                    canvas.save();
                    canvas.translate(x9Var.getX(), x9Var.getY());
                    m9Var.a0(canvas, this, i10);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void e() {
        e1 e1Var = this.f49834r;
        e1Var.t();
        int v02 = k6.v0(k6.G6, this.f49833n);
        e1Var.setTextColor(v02);
        e1Var.setHintTextColor(k6.l1(0.35f, v02));
        int i10 = 0;
        while (true) {
            k5 k5Var = this.v;
            if (i10 < k5Var.getChildCount()) {
                View childAt = k5Var.getChildAt(i10);
                if (childAt instanceof l5) {
                    ((l5) childAt).f49903a.t();
                }
                i10++;
            } else {
                k5Var.b();
                return;
            }
        }
    }

    @Override
    public final void f(int i10) {
        requestLayout();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e1 e1Var;
        Layout layout;
        if (this.C != null) {
            e1 e1Var2 = this.f49834r;
            Layout layout2 = e1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new d5(this, layout2, e1Var2.getPaddingLeft() + e1Var2.getLeft(), e1Var2.getPaddingTop() + e1Var2.getTop()));
            }
            int size = this.C.f50264g.size();
            for (int i10 = 0; i10 < size; i10++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.C.f50264g.get(i10);
                k5 k5Var = this.v;
                l5 m9 = k5Var.m(pagetablecell);
                if (m9 != null && (layout = (e1Var = m9.f49903a).getLayout()) != null) {
                    org.telegram.ui.g2 g2Var = this.f49835s;
                    int left = g2Var.getLeft();
                    h5 h5Var = this.f49836w;
                    int paddingLeft = e1Var.getPaddingLeft() + e1Var.getLeft() + m9.getLeft() + ((k5Var.getLeft() + (h5Var.getLeft() + left)) - g2Var.getScrollX());
                    int top = g2Var.getTop();
                    arrayList.add(new e5(layout, paddingLeft, e1Var.getPaddingTop() + e1Var.getTop() + m9.getTop() + k5Var.getTop() + h5Var.getTop() + top, this.C.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    public k5 getGrid() {
        return this.v;
    }

    public z5 getModel() {
        return this.C;
    }

    public a getRow() {
        return this.f50211a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.E;
    }

    public e1 getTitleEditText() {
        return this.f49834r;
    }

    public final TL_iv.pageTableCell h(int i10) {
        int i11;
        z5 z5Var = this.C;
        if (z5Var == null || i10 <= 0 || i10 - 1 >= z5Var.f50264g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.C.f50264g.get(i11);
    }

    public final void i(boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.C != null) {
            LinkedHashSet linkedHashSet = this.E;
            if (!linkedHashSet.isEmpty()) {
                if (z4) {
                    Iterator it = linkedHashSet.iterator();
                    i10 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i10 = Math.min(i10, this.C.a((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i10 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i10 = Math.max(i10, z5.n(pagetablecell) + this.C.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                z5 z5Var = this.C;
                if (z5Var.f50260b != 0 && (i11 = z5Var.f50261c) != 0) {
                    if (i10 < 0) {
                        i12 = 0;
                    } else {
                        i12 = i10;
                    }
                    if (i12 <= i11) {
                        i11 = i12;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[z5Var.f50260b];
                    ArrayList arrayList = z5Var.f50264g;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = z5Var.b(pagetablecell2);
                        int a2 = z5Var.a(pagetablecell2);
                        int o10 = z5.o(pagetablecell2);
                        int i16 = pagetablecell2.colspan;
                        if (i16 == 0) {
                            i16 = 1;
                        }
                        if (a2 >= i11) {
                            i14 = a2 + 1;
                        } else {
                            i14 = a2;
                        }
                        if (a2 < i11 && a2 + i16 > i11) {
                            i16++;
                            for (int i17 = b10; i17 < b10 + o10 && i17 < z5Var.f50260b; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i14, o10, i16});
                    }
                    int i18 = 0;
                    while (true) {
                        i13 = z5Var.f50260b;
                        if (i18 >= i13) {
                            break;
                        }
                        if (!zArr[i18]) {
                            identityHashMap.put(z5.f(), new int[]{i18, i11, 1, 1});
                        }
                        i18++;
                    }
                    z5Var.j(identityHashMap, i13);
                    z5Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = z5Var.f50259a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(z5.f());
                        pageblocktable.rows.add(pagetablerow);
                    } else {
                        ArrayList<TL_iv.pageTableRow> arrayList3 = pageblocktable.rows;
                        int size2 = arrayList3.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            TL_iv.pageTableRow pagetablerow2 = arrayList3.get(i19);
                            i19++;
                            TL_iv.pageTableRow pagetablerow3 = pagetablerow2;
                            if (pagetablerow3.cells == null) {
                                pagetablerow3.cells = new ArrayList<>();
                            }
                            pagetablerow3.cells.add(z5.f());
                        }
                    }
                    z5Var.i();
                }
                v();
                q(0, i10);
                t();
            }
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        k5 k5Var = this.v;
        if (k5Var != null) {
            k5Var.invalidate();
        }
    }

    public final void j(boolean z4) {
        int i10;
        int i11;
        int i12;
        if (this.C != null) {
            LinkedHashSet linkedHashSet = this.E;
            if (!linkedHashSet.isEmpty()) {
                if (z4) {
                    Iterator it = linkedHashSet.iterator();
                    i10 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i10 = Math.min(i10, this.C.b((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i10 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i10 = Math.max(i10, z5.o(pagetablecell) + this.C.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                z5 z5Var = this.C;
                int i13 = z5Var.f50260b;
                if (i13 != 0 && z5Var.f50261c != 0) {
                    if (i10 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i10;
                    }
                    if (i11 <= i13) {
                        i13 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[z5Var.f50261c];
                    ArrayList arrayList = z5Var.f50264g;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = z5Var.b(pagetablecell2);
                        int a2 = z5Var.a(pagetablecell2);
                        int o10 = z5.o(pagetablecell2);
                        int i15 = pagetablecell2.colspan;
                        if (i15 == 0) {
                            i15 = 1;
                        }
                        if (b10 >= i13) {
                            i12 = b10 + 1;
                        } else {
                            i12 = b10;
                        }
                        if (b10 < i13 && b10 + o10 > i13) {
                            o10++;
                            for (int i16 = a2; i16 < a2 + i15 && i16 < z5Var.f50261c; i16++) {
                                zArr[i16] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i12, a2, o10, i15});
                    }
                    for (int i17 = 0; i17 < z5Var.f50261c; i17++) {
                        if (!zArr[i17]) {
                            identityHashMap.put(z5.f(), new int[]{i13, i17, 1, 1});
                        }
                    }
                    z5Var.j(identityHashMap, z5Var.f50260b + 1);
                    z5Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(z5Var.f50261c, 1);
                    for (int i18 = 0; i18 < max; i18++) {
                        pagetablerow.cells.add(z5.f());
                    }
                    z5Var.f50259a.rows.add(pagetablerow);
                    z5Var.i();
                }
                v();
                q(i10, 0);
                t();
            }
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        z5 z5Var = this.C;
        if (z5Var == null || (indexOf = z5Var.f50264g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final e1 l(int i10) {
        l5 m9;
        if (i10 == 0) {
            return this.f49834r;
        }
        TL_iv.pageTableCell h = h(i10);
        if (h == null || (m9 = this.v.m(h)) == null) {
            return null;
        }
        return m9.f49903a;
    }

    public final TL_iv.pageTableCell m(int i10, int i11) {
        if (this.C != null) {
            org.telegram.ui.g2 g2Var = this.f49835s;
            int left = i10 - g2Var.getLeft();
            h5 h5Var = this.f49836w;
            int left2 = left - h5Var.getLeft();
            k5 k5Var = this.v;
            int scrollX = g2Var.getScrollX() + (left2 - k5Var.getLeft());
            int top = ((i11 - g2Var.getTop()) - h5Var.getTop()) - k5Var.getTop();
            for (int i12 = 0; i12 < k5Var.getChildCount(); i12++) {
                View childAt = k5Var.getChildAt(i12);
                if (childAt instanceof l5) {
                    l5 l5Var = (l5) childAt;
                    if (scrollX >= l5Var.getLeft() && scrollX < l5Var.getRight() && top >= l5Var.getTop() && top < l5Var.getBottom()) {
                        return l5Var.f49904b;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public final int n(int i10, int i11) {
        int i12;
        int a2;
        if (this.C != null) {
            org.telegram.ui.g2 g2Var = this.f49835s;
            int left = i10 - g2Var.getLeft();
            h5 h5Var = this.f49836w;
            int left2 = left - h5Var.getLeft();
            k5 k5Var = this.v;
            int scrollX = g2Var.getScrollX() + (left2 - k5Var.getLeft());
            int top = ((i11 - g2Var.getTop()) - h5Var.getTop()) - k5Var.getTop();
            z5 z5Var = k5Var.f49871a;
            if (z5Var != null && top >= (i12 = k5Var.f49875f[z5Var.f50260b])) {
                if (top < AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
                    int i13 = 1;
                    if (k5Var.u()) {
                        int j10 = k5Var.j();
                        int q10 = k5Var.q();
                        if (j10 >= 0) {
                            int[] iArr = k5Var.f49874e;
                            if (scrollX >= iArr[j10] && scrollX < iArr[q10 + 1]) {
                                return j10;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a10 = k5Var.a();
                    if (a10 != null && (a2 = k5Var.f49871a.a(a10)) >= 0) {
                        int i14 = a10.colspan;
                        if (i14 != 0) {
                            i13 = i14;
                        }
                        int[] iArr2 = k5Var.f49874e;
                        int i15 = iArr2[a2];
                        int i16 = iArr2[Math.min(i13 + a2, k5Var.f49871a.f50261c)];
                        if (scrollX >= i15 && scrollX < i16) {
                            return a2;
                        }
                        return -1;
                    }
                    return -1;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public final l5 o(e1 e1Var) {
        for (ViewParent parent = e1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof l5) {
                return (l5) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.G);
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.G);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = this.f50213c;
        int d = l8.d(this.f50211a);
        boolean z10 = this.f49838y;
        if (z10) {
            i14 = d;
        } else {
            i14 = i17;
        }
        if (!z10) {
            i17 = d;
        }
        e1 e1Var = this.f49834r;
        int measuredHeight = e1Var.getMeasuredHeight();
        a aVar = this.f50211a;
        int i18 = 0;
        if (aVar != null && (i15 = aVar.f49661l) > 0) {
            i18 = AndroidUtilities.dp(e2.c.e(i15, 1, 16, 10));
        }
        int i19 = i16 - i17;
        int i20 = measuredHeight + i18;
        e1Var.layout(AndroidUtilities.dp(16.0f) + i14, i18, l.d.c(16.0f, i19, AndroidUtilities.dp(16.0f) + i14), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        org.telegram.ui.g2 g2Var = this.f49835s;
        g2Var.layout(i14, dp, i19, g2Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.f50213c) - l8.d(this.f50211a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        e1 e1Var = this.f49834r;
        e1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = e1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        org.telegram.ui.g2 g2Var = this.f49835s;
        g2Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f50211a;
        if (aVar == null || (i12 = aVar.f49661l) <= 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(e2.c.e(i12, 1, 16, 10));
        }
        a aVar2 = this.f50211a;
        if (aVar2 != null && (i13 = aVar2.f49662m) > 0) {
            i14 = AndroidUtilities.dp(e2.c.e(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, g2Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int b10;
        if (this.C != null) {
            org.telegram.ui.g2 g2Var = this.f49835s;
            int left = i10 - g2Var.getLeft();
            h5 h5Var = this.f49836w;
            int left2 = left - h5Var.getLeft();
            k5 k5Var = this.v;
            int scrollX = g2Var.getScrollX() + (left2 - k5Var.getLeft());
            int top = ((i11 - g2Var.getTop()) - h5Var.getTop()) - k5Var.getTop();
            if (k5Var.f49871a != null && scrollX >= (k5Var.f49874e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) && scrollX < k5Var.f49874e[0]) {
                int i12 = 1;
                if (k5Var.v()) {
                    int k10 = k5Var.k();
                    int r10 = k5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = k5Var.f49875f;
                        if (top >= iArr[k10] && top < iArr[r10 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a2 = k5Var.a();
                if (a2 != null && (b10 = k5Var.f49871a.b(a2)) >= 0) {
                    int i13 = a2.rowspan;
                    if (i13 != 0) {
                        i12 = i13;
                    }
                    int[] iArr2 = k5Var.f49875f;
                    int i14 = iArr2[b10];
                    int i15 = iArr2[Math.min(i12 + b10, k5Var.f49871a.f50260b)];
                    if (top >= i14 && top < i15) {
                        return b10;
                    }
                    return -1;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public final void q(int i10, int i11) {
        int i12;
        z5 z5Var = this.C;
        if (z5Var != null && (i12 = z5Var.f50260b) != 0 && z5Var.f50261c != 0) {
            TL_iv.pageTableCell pagetablecell = this.C.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.C.f50261c - 1))];
            if (pagetablecell != null) {
                post(new vf.k0(13, this, pagetablecell));
            }
        }
    }

    public final boolean r() {
        z5 z5Var = this.C;
        if (z5Var == null || z5Var.f50264g.isEmpty()) {
            return false;
        }
        l5 m9 = this.v.m((TL_iv.pageTableCell) this.C.f50264g.get(0));
        if (m9 == null) {
            return false;
        }
        e1 e1Var = m9.f49903a;
        e1Var.r();
        e1Var.setSelection(0);
        return true;
    }

    public final boolean s(l5 l5Var, boolean z4) {
        int indexOf;
        int i10;
        z5 z5Var = this.C;
        if (z5Var != null && (indexOf = z5Var.f50264g.indexOf(l5Var.f49904b)) >= 0) {
            if (z4) {
                i10 = indexOf - 1;
            } else {
                i10 = indexOf + 1;
            }
            if (i10 >= 0 && i10 < this.C.f50264g.size()) {
                l5 m9 = this.v.m((TL_iv.pageTableCell) this.C.f50264g.get(i10));
                if (m9 != null) {
                    e1 e1Var = m9.f49903a;
                    e1Var.r();
                    e1Var.setSelection(e1Var.length());
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void setCellSelectionListener(f5 f5Var) {
        this.F = f5Var;
    }

    public void setLocked(boolean z4) {
        this.f49834r.setLocked(z4);
        int i10 = 0;
        while (true) {
            k5 k5Var = this.v;
            if (i10 < k5Var.getChildCount()) {
                View childAt = k5Var.getChildAt(i10);
                if (childAt instanceof l5) {
                    ((l5) childAt).setLocked(z4);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void t() {
        x();
        f5 f5Var = this.F;
        if (f5Var != null) {
            r3 r3Var = ((o2) f5Var).f49934a;
            if (this == r3Var.f50019f4) {
                if (this.E.isEmpty()) {
                    r3Var.L2();
                } else if (!r3Var.f50047y3) {
                    r3Var.E4(this);
                }
            }
        }
    }

    public final void u() {
        a aVar = this.f50211a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f49653b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = x5.f(this.f49834r.getText());
            }
        }
    }

    public final void v() {
        k5 k5Var = this.v;
        k5Var.s();
        k5Var.requestLayout();
        k5Var.invalidate();
        y();
        y2 y2Var = this.B;
        if (y2Var != null && this.f50211a != null) {
            y2Var.a();
        }
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        z5 z5Var = this.C;
        if (z5Var != null && pagetablecell != null) {
            int b10 = z5Var.b(pagetablecell);
            int a2 = this.C.a(pagetablecell);
            int b11 = this.C.b(pagetablecell2);
            int a10 = this.C.a(pagetablecell2);
            if (b10 >= 0 && a2 >= 0 && b11 >= 0 && a10 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a2, a10);
                int i11 = this.C.f50260b - 1;
                int i12 = pagetablecell.rowspan;
                if (i12 == 0) {
                    i12 = 1;
                }
                int i13 = (b10 + i12) - 1;
                int i14 = pagetablecell2.rowspan;
                if (i14 == 0) {
                    i14 = 1;
                }
                int min3 = Math.min(i11, Math.max(i13, (b11 + i14) - 1));
                int i15 = this.C.f50261c - 1;
                int i16 = pagetablecell.colspan;
                if (i16 == 0) {
                    i16 = 1;
                }
                int i17 = (a2 + i16) - 1;
                int i18 = pagetablecell2.colspan;
                if (i18 == 0) {
                    i18 = 1;
                }
                int min4 = Math.min(i15, Math.max(i17, (a10 + i18) - 1));
                while (true) {
                    boolean z4 = false;
                    i10 = min;
                    while (min <= min3) {
                        int i19 = min2;
                        while (min2 <= min4) {
                            z5 z5Var2 = this.C;
                            TL_iv.pageTableCell pagetablecell3 = z5Var2.d[min][min2];
                            int i20 = z5Var2.f50262e[min][min2];
                            int i21 = z5Var2.f50263f[min][min2];
                            int min5 = Math.min(z5Var2.f50260b - 1, (z5.o(pagetablecell3) + i20) - 1);
                            int i22 = this.C.f50261c - 1;
                            int i23 = pagetablecell3.colspan;
                            if (i23 == 0) {
                                i23 = 1;
                            }
                            int min6 = Math.min(i22, (i23 + i21) - 1);
                            if (i20 < i10) {
                                i10 = i20;
                                z4 = true;
                            }
                            if (i21 < i19) {
                                i19 = i21;
                                z4 = true;
                            }
                            if (min5 > min3) {
                                min3 = min5;
                                z4 = true;
                            }
                            if (min6 > min4) {
                                min4 = min6;
                                z4 = true;
                            }
                            min2++;
                        }
                        min++;
                        min2 = i19;
                    }
                    if (!z4) {
                        break;
                    }
                    min = i10;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (i10 <= min3) {
                    for (int i24 = min2; i24 <= min4; i24++) {
                        linkedHashSet.add(this.C.d[i10][i24]);
                    }
                    i10++;
                }
                LinkedHashSet linkedHashSet2 = this.E;
                if (!linkedHashSet2.equals(linkedHashSet)) {
                    linkedHashSet2.clear();
                    linkedHashSet2.addAll(linkedHashSet);
                    this.v.invalidate();
                    t();
                }
            }
        }
    }

    public final void x() {
        float dp;
        if (this.E.isEmpty() && !this.v.hasFocus()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(1.0f);
        }
        setTranslationZ(dp);
        invalidate();
        this.f49835s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }

    public final void y() {
        int i10 = 0;
        while (true) {
            k5 k5Var = this.v;
            if (i10 < k5Var.getChildCount()) {
                View childAt = k5Var.getChildAt(i10);
                if (childAt instanceof l5) {
                    l5 l5Var = (l5) childAt;
                    e1 e1Var = l5Var.f49903a;
                    e1Var.setListener(new c5(this, l5Var));
                    e1Var.setDelegate(new org.telegram.ui.web.m(14, this, l5Var));
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
