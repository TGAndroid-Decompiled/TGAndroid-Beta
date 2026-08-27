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

public final class w2 extends View implements org.telegram.ui.Cells.i9, i3 {

    public final d70 f43575a;

    public final k4 f43576b;

    public f3 f43577c;
    public int d;

    public int f43578e;

    public TL_iv.pageBlockSubtitle f43579f;

    public w2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f43575a = d70Var;
        this.f43576b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f43577c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f43577c;
        if (f3Var == null) {
            return -1;
        }
        int iA = f3Var.a() + f3Var.f37923s;
        this.f43575a.getClass();
        return iA - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f43577c;
        if (f3Var == null) {
            return -1;
        }
        int iB = f3Var.b() + f3Var.f37923s;
        this.f43575a.getClass();
        return AndroidUtilities.dp(18) + iB;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f43577c;
        if (f3Var == null) {
            return -1;
        }
        int iC = f3Var.c() + f3Var.f37923s;
        this.f43575a.getClass();
        return AndroidUtilities.dp(18) + iC;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f43577c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f43577c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43579f == null || this.f43577c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.f43578e);
        m4.v(this.f43575a, canvas, this, 0);
        this.f43577c.draw(canvas, this);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f43577c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrIVHeading, m4.j(this.f43575a, this.f43576b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int height;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.f43575a;
        d70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        d70Var.getClass();
        this.f43578e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f43579f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            d70 d70Var2 = this.f43575a;
            d70Var2.getClass();
            int iDp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f43579f;
            k4 k4Var = this.f43576b;
            f3 f3VarP = m4.p(d70Var2, this, null, richText, iDp, 0, pageblocksubtitle2, (k4Var == null || !k4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.tv0.a(), 0, this.f43576b);
            this.f43577c = f3VarP;
            if (f3VarP != null) {
                d70Var.getClass();
                height = this.f43577c.d.getHeight() + AndroidUtilities.dp(16);
                f3 f3Var = this.f43577c;
                f3Var.f37923s = this.d;
                f3Var.v = this.f43578e;
            } else {
                height = 0;
            }
        } else {
            height = 1;
        }
        setMeasuredDimension(size, height);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return m4.l(this.f43575a, this.f43576b, motionEvent, this, this.f43577c, this.d, this.f43578e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f43579f = pageblocksubtitle;
        requestLayout();
    }
}
