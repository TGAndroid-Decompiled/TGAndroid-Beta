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
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;

public final class y2 extends FrameLayout implements org.telegram.ui.Components.sy0, org.telegram.ui.Cells.i9 {

    public final d70 f44677a;

    public final k4 f44678b;

    public final x2 f44679c;
    public f3 d;

    public final org.telegram.ui.Components.ty0 f44680e;

    public int f44681f;
    public int h;

    public int f44682n;

    public boolean f44683r;

    public TL_iv.pageBlockTable f44684s;
    public final androidx.emoji2.text.n v;

    public y2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.v = new androidx.emoji2.text.n(this);
        this.f44677a = d70Var;
        this.f44678b = k4Var;
        x2 x2Var = new x2(this, context, d70Var);
        this.f44679c = x2Var;
        float f10 = 18;
        x2Var.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        x2Var.setClipToPadding(false);
        addView(x2Var, h7.z5.c(-2.0f, -1));
        org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0(context, this, ((m4) d70Var).K0);
        this.f44680e = ty0Var;
        ty0Var.setOrientation(0);
        ty0Var.setRowOrderPreserved(true);
        x2Var.addView(ty0Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void a() {
        int i10 = this.d == null ? 0 : 1;
        org.telegram.ui.Components.ty0 ty0Var = this.f44680e;
        int childCount = ty0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            org.telegram.ui.Components.my0 my0VarD = ty0Var.d(i11);
            org.telegram.ui.Components.ly0 ly0Var = my0VarD.f30779b;
            if (ly0Var != null) {
                ly0Var.setX((AndroidUtilities.dp(18.0f) + (my0VarD.b() + this.f44681f)) - this.f44679c.getScrollX());
                my0VarD.f30779b.setY(my0VarD.c() + this.h);
                my0VarD.f30779b.setRow(my0VarD.f30785j + 10);
                my0VarD.f30793r = i10;
                i10++;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ly0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
        Layout.Alignment alignment;
        if (pagetablecell == null) {
            return null;
        }
        if (pagetablecell.align_right) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL;
        }
        return m4.p(this.f44677a, this, null, pagetablecell.text, i10, -1, this.f44684s, alignment, 0, this.f44678b);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f44677a.getClass();
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
        org.telegram.ui.Components.ty0 ty0Var = this.f44680e;
        int childCount = ty0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.ly0 ly0Var = ty0Var.d(i10).f30779b;
            if (ly0Var != null) {
                arrayList.add(ly0Var);
            }
        }
    }

    public Paint getHalfLinePaint() {
        return m4.f40323p1;
    }

    @Override
    public Paint getHeaderPaint() {
        return m4.f40324q1;
    }

    @Override
    public Paint getLinePaint() {
        return m4.f40322o1;
    }

    @Override
    public Paint getStripPaint() {
        return m4.f40325r1;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f44680e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.d;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        org.telegram.ui.Components.ty0 ty0Var = this.f44680e;
        int childCount = ty0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.ly0 ly0Var = ty0Var.d(i10).f30779b;
            if (ly0Var != null) {
                ly0Var.attach(this);
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
        org.telegram.ui.Components.ty0 ty0Var = this.f44680e;
        int childCount = ty0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            org.telegram.ui.Components.ly0 ly0Var = ty0Var.d(i10).f30779b;
            if (ly0Var != null) {
                ly0Var.detach(this);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f44684s == null) {
            return;
        }
        f3 f3Var = this.d;
        d70 d70Var = this.f44677a;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.f44682n, 0);
            m4.v(d70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.f44684s, getMeasuredHeight());
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
        int i14 = this.f44681f;
        int i15 = this.h;
        x2 x2Var = this.f44679c;
        x2Var.layout(i14, i15, x2Var.getMeasuredWidth() + i14, x2Var.getMeasuredHeight() + this.h);
        if (this.f44683r) {
            k4 k4Var = this.f44678b;
            if (k4Var == null || !k4Var.C) {
                x2Var.setScrollX(0);
            } else {
                x2Var.setScrollX(AndroidUtilities.dp(36.0f) + (this.f44680e.getMeasuredWidth() - x2Var.getMeasuredWidth()));
            }
            this.f44683r = false;
        }
    }

    @Override
    public final void onLayoutChild(org.telegram.ui.Components.ly0 ly0Var, int i10, int i11) {
        if (!(ly0Var instanceof f3)) {
            return;
        }
        d70 d70Var = this.f44677a;
        if (d70Var.A.isEmpty() || d70Var.B == null) {
            return;
        }
        f3 f3Var = (f3) ly0Var;
        String lowerCase = f3Var.d.getText().toString().toLowerCase();
        int i12 = 0;
        while (true) {
            int iIndexOf = lowerCase.indexOf(d70Var.B, i12);
            if (iIndexOf < 0) {
                return;
            }
            int length = d70Var.B.length() + iIndexOf;
            if (iIndexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(iIndexOf - 1))) {
                HashMap map = this.f44678b.f39597y;
                String str = d70Var.B + this.f44684s + f3Var.f37922r + iIndexOf;
                StaticLayout staticLayout = f3Var.d;
                map.put(str, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(iIndexOf)) + i11));
            }
            i12 = length;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iC;
        int iDp;
        int iDp2;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockTable pageblocktable = this.f44684s;
        if (pageblocktable != null) {
            int i12 = pageblocktable.level;
            d70 d70Var = this.f44677a;
            if (i12 > 0) {
                int iDp3 = AndroidUtilities.dp(i12 * 14);
                this.f44681f = iDp3;
                d70Var.getClass();
                int iDp4 = AndroidUtilities.dp(18) + iDp3;
                this.f44682n = iDp4;
                iDp = size - iDp4;
            } else {
                this.f44681f = 0;
                d70Var.getClass();
                this.f44682n = AndroidUtilities.dp(18);
                iDp = size - AndroidUtilities.dp(36);
            }
            int i13 = iDp;
            TL_iv.pageBlockTable pageblocktable2 = this.f44684s;
            f3 f3VarP = m4.p(this.f44677a, this, null, pageblocktable2.title, i13, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.f44678b);
            this.d = f3VarP;
            if (f3VarP != null) {
                iDp2 = AndroidUtilities.dp(8.0f) + f3VarP.d.getHeight();
                this.h = iDp2;
                f3 f3Var = this.d;
                f3Var.f37923s = this.f44682n;
                f3Var.v = 0;
            } else {
                this.h = AndroidUtilities.dp(8.0f);
                iDp2 = 0;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f44681f, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            x2 x2Var = this.f44679c;
            x2Var.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iC = org.telegram.messenger.y1.C(8.0f, x2Var.getMeasuredHeight(), iDp2);
            TL_iv.pageBlockTable pageblocktable3 = this.f44684s;
            if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                iC += AndroidUtilities.dp(8.0f);
            }
        } else {
            iC = 1;
        }
        setMeasuredDimension(size, iC);
        a();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.Components.ty0 ty0Var = this.f44680e;
        int childCount = ty0Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            org.telegram.ui.Components.my0 my0VarD = ty0Var.d(i10);
            org.telegram.ui.Components.ly0 ly0Var = my0VarD.f30779b;
            if (ly0Var instanceof f3) {
                f3 f3Var = (f3) ly0Var;
                x2 x2Var = this.f44679c;
                MotionEvent motionEvent3 = motionEvent;
                motionEvent2 = motionEvent3;
                if (m4.l(this.f44677a, this.f44678b, motionEvent3, this, f3Var, my0VarD.b() + (x2Var.getPaddingLeft() - x2Var.getScrollX()) + this.f44681f, my0VarD.c() + this.h)) {
                    return true;
                }
            } else {
                motionEvent2 = motionEvent;
            }
            i10++;
            motionEvent = motionEvent2;
        }
        MotionEvent motionEvent4 = motionEvent;
        return m4.l(this.f44677a, this.f44678b, motionEvent4, this, this.d, this.f44682n, 0) || super.onTouchEvent(motionEvent4);
    }

    public void setBlock(TL_iv.pageBlockTable pageblocktable) {
        int i10;
        this.f44684s = pageblocktable;
        int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
        ((m4) this.f44677a).getClass();
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f44679c, org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        org.telegram.ui.Components.ty0 ty0Var = this.f44680e;
        ty0Var.L.clear();
        ty0Var.G.clear();
        ty0Var.g();
        ty0Var.setDrawLines(this.f44684s.bordered);
        ty0Var.setStriped(this.f44684s.striped);
        k4 k4Var = this.f44678b;
        ty0Var.setRtl(k4Var != null && k4Var.C);
        if (this.f44684s.rows.isEmpty()) {
            i10 = 0;
        } else {
            TL_iv.pageTableRow pagetablerow = this.f44684s.rows.get(0);
            int size = pagetablerow.cells.size();
            i10 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int i13 = pagetablerow.cells.get(i12).colspan;
                if (i13 == 0) {
                    i13 = 1;
                }
                i10 += i13;
            }
        }
        int size2 = this.f44684s.rows.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TL_iv.pageTableRow pagetablerow2 = this.f44684s.rows.get(i14);
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
                    ty0Var.b(pagetablecell, i15, i14, i17);
                } else {
                    ty0Var.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        ty0Var.setColumnCount(i10);
        this.f44683r = true;
        requestLayout();
    }
}
