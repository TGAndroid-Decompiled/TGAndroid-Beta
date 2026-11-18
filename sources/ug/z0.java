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
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import di.f6;
import di.n4;
import fi.d4;
import fi.k3;
import fi.l7;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.lz;
import org.telegram.messenger.mz;
import org.telegram.messenger.ri;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.w01;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.hs0;
import org.telegram.ui.ws0;
import org.telegram.ui.xs0;
import org.telegram.ui.y61;
public final class z0 extends x2 implements fs {
    public static final int J1 = 0;
    public boolean A1;
    public int B1;
    public int C1;
    public float D1;
    public final xs0 E1;
    public int F1;
    public int G1;
    public int H1;
    public v7 I1;
    public final h2 f58958m1;
    public final s0 n1;
    public final ArrayList f58959o1;
    public float f58960p1;
    public float f58961q1;
    public boolean f58962r1;
    public final x0 f58963s1;
    public final y61 f58964t1;
    public int f58965u1;
    public final FrameLayout f58966v1;
    public boolean f58967w1;
    public final lz f58968x1;
    public final int f58969y1;
    public final boolean f58970z1;

    public z0(int i7, Context context, i6 i6Var) {
        this(null, context, j10.f24770t0, false, i7, true, null, i6Var);
    }

    @Override
    public final boolean G() {
        int i7 = 0;
        while (true) {
            x0 x0Var = this.f58963s1;
            if (i7 >= x0Var.getChildCount()) {
                return true;
            }
            y0 y0Var = (y0) x0Var.getChildAt(i7);
            if (y0Var.f58950a == this.B1) {
                ViewGroup viewGroup = y0Var.f58954f;
                if (viewGroup instanceof a) {
                    return !((a) viewGroup).f58596b.canScrollVertically(-1);
                }
            }
            i7++;
        }
    }

    public final void J0() {
        x0 x0Var;
        int i7;
        float f10;
        View m10;
        View m11;
        int i10 = -1;
        boolean z10 = false;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            x0Var = this.f58963s1;
            if (i12 >= x0Var.getChildCount()) {
                break;
            }
            y0 y0Var = (y0) x0Var.getChildAt(i12);
            int i13 = y0Var.f58950a;
            ViewGroup viewGroup = y0Var.f58954f;
            if (i13 == this.B1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).f58597c.m(0)) == null || (i10 = m11.getTop()) < 0)) {
                i10 = 0;
            }
            if (y0Var.f58950a == this.C1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).f58597c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
                i11 = 0;
            }
            i12++;
        }
        int i14 = this.G1;
        if (i10 >= 0) {
            float f11 = 1.0f - this.D1;
            i14 = Math.min(i14, (int) e2.z(1.0f, f11, i14, i10 * f11));
        }
        if (i11 >= 0) {
            float f12 = this.D1;
            i14 = Math.min(i14, (int) e2.z(1.0f, f12, this.G1, i11 * f12));
        }
        FrameLayout frameLayout = this.f58966v1;
        frameLayout.setAlpha(1.0f - this.f58961q1);
        if (this.f58960p1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.f58962r1;
        y61 y61Var = this.f58964t1;
        if (z11) {
            i7 = y61Var.getMeasuredWidth();
        } else {
            i7 = -y61Var.getMeasuredWidth();
        }
        y61Var.setTranslationX(i7 * this.f58961q1);
        if (i14 != this.H1) {
            this.H1 = i14;
            for (int i15 = 0; i15 < x0Var.getChildCount(); i15++) {
                if (!((y0) x0Var.getChildAt(i15)).h) {
                    x0Var.getChildAt(i15).setTranslationY(this.H1);
                }
            }
            y61Var.setTranslationY(this.H1);
            frameLayout.setTranslationY(this.H1);
            this.f30190b.invalidate();
            int i16 = this.H1;
            if (this.f58969y1 == 40) {
                f10 = 5.0f;
            } else {
                f10 = 30.0f;
            }
            if (i16 < org.telegram.messenger.g0.L(f10)) {
                z10 = true;
            }
            org.telegram.messenger.g0.X3(this.I1, z10, 1.0f, true, true);
        }
    }

    public final void K0() {
        boolean z10 = this.A1;
        s0 s0Var = this.n1;
        if (z10) {
            s0Var.f58864f.setText(gd.M0(2131754942, null));
        } else if (this.f58970z1) {
            int i7 = this.f58969y1;
            if (i7 == 4) {
                s0Var.f58864f.setText(gd.M0(2131743622, null));
                s0Var.setIcon(2131624315);
            } else if (i7 == 10) {
                s0Var.f58864f.setText(gd.M0(2131743623, null));
                s0Var.setIcon(2131624315);
            } else {
                s0Var.f58864f.setText(gd.M0(2131754942, null));
            }
        } else {
            s0Var.f58864f.setText(PremiumPreviewFragment.t0(this.f30187a, this.E1));
        }
    }

    public final void L0() {
        this.A1 = true;
        s0 s0Var = this.n1;
        s0Var.f58866r = false;
        s0Var.d(true);
        K0();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ks.f25154m5 && i7 != ks.f25138j5) {
            if (i7 == ks.f25133i5) {
                boolean q10 = j10.i(this.f30187a).q();
                s0 s0Var = this.n1;
                if (q10) {
                    s0Var.c(gd.M0(2131747638, null), false, true);
                    return;
                }
                s0Var.f58866r = false;
                s0Var.d(true);
                return;
            }
            return;
        }
        K0();
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ks.e().n(this, ks.f25154m5);
        ks.f(this.f30187a).n(this, ks.f25138j5);
        ks.f(this.f30187a).n(this, ks.f25133i5);
        ks.e().k(ks.f25140k1, 16);
    }

    @Override
    public final boolean m0() {
        x0 x0Var = this.f58963s1;
        if (x0Var.getChildCount() > 0) {
            y0 y0Var = (y0) x0Var.getChildAt(0);
            ViewGroup viewGroup = y0Var.f58954f;
            if (viewGroup instanceof q0) {
                q0 q0Var = (q0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(y0Var.getMeasuredWidth(), 0.0f);
                q0Var.setOffset(y0Var.getMeasuredWidth());
                this.f58967w1 = true;
                ofFloat.addUpdateListener(new d4(q0Var, 13));
                ofFloat.addListener(new h60(21, this, q0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(lr.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ks.e().c(this, ks.f25154m5);
        ks.f(this.f30187a).c(this, ks.f25138j5);
        ks.f(this.f30187a).c(this, ks.f25133i5);
        v7 v7Var = new v7(7, getContext(), this);
        this.I1 = v7Var;
        u6.h(n6.f29467h5, v7Var, this.J0);
        u6.l(this.I1, 5, n6.G6, this.J0);
        u6.l(this.I1, 3, n6.f29807z8, this.J0);
        v7 v7Var2 = this.I1;
        int i7 = n6.f29788y8;
        u6.l(v7Var2, 1, i7, this.J0);
        u6.b(this.I1, i7, this.J0, true);
        this.I1.setCastShadows(true);
        this.I1.setExtraHeight(org.telegram.messenger.g0.L(2.0f));
        this.I1.setBackButtonImage(2131231240);
        this.I1.setActionBarMenuOnItemClick(new hs0(this, 26));
        this.f30190b.addView(this.I1, ma.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.I1.getLayoutParams()).topMargin = (-this.f30224t0) - org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.X3(this.I1, false, 1.0f, true, false);
        int i10 = this.B1;
        ArrayList arrayList = this.f58959o1;
        if (((ws0) arrayList.get(i10)).f53469a == 14) {
            this.I1.setTitle(gd.M0(2131743568, null));
            this.I1.requestLayout();
        } else if (((ws0) arrayList.get(this.B1)).f53469a == 28) {
            this.I1.setTitle(gd.M0(2131744017, null));
            this.I1.requestLayout();
        } else if (((ws0) arrayList.get(this.B1)).f53469a == 40) {
            this.I1.setTitle(gd.M0(2131750826, null));
            this.I1.requestLayout();
        } else {
            this.I1.setTitle(gd.M0(2131751338, null));
            this.I1.requestLayout();
        }
    }

    @Override
    public final void show() {
        super.show();
        ks.e().k(ks.f25135j1, 16);
    }

    public z0(h2 h2Var, int i7, boolean z10) {
        this(h2Var, h2Var.getContext(), h2Var.getCurrentAccount(), false, i7, z10, null);
    }

    public z0(h2 h2Var, Context context, int i7, int i10, boolean z10) {
        this(h2Var, context, i7, false, i10, z10, null);
    }

    public z0(org.telegram.ui.ActionBar.h2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.xs0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: ug.z0.<init>(org.telegram.ui.ActionBar.h2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.xs0):void");
    }

    public z0(h2 h2Var, Context context, int i7, boolean z10, int i10, boolean z11, xs0 xs0Var, i6 i6Var) {
        super(1, context, i6Var, false);
        ArrayList arrayList = new ArrayList();
        this.f58959o1 = arrayList;
        this.F1 = 255;
        this.f58958m1 = h2Var;
        this.E1 = xs0Var;
        Q(n6.f29467h5);
        this.f58969y1 = i10;
        this.f58970z1 = z11;
        this.f58968x1 = mz.i(org.telegram.messenger.g0.y2(null, 2131624216));
        w01 w01Var = new w01(11, getContext(), this);
        if (!z10 && i10 != 35) {
            PremiumPreviewFragment.s0(i7, arrayList);
        } else {
            PremiumPreviewFragment.r0(i7, arrayList, false);
            PremiumPreviewFragment.r0(i7, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new ws0(40, 2131231216, gd.M0(2131750826, null), gd.M0(2131750825, null)));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f58959o1.size()) {
                i11 = 0;
                break;
            } else if (((ws0) this.f58959o1.get(i11)).f53469a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (z11) {
            this.f58959o1.clear();
            this.f58959o1.add((ws0) this.f58959o1.get(i11));
            i11 = 0;
        }
        ws0 ws0Var = (ws0) this.f58959o1.get(i11);
        this.f30226v0 = false;
        this.f30228w0 = false;
        this.U0 = false;
        b1 b1Var = new b1(n6.Rk, n6.Sk, n6.Tk, -1, null);
        b1Var.f58615o = 1.1f;
        b1Var.f58616p = 1.5f;
        b1Var.f58617q = -0.2f;
        b1Var.f58613m = true;
        y61 y61Var = new y61(this, getContext(), b1Var, 6);
        this.f58964t1 = y61Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f58966v1 = frameLayout;
        frameLayout.setContentDescription(gd.M0(2131752030, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131232098);
        int L = org.telegram.messenger.g0.L(12.0f);
        int o4 = i0.a.o(-1, 40);
        int o10 = i0.a.o(-1, 100);
        imageView.setBackground(n6.k0(L, L, L, L, o4, o10, o10));
        frameLayout.addView(imageView, ma.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final z0 f58892b;

            {
                this.f58892b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f58892b.dismiss();
                        return;
                    default:
                        this.f58892b.dismiss();
                        return;
                }
            }
        });
        w01Var.addView(y61Var, ma.t(-1, -2, 1, 0, 16, 0, 0));
        x0 x0Var = new x0(this, getContext());
        this.f58963s1 = x0Var;
        x0Var.setOverScrollMode(2);
        x0Var.setOffscreenPageLimit(0);
        x0Var.setAdapter(new k20(this, 4));
        this.B1 = i11;
        x0Var.setCurrentItem(i11);
        w01Var.addView(x0Var, ma.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        w01Var.addView(frameLayout, ma.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ia iaVar = new ia(getContext(), x0Var, this.f58959o1.size());
        x0Var.b(new l7(this, iaVar, 1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(w01Var);
        linearLayout.setOrientation(1);
        int i12 = n6.V8;
        int i13 = n6.P9;
        iaVar.f36091n = i12;
        iaVar.f36092r = i13;
        if (!z11) {
            linearLayout.addView(iaVar, ma.t(this.f58959o1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        s0 s0Var = new s0(getContext(), i6Var, true);
        this.n1 = s0Var;
        s0Var.f58868w.setOnClickListener(new k3(this, h2Var, z11, ws0Var, 5));
        s0Var.h.setOnClickListener(new View.OnClickListener(this) {
            public final z0 f58892b;

            {
                this.f58892b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f58892b.dismiss();
                        return;
                    default:
                        this.f58892b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(s0Var, ma.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        u6.h(n6.f29467h5, frameLayout2, i6Var);
        linearLayout.addView(frameLayout2, ma.r(-1, 68, 80));
        if (i10 == 40) {
            s0Var.c(f6.t2(gd.M0(2131743651, null)), true, false);
        } else if (j10.i(i7).q()) {
            s0Var.c(gd.M0(2131747638, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.O = scrollView;
        ri.d0(i7).r1();
        K0();
        this.V0 = 83;
        n4 n4Var = new n4(this, getContext(), scrollView, getContext().getDrawable(2131231237).mutate());
        this.f30190b = n4Var;
        int i14 = this.f30225u0;
        n4Var.setPadding(i14, this.f30224t0 - 1, i14, 0);
    }
}
