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
public final class y1 extends View implements org.telegram.ui.Cells.p9, f3 {
    public final s70 f40078a;
    public final h4 f40079b;
    public c3 f40080c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f40081f;

    public y1(Context context, s70 s70Var, h4 h4Var) {
        super(context);
        this.f40078a = s70Var;
        this.f40079b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f40080c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f40080c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f32507s;
        this.f40078a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f40080c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f32507s;
        this.f40078a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f40080c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f32507s;
        this.f40078a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.qk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f40080c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f40080c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f40080c != null) {
            canvas.save();
            canvas.translate(this.e, this.f40081f);
            j4.v(this.f40078a, canvas, this, 0);
            this.f40080c.draw(canvas, this);
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
        c3 c3Var = this.f40080c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVKicker, j4.j(this.f40078a, this.f40079b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        s70 s70Var = this.f40078a;
        s70Var.getClass();
        this.e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f40081f = AndroidUtilities.dp(16.0f);
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                this.f40081f = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            s70 s70Var2 = this.f40078a;
            s70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i13 = this.f40081f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            h4 h4Var = this.f40079b;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.ww0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = j4.p(s70Var2, this, null, richText, dp, i13, pageblockkicker2, alignment, 0, this.f40079b);
            this.f40080c = p5;
            if (p5 != null) {
                s70Var.getClass();
                i12 += this.f40080c.d.getHeight() + AndroidUtilities.dp(16);
                c3 c3Var = this.f40080c;
                c3Var.f32507s = this.e;
                c3Var.v = this.f40081f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f40078a, this.f40079b, motionEvent, this, this.f40080c, this.e, this.f40081f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
