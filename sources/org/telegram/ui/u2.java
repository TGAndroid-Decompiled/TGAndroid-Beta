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
public final class u2 extends View implements org.telegram.ui.Cells.q9, d3 {
    public a3 f37930a;
    public TL_iv.pageBlockTitle f37931b;
    public int f37932c;
    public int d;
    public final u70 e;
    public final f4 f37933f;

    public u2(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.e = u70Var;
        this.f37933f = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f37930a;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f37930a;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f31996s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f37930a;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f31996s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f37930a;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f31996s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f37930a;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f37930a;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37931b != null && this.f37930a != null) {
            canvas.save();
            canvas.translate(this.f37932c, this.d);
            h4.v(this.e, canvas, this, 0);
            this.f37930a.draw(canvas, this);
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
        a3 a3Var = this.f37930a;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.i(R.string.AccDescrIVTitle, h4.j(this.e, this.f37933f, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        u70 u70Var = this.e;
        u70Var.getClass();
        this.f37932c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f37931b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                u70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                u70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                u70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.f37931b.text;
            u70 u70Var2 = this.e;
            u70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f37931b;
            f4 f4Var = this.f37933f;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.ww0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 p5 = h4.p(u70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f37933f);
            this.f37930a = p5;
            if (p5 != null) {
                u70Var.getClass();
                i12 += this.f37930a.d.getHeight() + AndroidUtilities.dp(16);
                a3 a3Var = this.f37930a;
                a3Var.f31996s = this.f37932c;
                a3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.e, this.f37933f, motionEvent, this, this.f37930a, this.f37932c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f37931b = pageblocktitle;
        requestLayout();
    }
}
