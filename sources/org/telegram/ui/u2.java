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
public final class u2 extends View implements org.telegram.ui.Cells.r9, e3 {
    public a3 f43976a;
    public TL_iv.pageBlockTitle f43977b;
    public int f43978c;
    public int d;
    public final h70 e;
    public final h4 f43979f;

    public u2(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.e = h70Var;
        this.f43979f = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f43976a;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f43976a;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f37631s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f43976a;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f37631s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f43976a;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f37631s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return d3.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f43976a;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f43976a;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43977b != null && this.f43976a != null) {
            canvas.save();
            canvas.translate(this.f43978c, this.d);
            j4.v(this.e, canvas, this, 0);
            this.f43976a.draw(canvas, this);
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
        a3 a3Var = this.f43976a;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVTitle, j4.j(this.e, this.f43979f, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        h70 h70Var = this.e;
        h70Var.getClass();
        this.f43978c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f43977b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                h70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                h70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                h70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.f43977b.text;
            h70 h70Var2 = this.e;
            h70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f43977b;
            h4 h4Var = this.f43979f;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.px0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 p10 = j4.p(h70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f43979f);
            this.f43976a = p10;
            if (p10 != null) {
                h70Var.getClass();
                i12 += this.f43976a.d.getHeight() + AndroidUtilities.dp(16);
                a3 a3Var = this.f43976a;
                a3Var.f37631s = this.f43978c;
                a3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.e, this.f43979f, motionEvent, this, this.f43976a, this.f43978c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f43977b = pageblocktitle;
        requestLayout();
    }
}
