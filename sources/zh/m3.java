package zh;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.k7;
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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.ys;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nx;
import org.telegram.ui.qt0;
import org.telegram.ui.vq0;
public class m3 extends org.telegram.ui.ActionBar.f2 implements te.b {
    public LinearLayout D;
    public u2 E;
    public u2 F;
    public u2 G;
    public u2 H;
    public jz I;
    public int J;
    public int K;
    public float L;
    public gh.e M;
    public final yb.b N;
    public boolean O;
    public ValueAnimator P;
    public int Q;
    public LinearLayout R;
    public final te.a f60476a;
    public final long f60477b;
    public final String f60478c;
    public final c3 d;
    public c20 f60479e;
    public nx f60480f;
    public View h;
    public FrameLayout f60481n;
    public FrameLayout f60482r;
    public TextView f60483s;
    public vq0 f60484w;
    public boolean f60485x;
    public HorizontalScrollView f60486y;

    public m3(long j3, String str, long j10, h6 h6Var) {
        super(null);
        this.f60476a = new te.a(0, this, wq.h, 380L, false);
        ?? obj = new Object();
        obj.f59348e = this;
        this.N = obj;
        this.O = true;
        this.f60477b = j3;
        this.f60478c = str;
        this.resourceProvider = h6Var;
        c3 c3Var = new c3(this.currentAccount, j10, new e2(this, 0));
        this.d = c3Var;
        c3Var.g(false);
    }

    public static void Z(m3 m3Var, Context context) {
        c3 c3Var = m3Var.d;
        if (!m3Var.O || c3Var.f60268g.isEmpty()) {
            return;
        }
        k60 k60Var = new k60(m3Var, m3Var.G, false, false);
        k60Var.f35220t = false;
        k60Var.Y = true;
        k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        k60Var.R = true;
        k60Var.f35214p = new li.h(k60Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(c3Var.f60268g);
        Collections.sort(arrayList, new i2(m3Var, 1));
        nx nxVar = new nx(m3Var, new j2(m3Var, strArr, arrayList, 1), new k2(m3Var, k60Var, 1), null, 4);
        nxVar.f37496f3.f35845r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232737);
        t6.s(imageView, m6.F8, m3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ys ysVar = new ys(context, m3Var.resourceProvider);
        ysVar.setTextSize(1, 16.0f);
        ysVar.setInputType(573441);
        ysVar.setRawInputType(573441);
        t6.D(ysVar, m6.A6, m3Var.resourceProvider);
        t6.l(ysVar, 30, m6.G6, m3Var.resourceProvider);
        ysVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        ysVar.setCursorWidth(1.5f);
        ysVar.setHint(id.M0(2131750009, null));
        t6.U(ysVar, m6.E8, m3Var.resourceProvider);
        ysVar.setBackground(null);
        frameLayout.addView(ysVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ysVar.addTextChangedListener(new h7(strArr, nxVar, false, 13));
        if (arrayList.size() > 8) {
            k60Var.r(frameLayout, ha.o(-1, 44));
            k60Var.k();
        }
        if (!c3Var.f60271k.isEmpty()) {
            k60Var.c(2131232357, id.M0(2131745670, null), new l2(m3Var, 1), false);
        }
        k60Var.q(nxVar);
        m3Var.i0(m3Var.G, k60Var);
    }

    public static void a0(m3 m3Var, Context context) {
        c3 c3Var = m3Var.d;
        if (!m3Var.O || c3Var.h.isEmpty()) {
            return;
        }
        k60 k60Var = new k60(m3Var, m3Var.H, false, false);
        k60Var.f35220t = false;
        k60Var.Y = true;
        k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        k60Var.R = true;
        k60Var.f35214p = new li.h(k60Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(c3Var.h);
        Collections.sort(arrayList, new i2(m3Var, 2));
        nx nxVar = new nx(m3Var, new j2(m3Var, strArr, arrayList, 2), new k2(m3Var, k60Var, 2), null, 5);
        nxVar.f37496f3.f35845r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232737);
        t6.s(imageView, m6.F8, m3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ys ysVar = new ys(context, m3Var.resourceProvider);
        ysVar.setTextSize(1, 16.0f);
        ysVar.setInputType(573441);
        ysVar.setRawInputType(573441);
        t6.D(ysVar, m6.A6, m3Var.resourceProvider);
        t6.l(ysVar, 30, m6.G6, m3Var.resourceProvider);
        ysVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        ysVar.setCursorWidth(1.5f);
        ysVar.setHint(id.M0(2131750009, null));
        t6.U(ysVar, m6.E8, m3Var.resourceProvider);
        ysVar.setBackground(null);
        frameLayout.addView(ysVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ysVar.addTextChangedListener(new h7(strArr, nxVar, false, 14));
        if (arrayList.size() > 8) {
            k60Var.r(frameLayout, ha.o(-1, 44));
            k60Var.k();
        }
        if (!c3Var.f60272l.isEmpty()) {
            k60Var.c(2131232357, id.M0(2131745670, null), new l2(m3Var, 5), false);
        }
        k60Var.q(nxVar);
        m3Var.i0(m3Var.H, k60Var);
    }

    public static void b0(m3 m3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z9) {
        if (j3 == p10.i(m3Var.currentAccount).e()) {
            m3Var.d.d.remove(tL_starGiftUnique);
            m3Var.k0(false);
            if (j3 == p10.i(m3Var.currentAccount).e()) {
                gc a02 = gc.a0(m3Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String M0 = id.M0(2131752887, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                bc O = a02.O(document, M0, id.a0(null, null, 2131752888, jg.g.m(tL_starGiftUnique.num, ',', sb2)));
                O.f32211r = false;
                O.j();
            } else {
                bc O2 = gc.a0(m3Var).O(tL_starGiftUnique.getDocument(), id.M0(2131752885, null), id.a0(null, null, 2131752886, m5.s(m3Var.currentAccount, j3)));
                O2.f32211r = false;
                O2.j();
            }
            m3Var.I.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        o2 o2Var = new o2(bundle, tL_starGiftUnique, j3);
        r4 r4Var = m3Var.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).f27237b) {
            Dialog dialog = m3Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.w2) && z9) {
                ((org.telegram.ui.ActionBar.w2) dialog).N0 = true;
            }
            m3Var.finishFragment();
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(o2Var, false, z9);
            }
        } else {
            m3Var.presentFragment(o2Var, true, z9);
        }
        c20 c20Var = m3Var.f60479e;
        if (c20Var != null) {
            c20Var.a(Boolean.valueOf(z9));
        }
    }

    public static void d0(m3 m3Var, Context context) {
        c3 c3Var = m3Var.d;
        if (!m3Var.O || c3Var.f60267f.isEmpty()) {
            return;
        }
        k60 k60Var = new k60(m3Var, m3Var.F, false, false);
        k60Var.f35220t = false;
        k60Var.Y = true;
        k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        k60Var.R = true;
        k60Var.f35214p = new li.h(k60Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(c3Var.f60267f);
        Collections.sort(arrayList, new i2(m3Var, 0));
        nx nxVar = new nx(m3Var, new j2(m3Var, strArr, arrayList, 0), new k2(m3Var, k60Var, 0), null, 3);
        nxVar.f37496f3.f35845r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232737);
        t6.s(imageView, m6.F8, m3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ys ysVar = new ys(context, m3Var.resourceProvider);
        ysVar.setTextSize(1, 16.0f);
        ysVar.setInputType(573441);
        ysVar.setRawInputType(573441);
        t6.D(ysVar, m6.A6, m3Var.resourceProvider);
        t6.l(ysVar, 30, m6.G6, m3Var.resourceProvider);
        ysVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        ysVar.setCursorWidth(1.5f);
        ysVar.setHint(id.M0(2131750009, null));
        t6.U(ysVar, m6.E8, m3Var.resourceProvider);
        ysVar.setBackground(null);
        frameLayout.addView(ysVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ysVar.addTextChangedListener(new h7(strArr, nxVar, false, 12));
        if (arrayList.size() > 8) {
            k60Var.r(frameLayout, ha.o(-1, 44));
            k60Var.k();
        }
        if (!c3Var.f60270j.isEmpty()) {
            k60Var.c(2131232357, id.M0(2131745670, null), new l2(m3Var, 0), false);
        }
        k60Var.q(nxVar);
        m3Var.i0(m3Var.F, k60Var);
    }

    public static void e0(m3 m3Var, x31 x31Var) {
        Object obj = x31Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            k7 k7Var = new k7(m3Var.getParentActivity(), m3Var.currentAccount, m3Var.f60477b, m3Var.resourceProvider, null);
            k7Var.g2(tL_starGiftUnique.slug, tL_starGiftUnique, m3Var.d);
            k7Var.M2 = new n2(m3Var);
            m3Var.showDialog(k7Var);
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f60482r.setTranslationY((-org.telegram.messenger.g0.L(52.0f)) * f10);
            p00.d(this.f60481n, f10);
        }
    }

    @Override
    public final View createView(final Context context) {
        String H;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new qt0(this, 24));
        this.simpleActionBar.setTitle(this.f60478c);
        z4 z4Var = this.simpleActionBar;
        c3 c3Var = this.d;
        if (z4Var != null) {
            int i7 = c3Var.f60266e;
            if (i7 <= 0) {
                H = id.M0(2131750007, null);
            } else {
                H = id.H(',', "Gift2ListingsCount", i7);
            }
            z4Var.setSubtitle(H);
        }
        FrameLayout st0Var = new st0(context, null);
        t6.h(m6.f27834a7, st0Var, getResourceProvider());
        this.fragmentView = st0Var;
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        nx nxVar = new nx(this, new p0(this, 2), new n2(this), new z3.j(this), 2);
        this.f60480f = nxVar;
        nxVar.f37496f3.f35845r = false;
        nxVar.setSpanCount(3);
        this.f60480f.j(new yh.f(this, 1));
        st0Var.addView(this.f60480f, ha.e(-1, -1, 119));
        vq0 vq0Var = new vq0(context, new View.OnClickListener(this) {
            public final m3 f60331b;

            {
                this.f60331b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c3 c3Var2 = this.f60331b.d;
                        c3Var2.f60271k.clear();
                        c3Var2.f60270j.clear();
                        c3Var2.f60272l.clear();
                        c3Var2.h();
                        return;
                    default:
                        c3 c3Var3 = this.f60331b.d;
                        c3Var3.f60271k.clear();
                        c3Var3.f60270j.clear();
                        c3Var3.f60272l.clear();
                        c3Var3.h();
                        return;
                }
            }
        }, this.resourceProvider);
        this.f60484w = vq0Var;
        this.f60485x = false;
        vq0Var.setAlpha(0.0f);
        this.f60484w.setScaleX(0.95f);
        this.f60484w.setScaleY(0.95f);
        this.f60484w.setVisibility(8);
        st0Var.addView(this.f60484w, ha.e(-1, -1, 119));
        View view = new View(context);
        this.h = view;
        st0Var.addView(view, ha.e(-1, 0, 48));
        baseSimpleGlass.f(st0Var, this.f60480f, this.simpleActionBar, this.resourceProvider);
        View view2 = this.h;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.simpleActionBar.setBackground(null);
        r2 r2Var = new r2(this.currentAccount, context, this.resourceProvider);
        dh.c cVar = baseSimpleGlass.f21026c;
        fh.g c10 = cVar.c(r2Var, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        r2Var.setBackground(c10);
        ka.a(r2Var);
        r2Var.setOnClickListener(new wg.a1(6, this, r2Var));
        r2Var.setOnWidthChanged(new e2(this, 1));
        this.simpleActionBar.addView(r2Var, ha.e(-2, 58, 5));
        this.M = c8.g0.l(this.resourceProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        this.D = linearLayout;
        linearLayout.setOrientation(0);
        this.D.setClipChildren(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f60486y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f60486y.setOverScrollMode(2);
        this.f60486y.addView(this.D);
        this.f60486y.setClipChildren(false);
        st0Var.addView(this.f60486y, ha.e(-1, 52, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final wo woVar = new wo(24, context, this.resourceProvider);
        woVar.b(m6.h7, m6.f28000j7, m6.f28020k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        woVar.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        woVar.setScaleX(0.8f);
        woVar.setScaleY(0.8f);
        linearLayout2.addView(woVar, ha.r(26, 26, 16));
        TextView textView = new TextView(context);
        t6.U(textView, m6.G6, this.resourceProvider);
        jg.g.v(textView, 1, 14.0f, null, 2131749613);
        linearLayout2.addView(textView, ha.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = m6.Ci;
        int r12 = m6.r1(0.1f, getThemedColor(i10));
        linearLayout2.setBackground(m6.k0(L, L, L, L, 0, r12, r12));
        this.R = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60482r = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view3 = this.f60482r;
        fh.g c11 = cVar.c(view3, null, false);
        c11.p(c8.g0.l(this.resourceProvider));
        c11.q(org.telegram.messenger.g0.L(8.0f));
        c11.r(org.telegram.messenger.g0.L(20.0f));
        view3.setBackground(c11);
        this.f60482r.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f60355b;

            {
                this.f60355b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i11 = r3;
                final wo woVar2 = woVar;
                final m3 m3Var = this.f60355b;
                switch (i11) {
                    case 0:
                        c3 c3Var2 = m3Var.d;
                        if (m3Var.O) {
                            k60 H2 = k60.H(m3Var, m3Var.E);
                            H2.c(2131231890, id.M0(2131746139, null), new l2(m3Var, 2), false);
                            H2.c(2131231888, id.M0(2131746143, null), new l2(m3Var, 3), false);
                            H2.c(2131231889, id.M0(2131746141, null), new l2(m3Var, 4), false);
                            H2.k();
                            H2.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            c3 c3Var3 = m3Var.d;
                                            if (c3Var3.f60278r) {
                                                c3Var3.f60278r = false;
                                                woVar2.a(false, true);
                                                c3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            c3 c3Var4 = m3Var.d;
                                            if (!c3Var4.f60278r) {
                                                c3Var4.f60278r = true;
                                                woVar2.a(true, true);
                                                c3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, id.M0(2131749615, null), !c3Var2.f60278r);
                            H2.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            c3 c3Var3 = m3Var.d;
                                            if (c3Var3.f60278r) {
                                                c3Var3.f60278r = false;
                                                woVar2.a(false, true);
                                                c3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            c3 c3Var4 = m3Var.d;
                                            if (!c3Var4.f60278r) {
                                                c3Var4.f60278r = true;
                                                woVar2.a(true, true);
                                                c3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, id.M0(2131749614, null), c3Var2.f60278r);
                            H2.f35220t = false;
                            H2.Y = true;
                            H2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m3Var.i0(m3Var.E, H2);
                            return;
                        }
                        return;
                    default:
                        c3 c3Var3 = m3Var.d;
                        if (c3Var3 != null) {
                            boolean z9 = !c3Var3.f60278r;
                            c3Var3.f60278r = z9;
                            woVar2.a(z9, true);
                            c3Var3.h();
                            return;
                        }
                        return;
                }
            }
        });
        this.f60482r.addView(linearLayout2, ha.c(-1.0f, -2));
        ka.b(this.f60482r, 0.04f, 1.5f);
        st0Var.addView(this.f60482r, ha.e(-2, 56, 81));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f60481n = frameLayout2;
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view4 = this.f60481n;
        fh.g c12 = cVar.c(view4, null, false);
        c12.p(c8.g0.l(this.resourceProvider));
        c12.q(org.telegram.messenger.g0.L(8.0f));
        c12.r(org.telegram.messenger.g0.L(22.0f));
        view4.setBackground(c12);
        st0Var.addView(this.f60481n, ha.e(-2, 60, 81));
        this.f60483s = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new wp(2131232095, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131750014, null));
        this.f60483s.setText(spannableStringBuilder);
        t6.U(this.f60483s, i10, getResourceProvider());
        this.f60483s.setTypeface(org.telegram.messenger.g0.o());
        this.f60483s.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        TextView textView2 = this.f60483s;
        int L2 = org.telegram.messenger.g0.L(22.0f);
        int r13 = m6.r1(0.1f, getThemedColor(i10));
        textView2.setBackground(m6.k0(L2, L2, L2, L2, 0, r13, r13));
        this.f60483s.setGravity(17);
        this.f60481n.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f60331b;

            {
                this.f60331b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r2) {
                    case 0:
                        c3 c3Var2 = this.f60331b.d;
                        c3Var2.f60271k.clear();
                        c3Var2.f60270j.clear();
                        c3Var2.f60272l.clear();
                        c3Var2.h();
                        return;
                    default:
                        c3 c3Var3 = this.f60331b.d;
                        c3Var3.f60271k.clear();
                        c3Var3.f60270j.clear();
                        c3Var3.f60272l.clear();
                        c3Var3.h();
                        return;
                }
            }
        });
        this.f60481n.addView(this.f60483s, ha.c(-1.0f, -2));
        this.f60481n.setVisibility(8);
        ka.b(this.f60481n, 0.05f, 1.5f);
        onInsets(0, 0, 0, 0);
        u2 u2Var = new u2(context, this.resourceProvider, true);
        this.E = u2Var;
        u2Var.setSorting(c3Var.f60276p);
        g0(this.E, false);
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f60355b;

            {
                this.f60355b = this;
            }

            @Override
            public final void onClick(View view42) {
                int i11 = r3;
                final wo woVar2 = woVar;
                final m3 m3Var = this.f60355b;
                switch (i11) {
                    case 0:
                        c3 c3Var2 = m3Var.d;
                        if (m3Var.O) {
                            k60 H2 = k60.H(m3Var, m3Var.E);
                            H2.c(2131231890, id.M0(2131746139, null), new l2(m3Var, 2), false);
                            H2.c(2131231888, id.M0(2131746143, null), new l2(m3Var, 3), false);
                            H2.c(2131231889, id.M0(2131746141, null), new l2(m3Var, 4), false);
                            H2.k();
                            H2.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            c3 c3Var3 = m3Var.d;
                                            if (c3Var3.f60278r) {
                                                c3Var3.f60278r = false;
                                                woVar2.a(false, true);
                                                c3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            c3 c3Var4 = m3Var.d;
                                            if (!c3Var4.f60278r) {
                                                c3Var4.f60278r = true;
                                                woVar2.a(true, true);
                                                c3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, id.M0(2131749615, null), !c3Var2.f60278r);
                            H2.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            c3 c3Var3 = m3Var.d;
                                            if (c3Var3.f60278r) {
                                                c3Var3.f60278r = false;
                                                woVar2.a(false, true);
                                                c3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            c3 c3Var4 = m3Var.d;
                                            if (!c3Var4.f60278r) {
                                                c3Var4.f60278r = true;
                                                woVar2.a(true, true);
                                                c3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, id.M0(2131749614, null), c3Var2.f60278r);
                            H2.f35220t = false;
                            H2.Y = true;
                            H2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m3Var.i0(m3Var.E, H2);
                            return;
                        }
                        return;
                    default:
                        c3 c3Var3 = m3Var.d;
                        if (c3Var3 != null) {
                            boolean z9 = !c3Var3.f60278r;
                            c3Var3.f60278r = z9;
                            woVar2.a(z9, true);
                            c3Var3.h();
                            return;
                        }
                        return;
                }
            }
        });
        u2 u2Var2 = new u2(context, this.resourceProvider, true);
        this.F = u2Var2;
        u2Var2.setValue(id.M0(2131750387, null));
        g0(this.F, false);
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f60377b;

            {
                this.f60377b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        m3.d0(this.f60377b, context);
                        return;
                    case 1:
                        m3.Z(this.f60377b, context);
                        return;
                    default:
                        m3.a0(this.f60377b, context);
                        return;
                }
            }
        });
        u2 u2Var3 = new u2(context, this.resourceProvider, true);
        this.G = u2Var3;
        u2Var3.setValue(id.M0(2131750388, null));
        g0(this.G, false);
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f60377b;

            {
                this.f60377b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        m3.d0(this.f60377b, context);
                        return;
                    case 1:
                        m3.Z(this.f60377b, context);
                        return;
                    default:
                        m3.a0(this.f60377b, context);
                        return;
                }
            }
        });
        u2 u2Var4 = new u2(context, this.resourceProvider, true);
        this.H = u2Var4;
        u2Var4.setValue(id.M0(2131750380, null));
        g0(this.H, true);
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f60377b;

            {
                this.f60377b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        m3.d0(this.f60377b, context);
                        return;
                    case 1:
                        m3.Z(this.f60377b, context);
                        return;
                    default:
                        m3.a0(this.f60377b, context);
                        return;
                }
            }
        });
        jz jzVar = new jz(getParentActivity());
        this.I = jzVar;
        st0Var.addView(jzVar, ha.c(-1.0f, -1));
        h0(false, false);
        return st0Var;
    }

    public final void g0(u2 u2Var, boolean z9) {
        int L = org.telegram.messenger.g0.L(6.0f);
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        frameLayout.setPadding(L, L, L, L);
        int i7 = 0;
        fh.g c10 = getBaseSimpleGlass().f21026c.c(frameLayout, null, false);
        c10.p(this.M);
        c10.r(org.telegram.messenger.g0.L(20.0f));
        c10.q(L);
        frameLayout.setBackground(c10);
        frameLayout.addView(u2Var, ha.c(40.0f, -2));
        frameLayout.setOnClickListener(new a(u2Var, 3));
        ka.a(frameLayout);
        LinearLayout linearLayout = this.D;
        if (!z9) {
            i7 = -4;
        }
        linearLayout.addView(frameLayout, ha.t(-2, -2, 16, 0, 0, i7, 0));
    }

    public final void h0(boolean z9, boolean z10) {
        float f10;
        if (this.O == z9) {
            return;
        }
        this.O = z9;
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P = null;
        }
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, f10);
            this.P = ofFloat;
            ofFloat.addUpdateListener(new ti.d(this, 6));
            this.P.setInterpolator(wq.h);
            this.P.setDuration(420L);
            this.P.start();
            return;
        }
        this.L = f10;
        j0();
    }

    public final void i0(u2 u2Var, k60 k60Var) {
        FrameLayout frameLayout;
        j5 simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay != null && (k60Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) && (u2Var.getParent() instanceof FrameLayout)) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) k60Var.A;
            FrameLayout frameLayout2 = (FrameLayout) u2Var.getParent();
            yb.b bVar = this.N;
            if (bVar.f59345a && (frameLayout = (FrameLayout) bVar.f59346b) != null && frameLayout != frameLayout2) {
                frameLayout.setVisibility(0);
            }
            bVar.f59346b = frameLayout2;
            bVar.f59347c = u2Var;
            bVar.d = simpleMenuOverlay;
            k60Var.f35214p = new org.telegram.ui.ActionBar.k2(simpleMenuOverlay, 2);
            simpleMenuOverlay.setOnClosed(new di.u3(actionBarPopupWindow$ActionBarPopupWindowLayout, 1));
            simpleMenuOverlay.d(bVar, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
            return;
        }
        k60Var.Z();
    }

    @Override
    public final boolean isLightStatusBar() {
        if ((getLastStoryViewer() == null || getLastStoryViewer().G0) && i0.a.h(getThemedColor(m6.f27834a7)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        int i7;
        if (this.f60486y == null) {
            return;
        }
        float f10 = this.L;
        float L = org.telegram.messenger.g0.L(47.0f) * f10;
        this.f60486y.setTranslationY((oi.a.d(this.J) - org.telegram.messenger.g0.L(6.0f)) - L);
        this.f60486y.setAlpha(1.0f - f10);
        HorizontalScrollView horizontalScrollView = this.f60486y;
        if (f10 >= 1.0f) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        horizontalScrollView.setVisibility(i7);
        float f11 = -L;
        this.f60480f.setTranslationY(f11);
        this.h.setTranslationY(f11);
    }

    public final void k0(boolean z9) {
        String M0;
        String M02;
        String M03;
        String H;
        m41 m41Var;
        c3 c3Var = this.d;
        int i7 = c3Var.f60266e;
        HashSet hashSet = c3Var.f60272l;
        ArrayList arrayList = c3Var.h;
        HashSet hashSet2 = c3Var.f60271k;
        ArrayList arrayList2 = c3Var.f60268g;
        HashSet hashSet3 = c3Var.f60270j;
        ArrayList arrayList3 = c3Var.f60267f;
        if (i7 > 12) {
            h0(true, true);
        }
        nx nxVar = this.f60480f;
        boolean z10 = false;
        if (nxVar != null && (m41Var = nxVar.f37496f3) != null) {
            m41Var.O(true);
            if (z9) {
                this.f60480f.v0(0);
            }
        }
        z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            int i10 = c3Var.f60266e;
            if (i10 <= 0) {
                H = id.M0(2131750007, null);
            } else {
                H = id.H(',', "Gift2ListingsCount", i10);
            }
            z4Var.setSubtitle(H);
        }
        u2 u2Var = this.E;
        if (u2Var != null) {
            u2Var.setSorting(c3Var.f60276p);
        }
        if (this.F != null) {
            int size = arrayList3.size() - hashSet3.size();
            u2 u2Var2 = this.F;
            if (size > 0 && size != arrayList3.size()) {
                M03 = id.H(',', "Gift2ResaleFilterModels", size);
            } else {
                M03 = id.M0(2131750023, null);
            }
            u2Var2.setValue(M03);
        }
        if (this.G != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            u2 u2Var3 = this.G;
            if (size2 > 0 && size2 != arrayList2.size()) {
                M02 = id.H(',', "Gift2ResaleFilterBackdrops", size2);
            } else {
                M02 = id.M0(2131750027, null);
            }
            u2Var3.setValue(M02);
        }
        if (this.H != null) {
            int size3 = arrayList.size() - hashSet.size();
            u2 u2Var4 = this.H;
            if (size3 > 0 && size3 != arrayList.size()) {
                M0 = id.H(',', "Gift2ResaleFilterSymbols", size3);
            } else {
                M0 = id.M0(2131750019, null);
            }
            u2Var4.setValue(M0);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f60480f.getChildCount()) {
                break;
            } else if (this.f60480f.getChildAt(i11) instanceof lz) {
                c3Var.g(false);
                break;
            } else {
                i11++;
            }
        }
        if ((c3Var.f60280t || c3Var.f60266e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z10 = true;
        }
        this.f60476a.a(z10, true);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        z4 z4Var = this.simpleActionBar;
        if (z4Var != null && z4Var.getOccupyStatusBar()) {
            i10 = Math.max(i10, org.telegram.messenger.g0.f22561m);
        }
        this.J = i10;
        this.K = Math.max(i12, org.telegram.messenger.g0.f22562n);
        if (this.f60480f == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(40.0f) + oi.a.d(this.J);
        int L2 = org.telegram.messenger.g0.L(47.0f);
        int i13 = -oi.a.c(this.J);
        int i14 = (-oi.a.c(this.K)) - L2;
        org.telegram.messenger.g0.B3(this.f60480f, org.telegram.messenger.g0.L(7.33f), i13, org.telegram.messenger.g0.L(7.33f), i14);
        this.f60480f.setPadding(0, (org.telegram.messenger.g0.L(4.0f) + L) - i13, 0, (org.telegram.messenger.g0.L(56.0f) + this.K) - i14);
        this.h.getLayoutParams().height = org.telegram.messenger.g0.L(6.0f) + L;
        this.h.requestLayout();
        org.telegram.messenger.g0.B3(this.f60484w, 0, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.J, 0, 0);
        ((FrameLayout.LayoutParams) this.f60482r.getLayoutParams()).bottomMargin = this.K;
        ((FrameLayout.LayoutParams) this.f60481n.getLayoutParams()).bottomMargin = this.K;
        this.f60482r.requestLayout();
        this.f60481n.requestLayout();
        j0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int r12 = m6.r1(0.1f, getThemedColor(m6.Ci));
            if (r12 != this.Q) {
                this.Q = r12;
                TextView textView = this.f60483s;
                if (textView != null) {
                    m6.H1(textView.getBackground(), r12, true);
                }
                LinearLayout linearLayout = this.R;
                if (linearLayout != null) {
                    m6.H1(linearLayout.getBackground(), r12, true);
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
