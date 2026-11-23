package wg;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.p3;
import c8.na;
import c8.sa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.p10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.pg0;
import org.telegram.ui.qg0;
import org.telegram.ui.rg0;
import org.telegram.ui.tv;
import org.telegram.ui.u00;
import ug.i1;
public final class d1 extends ra implements fs {
    public final int T1;
    public final rg0 U1;
    public final qg0 V1;
    public final tv W1;
    public final pg0 X1;
    public final lp Y1;
    public final ah.a Z1;
    public final ArrayList f59848a2;
    public final ArrayList f59849b2;
    public final HashSet f59850c2;
    public final ArrayList d2;
    public final ArrayList f59851e2;
    public final ArrayList f59852f2;
    public final HashMap f59853g2;
    public final ArrayList f59854h2;
    public final LinkedHashMap f59855i2;
    public String f59856j2;
    public xg.h f59857k2;
    public int f59858l2;
    public final ArrayList f59859m2;
    public boolean f59860n2;
    public float f59861o2;
    public np f59862p2;
    public final o5 f59863q2;
    public int f59864r2;
    public u00 f59865s2;
    public final HashSet f59866t2;
    public p10 f59867u2;

    public d1(Context context, int i7, fi.h0 h0Var) {
        super(context, null, true, false, h0Var);
        this.f59848a2 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f59849b2 = arrayList;
        HashSet hashSet = new HashSet();
        this.f59850c2 = hashSet;
        this.d2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f59851e2 = arrayList2;
        this.f59852f2 = new ArrayList();
        this.f59853g2 = new HashMap();
        this.f59854h2 = new ArrayList();
        this.f59855i2 = new LinkedHashMap();
        this.f59858l2 = org.telegram.messenger.g0.L(120.0f);
        this.f59859m2 = new ArrayList();
        this.f59860n2 = false;
        this.f59863q2 = new o5(this, 13);
        this.f59864r2 = -1;
        this.f59866t2 = new HashSet();
        this.f30223a = i7;
        int i10 = n6.f29524h5;
        Q(i10);
        this.f30258s = false;
        this.T1 = 4;
        xg.h hVar = this.f59857k2;
        if (hVar != null) {
            hVar.f60637y = true;
        }
        pg0 pg0Var = new pg0(1, getContext(), h0Var);
        this.X1 = pg0Var;
        pg0Var.setOnCloseClickListener(new w0(this, 10));
        pg0Var.setText(P0());
        pg0Var.setCloseImageVisible(false);
        pg0Var.f1068f.c(false, 0.0f);
        this.f59862p2 = new np(this, 3);
        qg0 qg0Var = new qg0(this, getContext(), h0Var, 1);
        this.V1 = qg0Var;
        u6.h(i10, qg0Var, h0Var);
        qg0Var.setOnSearchTextChange(new y0(this, 1));
        hashSet.isEmpty();
        qg0Var.f1094b.r(gd.N0(2131745640, null), false);
        tv tvVar = new tv(15, getContext(), this);
        this.W1 = tvVar;
        ViewGroup viewGroup = this.f30226b;
        int i11 = this.f30261u0;
        viewGroup.addView(pg0Var, 0, na.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ViewGroup viewGroup2 = this.f30226b;
        int i12 = this.f30261u0;
        viewGroup2.addView(qg0Var, na.f(-2.0f, -1, 55, i12, 0, i12, 0));
        ViewGroup viewGroup3 = this.f30226b;
        int i13 = this.f30261u0;
        viewGroup3.addView(tvVar, na.f(1.0f, -1, 55, i13, 0, i13, 0));
        ah.a aVar = new ah.a(getContext(), h0Var, (ek0) null);
        this.Z1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        u6.h(i10, aVar, h0Var);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i14 = n6.f29543i6;
        org.telegram.ui.Cells.y a02 = n6.a0(n6.w0(i14, this.J0), 6, 6);
        q6 M = u6.M(i14);
        linearLayout.setBackground(a02);
        u6.j(linearLayout, a02, null, M, h0Var);
        lp lpVar = new lp(24, context, h0Var);
        this.Y1 = lpVar;
        lpVar.b(n6.Fi, n6.f29561j7, n6.f29581k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(false, false);
        lpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(lpVar, na.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        u6.U(textView, n6.f29559j5, h0Var);
        i5.c.r(14.0f, 1, 2131751813, textView, null);
        linearLayout.addView(textView, na.t(-2, -2, 16, 9, 0, 0, 0));
        sa.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final d1 f59833b;

            {
                this.f59833b = this;
            }

            @Override
            public final void onClick(View view) {
                lp lpVar2;
                int i15 = r2;
                d1 d1Var = this.f59833b;
                boolean z10 = true;
                switch (i15) {
                    case 0:
                        d1Var.Y1.a(!lpVar2.f37189a.f32938q, true);
                        return;
                    default:
                        int i16 = d1Var.T1;
                        ArrayList arrayList3 = d1Var.f59859m2;
                        HashSet hashSet2 = d1Var.f59850c2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || i16 == 0 || i16 == 2 || i16 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : d1Var.f59855i2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.f28641id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                org.telegram.messenger.g0.v1(d1Var.V1.getEditText());
                                if (i16 != 1) {
                                    if (i16 == 4) {
                                        p10 p10Var = d1Var.f59867u2;
                                        if (p10Var != null) {
                                            lp lpVar3 = d1Var.Y1;
                                            p10Var.a(Boolean.valueOf((lpVar3 == null || !lpVar3.f37189a.f32938q) ? false : false), hashSet2);
                                            d1Var.f59867u2 = null;
                                        }
                                        d1Var.dismiss();
                                        return;
                                    }
                                    List c10 = r.c(r.b(arrayList4.size(), arrayList3));
                                    if (arrayList4.size() == 1) {
                                        long j3 = ((TLRPC.User) arrayList4.get(0)).f28641id;
                                        if (n10.b(j3)) {
                                            m10.u(gd.a0(null, null, 2131743495, n5.t(j3)), new kc(d1Var.f30229c, d1Var.J0), 2131624012, 36);
                                            return;
                                        }
                                        p3 p3Var = new p3(d1Var.getContext(), d1Var.f30223a, j3, c10, new y0(d1Var, 0));
                                        p3Var.g1(false);
                                        p3Var.show();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        aVar.addView(linearLayout, na.t(-2, -2, 17, 0, 0, 0, 8));
        rg0 rg0Var = new rg0(this, getContext(), h0Var, 1);
        this.U1 = rg0Var;
        aVar.setAlpha(0.0f);
        aVar.setVisibility(8);
        rg0Var.setOnClickListener(new View.OnClickListener(this) {
            public final d1 f59833b;

            {
                this.f59833b = this;
            }

            @Override
            public final void onClick(View view) {
                lp lpVar2;
                int i15 = r2;
                d1 d1Var = this.f59833b;
                boolean z10 = true;
                switch (i15) {
                    case 0:
                        d1Var.Y1.a(!lpVar2.f37189a.f32938q, true);
                        return;
                    default:
                        int i16 = d1Var.T1;
                        ArrayList arrayList3 = d1Var.f59859m2;
                        HashSet hashSet2 = d1Var.f59850c2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || i16 == 0 || i16 == 2 || i16 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : d1Var.f59855i2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.f28641id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                org.telegram.messenger.g0.v1(d1Var.V1.getEditText());
                                if (i16 != 1) {
                                    if (i16 == 4) {
                                        p10 p10Var = d1Var.f59867u2;
                                        if (p10Var != null) {
                                            lp lpVar3 = d1Var.Y1;
                                            p10Var.a(Boolean.valueOf((lpVar3 == null || !lpVar3.f37189a.f32938q) ? false : false), hashSet2);
                                            d1Var.f59867u2 = null;
                                        }
                                        d1Var.dismiss();
                                        return;
                                    }
                                    List c10 = r.c(r.b(arrayList4.size(), arrayList3));
                                    if (arrayList4.size() == 1) {
                                        long j3 = ((TLRPC.User) arrayList4.get(0)).f28641id;
                                        if (n10.b(j3)) {
                                            m10.u(gd.a0(null, null, 2131743495, n5.t(j3)), new kc(d1Var.f30229c, d1Var.J0), 2131624012, 36);
                                            return;
                                        }
                                        p3 p3Var = new p3(d1Var.getContext(), d1Var.f30223a, j3, c10, new y0(d1Var, 0));
                                        p3Var.g1(false);
                                        p3Var.show();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        aVar.addView(rg0Var, na.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f30226b;
        int i15 = this.f30261u0;
        viewGroup4.addView(aVar, na.f(-2.0f, -1, 87, i15, 0, i15, 0));
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup viewGroup5 = this.f30226b;
        int i16 = this.f30261u0;
        viewGroup5.addView(frameLayout, na.f(300.0f, -1, 87, i16, 0, i16, org.telegram.messenger.g0.L(68.0f)));
        xg.h hVar2 = this.f59857k2;
        ek0 ek0Var = this.f39246o1;
        hVar2.f60632n = arrayList;
        hVar2.f60631f = ek0Var;
        int i17 = this.f30261u0;
        ek0Var.setPadding(i17, 0, i17, org.telegram.messenger.g0.L(60.0f));
        this.f39246o1.j(new i1(this, 3));
        this.f39246o1.setOnItemClickListener(new c1(this, h0Var, i7));
        this.f39246o1.setOnItemLongClickListener(new c1(this));
        v4.l lVar = new v4.l();
        lVar.n(350L);
        lVar.o(kr.h);
        lVar.C = false;
        lVar.f59274m = false;
        this.f39246o1.setItemAnimator(lVar);
        this.f39246o1.i(new ai.f0(this, 10));
        qg0Var.setText("");
        qg0Var.d.b(false);
        qg0Var.b(false, hashSet, new w0(this, 11), null);
        pg0Var.setText(P0());
        ma maVar = this.f39247p1;
        if (maVar != null) {
            maVar.setTitle(P0());
        }
        k1(false);
        i1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(ri.d0(this.f30223a).f26721j1);
        }
        m1(false, true);
    }

    @Override
    public final void L() {
        super.L();
        org.telegram.messenger.g0.r(this.f59863q2);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        xg.h hVar = new xg.h(getContext(), this.J0, false);
        this.f59857k2 = hVar;
        hVar.f60634s = true;
        return hVar;
    }

    @Override
    public final CharSequence P0() {
        int i7 = this.T1;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        return gd.N0(2131749424, null);
                    }
                    return gd.N0(2131743175, null);
                }
            } else {
                return gd.N0(2131749431, null);
            }
        }
        return gd.N0(2131749425, null);
    }

    @Override
    public final void S0(Canvas canvas, int i7) {
        float max = Math.max(i7, org.telegram.messenger.g0.f24220m - org.telegram.messenger.g0.L(8.0f)) + org.telegram.messenger.g0.L(8.0f);
        pg0 pg0Var = this.X1;
        pg0Var.setTranslationY(max);
        float translationY = pg0Var.getTranslationY() + pg0Var.getMeasuredHeight();
        qg0 qg0Var = this.V1;
        qg0Var.setTranslationY(translationY);
        float translationY2 = qg0Var.getTranslationY() + qg0Var.getMeasuredHeight();
        tv tvVar = this.W1;
        tvVar.setTranslationY(translationY2);
        int measuredHeight = qg0Var.getMeasuredHeight() + pg0Var.getMeasuredHeight();
        this.f39246o1.setTranslationY((tvVar.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void c0(Configuration configuration) {
        l1(false, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.U2) {
            dismiss();
        } else if (i7 == ks.O) {
            org.telegram.messenger.g0.g3(new w0(this, 0));
        } else if (i7 == ks.S0) {
            org.telegram.messenger.g0.g3(new w0(this, 6));
        } else if (i7 == ks.E0) {
            org.telegram.messenger.g0.g3(new w0(this, 9));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.V1.getEditText());
        super.dismiss();
    }

    public final void e1() {
        int i7;
        if (this.f59850c2.isEmpty() && (i7 = this.T1) != 1 && i7 != 2 && i7 != 4) {
            if (this.f59860n2) {
                this.f59860n2 = false;
                org.telegram.messenger.g0.h3(new w0(this, 4), 10L);
            }
        } else if (!this.f59860n2) {
            this.f59860n2 = true;
            org.telegram.messenger.g0.h3(new w0(this, 3), 10L);
        }
    }

    public final void f1() {
        if (!TextUtils.isEmpty(this.f59856j2)) {
            this.f59856j2 = null;
            this.V1.setText("");
            org.telegram.messenger.g0.r(this.f59863q2);
            l1(true, true);
        }
    }

    public final xg.g g1(xg.g gVar) {
        if (this.T1 == 4) {
            TLRPC.User user = gVar.f60618c;
            if (user == null) {
                return gVar;
            }
            final long j3 = user.f28641id;
            ?? r22 = new View.OnClickListener(this) {
                public final d1 f59990b;

                {
                    this.f59990b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            d1 d1Var = this.f59990b;
                            HashSet hashSet = d1Var.f59850c2;
                            hashSet.add(Long.valueOf(j3));
                            p10 p10Var = d1Var.f59867u2;
                            if (p10Var != null) {
                                p10Var.a(Boolean.FALSE, hashSet);
                                d1Var.f59867u2 = null;
                            }
                            d1Var.dismiss();
                            return;
                        default:
                            d1 d1Var2 = this.f59990b;
                            HashSet hashSet2 = d1Var2.f59850c2;
                            hashSet2.add(Long.valueOf(j3));
                            p10 p10Var2 = d1Var2.f59867u2;
                            if (p10Var2 != null) {
                                p10Var2.a(Boolean.TRUE, hashSet2);
                                d1Var2.f59867u2 = null;
                            }
                            d1Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final d1 f59990b;

                {
                    this.f59990b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            d1 d1Var = this.f59990b;
                            HashSet hashSet = d1Var.f59850c2;
                            hashSet.add(Long.valueOf(j3));
                            p10 p10Var = d1Var.f59867u2;
                            if (p10Var != null) {
                                p10Var.a(Boolean.FALSE, hashSet);
                                d1Var.f59867u2 = null;
                            }
                            d1Var.dismiss();
                            return;
                        default:
                            d1 d1Var2 = this.f59990b;
                            HashSet hashSet2 = d1Var2.f59850c2;
                            hashSet2.add(Long.valueOf(j3));
                            p10 p10Var2 = d1Var2.f59867u2;
                            if (p10Var2 != null) {
                                p10Var2.a(Boolean.TRUE, hashSet2);
                                d1Var2.f59867u2 = null;
                            }
                            d1Var2.dismiss();
                            return;
                    }
                }
            };
            gVar.f60627n = r22;
            gVar.f60628o = r32;
            return gVar;
        }
        gVar.f60626m = new x0(1, this, gVar.f60618c);
        return gVar;
    }

    public final int h1() {
        if (this.T1 == 4) {
            return Math.max(0, (mp.u1(this.f30223a).S6 - this.f59866t2.size()) - 1);
        }
        return 10;
    }

    public final void i1(boolean z10) {
        ArrayList arrayList = this.d2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(i5.r(this.f30223a).f24693f0);
            this.f59853g2.putAll(i5.r(this.f30223a).f24695h0);
            this.f59854h2.addAll(i5.r(this.f30223a).f24696i0);
            if (z10) {
                l1(true, true);
            }
        }
    }

    public final void j1() {
        String N0;
        if (this.T1 == 4) {
            N0 = gd.H(',', "UserSelectorLimit", h1());
        } else {
            N0 = gd.N0(2131753269, null);
        }
        i6 i6Var = this.J0;
        m2 m2Var = this.f30229c;
        new kc(m2Var, i6Var).Q(2131623982, 36, N0).k(true);
        try {
            m2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void k1(boolean z10) {
        rg0 rg0Var = this.U1;
        boolean z11 = false;
        rg0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = this.T1;
        HashSet hashSet = this.f59850c2;
        if (i7 == 4) {
            spannableStringBuilder.append((CharSequence) gd.N0(2131752611, null));
        } else if (hashSet.size() == 0) {
            if (gd.f24314a0) {
                spannableStringBuilder.append((CharSequence) gd.N0(2131749501, "GiftPremiumChooseRecipientsBtn"));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f59862p2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f59862p2, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) gd.N0(2131749501, "GiftPremiumChooseRecipientsBtn"));
            }
        } else {
            spannableStringBuilder.append((CharSequence) gd.N0(2131749488, "GiftPremiumProceedBtn"));
        }
        rg0Var.c(hashSet.size(), true);
        rg0Var.i(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        rg0Var.setEnabled(z11);
    }

    public final void l1(boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: wg.d1.l1(boolean, boolean):void");
    }

    public final void m1(boolean z10, boolean z11) {
        int R;
        int R2;
        l1(z10, z11);
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ek0 ek0Var = this.f39246o1;
            if (i10 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i10);
            if ((childAt instanceof ah.r) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f59849b2;
                if (R2 < arrayList.size()) {
                    if (i7 == -1) {
                        i7 = R;
                    }
                    ah.r rVar = (ah.r) childAt;
                    rVar.c(((xg.g) arrayList.get(R2)).f60623j, z10);
                    rVar.i(z10, 1.0f);
                    i11 = R;
                }
            }
            i10++;
        }
        if (z10) {
            this.f59857k2.k(0, i7);
            xg.h hVar = this.f59857k2;
            hVar.k(i11, hVar.b() - i11);
        }
        k1(z10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f30223a).c(this, ks.U2);
        ks.f(this.f30223a).c(this, ks.E0);
        ks.f(this.f30223a).c(this, ks.O);
        ks.f(this.f30223a).c(this, ks.S0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f30223a).n(this, ks.U2);
        ks.f(this.f30223a).n(this, ks.E0);
        ks.f(this.f30223a).n(this, ks.O);
        ks.f(this.f30223a).n(this, ks.S0);
    }

    @Override
    public final void s0() {
        super.s0();
        ek0 ek0Var = this.f39246o1;
        if (ek0Var != null) {
            for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
                try {
                    ek0Var.getChildAt(i7).invalidate();
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            }
        }
    }
}
