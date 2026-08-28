package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class v2 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 f43364a;
    public final j4 f43365b;
    public e3 f43366c;
    public int d;
    public int f43367e;
    public TL_iv.pageBlockSubtitle f43368f;

    public v2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f43364a = a70Var;
        this.f43365b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f43366c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        e3 e3Var = this.f43366c;
        if (e3Var == null) {
            return -1;
        }
        int a2 = e3Var.a() + e3Var.f37805s;
        this.f43364a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        e3 e3Var = this.f43366c;
        if (e3Var == null) {
            return -1;
        }
        int b10 = e3Var.b() + e3Var.f37805s;
        this.f43364a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        e3 e3Var = this.f43366c;
        if (e3Var == null) {
            return -1;
        }
        int c10 = e3Var.c() + e3Var.f37805s;
        this.f43364a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f43366c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f43366c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43368f != null && this.f43366c != null) {
            canvas.save();
            canvas.translate(this.d, this.f43367e);
            l4.v(this.f43364a, canvas, this, 0);
            this.f43366c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        e3 e3Var = this.f43366c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVHeading, l4.j(this.f43364a, this.f43365b, e3Var)));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i9);
        a70 a70Var = this.f43364a;
        a70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        a70Var.getClass();
        this.f43367e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f43368f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            a70 a70Var2 = this.f43364a;
            a70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f43368f;
            j4 j4Var = this.f43365b;
            if (j4Var != null && j4Var.C) {
                alignment = org.telegram.ui.Components.rv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            e3 p6 = l4.p(a70Var2, this, null, richText, dp, 0, pageblocksubtitle2, alignment, 0, this.f43365b);
            this.f43366c = p6;
            if (p6 != null) {
                a70Var.getClass();
                i11 = this.f43366c.d.getHeight() + AndroidUtilities.dp(16);
                e3 e3Var = this.f43366c;
                e3Var.f37805s = this.d;
                e3Var.v = this.f43367e;
            } else {
                i11 = 0;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f43364a, this.f43365b, motionEvent, this, this.f43366c, this.d, this.f43367e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f43368f = pageblocksubtitle;
        requestLayout();
    }
}
