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
public final class w2 extends View implements org.telegram.ui.Cells.k9, i3 {
    public final p70 f39246a;
    public final l4 f39247b;
    public f3 f39248c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubtitle f39249f;

    public w2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.f39246a = p70Var;
        this.f39247b = l4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f39248c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f39248c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.f33933s;
        this.f39246a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f39248c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.f33933s;
        this.f39246a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f39248c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.f33933s;
        this.f39246a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f39248c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f39248c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39249f != null && this.f39248c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            n4.v(this.f39246a, canvas, this, 0);
            this.f39248c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f39248c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(n4.i(R.string.AccDescrIVHeading, n4.j(this.f39246a, this.f39247b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        p70 p70Var = this.f39246a;
        p70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        p70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f39249f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            p70 p70Var2 = this.f39246a;
            p70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f39249f;
            l4 l4Var = this.f39247b;
            if (l4Var != null && l4Var.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            f3 p10 = n4.p(p70Var2, this, null, richText, dp, 0, pageblocksubtitle2, alignment, 0, this.f39247b);
            this.f39248c = p10;
            if (p10 != null) {
                p70Var.getClass();
                i12 = this.f39248c.d.getHeight() + AndroidUtilities.dp(16);
                f3 f3Var = this.f39248c;
                f3Var.f33933s = this.d;
                f3Var.v = this.e;
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
        if (!n4.l(this.f39246a, this.f39247b, motionEvent, this, this.f39248c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f39249f = pageblocksubtitle;
        requestLayout();
    }
}
