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
public final class u2 extends View implements org.telegram.ui.Cells.n9, d3 {
    public a3 f42358a;
    public TL_iv.pageBlockTitle f42359b;
    public int f42360c;
    public int d;
    public final t70 f42361e;
    public final f4 f42362f;

    public u2(Context context, t70 t70Var, f4 f4Var) {
        super(context);
        this.f42361e = t70Var;
        this.f42362f = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f42358a;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f42358a;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f35896s;
        this.f42361e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f42358a;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f35896s;
        this.f42361e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f42358a;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f35896s;
        this.f42361e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ai.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f42358a;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f42358a;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42359b != null && this.f42358a != null) {
            canvas.save();
            canvas.translate(this.f42360c, this.d);
            h4.v(this.f42361e, canvas, this, 0);
            this.f42358a.draw(canvas, this);
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
        a3 a3Var = this.f42358a;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.i(R.string.AccDescrIVTitle, h4.j(this.f42361e, this.f42362f, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.f42361e;
        t70Var.getClass();
        this.f42360c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f42359b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                t70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                t70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                t70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.f42359b.text;
            t70 t70Var2 = this.f42361e;
            t70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f42359b;
            f4 f4Var = this.f42362f;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.nx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 p5 = h4.p(t70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f42362f);
            this.f42358a = p5;
            if (p5 != null) {
                t70Var.getClass();
                i12 += this.f42358a.d.getHeight() + AndroidUtilities.dp(16);
                a3 a3Var = this.f42358a;
                a3Var.f35896s = this.f42360c;
                a3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.f42361e, this.f42362f, motionEvent, this, this.f42358a, this.f42360c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f42359b = pageblocktitle;
        requestLayout();
    }
}
