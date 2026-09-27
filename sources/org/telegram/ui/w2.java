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
public final class w2 extends View implements org.telegram.ui.Cells.p9, f3 {
    public c3 f38784a;
    public TL_iv.pageBlockTitle f38785b;
    public int f38786c;
    public int d;
    public final s70 e;
    public final h4 f38787f;

    public w2(Context context, s70 s70Var, h4 h4Var) {
        super(context);
        this.e = s70Var;
        this.f38787f = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f38784a;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f38784a;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f32507s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f38784a;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f32507s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f38784a;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f32507s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.qk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f38784a;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f38784a;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38785b != null && this.f38784a != null) {
            canvas.save();
            canvas.translate(this.f38786c, this.d);
            j4.v(this.e, canvas, this, 0);
            this.f38784a.draw(canvas, this);
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
        c3 c3Var = this.f38784a;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVTitle, j4.j(this.e, this.f38787f, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        s70 s70Var = this.e;
        s70Var.getClass();
        this.f38786c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f38785b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                s70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                s70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                s70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.f38785b.text;
            s70 s70Var2 = this.e;
            s70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f38785b;
            h4 h4Var = this.f38787f;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.ww0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = j4.p(s70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f38787f);
            this.f38784a = p5;
            if (p5 != null) {
                s70Var.getClass();
                i12 += this.f38784a.d.getHeight() + AndroidUtilities.dp(16);
                c3 c3Var = this.f38784a;
                c3Var.f32507s = this.f38786c;
                c3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.e, this.f38787f, motionEvent, this, this.f38784a, this.f38786c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f38785b = pageblocktitle;
        requestLayout();
    }
}
