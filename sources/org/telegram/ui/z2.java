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
public final class z2 extends View implements org.telegram.ui.Cells.k9, i3 {
    public f3 f40375a;
    public TL_iv.pageBlockTitle f40376b;
    public int f40377c;
    public int d;
    public final p70 e;
    public final l4 f40378f;

    public z2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.e = p70Var;
        this.f40378f = l4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f40375a;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f40375a;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.f33933s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f40375a;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.f33933s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f40375a;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.f33933s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f40375a;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f40375a;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40376b != null && this.f40375a != null) {
            canvas.save();
            canvas.translate(this.f40377c, this.d);
            n4.v(this.e, canvas, this, 0);
            this.f40375a.draw(canvas, this);
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
        f3 f3Var = this.f40375a;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(n4.i(R.string.AccDescrIVTitle, n4.j(this.e, this.f40378f, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        p70 p70Var = this.e;
        p70Var.getClass();
        this.f40377c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f40376b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                p70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                p70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                p70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.f40376b.text;
            p70 p70Var2 = this.e;
            p70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f40376b;
            l4 l4Var = this.f40378f;
            if (l4Var != null && l4Var.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            f3 p10 = n4.p(p70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f40378f);
            this.f40375a = p10;
            if (p10 != null) {
                p70Var.getClass();
                i12 += this.f40375a.d.getHeight() + AndroidUtilities.dp(16);
                f3 f3Var = this.f40375a;
                f3Var.f33933s = this.f40377c;
                f3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n4.l(this.e, this.f40378f, motionEvent, this, this.f40375a, this.f40377c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f40376b = pageblocktitle;
        requestLayout();
    }
}
