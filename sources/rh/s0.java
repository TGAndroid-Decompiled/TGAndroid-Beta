package rh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.ui.Components.gr;
public final class s0 extends gh.c implements fe.e {
    public static final int f47428w = 0;
    public final fe.f f47429f;
    public final ph.h1 h;
    public final gh.b[] f47430n;
    public final org.telegram.ui.ActionBar.p6 f47431r;
    public int f47432s;

    public s0(Context context, org.telegram.ui.ActionBar.p6 p6Var, ph.h1 h1Var) {
        super(context);
        this.f47429f = new fe.f(0, this, gr.h, 1600L);
        this.h = h1Var;
        this.f47431r = p6Var;
        int i10 = org.telegram.ui.ActionBar.t6.Kl;
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.09411765f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.t6.r1(0.1254902f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.e.setColor(r12);
        this.f47430n = new gh.b[]{gh.b.c(context, p6Var, gh.a.G, 2131749634), gh.b.c(context, p6Var, gh.a.f7512w, 2131749651), gh.b.c(context, p6Var, gh.a.J, 2131749632)};
        int i11 = 0;
        while (true) {
            gh.b[] bVarArr = this.f47430n;
            if (i11 < bVarArr.length) {
                this.f7528a.addView(bVarArr[i11], w7.b6.l(1.0f, 0, -1));
                this.f47430n[i11].setOnClickListener(new r0(this, i11, 0));
                i11++;
            } else {
                bVarArr[0].f(true, false);
                return;
            }
        }
    }

    public final void a(int i10) {
        int i11 = this.f47432s;
        if (i11 != i10) {
            gh.b[] bVarArr = this.f47430n;
            bVarArr[i11].f(false, true);
            bVarArr[i10].f(true, true);
            this.f47432s = i10;
            this.f47429f.a(i10);
            this.h.a(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f7 = this.f47429f.f7031f;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f);
        Rect rect = this.f7530c;
        rect.set(org.telegram.messenger.i0.W1(f7 / 3.0f, org.telegram.messenger.i0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f)), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.W1((f7 + 1.0f) / 3.0f, org.telegram.messenger.i0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f)), measuredHeight);
        int L = org.telegram.messenger.i0.L(this.f7529b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -L;
        rect2.inset(i10, i10);
        Math.abs(f7 - 1.0f);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        b();
        invalidate();
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
