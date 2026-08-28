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
public final class y2 extends View implements org.telegram.ui.Cells.m9, h3 {
    public e3 f44685a;
    public TL_iv.pageBlockTitle f44686b;
    public int f44687c;
    public int d;
    public final a70 f44688e;
    public final j4 f44689f;

    public y2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f44688e = a70Var;
        this.f44689f = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f44685a;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        e3 e3Var = this.f44685a;
        if (e3Var == null) {
            return -1;
        }
        int a2 = e3Var.a() + e3Var.f37805s;
        this.f44688e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        e3 e3Var = this.f44685a;
        if (e3Var == null) {
            return -1;
        }
        int b10 = e3Var.b() + e3Var.f37805s;
        this.f44688e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        e3 e3Var = this.f44685a;
        if (e3Var == null) {
            return -1;
        }
        int c10 = e3Var.c() + e3Var.f37805s;
        this.f44688e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f44685a;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f44685a;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f44686b != null && this.f44685a != null) {
            canvas.save();
            canvas.translate(this.f44687c, this.d);
            l4.v(this.f44688e, canvas, this, 0);
            this.f44685a.draw(canvas, this);
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
        e3 e3Var = this.f44685a;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVTitle, l4.j(this.f44688e, this.f44689f, e3Var)));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i9);
        a70 a70Var = this.f44688e;
        a70Var.getClass();
        this.f44687c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f44686b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                a70Var.getClass();
                i11 = AndroidUtilities.dp(8);
                a70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                a70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i11 = 0;
            }
            TL_iv.RichText richText = this.f44686b.text;
            a70 a70Var2 = this.f44688e;
            a70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f44686b;
            j4 j4Var = this.f44689f;
            if (j4Var != null && j4Var.C) {
                alignment = org.telegram.ui.Components.rv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            e3 p6 = l4.p(a70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f44689f);
            this.f44685a = p6;
            if (p6 != null) {
                a70Var.getClass();
                i11 += this.f44685a.d.getHeight() + AndroidUtilities.dp(16);
                e3 e3Var = this.f44685a;
                e3Var.f37805s = this.f44687c;
                e3Var.v = this.d;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f44688e, this.f44689f, motionEvent, this, this.f44685a, this.f44687c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f44686b = pageblocktitle;
        requestLayout();
    }
}
