package ug;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.w80;
public final class o0 extends FrameLayout implements m0 {
    public final e6 f58238a;
    public final ArrayList f58239b;
    public final n0 f58240c;
    public final n0 d;
    public final n0 f58241e;
    public final boolean f58242f;

    public o0(Context context, e6 e6Var) {
        super(context);
        w80[] values;
        this.f58239b = new ArrayList();
        this.f58238a = e6Var;
        for (w80 w80Var : w80.values()) {
            if (w80Var.f52496e) {
                this.f58239b.add(w80Var);
            }
            if (this.f58239b.size() == 3) {
                break;
            }
        }
        if (this.f58239b.size() < 3) {
            a8.g(new IllegalArgumentException("There should be at least 3 premium icons!"), true);
            this.f58242f = true;
            return;
        }
        this.f58240c = a(context, 0);
        this.d = a(context, 1);
        this.f58241e = a(context, 2);
        setClipChildren(false);
    }

    public final n0 a(Context context, int i7) {
        w80 w80Var = (w80) this.f58239b.get(i7);
        ?? qVar = new org.telegram.ui.Cells.q(context);
        r1 r1Var = new r1(20);
        qVar.f58227e = r1Var;
        Paint paint = new Paint(1);
        qVar.f58228f = paint;
        r1Var.f58320r = 12;
        r1Var.f58321s = 8;
        r1Var.f58322t = 6;
        if (i7 == 1) {
            r1Var.O = 1001;
        }
        if (i7 == 0) {
            r1Var.O = 1002;
        }
        r1Var.P = this.f58238a;
        r1Var.Q = j6.Qk;
        r1Var.c();
        paint.setColor(-1);
        qVar.setLayoutParams(ja.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        qVar.setForeground(w80Var.f52495c);
        qVar.setBackgroundResource(w80Var.f52494b);
        qVar.setPadding(org.telegram.messenger.g0.L(8.0f));
        qVar.setBackgroundOuterPadding(org.telegram.messenger.g0.L(32.0f));
        addView(qVar);
        return qVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f58242f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        int L = org.telegram.messenger.g0.L(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f58240c.getLayoutParams();
        layoutParams.height = L;
        layoutParams.width = L;
        float f10 = L;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f10);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = L;
        layoutParams2.width = L;
        int i11 = (int) (f10 * 0.95f);
        layoutParams2.rightMargin = i11;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f58241e.getLayoutParams();
        layoutParams3.height = L;
        layoutParams3.width = L;
        layoutParams3.leftMargin = i11;
    }

    @Override
    public void setOffset(float f10) {
        if (this.f58242f) {
            return;
        }
        float abs = Math.abs(f10 / getMeasuredWidth());
        float interpolation = er.f34422i.getInterpolation(abs);
        int right = getRight();
        n0 n0Var = this.f58241e;
        n0Var.setTranslationX(((n0Var.getWidth() * 1.5f) + (right - n0Var.getRight()) + org.telegram.messenger.g0.L(32.0f)) * interpolation);
        n0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * interpolation);
        float f11 = 1.0f;
        float i7 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        n0Var.setScaleX(i7);
        n0Var.setScaleY(i7);
        int top = getTop();
        n0 n0Var2 = this.f58240c;
        n0Var2.setTranslationY((((top - n0Var2.getTop()) - (n0Var2.getHeight() * 1.8f)) - org.telegram.messenger.g0.L(32.0f)) * abs);
        n0Var2.setTranslationX(org.telegram.messenger.g0.L(16.0f) * abs);
        float i10 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 1.8f, abs), 1.0f, 0.0f);
        n0Var2.setScaleX(i10);
        n0Var2.setScaleY(i10);
        float interpolation2 = er.f34421g.getInterpolation(abs);
        int left = getLeft();
        n0 n0Var3 = this.d;
        n0Var3.setTranslationX((((left - n0Var3.getLeft()) - (n0Var3.getWidth() * 2.5f)) + org.telegram.messenger.g0.L(32.0f)) * interpolation2);
        n0Var3.setTranslationY(((n0Var3.getHeight() * 2.5f) + (getBottom() - n0Var3.getBottom()) + org.telegram.messenger.g0.L(32.0f)) * interpolation2);
        float i11 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 2.5f, abs), 1.0f, 0.0f);
        n0Var3.setScaleX(i11);
        n0Var3.setScaleY(i11);
        if (abs < 0.4f) {
            f11 = abs / 0.4f;
        }
        n0Var.h = f11;
        n0Var2.h = f11;
        n0Var3.h = f11;
    }
}
