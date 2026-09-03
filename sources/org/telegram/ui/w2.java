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
public final class w2 extends FrameLayout implements org.telegram.ui.Components.mz0, org.telegram.ui.Cells.l9 {
    public final o70 f42253a;
    public final j4 f42254b;
    public final v2 f42255c;
    public d3 d;
    public final org.telegram.ui.Components.nz0 f42256e;
    public int f42257f;
    public int h;
    public int f42258n;
    public boolean f42259r;
    public TL_iv.pageBlockTable f42260s;
    public final androidx.emoji2.text.n v;

    public w2(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.v = new androidx.emoji2.text.n(this);
        this.f42253a = o70Var;
        this.f42254b = j4Var;
        v2 v2Var = new v2(this, context, o70Var);
        this.f42255c = v2Var;
        float f10 = 18;
        v2Var.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        v2Var.setClipToPadding(false);
        addView(v2Var, k7.c6.c(-2.0f, -1));
        org.telegram.ui.Components.nz0 nz0Var = new org.telegram.ui.Components.nz0(context, this, ((l4) o70Var).L0);
        this.f42256e = nz0Var;
        nz0Var.setOrientation(0);
        nz0Var.setRowOrderPreserved(true);
        v2Var.addView(nz0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10;
        if (this.d == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        org.telegram.ui.Components.nz0 nz0Var = this.f42256e;
        int childCount = nz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.gz0 d = nz0Var.d(i11);
            org.telegram.ui.Components.fz0 fz0Var = d.f27301b;
            if (fz0Var != null) {
                fz0Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f42257f)) - this.f42255c.getScrollX());
                d.f27301b.setY(d.c() + this.h);
                d.f27301b.setRow(d.f27307j + 10);
                d.f27315r = i10;
                i10++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.fz0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
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
        return l4.p(this.f42253a, this, null, pagetablecell.text, i10, -1, this.f42260s, alignment2, 0, this.f42254b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f42253a.getClass();
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
        org.telegram.ui.Components.nz0 nz0Var = this.f42256e;
        int childCount = nz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.fz0 fz0Var = nz0Var.d(i10).f27301b;
            if (fz0Var != null) {
                arrayList.add(fz0Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return l4.f38499q1;
    }

    @Override
    public Paint getHeaderPaint() {
        return l4.f38500r1;
    }

    @Override
    public Paint getLinePaint() {
        return l4.f38498p1;
    }

    @Override
    public Paint getStripPaint() {
        return l4.f38501s1;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f42256e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.d;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        org.telegram.ui.Components.nz0 nz0Var = this.f42256e;
        int childCount = nz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.fz0 fz0Var = nz0Var.d(i10).f27301b;
            if (fz0Var != null) {
                fz0Var.attach(this);
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
        org.telegram.ui.Components.nz0 nz0Var = this.f42256e;
        int childCount = nz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.fz0 fz0Var = nz0Var.d(i10).f27301b;
            if (fz0Var != null) {
                fz0Var.detach(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42260s == null) {
            return;
        }
        d3 d3Var = this.d;
        o70 o70Var = this.f42253a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.f42258n, 0);
            l4.v(o70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, o70Var, this.f42260s, getMeasuredHeight());
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
        int i14 = this.f42257f;
        int i15 = this.h;
        v2 v2Var = this.f42255c;
        v2Var.layout(i14, i15, v2Var.getMeasuredWidth() + i14, v2Var.getMeasuredHeight() + this.h);
        if (this.f42259r) {
            j4 j4Var = this.f42254b;
            if (j4Var != null && j4Var.D) {
                v2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.f42256e.getMeasuredWidth() - v2Var.getMeasuredWidth()));
            } else {
                v2Var.setScrollX(0);
            }
            this.f42259r = false;
        }
    }

    @Override
    public final void onLayoutChild(org.telegram.ui.Components.fz0 fz0Var, int i10, int i11) {
        if (fz0Var instanceof d3) {
            o70 o70Var = this.f42253a;
            if (!o70Var.B.isEmpty() && o70Var.C != null) {
                d3 d3Var = (d3) fz0Var;
                String lowerCase = d3Var.d.getText().toString().toLowerCase();
                int i12 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(o70Var.C, i12);
                    if (indexOf >= 0) {
                        int length = o70Var.C.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = d3Var.d;
                            this.f42254b.f37843y.put(o70Var.C + this.f42260s + d3Var.f35963r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i11));
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
        TL_iv.pageBlockTable pageblocktable = this.f42260s;
        if (pageblocktable != null) {
            int i14 = pageblocktable.level;
            o70 o70Var = this.f42253a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f42257f = dp2;
                o70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.f42258n = dp3;
                dp = size - dp3;
            } else {
                this.f42257f = 0;
                o70Var.getClass();
                this.f42258n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.f42260s;
            d3 p10 = l4.p(this.f42253a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f42254b);
            this.d = p10;
            if (p10 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p10.d.getHeight();
                this.h = i13;
                d3 d3Var = this.d;
                d3Var.f35964s = this.f42258n;
                d3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f42257f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            v2 v2Var = this.f42255c;
            v2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.y3.C(8.0f, v2Var.getMeasuredHeight(), i13);
            TL_iv.pageBlockTable pageblocktable3 = this.f42260s;
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
        org.telegram.ui.Components.nz0 nz0Var = this.f42256e;
        int childCount = nz0Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.gz0 d = nz0Var.d(i10);
            org.telegram.ui.Components.fz0 fz0Var = d.f27301b;
            if (fz0Var instanceof d3) {
                d3 d3Var = (d3) fz0Var;
                v2 v2Var = this.f42255c;
                int b10 = d.b() + (v2Var.getPaddingLeft() - v2Var.getScrollX()) + this.f42257f;
                int i11 = this.h;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (l4.l(this.f42253a, this.f42254b, motionEvent3, this, d3Var, b10, d.c() + i11)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!l4.l(this.f42253a, this.f42254b, motionEvent4, this, this.d, this.f42258n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z4;
        int i10;
        this.f42260s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.k6.f21661d6;
        ((l4) this.f42253a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f42255c, org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        org.telegram.ui.Components.nz0 nz0Var = this.f42256e;
        nz0Var.M.clear();
        nz0Var.H.clear();
        nz0Var.g();
        nz0Var.setDrawLines(this.f42260s.bordered);
        nz0Var.setStriped(this.f42260s.striped);
        j4 j4Var = this.f42254b;
        if (j4Var != null && j4Var.D) {
            z4 = true;
        } else {
            z4 = false;
        }
        nz0Var.setRtl(z4);
        if (!this.f42260s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f42260s.rows.get(0);
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
        int size2 = this.f42260s.rows.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TL_iv.pageTableRow pagetablerow2 = this.f42260s.rows.get(i14);
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
                    nz0Var.b(pagetablecell, i15, i14, i17);
                } else {
                    nz0Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        nz0Var.setColumnCount(i10);
        this.f42259r = true;
        requestLayout();
    }
}
