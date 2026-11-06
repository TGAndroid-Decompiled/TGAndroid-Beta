package ug;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.w80;
public final class n0 extends FrameLayout implements l0 {
    public final f6 f56597a;
    public final ArrayList f56598b;
    public final m0 f56599c;
    public final m0 d;
    public final m0 f56600e;
    public final boolean f56601f;

    public n0(Context context, f6 f6Var) {
        super(context);
        w80[] values;
        this.f56598b = new ArrayList();
        this.f56597a = f6Var;
        for (w80 w80Var : w80.values()) {
            if (w80Var.f51018e) {
                this.f56598b.add(w80Var);
            }
            if (this.f56598b.size() == 3) {
                break;
            }
        }
        if (this.f56598b.size() < 3) {
            a8.g(new IllegalArgumentException("There should be at least 3 premium icons!"), true);
            this.f56601f = true;
            return;
        }
        this.f56599c = a(context, 0);
        this.d = a(context, 1);
        this.f56600e = a(context, 2);
        setClipChildren(false);
    }

    public final m0 a(Context context, int i7) {
        w80 w80Var = (w80) this.f56598b.get(i7);
        ?? qVar = new org.telegram.ui.Cells.q(context);
        p1 p1Var = new p1(20);
        qVar.f56586e = p1Var;
        Paint paint = new Paint(1);
        qVar.f56587f = paint;
        p1Var.f56662r = 12;
        p1Var.f56663s = 8;
        p1Var.f56664t = 6;
        if (i7 == 1) {
            p1Var.O = 1001;
        }
        if (i7 == 0) {
            p1Var.O = 1002;
        }
        p1Var.P = this.f56597a;
        p1Var.Q = k6.Nk;
        p1Var.c();
        paint.setColor(-1);
        qVar.setLayoutParams(ha.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        qVar.setForeground(w80Var.f51017c);
        qVar.setBackgroundResource(w80Var.f51016b);
        qVar.setPadding(org.telegram.messenger.g0.L(8.0f));
        qVar.setBackgroundOuterPadding(org.telegram.messenger.g0.L(32.0f));
        addView(qVar);
        return qVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f56601f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        int L = org.telegram.messenger.g0.L(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f56599c.getLayoutParams();
        layoutParams.height = L;
        layoutParams.width = L;
        float f10 = L;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f10);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = L;
        layoutParams2.width = L;
        int i11 = (int) (f10 * 0.95f);
        layoutParams2.rightMargin = i11;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f56600e.getLayoutParams();
        layoutParams3.height = L;
        layoutParams3.width = L;
        layoutParams3.leftMargin = i11;
    }

    @Override
    public void setOffset(float f10) {
        if (this.f56601f) {
            return;
        }
        float abs = Math.abs(f10 / getMeasuredWidth());
        float interpolation = xq.f40312i.getInterpolation(abs);
        int right = getRight();
        m0 m0Var = this.f56600e;
        m0Var.setTranslationX(((m0Var.getWidth() * 1.5f) + (right - m0Var.getRight()) + org.telegram.messenger.g0.L(32.0f)) * interpolation);
        m0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * interpolation);
        float f11 = 1.0f;
        float i7 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        m0Var.setScaleX(i7);
        m0Var.setScaleY(i7);
        int top = getTop();
        m0 m0Var2 = this.f56599c;
        m0Var2.setTranslationY((((top - m0Var2.getTop()) - (m0Var2.getHeight() * 1.8f)) - org.telegram.messenger.g0.L(32.0f)) * abs);
        m0Var2.setTranslationX(org.telegram.messenger.g0.L(16.0f) * abs);
        float i10 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 1.8f, abs), 1.0f, 0.0f);
        m0Var2.setScaleX(i10);
        m0Var2.setScaleY(i10);
        float interpolation2 = xq.f40311g.getInterpolation(abs);
        int left = getLeft();
        m0 m0Var3 = this.d;
        m0Var3.setTranslationX((((left - m0Var3.getLeft()) - (m0Var3.getWidth() * 2.5f)) + org.telegram.messenger.g0.L(32.0f)) * interpolation2);
        m0Var3.setTranslationY(((m0Var3.getHeight() * 2.5f) + (getBottom() - m0Var3.getBottom()) + org.telegram.messenger.g0.L(32.0f)) * interpolation2);
        float i11 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 2.5f, abs), 1.0f, 0.0f);
        m0Var3.setScaleX(i11);
        m0Var3.setScaleY(i11);
        if (abs < 0.4f) {
            f11 = abs / 0.4f;
        }
        m0Var.h = f11;
        m0Var2.h = f11;
        m0Var3.h = f11;
    }
}
