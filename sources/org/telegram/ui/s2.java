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
public final class s2 extends FrameLayout implements org.telegram.ui.Components.kx0, org.telegram.ui.Cells.h9 {
    public final o50 f49617a;
    public final e4 f49618b;
    public final r2 f49619c;
    public z2 d;
    public final org.telegram.ui.Components.lx0 f49620e;
    public int f49621f;
    public int h;
    public int f49622n;
    public boolean f49623r;
    public TL_iv.pageBlockTable f49624s;
    public final androidx.emoji2.text.n f49625w;

    public s2(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.f49625w = new androidx.emoji2.text.n(this);
        this.f49617a = o50Var;
        this.f49618b = e4Var;
        r2 r2Var = new r2(this, context, o50Var);
        this.f49619c = r2Var;
        float f10 = 18;
        r2Var.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        r2Var.setClipToPadding(false);
        addView(r2Var, c8.ha.c(-2.0f, -1));
        org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0(context, this, ((g4) o50Var).P0);
        this.f49620e = lx0Var;
        lx0Var.setOrientation(0);
        lx0Var.setRowOrderPreserved(true);
        r2Var.addView(lx0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i7;
        if (this.d == null) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        org.telegram.ui.Components.lx0 lx0Var = this.f49620e;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.ex0 d = lx0Var.d(i10);
            org.telegram.ui.Components.dx0 dx0Var = d.f33347b;
            if (dx0Var != null) {
                dx0Var.j((org.telegram.messenger.g0.L(18.0f) + (d.b() + this.f49621f)) - this.f49619c.getScrollX());
                d.f33347b.h(d.c() + this.h);
                d.f33347b.g(d.f33353j + 10);
                d.f33361r = i7;
                i7++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.dx0 c(TL_iv.pageTableCell pagetablecell, int i7) {
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
        return g4.n(this.f49617a, this, null, pagetablecell.text, i7, -1, this.f49624s, alignment2, 0, this.f49618b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f49617a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.f49625w);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void g(org.telegram.ui.Components.dx0 dx0Var, int i7) {
        if (dx0Var instanceof z2) {
            o50 o50Var = this.f49617a;
            if (!o50Var.E.isEmpty() && o50Var.F != null) {
                z2 z2Var = (z2) dx0Var;
                String lowerCase = z2Var.d.getText().toString().toLowerCase();
                int i10 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(o50Var.F, i10);
                    if (indexOf >= 0) {
                        int length = o50Var.F.length() + indexOf;
                        if (indexOf == 0 || org.telegram.messenger.g0.K1(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = z2Var.d;
                            this.f49618b.D.put(o50Var.F + this.f49624s + z2Var.f52442r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i7));
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
        return g4.f45816u1;
    }

    @Override
    public Paint getHeaderPaint() {
        return g4.f45817v1;
    }

    @Override
    public Paint getLinePaint() {
        return g4.f45815t1;
    }

    @Override
    public Paint getStripPaint() {
        return g4.f45818w1;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f49620e.invalidate();
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.d;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        org.telegram.ui.Components.lx0 lx0Var = this.f49620e;
        int childCount = lx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            org.telegram.ui.Components.dx0 dx0Var = lx0Var.d(i7).f33347b;
            if (dx0Var != null) {
                arrayList.add(dx0Var);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.d;
        if (z2Var != null) {
            z2Var.i(this);
        }
        org.telegram.ui.Components.lx0 lx0Var = this.f49620e;
        int childCount = lx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            org.telegram.ui.Components.dx0 dx0Var = lx0Var.d(i7).f33347b;
            if (dx0Var != null) {
                dx0Var.i(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.d;
        if (z2Var != null) {
            z2Var.f(this);
        }
        org.telegram.ui.Components.lx0 lx0Var = this.f49620e;
        int childCount = lx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            org.telegram.ui.Components.dx0 dx0Var = lx0Var.d(i7).f33347b;
            if (dx0Var != null) {
                dx0Var.f(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f49624s == null) {
            return;
        }
        z2 z2Var = this.d;
        o50 o50Var = this.f49617a;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.f49622n, 0);
            g4.t(o50Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, o50Var, this.f49624s, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.hd.M0(2131754855, null));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = this.f49621f;
        int i14 = this.h;
        r2 r2Var = this.f49619c;
        r2Var.layout(i13, i14, r2Var.getMeasuredWidth() + i13, r2Var.getMeasuredHeight() + this.h);
        if (this.f49623r) {
            e4 e4Var = this.f49618b;
            if (e4Var != null && e4Var.G) {
                r2Var.setScrollX(org.telegram.messenger.g0.L(36.0f) + (this.f49620e.getMeasuredWidth() - r2Var.getMeasuredWidth()));
            } else {
                r2Var.setScrollX(0);
            }
            this.f49623r = false;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockTable pageblocktable = this.f49624s;
        if (pageblocktable != null) {
            int i13 = pageblocktable.level;
            o50 o50Var = this.f49617a;
            if (i13 > 0) {
                int L2 = org.telegram.messenger.g0.L(i13 * 14);
                this.f49621f = L2;
                o50Var.getClass();
                int L3 = org.telegram.messenger.g0.L(18) + L2;
                this.f49622n = L3;
                L = size - L3;
            } else {
                this.f49621f = 0;
                o50Var.getClass();
                this.f49622n = org.telegram.messenger.g0.L(18);
                L = size - org.telegram.messenger.g0.L(36);
            }
            int i14 = L;
            TL_iv.pageBlockTable pageblocktable2 = this.f49624s;
            z2 n10 = g4.n(this.f49617a, this, null, pageblocktable2.title, i14, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f49618b);
            this.d = n10;
            if (n10 != null) {
                i12 = org.telegram.messenger.g0.L(8.0f) + n10.d.getHeight();
                this.h = i12;
                z2 z2Var = this.d;
                z2Var.f52443s = this.f49622n;
                z2Var.f52444w = 0;
            } else {
                this.h = org.telegram.messenger.g0.L(8.0f);
                i12 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f49621f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            r2 r2Var = this.f49619c;
            r2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = org.telegram.messenger.k5.C(8.0f, r2Var.getMeasuredHeight(), i12);
            TL_iv.pageBlockTable pageblocktable3 = this.f49624s;
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
        org.telegram.ui.Components.lx0 lx0Var = this.f49620e;
        int childCount = lx0Var.getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            org.telegram.ui.Components.ex0 d = lx0Var.d(i7);
            org.telegram.ui.Components.dx0 dx0Var = d.f33347b;
            if (dx0Var instanceof z2) {
                z2 z2Var = (z2) dx0Var;
                r2 r2Var = this.f49619c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (g4.j(this.f49617a, this.f49618b, motionEvent3, this, z2Var, d.b() + (r2Var.getPaddingLeft() - r2Var.getScrollX()) + this.f49621f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i7++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!g4.j(this.f49617a, this.f49618b, motionEvent4, this, this.d, this.f49622n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z9;
        int i7;
        this.f49624s = pageblocktable;
        int i10 = org.telegram.ui.ActionBar.k6.f27848d6;
        ((g4) this.f49617a).getClass();
        org.telegram.messenger.g0.A3(this.f49619c, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        org.telegram.ui.Components.lx0 lx0Var = this.f49620e;
        lx0Var.P.clear();
        lx0Var.K.clear();
        lx0Var.h();
        lx0Var.setDrawLines(this.f49624s.bordered);
        lx0Var.setStriped(this.f49624s.striped);
        e4 e4Var = this.f49618b;
        if (e4Var != null && e4Var.G) {
            z9 = true;
        } else {
            z9 = false;
        }
        lx0Var.setRtl(z9);
        if (!this.f49624s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f49624s.rows.get(0);
            int size = pagetablerow.cells.size();
            i7 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = pagetablerow.cells.get(i11).colspan;
                if (i12 == 0) {
                    i12 = 1;
                }
                i7 += i12;
            }
        } else {
            i7 = 0;
        }
        int size2 = this.f49624s.rows.size();
        for (int i13 = 0; i13 < size2; i13++) {
            TL_iv.pageTableRow pagetablerow2 = this.f49624s.rows.get(i13);
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
        lx0Var.setColumnCount(i7);
        this.f49623r = true;
        requestLayout();
    }
}
