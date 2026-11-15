package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class s1 extends View implements org.telegram.ui.Cells.g9, c3 {
    public final n50 f51065a;
    public final e4 f51066b;
    public z2 f51067c;
    public int d;
    public int f51068e;
    public TL_iv.pageBlockFooter f51069f;

    public s1(Context context, n50 n50Var, e4 e4Var) {
        super(context);
        this.f51065a = n50Var;
        this.f51066b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f51067c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f53812s;
        this.f51065a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f51067c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f53812s;
        this.f51065a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f51067c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f53812s;
        this.f51065a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.i20.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f51067c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f51067c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f51067c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f51069f == null) {
            return;
        }
        z2 z2Var = this.f51067c;
        n50 n50Var = this.f51065a;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f51068e);
            g4.t(n50Var, canvas, this, 0);
            this.f51067c.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, n50Var, this.f51069f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        z2 z2Var = this.f51067c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754865, g4.h(this.f51065a, this.f51066b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int L;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockFooter pageblockfooter = this.f51069f;
        if (pageblockfooter != null) {
            int i12 = pageblockfooter.level;
            n50 n50Var = this.f51065a;
            i11 = 0;
            if (i12 == 0) {
                n50Var.getClass();
                this.f51068e = org.telegram.messenger.g0.L(8);
                n50Var.getClass();
                this.d = org.telegram.messenger.g0.L(18);
            } else {
                this.f51068e = 0;
                n50Var.getClass();
                this.d = org.telegram.messenger.g0.L((this.f51069f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f51069f.text;
            n50 n50Var2 = this.f51065a;
            n50Var2.getClass();
            int L2 = (size - org.telegram.messenger.g0.L(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f51069f;
            e4 e4Var = this.f51066b;
            if (e4Var != null && e4Var.H) {
                alignment = org.telegram.ui.Components.ou0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(n50Var2, this, null, richText, L2, 0, pageblockfooter2, alignment, 0, this.f51066b);
            this.f51067c = n10;
            if (n10 != null) {
                int height = n10.d.getHeight();
                if (this.f51069f.level > 0) {
                    n50Var.getClass();
                    L = org.telegram.messenger.g0.L(8);
                } else {
                    n50Var.getClass();
                    L = org.telegram.messenger.g0.L(16);
                }
                i11 = L + height;
                z2 z2Var = this.f51067c;
                z2Var.f53812s = this.d;
                z2Var.f53813w = this.f51068e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f51065a, this.f51066b, motionEvent, this, this.f51067c, this.d, this.f51068e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f51069f = pageblockfooter;
        requestLayout();
    }
}
