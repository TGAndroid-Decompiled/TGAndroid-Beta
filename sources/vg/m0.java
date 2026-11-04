package vg;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.t80;
public final class m0 extends FrameLayout implements k0 {
    public final e6 f56719a;
    public final ArrayList f56720b;
    public final l0 f56721c;
    public final l0 d;
    public final l0 f56722e;
    public final boolean f56723f;

    public m0(Context context, e6 e6Var) {
        super(context);
        t80[] values;
        this.f56720b = new ArrayList();
        this.f56719a = e6Var;
        for (t80 t80Var : t80.values()) {
            if (t80Var.f49737e) {
                this.f56720b.add(t80Var);
            }
            if (this.f56720b.size() == 3) {
                break;
            }
        }
        if (this.f56720b.size() < 3) {
            a8.g(new IllegalArgumentException("There should be at least 3 premium icons!"), true);
            this.f56723f = true;
            return;
        }
        this.f56721c = a(context, 0);
        this.d = a(context, 1);
        this.f56722e = a(context, 2);
        setClipChildren(false);
    }

    public final l0 a(Context context, int i3) {
        t80 t80Var = (t80) this.f56720b.get(i3);
        ?? qVar = new org.telegram.ui.Cells.q(context);
        s1 s1Var = new s1(20);
        qVar.f56700e = s1Var;
        Paint paint = new Paint(1);
        qVar.f56701f = paint;
        s1Var.f56844r = 12;
        s1Var.f56845s = 8;
        s1Var.f56846t = 6;
        if (i3 == 1) {
            s1Var.O = 1001;
        }
        if (i3 == 0) {
            s1Var.O = 1002;
        }
        s1Var.P = this.f56719a;
        s1Var.Q = k6.Nk;
        s1Var.c();
        paint.setColor(-1);
        qVar.setLayoutParams(mf.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        qVar.setForeground(t80Var.f49736c);
        qVar.setBackgroundResource(t80Var.f49735b);
        qVar.setPadding(org.telegram.messenger.g0.L(8.0f));
        qVar.setBackgroundOuterPadding(org.telegram.messenger.g0.L(32.0f));
        addView(qVar);
        return qVar;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (this.f56723f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        int L = org.telegram.messenger.g0.L(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f56721c.getLayoutParams();
        layoutParams.height = L;
        layoutParams.width = L;
        float f10 = L;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f10);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = L;
        layoutParams2.width = L;
        int i11 = (int) (f10 * 0.95f);
        layoutParams2.rightMargin = i11;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f56722e.getLayoutParams();
        layoutParams3.height = L;
        layoutParams3.width = L;
        layoutParams3.leftMargin = i11;
    }

    @Override
    public void setOffset(float f10) {
        if (this.f56723f) {
            return;
        }
        float abs = Math.abs(f10 / getMeasuredWidth());
        float interpolation = xq.f40454i.getInterpolation(abs);
        int right = getRight();
        l0 l0Var = this.f56722e;
        l0Var.setTranslationX(((l0Var.getWidth() * 1.5f) + (right - l0Var.getRight()) + org.telegram.messenger.g0.L(32.0f)) * interpolation);
        l0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * interpolation);
        float f11 = 1.0f;
        float i3 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        l0Var.setScaleX(i3);
        l0Var.setScaleY(i3);
        int top = getTop();
        l0 l0Var2 = this.f56721c;
        l0Var2.setTranslationY((((top - l0Var2.getTop()) - (l0Var2.getHeight() * 1.8f)) - org.telegram.messenger.g0.L(32.0f)) * abs);
        l0Var2.setTranslationX(org.telegram.messenger.g0.L(16.0f) * abs);
        float i10 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 1.8f, abs), 1.0f, 0.0f);
        l0Var2.setScaleX(i10);
        l0Var2.setScaleY(i10);
        float interpolation2 = xq.f40453g.getInterpolation(abs);
        int left = getLeft();
        l0 l0Var3 = this.d;
        l0Var3.setTranslationX((((left - l0Var3.getLeft()) - (l0Var3.getWidth() * 2.5f)) + org.telegram.messenger.g0.L(32.0f)) * interpolation2);
        l0Var3.setTranslationY(((l0Var3.getHeight() * 2.5f) + (getBottom() - l0Var3.getBottom()) + org.telegram.messenger.g0.L(32.0f)) * interpolation2);
        float i11 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 2.5f, abs), 1.0f, 0.0f);
        l0Var3.setScaleX(i11);
        l0Var3.setScaleY(i11);
        if (abs < 0.4f) {
            f11 = abs / 0.4f;
        }
        l0Var.h = f11;
        l0Var2.h = f11;
        l0Var3.h = f11;
    }
}
