package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class t1 extends View implements org.telegram.ui.Cells.g9, d3 {
    public final i50 f49665a;
    public final g4 f49666b;
    public a3 f49667c;
    public int d;
    public int f49668e;
    public TL_iv.pageBlockFooter f49669f;

    public t1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f49665a = i50Var;
        this.f49666b = g4Var;
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f49667c;
        if (a3Var == null) {
            return -1;
        }
        int k10 = a3Var.k() + a3Var.f43579s;
        this.f49665a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f49667c;
        if (a3Var == null) {
            return -1;
        }
        int l10 = a3Var.l() + a3Var.f43579s;
        this.f49665a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f49667c;
        if (a3Var == null) {
            return -1;
        }
        int m10 = a3Var.m() + a3Var.f43579s;
        this.f49665a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f49667c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f49667c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f49667c;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f49669f == null) {
            return;
        }
        a3 a3Var = this.f49667c;
        i50 i50Var = this.f49665a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f49668e);
            i4.t(i50Var, canvas, this, 0);
            this.f49667c.d(canvas, this);
            canvas.restore();
        }
        i4.s(canvas, i50Var, this.f49669f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        a3 a3Var = this.f49667c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.g(2131754865, i4.h(this.f49665a, this.f49666b, a3Var)));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        Layout.Alignment alignment;
        int L;
        int size = View.MeasureSpec.getSize(i3);
        TL_iv.pageBlockFooter pageblockfooter = this.f49669f;
        if (pageblockfooter != null) {
            int i12 = pageblockfooter.level;
            i50 i50Var = this.f49665a;
            i11 = 0;
            if (i12 == 0) {
                i50Var.getClass();
                this.f49668e = org.telegram.messenger.g0.L(8);
                i50Var.getClass();
                this.d = org.telegram.messenger.g0.L(18);
            } else {
                this.f49668e = 0;
                i50Var.getClass();
                this.d = org.telegram.messenger.g0.L((this.f49669f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f49669f.text;
            i50 i50Var2 = this.f49665a;
            i50Var2.getClass();
            int L2 = (size - org.telegram.messenger.g0.L(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f49669f;
            g4 g4Var = this.f49666b;
            if (g4Var != null && g4Var.H) {
                alignment = org.telegram.ui.Components.lu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 n4 = i4.n(i50Var2, this, null, richText, L2, 0, pageblockfooter2, alignment, 0, this.f49666b);
            this.f49667c = n4;
            if (n4 != null) {
                int height = n4.d.getHeight();
                if (this.f49669f.level > 0) {
                    i50Var.getClass();
                    L = org.telegram.messenger.g0.L(8);
                } else {
                    i50Var.getClass();
                    L = org.telegram.messenger.g0.L(16);
                }
                i11 = L + height;
                a3 a3Var = this.f49667c;
                a3Var.f43579s = this.d;
                a3Var.f43580w = this.f49668e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.j(this.f49665a, this.f49666b, motionEvent, this, this.f49667c, this.d, this.f49668e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f49669f = pageblockfooter;
        requestLayout();
    }
}
