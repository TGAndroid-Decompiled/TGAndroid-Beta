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
public final class v2 extends View implements org.telegram.ui.Cells.n9, e3 {
    public b3 f42614a;
    public TL_iv.pageBlockTitle f42615b;
    public int f42616c;
    public int d;
    public final t70 f42617e;
    public final g4 f42618f;

    public v2(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f42617e = t70Var;
        this.f42618f = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f42614a;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f42614a;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f36117s;
        this.f42617e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f42614a;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f36117s;
        this.f42617e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f42614a;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f36117s;
        this.f42617e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.bi.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f42614a;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f42614a;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42615b != null && this.f42614a != null) {
            canvas.save();
            canvas.translate(this.f42616c, this.d);
            i4.v(this.f42617e, canvas, this, 0);
            this.f42614a.draw(canvas, this);
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
        b3 b3Var = this.f42614a;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVTitle, i4.j(this.f42617e, this.f42618f, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.f42617e;
        t70Var.getClass();
        this.f42616c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f42615b;
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
            TL_iv.RichText richText = this.f42615b.text;
            t70 t70Var2 = this.f42617e;
            t70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f42615b;
            g4 g4Var = this.f42618f;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.mx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(t70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f42618f);
            this.f42614a = p5;
            if (p5 != null) {
                t70Var.getClass();
                i12 += this.f42614a.d.getHeight() + AndroidUtilities.dp(16);
                b3 b3Var = this.f42614a;
                b3Var.f36117s = this.f42616c;
                b3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f42617e, this.f42618f, motionEvent, this, this.f42614a, this.f42616c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f42615b = pageblocktitle;
        requestLayout();
    }
}
