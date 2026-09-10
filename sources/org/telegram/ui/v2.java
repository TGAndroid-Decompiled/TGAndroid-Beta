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
public final class v2 extends FrameLayout implements org.telegram.ui.Components.vz0, org.telegram.ui.Cells.r9 {
    public final t70 f37390a;
    public final h4 f37391b;
    public final u2 f37392c;
    public c3 d;
    public final org.telegram.ui.Components.wz0 e;
    public int f37393f;
    public int h;
    public int f37394n;
    public boolean f37395r;
    public TL_iv.pageBlockTable f37396s;
    public final androidx.emoji2.text.n v;

    public v2(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.v = new androidx.emoji2.text.n(this);
        this.f37390a = t70Var;
        this.f37391b = h4Var;
        u2 u2Var = new u2(this, context, t70Var);
        this.f37392c = u2Var;
        float f7 = 18;
        u2Var.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        u2Var.setClipToPadding(false);
        addView(u2Var, w7.a6.c(-2.0f, -1));
        org.telegram.ui.Components.wz0 wz0Var = new org.telegram.ui.Components.wz0(context, this, ((j4) t70Var).O0);
        this.e = wz0Var;
        wz0Var.setOrientation(0);
        wz0Var.setRowOrderPreserved(true);
        u2Var.addView(wz0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10;
        if (this.d == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        org.telegram.ui.Components.wz0 wz0Var = this.e;
        int childCount = wz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.pz0 d = wz0Var.d(i11);
            org.telegram.ui.Components.oz0 oz0Var = d.f26275b;
            if (oz0Var != null) {
                oz0Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f37393f)) - this.f37392c.getScrollX());
                d.f26275b.setY(d.c() + this.h);
                d.f26275b.setRow(d.f26280j + 10);
                d.f26288r = i10;
                i10++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.oz0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
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
        return j4.p(this.f37390a, this, null, pagetablecell.text, i10, -1, this.f37396s, alignment2, 0, this.f37391b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f37390a.getClass();
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
        org.telegram.ui.Components.wz0 wz0Var = this.e;
        int childCount = wz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.oz0 oz0Var = wz0Var.d(i10).f26275b;
            if (oz0Var != null) {
                arrayList.add(oz0Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return j4.f33893t1;
    }

    @Override
    public Paint getHeaderPaint() {
        return j4.f33894u1;
    }

    @Override
    public Paint getLinePaint() {
        return j4.f33892s1;
    }

    @Override
    public Paint getStripPaint() {
        return j4.f33895v1;
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
        org.telegram.ui.Components.wz0 wz0Var = this.e;
        int childCount = wz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.oz0 oz0Var = wz0Var.d(i10).f26275b;
            if (oz0Var != null) {
                oz0Var.attach(this);
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
        org.telegram.ui.Components.wz0 wz0Var = this.e;
        int childCount = wz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.oz0 oz0Var = wz0Var.d(i10).f26275b;
            if (oz0Var != null) {
                oz0Var.detach(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37396s == null) {
            return;
        }
        c3 c3Var = this.d;
        t70 t70Var = this.f37390a;
        if (c3Var != null) {
            canvas.save();
            canvas.translate(this.f37394n, 0);
            j4.v(t70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        j4.u(canvas, t70Var, this.f37396s, getMeasuredHeight());
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
        int i14 = this.f37393f;
        int i15 = this.h;
        u2 u2Var = this.f37392c;
        u2Var.layout(i14, i15, u2Var.getMeasuredWidth() + i14, u2Var.getMeasuredHeight() + this.h);
        if (this.f37395r) {
            h4 h4Var = this.f37391b;
            if (h4Var != null && h4Var.G) {
                u2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.e.getMeasuredWidth() - u2Var.getMeasuredWidth()));
            } else {
                u2Var.setScrollX(0);
            }
            this.f37395r = false;
        }
    }

    @Override
    public final void onLayoutChild(org.telegram.ui.Components.oz0 oz0Var, int i10, int i11) {
        if (oz0Var instanceof c3) {
            t70 t70Var = this.f37390a;
            if (!t70Var.E.isEmpty() && t70Var.F != null) {
                c3 c3Var = (c3) oz0Var;
                String lowerCase = c3Var.d.getText().toString().toLowerCase();
                int i12 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(t70Var.F, i12);
                    if (indexOf >= 0) {
                        int length = t70Var.F.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = c3Var.d;
                            this.f37391b.f33267y.put(t70Var.F + this.f37396s + c3Var.f31514r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i11));
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
        TL_iv.pageBlockTable pageblocktable = this.f37396s;
        if (pageblocktable != null) {
            int i14 = pageblocktable.level;
            t70 t70Var = this.f37390a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f37393f = dp2;
                t70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.f37394n = dp3;
                dp = size - dp3;
            } else {
                this.f37393f = 0;
                t70Var.getClass();
                this.f37394n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.f37396s;
            c3 p5 = j4.p(this.f37390a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f37391b);
            this.d = p5;
            if (p5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p5.d.getHeight();
                this.h = i13;
                c3 c3Var = this.d;
                c3Var.f31515s = this.f37394n;
                c3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f37393f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            u2 u2Var = this.f37392c;
            u2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.a2.C(8.0f, u2Var.getMeasuredHeight(), i13);
            TL_iv.pageBlockTable pageblocktable3 = this.f37396s;
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
        org.telegram.ui.Components.wz0 wz0Var = this.e;
        int childCount = wz0Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.pz0 d = wz0Var.d(i10);
            org.telegram.ui.Components.oz0 oz0Var = d.f26275b;
            if (oz0Var instanceof c3) {
                c3 c3Var = (c3) oz0Var;
                u2 u2Var = this.f37392c;
                int b10 = d.b() + (u2Var.getPaddingLeft() - u2Var.getScrollX()) + this.f37393f;
                int i11 = this.h;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (j4.l(this.f37390a, this.f37391b, motionEvent3, this, c3Var, b10, d.c() + i11)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!j4.l(this.f37390a, this.f37391b, motionEvent4, this, this.d, this.f37394n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        int i10;
        this.f37396s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.j6.f17928d6;
        ((j4) this.f37390a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f37392c, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Components.wz0 wz0Var = this.e;
        wz0Var.P.clear();
        wz0Var.K.clear();
        wz0Var.g();
        wz0Var.setDrawLines(this.f37396s.bordered);
        wz0Var.setStriped(this.f37396s.striped);
        h4 h4Var = this.f37391b;
        if (h4Var != null && h4Var.G) {
            z10 = true;
        } else {
            z10 = false;
        }
        wz0Var.setRtl(z10);
        if (!this.f37396s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f37396s.rows.get(0);
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
        int size2 = this.f37396s.rows.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TL_iv.pageTableRow pagetablerow2 = this.f37396s.rows.get(i14);
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
                    wz0Var.b(pagetablecell, i15, i14, i17);
                } else {
                    wz0Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        wz0Var.setColumnCount(i10);
        this.f37395r = true;
        requestLayout();
    }
}
