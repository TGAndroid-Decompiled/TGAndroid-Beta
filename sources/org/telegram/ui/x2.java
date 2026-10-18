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
public final class x2 extends View implements org.telegram.ui.Cells.m9, g3 {
    public d3 f42997a;
    public TL_iv.pageBlockTitle f42998b;
    public int f42999c;
    public int d;
    public final d70 e;
    public final j4 f43000f;

    public x2(Context context, d70 d70Var, j4 j4Var) {
        super(context);
        this.e = d70Var;
        this.f43000f = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f42997a;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f42997a;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f36074s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f42997a;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f36074s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f42997a;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.f36074s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.kk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f42997a;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f42997a;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42998b != null && this.f42997a != null) {
            canvas.save();
            canvas.translate(this.f42999c, this.d);
            l4.v(this.e, canvas, this, 0);
            this.f42997a.draw(canvas, this);
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
        d3 d3Var = this.f42997a;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVTitle, l4.j(this.e, this.f43000f, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.e;
        d70Var.getClass();
        this.f42999c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f42998b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                d70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                d70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                d70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.f42998b.text;
            d70 d70Var2 = this.e;
            d70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f42998b;
            j4 j4Var = this.f43000f;
            if (j4Var != null && j4Var.G) {
                alignment = org.telegram.ui.Components.dx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p5 = l4.p(d70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f43000f);
            this.f42997a = p5;
            if (p5 != null) {
                d70Var.getClass();
                i12 += this.f42997a.d.getHeight() + AndroidUtilities.dp(16);
                d3 d3Var = this.f42997a;
                d3Var.f36074s = this.f42999c;
                d3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.e, this.f43000f, motionEvent, this, this.f42997a, this.f42999c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f42998b = pageblocktitle;
        requestLayout();
    }
}
