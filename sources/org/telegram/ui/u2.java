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
public final class u2 extends FrameLayout implements org.telegram.ui.Components.tz0, org.telegram.ui.Cells.p9 {
    public final p70 f38290a;
    public final g4 f38291b;
    public final t2 f38292c;
    public b3 d;
    public final org.telegram.ui.Components.uz0 e;
    public int f38293f;
    public int h;
    public int f38294n;
    public boolean f38295r;
    public TL_iv.pageBlockTable f38296s;
    public final ai.z9 v;

    public u2(Context context, p70 p70Var, g4 g4Var) {
        super(context);
        this.v = new ai.z9(this);
        this.f38290a = p70Var;
        this.f38291b = g4Var;
        t2 t2Var = new t2(this, context, p70Var);
        this.f38292c = t2Var;
        float f7 = 18;
        t2Var.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        t2Var.setClipToPadding(false);
        addView(t2Var, w7.y5.c(-2.0f, -1));
        org.telegram.ui.Components.uz0 uz0Var = new org.telegram.ui.Components.uz0(context, this, ((i4) p70Var).O0);
        this.e = uz0Var;
        uz0Var.setOrientation(0);
        uz0Var.setRowOrderPreserved(true);
        t2Var.addView(uz0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10;
        if (this.d == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        org.telegram.ui.Components.uz0 uz0Var = this.e;
        int childCount = uz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.nz0 d = uz0Var.d(i11);
            org.telegram.ui.Components.mz0 mz0Var = d.f26839b;
            if (mz0Var != null) {
                mz0Var.setX((AndroidUtilities.dp(18.0f) + (d.b() + this.f38293f)) - this.f38292c.getScrollX());
                d.f26839b.setY(d.c() + this.h);
                d.f26839b.setRow(d.f26844j + 10);
                d.f26852r = i10;
                i10++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.mz0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
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
        return i4.p(this.f38290a, this, null, pagetablecell.text, i10, -1, this.f38296s, alignment2, 0, this.f38291b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f38290a.getClass();
        } else if (actionMasked != 2 && (actionMasked == 1 || actionMasked == 3)) {
            removeCallbacks(this.v);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.d;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        org.telegram.ui.Components.uz0 uz0Var = this.e;
        int childCount = uz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.mz0 mz0Var = uz0Var.d(i10).f26839b;
            if (mz0Var != null) {
                arrayList.add(mz0Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return i4.f34380t1;
    }

    @Override
    public Paint getHeaderPaint() {
        return i4.f34381u1;
    }

    @Override
    public Paint getLinePaint() {
        return i4.f34379s1;
    }

    @Override
    public Paint getStripPaint() {
        return i4.f34382v1;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.d;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        org.telegram.ui.Components.uz0 uz0Var = this.e;
        int childCount = uz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.mz0 mz0Var = uz0Var.d(i10).f26839b;
            if (mz0Var != null) {
                mz0Var.attach(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.d;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        org.telegram.ui.Components.uz0 uz0Var = this.e;
        int childCount = uz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.mz0 mz0Var = uz0Var.d(i10).f26839b;
            if (mz0Var != null) {
                mz0Var.detach(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38296s == null) {
            return;
        }
        b3 b3Var = this.d;
        p70 p70Var = this.f38290a;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.f38294n, 0);
            i4.v(p70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, p70Var, this.f38296s, getMeasuredHeight());
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
        int i14 = this.f38293f;
        int i15 = this.h;
        t2 t2Var = this.f38292c;
        t2Var.layout(i14, i15, t2Var.getMeasuredWidth() + i14, t2Var.getMeasuredHeight() + this.h);
        if (this.f38295r) {
            g4 g4Var = this.f38291b;
            if (g4Var != null && g4Var.G) {
                t2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.e.getMeasuredWidth() - t2Var.getMeasuredWidth()));
            } else {
                t2Var.setScrollX(0);
            }
            this.f38295r = false;
        }
    }

    @Override
    public final void onLayoutChild(org.telegram.ui.Components.mz0 mz0Var, int i10, int i11) {
        if (mz0Var instanceof b3) {
            p70 p70Var = this.f38290a;
            if (!p70Var.E.isEmpty() && p70Var.F != null) {
                b3 b3Var = (b3) mz0Var;
                String lowerCase = b3Var.d.getText().toString().toLowerCase();
                int i12 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(p70Var.F, i12);
                    if (indexOf >= 0) {
                        int length = p70Var.F.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = b3Var.d;
                            this.f38291b.f33818y.put(p70Var.F + this.f38296s + b3Var.f32303r + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i11));
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
        TL_iv.pageBlockTable pageblocktable = this.f38296s;
        if (pageblocktable != null) {
            int i14 = pageblocktable.level;
            p70 p70Var = this.f38290a;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(i14 * 14);
                this.f38293f = dp2;
                p70Var.getClass();
                int dp3 = AndroidUtilities.dp(18) + dp2;
                this.f38294n = dp3;
                dp = size - dp3;
            } else {
                this.f38293f = 0;
                p70Var.getClass();
                this.f38294n = AndroidUtilities.dp(18);
                dp = size - AndroidUtilities.dp(36);
            }
            int i15 = dp;
            TL_iv.pageBlockTable pageblocktable2 = this.f38296s;
            b3 p5 = i4.p(this.f38290a, this, null, pageblocktable2.title, i15, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f38291b);
            this.d = p5;
            if (p5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + p5.d.getHeight();
                this.h = i13;
                b3 b3Var = this.d;
                b3Var.f32304s = this.f38294n;
                b3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                i13 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f38293f, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            t2 t2Var = this.f38292c;
            t2Var.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = org.telegram.messenger.f0.C(8.0f, t2Var.getMeasuredHeight(), i13);
            TL_iv.pageBlockTable pageblocktable3 = this.f38296s;
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
        org.telegram.ui.Components.uz0 uz0Var = this.e;
        int childCount = uz0Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.nz0 d = uz0Var.d(i10);
            org.telegram.ui.Components.mz0 mz0Var = d.f26839b;
            if (mz0Var instanceof b3) {
                b3 b3Var = (b3) mz0Var;
                t2 t2Var = this.f38292c;
                int b10 = d.b() + (t2Var.getPaddingLeft() - t2Var.getScrollX()) + this.f38293f;
                int i11 = this.h;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (i4.l(this.f38290a, this.f38291b, motionEvent3, this, b3Var, b10, d.c() + i11)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        if (!i4.l(this.f38290a, this.f38291b, motionEvent4, this, this.d, this.f38294n, 0) && !super.onTouchEvent(motionEvent4)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        int i10;
        this.f38296s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.h6.f19059d6;
        ((i4) this.f38290a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f38292c, org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        org.telegram.ui.Components.uz0 uz0Var = this.e;
        uz0Var.P.clear();
        uz0Var.K.clear();
        uz0Var.g();
        uz0Var.setDrawLines(this.f38296s.bordered);
        uz0Var.setStriped(this.f38296s.striped);
        g4 g4Var = this.f38291b;
        if (g4Var != null && g4Var.G) {
            z10 = true;
        } else {
            z10 = false;
        }
        uz0Var.setRtl(z10);
        if (!this.f38296s.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = this.f38296s.rows.get(0);
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
        int size2 = this.f38296s.rows.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TL_iv.pageTableRow pagetablerow2 = this.f38296s.rows.get(i14);
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
                    uz0Var.b(pagetablecell, i15, i14, i17);
                } else {
                    uz0Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        uz0Var.setColumnCount(i10);
        this.f38295r = true;
        requestLayout();
    }
}
