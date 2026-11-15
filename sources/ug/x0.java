package ug;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import c8.ja;
import di.c6;
import di.k4;
import fi.f4;
import fi.m3;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.pz;
import org.telegram.messenger.qz;
import org.telegram.messenger.si;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.y50;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ct0;
import org.telegram.ui.ss0;
import org.telegram.ui.ts0;
import org.telegram.ui.w61;
public final class x0 extends u2 implements is {
    public static final int J1 = 0;
    public boolean A1;
    public int B1;
    public int C1;
    public float D1;
    public final ts0 E1;
    public int F1;
    public int G1;
    public int H1;
    public o7 I1;
    public final e2 f58370m1;
    public final q0 n1;
    public final ArrayList f58371o1;
    public float f58372p1;
    public float f58373q1;
    public boolean f58374r1;
    public final v0 f58375s1;
    public final w61 f58376t1;
    public int f58377u1;
    public final FrameLayout f58378v1;
    public boolean f58379w1;
    public final pz f58380x1;
    public final int f58381y1;
    public final boolean f58382z1;

    public x0(int i7, Context context, e6 e6Var) {
        this(null, context, m10.f24940t0, false, i7, true, null, e6Var);
    }

    @Override
    public final boolean H() {
        int i7 = 0;
        while (true) {
            v0 v0Var = this.f58375s1;
            if (i7 >= v0Var.getChildCount()) {
                return true;
            }
            w0 w0Var = (w0) v0Var.getChildAt(i7);
            if (w0Var.f58352a == this.B1) {
                ViewGroup viewGroup = w0Var.f58356f;
                if (viewGroup instanceof a) {
                    return !((a) viewGroup).f58030b.canScrollVertically(-1);
                }
            }
            i7++;
        }
    }

    public final void I0() {
        v0 v0Var;
        int i7;
        float f10;
        View m10;
        View m11;
        int i10 = -1;
        boolean z10 = false;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            v0Var = this.f58375s1;
            if (i12 >= v0Var.getChildCount()) {
                break;
            }
            w0 w0Var = (w0) v0Var.getChildAt(i12);
            int i13 = w0Var.f58352a;
            ViewGroup viewGroup = w0Var.f58356f;
            if (i13 == this.B1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).f58031c.m(0)) == null || (i10 = m11.getTop()) < 0)) {
                i10 = 0;
            }
            if (w0Var.f58352a == this.C1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).f58031c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
                i11 = 0;
            }
            i12++;
        }
        int i14 = this.G1;
        if (i10 >= 0) {
            float f11 = 1.0f - this.D1;
            i14 = Math.min(i14, (int) com.google.android.gms.internal.vision.e2.z(1.0f, f11, i14, i10 * f11));
        }
        if (i11 >= 0) {
            float f12 = this.D1;
            i14 = Math.min(i14, (int) com.google.android.gms.internal.vision.e2.z(1.0f, f12, this.G1, i11 * f12));
        }
        FrameLayout frameLayout = this.f58378v1;
        frameLayout.setAlpha(1.0f - this.f58373q1);
        if (this.f58372p1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.f58374r1;
        w61 w61Var = this.f58376t1;
        if (z11) {
            i7 = w61Var.getMeasuredWidth();
        } else {
            i7 = -w61Var.getMeasuredWidth();
        }
        w61Var.setTranslationX(i7 * this.f58373q1);
        if (i14 != this.H1) {
            this.H1 = i14;
            for (int i15 = 0; i15 < v0Var.getChildCount(); i15++) {
                if (!((w0) v0Var.getChildAt(i15)).h) {
                    v0Var.getChildAt(i15).setTranslationY(this.H1);
                }
            }
            w61Var.setTranslationY(this.H1);
            frameLayout.setTranslationY(this.H1);
            this.f29682b.invalidate();
            int i16 = this.H1;
            if (this.f58381y1 == 40) {
                f10 = 5.0f;
            } else {
                f10 = 30.0f;
            }
            if (i16 < org.telegram.messenger.g0.L(f10)) {
                z10 = true;
            }
            org.telegram.messenger.g0.Y3(this.I1, z10, 1.0f, true, true);
        }
    }

    public final void J0() {
        boolean z10 = this.A1;
        q0 q0Var = this.n1;
        if (z10) {
            q0Var.f58267f.setText(hd.M0(2131754942, null));
        } else if (this.f58382z1) {
            int i7 = this.f58381y1;
            if (i7 == 4) {
                q0Var.f58267f.setText(hd.M0(2131743859, null));
                q0Var.setIcon(2131624315);
            } else if (i7 == 10) {
                q0Var.f58267f.setText(hd.M0(2131743860, null));
                q0Var.setIcon(2131624315);
            } else {
                q0Var.f58267f.setText(hd.M0(2131754942, null));
            }
        } else {
            q0Var.f58267f.setText(PremiumPreviewFragment.t0(this.f29679a, this.E1));
        }
    }

    public final void K0() {
        this.A1 = true;
        q0 q0Var = this.n1;
        q0Var.f58269r = false;
        q0Var.d(true);
        J0();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ns.f25521j5 && i7 != ns.f25504g5) {
            if (i7 == ns.f25498f5) {
                boolean q10 = m10.i(this.f29679a).q();
                q0 q0Var = this.n1;
                if (q10) {
                    q0Var.c(hd.M0(2131747831, null), false, true);
                    return;
                }
                q0Var.f58269r = false;
                q0Var.d(true);
                return;
            }
            return;
        }
        J0();
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ns.e().n(this, ns.f25521j5);
        ns.f(this.f29679a).n(this, ns.f25504g5);
        ns.f(this.f29679a).n(this, ns.f25498f5);
        ns.e().k(ns.f25523k1, 16);
    }

    @Override
    public final boolean m0() {
        v0 v0Var = this.f58375s1;
        if (v0Var.getChildCount() > 0) {
            w0 w0Var = (w0) v0Var.getChildAt(0);
            ViewGroup viewGroup = w0Var.f58356f;
            if (viewGroup instanceof o0) {
                o0 o0Var = (o0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(w0Var.getMeasuredWidth(), 0.0f);
                o0Var.setOffset(w0Var.getMeasuredWidth());
                this.f58379w1 = true;
                ofFloat.addUpdateListener(new f4(o0Var, 13));
                ofFloat.addListener(new y50(21, this, o0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(er.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ns.e().c(this, ns.f25521j5);
        ns.f(this.f29679a).c(this, ns.f25504g5);
        ns.f(this.f29679a).c(this, ns.f25498f5);
        o7 o7Var = new o7(7, getContext(), this);
        this.I1 = o7Var;
        q6.h(j6.f28922h5, o7Var, this.J0);
        q6.l(this.I1, 5, j6.G6, this.J0);
        q6.l(this.I1, 3, j6.f29262z8, this.J0);
        o7 o7Var2 = this.I1;
        int i7 = j6.f29243y8;
        q6.l(o7Var2, 1, i7, this.J0);
        q6.b(this.I1, i7, this.J0, true);
        this.I1.setCastShadows(true);
        this.I1.setExtraHeight(org.telegram.messenger.g0.L(2.0f));
        this.I1.setBackButtonImage(2131231240);
        this.I1.setActionBarMenuOnItemClick(new ct0(this, 24));
        this.f29682b.addView(this.I1, ja.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.I1.getLayoutParams()).topMargin = (-this.f29716t0) - org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.Y3(this.I1, false, 1.0f, true, false);
        int i10 = this.B1;
        ArrayList arrayList = this.f58371o1;
        if (((ss0) arrayList.get(i10)).f51269a == 14) {
            this.I1.setTitle(hd.M0(2131743805, null));
            this.I1.requestLayout();
        } else if (((ss0) arrayList.get(this.B1)).f51269a == 28) {
            this.I1.setTitle(hd.M0(2131744252, null));
            this.I1.requestLayout();
        } else if (((ss0) arrayList.get(this.B1)).f51269a == 40) {
            this.I1.setTitle(hd.M0(2131750837, null));
            this.I1.requestLayout();
        } else {
            this.I1.setTitle(hd.M0(2131751349, null));
            this.I1.requestLayout();
        }
    }

    @Override
    public final void show() {
        super.show();
        ns.e().k(ns.f25518j1, 16);
    }

    public x0(e2 e2Var, int i7, boolean z10) {
        this(e2Var, e2Var.getContext(), e2Var.getCurrentAccount(), false, i7, z10, null);
    }

    public x0(e2 e2Var, Context context, int i7, int i10, boolean z10) {
        this(e2Var, context, i7, false, i10, z10, null);
    }

    public x0(org.telegram.ui.ActionBar.e2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.ts0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: ug.x0.<init>(org.telegram.ui.ActionBar.e2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.ts0):void");
    }

    public x0(e2 e2Var, Context context, int i7, boolean z10, int i10, boolean z11, ts0 ts0Var, e6 e6Var) {
        super(1, context, e6Var, false);
        ArrayList arrayList = new ArrayList();
        this.f58371o1 = arrayList;
        this.F1 = 255;
        this.f58370m1 = e2Var;
        this.E1 = ts0Var;
        Q(j6.f28922h5);
        this.f58381y1 = i10;
        this.f58382z1 = z11;
        this.f58380x1 = qz.i(org.telegram.messenger.g0.y2(null, 2131624216));
        m01 m01Var = new m01(12, getContext(), this);
        if (!z10 && i10 != 35) {
            PremiumPreviewFragment.s0(i7, arrayList);
        } else {
            PremiumPreviewFragment.r0(i7, arrayList, false);
            PremiumPreviewFragment.r0(i7, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new ss0(40, 2131231216, hd.M0(2131750837, null), hd.M0(2131750836, null)));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f58371o1.size()) {
                i11 = 0;
                break;
            } else if (((ss0) this.f58371o1.get(i11)).f51269a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (z11) {
            this.f58371o1.clear();
            this.f58371o1.add((ss0) this.f58371o1.get(i11));
            i11 = 0;
        }
        ss0 ss0Var = (ss0) this.f58371o1.get(i11);
        this.f29718v0 = false;
        this.f29720w0 = false;
        this.U0 = false;
        z0 z0Var = new z0(j6.Rk, j6.Sk, j6.Tk, -1, null);
        z0Var.f58400o = 1.1f;
        z0Var.f58401p = 1.5f;
        z0Var.f58402q = -0.2f;
        z0Var.f58398m = true;
        w61 w61Var = new w61(this, getContext(), z0Var, 5);
        this.f58376t1 = w61Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f58378v1 = frameLayout;
        frameLayout.setContentDescription(hd.M0(2131752041, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131232097);
        int L = org.telegram.messenger.g0.L(12.0f);
        int o4 = i0.a.o(-1, 40);
        int o10 = i0.a.o(-1, 100);
        imageView.setBackground(j6.k0(L, L, L, L, o4, o10, o10));
        frameLayout.addView(imageView, ja.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final x0 f58304b;

            {
                this.f58304b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f58304b.dismiss();
                        return;
                    default:
                        this.f58304b.dismiss();
                        return;
                }
            }
        });
        m01Var.addView(w61Var, ja.t(-1, -2, 1, 0, 16, 0, 0));
        v0 v0Var = new v0(this, getContext());
        this.f58375s1 = v0Var;
        v0Var.setOverScrollMode(2);
        v0Var.setOffscreenPageLimit(0);
        v0Var.setAdapter(new d20(this, 4));
        this.B1 = i11;
        v0Var.setCurrentItem(i11);
        m01Var.addView(v0Var, ja.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        m01Var.addView(frameLayout, ja.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        aa aaVar = new aa(getContext(), v0Var, this.f58371o1.size());
        v0Var.b(new fi.o7(this, aaVar, 1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(m01Var);
        linearLayout.setOrientation(1);
        int i12 = j6.V8;
        int i13 = j6.P9;
        aaVar.f32941n = i12;
        aaVar.f32942r = i13;
        if (!z11) {
            linearLayout.addView(aaVar, ja.t(this.f58371o1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        q0 q0Var = new q0(getContext(), e6Var, true);
        this.n1 = q0Var;
        q0Var.f58271w.setOnClickListener(new m3(this, e2Var, z11, ss0Var, 5));
        q0Var.h.setOnClickListener(new View.OnClickListener(this) {
            public final x0 f58304b;

            {
                this.f58304b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f58304b.dismiss();
                        return;
                    default:
                        this.f58304b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(q0Var, ja.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        q6.h(j6.f28922h5, frameLayout2, e6Var);
        linearLayout.addView(frameLayout2, ja.r(-1, 68, 80));
        if (i10 == 40) {
            q0Var.c(c6.h2(hd.M0(2131743888, null)), true, false);
        } else if (m10.i(i7).q()) {
            q0Var.c(hd.M0(2131747831, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.O = scrollView;
        si.b0(i7).o1();
        J0();
        this.V0 = 83;
        k4 k4Var = new k4(this, getContext(), scrollView, getContext().getDrawable(2131231237).mutate());
        this.f29682b = k4Var;
        int i14 = this.f29717u0;
        k4Var.setPadding(i14, this.f29716t0 - 1, i14, 0);
    }
}
