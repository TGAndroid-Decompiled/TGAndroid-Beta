package th;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import i7.f6;
import i7.x7;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.fi1;
public final class g5 extends y implements org.telegram.ui.ActionBar.x5, j9 {
    public w2 A;
    public x5 B;
    public boolean C;
    public final LinkedHashSet D;
    public d5 E;
    public final h F;
    public final c6 f48463n;
    public final d1 f48464r;
    public final org.telegram.ui.i2 f48465s;
    public final i5 v;
    public final f5 f48466w;
    public final ArrayList f48467x;
    public boolean f48468y;

    public g5(Context context, c6 c6Var) {
        super(context);
        this.f48467x = new ArrayList();
        this.D = new LinkedHashSet();
        this.F = new h(this, 3);
        this.f48463n = c6Var;
        setClipChildren(false);
        setClipToPadding(false);
        d1 d1Var = new d1(context, c6Var);
        this.f48464r = d1Var;
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
        d1Var.setListener(new org.telegram.ui.Components.n(this, 20));
        d1Var.setDelegate(new sf.f1(this, 10));
        addView(d1Var);
        org.telegram.ui.i2 i2Var = new org.telegram.ui.i2(this, context, 2);
        this.f48465s = i2Var;
        i2Var.setClipChildren(false);
        i2Var.setClipToPadding(false);
        i2Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(i2Var, f6.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        i5 i5Var = new i5(context, c6Var);
        this.v = i5Var;
        f5 f5Var = new f5(this, context);
        this.f48466w = f5Var;
        f5Var.addView(i5Var);
        i2Var.addView(f5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k9 k9Var;
        super.dispatchDraw(canvas);
        if (this.B != null) {
            w2 w2Var = this.A;
            if (w2Var != null) {
                k9Var = w2Var.f48834a.getTextSelectionHelper();
            } else {
                k9Var = null;
            }
            if (k9Var != null) {
                ArrayList arrayList = this.f48467x;
                arrayList.clear();
                fillTextLayoutBlocks(arrayList);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    v9 v9Var = (v9) arrayList.get(i10);
                    canvas.save();
                    canvas.translate(v9Var.getX(), v9Var.getY());
                    k9Var.a0(canvas, this, i10);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void e() {
        d1 d1Var = this.f48464r;
        d1Var.t();
        int v02 = g6.v0(g6.G6, this.f48463n);
        d1Var.setTextColor(v02);
        d1Var.setHintTextColor(g6.l1(0.35f, v02));
        int i10 = 0;
        while (true) {
            i5 i5Var = this.v;
            if (i10 < i5Var.getChildCount()) {
                View childAt = i5Var.getChildAt(i10);
                if (childAt instanceof j5) {
                    ((j5) childAt).f48526a.t();
                }
                i10++;
            } else {
                i5Var.b();
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
        d1 d1Var;
        Layout layout;
        if (this.B != null) {
            d1 d1Var2 = this.f48464r;
            Layout layout2 = d1Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new b5(this, layout2, d1Var2.getPaddingLeft() + d1Var2.getLeft(), d1Var2.getPaddingTop() + d1Var2.getTop()));
            }
            int size = this.B.f48891g.size();
            for (int i10 = 0; i10 < size; i10++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.B.f48891g.get(i10);
                i5 i5Var = this.v;
                j5 m10 = i5Var.m(pagetablecell);
                if (m10 != null && (layout = (d1Var = m10.f48526a).getLayout()) != null) {
                    org.telegram.ui.i2 i2Var = this.f48465s;
                    int left = i2Var.getLeft();
                    f5 f5Var = this.f48466w;
                    int paddingLeft = d1Var.getPaddingLeft() + d1Var.getLeft() + m10.getLeft() + ((i5Var.getLeft() + (f5Var.getLeft() + left)) - i2Var.getScrollX());
                    int top = i2Var.getTop();
                    arrayList.add(new c5(layout, paddingLeft, d1Var.getPaddingTop() + d1Var.getTop() + m10.getTop() + i5Var.getTop() + f5Var.getTop() + top, this.B.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    public i5 getGrid() {
        return this.v;
    }

    public x5 getModel() {
        return this.B;
    }

    public a getRow() {
        return this.f48892a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.D;
    }

    public d1 getTitleEditText() {
        return this.f48464r;
    }

    public final TL_iv.pageTableCell h(int i10) {
        int i11;
        x5 x5Var = this.B;
        if (x5Var == null || i10 <= 0 || i10 - 1 >= x5Var.f48891g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.B.f48891g.get(i11);
    }

    public final void i(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.B != null) {
            LinkedHashSet linkedHashSet = this.D;
            if (!linkedHashSet.isEmpty()) {
                if (z10) {
                    Iterator it = linkedHashSet.iterator();
                    i10 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i10 = Math.min(i10, this.B.a((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i10 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i10 = Math.max(i10, x5.n(pagetablecell) + this.B.a(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                x5 x5Var = this.B;
                if (x5Var.f48887b != 0 && (i11 = x5Var.f48888c) != 0) {
                    if (i10 < 0) {
                        i12 = 0;
                    } else {
                        i12 = i10;
                    }
                    if (i12 <= i11) {
                        i11 = i12;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[x5Var.f48887b];
                    ArrayList arrayList = x5Var.f48891g;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = x5Var.b(pagetablecell2);
                        int a2 = x5Var.a(pagetablecell2);
                        int o10 = x5.o(pagetablecell2);
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
                            for (int i17 = b10; i17 < b10 + o10 && i17 < x5Var.f48887b; i17++) {
                                zArr[i17] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{b10, i14, o10, i16});
                    }
                    int i18 = 0;
                    while (true) {
                        i13 = x5Var.f48887b;
                        if (i18 >= i13) {
                            break;
                        }
                        if (!zArr[i18]) {
                            identityHashMap.put(x5.f(), new int[]{i18, i11, 1, 1});
                        }
                        i18++;
                    }
                    x5Var.j(identityHashMap, i13);
                    x5Var.i();
                } else {
                    TL_iv.pageBlockTable pageblocktable = x5Var.f48886a;
                    if (pageblocktable.rows.isEmpty()) {
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        ArrayList<TL_iv.pageTableCell> arrayList2 = new ArrayList<>();
                        pagetablerow.cells = arrayList2;
                        arrayList2.add(x5.f());
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
                            pagetablerow3.cells.add(x5.f());
                        }
                    }
                    x5Var.i();
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
        i5 i5Var = this.v;
        if (i5Var != null) {
            i5Var.invalidate();
        }
    }

    public final void j(boolean z10) {
        int i10;
        int i11;
        int i12;
        if (this.B != null) {
            LinkedHashSet linkedHashSet = this.D;
            if (!linkedHashSet.isEmpty()) {
                if (z10) {
                    Iterator it = linkedHashSet.iterator();
                    i10 = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        i10 = Math.min(i10, this.B.b((TL_iv.pageTableCell) it.next()));
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    i10 = 0;
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                        i10 = Math.max(i10, x5.o(pagetablecell) + this.B.b(pagetablecell));
                    }
                }
                linkedHashSet.clear();
                x5 x5Var = this.B;
                int i13 = x5Var.f48887b;
                if (i13 != 0 && x5Var.f48888c != 0) {
                    if (i10 < 0) {
                        i11 = 0;
                    } else {
                        i11 = i10;
                    }
                    if (i11 <= i13) {
                        i13 = i11;
                    }
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    boolean[] zArr = new boolean[x5Var.f48888c];
                    ArrayList arrayList = x5Var.f48891g;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                        int b10 = x5Var.b(pagetablecell2);
                        int a2 = x5Var.a(pagetablecell2);
                        int o10 = x5.o(pagetablecell2);
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
                            for (int i16 = a2; i16 < a2 + i15 && i16 < x5Var.f48888c; i16++) {
                                zArr[i16] = true;
                            }
                        }
                        identityHashMap.put(pagetablecell2, new int[]{i12, a2, o10, i15});
                    }
                    for (int i17 = 0; i17 < x5Var.f48888c; i17++) {
                        if (!zArr[i17]) {
                            identityHashMap.put(x5.f(), new int[]{i13, i17, 1, 1});
                        }
                    }
                    x5Var.j(identityHashMap, x5Var.f48887b + 1);
                    x5Var.i();
                } else {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    pagetablerow.cells = new ArrayList<>();
                    int max = Math.max(x5Var.f48888c, 1);
                    for (int i18 = 0; i18 < max; i18++) {
                        pagetablerow.cells.add(x5.f());
                    }
                    x5Var.f48886a.rows.add(pagetablerow);
                    x5Var.i();
                }
                v();
                q(i10, 0);
                t();
            }
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        x5 x5Var = this.B;
        if (x5Var == null || (indexOf = x5Var.f48891g.indexOf(pagetablecell)) < 0) {
            return -1;
        }
        return indexOf + 1;
    }

    public final d1 l(int i10) {
        j5 m10;
        if (i10 == 0) {
            return this.f48464r;
        }
        TL_iv.pageTableCell h = h(i10);
        if (h == null || (m10 = this.v.m(h)) == null) {
            return null;
        }
        return m10.f48526a;
    }

    public final TL_iv.pageTableCell m(int i10, int i11) {
        if (this.B != null) {
            org.telegram.ui.i2 i2Var = this.f48465s;
            int left = i10 - i2Var.getLeft();
            f5 f5Var = this.f48466w;
            int left2 = left - f5Var.getLeft();
            i5 i5Var = this.v;
            int scrollX = i2Var.getScrollX() + (left2 - i5Var.getLeft());
            int top = ((i11 - i2Var.getTop()) - f5Var.getTop()) - i5Var.getTop();
            for (int i12 = 0; i12 < i5Var.getChildCount(); i12++) {
                View childAt = i5Var.getChildAt(i12);
                if (childAt instanceof j5) {
                    j5 j5Var = (j5) childAt;
                    if (scrollX >= j5Var.getLeft() && scrollX < j5Var.getRight() && top >= j5Var.getTop() && top < j5Var.getBottom()) {
                        return j5Var.f48527b;
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
        if (this.B != null) {
            org.telegram.ui.i2 i2Var = this.f48465s;
            int left = i10 - i2Var.getLeft();
            f5 f5Var = this.f48466w;
            int left2 = left - f5Var.getLeft();
            i5 i5Var = this.v;
            int scrollX = i2Var.getScrollX() + (left2 - i5Var.getLeft());
            int top = ((i11 - i2Var.getTop()) - f5Var.getTop()) - i5Var.getTop();
            x5 x5Var = i5Var.f48498a;
            if (x5Var != null && top >= (i12 = i5Var.f48502f[x5Var.f48887b])) {
                if (top < AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
                    int i13 = 1;
                    if (i5Var.u()) {
                        int j10 = i5Var.j();
                        int q6 = i5Var.q();
                        if (j10 >= 0) {
                            int[] iArr = i5Var.f48501e;
                            if (scrollX >= iArr[j10] && scrollX < iArr[q6 + 1]) {
                                return j10;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    TL_iv.pageTableCell a10 = i5Var.a();
                    if (a10 != null && (a2 = i5Var.f48498a.a(a10)) >= 0) {
                        int i14 = a10.colspan;
                        if (i14 != 0) {
                            i13 = i14;
                        }
                        int[] iArr2 = i5Var.f48501e;
                        int i15 = iArr2[a2];
                        int i16 = iArr2[Math.min(i13 + a2, i5Var.f48498a.f48888c)];
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

    public final j5 o(d1 d1Var) {
        for (ViewParent parent = d1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof j5) {
                return (j5) parent;
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = this.f48894c;
        int d = x7.d(this.f48892a);
        boolean z11 = this.f48468y;
        if (z11) {
            i14 = d;
        } else {
            i14 = i17;
        }
        if (!z11) {
            i17 = d;
        }
        d1 d1Var = this.f48464r;
        int measuredHeight = d1Var.getMeasuredHeight();
        a aVar = this.f48892a;
        int i18 = 0;
        if (aVar != null && (i15 = aVar.f48336l) > 0) {
            i18 = AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(i15, 1, 16, 10));
        }
        int i19 = i16 - i17;
        int i20 = measuredHeight + i18;
        d1Var.layout(AndroidUtilities.dp(16.0f) + i14, i18, j7.l1.d(16.0f, i19, AndroidUtilities.dp(16.0f) + i14), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        org.telegram.ui.i2 i2Var = this.f48465s;
        i2Var.layout(i14, dp, i19, i2Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.f48894c) - x7.d(this.f48892a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        d1 d1Var = this.f48464r;
        d1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = d1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        org.telegram.ui.i2 i2Var = this.f48465s;
        i2Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.f48892a;
        if (aVar == null || (i12 = aVar.f48336l) <= 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(i12, 1, 16, 10));
        }
        a aVar2 = this.f48892a;
        if (aVar2 != null && (i13 = aVar2.f48337m) > 0) {
            i14 = AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, i2Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int b10;
        if (this.B != null) {
            org.telegram.ui.i2 i2Var = this.f48465s;
            int left = i10 - i2Var.getLeft();
            f5 f5Var = this.f48466w;
            int left2 = left - f5Var.getLeft();
            i5 i5Var = this.v;
            int scrollX = i2Var.getScrollX() + (left2 - i5Var.getLeft());
            int top = ((i11 - i2Var.getTop()) - f5Var.getTop()) - i5Var.getTop();
            if (i5Var.f48498a != null && scrollX >= (i5Var.f48501e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) && scrollX < i5Var.f48501e[0]) {
                int i12 = 1;
                if (i5Var.v()) {
                    int k9 = i5Var.k();
                    int r6 = i5Var.r();
                    if (k9 >= 0) {
                        int[] iArr = i5Var.f48502f;
                        if (top >= iArr[k9] && top < iArr[r6 + 1]) {
                            return k9;
                        }
                        return -1;
                    }
                    return -1;
                }
                TL_iv.pageTableCell a2 = i5Var.a();
                if (a2 != null && (b10 = i5Var.f48498a.b(a2)) >= 0) {
                    int i13 = a2.rowspan;
                    if (i13 != 0) {
                        i12 = i13;
                    }
                    int[] iArr2 = i5Var.f48502f;
                    int i14 = iArr2[b10];
                    int i15 = iArr2[Math.min(i12 + b10, i5Var.f48498a.f48887b)];
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
        x5 x5Var = this.B;
        if (x5Var != null && (i12 = x5Var.f48887b) != 0 && x5Var.f48888c != 0) {
            TL_iv.pageTableCell pagetablecell = this.B.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.B.f48888c - 1))];
            if (pagetablecell != null) {
                post(new sf.o1(11, this, pagetablecell));
            }
        }
    }

    public final boolean r() {
        x5 x5Var = this.B;
        if (x5Var == null || x5Var.f48891g.isEmpty()) {
            return false;
        }
        j5 m10 = this.v.m((TL_iv.pageTableCell) this.B.f48891g.get(0));
        if (m10 == null) {
            return false;
        }
        d1 d1Var = m10.f48526a;
        d1Var.r();
        d1Var.setSelection(0);
        return true;
    }

    public final boolean s(j5 j5Var, boolean z10) {
        int indexOf;
        int i10;
        x5 x5Var = this.B;
        if (x5Var != null && (indexOf = x5Var.f48891g.indexOf(j5Var.f48527b)) >= 0) {
            if (z10) {
                i10 = indexOf - 1;
            } else {
                i10 = indexOf + 1;
            }
            if (i10 >= 0 && i10 < this.B.f48891g.size()) {
                j5 m10 = this.v.m((TL_iv.pageTableCell) this.B.f48891g.get(i10));
                if (m10 != null) {
                    d1 d1Var = m10.f48526a;
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

    public void setCellSelectionListener(d5 d5Var) {
        this.E = d5Var;
    }

    public void setLocked(boolean z10) {
        this.f48464r.setLocked(z10);
        int i10 = 0;
        while (true) {
            i5 i5Var = this.v;
            if (i10 < i5Var.getChildCount()) {
                View childAt = i5Var.getChildAt(i10);
                if (childAt instanceof j5) {
                    ((j5) childAt).setLocked(z10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void t() {
        x();
        d5 d5Var = this.E;
        if (d5Var != null) {
            p3 p3Var = ((m2) d5Var).f48568a;
            if (this == p3Var.f48641e4) {
                if (this.D.isEmpty()) {
                    p3Var.M2();
                } else if (!p3Var.f48669x3) {
                    p3Var.F4(this);
                }
            }
        }
    }

    public final void u() {
        a aVar = this.f48892a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f48328b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = v5.f(this.f48464r.getText());
            }
        }
    }

    public final void v() {
        i5 i5Var = this.v;
        i5Var.s();
        i5Var.requestLayout();
        i5Var.invalidate();
        y();
        w2 w2Var = this.A;
        if (w2Var != null && this.f48892a != null) {
            w2Var.a();
        }
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        x5 x5Var = this.B;
        if (x5Var != null && pagetablecell != null) {
            int b10 = x5Var.b(pagetablecell);
            int a2 = this.B.a(pagetablecell);
            int b11 = this.B.b(pagetablecell2);
            int a10 = this.B.a(pagetablecell2);
            if (b10 >= 0 && a2 >= 0 && b11 >= 0 && a10 >= 0) {
                int min = Math.min(b10, b11);
                int min2 = Math.min(a2, a10);
                int i11 = this.B.f48887b - 1;
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
                int i15 = this.B.f48888c - 1;
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
                    boolean z10 = false;
                    i10 = min;
                    while (min <= min3) {
                        int i19 = min2;
                        while (min2 <= min4) {
                            x5 x5Var2 = this.B;
                            TL_iv.pageTableCell pagetablecell3 = x5Var2.d[min][min2];
                            int i20 = x5Var2.f48889e[min][min2];
                            int i21 = x5Var2.f48890f[min][min2];
                            int min5 = Math.min(x5Var2.f48887b - 1, (x5.o(pagetablecell3) + i20) - 1);
                            int i22 = this.B.f48888c - 1;
                            int i23 = pagetablecell3.colspan;
                            if (i23 == 0) {
                                i23 = 1;
                            }
                            int min6 = Math.min(i22, (i23 + i21) - 1);
                            if (i20 < i10) {
                                i10 = i20;
                                z10 = true;
                            }
                            if (i21 < i19) {
                                i19 = i21;
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
                        min2 = i19;
                    }
                    if (!z10) {
                        break;
                    }
                    min = i10;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (i10 <= min3) {
                    for (int i24 = min2; i24 <= min4; i24++) {
                        linkedHashSet.add(this.B.d[i10][i24]);
                    }
                    i10++;
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
        this.f48465s.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }

    public final void y() {
        int i10 = 0;
        while (true) {
            i5 i5Var = this.v;
            if (i10 < i5Var.getChildCount()) {
                View childAt = i5Var.getChildAt(i10);
                if (childAt instanceof j5) {
                    j5 j5Var = (j5) childAt;
                    d1 d1Var = j5Var.f48526a;
                    d1Var.setListener(new a5(this, j5Var));
                    d1Var.setDelegate(new fi1(13, this, j5Var));
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
