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
public final class w1 extends View implements org.telegram.ui.Cells.n9, f3 {
    public final f70 f42884a;
    public final i4 f42885b;
    public c3 f42886c;
    public int d;
    public int e;
    public TL_iv.pageBlockFooter f42887f;

    public w1(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f42884a = f70Var;
        this.f42885b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f42886c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f42886c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f36233s;
        this.f42884a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f42886c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f36233s;
        this.f42884a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f42886c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f36233s;
        this.f42884a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.sl.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f42886c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f42886c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42887f == null) {
            return;
        }
        c3 c3Var = this.f42886c;
        f70 f70Var = this.f42884a;
        if (c3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            k4.v(f70Var, canvas, this, 0);
            this.f42886c.draw(canvas, this);
            canvas.restore();
        }
        k4.u(canvas, f70Var, this.f42887f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        c3 c3Var = this.f42886c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVFooter, k4.j(this.f42884a, this.f42885b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f42887f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            f70 f70Var = this.f42884a;
            i12 = 0;
            if (i13 == 0) {
                f70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                f70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                f70Var.getClass();
                this.d = AndroidUtilities.dp((this.f42887f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f42887f.text;
            f70 f70Var2 = this.f42884a;
            f70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f42887f;
            i4 i4Var = this.f42885b;
            if (i4Var != null && i4Var.G) {
                alignment = org.telegram.ui.Components.ix0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = k4.p(f70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f42885b);
            this.f42886c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f42887f.level > 0) {
                    f70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    f70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                c3 c3Var = this.f42886c;
                c3Var.f36233s = this.d;
                c3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.f42884a, this.f42885b, motionEvent, this, this.f42886c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f42887f = pageblockfooter;
        requestLayout();
    }
}
