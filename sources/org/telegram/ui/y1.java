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

public final class y1 extends View implements org.telegram.ui.Cells.i9, i3 {

    public final d70 f44661a;

    public final k4 f44662b;

    public f3 f44663c;
    public int d;

    public int f44664e;

    public TL_iv.pageBlockFooter f44665f;

    public y1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f44661a = d70Var;
        this.f44662b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f44663c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f44663c;
        if (f3Var == null) {
            return -1;
        }
        int iA = f3Var.a() + f3Var.f37923s;
        this.f44661a.getClass();
        return iA - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f44663c;
        if (f3Var == null) {
            return -1;
        }
        int iB = f3Var.b() + f3Var.f37923s;
        this.f44661a.getClass();
        return AndroidUtilities.dp(18) + iB;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f44663c;
        if (f3Var == null) {
            return -1;
        }
        int iC = f3Var.c() + f3Var.f37923s;
        this.f44661a.getClass();
        return AndroidUtilities.dp(18) + iC;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f44663c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f44663c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f44665f == null) {
            return;
        }
        f3 f3Var = this.f44663c;
        d70 d70Var = this.f44661a;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f44664e);
            m4.v(d70Var, canvas, this, 0);
            this.f44663c.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.f44665f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        f3 f3Var = this.f44663c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrIVFooter, m4.j(this.f44661a, this.f44662b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int iDp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f44665f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            d70 d70Var = this.f44661a;
            i12 = 0;
            if (i13 == 0) {
                d70Var.getClass();
                this.f44664e = AndroidUtilities.dp(8);
                d70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f44664e = 0;
                d70Var.getClass();
                this.d = AndroidUtilities.dp((this.f44665f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f44665f.text;
            d70 d70Var2 = this.f44661a;
            d70Var2.getClass();
            int iDp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f44665f;
            k4 k4Var = this.f44662b;
            f3 f3VarP = m4.p(d70Var2, this, null, richText, iDp2, 0, pageblockfooter2, (k4Var == null || !k4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.tv0.a(), 0, this.f44662b);
            this.f44663c = f3VarP;
            if (f3VarP != null) {
                int height = f3VarP.d.getHeight();
                if (this.f44665f.level > 0) {
                    d70Var.getClass();
                    iDp = AndroidUtilities.dp(8);
                } else {
                    d70Var.getClass();
                    iDp = AndroidUtilities.dp(16);
                }
                i12 = iDp + height;
                f3 f3Var = this.f44663c;
                f3Var.f37923s = this.d;
                f3Var.v = this.f44664e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return m4.l(this.f44661a, this.f44662b, motionEvent, this, this.f44663c, this.d, this.f44664e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f44665f = pageblockfooter;
        requestLayout();
    }
}
