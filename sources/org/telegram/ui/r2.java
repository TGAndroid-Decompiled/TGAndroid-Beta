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
public final class r2 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final t70 f39882a;
    public final g4 f39883b;
    public b3 f39884c;
    public int d;
    public int f39885e;
    public TL_iv.pageBlockSubheader f39886f;

    public r2(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f39882a = t70Var;
        this.f39883b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f39884c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f39884c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f34984s;
        this.f39882a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f39884c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f34984s;
        this.f39882a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f39884c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f34984s;
        this.f39882a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.bi.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f39884c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f39884c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39886f != null && this.f39884c != null) {
            canvas.save();
            canvas.translate(this.d, this.f39885e);
            i4.v(this.f39882a, canvas, this, 0);
            this.f39884c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f39884c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVHeading, i4.j(this.f39882a, this.f39883b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.f39882a;
        t70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        t70Var.getClass();
        this.f39885e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f39886f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            t70 t70Var2 = this.f39882a;
            t70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f39886f;
            g4 g4Var = this.f39883b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.fx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(t70Var2, this, null, richText, dp, 0, pageblocksubheader2, alignment, 0, this.f39883b);
            this.f39884c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight() + this.f39885e;
                int i13 = this.f39885e;
                i12 = height + i13;
                b3 b3Var = this.f39884c;
                b3Var.f34984s = this.d;
                b3Var.v = i13;
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
        if (!i4.l(this.f39882a, this.f39883b, motionEvent, this, this.f39884c, this.d, this.f39885e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f39886f = pageblocksubheader;
        requestLayout();
    }
}
