package uh;

import ag.y0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.o;
import bi.j6;
import java.util.HashMap;
import og.u;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.ja;
import org.telegram.ui.m10;
import org.telegram.ui.qa1;
import org.telegram.ui.u71;
import org.telegram.ui.yv0;
import rh.d0;
import rh.s;
import s4.x;
import sg.v;
import sg.y;
import th.q4;
import w7.b6;
public final class i extends FrameLayout {
    public static final int f50244a0 = 0;
    public final dw0 D;
    public final j6 E;
    public final vh.d F;
    public final x G;
    public boolean H;
    public boolean I;
    public final m10 J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public float P;
    public float Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public final Rect V;
    public final uq0 W;
    public q4 f50245a;
    public boolean f50246b;
    public float f50247c;
    public int d;
    public int e;
    public final c f50248f;
    public final s51 h;
    public final s4.j f50249n;
    public final rs0 f50250r;
    public final oi f50251s;
    public final e f50252w;
    public final h f50253x;
    public final f f50254y;

    public i(uq0 uq0Var, Context context) {
        super(context);
        this.W = uq0Var;
        this.d = Utilities.j(tz.f18188u1, 6, 2);
        this.e = Utilities.j(tz.f18188u1, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        s51 s51Var = new s51();
        this.h = s51Var;
        s51Var.O = new b(this, 1);
        s51Var.y1(this.d);
        s4.j jVar = new s4.j();
        this.f50249n = jVar;
        jVar.n(280L);
        jVar.o(gr.h);
        jVar.f47927m = false;
        c cVar = new c(this, context);
        this.f50248f = cVar;
        cVar.setScrollingTouchSlop(1);
        cVar.setPinnedSectionOffsetY(-i0.L(2.0f));
        cVar.setPadding(0, 0, 0, 0);
        cVar.setItemAnimator(null);
        cVar.setClipToPadding(false);
        cVar.setSectionsType(2);
        cVar.setLayoutManager(s51Var);
        addView(cVar, b6.c(-1.0f, -1));
        cVar.i(new d(this, 0));
        cVar.setOnItemClickListener(new y0(this, 17));
        cVar.setOnItemLongClickListener(new d0(this, 22));
        ?? tk0Var = new tk0(context, null);
        this.f50250r = tk0Var;
        oi oiVar = new oi(3, this);
        this.f50251s = oiVar;
        tk0Var.setLayoutManager(oiVar);
        tk0Var.i(new d(this, 1));
        oiVar.y1(this.e);
        tk0Var.setVisibility(8);
        addView((View) tk0Var, b6.c(-1.0f, -1));
        e eVar = new e(this, context);
        this.f50252w = eVar;
        cVar.setAdapter(eVar);
        h hVar = new h(this, getContext());
        eVar.f50240f = hVar;
        this.f50253x = hVar;
        tk0Var.setAdapter(hVar);
        f fVar = new f(this, context);
        this.f50254y = fVar;
        fVar.f33274x = false;
        dw0 dw0Var = new dw0(context, fVar, 1, null);
        this.D = dw0Var;
        dw0Var.setVisibility(8);
        dw0Var.setAnimateLayoutChange(true);
        addView(dw0Var, b6.c(-1.0f, -1));
        dw0Var.setOnTouchListener(new qa1(1));
        dw0Var.e(true, false);
        dw0Var.f25550b.setVisibility(8);
        dw0Var.d.setText(cd.L0(2131746713, null));
        dw0Var.e.setText(cd.G(vp.r1(uq0Var.f50260b).U5, "ProfileBotPreviewEmptyText", new Object[0]));
        String L0 = cd.L0(2131746717, null);
        vh.d dVar = dw0Var.f25552f;
        dVar.i(L0, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new a(this, 0));
        j6 j6Var = new j6(this, context);
        this.E = j6Var;
        int i10 = t6.f21311y6;
        p6 p6Var = uq0Var.f50261c;
        a7.V(j6Var, i10, p6Var);
        j6Var.setText(cd.L0(2131746718, null));
        j6Var.setTextSize(1, 14.0f);
        j6Var.setTextAlignment(4);
        j6Var.setGravity(17);
        j6Var.setTypeface(i0.o());
        LinearLayout.LayoutParams t10 = b6.t(165, -2, 17, 0, 17, 0, 12);
        u71 u71Var = dw0Var.f25549a;
        u71Var.addView(j6Var, t10);
        vh.d dVar2 = new vh.d(context, p6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(i0.L(200.0f));
        u71Var.addView(dVar2, b6.r(-2, 44, 17));
        dw0Var.addView(fVar, 0, b6.c(-1.0f, -1));
        cVar.setEmptyView(dw0Var);
        cVar.W1 = true;
        cVar.X1 = 0;
        new SparseArray();
        new HashMap();
        x xVar = new x(new ja(this, 9));
        this.G = xVar;
        xVar.h(cVar);
        m10 m10Var = new m10(context, p6Var);
        this.J = m10Var;
        addView(m10Var, b6.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f50246b) {
            float f7 = this.f50247c;
            float f10 = 1.0f;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            rs0 rs0Var = this.f50250r;
            c cVar = this.f50248f;
            if (i10 == 0) {
                this.f50246b = false;
                int i11 = this.e;
                this.d = i11;
                this.W.D = i11;
                tz.F(i11);
                e eVar = this.f50252w;
                int b10 = eVar.b();
                rs0Var.setVisibility(8);
                int i12 = this.d;
                s51 s51Var = this.h;
                s51Var.y1(i12);
                cVar.a0();
                cVar.invalidate();
                if (eVar.b() == b10) {
                    i0.a4(cVar);
                } else {
                    eVar.f();
                }
                int i13 = this.S;
                if (i13 >= 0) {
                    View m10 = this.f50251s.m(i13);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    s51Var.h1(this.S, (-cVar.getPaddingTop()) + this.T);
                }
            } else if (f7 == 0.0f) {
                this.f50246b = false;
                rs0Var.setVisibility(8);
                cVar.invalidate();
            } else {
                if (f7 > 0.2f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
                ofFloat.addUpdateListener(new o(this, 12));
                ofFloat.addListener(new y(6, this, z10));
                ofFloat.setInterpolator(gr.f26495f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f50246b && !this.W.G.E1) {
            int i12 = this.d;
            if (!z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i13 = i12 + i10;
            if (i13 > 6) {
                if (!z10) {
                    i13 = 9;
                } else {
                    i13 = 6;
                }
            }
            if (this.H) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            int j10 = Utilities.j(i13, 6, i11);
            this.e = j10;
            if (j10 != this.d && !this.H) {
                rs0 rs0Var = this.f50250r;
                rs0Var.setVisibility(0);
                rs0Var.setAdapter(this.f50253x);
                rs0Var.setPadding(rs0Var.getPaddingLeft(), 0, rs0Var.getPaddingRight(), this.J.getMeasuredHeight() + i0.L(42.0f));
                oi oiVar = this.f50251s;
                oiVar.y1(j10);
                rs0Var.a0();
                oiVar.O = new b(this, 0);
                i0.a4(this.f50248f);
                this.f50246b = true;
                this.f50247c = 0.0f;
                int i14 = this.S;
                if (i14 >= 0) {
                    oiVar.h1(i14, this.T - rs0Var.getPaddingTop());
                }
            }
        }
    }

    public final void c() {
        int size;
        boolean z10;
        int i10;
        String a02;
        int i11;
        String L0;
        yv0 yv0Var;
        int i12 = this.W.f50260b;
        q4 q4Var = this.f50245a;
        int i13 = 0;
        if (q4Var == null) {
            size = 0;
        } else {
            size = q4Var.f49636i.size();
        }
        q4 q4Var2 = this.f50245a;
        if (q4Var2 != null && !TextUtils.isEmpty(q4Var2.E)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (size > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        m10 m10Var = this.J;
        m10Var.setVisibility(i10);
        if (z10) {
            a02 = cd.L0(2131746710, null);
        } else {
            a02 = cd.a0(null, null, 2131746709, m31.O0(this.f50245a.E, null, null));
        }
        String L02 = cd.L0(2131746730, null);
        v vVar = new v(this, 26);
        if (!z10 && size > 0) {
            L0 = null;
        } else {
            if (z10) {
                i11 = 2131746712;
            } else {
                i11 = 2131746711;
            }
            L0 = cd.L0(i11, null);
        }
        if (!z10 && size > 0) {
            yv0Var = null;
        } else {
            yv0Var = new yv0(9, this, z10);
        }
        j6 j6Var = (j6) m10Var.d;
        vh.d dVar = (vh.d) m10Var.e;
        ((TextView) m10Var.f39451b).setText(a02);
        ph.i iVar = (ph.i) m10Var.f39452c;
        iVar.i(L02, false, true);
        iVar.setOnClickListener(new s(vVar, 16));
        if (L0 == null) {
            j6Var.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            j6Var.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(L0, false, true);
            dVar.setOnClickListener(new u(3, yv0Var));
        }
        j6 j6Var2 = this.E;
        vh.d dVar2 = this.F;
        dw0 dw0Var = this.D;
        if (z10) {
            dw0Var.d.setVisibility(0);
            dw0Var.d.setText(cd.L0(2131746713, null));
            dw0Var.e.setText(cd.G(vp.r1(i12).U5, "ProfileBotPreviewEmptyText", new Object[0]));
            dw0Var.f25552f.i(cd.L0(2131746717, null), false, true);
            j6Var2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            dw0Var.d.setVisibility(8);
            dw0Var.e.setText(cd.a0(null, null, 2131746709, m31.O0(this.f50245a.E, null, null)));
            dw0Var.f25552f.i(cd.L0(2131746717, null), false, true);
            j6Var2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(cd.L0(2131746711, null), false, true);
            dVar2.setOnClickListener(new a(this, 1));
        }
        vh.d dVar3 = dw0Var.f25552f;
        if (this.f50252w.b() >= vp.r1(i12).U5) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f50250r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c cVar = this.f50248f;
        cVar.setPadding(cVar.getPaddingLeft(), cVar.f30011e3, cVar.getPaddingRight(), this.J.getMeasuredHeight() + i0.L(42.0f));
    }

    public void setList(q4 q4Var) {
        if (this.f50245a != q4Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.D;
        }
        this.f50245a = q4Var;
        e eVar = this.f50252w;
        eVar.e = q4Var;
        if (eVar != eVar.f50243s.f50253x) {
            eVar.M();
        }
        eVar.f();
        h hVar = this.f50253x;
        hVar.e = q4Var;
        if (hVar != hVar.f50243s.f50253x) {
            hVar.M();
        }
        hVar.f();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, i0.L(280.0f)))) / 2.0f;
        this.D.setTranslationY(f7);
        this.f50254y.setTranslationY(-f7);
    }
}
