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
public final class w2 extends FrameLayout implements org.telegram.ui.Components.g01, org.telegram.ui.Cells.n9 {
    public final z70 f41133a;
    public final i4 f41134b;
    public final v2 f41135c;
    public d3 d;
    public final org.telegram.ui.Components.h01 e;
    public int f41136f;
    public int h;
    public int f41137n;
    public boolean f41138r;
    public TL_iv.pageBlockTable f41139s;
    public final androidx.emoji2.text.n v;

    public w2(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.v = new androidx.emoji2.text.n(this);
        this.f41133a = z70Var;
        this.f41134b = i4Var;
        v2 v2Var = new v2(this, context, z70Var);
        this.f41135c = v2Var;
        float f7 = 18;
        v2Var.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        v2Var.setClipToPadding(false);
        addView(v2Var, w7.a6.d(-2.0f, -1));
        org.telegram.ui.Components.h01 h01Var = new org.telegram.ui.Components.h01(context, this, ((k4) z70Var).O0);
        this.e = h01Var;
        h01Var.setOrientation(0);
        h01Var.setRowOrderPreserved(true);
        v2Var.addView(h01Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10;
        if (this.d == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        org.telegram.ui.Components.h01 h01Var = this.e;
        int childCount = h01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.a01 d = h01Var.d(i11);
            org.telegram.ui.Components.zz0 zz0Var = d.f23369b;
            if (zz0Var != null) {
                zz0Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f41136f)) - this.f41135c.getScrollX());
                d.f23369b.setY(d.c() + this.h);
                d.f23369b.setRow(d.f23374j + 10);
                d.f23382r = i10;
                i10++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.zz0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
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
        return k4.p(this.f41133a, this, null, pagetablecell.text, i10, -1, this.f41139s, alignment2, 0, this.f41134b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f41133a.getClass();
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
        org.telegram.ui.Components.h01 h01Var = this.e;
        int childCount = h01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.zz0 zz0Var = h01Var.d(i10).f23369b;
            if (zz0Var != null) {
                arrayList.add(zz0Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return k4.f37530t1;
    }

    @Override
    public Paint getHeaderPaint() {
        return k4.f37531u1;
    }

    @Override
    public Paint getLinePaint() {
        return k4.f37529s1;
    }

    @Override
    public Paint getStripPaint() {
        return k4.f37532v1;
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
        org.telegram.ui.Components.h01 h01Var = this.e;
        int childCount = h01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.zz0 zz0Var = h01Var.d(i10).f23369b;
            if (zz0Var != null) {
                zz0Var.attach(this);
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
        org.telegram.ui.Components.h01 h01Var = this.e;
        int childCount = h01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.zz0 zz0Var = h01Var.d(i10).f23369b;
            if (zz0Var != null) {
                zz0Var.detach(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41139s == null) {
            return;
        }
        d3 d3Var = this.d;
        z70 z70Var = this.f41133a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.f41137n, 0);
            k4.v(z70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        k4.u(canvas, z70Var, this.f41139s, getMeasuredHeight());
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
        int i14 = this.f41136f;
        int i15 = this.h;
        v2 v2Var = this.f41135c;
        v2Var.layout(i14, i15, v2Var.getMeasuredWidth() + i14, v2Var.getMeasuredHeight() + this.h);
        if (this.f41138r) {
            i4 i4Var = this.f41134b;
            if (i4Var != null && i4Var.G) {
                v2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.e.getMeasuredWidth() - v2Var.getMeasuredWidth()));
            } else {
                v2Var.setScrollX(0);
            }
            this.f41138r = false;
        }
    }

    @Override
    public final void onLayoutChild(org.telegram.ui.Components.zz0 zz0Var, int i10, int i11) {
        if (zz0Var instanceof d3) {
            z70 z70Var = this.f41133a;
            if (!z70Var.E.isEmpty() && z70Var.F != null) {
                d3 d3Var = (d3) zz0Var;
                String lowerCase = d3Var.d.getText().toString().toLowerCase();
                int i12 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(z70Var.F, i12);
                    if (indexOf >= 0) {
                        int length = z70Var.F.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = d3Var.d;
                            this.f41134b.f37028y.put(z70Var.F + this.f41139s + d3Var.f35131r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i11));
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
        TL_iv.pageBlockTable pageblocktable = this.f41139s;
        if (pageblocktable != null) {
            int i14 = pageblocktable.level;
            z70 z70Var = this.f41133a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f41136f = dp2;
                z70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.f41137n = dp3;
                dp = size - dp3;
            } else {
                this.f41136f = 0;
                z70Var.getClass();
                this.f41137n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.f41139s;
            d3 p5 = k4.p(this.f41133a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f41134b);
            this.d = p5;
            if (p5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p5.d.getHeight();
                this.h = i13;
                d3 d3Var = this.d;
                d3Var.f35132s = this.f41137n;
                d3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f41136f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            v2 v2Var = this.f41135c;
            v2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.yh.c(8.0f, v2Var.getMeasuredHeight(), i13);
            TL_iv.pageBlockTable pageblocktable3 = this.f41139s;
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
        org.telegram.ui.Components.h01 h01Var = this.e;
        int childCount = h01Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.a01 d = h01Var.d(i10);
            org.telegram.ui.Components.zz0 zz0Var = d.f23369b;
            if (zz0Var instanceof d3) {
                d3 d3Var = (d3) zz0Var;
                v2 v2Var = this.f41135c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (k4.l(this.f41133a, this.f41134b, motionEvent3, this, d3Var, d.b() + (v2Var.getPaddingLeft() - v2Var.getScrollX()) + this.f41136f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!k4.l(this.f41133a, this.f41134b, motionEvent4, this, this.d, this.f41137n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        int i10;
        this.f41139s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.g6.f19901d6;
        ((k4) this.f41133a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f41135c, org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        org.telegram.ui.Components.h01 h01Var = this.e;
        h01Var.P.clear();
        h01Var.K.clear();
        h01Var.h();
        h01Var.setDrawLines(this.f41139s.bordered);
        h01Var.setStriped(this.f41139s.striped);
        i4 i4Var = this.f41134b;
        if (i4Var != null && i4Var.G) {
            z10 = true;
        } else {
            z10 = false;
        }
        h01Var.setRtl(z10);
        if (!this.f41139s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f41139s.rows.get(0);
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
        int size2 = this.f41139s.rows.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TL_iv.pageTableRow pagetablerow2 = this.f41139s.rows.get(i14);
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
                    h01Var.b(pagetablecell, i15, i14, i17);
                } else {
                    h01Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        h01Var.setColumnCount(i10);
        this.f41138r = true;
        requestLayout();
    }
}
