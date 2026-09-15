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
public final class u2 extends View implements org.telegram.ui.Cells.p9, d3 {
    public a3 f37828a;
    public TL_iv.pageBlockTitle f37829b;
    public int f37830c;
    public int d;
    public final u70 e;
    public final f4 f37831f;

    public u2(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.e = u70Var;
        this.f37831f = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f37828a;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f37828a;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f31679s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f37828a;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f31679s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f37828a;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f31679s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.wl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f37828a;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f37828a;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37829b != null && this.f37828a != null) {
            canvas.save();
            canvas.translate(this.f37830c, this.d);
            h4.v(this.e, canvas, this, 0);
            this.f37828a.draw(canvas, this);
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
        a3 a3Var = this.f37828a;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.i(R.string.AccDescrIVTitle, h4.j(this.e, this.f37831f, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        u70 u70Var = this.e;
        u70Var.getClass();
        this.f37830c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f37829b;
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
            TL_iv.RichText richText = this.f37829b.text;
            u70 u70Var2 = this.e;
            u70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f37829b;
            f4 f4Var = this.f37831f;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.jw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 p5 = h4.p(u70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f37831f);
            this.f37828a = p5;
            if (p5 != null) {
                u70Var.getClass();
                i12 += this.f37828a.d.getHeight() + AndroidUtilities.dp(16);
                a3 a3Var = this.f37828a;
                a3Var.f31679s = this.f37830c;
                a3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.e, this.f37831f, motionEvent, this, this.f37828a, this.f37830c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f37829b = pageblocktitle;
        requestLayout();
    }
}
