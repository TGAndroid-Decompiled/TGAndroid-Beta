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
public final class v2 extends FrameLayout implements org.telegram.ui.Components.h01, org.telegram.ui.Cells.n9 {
    public final f70 f42569a;
    public final i4 f42570b;
    public final u2 f42571c;
    public c3 d;
    public final org.telegram.ui.Components.i01 e;
    public int f42572f;
    public int h;
    public int f42573n;
    public boolean f42574r;
    public TL_iv.pageBlockTable f42575s;
    public final androidx.emoji2.text.n v;

    public v2(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.v = new androidx.emoji2.text.n(this);
        this.f42569a = f70Var;
        this.f42570b = i4Var;
        u2 u2Var = new u2(this, context, f70Var);
        this.f42571c = u2Var;
        float f7 = 18;
        u2Var.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        u2Var.setClipToPadding(false);
        addView(u2Var, w7.z5.c(-2.0f, -1));
        org.telegram.ui.Components.i01 i01Var = new org.telegram.ui.Components.i01(context, this, ((k4) f70Var).P0);
        this.e = i01Var;
        i01Var.setOrientation(0);
        i01Var.setRowOrderPreserved(true);
        u2Var.addView(i01Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10;
        if (this.d == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        org.telegram.ui.Components.i01 i01Var = this.e;
        int childCount = i01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.b01 d = i01Var.d(i11);
            org.telegram.ui.Components.a01 a01Var = d.f24899b;
            if (a01Var != null) {
                a01Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f42572f)) - this.f42571c.getScrollX());
                d.f24899b.setY(d.c() + this.h);
                d.f24899b.setRow(d.f24904j + 10);
                d.f24912r = i10;
                i10++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.a01 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
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
        return k4.p(this.f42569a, this, null, pagetablecell.text, i10, -1, this.f42575s, alignment2, 0, this.f42570b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f42569a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.v);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.d;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        org.telegram.ui.Components.i01 i01Var = this.e;
        int childCount = i01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.a01 a01Var = i01Var.d(i10).f24899b;
            if (a01Var != null) {
                arrayList.add(a01Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return k4.f38778u1;
    }

    @Override
    public Paint getHeaderPaint() {
        return k4.f38779v1;
    }

    @Override
    public Paint getLinePaint() {
        return k4.f38777t1;
    }

    @Override
    public Paint getStripPaint() {
        return k4.f38780w1;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.d;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        org.telegram.ui.Components.i01 i01Var = this.e;
        int childCount = i01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.a01 a01Var = i01Var.d(i10).f24899b;
            if (a01Var != null) {
                a01Var.attach(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.d;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        org.telegram.ui.Components.i01 i01Var = this.e;
        int childCount = i01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.a01 a01Var = i01Var.d(i10).f24899b;
            if (a01Var != null) {
                a01Var.detach(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42575s == null) {
            return;
        }
        c3 c3Var = this.d;
        f70 f70Var = this.f42569a;
        if (c3Var != null) {
            canvas.save();
            canvas.translate(this.f42573n, 0);
            k4.v(f70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        k4.u(canvas, f70Var, this.f42575s, getMeasuredHeight());
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
        int i14 = this.f42572f;
        int i15 = this.h;
        u2 u2Var = this.f42571c;
        u2Var.layout(i14, i15, u2Var.getMeasuredWidth() + i14, u2Var.getMeasuredHeight() + this.h);
        if (this.f42574r) {
            i4 i4Var = this.f42570b;
            if (i4Var != null && i4Var.G) {
                u2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.e.getMeasuredWidth() - u2Var.getMeasuredWidth()));
            } else {
                u2Var.setScrollX(0);
            }
            this.f42574r = false;
        }
    }

    @Override
    public final void onLayoutChild(org.telegram.ui.Components.a01 a01Var, int i10, int i11) {
        if (a01Var instanceof c3) {
            f70 f70Var = this.f42569a;
            if (!f70Var.E.isEmpty() && f70Var.F != null) {
                c3 c3Var = (c3) a01Var;
                String lowerCase = c3Var.d.getText().toString().toLowerCase();
                int i12 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(f70Var.F, i12);
                    if (indexOf >= 0) {
                        int length = f70Var.F.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = c3Var.d;
                            this.f42570b.f38067y.put(f70Var.F + this.f42575s + c3Var.f36232r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i11));
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
        TL_iv.pageBlockTable pageblocktable = this.f42575s;
        if (pageblocktable != null) {
            int i14 = pageblocktable.level;
            f70 f70Var = this.f42569a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f42572f = dp2;
                f70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.f42573n = dp3;
                dp = size - dp3;
            } else {
                this.f42572f = 0;
                f70Var.getClass();
                this.f42573n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.f42575s;
            c3 p5 = k4.p(this.f42569a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f42570b);
            this.d = p5;
            if (p5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p5.d.getHeight();
                this.h = i13;
                c3 c3Var = this.d;
                c3Var.f36233s = this.f42573n;
                c3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f42572f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            u2 u2Var = this.f42571c;
            u2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.v0.C(8.0f, u2Var.getMeasuredHeight(), i13);
            TL_iv.pageBlockTable pageblocktable3 = this.f42575s;
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
        org.telegram.ui.Components.i01 i01Var = this.e;
        int childCount = i01Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.b01 d = i01Var.d(i10);
            org.telegram.ui.Components.a01 a01Var = d.f24899b;
            if (a01Var instanceof c3) {
                c3 c3Var = (c3) a01Var;
                u2 u2Var = this.f42571c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (k4.l(this.f42569a, this.f42570b, motionEvent3, this, c3Var, d.b() + (u2Var.getPaddingLeft() - u2Var.getScrollX()) + this.f42572f, d.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!k4.l(this.f42569a, this.f42570b, motionEvent4, this, this.d, this.f42573n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        int i10;
        this.f42575s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.k6.f21183d6;
        ((k4) this.f42569a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f42571c, org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        org.telegram.ui.Components.i01 i01Var = this.e;
        i01Var.P.clear();
        i01Var.K.clear();
        i01Var.h();
        i01Var.setDrawLines(this.f42575s.bordered);
        i01Var.setStriped(this.f42575s.striped);
        i4 i4Var = this.f42570b;
        if (i4Var != null && i4Var.G) {
            z10 = true;
        } else {
            z10 = false;
        }
        i01Var.setRtl(z10);
        if (!this.f42575s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f42575s.rows.get(0);
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
        int size2 = this.f42575s.rows.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TL_iv.pageTableRow pagetablerow2 = this.f42575s.rows.get(i14);
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
                    i01Var.b(pagetablecell, i15, i14, i17);
                } else {
                    i01Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        i01Var.setColumnCount(i10);
        this.f42574r = true;
        requestLayout();
    }
}
