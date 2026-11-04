package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class t2 extends FrameLayout implements org.telegram.ui.Components.kx0, org.telegram.ui.Cells.g9 {
    public final i50 f49671a;
    public final g4 f49672b;
    public final s2 f49673c;
    public a3 d;
    public final org.telegram.ui.Components.lx0 f49674e;
    public int f49675f;
    public int h;
    public int f49676n;
    public boolean f49677r;
    public TL_iv.pageBlockTable f49678s;
    public final androidx.emoji2.text.o f49679w;

    public t2(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f49679w = new androidx.emoji2.text.o(this);
        this.f49671a = i50Var;
        this.f49672b = g4Var;
        s2 s2Var = new s2(this, context, i50Var);
        this.f49673c = s2Var;
        float f10 = 18;
        s2Var.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        s2Var.setClipToPadding(false);
        addView(s2Var, b8.mf.c(-2.0f, -1));
        org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0(context, this, ((i4) i50Var).Q0);
        this.f49674e = lx0Var;
        lx0Var.setOrientation(0);
        lx0Var.setRowOrderPreserved(true);
        s2Var.addView(lx0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i3;
        if (this.d == null) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        org.telegram.ui.Components.lx0 lx0Var = this.f49674e;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.ex0 d = lx0Var.d(i10);
            org.telegram.ui.Components.dx0 dx0Var = d.f33501b;
            if (dx0Var != null) {
                dx0Var.j((org.telegram.messenger.g0.L(18.0f) + (d.b() + this.f49675f)) - this.f49673c.getScrollX());
                d.f33501b.h(d.c() + this.h);
                d.f33501b.g(d.f33507j + 10);
                d.f33515r = i3;
                i3++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.dx0 c(TL_iv.pageTableCell pagetablecell, int i3) {
        Layout.Alignment alignment;
        if (pagetablecell == null) {
            return null;
        }
        if (pagetablecell.align_right) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (pagetablecell.align_center) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        Layout.Alignment alignment2 = alignment;
        return i4.n(this.f49671a, this, null, pagetablecell.text, i3, -1, this.f49678s, alignment2, 0, this.f49672b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f49671a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.f49679w);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void g(org.telegram.ui.Components.dx0 dx0Var, int i3) {
        if (dx0Var instanceof a3) {
            i50 i50Var = this.f49671a;
            if (!i50Var.F.isEmpty() && i50Var.G != null) {
                a3 a3Var = (a3) dx0Var;
                String lowerCase = a3Var.d.getText().toString().toLowerCase();
                int i10 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(i50Var.G, i10);
                    if (indexOf >= 0) {
                        int length = i50Var.G.length() + indexOf;
                        if (indexOf == 0 || org.telegram.messenger.g0.K1(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = a3Var.d;
                            this.f49672b.E.put(i50Var.G + this.f49678s + a3Var.f43578r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i3));
                        }
                        i10 = length;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public Paint getHalfLinePaint() {
        return i4.f46072v1;
    }

    @Override
    public Paint getHeaderPaint() {
        return i4.f46073w1;
    }

    @Override
    public Paint getLinePaint() {
        return i4.f46071u1;
    }

    @Override
    public Paint getStripPaint() {
        return i4.f46074x1;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f49674e.invalidate();
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.d;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        org.telegram.ui.Components.lx0 lx0Var = this.f49674e;
        int childCount = lx0Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            org.telegram.ui.Components.dx0 dx0Var = lx0Var.d(i3).f33501b;
            if (dx0Var != null) {
                arrayList.add(dx0Var);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.i(this);
        }
        org.telegram.ui.Components.lx0 lx0Var = this.f49674e;
        int childCount = lx0Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            org.telegram.ui.Components.dx0 dx0Var = lx0Var.d(i3).f33501b;
            if (dx0Var != null) {
                dx0Var.i(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.f(this);
        }
        org.telegram.ui.Components.lx0 lx0Var = this.f49674e;
        int childCount = lx0Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            org.telegram.ui.Components.dx0 dx0Var = lx0Var.d(i3).f33501b;
            if (dx0Var != null) {
                dx0Var.f(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f49678s == null) {
            return;
        }
        a3 a3Var = this.d;
        i50 i50Var = this.f49671a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.f49676n, 0);
            i4.t(i50Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
        }
        i4.s(canvas, i50Var, this.f49678s, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131754855, null));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = this.f49675f;
        int i14 = this.h;
        s2 s2Var = this.f49673c;
        s2Var.layout(i13, i14, s2Var.getMeasuredWidth() + i13, s2Var.getMeasuredHeight() + this.h);
        if (this.f49677r) {
            g4 g4Var = this.f49672b;
            if (g4Var != null && g4Var.H) {
                s2Var.setScrollX(org.telegram.messenger.g0.L(36.0f) + (this.f49674e.getMeasuredWidth() - s2Var.getMeasuredWidth()));
            } else {
                s2Var.setScrollX(0);
            }
            this.f49677r = false;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int L;
        int i12;
        int size = View.MeasureSpec.getSize(i3);
        TL_iv.pageBlockTable pageblocktable = this.f49678s;
        if (pageblocktable != null) {
            int i13 = pageblocktable.level;
            i50 i50Var = this.f49671a;
            if (i13 > 0) {
                int L2 = org.telegram.messenger.g0.L(i13 * 14);
                this.f49675f = L2;
                i50Var.getClass();
                int L3 = org.telegram.messenger.g0.L(18) + L2;
                this.f49676n = L3;
                L = size - L3;
            } else {
                this.f49675f = 0;
                i50Var.getClass();
                this.f49676n = org.telegram.messenger.g0.L(18);
                L = size - org.telegram.messenger.g0.L(36);
            }
            int i14 = L;
            TL_iv.pageBlockTable pageblocktable2 = this.f49678s;
            a3 n4 = i4.n(this.f49671a, this, null, pageblocktable2.title, i14, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f49672b);
            this.d = n4;
            if (n4 != null) {
                i12 = org.telegram.messenger.g0.L(8.0f) + n4.d.getHeight();
                this.h = i12;
                a3 a3Var = this.d;
                a3Var.f43579s = this.f49676n;
                a3Var.f43580w = 0;
            } else {
                this.h = org.telegram.messenger.g0.L(8.0f);
                i12 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f49675f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            s2 s2Var = this.f49673c;
            s2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = org.telegram.messenger.k5.C(8.0f, s2Var.getMeasuredHeight(), i12);
            TL_iv.pageBlockTable pageblocktable3 = this.f49678s;
            if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                i11 += org.telegram.messenger.g0.L(8.0f);
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
        a();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.Components.lx0 lx0Var = this.f49674e;
        int childCount = lx0Var.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            org.telegram.ui.Components.ex0 d = lx0Var.d(i3);
            org.telegram.ui.Components.dx0 dx0Var = d.f33501b;
            if (dx0Var instanceof a3) {
                a3 a3Var = (a3) dx0Var;
                s2 s2Var = this.f49673c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (i4.j(this.f49671a, this.f49672b, motionEvent3, this, a3Var, d.b() + (s2Var.getPaddingLeft() - s2Var.getScrollX()) + this.f49675f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i3++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!i4.j(this.f49671a, this.f49672b, motionEvent4, this, this.d, this.f49676n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        int i3;
        this.f49678s = pageblocktable;
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        ((i4) this.f49671a).getClass();
        org.telegram.messenger.g0.A3(this.f49673c, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        org.telegram.ui.Components.lx0 lx0Var = this.f49674e;
        lx0Var.Q.clear();
        lx0Var.L.clear();
        lx0Var.h();
        lx0Var.setDrawLines(this.f49678s.bordered);
        lx0Var.setStriped(this.f49678s.striped);
        g4 g4Var = this.f49672b;
        if (g4Var != null && g4Var.H) {
            z10 = true;
        } else {
            z10 = false;
        }
        lx0Var.setRtl(z10);
        if (!this.f49678s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f49678s.rows.get(0);
            int size = pagetablerow.cells.size();
            i3 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = pagetablerow.cells.get(i11).colspan;
                if (i12 == 0) {
                    i12 = 1;
                }
                i3 += i12;
            }
        } else {
            i3 = 0;
        }
        int size2 = this.f49678s.rows.size();
        for (int i13 = 0; i13 < size2; i13++) {
            TL_iv.pageTableRow pagetablerow2 = this.f49678s.rows.get(i13);
            int size3 = pagetablerow2.cells.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size3; i15++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i15);
                int i16 = pagetablecell.colspan;
                if (i16 == 0) {
                    i16 = 1;
                }
                int i17 = pagetablecell.rowspan;
                if (i17 == 0) {
                    i17 = 1;
                }
                if (pagetablecell.text != null) {
                    lx0Var.b(pagetablecell, i14, i13, i16);
                } else {
                    lx0Var.a(i14, i13, i16, i17);
                }
                i14 += i16;
            }
        }
        lx0Var.setColumnCount(i3);
        this.f49677r = true;
        requestLayout();
    }
}
