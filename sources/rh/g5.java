package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import h7.z5;
import h7.z6;
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
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.di1;

public final class g5 extends y implements org.telegram.ui.ActionBar.x5, i9 {
    public w2 A;
    public x5 B;
    public boolean C;
    public final LinkedHashSet D;
    public d5 E;
    public final h F;

    public final c6 f47163n;

    public final d1 f47164r;

    public final org.telegram.ui.i2 f47165s;
    public final i5 v;

    public final f5 f47166w;

    public final ArrayList f47167x;

    public boolean f47168y;

    public g5(Context context, c6 c6Var) {
        super(context);
        this.f47167x = new ArrayList();
        this.D = new LinkedHashSet();
        this.F = new h(this, 3);
        this.f47163n = c6Var;
        setClipChildren(false);
        setClipToPadding(false);
        d1 d1Var = new d1(context, c6Var);
        this.f47164r = d1Var;
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
        d1Var.setListener(new o0.b(this, 18));
        d1Var.setDelegate(new lh.p(this, 27));
        addView(d1Var);
        org.telegram.ui.i2 i2Var = new org.telegram.ui.i2(this, context, 2);
        this.f47165s = i2Var;
        i2Var.setClipChildren(false);
        i2Var.setClipToPadding(false);
        i2Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(i2Var, z5.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        i5 i5Var = new i5(context, c6Var);
        this.v = i5Var;
        f5 f5Var = new f5(this, context);
        this.f47166w = f5Var;
        f5Var.addView(i5Var);
        i2Var.addView(f5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override
    public final void d() {
        d1 d1Var = this.f47164r;
        d1Var.t();
        int iV0 = g6.v0(g6.G6, this.f47163n);
        d1Var.setTextColor(iV0);
        d1Var.setHintTextColor(g6.l1(0.35f, iV0));
        int i10 = 0;
        while (true) {
            i5 i5Var = this.v;
            if (i10 >= i5Var.getChildCount()) {
                i5Var.b();
                return;
            }
            View childAt = i5Var.getChildAt(i10);
            if (childAt instanceof j5) {
                ((j5) childAt).f47226a.t();
            }
            i10++;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.B == null) {
            return;
        }
        w2 w2Var = this.A;
        j9 textSelectionHelper = w2Var != null ? w2Var.f47536a.getTextSelectionHelper() : null;
        if (textSelectionHelper == null) {
            return;
        }
        ArrayList arrayList = this.f47167x;
        arrayList.clear();
        fillTextLayoutBlocks(arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            u9 u9Var = (u9) arrayList.get(i10);
            canvas.save();
            canvas.translate(u9Var.getX(), u9Var.getY());
            textSelectionHelper.a0(canvas, this, i10);
            canvas.restore();
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
        if (this.B == null) {
            return;
        }
        d1 d1Var2 = this.f47164r;
        Layout layout2 = d1Var2.getLayout();
        if (layout2 != null) {
            arrayList.add(new b5(this, layout2, d1Var2.getPaddingLeft() + d1Var2.getLeft(), d1Var2.getPaddingTop() + d1Var2.getTop()));
        }
        int size = this.B.f47593g.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.B.f47593g.get(i10);
            i5 i5Var = this.v;
            j5 j5VarM = i5Var.m(pagetablecell);
            if (j5VarM != null && (layout = (d1Var = j5VarM.f47226a).getLayout()) != null) {
                org.telegram.ui.i2 i2Var = this.f47165s;
                int left = i2Var.getLeft();
                f5 f5Var = this.f47166w;
                arrayList.add(new c5(layout, d1Var.getPaddingLeft() + d1Var.getLeft() + j5VarM.getLeft() + ((i5Var.getLeft() + (f5Var.getLeft() + left)) - i2Var.getScrollX()), d1Var.getPaddingTop() + d1Var.getTop() + j5VarM.getTop() + i5Var.getTop() + f5Var.getTop() + i2Var.getTop(), this.B.b(pagetablecell) + 10, pagetablecell));
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
        return this.f47594a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.D;
    }

    public d1 getTitleEditText() {
        return this.f47164r;
    }

    public final TL_iv.pageTableCell h(int i10) {
        int i11;
        x5 x5Var = this.B;
        if (x5Var == null || i10 <= 0 || (i11 = i10 - 1) >= x5Var.f47593g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.B.f47593g.get(i11);
    }

    public final void i(boolean z10) {
        int iMax;
        int i10;
        int i11;
        if (this.B != null) {
            LinkedHashSet<TL_iv.pageTableCell> linkedHashSet = this.D;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z10) {
                Iterator it = linkedHashSet.iterator();
                iMax = Integer.MAX_VALUE;
                while (it.hasNext()) {
                    iMax = Math.min(iMax, this.B.a((TL_iv.pageTableCell) it.next()));
                }
            } else {
                iMax = 0;
                for (TL_iv.pageTableCell pagetablecell : linkedHashSet) {
                    iMax = Math.max(iMax, x5.n(pagetablecell) + this.B.a(pagetablecell));
                }
            }
            linkedHashSet.clear();
            x5 x5Var = this.B;
            if (x5Var.f47589b == 0 || (i10 = x5Var.f47590c) == 0) {
                TL_iv.pageBlockTable pageblocktable = x5Var.f47588a;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    arrayList.add(x5.f());
                    pageblocktable.rows.add(pagetablerow);
                } else {
                    ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TL_iv.pageTableRow pagetablerow2 = arrayList2.get(i12);
                        i12++;
                        TL_iv.pageTableRow pagetablerow3 = pagetablerow2;
                        if (pagetablerow3.cells == null) {
                            pagetablerow3.cells = new ArrayList<>();
                        }
                        pagetablerow3.cells.add(x5.f());
                    }
                }
                x5Var.i();
            } else {
                int i13 = iMax < 0 ? 0 : iMax;
                if (i13 <= i10) {
                    i10 = i13;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[x5Var.f47589b];
                ArrayList arrayList3 = x5Var.f47593g;
                int size2 = arrayList3.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj = arrayList3.get(i14);
                    i14++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int iB = x5Var.b(pagetablecell2);
                    int iA = x5Var.a(pagetablecell2);
                    int iO = x5.o(pagetablecell2);
                    int i15 = pagetablecell2.colspan;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = iA >= i10 ? iA + 1 : iA;
                    if (iA < i10 && iA + i15 > i10) {
                        i15++;
                        for (int i17 = iB; i17 < iB + iO && i17 < x5Var.f47589b; i17++) {
                            zArr[i17] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{iB, i16, iO, i15});
                }
                int i18 = 0;
                while (true) {
                    i11 = x5Var.f47589b;
                    if (i18 >= i11) {
                        break;
                    }
                    if (!zArr[i18]) {
                        identityHashMap.put(x5.f(), new int[]{i18, i10, 1, 1});
                    }
                    i18++;
                }
                x5Var.j(identityHashMap, i11);
                x5Var.i();
            }
            v();
            q(0, iMax);
            t();
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
        int iMax;
        if (this.B != null) {
            LinkedHashSet<TL_iv.pageTableCell> linkedHashSet = this.D;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z10) {
                Iterator it = linkedHashSet.iterator();
                iMax = Integer.MAX_VALUE;
                while (it.hasNext()) {
                    iMax = Math.min(iMax, this.B.b((TL_iv.pageTableCell) it.next()));
                }
            } else {
                iMax = 0;
                for (TL_iv.pageTableCell pagetablecell : linkedHashSet) {
                    iMax = Math.max(iMax, x5.o(pagetablecell) + this.B.b(pagetablecell));
                }
            }
            linkedHashSet.clear();
            x5 x5Var = this.B;
            int i10 = x5Var.f47589b;
            if (i10 == 0 || x5Var.f47590c == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int iMax2 = Math.max(x5Var.f47590c, 1);
                for (int i11 = 0; i11 < iMax2; i11++) {
                    pagetablerow.cells.add(x5.f());
                }
                x5Var.f47588a.rows.add(pagetablerow);
                x5Var.i();
            } else {
                int i12 = iMax < 0 ? 0 : iMax;
                if (i12 <= i10) {
                    i10 = i12;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[x5Var.f47590c];
                ArrayList arrayList = x5Var.f47593g;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int iB = x5Var.b(pagetablecell2);
                    int iA = x5Var.a(pagetablecell2);
                    int iO = x5.o(pagetablecell2);
                    int i14 = pagetablecell2.colspan;
                    if (i14 == 0) {
                        i14 = 1;
                    }
                    int i15 = iB >= i10 ? iB + 1 : iB;
                    if (iB < i10 && iB + iO > i10) {
                        iO++;
                        for (int i16 = iA; i16 < iA + i14 && i16 < x5Var.f47590c; i16++) {
                            zArr[i16] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{i15, iA, iO, i14});
                }
                for (int i17 = 0; i17 < x5Var.f47590c; i17++) {
                    if (!zArr[i17]) {
                        identityHashMap.put(x5.f(), new int[]{i10, i17, 1, 1});
                    }
                }
                x5Var.j(identityHashMap, x5Var.f47589b + 1);
                x5Var.i();
            }
            v();
            q(iMax, 0);
            t();
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int iIndexOf;
        x5 x5Var = this.B;
        if (x5Var != null && (iIndexOf = x5Var.f47593g.indexOf(pagetablecell)) >= 0) {
            return iIndexOf + 1;
        }
        return -1;
    }

    public final d1 l(int i10) {
        j5 j5VarM;
        if (i10 == 0) {
            return this.f47164r;
        }
        TL_iv.pageTableCell pagetablecellH = h(i10);
        if (pagetablecellH == null || (j5VarM = this.v.m(pagetablecellH)) == null) {
            return null;
        }
        return j5VarM.f47226a;
    }

    public final TL_iv.pageTableCell m(int i10, int i11) {
        if (this.B == null) {
            return null;
        }
        org.telegram.ui.i2 i2Var = this.f47165s;
        int left = i10 - i2Var.getLeft();
        f5 f5Var = this.f47166w;
        int left2 = left - f5Var.getLeft();
        i5 i5Var = this.v;
        int scrollX = i2Var.getScrollX() + (left2 - i5Var.getLeft());
        int top = ((i11 - i2Var.getTop()) - f5Var.getTop()) - i5Var.getTop();
        for (int i12 = 0; i12 < i5Var.getChildCount(); i12++) {
            View childAt = i5Var.getChildAt(i12);
            if (childAt instanceof j5) {
                j5 j5Var = (j5) childAt;
                if (scrollX >= j5Var.getLeft() && scrollX < j5Var.getRight() && top >= j5Var.getTop() && top < j5Var.getBottom()) {
                    return j5Var.f47227b;
                }
            }
        }
        return null;
    }

    public final int n(int i10, int i11) {
        int i12;
        int iA;
        if (this.B == null) {
            return -1;
        }
        org.telegram.ui.i2 i2Var = this.f47165s;
        int left = i10 - i2Var.getLeft();
        f5 f5Var = this.f47166w;
        int left2 = left - f5Var.getLeft();
        i5 i5Var = this.v;
        int scrollX = i2Var.getScrollX() + (left2 - i5Var.getLeft());
        int top = ((i11 - i2Var.getTop()) - f5Var.getTop()) - i5Var.getTop();
        x5 x5Var = i5Var.f47198a;
        if (x5Var == null || top < (i12 = i5Var.f47202f[x5Var.f47589b])) {
            return -1;
        }
        if (top >= AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
            return -1;
        }
        if (i5Var.u()) {
            int iJ = i5Var.j();
            int iQ = i5Var.q();
            if (iJ < 0) {
                return -1;
            }
            int[] iArr = i5Var.f47201e;
            if (scrollX < iArr[iJ] || scrollX >= iArr[iQ + 1]) {
                return -1;
            }
            return iJ;
        }
        TL_iv.pageTableCell pagetablecellA = i5Var.a();
        if (pagetablecellA == null || (iA = i5Var.f47198a.a(pagetablecellA)) < 0) {
            return -1;
        }
        int i13 = pagetablecellA.colspan;
        int i14 = i13 != 0 ? i13 : 1;
        int[] iArr2 = i5Var.f47201e;
        int i15 = iArr2[iA];
        int i16 = iArr2[Math.min(i14 + iA, i5Var.f47198a.f47590c)];
        if (scrollX < i15 || scrollX >= i16) {
            return -1;
        }
        return iA;
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
        int i15 = i12 - i10;
        int i16 = this.f47596c;
        int iD = z6.d(this.f47594a);
        boolean z11 = this.f47168y;
        int i17 = z11 ? iD : i16;
        if (!z11) {
            i16 = iD;
        }
        d1 d1Var = this.f47164r;
        int measuredHeight = d1Var.getMeasuredHeight();
        a aVar = this.f47594a;
        int iDp = 0;
        if (aVar != null && (i14 = aVar.f47036l) > 0) {
            iDp = AndroidUtilities.dp(i0.a.e(i14, 1, 16, 10));
        }
        int i18 = i15 - i16;
        int i19 = measuredHeight + iDp;
        d1Var.layout(AndroidUtilities.dp(16.0f) + i17, iDp, i0.a.d(16.0f, i18, AndroidUtilities.dp(16.0f) + i17), i19);
        int iDp2 = AndroidUtilities.dp(9.0f) + i19;
        org.telegram.ui.i2 i2Var = this.f47165s;
        i2Var.layout(i17, iDp2, i18, i2Var.getMeasuredHeight() + iDp2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int iDp = 0;
        int iMax = Math.max(0, (size - this.f47596c) - z6.d(this.f47594a));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, iMax - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        d1 d1Var = this.f47164r;
        d1Var.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight = d1Var.getMeasuredHeight();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        org.telegram.ui.i2 i2Var = this.f47165s;
        i2Var.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        a aVar = this.f47594a;
        int iDp2 = (aVar != null && (i12 = aVar.f47036l) > 0) ? AndroidUtilities.dp(i0.a.e(i12, 1, 16, 10)) : 0;
        a aVar2 = this.f47594a;
        if (aVar2 != null && (i13 = aVar2.f47037m) > 0) {
            iDp = AndroidUtilities.dp(i0.a.e(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, i2Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + iDp + iDp2 + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int iB;
        if (this.B == null) {
            return -1;
        }
        org.telegram.ui.i2 i2Var = this.f47165s;
        int left = i10 - i2Var.getLeft();
        f5 f5Var = this.f47166w;
        int left2 = left - f5Var.getLeft();
        i5 i5Var = this.v;
        int scrollX = i2Var.getScrollX() + (left2 - i5Var.getLeft());
        int top = ((i11 - i2Var.getTop()) - f5Var.getTop()) - i5Var.getTop();
        if (i5Var.f47198a == null || scrollX < (i5Var.f47201e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) || scrollX >= i5Var.f47201e[0]) {
            return -1;
        }
        if (i5Var.v()) {
            int iK = i5Var.k();
            int iR = i5Var.r();
            if (iK < 0) {
                return -1;
            }
            int[] iArr = i5Var.f47202f;
            if (top < iArr[iK] || top >= iArr[iR + 1]) {
                return -1;
            }
            return iK;
        }
        TL_iv.pageTableCell pagetablecellA = i5Var.a();
        if (pagetablecellA == null || (iB = i5Var.f47198a.b(pagetablecellA)) < 0) {
            return -1;
        }
        int i12 = pagetablecellA.rowspan;
        int i13 = i12 != 0 ? i12 : 1;
        int[] iArr2 = i5Var.f47202f;
        int i14 = iArr2[iB];
        int i15 = iArr2[Math.min(i13 + iB, i5Var.f47198a.f47589b)];
        if (top < i14 || top >= i15) {
            return -1;
        }
        return iB;
    }

    public final void q(int i10, int i11) {
        int i12;
        x5 x5Var = this.B;
        if (x5Var == null || (i12 = x5Var.f47589b) == 0 || x5Var.f47590c == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.B.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.B.f47590c - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new o2(4, this, pagetablecell));
    }

    public final boolean r() {
        x5 x5Var = this.B;
        if (x5Var == null || x5Var.f47593g.isEmpty()) {
            return false;
        }
        j5 j5VarM = this.v.m((TL_iv.pageTableCell) this.B.f47593g.get(0));
        if (j5VarM == null) {
            return false;
        }
        d1 d1Var = j5VarM.f47226a;
        d1Var.r();
        d1Var.setSelection(0);
        return true;
    }

    public final boolean s(j5 j5Var, boolean z10) {
        int iIndexOf;
        x5 x5Var = this.B;
        if (x5Var == null || (iIndexOf = x5Var.f47593g.indexOf(j5Var.f47227b)) < 0) {
            return false;
        }
        int i10 = z10 ? iIndexOf - 1 : iIndexOf + 1;
        if (i10 < 0 || i10 >= this.B.f47593g.size()) {
            return false;
        }
        j5 j5VarM = this.v.m((TL_iv.pageTableCell) this.B.f47593g.get(i10));
        if (j5VarM == null) {
            return false;
        }
        d1 d1Var = j5VarM.f47226a;
        d1Var.r();
        d1Var.setSelection(d1Var.length());
        return true;
    }

    public void setCellSelectionListener(d5 d5Var) {
        this.E = d5Var;
    }

    public void setLocked(boolean z10) {
        this.f47164r.setLocked(z10);
        int i10 = 0;
        while (true) {
            i5 i5Var = this.v;
            if (i10 >= i5Var.getChildCount()) {
                return;
            }
            View childAt = i5Var.getChildAt(i10);
            if (childAt instanceof j5) {
                ((j5) childAt).setLocked(z10);
            }
            i10++;
        }
    }

    public final void t() {
        x();
        d5 d5Var = this.E;
        if (d5Var != null) {
            p3 p3Var = ((m2) d5Var).f47268a;
            if (this != p3Var.f47343e4) {
                return;
            }
            if (this.D.isEmpty()) {
                p3Var.M2();
            } else {
                if (p3Var.f47371x3) {
                    return;
                }
                p3Var.F4(this);
            }
        }
    }

    public final void u() {
        a aVar = this.f47594a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f47028b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = v5.f(this.f47164r.getText());
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
        if (w2Var == null || this.f47594a == null) {
            return;
        }
        w2Var.a();
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        x5 x5Var = this.B;
        if (x5Var == null || pagetablecell == null) {
            return;
        }
        int iB = x5Var.b(pagetablecell);
        int iA = this.B.a(pagetablecell);
        int iB2 = this.B.b(pagetablecell2);
        int iA2 = this.B.a(pagetablecell2);
        if (iB < 0 || iA < 0 || iB2 < 0 || iA2 < 0) {
            return;
        }
        int iMin = Math.min(iB, iB2);
        int iMin2 = Math.min(iA, iA2);
        int i11 = this.B.f47589b - 1;
        int i12 = pagetablecell.rowspan;
        if (i12 == 0) {
            i12 = 1;
        }
        int i13 = (iB + i12) - 1;
        int i14 = pagetablecell2.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        int iMin3 = Math.min(i11, Math.max(i13, (iB2 + i14) - 1));
        int i15 = this.B.f47590c - 1;
        int i16 = pagetablecell.colspan;
        if (i16 == 0) {
            i16 = 1;
        }
        int i17 = (iA + i16) - 1;
        int i18 = pagetablecell2.colspan;
        if (i18 == 0) {
            i18 = 1;
        }
        int iMin4 = Math.min(i15, Math.max(i17, (iA2 + i18) - 1));
        while (true) {
            boolean z10 = false;
            i10 = iMin;
            while (iMin <= iMin3) {
                int i19 = iMin2;
                while (iMin2 <= iMin4) {
                    x5 x5Var2 = this.B;
                    TL_iv.pageTableCell pagetablecell3 = x5Var2.d[iMin][iMin2];
                    int i20 = x5Var2.f47591e[iMin][iMin2];
                    int i21 = x5Var2.f47592f[iMin][iMin2];
                    int iMin5 = Math.min(x5Var2.f47589b - 1, (x5.o(pagetablecell3) + i20) - 1);
                    int i22 = this.B.f47590c - 1;
                    int i23 = pagetablecell3.colspan;
                    if (i23 == 0) {
                        i23 = 1;
                    }
                    int iMin6 = Math.min(i22, (i23 + i21) - 1);
                    if (i20 < i10) {
                        i10 = i20;
                        z10 = true;
                    }
                    if (i21 < i19) {
                        i19 = i21;
                        z10 = true;
                    }
                    if (iMin5 > iMin3) {
                        iMin3 = iMin5;
                        z10 = true;
                    }
                    if (iMin6 > iMin4) {
                        iMin4 = iMin6;
                        z10 = true;
                    }
                    iMin2++;
                }
                iMin++;
                iMin2 = i19;
            }
            if (!z10) {
                break;
            } else {
                iMin = i10;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (i10 <= iMin3) {
            for (int i24 = iMin2; i24 <= iMin4; i24++) {
                linkedHashSet.add(this.B.d[i10][i24]);
            }
            i10++;
        }
        LinkedHashSet linkedHashSet2 = this.D;
        if (linkedHashSet2.equals(linkedHashSet)) {
            return;
        }
        linkedHashSet2.clear();
        linkedHashSet2.addAll(linkedHashSet);
        this.v.invalidate();
        t();
    }

    public final void x() {
        setTranslationZ((!this.D.isEmpty() || this.v.hasFocus()) ? AndroidUtilities.dp(1.0f) : 0.0f);
        invalidate();
        this.f47165s.invalidate();
        Object parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }

    public final void y() {
        int i10 = 0;
        while (true) {
            i5 i5Var = this.v;
            if (i10 >= i5Var.getChildCount()) {
                return;
            }
            View childAt = i5Var.getChildAt(i10);
            if (childAt instanceof j5) {
                j5 j5Var = (j5) childAt;
                d1 d1Var = j5Var.f47226a;
                d1Var.setListener(new a5(this, j5Var));
                d1Var.setDelegate(new di1(11, this, j5Var));
            }
            i10++;
        }
    }
}
