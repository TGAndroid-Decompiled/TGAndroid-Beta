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
public final class v2 extends View implements org.telegram.ui.Cells.p9, e3 {
    public b3 f41413a;
    public TL_iv.pageBlockTitle f41414b;
    public int f41415c;
    public int d;
    public final v70 f41416e;
    public final g4 f41417f;

    public v2(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f41416e = v70Var;
        this.f41417f = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f41413a;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f41413a;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f34645s;
        this.f41416e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f41413a;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f34645s;
        this.f41416e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f41413a;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f34645s;
        this.f41416e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f41413a;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f41413a;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41414b != null && this.f41413a != null) {
            canvas.save();
            canvas.translate(this.f41415c, this.d);
            i4.v(this.f41416e, canvas, this, 0);
            this.f41413a.draw(canvas, this);
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
        b3 b3Var = this.f41413a;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVTitle, i4.j(this.f41416e, this.f41417f, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        v70 v70Var = this.f41416e;
        v70Var.getClass();
        this.f41415c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f41414b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                v70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                v70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                v70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.f41414b.text;
            v70 v70Var2 = this.f41416e;
            v70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f41414b;
            g4 g4Var = this.f41417f;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.iw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(v70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f41417f);
            this.f41413a = p5;
            if (p5 != null) {
                v70Var.getClass();
                i12 += this.f41413a.d.getHeight() + AndroidUtilities.dp(16);
                b3 b3Var = this.f41413a;
                b3Var.f34645s = this.f41415c;
                b3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f41416e, this.f41417f, motionEvent, this, this.f41413a, this.f41415c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f41414b = pageblocktitle;
        requestLayout();
    }
}
