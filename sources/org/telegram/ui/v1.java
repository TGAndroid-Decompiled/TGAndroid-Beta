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
public final class v1 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final v70 f41405a;
    public final g4 f41406b;
    public b3 f41407c;
    public int d;
    public int f41408e;
    public TL_iv.pageBlockFooter f41409f;

    public v1(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f41405a = v70Var;
        this.f41406b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f41407c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f41407c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f34645s;
        this.f41405a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f41407c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f34645s;
        this.f41405a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f41407c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f34645s;
        this.f41405a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f41407c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f41407c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41409f == null) {
            return;
        }
        b3 b3Var = this.f41407c;
        v70 v70Var = this.f41405a;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f41408e);
            i4.v(v70Var, canvas, this, 0);
            this.f41407c.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, v70Var, this.f41409f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        b3 b3Var = this.f41407c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVFooter, i4.j(this.f41405a, this.f41406b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f41409f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            v70 v70Var = this.f41405a;
            i12 = 0;
            if (i13 == 0) {
                v70Var.getClass();
                this.f41408e = AndroidUtilities.dp(8);
                v70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f41408e = 0;
                v70Var.getClass();
                this.d = AndroidUtilities.dp((this.f41409f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f41409f.text;
            v70 v70Var2 = this.f41405a;
            v70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f41409f;
            g4 g4Var = this.f41406b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.iw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(v70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f41406b);
            this.f41407c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f41409f.level > 0) {
                    v70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    v70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                b3 b3Var = this.f41407c;
                b3Var.f34645s = this.d;
                b3Var.v = this.f41408e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f41405a, this.f41406b, motionEvent, this, this.f41407c, this.d, this.f41408e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f41409f = pageblockfooter;
        requestLayout();
    }
}
