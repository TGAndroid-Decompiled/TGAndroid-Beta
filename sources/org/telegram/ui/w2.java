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
public final class w2 extends View implements org.telegram.ui.Cells.r9, f3 {
    public c3 f37677a;
    public TL_iv.pageBlockTitle f37678b;
    public int f37679c;
    public int d;
    public final t70 e;
    public final h4 f37680f;

    public w2(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.e = t70Var;
        this.f37680f = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f37677a;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f37677a;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f31515s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f37677a;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f31515s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f37677a;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f31515s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.em.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f37677a;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f37677a;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37678b != null && this.f37677a != null) {
            canvas.save();
            canvas.translate(this.f37679c, this.d);
            j4.v(this.e, canvas, this, 0);
            this.f37677a.draw(canvas, this);
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
        c3 c3Var = this.f37677a;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVTitle, j4.j(this.e, this.f37680f, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.e;
        t70Var.getClass();
        this.f37679c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f37678b;
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
            TL_iv.RichText richText = this.f37678b.text;
            t70 t70Var2 = this.e;
            t70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f37678b;
            h4 h4Var = this.f37680f;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.uw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = j4.p(t70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f37680f);
            this.f37677a = p5;
            if (p5 != null) {
                t70Var.getClass();
                i12 += this.f37677a.d.getHeight() + AndroidUtilities.dp(16);
                c3 c3Var = this.f37677a;
                c3Var.f31515s = this.f37679c;
                c3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.e, this.f37680f, motionEvent, this, this.f37677a, this.f37679c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f37678b = pageblocktitle;
        requestLayout();
    }
}
