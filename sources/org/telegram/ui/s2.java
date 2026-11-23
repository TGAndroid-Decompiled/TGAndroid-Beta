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
public final class s2 extends FrameLayout implements org.telegram.ui.Components.xx0, org.telegram.ui.Cells.i9 {
    public final p50 f51853a;
    public final e4 f51854b;
    public final r2 f51855c;
    public z2 d;
    public final org.telegram.ui.Components.yx0 f51856e;
    public int f51857f;
    public int h;
    public int f51858n;
    public boolean f51859r;
    public TL_iv.pageBlockTable f51860s;
    public final androidx.emoji2.text.o f51861w;

    public s2(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f51861w = new androidx.emoji2.text.o(this);
        this.f51853a = p50Var;
        this.f51854b = e4Var;
        r2 r2Var = new r2(this, context, p50Var);
        this.f51855c = r2Var;
        float f10 = 18;
        r2Var.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        r2Var.setClipToPadding(false);
        addView(r2Var, c8.na.c(-2.0f, -1));
        org.telegram.ui.Components.yx0 yx0Var = new org.telegram.ui.Components.yx0(context, this, ((g4) p50Var).Q0);
        this.f51856e = yx0Var;
        yx0Var.setOrientation(0);
        yx0Var.setRowOrderPreserved(true);
        r2Var.addView(yx0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i7;
        if (this.d == null) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        org.telegram.ui.Components.yx0 yx0Var = this.f51856e;
        int childCount = yx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.rx0 d = yx0Var.d(i10);
            org.telegram.ui.Components.qx0 qx0Var = d.f39325b;
            if (qx0Var != null) {
                qx0Var.j((org.telegram.messenger.g0.L(18.0f) + (d.b() + this.f51857f)) - this.f51855c.getScrollX());
                d.f39325b.h(d.c() + this.h);
                d.f39325b.g(d.f39331j + 10);
                d.f39339r = i7;
                i7++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.qx0 c(TL_iv.pageTableCell pagetablecell, int i7) {
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
        return g4.n(this.f51853a, this, null, pagetablecell.text, i7, -1, this.f51860s, alignment2, 0, this.f51854b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f51853a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.f51861w);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void g(org.telegram.ui.Components.qx0 qx0Var, int i7) {
        if (qx0Var instanceof z2) {
            p50 p50Var = this.f51853a;
            if (!p50Var.F.isEmpty() && p50Var.G != null) {
                z2 z2Var = (z2) qx0Var;
                String lowerCase = z2Var.d.getText().toString().toLowerCase();
                int i10 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(p50Var.G, i10);
                    if (indexOf >= 0) {
                        int length = p50Var.G.length() + indexOf;
                        if (indexOf == 0 || org.telegram.messenger.g0.K1(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = z2Var.d;
                            this.f51854b.E.put(p50Var.G + this.f51860s + z2Var.f54342r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i7));
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
        return g4.f47892v1;
    }

    @Override
    public Paint getHeaderPaint() {
        return g4.f47893w1;
    }

    @Override
    public Paint getLinePaint() {
        return g4.f47891u1;
    }

    @Override
    public Paint getStripPaint() {
        return g4.f47894x1;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f51856e.invalidate();
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.d;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        org.telegram.ui.Components.yx0 yx0Var = this.f51856e;
        int childCount = yx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            org.telegram.ui.Components.qx0 qx0Var = yx0Var.d(i7).f39325b;
            if (qx0Var != null) {
                arrayList.add(qx0Var);
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
        org.telegram.ui.Components.yx0 yx0Var = this.f51856e;
        int childCount = yx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            org.telegram.ui.Components.qx0 qx0Var = yx0Var.d(i7).f39325b;
            if (qx0Var != null) {
                qx0Var.i(this);
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
        org.telegram.ui.Components.yx0 yx0Var = this.f51856e;
        int childCount = yx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            org.telegram.ui.Components.qx0 qx0Var = yx0Var.d(i7).f39325b;
            if (qx0Var != null) {
                qx0Var.f(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f51860s == null) {
            return;
        }
        z2 z2Var = this.d;
        p50 p50Var = this.f51853a;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.f51858n, 0);
            g4.t(p50Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, p50Var, this.f51860s, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.hd.N0(2131754854, null));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = this.f51857f;
        int i14 = this.h;
        r2 r2Var = this.f51855c;
        r2Var.layout(i13, i14, r2Var.getMeasuredWidth() + i13, r2Var.getMeasuredHeight() + this.h);
        if (this.f51859r) {
            e4 e4Var = this.f51854b;
            if (e4Var != null && e4Var.H) {
                r2Var.setScrollX(org.telegram.messenger.g0.L(36.0f) + (this.f51856e.getMeasuredWidth() - r2Var.getMeasuredWidth()));
            } else {
                r2Var.setScrollX(0);
            }
            this.f51859r = false;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockTable pageblocktable = this.f51860s;
        if (pageblocktable != null) {
            int i13 = pageblocktable.level;
            p50 p50Var = this.f51853a;
            if (i13 > 0) {
                int L2 = org.telegram.messenger.g0.L(i13 * 14);
                this.f51857f = L2;
                p50Var.getClass();
                int L3 = org.telegram.messenger.g0.L(18) + L2;
                this.f51858n = L3;
                L = size - L3;
            } else {
                this.f51857f = 0;
                p50Var.getClass();
                this.f51858n = org.telegram.messenger.g0.L(18);
                L = size - org.telegram.messenger.g0.L(36);
            }
            int i14 = L;
            TL_iv.pageBlockTable pageblocktable2 = this.f51860s;
            z2 n10 = g4.n(this.f51853a, this, null, pageblocktable2.title, i14, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f51854b);
            this.d = n10;
            if (n10 != null) {
                i12 = org.telegram.messenger.g0.L(8.0f) + n10.d.getHeight();
                this.h = i12;
                z2 z2Var = this.d;
                z2Var.f54343s = this.f51858n;
                z2Var.f54344w = 0;
            } else {
                this.h = org.telegram.messenger.g0.L(8.0f);
                i12 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f51857f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            r2 r2Var = this.f51855c;
            r2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = org.telegram.messenger.f3.C(8.0f, r2Var.getMeasuredHeight(), i12);
            TL_iv.pageBlockTable pageblocktable3 = this.f51860s;
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
        org.telegram.ui.Components.yx0 yx0Var = this.f51856e;
        int childCount = yx0Var.getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            org.telegram.ui.Components.rx0 d = yx0Var.d(i7);
            org.telegram.ui.Components.qx0 qx0Var = d.f39325b;
            if (qx0Var instanceof z2) {
                z2 z2Var = (z2) qx0Var;
                r2 r2Var = this.f51855c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (g4.j(this.f51853a, this.f51854b, motionEvent3, this, z2Var, d.b() + (r2Var.getPaddingLeft() - r2Var.getScrollX()) + this.f51857f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i7++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!g4.j(this.f51853a, this.f51854b, motionEvent4, this, this.d, this.f51858n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        int i7;
        this.f51860s = pageblocktable;
        int i10 = org.telegram.ui.ActionBar.m6.f29347d6;
        ((g4) this.f51853a).getClass();
        org.telegram.messenger.g0.y3(this.f51855c, org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        org.telegram.ui.Components.yx0 yx0Var = this.f51856e;
        yx0Var.Q.clear();
        yx0Var.L.clear();
        yx0Var.h();
        yx0Var.setDrawLines(this.f51860s.bordered);
        yx0Var.setStriped(this.f51860s.striped);
        e4 e4Var = this.f51854b;
        if (e4Var != null && e4Var.H) {
            z10 = true;
        } else {
            z10 = false;
        }
        yx0Var.setRtl(z10);
        if (!this.f51860s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f51860s.rows.get(0);
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
        int size2 = this.f51860s.rows.size();
        for (int i13 = 0; i13 < size2; i13++) {
            TL_iv.pageTableRow pagetablerow2 = this.f51860s.rows.get(i13);
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
                    yx0Var.b(pagetablecell, i14, i13, i16);
                } else {
                    yx0Var.a(i14, i13, i16, i17);
                }
                i14 += i16;
            }
        }
        yx0Var.setColumnCount(i7);
        this.f51859r = true;
        requestLayout();
    }
}
