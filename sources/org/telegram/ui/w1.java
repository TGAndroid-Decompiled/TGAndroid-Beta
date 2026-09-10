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
public final class w1 extends View implements org.telegram.ui.Cells.r9, f3 {
    public final t70 f37664a;
    public final h4 f37665b;
    public c3 f37666c;
    public int d;
    public int e;
    public TL_iv.pageBlockFooter f37667f;

    public w1(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.f37664a = t70Var;
        this.f37665b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f37666c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f37666c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f31515s;
        this.f37664a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f37666c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f31515s;
        this.f37664a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f37666c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f31515s;
        this.f37664a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.em.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f37666c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f37666c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37667f == null) {
            return;
        }
        c3 c3Var = this.f37666c;
        t70 t70Var = this.f37664a;
        if (c3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(t70Var, canvas, this, 0);
            this.f37666c.draw(canvas, this);
            canvas.restore();
        }
        j4.u(canvas, t70Var, this.f37667f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        c3 c3Var = this.f37666c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVFooter, j4.j(this.f37664a, this.f37665b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f37667f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            t70 t70Var = this.f37664a;
            i12 = 0;
            if (i13 == 0) {
                t70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                t70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                t70Var.getClass();
                this.d = AndroidUtilities.dp((this.f37667f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f37667f.text;
            t70 t70Var2 = this.f37664a;
            t70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f37667f;
            h4 h4Var = this.f37665b;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.uw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = j4.p(t70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f37665b);
            this.f37666c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f37667f.level > 0) {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                c3 c3Var = this.f37666c;
                c3Var.f31515s = this.d;
                c3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f37664a, this.f37665b, motionEvent, this, this.f37666c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f37667f = pageblockfooter;
        requestLayout();
    }
}
