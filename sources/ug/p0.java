package ug;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.z80;
public final class p0 extends FrameLayout implements n0 {
    public final h6 f58828a;
    public final ArrayList f58829b;
    public final o0 f58830c;
    public final o0 d;
    public final o0 f58831e;
    public final boolean f58832f;

    public p0(Context context, h6 h6Var) {
        super(context);
        z80[] values;
        this.f58829b = new ArrayList();
        this.f58828a = h6Var;
        for (z80 z80Var : z80.values()) {
            if (z80Var.f54460e) {
                this.f58829b.add(z80Var);
            }
            if (this.f58829b.size() == 3) {
                break;
            }
        }
        if (this.f58829b.size() < 3) {
            a8.g(new IllegalArgumentException("There should be at least 3 premium icons!"), true);
            this.f58832f = true;
            return;
        }
        this.f58830c = a(context, 0);
        this.d = a(context, 1);
        this.f58831e = a(context, 2);
        setClipChildren(false);
    }

    public final o0 a(Context context, int i7) {
        z80 z80Var = (z80) this.f58829b.get(i7);
        ?? qVar = new org.telegram.ui.Cells.q(context);
        s1 s1Var = new s1(20);
        qVar.f58820e = s1Var;
        Paint paint = new Paint(1);
        qVar.f58821f = paint;
        s1Var.f58911r = 12;
        s1Var.f58912s = 8;
        s1Var.f58913t = 6;
        if (i7 == 1) {
            s1Var.O = 1001;
        }
        if (i7 == 0) {
            s1Var.O = 1002;
        }
        s1Var.P = this.f58828a;
        s1Var.Q = m6.Qk;
        s1Var.c();
        paint.setColor(-1);
        qVar.setLayoutParams(na.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        qVar.setForeground(z80Var.f54459c);
        qVar.setBackgroundResource(z80Var.f54458b);
        qVar.setPadding(org.telegram.messenger.g0.L(8.0f));
        qVar.setBackgroundOuterPadding(org.telegram.messenger.g0.L(32.0f));
        addView(qVar);
        return qVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f58832f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        int L = org.telegram.messenger.g0.L(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f58830c.getLayoutParams();
        layoutParams.height = L;
        layoutParams.width = L;
        float f10 = L;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f10);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = L;
        layoutParams2.width = L;
        int i11 = (int) (f10 * 0.95f);
        layoutParams2.rightMargin = i11;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f58831e.getLayoutParams();
        layoutParams3.height = L;
        layoutParams3.width = L;
        layoutParams3.leftMargin = i11;
    }

    @Override
    public void setOffset(float f10) {
        if (this.f58832f) {
            return;
        }
        float abs = Math.abs(f10 / getMeasuredWidth());
        float interpolation = nr.f37919i.getInterpolation(abs);
        int right = getRight();
        o0 o0Var = this.f58831e;
        o0Var.setTranslationX(((o0Var.getWidth() * 1.5f) + (right - o0Var.getRight()) + org.telegram.messenger.g0.L(32.0f)) * interpolation);
        o0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * interpolation);
        float f11 = 1.0f;
        float i7 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        o0Var.setScaleX(i7);
        o0Var.setScaleY(i7);
        int top = getTop();
        o0 o0Var2 = this.f58830c;
        o0Var2.setTranslationY((((top - o0Var2.getTop()) - (o0Var2.getHeight() * 1.8f)) - org.telegram.messenger.g0.L(32.0f)) * abs);
        o0Var2.setTranslationX(org.telegram.messenger.g0.L(16.0f) * abs);
        float i10 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 1.8f, abs), 1.0f, 0.0f);
        o0Var2.setScaleX(i10);
        o0Var2.setScaleY(i10);
        float interpolation2 = nr.f37918g.getInterpolation(abs);
        int left = getLeft();
        o0 o0Var3 = this.d;
        o0Var3.setTranslationX((((left - o0Var3.getLeft()) - (o0Var3.getWidth() * 2.5f)) + org.telegram.messenger.g0.L(32.0f)) * interpolation2);
        o0Var3.setTranslationY(((o0Var3.getHeight() * 2.5f) + (getBottom() - o0Var3.getBottom()) + org.telegram.messenger.g0.L(32.0f)) * interpolation2);
        float i11 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 2.5f, abs), 1.0f, 0.0f);
        o0Var3.setScaleX(i11);
        o0Var3.setScaleY(i11);
        if (abs < 0.4f) {
            f11 = abs / 0.4f;
        }
        o0Var.h = f11;
        o0Var2.h = f11;
        o0Var3.h = f11;
    }
}
