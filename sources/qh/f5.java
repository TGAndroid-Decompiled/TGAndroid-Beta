package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import g7.e6;
import g7.v6;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.ai1;
import org.telegram.ui.ei1;
public final class f5 extends y implements org.telegram.ui.ActionBar.w5, m9 {
    public v2 A;
    public w5 B;
    public boolean C;
    public final LinkedHashSet D;
    public c5 E;
    public final h F;
    public final b6 f46391n;
    public final d1 f46392r;
    public final org.telegram.ui.h2 f46393s;
    public final h5 v;
    public final e5 f46394w;
    public final ArrayList f46395x;
    public boolean f46396y;

    public f5(Context context, b6 b6Var) {
        super(context);
        this.f46395x = new ArrayList();
        this.D = new LinkedHashSet();
        this.F = new h(this, 3);
        this.f46391n = b6Var;
        setClipChildren(false);
        setClipToPadding(false);
        d1 d1Var = new d1(context, b6Var);
        this.f46392r = d1Var;
        d1Var.setAllowNewlines(false);
        d1Var.setInputType(147457);
        d1Var.setGravity(49);
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setIncludeFontPadding(false);
        d1Var.setMinHeight(0);
        d1Var.setBackground(null);
        d1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), 0);
        d1Var.setHint(LocaleController.getString(R.string.ArticleTableTitleHint));
        d1Var.setCenterEmptyHint(true);
        d1Var.setListener(new n5.a0(this, 15));
        d1Var.setDelegate(new kh.p(this, 27));
        addView(d1Var);
        org.telegram.ui.h2 h2Var = new org.telegram.ui.h2(this, context, 2);
        this.f46393s = h2Var;
        h2Var.setClipChildren(false);
        h2Var.setClipToPadding(false);
        h2Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(h2Var, e6.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        h5 h5Var = new h5(context, b6Var);
        this.v = h5Var;
        e5 e5Var = new e5(this, context);
        this.f46394w = e5Var;
        e5Var.addView(h5Var);
        h2Var.addView(e5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override
    public final void d() {
        d1 d1Var = this.f46392r;
        d1Var.t();
        int v02 = f6.v0(f6.G6, this.f46391n);
        d1Var.setTextColor(v02);
        d1Var.setHintTextColor(f6.l1(0.35f, v02));
        int i9 = 0;
        while (true) {
            h5 h5Var = this.v;
            if (i9 < h5Var.getChildCount()) {
                View childAt = h5Var.getChildAt(i9);
                if (childAt instanceof i5) {
                    ((i5) childAt).f46448a.t();
                }
                i9++;
            } else {
                h5Var.b();
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n9 n9Var;
        super.dispatchDraw(canvas);
        if (this.B != null) {
            v2 v2Var = this.A;
            if (v2Var != null) {
                n9Var = v2Var.f46757a.getTextSelectionHelper();
            } else {
                n9Var = null;
            }
            if (n9Var != null) {
                ArrayList arrayList = this.f46395x;
                arrayList.clear();
                fillTextLayoutBlocks(arrayList);
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    y9 y9Var = (y9) arrayList.get(i9);
                    canvas.save();
                    canvas.translate(y9Var.getX(), y9Var.getY());
                    n9Var.a0(canvas, this, i9);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void f(int i9) {
        requestLayout();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d1 d1Var;
        Layout layout;
        if (this.B != null) {
            d1 d1Var2 = this.f46392r;
            Layout layout2 = d1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new a5(this, layout2, d1Var2.getPaddingLeft() + d1Var2.getLeft(), d1Var2.getPaddingTop() + d1Var2.getTop()));
            }
            int size = this.B.f46783g.size();
            for (int i9 = 0; i9 < size; i9++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.B.f46783g.get(i9);
                h5 h5Var = this.v;
                i5 m10 = h5Var.m(pagetablecell);
                if (m10 != null && (layout = (d1Var = m10.f46448a).getLayout()) != null) {
                    org.telegram.ui.h2 h2Var = this.f46393s;
                    int left = h2Var.getLeft();
                    e5 e5Var = this.f46394w;
                    int paddingLeft = d1Var.getPaddingLeft() + d1Var.getLeft() + m10.getLeft() + ((h5Var.getLeft() + (e5Var.getLeft() + left)) - h2Var.getScrollX());
                    int top = h2Var.getTop();
                    arrayList.add(new b5(layout, paddingLeft, d1Var.getPaddingTop() + d1Var.getTop() + m10.getTop() + h5Var.getTop() + e5Var.getTop() + top, this.B.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    public h5 getGrid() {
        return this.v;
    }

    public w5 getModel() {
        return this.B;
    }

    public a getRow() {
        return this.f46834a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.D;
    }

    public d1 getTitleEditText() {
        return this.f46392r;
    }

    public final TL_iv.pageTableCell h(int i9) {
        int i10;
        w5 w5Var = this.B;
        if (w5Var == null || i9 <= 0 || i9 - 1 >= w5Var.f46783g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.B.f46783g.get(i10);
    }

    public final void i(boolean z10) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.B != null) {
            LinkedHashSet linkedHashSet = this.D;
            if (!linkedHashSet.isEmpty()) {
                if (z10) {
                    Iterator it = linkedHashSet.iterator();
                    i9 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i9 = Math.min(i9, this.B.a((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i9 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i9 = Math.max(i9, w5.n(pagetablecell) + this.B.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                w5 w5Var = this.B;
                if (w5Var.f46779b != 0 && (i10 = w5Var.f46780c) != 0) {
                    if (i9 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i9;
                    }
                    if (i11 <= i10) {
                        i10 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[w5Var.f46779b];
                    ArrayList arrayList = w5Var.f46783g;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = w5Var.b(pagetablecell2);
                        int a2 = w5Var.a(pagetablecell2);
                        int o6 = w5.o(pagetablecell2);
                        int i15 = pagetablecell2.colspan;
                        if (i15 == 0) {
                            i15 = 1;
                        }
                        if (a2 >= i10) {
                            i13 = a2 + 1;
                        } else {
                            i13 = a2;
                        }
                        if (a2 < i10 && a2 + i15 > i10) {
                            i15++;
                            for (int i16 = b10; i16 < b10 + o6 && i16 < w5Var.f46779b; i16++) {
                                zArr[i16] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i13, o6, i15});
                    }
                    int i17 = 0;
                    while (true) {
                        i12 = w5Var.f46779b;
                        if (i17 >= i12) {
                            break;
                        }
                        if (!zArr[i17]) {
                            identityHashMap.put(w5.f(), new int[]{i17, i10, 1, 1});
                        }
                        i17++;
                    }
                    w5Var.j(identityHashMap, i12);
                    w5Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = w5Var.f46778a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(w5.f());
                        pageblocktable.rows.add(pagetablerow);
                    } else {
                        ArrayList<TL_iv.pageTableRow> arrayList3 = pageblocktable.rows;
                        int size2 = arrayList3.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            TL_iv.pageTableRow pagetablerow2 = arrayList3.get(i18);
                            i18++;
                            TL_iv.pageTableRow pagetablerow3 = pagetablerow2;
                            if (pagetablerow3.cells == null) {
                                pagetablerow3.cells = new ArrayList<>();
                            }
                            pagetablerow3.cells.add(w5.f());
                        }
                    }
                    w5Var.i();
                }
                v();
                q(0, i9);
                t();
            }
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        h5 h5Var = this.v;
        if (h5Var != null) {
            h5Var.invalidate();
        }
    }

    public final void j(boolean z10) {
        int i9;
        int i10;
        int i11;
        if (this.B != null) {
            LinkedHashSet linkedHashSet = this.D;
            if (!linkedHashSet.isEmpty()) {
                if (z10) {
                    Iterator it = linkedHashSet.iterator();
                    i9 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i9 = Math.min(i9, this.B.b((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i9 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i9 = Math.max(i9, w5.o(pagetablecell) + this.B.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                w5 w5Var = this.B;
                int i12 = w5Var.f46779b;
                if (i12 != 0 && w5Var.f46780c != 0) {
                    if (i9 < 0) {
                        i10 = 0;
                    } else {
                        i10 = i9;
                    }
                    if (i10 <= i12) {
                        i12 = i10;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[w5Var.f46780c];
                    ArrayList arrayList = w5Var.f46783g;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = arrayList.get(i13);
                        i13++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = w5Var.b(pagetablecell2);
                        int a2 = w5Var.a(pagetablecell2);
                        int o6 = w5.o(pagetablecell2);
                        int i14 = pagetablecell2.colspan;
                        if (i14 == 0) {
                            i14 = 1;
                        }
                        if (b10 >= i12) {
                            i11 = b10 + 1;
                        } else {
                            i11 = b10;
                        }
                        if (b10 < i12 && b10 + o6 > i12) {
                            o6++;
                            for (int i15 = a2; i15 < a2 + i14 && i15 < w5Var.f46780c; i15++) {
                                zArr[i15] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i11, a2, o6, i14});
                    }
                    for (int i16 = 0; i16 < w5Var.f46780c; i16++) {
                        if (!zArr[i16]) {
                            identityHashMap.put(w5.f(), new int[]{i12, i16, 1, 1});
                        }
                    }
                    w5Var.j(identityHashMap, w5Var.f46779b + 1);
                    w5Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(w5Var.f46780c, 1);
                    for (int i17 = 0; i17 < max; i17++) {
                        pagetablerow.cells.add(w5.f());
                    }
                    w5Var.f46778a.rows.add(pagetablerow);
                    w5Var.i();
                }
                v();
                q(i9, 0);
                t();
            }
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        w5 w5Var = this.B;
        if (w5Var == null || (indexOf = w5Var.f46783g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final d1 l(int i9) {
        i5 m10;
        if (i9 == 0) {
            return this.f46392r;
        }
        TL_iv.pageTableCell h = h(i9);
        if (h == null || (m10 = this.v.m(h)) == null) {
            return null;
        }
        return m10.f46448a;
    }

    public final TL_iv.pageTableCell m(int i9, int i10) {
        if (this.B != null) {
            org.telegram.ui.h2 h2Var = this.f46393s;
            int left = i9 - h2Var.getLeft();
            e5 e5Var = this.f46394w;
            int left2 = left - e5Var.getLeft();
            h5 h5Var = this.v;
            int scrollX = h2Var.getScrollX() + (left2 - h5Var.getLeft());
            int top = ((i10 - h2Var.getTop()) - e5Var.getTop()) - h5Var.getTop();
            for (int i11 = 0; i11 < h5Var.getChildCount(); i11++) {
                View childAt = h5Var.getChildAt(i11);
                if (childAt instanceof i5) {
                    i5 i5Var = (i5) childAt;
                    if (scrollX >= i5Var.getLeft() && scrollX < i5Var.getRight() && top >= i5Var.getTop() && top < i5Var.getBottom()) {
                        return i5Var.f46449b;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public final int n(int i9, int i10) {
        int i11;
        int a2;
        if (this.B != null) {
            org.telegram.ui.h2 h2Var = this.f46393s;
            int left = i9 - h2Var.getLeft();
            e5 e5Var = this.f46394w;
            int left2 = left - e5Var.getLeft();
            h5 h5Var = this.v;
            int scrollX = h2Var.getScrollX() + (left2 - h5Var.getLeft());
            int top = ((i10 - h2Var.getTop()) - e5Var.getTop()) - h5Var.getTop();
            w5 w5Var = h5Var.f46426a;
            if (w5Var != null && top >= (i11 = h5Var.f46430f[w5Var.f46779b])) {
                if (top < AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i11) {
                    int i12 = 1;
                    if (h5Var.u()) {
                        int j10 = h5Var.j();
                        int q10 = h5Var.q();
                        if (j10 >= 0) {
                            int[] iArr = h5Var.f46429e;
                            if (scrollX >= iArr[j10] && scrollX < iArr[q10 + 1]) {
                                return j10;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a3 = h5Var.a();
                    if (a3 != null && (a2 = h5Var.f46426a.a(a3)) >= 0) {
                        int i13 = a3.colspan;
                        if (i13 != 0) {
                            i12 = i13;
                        }
                        int[] iArr2 = h5Var.f46429e;
                        int i14 = iArr2[a2];
                        int i15 = iArr2[Math.min(i12 + a2, h5Var.f46426a.f46780c)];
                        if (scrollX >= i14 && scrollX < i15) {
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

    public final i5 o(d1 d1Var) {
        for (ViewParent parent = d1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof i5) {
                return (i5) parent;
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
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.F);
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.F);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = i11 - i9;
        int i16 = this.f46836c;
        int d = v6.d(this.f46834a);
        boolean z11 = this.f46396y;
        if (z11) {
            i13 = d;
        } else {
            i13 = i16;
        }
        if (!z11) {
            i16 = d;
        }
        d1 d1Var = this.f46392r;
        int measuredHeight = d1Var.getMeasuredHeight();
        a aVar = this.f46834a;
        int i17 = 0;
        if (aVar != null && (i14 = aVar.f46277l) > 0) {
            i17 = AndroidUtilities.dp(e2.c.e(i14, 1, 16, 10));
        }
        int i18 = i15 - i16;
        int i19 = measuredHeight + i17;
        d1Var.layout(AndroidUtilities.dp(16.0f) + i13, i17, org.telegram.messenger.l0.b(16.0f, i18, AndroidUtilities.dp(16.0f) + i13), i19);
        int dp = AndroidUtilities.dp(9.0f) + i19;
        org.telegram.ui.h2 h2Var = this.f46393s;
        h2Var.layout(i13, dp, i18, h2Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int dp;
        int i12;
        int size = View.MeasureSpec.getSize(i9);
        int i13 = 0;
        int max = Math.max(0, (size - this.f46836c) - v6.d(this.f46834a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        d1 d1Var = this.f46392r;
        d1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = d1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        org.telegram.ui.h2 h2Var = this.f46393s;
        h2Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f46834a;
        if (aVar == null || (i11 = aVar.f46277l) <= 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(e2.c.e(i11, 1, 16, 10));
        }
        a aVar2 = this.f46834a;
        if (aVar2 != null && (i12 = aVar2.f46278m) > 0) {
            i13 = AndroidUtilities.dp(e2.c.e(i12, 1, 16, 10));
        }
        setMeasuredDimension(size, h2Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i13 + dp + measuredHeight);
    }

    public final int p(int i9, int i10) {
        int b10;
        if (this.B != null) {
            org.telegram.ui.h2 h2Var = this.f46393s;
            int left = i9 - h2Var.getLeft();
            e5 e5Var = this.f46394w;
            int left2 = left - e5Var.getLeft();
            h5 h5Var = this.v;
            int scrollX = h2Var.getScrollX() + (left2 - h5Var.getLeft());
            int top = ((i10 - h2Var.getTop()) - e5Var.getTop()) - h5Var.getTop();
            if (h5Var.f46426a != null && scrollX >= (h5Var.f46429e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) && scrollX < h5Var.f46429e[0]) {
                int i11 = 1;
                if (h5Var.v()) {
                    int k10 = h5Var.k();
                    int r10 = h5Var.r();
                    if (k10 >= 0) {
                        int[] iArr = h5Var.f46430f;
                        if (top >= iArr[k10] && top < iArr[r10 + 1]) {
                            return k10;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a2 = h5Var.a();
                if (a2 != null && (b10 = h5Var.f46426a.b(a2)) >= 0) {
                    int i12 = a2.rowspan;
                    if (i12 != 0) {
                        i11 = i12;
                    }
                    int[] iArr2 = h5Var.f46430f;
                    int i13 = iArr2[b10];
                    int i14 = iArr2[Math.min(i11 + b10, h5Var.f46426a.f46779b)];
                    if (top >= i13 && top < i14) {
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

    public final void q(int i9, int i10) {
        int i11;
        w5 w5Var = this.B;
        if (w5Var != null && (i11 = w5Var.f46779b) != 0 && w5Var.f46780c != 0) {
            TL_iv.pageTableCell pagetablecell = this.B.d[Math.max(0, Math.min(i9, i11 - 1))][Math.max(0, Math.min(i10, this.B.f46780c - 1))];
            if (pagetablecell != null) {
                post(new ai1(27, this, pagetablecell));
            }
        }
    }

    public final boolean r() {
        w5 w5Var = this.B;
        if (w5Var == null || w5Var.f46783g.isEmpty()) {
            return false;
        }
        i5 m10 = this.v.m((TL_iv.pageTableCell) this.B.f46783g.get(0));
        if (m10 == null) {
            return false;
        }
        d1 d1Var = m10.f46448a;
        d1Var.r();
        d1Var.setSelection(0);
        return true;
    }

    public final boolean s(i5 i5Var, boolean z10) {
        int indexOf;
        int i9;
        w5 w5Var = this.B;
        if (w5Var != null && (indexOf = w5Var.f46783g.indexOf(i5Var.f46449b)) >= 0) {
            if (z10) {
                i9 = indexOf - 1;
            } else {
                i9 = indexOf + 1;
            }
            if (i9 >= 0 && i9 < this.B.f46783g.size()) {
                i5 m10 = this.v.m((TL_iv.pageTableCell) this.B.f46783g.get(i9));
                if (m10 != null) {
                    d1 d1Var = m10.f46448a;
                    d1Var.r();
                    d1Var.setSelection(d1Var.length());
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void setCellSelectionListener(c5 c5Var) {
        this.E = c5Var;
    }

    public void setLocked(boolean z10) {
        this.f46392r.setLocked(z10);
        int i9 = 0;
        while (true) {
            h5 h5Var = this.v;
            if (i9 < h5Var.getChildCount()) {
                View childAt = h5Var.getChildAt(i9);
                if (childAt instanceof i5) {
                    ((i5) childAt).setLocked(z10);
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final void t() {
        x();
        c5 c5Var = this.E;
        if (c5Var != null) {
            o3 o3Var = ((m2) c5Var).f46522a;
            if (this == o3Var.f46568e4) {
                if (this.D.isEmpty()) {
                    o3Var.M2();
                } else if (!o3Var.f46596x3) {
                    o3Var.F4(this);
                }
            }
        }
    }

    public final void u() {
        a aVar = this.f46834a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f46269b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = u5.f(this.f46392r.getText());
            }
        }
    }

    public final void v() {
        h5 h5Var = this.v;
        h5Var.s();
        h5Var.requestLayout();
        h5Var.invalidate();
        y();
        v2 v2Var = this.A;
        if (v2Var != null && this.f46834a != null) {
            v2Var.a();
        }
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i9;
        w5 w5Var = this.B;
        if (w5Var != null && pagetablecell != null) {
            int b10 = w5Var.b(pagetablecell);
            int a2 = this.B.a(pagetablecell);
            int b11 = this.B.b(pagetablecell2);
            int a3 = this.B.a(pagetablecell2);
            if (b10 >= 0 && a2 >= 0 && b11 >= 0 && a3 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a2, a3);
                int i10 = this.B.f46779b - 1;
                int i11 = pagetablecell.rowspan;
                if (i11 == 0) {
                    i11 = 1;
                }
                int i12 = (b10 + i11) - 1;
                int i13 = pagetablecell2.rowspan;
                if (i13 == 0) {
                    i13 = 1;
                }
                int min3 = Math.min(i10, Math.max(i12, (b11 + i13) - 1));
                int i14 = this.B.f46780c - 1;
                int i15 = pagetablecell.colspan;
                if (i15 == 0) {
                    i15 = 1;
                }
                int i16 = (a2 + i15) - 1;
                int i17 = pagetablecell2.colspan;
                if (i17 == 0) {
                    i17 = 1;
                }
                int min4 = Math.min(i14, Math.max(i16, (a3 + i17) - 1));
                while (true) {
                    boolean z10 = false;
                    i9 = min;
                    while (min <= min3) {
                        int i18 = min2;
                        while (min2 <= min4) {
                            w5 w5Var2 = this.B;
                            TL_iv.pageTableCell pagetablecell3 = w5Var2.d[min][min2];
                            int i19 = w5Var2.f46781e[min][min2];
                            int i20 = w5Var2.f46782f[min][min2];
                            int min5 = Math.min(w5Var2.f46779b - 1, (w5.o(pagetablecell3) + i19) - 1);
                            int i21 = this.B.f46780c - 1;
                            int i22 = pagetablecell3.colspan;
                            if (i22 == 0) {
                                i22 = 1;
                            }
                            int min6 = Math.min(i21, (i22 + i20) - 1);
                            if (i19 < i9) {
                                i9 = i19;
                                z10 = true;
                            }
                            if (i20 < i18) {
                                i18 = i20;
                                z10 = true;
                            }
                            if (min5 > min3) {
                                min3 = min5;
                                z10 = true;
                            }
                            if (min6 > min4) {
                                min4 = min6;
                                z10 = true;
                            }
                            min2++;
                        }
                        min++;
                        min2 = i18;
                    }
                    if (!z10) {
                        break;
                    }
                    min = i9;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (i9 <= min3) {
                    for (int i23 = min2; i23 <= min4; i23++) {
                        linkedHashSet.add(this.B.d[i9][i23]);
                    }
                    i9++;
                }
                LinkedHashSet linkedHashSet2 = this.D;
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
        if (this.D.isEmpty() && !this.v.hasFocus()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(1.0f);
        }
        setTranslationZ(dp);
        invalidate();
        this.f46393s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }

    public final void y() {
        int i9 = 0;
        while (true) {
            h5 h5Var = this.v;
            if (i9 < h5Var.getChildCount()) {
                View childAt = h5Var.getChildAt(i9);
                if (childAt instanceof i5) {
                    i5 i5Var = (i5) childAt;
                    d1 d1Var = i5Var.f46448a;
                    d1Var.setListener(new z4(this, i5Var));
                    d1Var.setDelegate(new ei1(10, this, i5Var));
                }
                i9++;
            } else {
                return;
            }
        }
    }
}
