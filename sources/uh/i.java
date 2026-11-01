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
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.uz;
import org.telegram.messenger.wp;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.ja;
import org.telegram.ui.l10;
import org.telegram.ui.oa1;
import org.telegram.ui.s71;
import org.telegram.ui.xv0;
import rh.d0;
import rh.s;
import s4.x;
import sg.v;
import sg.y;
import th.q4;
import w7.b6;
public final class i extends FrameLayout {
    public static final int f50258a0 = 0;
    public final ew0 D;
    public final j6 E;
    public final vh.d F;
    public final x G;
    public boolean H;
    public boolean I;
    public final l10 J;
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
    public final vq0 W;
    public q4 f50259a;
    public boolean f50260b;
    public float f50261c;
    public int d;
    public int e;
    public final c f50262f;
    public final t51 h;
    public final s4.j f50263n;
    public final ss0 f50264r;
    public final oi f50265s;
    public final e f50266w;
    public final h f50267x;
    public final f f50268y;

    public i(vq0 vq0Var, Context context) {
        super(context);
        this.W = vq0Var;
        this.d = Utilities.j(uz.f18557u1, 6, 2);
        this.e = Utilities.j(uz.f18557u1, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        t51 t51Var = new t51();
        this.h = t51Var;
        t51Var.O = new b(this, 1);
        t51Var.y1(this.d);
        s4.j jVar = new s4.j();
        this.f50263n = jVar;
        jVar.n(280L);
        jVar.o(gr.h);
        jVar.f47938m = false;
        c cVar = new c(this, context);
        this.f50262f = cVar;
        cVar.setScrollingTouchSlop(1);
        cVar.setPinnedSectionOffsetY(-i0.L(2.0f));
        cVar.setPadding(0, 0, 0, 0);
        cVar.setItemAnimator(null);
        cVar.setClipToPadding(false);
        cVar.setSectionsType(2);
        cVar.setLayoutManager(t51Var);
        addView(cVar, b6.c(-1.0f, -1));
        cVar.i(new d(this, 0));
        cVar.setOnItemClickListener(new y0(this, 17));
        cVar.setOnItemLongClickListener(new d0(this, 22));
        ?? uk0Var = new uk0(context, null);
        this.f50264r = uk0Var;
        oi oiVar = new oi(3, this);
        this.f50265s = oiVar;
        uk0Var.setLayoutManager(oiVar);
        uk0Var.i(new d(this, 1));
        oiVar.y1(this.e);
        uk0Var.setVisibility(8);
        addView((View) uk0Var, b6.c(-1.0f, -1));
        e eVar = new e(this, context);
        this.f50266w = eVar;
        cVar.setAdapter(eVar);
        h hVar = new h(this, getContext());
        eVar.f50254f = hVar;
        this.f50267x = hVar;
        uk0Var.setAdapter(hVar);
        f fVar = new f(this, context);
        this.f50268y = fVar;
        fVar.f33280x = false;
        ew0 ew0Var = new ew0(context, fVar, 1, null);
        this.D = ew0Var;
        ew0Var.setVisibility(8);
        ew0Var.setAnimateLayoutChange(true);
        addView(ew0Var, b6.c(-1.0f, -1));
        ew0Var.setOnTouchListener(new oa1(1));
        ew0Var.e(true, false);
        ew0Var.f25947b.setVisibility(8);
        ew0Var.d.setText(dd.L0(2131746713, null));
        ew0Var.e.setText(dd.G(wp.r1(vq0Var.f50274b).U5, "ProfileBotPreviewEmptyText", new Object[0]));
        String L0 = dd.L0(2131746717, null);
        vh.d dVar = ew0Var.f25949f;
        dVar.i(L0, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new a(this, 0));
        j6 j6Var = new j6(this, context);
        this.E = j6Var;
        int i10 = t6.f21312y6;
        p6 p6Var = vq0Var.f50275c;
        a7.V(j6Var, i10, p6Var);
        j6Var.setText(dd.L0(2131746718, null));
        j6Var.setTextSize(1, 14.0f);
        j6Var.setTextAlignment(4);
        j6Var.setGravity(17);
        j6Var.setTypeface(i0.o());
        LinearLayout.LayoutParams t10 = b6.t(165, -2, 17, 0, 17, 0, 12);
        s71 s71Var = ew0Var.f25946a;
        s71Var.addView(j6Var, t10);
        vh.d dVar2 = new vh.d(context, p6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(i0.L(200.0f));
        s71Var.addView(dVar2, b6.r(-2, 44, 17));
        ew0Var.addView(fVar, 0, b6.c(-1.0f, -1));
        cVar.setEmptyView(ew0Var);
        cVar.W1 = true;
        cVar.X1 = 0;
        new SparseArray();
        new HashMap();
        x xVar = new x(new ja(this, 9));
        this.G = xVar;
        xVar.h(cVar);
        l10 l10Var = new l10(context, p6Var);
        this.J = l10Var;
        addView(l10Var, b6.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f50260b) {
            float f7 = this.f50261c;
            float f10 = 1.0f;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            ss0 ss0Var = this.f50264r;
            c cVar = this.f50262f;
            if (i10 == 0) {
                this.f50260b = false;
                int i11 = this.e;
                this.d = i11;
                this.W.D = i11;
                uz.F(i11);
                e eVar = this.f50266w;
                int b10 = eVar.b();
                ss0Var.setVisibility(8);
                int i12 = this.d;
                t51 t51Var = this.h;
                t51Var.y1(i12);
                cVar.a0();
                cVar.invalidate();
                if (eVar.b() == b10) {
                    i0.a4(cVar);
                } else {
                    eVar.f();
                }
                int i13 = this.S;
                if (i13 >= 0) {
                    View m10 = this.f50265s.m(i13);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    t51Var.h1(this.S, (-cVar.getPaddingTop()) + this.T);
                }
            } else if (f7 == 0.0f) {
                this.f50260b = false;
                ss0Var.setVisibility(8);
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
                ofFloat.setInterpolator(gr.f26523f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f50260b && !this.W.G.E1) {
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
                ss0 ss0Var = this.f50264r;
                ss0Var.setVisibility(0);
                ss0Var.setAdapter(this.f50267x);
                ss0Var.setPadding(ss0Var.getPaddingLeft(), 0, ss0Var.getPaddingRight(), this.J.getMeasuredHeight() + i0.L(42.0f));
                oi oiVar = this.f50265s;
                oiVar.y1(j10);
                ss0Var.a0();
                oiVar.O = new b(this, 0);
                i0.a4(this.f50262f);
                this.f50260b = true;
                this.f50261c = 0.0f;
                int i14 = this.S;
                if (i14 >= 0) {
                    oiVar.h1(i14, this.T - ss0Var.getPaddingTop());
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
        xv0 xv0Var;
        int i12 = this.W.f50274b;
        q4 q4Var = this.f50259a;
        int i13 = 0;
        if (q4Var == null) {
            size = 0;
        } else {
            size = q4Var.f49650i.size();
        }
        q4 q4Var2 = this.f50259a;
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
        l10 l10Var = this.J;
        l10Var.setVisibility(i10);
        if (z10) {
            a02 = dd.L0(2131746710, null);
        } else {
            a02 = dd.a0(null, null, 2131746709, n31.O0(this.f50259a.E, null, null));
        }
        String L02 = dd.L0(2131746730, null);
        v vVar = new v(this, 26);
        if (!z10 && size > 0) {
            L0 = null;
        } else {
            if (z10) {
                i11 = 2131746712;
            } else {
                i11 = 2131746711;
            }
            L0 = dd.L0(i11, null);
        }
        if (!z10 && size > 0) {
            xv0Var = null;
        } else {
            xv0Var = new xv0(9, this, z10);
        }
        j6 j6Var = (j6) l10Var.d;
        vh.d dVar = (vh.d) l10Var.e;
        ((TextView) l10Var.f39050b).setText(a02);
        ph.i iVar = (ph.i) l10Var.f39051c;
        iVar.i(L02, false, true);
        iVar.setOnClickListener(new s(vVar, 16));
        if (L0 == null) {
            j6Var.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            j6Var.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(L0, false, true);
            dVar.setOnClickListener(new u(3, xv0Var));
        }
        j6 j6Var2 = this.E;
        vh.d dVar2 = this.F;
        ew0 ew0Var = this.D;
        if (z10) {
            ew0Var.d.setVisibility(0);
            ew0Var.d.setText(dd.L0(2131746713, null));
            ew0Var.e.setText(dd.G(wp.r1(i12).U5, "ProfileBotPreviewEmptyText", new Object[0]));
            ew0Var.f25949f.i(dd.L0(2131746717, null), false, true);
            j6Var2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            ew0Var.d.setVisibility(8);
            ew0Var.e.setText(dd.a0(null, null, 2131746709, n31.O0(this.f50259a.E, null, null)));
            ew0Var.f25949f.i(dd.L0(2131746717, null), false, true);
            j6Var2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(dd.L0(2131746711, null), false, true);
            dVar2.setOnClickListener(new a(this, 1));
        }
        vh.d dVar3 = ew0Var.f25949f;
        if (this.f50266w.b() >= wp.r1(i12).U5) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f50264r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c cVar = this.f50262f;
        cVar.setPadding(cVar.getPaddingLeft(), cVar.f30435e3, cVar.getPaddingRight(), this.J.getMeasuredHeight() + i0.L(42.0f));
    }

    public void setList(q4 q4Var) {
        if (this.f50259a != q4Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.D;
        }
        this.f50259a = q4Var;
        e eVar = this.f50266w;
        eVar.e = q4Var;
        if (eVar != eVar.f50257s.f50267x) {
            eVar.M();
        }
        eVar.f();
        h hVar = this.f50267x;
        hVar.e = q4Var;
        if (hVar != hVar.f50257s.f50267x) {
            hVar.M();
        }
        hVar.f();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, i0.L(280.0f)))) / 2.0f;
        this.D.setTranslationY(f7);
        this.f50268y.setTranslationY(-f7);
    }
}
