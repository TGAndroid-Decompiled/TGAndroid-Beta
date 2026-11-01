package ph;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.o5;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bg0;
import org.telegram.ui.my;
import org.telegram.ui.qv0;
import org.telegram.ui.w8;
import org.telegram.ui.z01;
import rh.w7;
import w7.b6;
import w7.b9;
import w7.e6;
public class r3 extends org.telegram.ui.ActionBar.k2 implements fe.e {
    public HorizontalScrollView D;
    public LinearLayout E;
    public z2 F;
    public z2 G;
    public z2 H;
    public z2 I;
    public xz J;
    public boolean K;
    public int L;
    public int M;
    public LinearLayout N;
    public hi.c O;
    public tg.b P;
    public final fe.b f45303a;
    public final long f45304b;
    public final String f45305c;
    public final h3 d;
    public r20 e;
    public org.telegram.ui.ActionBar.c2 f45306f;
    public View h;
    public my f45307n;
    public FrameLayout f45308r;
    public FrameLayout f45309s;
    public TextView f45310w;
    public bg0 f45311x;
    public boolean f45312y;

    public r3(long j10, String str, long j11, p6 p6Var) {
        super(null);
        this.f45303a = new fe.b(0, this, gr.h, 380L, false);
        this.K = true;
        this.f45304b = j10;
        this.f45305c = str;
        this.resourceProvider = p6Var;
        h3 h3Var = new h3(this.currentAccount, j11, new h1(this, 1));
        this.d = h3Var;
        h3Var.g(false);
    }

    public static void Z(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        if (j10 == e20.i(r3Var.currentAccount).e()) {
            r3Var.d.d.remove(tL_starGiftUnique);
            r3Var.j0(false);
            if (j10 == e20.i(r3Var.currentAccount).e()) {
                cc a02 = cc.a0(r3Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String L0 = dd.L0(2131752887, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                wb O = a02.O(document, L0, dd.a0(null, null, 2131752888, i0.a.k(tL_starGiftUnique.num, ',', sb2)));
                O.f32209r = false;
                O.j();
            } else {
                wb O2 = cc.a0(r3Var).O(tL_starGiftUnique.getDocument(), dd.L0(2131752885, null), dd.a0(null, null, 2131752886, o5.s(r3Var.currentAccount, j10)));
                O2.f32209r = false;
                O2.j();
            }
            r3Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        u2 u2Var = new u2(bundle, tL_starGiftUnique, j10);
        z4 z4Var = r3Var.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).f20073b) {
            Dialog dialog = r3Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.z2) && z10) {
                ((org.telegram.ui.ActionBar.z2) dialog).N0 = true;
            }
            r3Var.finishFragment();
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(u2Var, false, z10);
            }
        } else {
            r3Var.presentFragment(u2Var, true, z10);
        }
        r20 r20Var = r3Var.e;
        if (r20Var != null) {
            r20Var.a(Boolean.valueOf(z10));
        }
    }

    public static void a0(r3 r3Var, Context context) {
        h3 h3Var = r3Var.d;
        if (!r3Var.K || h3Var.h.isEmpty()) {
            return;
        }
        z60 z60Var = new z60(r3Var, r3Var.I, false, false);
        z60Var.f33045t = false;
        z60Var.Y = true;
        z60Var.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
        z60Var.R = true;
        z60Var.f33039p = new bi.j(z60Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(h3Var.h);
        Collections.sort(arrayList, new l2(r3Var, 0));
        my myVar = new my(r3Var, new m2(r3Var, strArr, arrayList, 0), new n2(r3Var, z60Var, 0), null, 5);
        myVar.f31183f3.f29638r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232734);
        a7.t(imageView, t6.F8, r3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        mt mtVar = new mt(context, r3Var.resourceProvider);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setInputType(573441);
        mtVar.setRawInputType(573441);
        a7.E(mtVar, t6.A6, r3Var.resourceProvider);
        a7.m(mtVar, 30, t6.G6, r3Var.resourceProvider);
        mtVar.setCursorSize(org.telegram.messenger.i0.L(19.0f));
        mtVar.setCursorWidth(1.5f);
        mtVar.setHint(dd.L0(2131750018, null));
        a7.V(mtVar, t6.E8, r3Var.resourceProvider);
        mtVar.setBackground(null);
        frameLayout.addView(mtVar, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        mtVar.addTextChangedListener(new ag.u2(11, strArr, myVar));
        if (arrayList.size() > 8) {
            z60Var.r(frameLayout, b6.o(-1, 44));
            z60Var.k();
        }
        if (!h3Var.f45108l.isEmpty()) {
            z60Var.c(2131232356, dd.L0(2131745687, null), new o2(r3Var, 0), false);
        }
        z60Var.q(myVar);
        z60Var.Z();
    }

    public static void b0(r3 r3Var, Context context) {
        h3 h3Var = r3Var.d;
        if (!r3Var.K || h3Var.f45103f.isEmpty()) {
            return;
        }
        z60 z60Var = new z60(r3Var, r3Var.G, false, false);
        z60Var.f33045t = false;
        z60Var.Y = true;
        z60Var.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
        z60Var.R = true;
        z60Var.f33039p = new bi.j(z60Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(h3Var.f45103f);
        Collections.sort(arrayList, new l2(r3Var, 2));
        my myVar = new my(r3Var, new m2(r3Var, strArr, arrayList, 2), new n2(r3Var, z60Var, 2), null, 3);
        myVar.f31183f3.f29638r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232734);
        a7.t(imageView, t6.F8, r3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        mt mtVar = new mt(context, r3Var.resourceProvider);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setInputType(573441);
        mtVar.setRawInputType(573441);
        a7.E(mtVar, t6.A6, r3Var.resourceProvider);
        a7.m(mtVar, 30, t6.G6, r3Var.resourceProvider);
        mtVar.setCursorSize(org.telegram.messenger.i0.L(19.0f));
        mtVar.setCursorWidth(1.5f);
        mtVar.setHint(dd.L0(2131750018, null));
        a7.V(mtVar, t6.E8, r3Var.resourceProvider);
        mtVar.setBackground(null);
        frameLayout.addView(mtVar, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        mtVar.addTextChangedListener(new ag.u2(12, strArr, myVar));
        if (arrayList.size() > 8) {
            z60Var.r(frameLayout, b6.o(-1, 44));
            z60Var.k();
        }
        if (!h3Var.f45106j.isEmpty()) {
            z60Var.c(2131232356, dd.L0(2131745687, null), new o2(r3Var, 2), false);
        }
        z60Var.q(myVar);
        z60Var.Z();
    }

    public static void c0(r3 r3Var, Context context) {
        h3 h3Var = r3Var.d;
        if (!r3Var.K || h3Var.f45104g.isEmpty()) {
            return;
        }
        z60 z60Var = new z60(r3Var, r3Var.H, false, false);
        z60Var.f33045t = false;
        z60Var.Y = true;
        z60Var.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
        z60Var.R = true;
        z60Var.f33039p = new bi.j(z60Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(h3Var.f45104g);
        Collections.sort(arrayList, new l2(r3Var, 1));
        my myVar = new my(r3Var, new m2(r3Var, strArr, arrayList, 1), new n2(r3Var, z60Var, 1), null, 4);
        myVar.f31183f3.f29638r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232734);
        a7.t(imageView, t6.F8, r3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        mt mtVar = new mt(context, r3Var.resourceProvider);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setInputType(573441);
        mtVar.setRawInputType(573441);
        a7.E(mtVar, t6.A6, r3Var.resourceProvider);
        a7.m(mtVar, 30, t6.G6, r3Var.resourceProvider);
        mtVar.setCursorSize(org.telegram.messenger.i0.L(19.0f));
        mtVar.setCursorWidth(1.5f);
        mtVar.setHint(dd.L0(2131750018, null));
        a7.V(mtVar, t6.E8, r3Var.resourceProvider);
        mtVar.setBackground(null);
        frameLayout.addView(mtVar, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        mtVar.addTextChangedListener(new ag.u2(13, strArr, myVar));
        if (arrayList.size() > 8) {
            z60Var.r(frameLayout, b6.o(-1, 44));
            z60Var.k();
        }
        if (!h3Var.f45107k.isEmpty()) {
            z60Var.c(2131232356, dd.L0(2131745687, null), new o2(r3Var, 1), false);
        }
        z60Var.q(myVar);
        z60Var.Z();
    }

    public static void d0(r3 r3Var, b51 b51Var) {
        Object obj = b51Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            rh.e4 e4Var = new rh.e4(r3Var.getParentActivity(), r3Var.currentAccount, r3Var.f45304b, r3Var.resourceProvider, null);
            e4Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, r3Var.d);
            e4Var.J2 = new q2(r3Var);
            r3Var.showDialog(e4Var);
        }
    }

    public static org.telegram.ui.ActionBar.l e0(r3 r3Var) {
        return r3Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l f0(r3 r3Var) {
        return r3Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l g0(r3 r3Var) {
        return r3Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l h0(r3 r3Var) {
        return r3Var.actionBar;
    }

    @Override
    public final View createView(final Context context) {
        hi.c cVar = new hi.c();
        this.O = cVar;
        int i10 = t6.f20930d6;
        cVar.a(getThemedColor(i10));
        hi.c cVar2 = this.O;
        this.P = new tg.b(cVar2, cVar2, cVar2);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        this.f45306f = c2Var;
        lVar.setBackButtonDrawable(c2Var);
        this.f45306f.f20203k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, 14));
        this.actionBar.setTitle(this.f45305c);
        a7.i(i10, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = t6.G6;
        a7.m(lVar2, 1, i11, getResourceProvider());
        a7.b(this.actionBar, i11, getResourceProvider(), true);
        a7.m(this.actionBar, 3, t6.f21333z8, getResourceProvider());
        a7.m(this.actionBar, 5, i11, getResourceProvider());
        a7.c(this.actionBar, t6.f21331z6, getResourceProvider());
        w8 w8Var = new w8(this, context, 10);
        int w9 = t6.w(t6.w0(i10, this.resourceProvider), t6.r1(0.04f, t6.w0(i11, this.resourceProvider)));
        w8Var.setBackgroundColor(w9);
        this.L = w9;
        this.fragmentView = w8Var;
        w7 w7Var = new w7(this.currentAccount, context, this.resourceProvider);
        w7Var.d = true;
        e6.a(w7Var);
        w7Var.setOnClickListener(new qv0(20, this, w7Var));
        this.actionBar.addView(w7Var, b6.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        my myVar = new my(this, new ag.a(this, 27), new q2(this), new org.telegram.utils.twidget.t(this, 8), 2);
        this.f45307n = myVar;
        myVar.f31183f3.f29638r = false;
        myVar.setSpanCount(3);
        this.f45307n.j(new cu0(this, 11));
        this.f45307n.setPadding(0, org.telegram.messenger.i0.L(45.0f), 0, org.telegram.messenger.i0.L(101.0f));
        this.f45307n.setClipToPadding(false);
        w8Var.addView(this.f45307n, b6.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        w8Var.addView(this.actionBar);
        bg0 bg0Var = new bg0(context, (r2) new View.OnClickListener(this) {
            public final r3 f45302b;

            {
                this.f45302b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h3 h3Var = this.f45302b.d;
                        h3Var.f45107k.clear();
                        h3Var.f45106j.clear();
                        h3Var.f45108l.clear();
                        h3Var.h();
                        return;
                    default:
                        h3 h3Var2 = this.f45302b.d;
                        h3Var2.f45107k.clear();
                        h3Var2.f45106j.clear();
                        h3Var2.f45108l.clear();
                        h3Var2.h();
                        return;
                }
            }
        }, this.resourceProvider);
        this.f45311x = bg0Var;
        this.f45312y = false;
        bg0Var.setAlpha(0.0f);
        this.f45311x.setScaleX(0.95f);
        this.f45311x.setScaleY(0.95f);
        this.f45311x.setVisibility(8);
        w8Var.addView(this.f45311x, b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f), 0);
        this.E.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.D = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.D.addView(this.E);
        this.D.setBackgroundColor(w9);
        this.D.setClipChildren(false);
        w8Var.addView(this.D, b6.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        a7.i(t6.f20931d7, view, getResourceProvider());
        this.h.setAlpha(0.0f);
        w8Var.addView(this.h, b6.a(-1.0f, 2.0f / org.telegram.messenger.i0.f16171p, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final ep epVar = new ep(24, context, this.resourceProvider);
        epVar.b(t6.f21004h7, t6.f21040j7, t6.f21060k7);
        epVar.setDrawUnchecked(true);
        epVar.a(false, false);
        epVar.setDrawBackgroundAsArc(10);
        epVar.setTranslationX(org.telegram.messenger.i0.L(4.0f));
        epVar.setScaleX(0.8f);
        epVar.setScaleY(0.8f);
        linearLayout2.addView(epVar, b6.r(26, 26, 16));
        TextView textView = new TextView(context);
        a7.V(textView, t6.f21038j5, this.resourceProvider);
        sc.e.u(textView, 1, 14.0f, null, 2131749622);
        linearLayout2.addView(textView, b6.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.i0.L(18.0f);
        int themedColor = getThemedColor(i10);
        int i12 = t6.Ci;
        int w10 = t6.w(themedColor, t6.r1(0.1f, getThemedColor(i12)));
        linearLayout2.setBackground(t6.k0(L, L, L, L, 0, w10, w10));
        this.N = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45309s = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        FrameLayout frameLayout2 = this.f45309s;
        vg.f c10 = this.P.c(frameLayout2, null, false);
        c10.o(b9.l(this.resourceProvider));
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.q(org.telegram.messenger.i0.L(18.0f));
        frameLayout2.setBackground(c10);
        this.f45309s.setOnClickListener(new View.OnClickListener(this) {
            public final r3 f45317b;

            {
                this.f45317b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i13 = r3;
                final ep epVar2 = epVar;
                final r3 r3Var = this.f45317b;
                switch (i13) {
                    case 0:
                        h3 h3Var = r3Var.d;
                        if (h3Var != null) {
                            boolean z10 = !h3Var.f45114r;
                            h3Var.f45114r = z10;
                            epVar2.a(z10, true);
                            h3Var.h();
                            return;
                        }
                        return;
                    default:
                        h3 h3Var2 = r3Var.d;
                        if (r3Var.K) {
                            z60 H = z60.H(r3Var, r3Var.F);
                            H.c(2131231889, dd.L0(2131746156, null), new o2(r3Var, 3), false);
                            H.c(2131231887, dd.L0(2131746160, null), new o2(r3Var, 4), false);
                            H.c(2131231888, dd.L0(2131746158, null), new o2(r3Var, 5), false);
                            H.k();
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            h3 h3Var3 = r3Var.d;
                                            if (h3Var3.f45114r) {
                                                h3Var3.f45114r = false;
                                                epVar2.a(false, true);
                                                h3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            h3 h3Var4 = r3Var.d;
                                            if (!h3Var4.f45114r) {
                                                h3Var4.f45114r = true;
                                                epVar2.a(true, true);
                                                h3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, dd.L0(2131749624, null), !h3Var2.f45114r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            h3 h3Var3 = r3Var.d;
                                            if (h3Var3.f45114r) {
                                                h3Var3.f45114r = false;
                                                epVar2.a(false, true);
                                                h3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            h3 h3Var4 = r3Var.d;
                                            if (!h3Var4.f45114r) {
                                                h3Var4.f45114r = true;
                                                epVar2.a(true, true);
                                                h3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, dd.L0(2131749623, null), h3Var2.f45114r);
                            H.f33045t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f45309s.addView(linearLayout2, b6.c(-1.0f, -2));
        e6.b(this.f45309s, 0.04f, 1.5f);
        w8Var.addView(this.f45309s, b6.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.f16167n / org.telegram.messenger.i0.f16171p));
        rh.e6 y3 = rh.e6.y(this.currentAccount, true);
        if (y3.e && !y3.s().k()) {
            this.f45309s.setVisibility(8);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f45308r = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        FrameLayout frameLayout4 = this.f45308r;
        vg.f c11 = this.P.c(frameLayout4, null, false);
        c11.o(b9.l(this.resourceProvider));
        c11.p(org.telegram.messenger.i0.L(8.0f));
        c11.q(org.telegram.messenger.i0.L(22.0f));
        frameLayout4.setBackground(c11);
        w8Var.addView(this.f45308r, b6.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.f16167n / org.telegram.messenger.i0.f16171p));
        this.f45310w = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new dq(2131232094, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) dd.L0(2131750023, null));
        this.f45310w.setText(spannableStringBuilder);
        a7.V(this.f45310w, i12, getResourceProvider());
        this.f45310w.setTypeface(org.telegram.messenger.i0.o());
        this.f45310w.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
        TextView textView2 = this.f45310w;
        int L2 = org.telegram.messenger.i0.L(22.0f);
        int w11 = t6.w(getThemedColor(i10), t6.r1(0.1f, getThemedColor(i12)));
        textView2.setBackground(t6.k0(L2, L2, L2, L2, 0, w11, w11));
        this.f45310w.setGravity(17);
        this.f45308r.setOnClickListener(new View.OnClickListener(this) {
            public final r3 f45302b;

            {
                this.f45302b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        h3 h3Var = this.f45302b.d;
                        h3Var.f45107k.clear();
                        h3Var.f45106j.clear();
                        h3Var.f45108l.clear();
                        h3Var.h();
                        return;
                    default:
                        h3 h3Var2 = this.f45302b.d;
                        h3Var2.f45107k.clear();
                        h3Var2.f45106j.clear();
                        h3Var2.f45108l.clear();
                        h3Var2.h();
                        return;
                }
            }
        });
        this.f45308r.addView(this.f45310w, b6.c(-1.0f, -2));
        this.f45308r.setVisibility(8);
        e6.b(this.f45308r, 0.05f, 1.5f);
        z2 z2Var = new z2(context, this.resourceProvider);
        this.F = z2Var;
        z2Var.setSorting(this.d.f45112p);
        this.E.addView(this.F, b6.t(-2, -2, 16, 0, 0, 6, 0));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final r3 f45317b;

            {
                this.f45317b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i13 = r3;
                final ep epVar2 = epVar;
                final r3 r3Var = this.f45317b;
                switch (i13) {
                    case 0:
                        h3 h3Var = r3Var.d;
                        if (h3Var != null) {
                            boolean z10 = !h3Var.f45114r;
                            h3Var.f45114r = z10;
                            epVar2.a(z10, true);
                            h3Var.h();
                            return;
                        }
                        return;
                    default:
                        h3 h3Var2 = r3Var.d;
                        if (r3Var.K) {
                            z60 H = z60.H(r3Var, r3Var.F);
                            H.c(2131231889, dd.L0(2131746156, null), new o2(r3Var, 3), false);
                            H.c(2131231887, dd.L0(2131746160, null), new o2(r3Var, 4), false);
                            H.c(2131231888, dd.L0(2131746158, null), new o2(r3Var, 5), false);
                            H.k();
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            h3 h3Var3 = r3Var.d;
                                            if (h3Var3.f45114r) {
                                                h3Var3.f45114r = false;
                                                epVar2.a(false, true);
                                                h3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            h3 h3Var4 = r3Var.d;
                                            if (!h3Var4.f45114r) {
                                                h3Var4.f45114r = true;
                                                epVar2.a(true, true);
                                                h3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, dd.L0(2131749624, null), !h3Var2.f45114r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            h3 h3Var3 = r3Var.d;
                                            if (h3Var3.f45114r) {
                                                h3Var3.f45114r = false;
                                                epVar2.a(false, true);
                                                h3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            h3 h3Var4 = r3Var.d;
                                            if (!h3Var4.f45114r) {
                                                h3Var4.f45114r = true;
                                                epVar2.a(true, true);
                                                h3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, dd.L0(2131749623, null), h3Var2.f45114r);
                            H.f33045t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        z2 z2Var2 = new z2(context, this.resourceProvider);
        this.G = z2Var2;
        z2Var2.setValue(dd.L0(2131750396, null));
        this.E.addView(this.G, b6.t(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final r3 f45179b;

            {
                this.f45179b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        r3.b0(this.f45179b, context);
                        return;
                    case 1:
                        r3.c0(this.f45179b, context);
                        return;
                    default:
                        r3.a0(this.f45179b, context);
                        return;
                }
            }
        });
        z2 z2Var3 = new z2(context, this.resourceProvider);
        this.H = z2Var3;
        z2Var3.setValue(dd.L0(2131750397, null));
        this.E.addView(this.H, b6.t(-2, -2, 16, 0, 0, 6, 0));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final r3 f45179b;

            {
                this.f45179b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        r3.b0(this.f45179b, context);
                        return;
                    case 1:
                        r3.c0(this.f45179b, context);
                        return;
                    default:
                        r3.a0(this.f45179b, context);
                        return;
                }
            }
        });
        z2 z2Var4 = new z2(context, this.resourceProvider);
        this.I = z2Var4;
        z2Var4.setValue(dd.L0(2131750389, null));
        this.E.addView(this.I, b6.t(-2, -2, 16, 0, 0, 0, 0));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final r3 f45179b;

            {
                this.f45179b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        r3.b0(this.f45179b, context);
                        return;
                    case 1:
                        r3.c0(this.f45179b, context);
                        return;
                    default:
                        r3.a0(this.f45179b, context);
                        return;
                }
            }
        });
        xz xzVar = new xz(getParentActivity());
        this.J = xzVar;
        w8Var.addView(xzVar, b6.c(-1.0f, -1));
        i0(false, false);
        return w8Var;
    }

    public final void i0(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.K == z10) {
            return;
        }
        this.K = z10;
        float f13 = 1.0f;
        int i10 = 0;
        float f14 = 0.0f;
        if (z11) {
            this.D.setVisibility(0);
            ViewPropertyAnimator animate = this.D.animate();
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.i0.L(45.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(f11);
            if (!z10) {
                f13 = 0.0f;
            }
            ViewPropertyAnimator alpha = translationY.alpha(f13);
            gr grVar = gr.h;
            alpha.setInterpolator(grVar).setDuration(420L).setListener(new t2(this, z10, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = -org.telegram.messenger.i0.L(45.0f);
            }
            animate2.translationY(f12).setInterpolator(grVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f45307n.animate();
            if (!z10) {
                f14 = -org.telegram.messenger.i0.L(39.0f);
            }
            animate3.translationY(f14).setInterpolator(grVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.D;
        if (!z10) {
            i10 = 8;
        }
        horizontalScrollView.setVisibility(i10);
        HorizontalScrollView horizontalScrollView2 = this.D;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -org.telegram.messenger.i0.L(45.0f);
        }
        horizontalScrollView2.setTranslationY(f7);
        HorizontalScrollView horizontalScrollView3 = this.D;
        if (!z10) {
            f13 = 0.0f;
        }
        horizontalScrollView3.setAlpha(f13);
        View view = this.h;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.i0.L(45.0f);
        }
        view.setTranslationY(f10);
        my myVar = this.f45307n;
        if (!z10) {
            f14 = -org.telegram.messenger.i0.L(39.0f);
        }
        myVar.setTranslationY(f14);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = t6.x0(null, t6.f20930d6, false);
            if (this.actionBar.u()) {
                x02 = t6.x0(null, t6.f21280w8, false);
            }
            if (i0.b.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        String L0;
        String L02;
        String L03;
        String H;
        q51 q51Var;
        h3 h3Var = this.d;
        int i10 = h3Var.e;
        HashSet hashSet = h3Var.f45108l;
        ArrayList arrayList = h3Var.h;
        HashSet hashSet2 = h3Var.f45107k;
        ArrayList arrayList2 = h3Var.f45104g;
        HashSet hashSet3 = h3Var.f45106j;
        ArrayList arrayList3 = h3Var.f45103f;
        if (i10 > 12) {
            i0(true, true);
        }
        my myVar = this.f45307n;
        boolean z11 = false;
        if (myVar != null && (q51Var = myVar.f31183f3) != null) {
            q51Var.O(true);
            if (z10) {
                this.f45307n.v0(0);
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setTitle(this.f45305c);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            int i11 = h3Var.e;
            if (i11 <= 0) {
                H = dd.L0(2131750016, null);
            } else {
                H = dd.H(',', "Gift2ListingsCount", i11);
            }
            lVar2.setSubtitle(H);
        }
        z2 z2Var = this.F;
        if (z2Var != null) {
            z2Var.setSorting(h3Var.f45112p);
        }
        if (this.G != null) {
            int size = arrayList3.size() - hashSet3.size();
            z2 z2Var2 = this.G;
            if (size > 0 && size != arrayList3.size()) {
                L03 = dd.H(',', "Gift2ResaleFilterModels", size);
            } else {
                L03 = dd.L0(2131750032, null);
            }
            z2Var2.setValue(L03);
        }
        if (this.H != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            z2 z2Var3 = this.H;
            if (size2 > 0 && size2 != arrayList2.size()) {
                L02 = dd.H(',', "Gift2ResaleFilterBackdrops", size2);
            } else {
                L02 = dd.L0(2131750036, null);
            }
            z2Var3.setValue(L02);
        }
        if (this.I != null) {
            int size3 = arrayList.size() - hashSet.size();
            z2 z2Var4 = this.I;
            if (size3 > 0 && size3 != arrayList.size()) {
                L0 = dd.H(',', "Gift2ResaleFilterSymbols", size3);
            } else {
                L0 = dd.L0(2131750028, null);
            }
            z2Var4.setValue(L0);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.f45307n.getChildCount()) {
                break;
            } else if (this.f45307n.getChildAt(i12) instanceof zz) {
                h3Var.g(false);
                break;
            } else {
                i12++;
            }
        }
        if ((h3Var.f45116t || h3Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f45303a.a(z11, true);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        try {
            super.onThemeColorsChanged();
            hi.c cVar = this.O;
            int i10 = t6.f20930d6;
            cVar.a(getThemedColor(i10));
            int w9 = t6.w(getThemedColor(i10), t6.r1(0.1f, getThemedColor(t6.Ci)));
            if (w9 != this.M) {
                this.M = w9;
                TextView textView = this.f45310w;
                if (textView != null) {
                    t6.H1(textView.getBackground(), w9, true);
                }
                LinearLayout linearLayout = this.N;
                if (linearLayout != null) {
                    t6.H1(linearLayout.getBackground(), w9, true);
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            int w10 = t6.w(t6.w0(t6.f20930d6, this.resourceProvider), t6.r1(0.04f, t6.w0(t6.G6, this.resourceProvider)));
            int i11 = this.L;
            if (w10 != i11) {
                HorizontalScrollView horizontalScrollView = this.D;
                boolean z11 = false;
                if (horizontalScrollView != null && (horizontalScrollView.getBackground() instanceof ColorDrawable) && ((ColorDrawable) horizontalScrollView.getBackground()).getColor() == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.D.setBackgroundColor(w10);
                }
                View view = this.fragmentView;
                int i12 = this.L;
                if (view != null && (view.getBackground() instanceof ColorDrawable) && ((ColorDrawable) view.getBackground()).getColor() == i12) {
                    z11 = true;
                }
                if (z11) {
                    this.fragmentView.setBackgroundColor(w10);
                }
                this.L = w10;
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            this.f45309s.setTranslationY((-org.telegram.messenger.i0.L(52.0f)) * f7);
            f10.d(this.f45308r, f7);
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
