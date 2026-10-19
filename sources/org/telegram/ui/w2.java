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
public final class w2 extends FrameLayout implements org.telegram.ui.Components.d01, org.telegram.ui.Cells.m9 {
    public final b70 f42435a;
    public final j4 f42436b;
    public final v2 f42437c;
    public d3 d;
    public final org.telegram.ui.Components.e01 e;
    public int f42438f;
    public int h;
    public int f42439n;
    public boolean f42440r;
    public TL_iv.pageBlockTable f42441s;
    public final androidx.emoji2.text.n v;

    public w2(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.v = new androidx.emoji2.text.n(this);
        this.f42435a = b70Var;
        this.f42436b = j4Var;
        v2 v2Var = new v2(this, context, b70Var);
        this.f42437c = v2Var;
        float f7 = 18;
        v2Var.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        v2Var.setClipToPadding(false);
        addView(v2Var, w7.z5.c(-2.0f, -1));
        org.telegram.ui.Components.e01 e01Var = new org.telegram.ui.Components.e01(context, this, ((l4) b70Var).O0);
        this.e = e01Var;
        e01Var.setOrientation(0);
        e01Var.setRowOrderPreserved(true);
        v2Var.addView(e01Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10;
        if (this.d == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        org.telegram.ui.Components.e01 e01Var = this.e;
        int childCount = e01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.xz0 d = e01Var.d(i11);
            org.telegram.ui.Components.wz0 wz0Var = d.f32487b;
            if (wz0Var != null) {
                wz0Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f42438f)) - this.f42437c.getScrollX());
                d.f32487b.setY(d.c() + this.h);
                d.f32487b.setRow(d.f32492j + 10);
                d.f32500r = i10;
                i10++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.wz0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
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
        return l4.p(this.f42435a, this, null, pagetablecell.text, i10, -1, this.f42441s, alignment2, 0, this.f42436b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f42435a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.v);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.d;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        org.telegram.ui.Components.e01 e01Var = this.e;
        int childCount = e01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.wz0 wz0Var = e01Var.d(i10).f32487b;
            if (wz0Var != null) {
                arrayList.add(wz0Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return l4.f38747t1;
    }

    @Override
    public Paint getHeaderPaint() {
        return l4.f38748u1;
    }

    @Override
    public Paint getLinePaint() {
        return l4.f38746s1;
    }

    @Override
    public Paint getStripPaint() {
        return l4.f38749v1;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.d;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        org.telegram.ui.Components.e01 e01Var = this.e;
        int childCount = e01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.wz0 wz0Var = e01Var.d(i10).f32487b;
            if (wz0Var != null) {
                wz0Var.attach(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.d;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        org.telegram.ui.Components.e01 e01Var = this.e;
        int childCount = e01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.wz0 wz0Var = e01Var.d(i10).f32487b;
            if (wz0Var != null) {
                wz0Var.detach(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42441s == null) {
            return;
        }
        d3 d3Var = this.d;
        b70 b70Var = this.f42435a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.f42439n, 0);
            l4.v(b70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, b70Var, this.f42441s, getMeasuredHeight());
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
        int i14 = this.f42438f;
        int i15 = this.h;
        v2 v2Var = this.f42437c;
        v2Var.layout(i14, i15, v2Var.getMeasuredWidth() + i14, v2Var.getMeasuredHeight() + this.h);
        if (this.f42440r) {
            j4 j4Var = this.f42436b;
            if (j4Var != null && j4Var.G) {
                v2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.e.getMeasuredWidth() - v2Var.getMeasuredWidth()));
            } else {
                v2Var.setScrollX(0);
            }
            this.f42440r = false;
        }
    }

    @Override
    public final void onLayoutChild(org.telegram.ui.Components.wz0 wz0Var, int i10, int i11) {
        if (wz0Var instanceof d3) {
            b70 b70Var = this.f42435a;
            if (!b70Var.E.isEmpty() && b70Var.F != null) {
                d3 d3Var = (d3) wz0Var;
                String lowerCase = d3Var.d.getText().toString().toLowerCase();
                int i12 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(b70Var.F, i12);
                    if (indexOf >= 0) {
                        int length = b70Var.F.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = d3Var.d;
                            this.f42436b.f38159y.put(b70Var.F + this.f42441s + d3Var.f36262r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i11));
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
        TL_iv.pageBlockTable pageblocktable = this.f42441s;
        if (pageblocktable != null) {
            int i14 = pageblocktable.level;
            b70 b70Var = this.f42435a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f42438f = dp2;
                b70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.f42439n = dp3;
                dp = size - dp3;
            } else {
                this.f42438f = 0;
                b70Var.getClass();
                this.f42439n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.f42441s;
            d3 p5 = l4.p(this.f42435a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f42436b);
            this.d = p5;
            if (p5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p5.d.getHeight();
                this.h = i13;
                d3 d3Var = this.d;
                d3Var.f36263s = this.f42439n;
                d3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f42438f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            v2 v2Var = this.f42437c;
            v2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.g0.C(8.0f, v2Var.getMeasuredHeight(), i13);
            TL_iv.pageBlockTable pageblocktable3 = this.f42441s;
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
        org.telegram.ui.Components.e01 e01Var = this.e;
        int childCount = e01Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.xz0 d = e01Var.d(i10);
            org.telegram.ui.Components.wz0 wz0Var = d.f32487b;
            if (wz0Var instanceof d3) {
                d3 d3Var = (d3) wz0Var;
                v2 v2Var = this.f42437c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (l4.l(this.f42435a, this.f42436b, motionEvent3, this, d3Var, d.b() + (v2Var.getPaddingLeft() - v2Var.getScrollX()) + this.f42438f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!l4.l(this.f42435a, this.f42436b, motionEvent4, this, this.d, this.f42439n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        int i10;
        this.f42441s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.h6.f20989d6;
        ((l4) this.f42435a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f42437c, org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        org.telegram.ui.Components.e01 e01Var = this.e;
        e01Var.P.clear();
        e01Var.K.clear();
        e01Var.h();
        e01Var.setDrawLines(this.f42441s.bordered);
        e01Var.setStriped(this.f42441s.striped);
        j4 j4Var = this.f42436b;
        if (j4Var != null && j4Var.G) {
            z10 = true;
        } else {
            z10 = false;
        }
        e01Var.setRtl(z10);
        if (!this.f42441s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f42441s.rows.get(0);
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
        int size2 = this.f42441s.rows.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TL_iv.pageTableRow pagetablerow2 = this.f42441s.rows.get(i14);
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
                    e01Var.b(pagetablecell, i15, i14, i17);
                } else {
                    e01Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        e01Var.setColumnCount(i10);
        this.f42440r = true;
        requestLayout();
    }
}
