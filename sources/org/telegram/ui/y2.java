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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class y2 extends FrameLayout implements org.telegram.ui.Components.bz0, org.telegram.ui.Cells.j9 {
    public final d70 f44700a;
    public final k4 f44701b;
    public final x2 f44702c;
    public f3 d;
    public final org.telegram.ui.Components.cz0 f44703e;
    public int f44704f;
    public int h;
    public int f44705n;
    public boolean f44706r;
    public TL_iv.pageBlockTable f44707s;
    public final ab.n v;

    public y2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.v = new ab.n(this);
        this.f44700a = d70Var;
        this.f44701b = k4Var;
        x2 x2Var = new x2(this, context, d70Var);
        this.f44702c = x2Var;
        float f9 = 18;
        x2Var.setPadding(AndroidUtilities.dp(f9), 0, AndroidUtilities.dp(f9), 0);
        x2Var.setClipToPadding(false);
        addView(x2Var, i7.f6.c(-2.0f, -1));
        org.telegram.ui.Components.cz0 cz0Var = new org.telegram.ui.Components.cz0(context, this, ((m4) d70Var).K0);
        this.f44703e = cz0Var;
        cz0Var.setOrientation(0);
        cz0Var.setRowOrderPreserved(true);
        x2Var.addView(cz0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10;
        if (this.d == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        org.telegram.ui.Components.cz0 cz0Var = this.f44703e;
        int childCount = cz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.vy0 d = cz0Var.d(i11);
            org.telegram.ui.Components.uy0 uy0Var = d.f34228b;
            if (uy0Var != null) {
                uy0Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f44704f)) - this.f44702c.getScrollX());
                d.f34228b.setY(d.c() + this.h);
                d.f34228b.setRow(d.f34234j + 10);
                d.f34242r = i10;
                i10++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uy0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
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
        return m4.p(this.f44700a, this, null, pagetablecell.text, i10, -1, this.f44707s, alignment2, 0, this.f44701b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f44700a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.v);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.d;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        org.telegram.ui.Components.cz0 cz0Var = this.f44703e;
        int childCount = cz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.uy0 uy0Var = cz0Var.d(i10).f34228b;
            if (uy0Var != null) {
                arrayList.add(uy0Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return m4.f40380p1;
    }

    @Override
    public Paint getHeaderPaint() {
        return m4.f40381q1;
    }

    @Override
    public Paint getLinePaint() {
        return m4.f40379o1;
    }

    @Override
    public Paint getStripPaint() {
        return m4.f40382r1;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f44703e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.d;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        org.telegram.ui.Components.cz0 cz0Var = this.f44703e;
        int childCount = cz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.uy0 uy0Var = cz0Var.d(i10).f34228b;
            if (uy0Var != null) {
                uy0Var.attach(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.d;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        org.telegram.ui.Components.cz0 cz0Var = this.f44703e;
        int childCount = cz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.uy0 uy0Var = cz0Var.d(i10).f34228b;
            if (uy0Var != null) {
                uy0Var.detach(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f44707s == null) {
            return;
        }
        f3 f3Var = this.d;
        d70 d70Var = this.f44700a;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.f44705n, 0);
            m4.v(d70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.f44707s, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVTable));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f44704f;
        int i15 = this.h;
        x2 x2Var = this.f44702c;
        x2Var.layout(i14, i15, x2Var.getMeasuredWidth() + i14, x2Var.getMeasuredHeight() + this.h);
        if (this.f44706r) {
            k4 k4Var = this.f44701b;
            if (k4Var != null && k4Var.C) {
                x2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.f44703e.getMeasuredWidth() - x2Var.getMeasuredWidth()));
            } else {
                x2Var.setScrollX(0);
            }
            this.f44706r = false;
        }
    }

    @Override
    public final void onLayoutChild(org.telegram.ui.Components.uy0 uy0Var, int i10, int i11) {
        if (uy0Var instanceof f3) {
            d70 d70Var = this.f44700a;
            if (!d70Var.A.isEmpty() && d70Var.B != null) {
                f3 f3Var = (f3) uy0Var;
                String lowerCase = f3Var.d.getText().toString().toLowerCase();
                int i12 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(d70Var.B, i12);
                    if (indexOf >= 0) {
                        int length = d70Var.B.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = f3Var.d;
                            this.f44701b.f39748y.put(d70Var.B + this.f44707s + f3Var.f37973r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i11));
                        }
                        i12 = length;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockTable pageblocktable = this.f44707s;
        if (pageblocktable != null) {
            int i14 = pageblocktable.level;
            d70 d70Var = this.f44700a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f44704f = dp2;
                d70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.f44705n = dp3;
                dp = size - dp3;
            } else {
                this.f44704f = 0;
                d70Var.getClass();
                this.f44705n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.f44707s;
            f3 p10 = m4.p(this.f44700a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f44701b);
            this.d = p10;
            if (p10 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p10.d.getHeight();
                this.h = i13;
                f3 f3Var = this.d;
                f3Var.f37974s = this.f44705n;
                f3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f44704f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            x2 x2Var = this.f44702c;
            x2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.x3.C(8.0f, x2Var.getMeasuredHeight(), i13);
            TL_iv.pageBlockTable pageblocktable3 = this.f44707s;
            if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                i12 += AndroidUtilities.dp(8.0f);
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
        org.telegram.ui.Components.cz0 cz0Var = this.f44703e;
        int childCount = cz0Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.vy0 d = cz0Var.d(i10);
            org.telegram.ui.Components.uy0 uy0Var = d.f34228b;
            if (uy0Var instanceof f3) {
                f3 f3Var = (f3) uy0Var;
                x2 x2Var = this.f44702c;
                int b10 = d.b() + (x2Var.getPaddingLeft() - x2Var.getScrollX()) + this.f44704f;
                int i11 = this.h;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (m4.l(this.f44700a, this.f44701b, motionEvent3, this, f3Var, b10, d.c() + i11)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!m4.l(this.f44700a, this.f44701b, motionEvent4, this, this.d, this.f44705n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        int i10;
        this.f44707s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.g6.f23062d6;
        ((m4) this.f44700a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f44702c, org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        org.telegram.ui.Components.cz0 cz0Var = this.f44703e;
        cz0Var.L.clear();
        cz0Var.G.clear();
        cz0Var.g();
        cz0Var.setDrawLines(this.f44707s.bordered);
        cz0Var.setStriped(this.f44707s.striped);
        k4 k4Var = this.f44701b;
        if (k4Var != null && k4Var.C) {
            z10 = true;
        } else {
            z10 = false;
        }
        cz0Var.setRtl(z10);
        if (!this.f44707s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f44707s.rows.get(0);
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
        int size2 = this.f44707s.rows.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TL_iv.pageTableRow pagetablerow2 = this.f44707s.rows.get(i14);
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
                    cz0Var.b(pagetablecell, i15, i14, i17);
                } else {
                    cz0Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        cz0Var.setColumnCount(i10);
        this.f44706r = true;
        requestLayout();
    }
}
