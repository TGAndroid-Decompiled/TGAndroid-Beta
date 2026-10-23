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
public final class w2 extends View implements org.telegram.ui.Cells.n9, f3 {
    public c3 f42901a;
    public TL_iv.pageBlockTitle f42902b;
    public int f42903c;
    public int d;
    public final f70 e;
    public final i4 f42904f;

    public w2(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.e = f70Var;
        this.f42904f = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f42901a;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f42901a;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f36233s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f42901a;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f36233s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f42901a;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f36233s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.sl.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f42901a;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f42901a;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42902b != null && this.f42901a != null) {
            canvas.save();
            canvas.translate(this.f42903c, this.d);
            k4.v(this.e, canvas, this, 0);
            this.f42901a.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        c3 c3Var = this.f42901a;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVTitle, k4.j(this.e, this.f42904f, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        f70 f70Var = this.e;
        f70Var.getClass();
        this.f42903c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f42902b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                f70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                f70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                f70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.f42902b.text;
            f70 f70Var2 = this.e;
            f70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f42902b;
            i4 i4Var = this.f42904f;
            if (i4Var != null && i4Var.G) {
                alignment = org.telegram.ui.Components.ix0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = k4.p(f70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f42904f);
            this.f42901a = p5;
            if (p5 != null) {
                f70Var.getClass();
                i12 += this.f42901a.d.getHeight() + AndroidUtilities.dp(16);
                c3 c3Var = this.f42901a;
                c3Var.f36233s = this.f42903c;
                c3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.e, this.f42904f, motionEvent, this, this.f42901a, this.f42903c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f42902b = pageblocktitle;
        requestLayout();
    }
}
