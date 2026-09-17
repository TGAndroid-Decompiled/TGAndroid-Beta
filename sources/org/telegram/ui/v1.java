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
    public final v70 f41378a;
    public final g4 f41379b;
    public b3 f41380c;
    public int d;
    public int f41381e;
    public TL_iv.pageBlockFooter f41382f;

    public v1(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f41378a = v70Var;
        this.f41379b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f41380c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f41380c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f34618s;
        this.f41378a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f41380c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f34618s;
        this.f41378a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f41380c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f34618s;
        this.f41378a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f41380c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f41380c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41382f == null) {
            return;
        }
        b3 b3Var = this.f41380c;
        v70 v70Var = this.f41378a;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f41381e);
            i4.v(v70Var, canvas, this, 0);
            this.f41380c.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, v70Var, this.f41382f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        b3 b3Var = this.f41380c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVFooter, i4.j(this.f41378a, this.f41379b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f41382f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            v70 v70Var = this.f41378a;
            i12 = 0;
            if (i13 == 0) {
                v70Var.getClass();
                this.f41381e = AndroidUtilities.dp(8);
                v70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f41381e = 0;
                v70Var.getClass();
                this.d = AndroidUtilities.dp((this.f41382f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f41382f.text;
            v70 v70Var2 = this.f41378a;
            v70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f41382f;
            g4 g4Var = this.f41379b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.iw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(v70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f41379b);
            this.f41380c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f41382f.level > 0) {
                    v70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    v70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                b3 b3Var = this.f41380c;
                b3Var.f34618s = this.d;
                b3Var.v = this.f41381e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f41378a, this.f41379b, motionEvent, this, this.f41380c, this.d, this.f41381e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f41382f = pageblockfooter;
        requestLayout();
    }
}
