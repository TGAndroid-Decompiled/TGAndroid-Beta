package vh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.gr;
public final class l1 extends h1 {
    public final b1 f51445b;
    public final k1 f51446c;
    public final s4.r d;
    public final j1 e;
    public final p1 f51447f;
    public int h;
    public float f51448n;
    public boolean f51449r;
    public final u1 f51450s;

    public l1(u1 u1Var, Context context) {
        super(context);
        this.f51450s = u1Var;
        this.h = 8;
        this.f51448n = -1.0f;
        this.f51449r = false;
        b1 b1Var = new b1(context);
        this.f51445b = b1Var;
        k1 k1Var = new k1(this);
        this.f51446c = k1Var;
        b1Var.setAdapter(k1Var);
        s4.r rVar = new s4.r(this.h);
        this.d = rVar;
        b1Var.setLayoutManager(rVar);
        b1Var.setClipToPadding(true);
        b1Var.setVerticalScrollBarEnabled(false);
        rVar.O = new jg.h1(this, 17);
        b1Var.setOnItemClickListener(new ag.y0(this, 20));
        b1Var.setOnScrollListener(new bu0(this, 25));
        s4.j jVar = new s4.j();
        jVar.f47967c = 220L;
        jVar.e = 220L;
        jVar.f47968f = 160L;
        jVar.f47969g = 160L;
        jVar.f47970i = gr.f26496g;
        b1Var.setItemAnimator(jVar);
        addView(b1Var, w7.b6.c(-1.0f, -1));
        int i10 = u1.f51993y1;
        p1 p1Var = new p1(context, u1Var.I0);
        this.f51447f = p1Var;
        p1Var.f51724x = new qh.d(this, 17);
        addView(p1Var, w7.b6.e(-1, -2, 48));
        j1 j1Var = new j1(this, context, u1Var.I0);
        this.e = j1Var;
        addView(j1Var, w7.b6.c(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        this.f51225a = i10;
        int i12 = 0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51445b.f50938f3 = z10;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.y1(i11);
        boolean z11 = this.f51449r;
        k1 k1Var = this.f51446c;
        if (!z11) {
            k1Var.D(null);
        }
        u1 u1Var = this.f51450s;
        int i13 = u1Var.f51995j1;
        p1 p1Var = this.f51447f;
        if (i13 >= 0) {
            p1Var.f51722s = true;
            p1Var.e.setText("");
            p1Var.f51722s = false;
            o1 o1Var = p1Var.h;
            if (o1Var != null) {
                o1Var.H1(u1Var.f51995j1);
                p1Var.h.F1();
                if (p1Var.h.getSelectedCategory() != null) {
                    k1Var.H = p1Var.h.getSelectedCategory().f32548a;
                    d0 d0Var = k1Var.M;
                    org.telegram.messenger.i0.r(d0Var);
                    org.telegram.messenger.i0.g3(d0Var);
                }
            }
        } else if (!TextUtils.isEmpty(u1Var.f51994i1)) {
            p1Var.e.setText(u1Var.f51994i1);
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
        p1Var.a(i10, u1Var.f52001q1);
        ui b02 = ui.b0(u1Var.f21583a);
        if (i10 == 0) {
            i12 = 5;
        }
        b02.B(i12);
    }

    @Override
    public final float b() {
        View childAt;
        float f7 = this.f51448n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            b1 b1Var = this.f51445b;
            if (i10 >= b1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = b1Var.getChildAt(i10).getTag();
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
        this.f51447f.setTranslationY(org.telegram.messenger.i0.L(52.0f) + max);
        b1 b1Var = this.f51445b;
        b1Var.f50939g3 = max + b1Var.getPaddingTop();
        b1Var.f50940h3 = b1Var.getHeight() - b1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12 = u1.f51993y1;
        u1 u1Var = this.f51450s;
        int i13 = u1Var.f21615t0;
        setPadding(i13, 0, i13, 0);
        this.e.setTranslationY(org.telegram.messenger.i0.L(16.0f));
        this.f51447f.setTranslationY(org.telegram.messenger.i0.L(52.0f));
        int L = org.telegram.messenger.i0.L(5.0f);
        int L2 = org.telegram.messenger.i0.L(102.0f);
        int L3 = org.telegram.messenger.i0.L(5.0f);
        int i14 = org.telegram.messenger.i0.f16021n;
        if (u1Var.f52000p1) {
            f7 = 0.0f;
        } else {
            f7 = 40.0f;
        }
        this.f51445b.setPadding(L, L2, L3, org.telegram.messenger.i0.L(f7) + i14);
        super.onMeasure(i10, i11);
    }
}
