package vh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.vi;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.gr;
public final class l1 extends h1 {
    public final c1 f51460b;
    public final k1 f51461c;
    public final s4.r d;
    public final j1 e;
    public final p1 f51462f;
    public int h;
    public float f51463n;
    public boolean f51464r;
    public final u1 f51465s;

    public l1(u1 u1Var, Context context) {
        super(context);
        this.f51465s = u1Var;
        this.h = 8;
        this.f51463n = -1.0f;
        this.f51464r = false;
        c1 c1Var = new c1(context);
        this.f51460b = c1Var;
        k1 k1Var = new k1(this);
        this.f51461c = k1Var;
        c1Var.setAdapter(k1Var);
        s4.r rVar = new s4.r(this.h);
        this.d = rVar;
        c1Var.setLayoutManager(rVar);
        c1Var.setClipToPadding(true);
        c1Var.setVerticalScrollBarEnabled(false);
        rVar.O = new jg.h1(this, 17);
        c1Var.setOnItemClickListener(new ag.y0(this, 20));
        c1Var.setOnScrollListener(new cu0(this, 25));
        s4.j jVar = new s4.j();
        jVar.f47978c = 220L;
        jVar.e = 220L;
        jVar.f47979f = 160L;
        jVar.f47980g = 160L;
        jVar.f47981i = gr.f26524g;
        c1Var.setItemAnimator(jVar);
        addView(c1Var, w7.b6.c(-1.0f, -1));
        int i10 = u1.f52000y1;
        p1 p1Var = new p1(context, u1Var.I0);
        this.f51462f = p1Var;
        p1Var.f51739x = new qh.d(this, 17);
        addView(p1Var, w7.b6.e(-1, -2, 48));
        j1 j1Var = new j1(this, context, u1Var.I0);
        this.e = j1Var;
        addView(j1Var, w7.b6.c(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        this.f51240a = i10;
        int i12 = 0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51460b.f51033f3 = z10;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.y1(i11);
        boolean z11 = this.f51464r;
        k1 k1Var = this.f51461c;
        if (!z11) {
            k1Var.D(null);
        }
        u1 u1Var = this.f51465s;
        int i13 = u1Var.f52002j1;
        p1 p1Var = this.f51462f;
        if (i13 >= 0) {
            p1Var.f51737s = true;
            p1Var.e.setText("");
            p1Var.f51737s = false;
            o1 o1Var = p1Var.h;
            if (o1Var != null) {
                o1Var.H1(u1Var.f52002j1);
                p1Var.h.F1();
                if (p1Var.h.getSelectedCategory() != null) {
                    k1Var.H = p1Var.h.getSelectedCategory().f32916a;
                    d0 d0Var = k1Var.M;
                    org.telegram.messenger.i0.r(d0Var);
                    org.telegram.messenger.i0.g3(d0Var);
                }
            }
        } else if (!TextUtils.isEmpty(u1Var.f52001i1)) {
            p1Var.e.setText(u1Var.f52001i1);
            o1 o1Var2 = p1Var.h;
            if (o1Var2 != null) {
                o1Var2.I1(null);
                p1Var.h.G1();
            }
            org.telegram.messenger.i0.r(k1Var.M);
            org.telegram.messenger.i0.g3(k1Var.M);
        } else {
            p1Var.b();
        }
        p1Var.a(i10, u1Var.f52008q1);
        vi b02 = vi.b0(u1Var.f21584a);
        if (i10 == 0) {
            i12 = 5;
        }
        b02.B(i12);
    }

    @Override
    public final float b() {
        View childAt;
        float f7 = this.f51463n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            c1 c1Var = this.f51460b;
            if (i10 >= c1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = c1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return i0.a.d(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(org.telegram.messenger.i0.L(16.0f) + max);
        this.f51462f.setTranslationY(org.telegram.messenger.i0.L(52.0f) + max);
        c1 c1Var = this.f51460b;
        c1Var.f51034g3 = max + c1Var.getPaddingTop();
        c1Var.f51035h3 = c1Var.getHeight() - c1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12 = u1.f52000y1;
        u1 u1Var = this.f51465s;
        int i13 = u1Var.f21616t0;
        setPadding(i13, 0, i13, 0);
        this.e.setTranslationY(org.telegram.messenger.i0.L(16.0f));
        this.f51462f.setTranslationY(org.telegram.messenger.i0.L(52.0f));
        int L = org.telegram.messenger.i0.L(5.0f);
        int L2 = org.telegram.messenger.i0.L(102.0f);
        int L3 = org.telegram.messenger.i0.L(5.0f);
        int i14 = org.telegram.messenger.i0.f16167n;
        if (u1Var.f52007p1) {
            f7 = 0.0f;
        } else {
            f7 = 40.0f;
        }
        this.f51460b.setPadding(L, L2, L3, org.telegram.messenger.i0.L(f7) + i14);
        super.onMeasure(i10, i11);
    }
}
