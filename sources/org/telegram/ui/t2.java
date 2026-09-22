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
public final class t2 extends FrameLayout implements org.telegram.ui.Components.wz0, org.telegram.ui.Cells.q9 {
    public final u70 f37622a;
    public final f4 f37623b;
    public final s2 f37624c;
    public a3 d;
    public final org.telegram.ui.Components.xz0 e;
    public int f37625f;
    public int h;
    public int f37626n;
    public boolean f37627r;
    public TL_iv.pageBlockTable f37628s;
    public final ai.z9 v;

    public t2(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.v = new ai.z9(this);
        this.f37622a = u70Var;
        this.f37623b = f4Var;
        s2 s2Var = new s2(this, context, u70Var);
        this.f37624c = s2Var;
        float f7 = 18;
        s2Var.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        s2Var.setClipToPadding(false);
        addView(s2Var, w7.y5.c(-2.0f, -1));
        org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0(context, this, ((h4) u70Var).O0);
        this.e = xz0Var;
        xz0Var.setOrientation(0);
        xz0Var.setRowOrderPreserved(true);
        s2Var.addView(xz0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10;
        if (this.d == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        org.telegram.ui.Components.xz0 xz0Var = this.e;
        int childCount = xz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.qz0 d = xz0Var.d(i11);
            org.telegram.ui.Components.pz0 pz0Var = d.f27715b;
            if (pz0Var != null) {
                pz0Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f37625f)) - this.f37624c.getScrollX());
                d.f27715b.setY(d.c() + this.h);
                d.f27715b.setRow(d.f27720j + 10);
                d.f27728r = i10;
                i10++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pz0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
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
        return h4.p(this.f37622a, this, null, pagetablecell.text, i10, -1, this.f37628s, alignment2, 0, this.f37623b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f37622a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.v);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.d;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        org.telegram.ui.Components.xz0 xz0Var = this.e;
        int childCount = xz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.pz0 pz0Var = xz0Var.d(i10).f27715b;
            if (pz0Var != null) {
                arrayList.add(pz0Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return h4.f34103t1;
    }

    @Override
    public Paint getHeaderPaint() {
        return h4.f34104u1;
    }

    @Override
    public Paint getLinePaint() {
        return h4.f34102s1;
    }

    @Override
    public Paint getStripPaint() {
        return h4.f34105v1;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        org.telegram.ui.Components.xz0 xz0Var = this.e;
        int childCount = xz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.pz0 pz0Var = xz0Var.d(i10).f27715b;
            if (pz0Var != null) {
                pz0Var.attach(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        org.telegram.ui.Components.xz0 xz0Var = this.e;
        int childCount = xz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.pz0 pz0Var = xz0Var.d(i10).f27715b;
            if (pz0Var != null) {
                pz0Var.detach(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37628s == null) {
            return;
        }
        a3 a3Var = this.d;
        u70 u70Var = this.f37622a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.f37626n, 0);
            h4.v(u70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        h4.u(canvas, u70Var, this.f37628s, getMeasuredHeight());
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
        int i14 = this.f37625f;
        int i15 = this.h;
        s2 s2Var = this.f37624c;
        s2Var.layout(i14, i15, s2Var.getMeasuredWidth() + i14, s2Var.getMeasuredHeight() + this.h);
        if (this.f37627r) {
            f4 f4Var = this.f37623b;
            if (f4Var != null && f4Var.G) {
                s2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.e.getMeasuredWidth() - s2Var.getMeasuredWidth()));
            } else {
                s2Var.setScrollX(0);
            }
            this.f37627r = false;
        }
    }

    @Override
    public final void onLayoutChild(org.telegram.ui.Components.pz0 pz0Var, int i10, int i11) {
        if (pz0Var instanceof a3) {
            u70 u70Var = this.f37622a;
            if (!u70Var.E.isEmpty() && u70Var.F != null) {
                a3 a3Var = (a3) pz0Var;
                String lowerCase = a3Var.d.getText().toString().toLowerCase();
                int i12 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(u70Var.F, i12);
                    if (indexOf >= 0) {
                        int length = u70Var.F.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = a3Var.d;
                            this.f37623b.f33509y.put(u70Var.F + this.f37628s + a3Var.f31995r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i11));
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
        TL_iv.pageBlockTable pageblocktable = this.f37628s;
        if (pageblocktable != null) {
            int i14 = pageblocktable.level;
            u70 u70Var = this.f37622a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f37625f = dp2;
                u70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.f37626n = dp3;
                dp = size - dp3;
            } else {
                this.f37625f = 0;
                u70Var.getClass();
                this.f37626n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.f37628s;
            a3 p5 = h4.p(this.f37622a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f37623b);
            this.d = p5;
            if (p5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p5.d.getHeight();
                this.h = i13;
                a3 a3Var = this.d;
                a3Var.f31996s = this.f37626n;
                a3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f37625f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            s2 s2Var = this.f37624c;
            s2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.l0.C(8.0f, s2Var.getMeasuredHeight(), i13);
            TL_iv.pageBlockTable pageblocktable3 = this.f37628s;
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
        org.telegram.ui.Components.xz0 xz0Var = this.e;
        int childCount = xz0Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.qz0 d = xz0Var.d(i10);
            org.telegram.ui.Components.pz0 pz0Var = d.f27715b;
            if (pz0Var instanceof a3) {
                a3 a3Var = (a3) pz0Var;
                s2 s2Var = this.f37624c;
                int b10 = d.b() + (s2Var.getPaddingLeft() - s2Var.getScrollX()) + this.f37625f;
                int i11 = this.h;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (h4.l(this.f37622a, this.f37623b, motionEvent3, this, a3Var, b10, d.c() + i11)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!h4.l(this.f37622a, this.f37623b, motionEvent4, this, this.d, this.f37626n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        int i10;
        this.f37628s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.j6.f19109d6;
        ((h4) this.f37622a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f37624c, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Components.xz0 xz0Var = this.e;
        xz0Var.P.clear();
        xz0Var.K.clear();
        xz0Var.g();
        xz0Var.setDrawLines(this.f37628s.bordered);
        xz0Var.setStriped(this.f37628s.striped);
        f4 f4Var = this.f37623b;
        if (f4Var != null && f4Var.G) {
            z10 = true;
        } else {
            z10 = false;
        }
        xz0Var.setRtl(z10);
        if (!this.f37628s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f37628s.rows.get(0);
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
        int size2 = this.f37628s.rows.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TL_iv.pageTableRow pagetablerow2 = this.f37628s.rows.get(i14);
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
                    xz0Var.b(pagetablecell, i15, i14, i17);
                } else {
                    xz0Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        xz0Var.setColumnCount(i10);
        this.f37627r = true;
        requestLayout();
    }
}
