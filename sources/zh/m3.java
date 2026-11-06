package zh;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ea;
import bi.k7;
import bi.sc;
import c8.ha;
import c8.ka;
import fi.h7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.ys;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kx;
import org.telegram.ui.nt0;
import org.telegram.ui.sq0;
import org.telegram.ui.v8;
public class m3 extends org.telegram.ui.ActionBar.f2 implements te.b {
    public HorizontalScrollView D;
    public LinearLayout E;
    public v2 F;
    public v2 G;
    public v2 H;
    public v2 I;
    public jz J;
    public boolean K;
    public int L;
    public int M;
    public LinearLayout N;
    public ri.c O;
    public dh.c P;
    public final te.a f60363a;
    public final long f60364b;
    public final String f60365c;
    public final d3 d;
    public c20 f60366e;
    public org.telegram.ui.ActionBar.y1 f60367f;
    public View h;
    public kx f60368n;
    public FrameLayout f60369r;
    public FrameLayout f60370s;
    public TextView f60371w;
    public sq0 f60372x;
    public boolean f60373y;

    public m3(long j3, String str, long j10, f6 f6Var) {
        super(null);
        this.f60363a = new te.a(0, this, xq.h, 380L, false);
        this.K = true;
        this.f60364b = j3;
        this.f60365c = str;
        this.resourceProvider = f6Var;
        d3 d3Var = new d3(this.currentAccount, j10, new xg.a(this, 4));
        this.d = d3Var;
        d3Var.g(false);
    }

    public static void Z(m3 m3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z9) {
        if (j3 == p10.i(m3Var.currentAccount).e()) {
            m3Var.d.d.remove(tL_starGiftUnique);
            m3Var.j0(false);
            if (j3 == p10.i(m3Var.currentAccount).e()) {
                hc a02 = hc.a0(m3Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String M0 = hd.M0(2131752887, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                cc O = a02.O(document, M0, hd.a0(null, null, 2131752888, jg.g.m(tL_starGiftUnique.num, ',', sb2)));
                O.f32522r = false;
                O.j();
            } else {
                cc O2 = hc.a0(m3Var).O(tL_starGiftUnique.getDocument(), hd.M0(2131752885, null), hd.a0(null, null, 2131752886, m5.s(m3Var.currentAccount, j3)));
                O2.f32522r = false;
                O2.j();
            }
            m3Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        q2 q2Var = new q2(bundle, tL_starGiftUnique, j3);
        q4 q4Var = m3Var.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).f27230b) {
            Dialog dialog = m3Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.v2) && z9) {
                ((org.telegram.ui.ActionBar.v2) dialog).N0 = true;
            }
            m3Var.finishFragment();
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(q2Var, false, z9);
            }
        } else {
            m3Var.presentFragment(q2Var, true, z9);
        }
        c20 c20Var = m3Var.f60366e;
        if (c20Var != null) {
            c20Var.a(Boolean.valueOf(z9));
        }
    }

    public static void a0(m3 m3Var, Context context) {
        d3 d3Var = m3Var.d;
        if (!m3Var.K || d3Var.h.isEmpty()) {
            return;
        }
        k60 k60Var = new k60(m3Var, m3Var.I, false, false);
        k60Var.f35206t = false;
        k60Var.Y = true;
        k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        k60Var.R = true;
        k60Var.f35200p = new li.h(k60Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(d3Var.h);
        Collections.sort(arrayList, new h2(m3Var, 0));
        kx kxVar = new kx(m3Var, new i2(m3Var, strArr, arrayList, 0), new j2(m3Var, k60Var, 0), null, 5);
        kxVar.f37160f3.f35510r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232737);
        r6.t(imageView, k6.F8, m3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ys ysVar = new ys(context, m3Var.resourceProvider);
        ysVar.setTextSize(1, 16.0f);
        ysVar.setInputType(573441);
        ysVar.setRawInputType(573441);
        r6.E(ysVar, k6.A6, m3Var.resourceProvider);
        r6.m(ysVar, 30, k6.G6, m3Var.resourceProvider);
        ysVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        ysVar.setCursorWidth(1.5f);
        ysVar.setHint(hd.M0(2131750008, null));
        r6.V(ysVar, k6.E8, m3Var.resourceProvider);
        ysVar.setBackground(null);
        frameLayout.addView(ysVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ysVar.addTextChangedListener(new h7(strArr, kxVar, false, 12));
        if (arrayList.size() > 8) {
            k60Var.r(frameLayout, ha.o(-1, 44));
            k60Var.k();
        }
        if (!d3Var.f60181l.isEmpty()) {
            k60Var.c(2131232357, hd.M0(2131745671, null), new k2(m3Var, 0), false);
        }
        k60Var.q(kxVar);
        k60Var.Z();
    }

    public static void b0(m3 m3Var, Context context) {
        d3 d3Var = m3Var.d;
        if (!m3Var.K || d3Var.f60176f.isEmpty()) {
            return;
        }
        k60 k60Var = new k60(m3Var, m3Var.G, false, false);
        k60Var.f35206t = false;
        k60Var.Y = true;
        k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        k60Var.R = true;
        k60Var.f35200p = new li.h(k60Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(d3Var.f60176f);
        Collections.sort(arrayList, new h2(m3Var, 2));
        kx kxVar = new kx(m3Var, new i2(m3Var, strArr, arrayList, 2), new j2(m3Var, k60Var, 2), null, 3);
        kxVar.f37160f3.f35510r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232737);
        r6.t(imageView, k6.F8, m3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ys ysVar = new ys(context, m3Var.resourceProvider);
        ysVar.setTextSize(1, 16.0f);
        ysVar.setInputType(573441);
        ysVar.setRawInputType(573441);
        r6.E(ysVar, k6.A6, m3Var.resourceProvider);
        r6.m(ysVar, 30, k6.G6, m3Var.resourceProvider);
        ysVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        ysVar.setCursorWidth(1.5f);
        ysVar.setHint(hd.M0(2131750008, null));
        r6.V(ysVar, k6.E8, m3Var.resourceProvider);
        ysVar.setBackground(null);
        frameLayout.addView(ysVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ysVar.addTextChangedListener(new h7(strArr, kxVar, false, 13));
        if (arrayList.size() > 8) {
            k60Var.r(frameLayout, ha.o(-1, 44));
            k60Var.k();
        }
        if (!d3Var.f60179j.isEmpty()) {
            k60Var.c(2131232357, hd.M0(2131745671, null), new k2(m3Var, 2), false);
        }
        k60Var.q(kxVar);
        k60Var.Z();
    }

    public static void c0(m3 m3Var, Context context) {
        d3 d3Var = m3Var.d;
        if (!m3Var.K || d3Var.f60177g.isEmpty()) {
            return;
        }
        k60 k60Var = new k60(m3Var, m3Var.H, false, false);
        k60Var.f35206t = false;
        k60Var.Y = true;
        k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        k60Var.R = true;
        k60Var.f35200p = new li.h(k60Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(d3Var.f60177g);
        Collections.sort(arrayList, new h2(m3Var, 1));
        kx kxVar = new kx(m3Var, new i2(m3Var, strArr, arrayList, 1), new j2(m3Var, k60Var, 1), null, 4);
        kxVar.f37160f3.f35510r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232737);
        r6.t(imageView, k6.F8, m3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ys ysVar = new ys(context, m3Var.resourceProvider);
        ysVar.setTextSize(1, 16.0f);
        ysVar.setInputType(573441);
        ysVar.setRawInputType(573441);
        r6.E(ysVar, k6.A6, m3Var.resourceProvider);
        r6.m(ysVar, 30, k6.G6, m3Var.resourceProvider);
        ysVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        ysVar.setCursorWidth(1.5f);
        ysVar.setHint(hd.M0(2131750008, null));
        r6.V(ysVar, k6.E8, m3Var.resourceProvider);
        ysVar.setBackground(null);
        frameLayout.addView(ysVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ysVar.addTextChangedListener(new h7(strArr, kxVar, false, 14));
        if (arrayList.size() > 8) {
            k60Var.r(frameLayout, ha.o(-1, 44));
            k60Var.k();
        }
        if (!d3Var.f60180k.isEmpty()) {
            k60Var.c(2131232357, hd.M0(2131745671, null), new k2(m3Var, 1), false);
        }
        k60Var.q(kxVar);
        k60Var.Z();
    }

    public static void d0(m3 m3Var, x31 x31Var) {
        Object obj = x31Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            k7 k7Var = new k7(m3Var.getParentActivity(), m3Var.currentAccount, m3Var.f60364b, m3Var.resourceProvider, null);
            k7Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, m3Var.d);
            k7Var.J2 = new m2(m3Var);
            m3Var.showDialog(k7Var);
        }
    }

    public static org.telegram.ui.ActionBar.k e0(m3 m3Var) {
        return m3Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k f0(m3 m3Var) {
        return m3Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k g0(m3 m3Var) {
        return m3Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k h0(m3 m3Var) {
        return m3Var.actionBar;
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f60370s.setTranslationY((-org.telegram.messenger.g0.L(52.0f)) * f10);
            p00.d(this.f60369r, f10);
        }
    }

    @Override
    public final View createView(final Context context) {
        ri.c cVar = new ri.c();
        this.O = cVar;
        int i7 = k6.f27849d6;
        cVar.a(getThemedColor(i7));
        ri.c cVar2 = this.O;
        this.P = new dh.c(cVar2, cVar2, cVar2);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.f60367f = y1Var;
        kVar.setBackButtonDrawable(y1Var);
        this.f60367f.f28772k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, 24));
        this.actionBar.setTitle(this.f60365c);
        r6.i(i7, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = k6.G6;
        r6.m(kVar2, 1, i10, getResourceProvider());
        r6.b(this.actionBar, i10, getResourceProvider(), true);
        r6.m(this.actionBar, 3, k6.f28261z8, getResourceProvider());
        r6.m(this.actionBar, 5, i10, getResourceProvider());
        r6.c(this.actionBar, k6.f28259z6, getResourceProvider());
        v8 v8Var = new v8(10, context, this);
        int w10 = k6.w(k6.w0(i7, this.resourceProvider), k6.r1(0.04f, k6.w0(i10, this.resourceProvider)));
        v8Var.setBackgroundColor(w10);
        this.L = w10;
        this.fragmentView = v8Var;
        sc scVar = new sc(this.currentAccount, context, this.resourceProvider);
        scVar.d = true;
        ka.a(scVar);
        scVar.setOnClickListener(new wg.z0(7, this, scVar));
        this.actionBar.addView(scVar, ha.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        kx kxVar = new kx(this, new q0(this, 2), new m2(this), new h(this), 2);
        this.f60368n = kxVar;
        kxVar.f37160f3.f35510r = false;
        kxVar.setSpanCount(3);
        this.f60368n.j(new yh.f(this, 1));
        this.f60368n.setPadding(0, org.telegram.messenger.g0.L(45.0f), 0, org.telegram.messenger.g0.L(101.0f));
        this.f60368n.setClipToPadding(false);
        v8Var.addView(this.f60368n, ha.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        v8Var.addView(this.actionBar);
        sq0 sq0Var = new sq0(context, new View.OnClickListener(this) {
            public final m3 f60382b;

            {
                this.f60382b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        d3 d3Var = this.f60382b.d;
                        d3Var.f60180k.clear();
                        d3Var.f60179j.clear();
                        d3Var.f60181l.clear();
                        d3Var.h();
                        return;
                    default:
                        d3 d3Var2 = this.f60382b.d;
                        d3Var2.f60180k.clear();
                        d3Var2.f60179j.clear();
                        d3Var2.f60181l.clear();
                        d3Var2.h();
                        return;
                }
            }
        }, this.resourceProvider);
        this.f60372x = sq0Var;
        this.f60373y = false;
        sq0Var.setAlpha(0.0f);
        this.f60372x.setScaleX(0.95f);
        this.f60372x.setScaleY(0.95f);
        this.f60372x.setVisibility(8);
        v8Var.addView(this.f60372x, ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
        this.E.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.D = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.D.addView(this.E);
        this.D.setBackgroundColor(w10);
        this.D.setClipChildren(false);
        v8Var.addView(this.D, ha.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        r6.i(k6.f27850d7, view, getResourceProvider());
        this.h.setAlpha(0.0f);
        v8Var.addView(this.h, ha.a(-1.0f, 2.0f / org.telegram.messenger.g0.f22543p, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final wo woVar = new wo(24, context, this.resourceProvider);
        woVar.b(k6.h7, k6.f27959j7, k6.f27979k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        woVar.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        woVar.setScaleX(0.8f);
        woVar.setScaleY(0.8f);
        linearLayout2.addView(woVar, ha.r(26, 26, 16));
        TextView textView = new TextView(context);
        r6.V(textView, k6.f27957j5, this.resourceProvider);
        jg.g.v(textView, 1, 14.0f, null, 2131749612);
        linearLayout2.addView(textView, ha.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.g0.L(18.0f);
        int themedColor = getThemedColor(i7);
        int i11 = k6.Ci;
        int w11 = k6.w(themedColor, k6.r1(0.1f, getThemedColor(i11)));
        linearLayout2.setBackground(k6.k0(L, L, L, L, 0, w11, w11));
        this.N = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60370s = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout2 = this.f60370s;
        fh.g c10 = this.P.c(frameLayout2, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout2.setBackground(c10);
        this.f60370s.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f60394b;

            {
                this.f60394b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i12 = r3;
                final wo woVar2 = woVar;
                final m3 m3Var = this.f60394b;
                switch (i12) {
                    case 0:
                        d3 d3Var = m3Var.d;
                        if (d3Var != null) {
                            boolean z9 = !d3Var.f60187r;
                            d3Var.f60187r = z9;
                            woVar2.a(z9, true);
                            d3Var.h();
                            return;
                        }
                        return;
                    default:
                        d3 d3Var2 = m3Var.d;
                        if (m3Var.K) {
                            k60 H = k60.H(m3Var, m3Var.F);
                            H.c(2131231890, hd.M0(2131746140, null), new k2(m3Var, 3), false);
                            H.c(2131231888, hd.M0(2131746144, null), new k2(m3Var, 4), false);
                            H.c(2131231889, hd.M0(2131746142, null), new k2(m3Var, 5), false);
                            H.k();
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            d3 d3Var3 = m3Var.d;
                                            if (d3Var3.f60187r) {
                                                d3Var3.f60187r = false;
                                                woVar2.a(false, true);
                                                d3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            d3 d3Var4 = m3Var.d;
                                            if (!d3Var4.f60187r) {
                                                d3Var4.f60187r = true;
                                                woVar2.a(true, true);
                                                d3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, hd.M0(2131749614, null), !d3Var2.f60187r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            d3 d3Var3 = m3Var.d;
                                            if (d3Var3.f60187r) {
                                                d3Var3.f60187r = false;
                                                woVar2.a(false, true);
                                                d3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            d3 d3Var4 = m3Var.d;
                                            if (!d3Var4.f60187r) {
                                                d3Var4.f60187r = true;
                                                woVar2.a(true, true);
                                                d3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, hd.M0(2131749613, null), d3Var2.f60187r);
                            H.f35206t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f60370s.addView(linearLayout2, ha.c(-1.0f, -2));
        ka.b(this.f60370s, 0.04f, 1.5f);
        v8Var.addView(this.f60370s, ha.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.f22539n / org.telegram.messenger.g0.f22543p));
        ea y10 = ea.y(this.currentAccount, true);
        if (y10.f3810e && !y10.s().k()) {
            this.f60370s.setVisibility(8);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f60369r = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout4 = this.f60369r;
        fh.g c11 = this.P.c(frameLayout4, null, false);
        c11.p(c8.g0.l(this.resourceProvider));
        c11.q(org.telegram.messenger.g0.L(8.0f));
        c11.r(org.telegram.messenger.g0.L(22.0f));
        frameLayout4.setBackground(c11);
        v8Var.addView(this.f60369r, ha.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.f22539n / org.telegram.messenger.g0.f22543p));
        this.f60371w = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new wp(2131232095, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131750013, null));
        this.f60371w.setText(spannableStringBuilder);
        r6.V(this.f60371w, i11, getResourceProvider());
        this.f60371w.setTypeface(org.telegram.messenger.g0.o());
        this.f60371w.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        TextView textView2 = this.f60371w;
        int L2 = org.telegram.messenger.g0.L(22.0f);
        int w12 = k6.w(getThemedColor(i7), k6.r1(0.1f, getThemedColor(i11)));
        textView2.setBackground(k6.k0(L2, L2, L2, L2, 0, w12, w12));
        this.f60371w.setGravity(17);
        this.f60369r.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f60382b;

            {
                this.f60382b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        d3 d3Var = this.f60382b.d;
                        d3Var.f60180k.clear();
                        d3Var.f60179j.clear();
                        d3Var.f60181l.clear();
                        d3Var.h();
                        return;
                    default:
                        d3 d3Var2 = this.f60382b.d;
                        d3Var2.f60180k.clear();
                        d3Var2.f60179j.clear();
                        d3Var2.f60181l.clear();
                        d3Var2.h();
                        return;
                }
            }
        });
        this.f60369r.addView(this.f60371w, ha.c(-1.0f, -2));
        this.f60369r.setVisibility(8);
        ka.b(this.f60369r, 0.05f, 1.5f);
        v2 v2Var = new v2(context, this.resourceProvider);
        this.F = v2Var;
        v2Var.setSorting(this.d.f60185p);
        this.E.addView(this.F, ha.t(-2, -2, 16, 0, 0, 6, 0));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f60394b;

            {
                this.f60394b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i12 = r3;
                final wo woVar2 = woVar;
                final m3 m3Var = this.f60394b;
                switch (i12) {
                    case 0:
                        d3 d3Var = m3Var.d;
                        if (d3Var != null) {
                            boolean z9 = !d3Var.f60187r;
                            d3Var.f60187r = z9;
                            woVar2.a(z9, true);
                            d3Var.h();
                            return;
                        }
                        return;
                    default:
                        d3 d3Var2 = m3Var.d;
                        if (m3Var.K) {
                            k60 H = k60.H(m3Var, m3Var.F);
                            H.c(2131231890, hd.M0(2131746140, null), new k2(m3Var, 3), false);
                            H.c(2131231888, hd.M0(2131746144, null), new k2(m3Var, 4), false);
                            H.c(2131231889, hd.M0(2131746142, null), new k2(m3Var, 5), false);
                            H.k();
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            d3 d3Var3 = m3Var.d;
                                            if (d3Var3.f60187r) {
                                                d3Var3.f60187r = false;
                                                woVar2.a(false, true);
                                                d3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            d3 d3Var4 = m3Var.d;
                                            if (!d3Var4.f60187r) {
                                                d3Var4.f60187r = true;
                                                woVar2.a(true, true);
                                                d3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, hd.M0(2131749614, null), !d3Var2.f60187r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            d3 d3Var3 = m3Var.d;
                                            if (d3Var3.f60187r) {
                                                d3Var3.f60187r = false;
                                                woVar2.a(false, true);
                                                d3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            d3 d3Var4 = m3Var.d;
                                            if (!d3Var4.f60187r) {
                                                d3Var4.f60187r = true;
                                                woVar2.a(true, true);
                                                d3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, hd.M0(2131749613, null), d3Var2.f60187r);
                            H.f35206t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        v2 v2Var2 = new v2(context, this.resourceProvider);
        this.G = v2Var2;
        v2Var2.setValue(hd.M0(2131750386, null));
        this.E.addView(this.G, ha.t(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f60236b;

            {
                this.f60236b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        m3.b0(this.f60236b, context);
                        return;
                    case 1:
                        m3.c0(this.f60236b, context);
                        return;
                    default:
                        m3.a0(this.f60236b, context);
                        return;
                }
            }
        });
        v2 v2Var3 = new v2(context, this.resourceProvider);
        this.H = v2Var3;
        v2Var3.setValue(hd.M0(2131750387, null));
        this.E.addView(this.H, ha.t(-2, -2, 16, 0, 0, 6, 0));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f60236b;

            {
                this.f60236b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        m3.b0(this.f60236b, context);
                        return;
                    case 1:
                        m3.c0(this.f60236b, context);
                        return;
                    default:
                        m3.a0(this.f60236b, context);
                        return;
                }
            }
        });
        v2 v2Var4 = new v2(context, this.resourceProvider);
        this.I = v2Var4;
        v2Var4.setValue(hd.M0(2131750379, null));
        this.E.addView(this.I, ha.t(-2, -2, 16, 0, 0, 0, 0));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f60236b;

            {
                this.f60236b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        m3.b0(this.f60236b, context);
                        return;
                    case 1:
                        m3.c0(this.f60236b, context);
                        return;
                    default:
                        m3.a0(this.f60236b, context);
                        return;
                }
            }
        });
        jz jzVar = new jz(getParentActivity());
        this.J = jzVar;
        v8Var.addView(jzVar, ha.c(-1.0f, -1));
        i0(false, false);
        return v8Var;
    }

    public final void i0(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.K == z9) {
            return;
        }
        this.K = z9;
        float f14 = 1.0f;
        int i7 = 0;
        float f15 = 0.0f;
        if (z10) {
            this.D.setVisibility(0);
            ViewPropertyAnimator animate = this.D.animate();
            if (z9) {
                f12 = 0.0f;
            } else {
                f12 = -org.telegram.messenger.g0.L(45.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(f12);
            if (!z9) {
                f14 = 0.0f;
            }
            ViewPropertyAnimator alpha = translationY.alpha(f14);
            xq xqVar = xq.h;
            alpha.setInterpolator(xqVar).setDuration(420L).setListener(new p2(this, z9, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z9) {
                f13 = 0.0f;
            } else {
                f13 = -org.telegram.messenger.g0.L(45.0f);
            }
            animate2.translationY(f13).setInterpolator(xqVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f60368n.animate();
            if (!z9) {
                f15 = -org.telegram.messenger.g0.L(39.0f);
            }
            animate3.translationY(f15).setInterpolator(xqVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.D;
        if (!z9) {
            i7 = 8;
        }
        horizontalScrollView.setVisibility(i7);
        HorizontalScrollView horizontalScrollView2 = this.D;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.g0.L(45.0f);
        }
        horizontalScrollView2.setTranslationY(f10);
        HorizontalScrollView horizontalScrollView3 = this.D;
        if (!z9) {
            f14 = 0.0f;
        }
        horizontalScrollView3.setAlpha(f14);
        View view = this.h;
        if (z9) {
            f11 = 0.0f;
        } else {
            f11 = -org.telegram.messenger.g0.L(45.0f);
        }
        view.setTranslationY(f11);
        kx kxVar = this.f60368n;
        if (!z9) {
            f15 = -org.telegram.messenger.g0.L(39.0f);
        }
        kxVar.setTranslationY(f15);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().G0) {
            int x02 = k6.x0(null, k6.f27849d6, false);
            if (this.actionBar.v()) {
                x02 = k6.x0(null, k6.f28205w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z9) {
        String M0;
        String M02;
        String M03;
        String H;
        l41 l41Var;
        d3 d3Var = this.d;
        int i7 = d3Var.f60175e;
        HashSet hashSet = d3Var.f60181l;
        ArrayList arrayList = d3Var.h;
        HashSet hashSet2 = d3Var.f60180k;
        ArrayList arrayList2 = d3Var.f60177g;
        HashSet hashSet3 = d3Var.f60179j;
        ArrayList arrayList3 = d3Var.f60176f;
        if (i7 > 12) {
            i0(true, true);
        }
        kx kxVar = this.f60368n;
        boolean z10 = false;
        if (kxVar != null && (l41Var = kxVar.f37160f3) != null) {
            l41Var.O(true);
            if (z9) {
                this.f60368n.v0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.f60365c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i10 = d3Var.f60175e;
            if (i10 <= 0) {
                H = hd.M0(2131750006, null);
            } else {
                H = hd.H(',', "Gift2ListingsCount", i10);
            }
            kVar2.setSubtitle(H);
        }
        v2 v2Var = this.F;
        if (v2Var != null) {
            v2Var.setSorting(d3Var.f60185p);
        }
        if (this.G != null) {
            int size = arrayList3.size() - hashSet3.size();
            v2 v2Var2 = this.G;
            if (size > 0 && size != arrayList3.size()) {
                M03 = hd.H(',', "Gift2ResaleFilterModels", size);
            } else {
                M03 = hd.M0(2131750022, null);
            }
            v2Var2.setValue(M03);
        }
        if (this.H != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            v2 v2Var3 = this.H;
            if (size2 > 0 && size2 != arrayList2.size()) {
                M02 = hd.H(',', "Gift2ResaleFilterBackdrops", size2);
            } else {
                M02 = hd.M0(2131750026, null);
            }
            v2Var3.setValue(M02);
        }
        if (this.I != null) {
            int size3 = arrayList.size() - hashSet.size();
            v2 v2Var4 = this.I;
            if (size3 > 0 && size3 != arrayList.size()) {
                M0 = hd.H(',', "Gift2ResaleFilterSymbols", size3);
            } else {
                M0 = hd.M0(2131750018, null);
            }
            v2Var4.setValue(M0);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f60368n.getChildCount()) {
                break;
            } else if (this.f60368n.getChildAt(i11) instanceof lz) {
                d3Var.g(false);
                break;
            } else {
                i11++;
            }
        }
        if ((d3Var.f60189t || d3Var.f60175e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z10 = true;
        }
        this.f60363a.a(z10, true);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z9;
        try {
            super.onThemeColorsChanged();
            ri.c cVar = this.O;
            int i7 = k6.f27849d6;
            cVar.a(getThemedColor(i7));
            int w10 = k6.w(getThemedColor(i7), k6.r1(0.1f, getThemedColor(k6.Ci)));
            if (w10 != this.M) {
                this.M = w10;
                TextView textView = this.f60371w;
                if (textView != null) {
                    k6.H1(textView.getBackground(), w10, true);
                }
                LinearLayout linearLayout = this.N;
                if (linearLayout != null) {
                    k6.H1(linearLayout.getBackground(), w10, true);
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            int w11 = k6.w(k6.w0(k6.f27849d6, this.resourceProvider), k6.r1(0.04f, k6.w0(k6.G6, this.resourceProvider)));
            int i10 = this.L;
            if (w11 != i10) {
                HorizontalScrollView horizontalScrollView = this.D;
                boolean z10 = false;
                if (horizontalScrollView != null && (horizontalScrollView.getBackground() instanceof ColorDrawable) && ((ColorDrawable) horizontalScrollView.getBackground()).getColor() == i10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    this.D.setBackgroundColor(w11);
                }
                View view = this.fragmentView;
                int i11 = this.L;
                if (view != null && (view.getBackground() instanceof ColorDrawable) && ((ColorDrawable) view.getBackground()).getColor() == i11) {
                    z10 = true;
                }
                if (z10) {
                    this.fragmentView.setBackgroundColor(w11);
                }
                this.L = w11;
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
