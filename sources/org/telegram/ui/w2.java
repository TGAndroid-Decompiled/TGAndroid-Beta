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
public final class w2 extends FrameLayout implements org.telegram.ui.Components.nz0, org.telegram.ui.Cells.l9 {
    public final o70 f42350a;
    public final j4 f42351b;
    public final v2 f42352c;
    public d3 d;
    public final org.telegram.ui.Components.oz0 f42353e;
    public int f42354f;
    public int h;
    public int f42355n;
    public boolean f42356r;
    public TL_iv.pageBlockTable f42357s;
    public final androidx.emoji2.text.n v;

    public w2(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.v = new androidx.emoji2.text.n(this);
        this.f42350a = o70Var;
        this.f42351b = j4Var;
        v2 v2Var = new v2(this, context, o70Var);
        this.f42352c = v2Var;
        float f10 = 18;
        v2Var.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        v2Var.setClipToPadding(false);
        addView(v2Var, k7.c6.c(-2.0f, -1));
        org.telegram.ui.Components.oz0 oz0Var = new org.telegram.ui.Components.oz0(context, this, ((l4) o70Var).L0);
        this.f42353e = oz0Var;
        oz0Var.setOrientation(0);
        oz0Var.setRowOrderPreserved(true);
        v2Var.addView(oz0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10;
        if (this.d == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        org.telegram.ui.Components.oz0 oz0Var = this.f42353e;
        int childCount = oz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.hz0 d = oz0Var.d(i11);
            org.telegram.ui.Components.gz0 gz0Var = d.f27613b;
            if (gz0Var != null) {
                gz0Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f42354f)) - this.f42352c.getScrollX());
                d.f27613b.setY(d.c() + this.h);
                d.f27613b.setRow(d.f27619j + 10);
                d.f27627r = i10;
                i10++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.gz0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
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
        return l4.p(this.f42350a, this, null, pagetablecell.text, i10, -1, this.f42357s, alignment2, 0, this.f42351b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f42350a.getClass();
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
        org.telegram.ui.Components.oz0 oz0Var = this.f42353e;
        int childCount = oz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.gz0 gz0Var = oz0Var.d(i10).f27613b;
            if (gz0Var != null) {
                arrayList.add(gz0Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return l4.f38594q1;
    }

    @Override
    public Paint getHeaderPaint() {
        return l4.f38595r1;
    }

    @Override
    public Paint getLinePaint() {
        return l4.f38593p1;
    }

    @Override
    public Paint getStripPaint() {
        return l4.f38596s1;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f42353e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.d;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        org.telegram.ui.Components.oz0 oz0Var = this.f42353e;
        int childCount = oz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.gz0 gz0Var = oz0Var.d(i10).f27613b;
            if (gz0Var != null) {
                gz0Var.attach(this);
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
        org.telegram.ui.Components.oz0 oz0Var = this.f42353e;
        int childCount = oz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.gz0 gz0Var = oz0Var.d(i10).f27613b;
            if (gz0Var != null) {
                gz0Var.detach(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42357s == null) {
            return;
        }
        d3 d3Var = this.d;
        o70 o70Var = this.f42350a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.f42355n, 0);
            l4.v(o70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, o70Var, this.f42357s, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVTable));
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = this.f42354f;
        int i15 = this.h;
        v2 v2Var = this.f42352c;
        v2Var.layout(i14, i15, v2Var.getMeasuredWidth() + i14, v2Var.getMeasuredHeight() + this.h);
        if (this.f42356r) {
            j4 j4Var = this.f42351b;
            if (j4Var != null && j4Var.D) {
                v2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.f42353e.getMeasuredWidth() - v2Var.getMeasuredWidth()));
            } else {
                v2Var.setScrollX(0);
            }
            this.f42356r = false;
        }
    }

    @Override
    public final void onLayoutChild(org.telegram.ui.Components.gz0 gz0Var, int i10, int i11) {
        if (gz0Var instanceof d3) {
            o70 o70Var = this.f42350a;
            if (!o70Var.B.isEmpty() && o70Var.C != null) {
                d3 d3Var = (d3) gz0Var;
                String lowerCase = d3Var.d.getText().toString().toLowerCase();
                int i12 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(o70Var.C, i12);
                    if (indexOf >= 0) {
                        int length = o70Var.C.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = d3Var.d;
                            this.f42351b.f38016y.put(o70Var.C + this.f42357s + d3Var.f35985r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i11));
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
        TL_iv.pageBlockTable pageblocktable = this.f42357s;
        if (pageblocktable != null) {
            int i14 = pageblocktable.level;
            o70 o70Var = this.f42350a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f42354f = dp2;
                o70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.f42355n = dp3;
                dp = size - dp3;
            } else {
                this.f42354f = 0;
                o70Var.getClass();
                this.f42355n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.f42357s;
            d3 p10 = l4.p(this.f42350a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f42351b);
            this.d = p10;
            if (p10 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p10.d.getHeight();
                this.h = i13;
                d3 d3Var = this.d;
                d3Var.f35986s = this.f42355n;
                d3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f42354f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            v2 v2Var = this.f42352c;
            v2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.y3.C(8.0f, v2Var.getMeasuredHeight(), i13);
            TL_iv.pageBlockTable pageblocktable3 = this.f42357s;
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
        org.telegram.ui.Components.oz0 oz0Var = this.f42353e;
        int childCount = oz0Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.hz0 d = oz0Var.d(i10);
            org.telegram.ui.Components.gz0 gz0Var = d.f27613b;
            if (gz0Var instanceof d3) {
                d3 d3Var = (d3) gz0Var;
                v2 v2Var = this.f42352c;
                int b10 = d.b() + (v2Var.getPaddingLeft() - v2Var.getScrollX()) + this.f42354f;
                int i11 = this.h;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (l4.l(this.f42350a, this.f42351b, motionEvent3, this, d3Var, b10, d.c() + i11)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!l4.l(this.f42350a, this.f42351b, motionEvent4, this, this.d, this.f42355n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z4;
        int i10;
        this.f42357s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.k6.f21659d6;
        ((l4) this.f42350a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f42352c, org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        org.telegram.ui.Components.oz0 oz0Var = this.f42353e;
        oz0Var.M.clear();
        oz0Var.H.clear();
        oz0Var.g();
        oz0Var.setDrawLines(this.f42357s.bordered);
        oz0Var.setStriped(this.f42357s.striped);
        j4 j4Var = this.f42351b;
        if (j4Var != null && j4Var.D) {
            z4 = true;
        } else {
            z4 = false;
        }
        oz0Var.setRtl(z4);
        if (!this.f42357s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f42357s.rows.get(0);
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
        int size2 = this.f42357s.rows.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TL_iv.pageTableRow pagetablerow2 = this.f42357s.rows.get(i14);
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
                    oz0Var.b(pagetablecell, i15, i14, i17);
                } else {
                    oz0Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        oz0Var.setColumnCount(i10);
        this.f42356r = true;
        requestLayout();
    }
}
