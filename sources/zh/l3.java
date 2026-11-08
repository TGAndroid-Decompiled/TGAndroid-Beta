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
import org.telegram.messenger.id;
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
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kx;
import org.telegram.ui.nt0;
import org.telegram.ui.sq0;
import org.telegram.ui.v8;
public class l3 extends org.telegram.ui.ActionBar.f2 implements te.b {
    public HorizontalScrollView D;
    public LinearLayout E;
    public t2 F;
    public t2 G;
    public t2 H;
    public t2 I;
    public kz J;
    public boolean K;
    public int L;
    public int M;
    public LinearLayout N;
    public ri.c O;
    public dh.c P;
    public final te.a f60446a;
    public final long f60447b;
    public final String f60448c;
    public final b3 d;
    public c20 f60449e;
    public org.telegram.ui.ActionBar.y1 f60450f;
    public View h;
    public kx f60451n;
    public FrameLayout f60452r;
    public FrameLayout f60453s;
    public TextView f60454w;
    public sq0 f60455x;
    public boolean f60456y;

    public l3(long j3, String str, long j10, f6 f6Var) {
        super(null);
        this.f60446a = new te.a(0, this, xq.h, 380L, false);
        this.K = true;
        this.f60447b = j3;
        this.f60448c = str;
        this.resourceProvider = f6Var;
        b3 b3Var = new b3(this.currentAccount, j10, new xg.a(this, 4));
        this.d = b3Var;
        b3Var.g(false);
    }

    public static void Z(l3 l3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z9) {
        if (j3 == p10.i(l3Var.currentAccount).e()) {
            l3Var.d.d.remove(tL_starGiftUnique);
            l3Var.j0(false);
            if (j3 == p10.i(l3Var.currentAccount).e()) {
                hc a02 = hc.a0(l3Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String M0 = id.M0(2131752887, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                cc O = a02.O(document, M0, id.a0(null, null, 2131752888, jg.g.m(tL_starGiftUnique.num, ',', sb2)));
                O.f32553r = false;
                O.j();
            } else {
                cc O2 = hc.a0(l3Var).O(tL_starGiftUnique.getDocument(), id.M0(2131752885, null), id.a0(null, null, 2131752886, m5.s(l3Var.currentAccount, j3)));
                O2.f32553r = false;
                O2.j();
            }
            l3Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        o2 o2Var = new o2(bundle, tL_starGiftUnique, j3);
        q4 q4Var = l3Var.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).f27233b) {
            Dialog dialog = l3Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.v2) && z9) {
                ((org.telegram.ui.ActionBar.v2) dialog).N0 = true;
            }
            l3Var.finishFragment();
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(o2Var, false, z9);
            }
        } else {
            l3Var.presentFragment(o2Var, true, z9);
        }
        c20 c20Var = l3Var.f60449e;
        if (c20Var != null) {
            c20Var.a(Boolean.valueOf(z9));
        }
    }

    public static void a0(l3 l3Var, Context context) {
        b3 b3Var = l3Var.d;
        if (!l3Var.K || b3Var.h.isEmpty()) {
            return;
        }
        k60 k60Var = new k60(l3Var, l3Var.I, false, false);
        k60Var.f35232t = false;
        k60Var.Y = true;
        k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        k60Var.R = true;
        k60Var.f35226p = new li.h(k60Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b3Var.h);
        Collections.sort(arrayList, new f2(l3Var, 0));
        kx kxVar = new kx(l3Var, new g2(l3Var, strArr, arrayList, 0), new h2(l3Var, k60Var, 0), null, 5);
        kxVar.f37190f3.f35528r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232737);
        r6.t(imageView, k6.F8, l3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        zs zsVar = new zs(context, l3Var.resourceProvider);
        zsVar.setTextSize(1, 16.0f);
        zsVar.setInputType(573441);
        zsVar.setRawInputType(573441);
        r6.E(zsVar, k6.A6, l3Var.resourceProvider);
        r6.m(zsVar, 30, k6.G6, l3Var.resourceProvider);
        zsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        zsVar.setCursorWidth(1.5f);
        zsVar.setHint(id.M0(2131750010, null));
        r6.V(zsVar, k6.E8, l3Var.resourceProvider);
        zsVar.setBackground(null);
        frameLayout.addView(zsVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        zsVar.addTextChangedListener(new h7(strArr, kxVar, false, 12));
        if (arrayList.size() > 8) {
            k60Var.r(frameLayout, ha.o(-1, 44));
            k60Var.k();
        }
        if (!b3Var.f60243l.isEmpty()) {
            k60Var.c(2131232357, id.M0(2131745673, null), new i2(l3Var, 0), false);
        }
        k60Var.q(kxVar);
        k60Var.Z();
    }

    public static void b0(l3 l3Var, Context context) {
        b3 b3Var = l3Var.d;
        if (!l3Var.K || b3Var.f60238f.isEmpty()) {
            return;
        }
        k60 k60Var = new k60(l3Var, l3Var.G, false, false);
        k60Var.f35232t = false;
        k60Var.Y = true;
        k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        k60Var.R = true;
        k60Var.f35226p = new li.h(k60Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b3Var.f60238f);
        Collections.sort(arrayList, new f2(l3Var, 2));
        kx kxVar = new kx(l3Var, new g2(l3Var, strArr, arrayList, 2), new h2(l3Var, k60Var, 2), null, 3);
        kxVar.f37190f3.f35528r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232737);
        r6.t(imageView, k6.F8, l3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        zs zsVar = new zs(context, l3Var.resourceProvider);
        zsVar.setTextSize(1, 16.0f);
        zsVar.setInputType(573441);
        zsVar.setRawInputType(573441);
        r6.E(zsVar, k6.A6, l3Var.resourceProvider);
        r6.m(zsVar, 30, k6.G6, l3Var.resourceProvider);
        zsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        zsVar.setCursorWidth(1.5f);
        zsVar.setHint(id.M0(2131750010, null));
        r6.V(zsVar, k6.E8, l3Var.resourceProvider);
        zsVar.setBackground(null);
        frameLayout.addView(zsVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        zsVar.addTextChangedListener(new h7(strArr, kxVar, false, 13));
        if (arrayList.size() > 8) {
            k60Var.r(frameLayout, ha.o(-1, 44));
            k60Var.k();
        }
        if (!b3Var.f60241j.isEmpty()) {
            k60Var.c(2131232357, id.M0(2131745673, null), new i2(l3Var, 2), false);
        }
        k60Var.q(kxVar);
        k60Var.Z();
    }

    public static void c0(l3 l3Var, Context context) {
        b3 b3Var = l3Var.d;
        if (!l3Var.K || b3Var.f60239g.isEmpty()) {
            return;
        }
        k60 k60Var = new k60(l3Var, l3Var.H, false, false);
        k60Var.f35232t = false;
        k60Var.Y = true;
        k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        k60Var.R = true;
        k60Var.f35226p = new li.h(k60Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b3Var.f60239g);
        Collections.sort(arrayList, new f2(l3Var, 1));
        kx kxVar = new kx(l3Var, new g2(l3Var, strArr, arrayList, 1), new h2(l3Var, k60Var, 1), null, 4);
        kxVar.f37190f3.f35528r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232737);
        r6.t(imageView, k6.F8, l3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        zs zsVar = new zs(context, l3Var.resourceProvider);
        zsVar.setTextSize(1, 16.0f);
        zsVar.setInputType(573441);
        zsVar.setRawInputType(573441);
        r6.E(zsVar, k6.A6, l3Var.resourceProvider);
        r6.m(zsVar, 30, k6.G6, l3Var.resourceProvider);
        zsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        zsVar.setCursorWidth(1.5f);
        zsVar.setHint(id.M0(2131750010, null));
        r6.V(zsVar, k6.E8, l3Var.resourceProvider);
        zsVar.setBackground(null);
        frameLayout.addView(zsVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        zsVar.addTextChangedListener(new h7(strArr, kxVar, false, 14));
        if (arrayList.size() > 8) {
            k60Var.r(frameLayout, ha.o(-1, 44));
            k60Var.k();
        }
        if (!b3Var.f60242k.isEmpty()) {
            k60Var.c(2131232357, id.M0(2131745673, null), new i2(l3Var, 1), false);
        }
        k60Var.q(kxVar);
        k60Var.Z();
    }

    public static void d0(l3 l3Var, x31 x31Var) {
        Object obj = x31Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            k7 k7Var = new k7(l3Var.getParentActivity(), l3Var.currentAccount, l3Var.f60447b, l3Var.resourceProvider, null);
            k7Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, l3Var.d);
            k7Var.J2 = new k2(l3Var);
            l3Var.showDialog(k7Var);
        }
    }

    public static org.telegram.ui.ActionBar.k e0(l3 l3Var) {
        return l3Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k f0(l3 l3Var) {
        return l3Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k g0(l3 l3Var) {
        return l3Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k h0(l3 l3Var) {
        return l3Var.actionBar;
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f60453s.setTranslationY((-org.telegram.messenger.g0.L(52.0f)) * f10);
            q00.d(this.f60452r, f10);
        }
    }

    @Override
    public final View createView(final Context context) {
        ri.c cVar = new ri.c();
        this.O = cVar;
        int i7 = k6.f27852d6;
        cVar.a(getThemedColor(i7));
        ri.c cVar2 = this.O;
        this.P = new dh.c(cVar2, cVar2, cVar2);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.f60450f = y1Var;
        kVar.setBackButtonDrawable(y1Var);
        this.f60450f.f28775k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, 24));
        this.actionBar.setTitle(this.f60448c);
        r6.i(i7, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = k6.G6;
        r6.m(kVar2, 1, i10, getResourceProvider());
        r6.b(this.actionBar, i10, getResourceProvider(), true);
        r6.m(this.actionBar, 3, k6.f28264z8, getResourceProvider());
        r6.m(this.actionBar, 5, i10, getResourceProvider());
        r6.c(this.actionBar, k6.f28262z6, getResourceProvider());
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
        kx kxVar = new kx(this, new p0(this, 2), new k2(this), new z3.j(this), 2);
        this.f60451n = kxVar;
        kxVar.f37190f3.f35528r = false;
        kxVar.setSpanCount(3);
        this.f60451n.j(new yh.f(this, 1));
        this.f60451n.setPadding(0, org.telegram.messenger.g0.L(45.0f), 0, org.telegram.messenger.g0.L(101.0f));
        this.f60451n.setClipToPadding(false);
        v8Var.addView(this.f60451n, ha.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        v8Var.addView(this.actionBar);
        sq0 sq0Var = new sq0(context, new View.OnClickListener(this) {
            public final l3 f60445b;

            {
                this.f60445b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b3 b3Var = this.f60445b.d;
                        b3Var.f60242k.clear();
                        b3Var.f60241j.clear();
                        b3Var.f60243l.clear();
                        b3Var.h();
                        return;
                    default:
                        b3 b3Var2 = this.f60445b.d;
                        b3Var2.f60242k.clear();
                        b3Var2.f60241j.clear();
                        b3Var2.f60243l.clear();
                        b3Var2.h();
                        return;
                }
            }
        }, this.resourceProvider);
        this.f60455x = sq0Var;
        this.f60456y = false;
        sq0Var.setAlpha(0.0f);
        this.f60455x.setScaleX(0.95f);
        this.f60455x.setScaleY(0.95f);
        this.f60455x.setVisibility(8);
        v8Var.addView(this.f60455x, ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
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
        r6.i(k6.f27853d7, view, getResourceProvider());
        this.h.setAlpha(0.0f);
        v8Var.addView(this.h, ha.a(-1.0f, 2.0f / org.telegram.messenger.g0.f22562p, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final wo woVar = new wo(24, context, this.resourceProvider);
        woVar.b(k6.h7, k6.f27962j7, k6.f27982k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        woVar.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        woVar.setScaleX(0.8f);
        woVar.setScaleY(0.8f);
        linearLayout2.addView(woVar, ha.r(26, 26, 16));
        TextView textView = new TextView(context);
        r6.V(textView, k6.f27960j5, this.resourceProvider);
        jg.g.v(textView, 1, 14.0f, null, 2131749614);
        linearLayout2.addView(textView, ha.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.g0.L(18.0f);
        int themedColor = getThemedColor(i7);
        int i11 = k6.Ci;
        int w11 = k6.w(themedColor, k6.r1(0.1f, getThemedColor(i11)));
        linearLayout2.setBackground(k6.k0(L, L, L, L, 0, w11, w11));
        this.N = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60453s = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout2 = this.f60453s;
        fh.g c10 = this.P.c(frameLayout2, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout2.setBackground(c10);
        this.f60453s.setOnClickListener(new View.OnClickListener(this) {
            public final l3 f60465b;

            {
                this.f60465b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i12 = r3;
                final wo woVar2 = woVar;
                final l3 l3Var = this.f60465b;
                switch (i12) {
                    case 0:
                        b3 b3Var = l3Var.d;
                        if (b3Var != null) {
                            boolean z9 = !b3Var.f60249r;
                            b3Var.f60249r = z9;
                            woVar2.a(z9, true);
                            b3Var.h();
                            return;
                        }
                        return;
                    default:
                        b3 b3Var2 = l3Var.d;
                        if (l3Var.K) {
                            k60 H = k60.H(l3Var, l3Var.F);
                            H.c(2131231890, id.M0(2131746142, null), new i2(l3Var, 3), false);
                            H.c(2131231888, id.M0(2131746146, null), new i2(l3Var, 4), false);
                            H.c(2131231889, id.M0(2131746144, null), new i2(l3Var, 5), false);
                            H.k();
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            b3 b3Var3 = l3Var.d;
                                            if (b3Var3.f60249r) {
                                                b3Var3.f60249r = false;
                                                woVar2.a(false, true);
                                                b3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            b3 b3Var4 = l3Var.d;
                                            if (!b3Var4.f60249r) {
                                                b3Var4.f60249r = true;
                                                woVar2.a(true, true);
                                                b3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, id.M0(2131749616, null), !b3Var2.f60249r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            b3 b3Var3 = l3Var.d;
                                            if (b3Var3.f60249r) {
                                                b3Var3.f60249r = false;
                                                woVar2.a(false, true);
                                                b3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            b3 b3Var4 = l3Var.d;
                                            if (!b3Var4.f60249r) {
                                                b3Var4.f60249r = true;
                                                woVar2.a(true, true);
                                                b3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, id.M0(2131749615, null), b3Var2.f60249r);
                            H.f35232t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f60453s.addView(linearLayout2, ha.c(-1.0f, -2));
        ka.b(this.f60453s, 0.04f, 1.5f);
        v8Var.addView(this.f60453s, ha.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.f22558n / org.telegram.messenger.g0.f22562p));
        ea y10 = ea.y(this.currentAccount, true);
        if (y10.f3810e && !y10.s().k()) {
            this.f60453s.setVisibility(8);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f60452r = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        FrameLayout frameLayout4 = this.f60452r;
        fh.g c11 = this.P.c(frameLayout4, null, false);
        c11.p(c8.g0.l(this.resourceProvider));
        c11.q(org.telegram.messenger.g0.L(8.0f));
        c11.r(org.telegram.messenger.g0.L(22.0f));
        frameLayout4.setBackground(c11);
        v8Var.addView(this.f60452r, ha.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.f22558n / org.telegram.messenger.g0.f22562p));
        this.f60454w = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new wp(2131232095, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131750015, null));
        this.f60454w.setText(spannableStringBuilder);
        r6.V(this.f60454w, i11, getResourceProvider());
        this.f60454w.setTypeface(org.telegram.messenger.g0.o());
        this.f60454w.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        TextView textView2 = this.f60454w;
        int L2 = org.telegram.messenger.g0.L(22.0f);
        int w12 = k6.w(getThemedColor(i7), k6.r1(0.1f, getThemedColor(i11)));
        textView2.setBackground(k6.k0(L2, L2, L2, L2, 0, w12, w12));
        this.f60454w.setGravity(17);
        this.f60452r.setOnClickListener(new View.OnClickListener(this) {
            public final l3 f60445b;

            {
                this.f60445b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        b3 b3Var = this.f60445b.d;
                        b3Var.f60242k.clear();
                        b3Var.f60241j.clear();
                        b3Var.f60243l.clear();
                        b3Var.h();
                        return;
                    default:
                        b3 b3Var2 = this.f60445b.d;
                        b3Var2.f60242k.clear();
                        b3Var2.f60241j.clear();
                        b3Var2.f60243l.clear();
                        b3Var2.h();
                        return;
                }
            }
        });
        this.f60452r.addView(this.f60454w, ha.c(-1.0f, -2));
        this.f60452r.setVisibility(8);
        ka.b(this.f60452r, 0.05f, 1.5f);
        t2 t2Var = new t2(context, this.resourceProvider);
        this.F = t2Var;
        t2Var.setSorting(this.d.f60247p);
        this.E.addView(this.F, ha.t(-2, -2, 16, 0, 0, 6, 0));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final l3 f60465b;

            {
                this.f60465b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i12 = r3;
                final wo woVar2 = woVar;
                final l3 l3Var = this.f60465b;
                switch (i12) {
                    case 0:
                        b3 b3Var = l3Var.d;
                        if (b3Var != null) {
                            boolean z9 = !b3Var.f60249r;
                            b3Var.f60249r = z9;
                            woVar2.a(z9, true);
                            b3Var.h();
                            return;
                        }
                        return;
                    default:
                        b3 b3Var2 = l3Var.d;
                        if (l3Var.K) {
                            k60 H = k60.H(l3Var, l3Var.F);
                            H.c(2131231890, id.M0(2131746142, null), new i2(l3Var, 3), false);
                            H.c(2131231888, id.M0(2131746146, null), new i2(l3Var, 4), false);
                            H.c(2131231889, id.M0(2131746144, null), new i2(l3Var, 5), false);
                            H.k();
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            b3 b3Var3 = l3Var.d;
                                            if (b3Var3.f60249r) {
                                                b3Var3.f60249r = false;
                                                woVar2.a(false, true);
                                                b3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            b3 b3Var4 = l3Var.d;
                                            if (!b3Var4.f60249r) {
                                                b3Var4.f60249r = true;
                                                woVar2.a(true, true);
                                                b3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, id.M0(2131749616, null), !b3Var2.f60249r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            b3 b3Var3 = l3Var.d;
                                            if (b3Var3.f60249r) {
                                                b3Var3.f60249r = false;
                                                woVar2.a(false, true);
                                                b3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            b3 b3Var4 = l3Var.d;
                                            if (!b3Var4.f60249r) {
                                                b3Var4.f60249r = true;
                                                woVar2.a(true, true);
                                                b3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, id.M0(2131749615, null), b3Var2.f60249r);
                            H.f35232t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        t2 t2Var2 = new t2(context, this.resourceProvider);
        this.G = t2Var2;
        t2Var2.setValue(id.M0(2131750388, null));
        this.E.addView(this.G, ha.t(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final l3 f60306b;

            {
                this.f60306b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        l3.b0(this.f60306b, context);
                        return;
                    case 1:
                        l3.c0(this.f60306b, context);
                        return;
                    default:
                        l3.a0(this.f60306b, context);
                        return;
                }
            }
        });
        t2 t2Var3 = new t2(context, this.resourceProvider);
        this.H = t2Var3;
        t2Var3.setValue(id.M0(2131750389, null));
        this.E.addView(this.H, ha.t(-2, -2, 16, 0, 0, 6, 0));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final l3 f60306b;

            {
                this.f60306b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        l3.b0(this.f60306b, context);
                        return;
                    case 1:
                        l3.c0(this.f60306b, context);
                        return;
                    default:
                        l3.a0(this.f60306b, context);
                        return;
                }
            }
        });
        t2 t2Var4 = new t2(context, this.resourceProvider);
        this.I = t2Var4;
        t2Var4.setValue(id.M0(2131750381, null));
        this.E.addView(this.I, ha.t(-2, -2, 16, 0, 0, 0, 0));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final l3 f60306b;

            {
                this.f60306b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        l3.b0(this.f60306b, context);
                        return;
                    case 1:
                        l3.c0(this.f60306b, context);
                        return;
                    default:
                        l3.a0(this.f60306b, context);
                        return;
                }
            }
        });
        kz kzVar = new kz(getParentActivity());
        this.J = kzVar;
        v8Var.addView(kzVar, ha.c(-1.0f, -1));
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
            alpha.setInterpolator(xqVar).setDuration(420L).setListener(new n2(this, z9, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z9) {
                f13 = 0.0f;
            } else {
                f13 = -org.telegram.messenger.g0.L(45.0f);
            }
            animate2.translationY(f13).setInterpolator(xqVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f60451n.animate();
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
        kx kxVar = this.f60451n;
        if (!z9) {
            f15 = -org.telegram.messenger.g0.L(39.0f);
        }
        kxVar.setTranslationY(f15);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().G0) {
            int x02 = k6.x0(null, k6.f27852d6, false);
            if (this.actionBar.v()) {
                x02 = k6.x0(null, k6.f28208w8, false);
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
        b3 b3Var = this.d;
        int i7 = b3Var.f60237e;
        HashSet hashSet = b3Var.f60243l;
        ArrayList arrayList = b3Var.h;
        HashSet hashSet2 = b3Var.f60242k;
        ArrayList arrayList2 = b3Var.f60239g;
        HashSet hashSet3 = b3Var.f60241j;
        ArrayList arrayList3 = b3Var.f60238f;
        if (i7 > 12) {
            i0(true, true);
        }
        kx kxVar = this.f60451n;
        boolean z10 = false;
        if (kxVar != null && (l41Var = kxVar.f37190f3) != null) {
            l41Var.O(true);
            if (z9) {
                this.f60451n.v0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.f60448c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i10 = b3Var.f60237e;
            if (i10 <= 0) {
                H = id.M0(2131750008, null);
            } else {
                H = id.H(',', "Gift2ListingsCount", i10);
            }
            kVar2.setSubtitle(H);
        }
        t2 t2Var = this.F;
        if (t2Var != null) {
            t2Var.setSorting(b3Var.f60247p);
        }
        if (this.G != null) {
            int size = arrayList3.size() - hashSet3.size();
            t2 t2Var2 = this.G;
            if (size > 0 && size != arrayList3.size()) {
                M03 = id.H(',', "Gift2ResaleFilterModels", size);
            } else {
                M03 = id.M0(2131750024, null);
            }
            t2Var2.setValue(M03);
        }
        if (this.H != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            t2 t2Var3 = this.H;
            if (size2 > 0 && size2 != arrayList2.size()) {
                M02 = id.H(',', "Gift2ResaleFilterBackdrops", size2);
            } else {
                M02 = id.M0(2131750028, null);
            }
            t2Var3.setValue(M02);
        }
        if (this.I != null) {
            int size3 = arrayList.size() - hashSet.size();
            t2 t2Var4 = this.I;
            if (size3 > 0 && size3 != arrayList.size()) {
                M0 = id.H(',', "Gift2ResaleFilterSymbols", size3);
            } else {
                M0 = id.M0(2131750020, null);
            }
            t2Var4.setValue(M0);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f60451n.getChildCount()) {
                break;
            } else if (this.f60451n.getChildAt(i11) instanceof mz) {
                b3Var.g(false);
                break;
            } else {
                i11++;
            }
        }
        if ((b3Var.f60251t || b3Var.f60237e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z10 = true;
        }
        this.f60446a.a(z10, true);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z9;
        try {
            super.onThemeColorsChanged();
            ri.c cVar = this.O;
            int i7 = k6.f27852d6;
            cVar.a(getThemedColor(i7));
            int w10 = k6.w(getThemedColor(i7), k6.r1(0.1f, getThemedColor(k6.Ci)));
            if (w10 != this.M) {
                this.M = w10;
                TextView textView = this.f60454w;
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
            int w11 = k6.w(k6.w0(k6.f27852d6, this.resourceProvider), k6.r1(0.04f, k6.w0(k6.G6, this.resourceProvider)));
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
