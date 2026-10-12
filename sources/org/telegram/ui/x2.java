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
public final class x2 extends View implements org.telegram.ui.Cells.n9, g3 {
    public d3 f41720a;
    public TL_iv.pageBlockTitle f41721b;
    public int f41722c;
    public int d;
    public final z70 e;
    public final i4 f41723f;

    public x2(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.e = z70Var;
        this.f41723f = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f41720a;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f41720a;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f35132s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f41720a;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f35132s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f41720a;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.f35132s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.yh.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f41720a;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f41720a;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41721b != null && this.f41720a != null) {
            canvas.save();
            canvas.translate(this.f41722c, this.d);
            k4.v(this.e, canvas, this, 0);
            this.f41720a.draw(canvas, this);
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
        d3 d3Var = this.f41720a;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVTitle, k4.j(this.e, this.f41723f, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        z70 z70Var = this.e;
        z70Var.getClass();
        this.f41722c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f41721b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                z70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                z70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                z70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.f41721b.text;
            z70 z70Var2 = this.e;
            z70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f41721b;
            i4 i4Var = this.f41723f;
            if (i4Var != null && i4Var.G) {
                alignment = org.telegram.ui.Components.ix0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p5 = k4.p(z70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f41723f);
            this.f41720a = p5;
            if (p5 != null) {
                z70Var.getClass();
                i12 += this.f41720a.d.getHeight() + AndroidUtilities.dp(16);
                d3 d3Var = this.f41720a;
                d3Var.f35132s = this.f41722c;
                d3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.e, this.f41723f, motionEvent, this, this.f41720a, this.f41722c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f41721b = pageblocktitle;
        requestLayout();
    }
}
