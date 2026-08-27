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

public final class z2 extends View implements org.telegram.ui.Cells.i9, i3 {

    public f3 f44995a;

    public TL_iv.pageBlockTitle f44996b;

    public int f44997c;
    public int d;

    public final d70 f44998e;

    public final k4 f44999f;

    public z2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f44998e = d70Var;
        this.f44999f = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f44995a;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f44995a;
        if (f3Var == null) {
            return -1;
        }
        int iA = f3Var.a() + f3Var.f37923s;
        this.f44998e.getClass();
        return iA - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f44995a;
        if (f3Var == null) {
            return -1;
        }
        int iB = f3Var.b() + f3Var.f37923s;
        this.f44998e.getClass();
        return AndroidUtilities.dp(18) + iB;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f44995a;
        if (f3Var == null) {
            return -1;
        }
        int iC = f3Var.c() + f3Var.f37923s;
        this.f44998e.getClass();
        return AndroidUtilities.dp(18) + iC;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f44995a;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f44995a;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f44996b == null || this.f44995a == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.f44997c, this.d);
        m4.v(this.f44998e, canvas, this, 0);
        this.f44995a.draw(canvas, this);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        f3 f3Var = this.f44995a;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrIVTitle, m4.j(this.f44998e, this.f44999f, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int height;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.f44998e;
        d70Var.getClass();
        this.f44997c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f44996b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                d70Var.getClass();
                height = AndroidUtilities.dp(8);
                d70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                d70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                height = 0;
            }
            TL_iv.RichText richText = this.f44996b.text;
            d70 d70Var2 = this.f44998e;
            d70Var2.getClass();
            int iDp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f44996b;
            k4 k4Var = this.f44999f;
            f3 f3VarP = m4.p(d70Var2, this, null, richText, iDp, 0, pageblocktitle2, (k4Var == null || !k4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.tv0.a(), 0, this.f44999f);
            this.f44995a = f3VarP;
            if (f3VarP != null) {
                d70Var.getClass();
                height += this.f44995a.d.getHeight() + AndroidUtilities.dp(16);
                f3 f3Var = this.f44995a;
                f3Var.f37923s = this.f44997c;
                f3Var.v = this.d;
            }
        } else {
            height = 1;
        }
        setMeasuredDimension(size, height);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return m4.l(this.f44998e, this.f44999f, motionEvent, this, this.f44995a, this.f44997c, this.d) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f44996b = pageblocktitle;
        requestLayout();
    }
}
