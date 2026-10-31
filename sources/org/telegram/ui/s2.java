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
public final class s2 extends FrameLayout implements org.telegram.ui.Components.oy0, org.telegram.ui.Cells.j9 {
    public final m60 f41346a;
    public final f4 f41347b;
    public final r2 f41348c;
    public z2 d;
    public final org.telegram.ui.Components.py0 e;
    public int f41349f;
    public int h;
    public int f41350n;
    public boolean f41351r;
    public TL_iv.pageBlockTable f41352s;
    public final androidx.emoji2.text.n f41353w;

    public s2(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.f41353w = new androidx.emoji2.text.n(this);
        this.f41346a = m60Var;
        this.f41347b = f4Var;
        r2 r2Var = new r2(this, context, m60Var);
        this.f41348c = r2Var;
        float f7 = 18;
        r2Var.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
        r2Var.setClipToPadding(false);
        addView(r2Var, w7.b6.c(-2.0f, -1));
        org.telegram.ui.Components.py0 py0Var = new org.telegram.ui.Components.py0(context, this, ((h4) m60Var).P0);
        this.e = py0Var;
        py0Var.setOrientation(0);
        py0Var.setRowOrderPreserved(true);
        r2Var.addView(py0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10;
        if (this.d == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        org.telegram.ui.Components.py0 py0Var = this.e;
        int childCount = py0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.iy0 d = py0Var.d(i11);
            org.telegram.ui.Components.hy0 hy0Var = d.f27133b;
            if (hy0Var != null) {
                hy0Var.j((org.telegram.messenger.i0.L(18.0f) + (d.b() + this.f41349f)) - this.f41348c.getScrollX());
                d.f27133b.h(d.c() + this.h);
                d.f27133b.g(d.f27138j + 10);
                d.f27146r = i10;
                i10++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.hy0 c(TL_iv.pageTableCell pagetablecell, int i10) {
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
        return h4.n(this.f41346a, this, null, pagetablecell.text, i10, -1, this.f41352s, alignment2, 0, this.f41347b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f41346a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.f41353w);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void g(org.telegram.ui.Components.hy0 hy0Var, int i10) {
        if (hy0Var instanceof z2) {
            m60 m60Var = this.f41346a;
            if (!m60Var.E.isEmpty() && m60Var.F != null) {
                z2 z2Var = (z2) hy0Var;
                String lowerCase = z2Var.d.getText().toString().toLowerCase();
                int i11 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(m60Var.F, i11);
                    if (indexOf >= 0) {
                        int length = m60Var.F.length() + indexOf;
                        if (indexOf == 0 || org.telegram.messenger.i0.K1(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = z2Var.d;
                            this.f41347b.D.put(m60Var.F + this.f41352s + z2Var.f43989r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i10));
                        }
                        i11 = length;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public Paint getHalfLinePaint() {
        return h4.f37719u1;
    }

    @Override
    public Paint getHeaderPaint() {
        return h4.f37720v1;
    }

    @Override
    public Paint getLinePaint() {
        return h4.f37718t1;
    }

    @Override
    public Paint getStripPaint() {
        return h4.f37721w1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.d;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        org.telegram.ui.Components.py0 py0Var = this.e;
        int childCount = py0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.hy0 hy0Var = py0Var.d(i10).f27133b;
            if (hy0Var != null) {
                arrayList.add(hy0Var);
            }
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.d;
        if (z2Var != null) {
            z2Var.i(this);
        }
        org.telegram.ui.Components.py0 py0Var = this.e;
        int childCount = py0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.hy0 hy0Var = py0Var.d(i10).f27133b;
            if (hy0Var != null) {
                hy0Var.i(this);
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
        org.telegram.ui.Components.py0 py0Var = this.e;
        int childCount = py0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.hy0 hy0Var = py0Var.d(i10).f27133b;
            if (hy0Var != null) {
                hy0Var.f(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41352s == null) {
            return;
        }
        z2 z2Var = this.d;
        m60 m60Var = this.f41346a;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.f41350n, 0);
            h4.t(m60Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
        }
        h4.s(canvas, m60Var, this.f41352s, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131754855, null));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f41349f;
        int i15 = this.h;
        r2 r2Var = this.f41348c;
        r2Var.layout(i14, i15, r2Var.getMeasuredWidth() + i14, r2Var.getMeasuredHeight() + this.h);
        if (this.f41351r) {
            f4 f4Var = this.f41347b;
            if (f4Var != null && f4Var.G) {
                r2Var.setScrollX(org.telegram.messenger.i0.L(36.0f) + (this.e.getMeasuredWidth() - r2Var.getMeasuredWidth()));
            } else {
                r2Var.setScrollX(0);
            }
            this.f41351r = false;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int L;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockTable pageblocktable = this.f41352s;
        if (pageblocktable != null) {
            int i14 = pageblocktable.level;
            m60 m60Var = this.f41346a;
            if (i14 > 0) {
                int L2 = org.telegram.messenger.i0.L(i14 * 14);
                this.f41349f = L2;
                m60Var.getClass();
                int L3 = org.telegram.messenger.i0.L(18) + L2;
                this.f41350n = L3;
                L = size - L3;
            } else {
                this.f41349f = 0;
                m60Var.getClass();
                this.f41350n = org.telegram.messenger.i0.L(18);
                L = size - org.telegram.messenger.i0.L(36);
            }
            int i15 = L;
            TL_iv.pageBlockTable pageblocktable2 = this.f41352s;
            z2 n10 = h4.n(this.f41346a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f41347b);
            this.d = n10;
            if (n10 != null) {
                i13 = org.telegram.messenger.i0.L(8.0f) + n10.d.getHeight();
                this.h = i13;
                z2 z2Var = this.d;
                z2Var.f43990s = this.f41350n;
                z2Var.f43991w = 0;
            } else {
                this.h = org.telegram.messenger.i0.L(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f41349f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            r2 r2Var = this.f41348c;
            r2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.m5.C(8.0f, r2Var.getMeasuredHeight(), i13);
            TL_iv.pageBlockTable pageblocktable3 = this.f41352s;
            if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                i12 += org.telegram.messenger.i0.L(8.0f);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        a();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.Components.py0 py0Var = this.e;
        int childCount = py0Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.iy0 d = py0Var.d(i10);
            org.telegram.ui.Components.hy0 hy0Var = d.f27133b;
            if (hy0Var instanceof z2) {
                z2 z2Var = (z2) hy0Var;
                r2 r2Var = this.f41348c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (h4.j(this.f41346a, this.f41347b, motionEvent3, this, z2Var, d.b() + (r2Var.getPaddingLeft() - r2Var.getScrollX()) + this.f41349f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!h4.j(this.f41346a, this.f41347b, motionEvent4, this, this.d, this.f41350n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        int i10;
        this.f41352s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
        ((h4) this.f41346a).getClass();
        org.telegram.messenger.i0.z3(this.f41348c, org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        org.telegram.ui.Components.py0 py0Var = this.e;
        py0Var.P.clear();
        py0Var.K.clear();
        py0Var.h();
        py0Var.setDrawLines(this.f41352s.bordered);
        py0Var.setStriped(this.f41352s.striped);
        f4 f4Var = this.f41347b;
        if (f4Var != null && f4Var.G) {
            z10 = true;
        } else {
            z10 = false;
        }
        py0Var.setRtl(z10);
        if (!this.f41352s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f41352s.rows.get(0);
            int size = pagetablerow.cells.size();
            i10 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int i13 = pagetablerow.cells.get(i12).colspan;
                if (i13 == 0) {
                    i13 = 1;
                }
                i10 += i13;
            }
        } else {
            i10 = 0;
        }
        int size2 = this.f41352s.rows.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TL_iv.pageTableRow pagetablerow2 = this.f41352s.rows.get(i14);
            int size3 = pagetablerow2.cells.size();
            int i15 = 0;
            for (int i16 = 0; i16 < size3; i16++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i16);
                int i17 = pagetablecell.colspan;
                if (i17 == 0) {
                    i17 = 1;
                }
                int i18 = pagetablecell.rowspan;
                if (i18 == 0) {
                    i18 = 1;
                }
                if (pagetablecell.text != null) {
                    py0Var.b(pagetablecell, i15, i14, i17);
                } else {
                    py0Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        py0Var.setColumnCount(i10);
        this.f41351r = true;
        requestLayout();
    }
}
