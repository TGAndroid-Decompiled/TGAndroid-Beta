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
public final class x1 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 f44307a;
    public final j4 f44308b;
    public e3 f44309c;
    public int d;
    public int f44310e;
    public TL_iv.pageBlockFooter f44311f;

    public x1(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f44307a = a70Var;
        this.f44308b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f44309c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        e3 e3Var = this.f44309c;
        if (e3Var == null) {
            return -1;
        }
        int a2 = e3Var.a() + e3Var.f37805s;
        this.f44307a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        e3 e3Var = this.f44309c;
        if (e3Var == null) {
            return -1;
        }
        int b10 = e3Var.b() + e3Var.f37805s;
        this.f44307a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        e3 e3Var = this.f44309c;
        if (e3Var == null) {
            return -1;
        }
        int c10 = e3Var.c() + e3Var.f37805s;
        this.f44307a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f44309c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f44309c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f44311f == null) {
            return;
        }
        e3 e3Var = this.f44309c;
        a70 a70Var = this.f44307a;
        if (e3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f44310e);
            l4.v(a70Var, canvas, this, 0);
            this.f44309c.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, a70Var, this.f44311f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        e3 e3Var = this.f44309c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVFooter, l4.j(this.f44307a, this.f44308b, e3Var)));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockFooter pageblockfooter = this.f44311f;
        if (pageblockfooter != null) {
            int i12 = pageblockfooter.level;
            a70 a70Var = this.f44307a;
            i11 = 0;
            if (i12 == 0) {
                a70Var.getClass();
                this.f44310e = AndroidUtilities.dp(8);
                a70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f44310e = 0;
                a70Var.getClass();
                this.d = AndroidUtilities.dp((this.f44311f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f44311f.text;
            a70 a70Var2 = this.f44307a;
            a70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f44311f;
            j4 j4Var = this.f44308b;
            if (j4Var != null && j4Var.C) {
                alignment = org.telegram.ui.Components.rv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            e3 p6 = l4.p(a70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f44308b);
            this.f44309c = p6;
            if (p6 != null) {
                int height = p6.d.getHeight();
                if (this.f44311f.level > 0) {
                    a70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    a70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i11 = dp + height;
                e3 e3Var = this.f44309c;
                e3Var.f37805s = this.d;
                e3Var.v = this.f44310e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f44307a, this.f44308b, motionEvent, this, this.f44309c, this.d, this.f44310e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f44311f = pageblockfooter;
        requestLayout();
    }
}
