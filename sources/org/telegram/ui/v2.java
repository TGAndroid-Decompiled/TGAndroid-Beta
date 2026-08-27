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

public final class v2 extends View implements org.telegram.ui.Cells.i9, i3 {

    public final d70 f43327a;

    public final k4 f43328b;

    public f3 f43329c;
    public int d;

    public int f43330e;

    public TL_iv.pageBlockSubheader f43331f;

    public v2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f43327a = d70Var;
        this.f43328b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f43329c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f43329c;
        if (f3Var == null) {
            return -1;
        }
        int iA = f3Var.a() + f3Var.f37923s;
        this.f43327a.getClass();
        return iA - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f43329c;
        if (f3Var == null) {
            return -1;
        }
        int iB = f3Var.b() + f3Var.f37923s;
        this.f43327a.getClass();
        return AndroidUtilities.dp(18) + iB;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f43329c;
        if (f3Var == null) {
            return -1;
        }
        int iC = f3Var.c() + f3Var.f37923s;
        this.f43327a.getClass();
        return AndroidUtilities.dp(18) + iC;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f43329c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f43329c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43331f == null || this.f43329c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.f43330e);
        m4.v(this.f43327a, canvas, this, 0);
        this.f43329c.draw(canvas, this);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f43329c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrIVHeading, m4.j(this.f43327a, this.f43328b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.f43327a;
        d70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        d70Var.getClass();
        this.f43330e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f43331f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            d70 d70Var2 = this.f43327a;
            d70Var2.getClass();
            int iDp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f43331f;
            k4 k4Var = this.f43328b;
            f3 f3VarP = m4.p(d70Var2, this, null, richText, iDp, 0, pageblocksubheader2, (k4Var == null || !k4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.tv0.a(), 0, this.f43328b);
            this.f43329c = f3VarP;
            if (f3VarP != null) {
                int height = f3VarP.d.getHeight() + this.f43330e;
                int i13 = this.f43330e;
                i12 = height + i13;
                f3 f3Var = this.f43329c;
                f3Var.f37923s = this.d;
                f3Var.v = i13;
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
        return m4.l(this.f43327a, this.f43328b, motionEvent, this, this.f43329c, this.d, this.f43330e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f43331f = pageblocksubheader;
        requestLayout();
    }
}
