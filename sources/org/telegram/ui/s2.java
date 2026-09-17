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
public final class s2 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final v70 f40285a;
    public final g4 f40286b;
    public b3 f40287c;
    public int d;
    public int f40288e;
    public TL_iv.pageBlockSubtitle f40289f;

    public s2(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f40285a = v70Var;
        this.f40286b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f40287c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f40287c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f34618s;
        this.f40285a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f40287c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f34618s;
        this.f40285a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f40287c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f34618s;
        this.f40285a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f40287c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f40287c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40289f != null && this.f40287c != null) {
            canvas.save();
            canvas.translate(this.d, this.f40288e);
            i4.v(this.f40285a, canvas, this, 0);
            this.f40287c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f40287c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVHeading, i4.j(this.f40285a, this.f40286b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        v70 v70Var = this.f40285a;
        v70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        v70Var.getClass();
        this.f40288e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f40289f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            v70 v70Var2 = this.f40285a;
            v70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f40289f;
            g4 g4Var = this.f40286b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.iw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(v70Var2, this, null, richText, dp, 0, pageblocksubtitle2, alignment, 0, this.f40286b);
            this.f40287c = p5;
            if (p5 != null) {
                v70Var.getClass();
                i12 = this.f40287c.d.getHeight() + AndroidUtilities.dp(16);
                b3 b3Var = this.f40287c;
                b3Var.f34618s = this.d;
                b3Var.v = this.f40288e;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f40285a, this.f40286b, motionEvent, this, this.f40287c, this.d, this.f40288e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f40289f = pageblocksubtitle;
        requestLayout();
    }
}
