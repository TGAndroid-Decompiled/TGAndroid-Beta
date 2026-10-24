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
public final class t2 extends View implements org.telegram.ui.Cells.n9, f3 {
    public final f70 f41857a;
    public final i4 f41858b;
    public c3 f41859c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubtitle f41860f;

    public t2(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f41857a = f70Var;
        this.f41858b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f41859c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f41859c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f36208s;
        this.f41857a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f41859c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f36208s;
        this.f41857a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f41859c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f36208s;
        this.f41857a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.tl.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f41859c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f41859c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41860f != null && this.f41859c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            k4.v(this.f41857a, canvas, this, 0);
            this.f41859c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f41859c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVHeading, k4.j(this.f41857a, this.f41858b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        f70 f70Var = this.f41857a;
        f70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        f70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f41860f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            f70 f70Var2 = this.f41857a;
            f70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f41860f;
            i4 i4Var = this.f41858b;
            if (i4Var != null && i4Var.G) {
                alignment = org.telegram.ui.Components.hx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = k4.p(f70Var2, this, null, richText, dp, 0, pageblocksubtitle2, alignment, 0, this.f41858b);
            this.f41859c = p5;
            if (p5 != null) {
                f70Var.getClass();
                i12 = this.f41859c.d.getHeight() + AndroidUtilities.dp(16);
                c3 c3Var = this.f41859c;
                c3Var.f36208s = this.d;
                c3Var.v = this.e;
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
        if (!k4.l(this.f41857a, this.f41858b, motionEvent, this, this.f41859c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f41860f = pageblocksubtitle;
        requestLayout();
    }
}
