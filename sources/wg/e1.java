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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.ls;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.sa;
import org.telegram.ui.rg0;
import org.telegram.ui.sg0;
import org.telegram.ui.tg0;
import org.telegram.ui.uv;
import org.telegram.ui.v00;
import ug.i1;
public final class e1 extends sa implements gs {
    public final int T1;
    public final tg0 U1;
    public final sg0 V1;
    public final uv W1;
    public final rg0 X1;
    public final op Y1;
    public final ah.a Z1;
    public final ArrayList f59753a2;
    public final ArrayList f59754b2;
    public final HashSet f59755c2;
    public final ArrayList d2;
    public final ArrayList f59756e2;
    public final ArrayList f59757f2;
    public final HashMap f59758g2;
    public final ArrayList f59759h2;
    public final LinkedHashMap f59760i2;
    public String f59761j2;
    public xg.h f59762k2;
    public int f59763l2;
    public final ArrayList f59764m2;
    public boolean f59765n2;
    public float f59766o2;
    public qp f59767p2;
    public final s4.s0 f59768q2;
    public int f59769r2;
    public v00 f59770s2;
    public final HashSet f59771t2;
    public r10 f59772u2;

    public e1(Context context, int i7, fi.h0 h0Var) {
        super(context, null, true, false, h0Var);
        this.f59753a2 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f59754b2 = arrayList;
        HashSet hashSet = new HashSet();
        this.f59755c2 = hashSet;
        this.d2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f59756e2 = arrayList2;
        this.f59757f2 = new ArrayList();
        this.f59758g2 = new HashMap();
        this.f59759h2 = new ArrayList();
        this.f59760i2 = new LinkedHashMap();
        this.f59763l2 = org.telegram.messenger.g0.L(120.0f);
        this.f59764m2 = new ArrayList();
        this.f59765n2 = false;
        this.f59768q2 = new s4.s0(this, 9);
        this.f59769r2 = -1;
        this.f59771t2 = new HashSet();
        this.f30139a = i7;
        int i10 = m6.f29420h5;
        Q(i10);
        this.f30174s = false;
        this.T1 = 4;
        xg.h hVar = this.f59762k2;
        if (hVar != null) {
            hVar.f60519y = true;
        }
        rg0 rg0Var = new rg0(1, getContext(), h0Var);
        this.X1 = rg0Var;
        rg0Var.setOnCloseClickListener(new x0(this, 10));
        rg0Var.setText(P0());
        rg0Var.setCloseImageVisible(false);
        rg0Var.f1068f.c(false, 0.0f);
        this.f59767p2 = new qp(this, 3);
        sg0 sg0Var = new sg0(this, getContext(), h0Var, 1);
        this.V1 = sg0Var;
        t6.h(i10, sg0Var, h0Var);
        sg0Var.setOnSearchTextChange(new z0(this, 1));
        hashSet.isEmpty();
        sg0Var.f1094b.r(hd.N0(2131745640, null), false);
        uv uvVar = new uv(15, getContext(), this);
        this.W1 = uvVar;
        ViewGroup viewGroup = this.f30142b;
        int i11 = this.f30177u0;
        viewGroup.addView(rg0Var, 0, na.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ViewGroup viewGroup2 = this.f30142b;
        int i12 = this.f30177u0;
        viewGroup2.addView(sg0Var, na.f(-2.0f, -1, 55, i12, 0, i12, 0));
        ViewGroup viewGroup3 = this.f30142b;
        int i13 = this.f30177u0;
        viewGroup3.addView(uvVar, na.f(1.0f, -1, 55, i13, 0, i13, 0));
        ah.a aVar = new ah.a(getContext(), h0Var, (ek0) null);
        this.Z1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        t6.h(i10, aVar, h0Var);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i14 = m6.f29439i6;
        org.telegram.ui.Cells.y a02 = m6.a0(m6.w0(i14, this.J0), 6, 6);
        p6 M = t6.M(i14);
        linearLayout.setBackground(a02);
        t6.j(linearLayout, a02, null, M, h0Var);
        op opVar = new op(24, context, h0Var);
        this.Y1 = opVar;
        opVar.b(m6.Fi, m6.f29457j7, m6.f29477k7);
        opVar.setDrawUnchecked(true);
        opVar.a(false, false);
        opVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(opVar, na.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        t6.U(textView, m6.f29455j5, h0Var);
        i5.c.r(14.0f, 1, 2131751813, textView, null);
        linearLayout.addView(textView, na.t(-2, -2, 16, 9, 0, 0, 0));
        c8.sa.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f59737b;

            {
                this.f59737b = this;
            }

            @Override
            public final void onClick(View view) {
                op opVar2;
                int i15 = r2;
                e1 e1Var = this.f59737b;
                boolean z10 = true;
                switch (i15) {
                    case 0:
                        e1Var.Y1.a(!opVar2.f38291a.f32840q, true);
                        return;
                    default:
                        int i16 = e1Var.T1;
                        ArrayList arrayList3 = e1Var.f59764m2;
                        HashSet hashSet2 = e1Var.f59755c2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || i16 == 0 || i16 == 2 || i16 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : e1Var.f59760i2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.f28547id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                org.telegram.messenger.g0.v1(e1Var.V1.getEditText());
                                if (i16 != 1) {
                                    if (i16 == 4) {
                                        r10 r10Var = e1Var.f59772u2;
                                        if (r10Var != null) {
                                            op opVar3 = e1Var.Y1;
                                            r10Var.a(Boolean.valueOf((opVar3 == null || !opVar3.f38291a.f32840q) ? false : false), hashSet2);
                                            e1Var.f59772u2 = null;
                                        }
                                        e1Var.dismiss();
                                        return;
                                    }
                                    List c10 = s.c(s.b(arrayList4.size(), arrayList3));
                                    if (arrayList4.size() == 1) {
                                        long j3 = ((TLRPC.User) arrayList4.get(0)).f28547id;
                                        if (p10.b(j3)) {
                                            o10.u(hd.a0(null, null, 2131743499, n5.t(j3)), new lc(e1Var.f30145c, e1Var.J0), 2131624012, 36);
                                            return;
                                        }
                                        p3 p3Var = new p3(e1Var.getContext(), e1Var.f30139a, j3, c10, new z0(e1Var, 0));
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
        tg0 tg0Var = new tg0(this, getContext(), h0Var, 1);
        this.U1 = tg0Var;
        aVar.setAlpha(0.0f);
        aVar.setVisibility(8);
        tg0Var.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f59737b;

            {
                this.f59737b = this;
            }

            @Override
            public final void onClick(View view) {
                op opVar2;
                int i15 = r2;
                e1 e1Var = this.f59737b;
                boolean z10 = true;
                switch (i15) {
                    case 0:
                        e1Var.Y1.a(!opVar2.f38291a.f32840q, true);
                        return;
                    default:
                        int i16 = e1Var.T1;
                        ArrayList arrayList3 = e1Var.f59764m2;
                        HashSet hashSet2 = e1Var.f59755c2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || i16 == 0 || i16 == 2 || i16 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : e1Var.f59760i2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.f28547id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                org.telegram.messenger.g0.v1(e1Var.V1.getEditText());
                                if (i16 != 1) {
                                    if (i16 == 4) {
                                        r10 r10Var = e1Var.f59772u2;
                                        if (r10Var != null) {
                                            op opVar3 = e1Var.Y1;
                                            r10Var.a(Boolean.valueOf((opVar3 == null || !opVar3.f38291a.f32840q) ? false : false), hashSet2);
                                            e1Var.f59772u2 = null;
                                        }
                                        e1Var.dismiss();
                                        return;
                                    }
                                    List c10 = s.c(s.b(arrayList4.size(), arrayList3));
                                    if (arrayList4.size() == 1) {
                                        long j3 = ((TLRPC.User) arrayList4.get(0)).f28547id;
                                        if (p10.b(j3)) {
                                            o10.u(hd.a0(null, null, 2131743499, n5.t(j3)), new lc(e1Var.f30145c, e1Var.J0), 2131624012, 36);
                                            return;
                                        }
                                        p3 p3Var = new p3(e1Var.getContext(), e1Var.f30139a, j3, c10, new z0(e1Var, 0));
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
        aVar.addView(tg0Var, na.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f30142b;
        int i15 = this.f30177u0;
        viewGroup4.addView(aVar, na.f(-2.0f, -1, 87, i15, 0, i15, 0));
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup viewGroup5 = this.f30142b;
        int i16 = this.f30177u0;
        viewGroup5.addView(frameLayout, na.f(300.0f, -1, 87, i16, 0, i16, org.telegram.messenger.g0.L(68.0f)));
        xg.h hVar2 = this.f59762k2;
        ek0 ek0Var = this.f39487o1;
        hVar2.f60514n = arrayList;
        hVar2.f60513f = ek0Var;
        int i17 = this.f30177u0;
        ek0Var.setPadding(i17, 0, i17, org.telegram.messenger.g0.L(60.0f));
        this.f39487o1.j(new i1(this, 3));
        this.f39487o1.setOnItemClickListener(new d1(this, h0Var, i7));
        this.f39487o1.setOnItemLongClickListener(new d1(this));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(nr.h);
        kVar.C = false;
        kVar.f59139m = false;
        this.f39487o1.setItemAnimator(kVar);
        this.f39487o1.i(new ai.e0(this, 10));
        sg0Var.setText("");
        sg0Var.d.b(false);
        sg0Var.b(false, hashSet, new x0(this, 11), null);
        rg0Var.setText(P0());
        org.telegram.ui.Components.na naVar = this.f39488p1;
        if (naVar != null) {
            naVar.setTitle(P0());
        }
        k1(false);
        i1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(si.d0(this.f30139a).f26798j1);
        }
        m1(false, true);
    }

    @Override
    public final void L() {
        super.L();
        org.telegram.messenger.g0.r(this.f59768q2);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        xg.h hVar = new xg.h(getContext(), this.J0, false);
        this.f59762k2 = hVar;
        hVar.f60516s = true;
        return hVar;
    }

    @Override
    public final CharSequence P0() {
        int i7 = this.T1;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        return hd.N0(2131749424, null);
                    }
                    return hd.N0(2131743182, null);
                }
            } else {
                return hd.N0(2131749431, null);
            }
        }
        return hd.N0(2131749425, null);
    }

    @Override
    public final void S0(Canvas canvas, int i7) {
        float max = Math.max(i7, org.telegram.messenger.g0.f24004m - org.telegram.messenger.g0.L(8.0f)) + org.telegram.messenger.g0.L(8.0f);
        rg0 rg0Var = this.X1;
        rg0Var.setTranslationY(max);
        float translationY = rg0Var.getTranslationY() + rg0Var.getMeasuredHeight();
        sg0 sg0Var = this.V1;
        sg0Var.setTranslationY(translationY);
        float translationY2 = sg0Var.getTranslationY() + sg0Var.getMeasuredHeight();
        uv uvVar = this.W1;
        uvVar.setTranslationY(translationY2);
        int measuredHeight = sg0Var.getMeasuredHeight() + rg0Var.getMeasuredHeight();
        this.f39487o1.setTranslationY((uvVar.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void c0(Configuration configuration) {
        l1(false, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.U2) {
            dismiss();
        } else if (i7 == ls.O) {
            org.telegram.messenger.g0.g3(new x0(this, 0));
        } else if (i7 == ls.S0) {
            org.telegram.messenger.g0.g3(new x0(this, 6));
        } else if (i7 == ls.E0) {
            org.telegram.messenger.g0.g3(new x0(this, 9));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.V1.getEditText());
        super.dismiss();
    }

    public final void e1() {
        int i7;
        if (this.f59755c2.isEmpty() && (i7 = this.T1) != 1 && i7 != 2 && i7 != 4) {
            if (this.f59765n2) {
                this.f59765n2 = false;
                org.telegram.messenger.g0.h3(new x0(this, 4), 10L);
            }
        } else if (!this.f59765n2) {
            this.f59765n2 = true;
            org.telegram.messenger.g0.h3(new x0(this, 3), 10L);
        }
    }

    public final void f1() {
        if (!TextUtils.isEmpty(this.f59761j2)) {
            this.f59761j2 = null;
            this.V1.setText("");
            org.telegram.messenger.g0.r(this.f59768q2);
            l1(true, true);
        }
    }

    public final xg.g g1(xg.g gVar) {
        if (this.T1 == 4) {
            TLRPC.User user = gVar.f60500c;
            if (user == null) {
                return gVar;
            }
            final long j3 = user.f28547id;
            ?? r22 = new View.OnClickListener(this) {
                public final e1 f59724b;

                {
                    this.f59724b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            e1 e1Var = this.f59724b;
                            HashSet hashSet = e1Var.f59755c2;
                            hashSet.add(Long.valueOf(j3));
                            r10 r10Var = e1Var.f59772u2;
                            if (r10Var != null) {
                                r10Var.a(Boolean.FALSE, hashSet);
                                e1Var.f59772u2 = null;
                            }
                            e1Var.dismiss();
                            return;
                        default:
                            e1 e1Var2 = this.f59724b;
                            HashSet hashSet2 = e1Var2.f59755c2;
                            hashSet2.add(Long.valueOf(j3));
                            r10 r10Var2 = e1Var2.f59772u2;
                            if (r10Var2 != null) {
                                r10Var2.a(Boolean.TRUE, hashSet2);
                                e1Var2.f59772u2 = null;
                            }
                            e1Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final e1 f59724b;

                {
                    this.f59724b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            e1 e1Var = this.f59724b;
                            HashSet hashSet = e1Var.f59755c2;
                            hashSet.add(Long.valueOf(j3));
                            r10 r10Var = e1Var.f59772u2;
                            if (r10Var != null) {
                                r10Var.a(Boolean.FALSE, hashSet);
                                e1Var.f59772u2 = null;
                            }
                            e1Var.dismiss();
                            return;
                        default:
                            e1 e1Var2 = this.f59724b;
                            HashSet hashSet2 = e1Var2.f59755c2;
                            hashSet2.add(Long.valueOf(j3));
                            r10 r10Var2 = e1Var2.f59772u2;
                            if (r10Var2 != null) {
                                r10Var2.a(Boolean.TRUE, hashSet2);
                                e1Var2.f59772u2 = null;
                            }
                            e1Var2.dismiss();
                            return;
                    }
                }
            };
            gVar.f60509n = r22;
            gVar.f60510o = r32;
            return gVar;
        }
        gVar.f60508m = new y0(1, this, gVar.f60500c);
        return gVar;
    }

    public final int h1() {
        if (this.T1 == 4) {
            return Math.max(0, (np.u1(this.f30139a).S6 - this.f59771t2.size()) - 1);
        }
        return 10;
    }

    public final void i1(boolean z10) {
        ArrayList arrayList = this.d2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(i5.r(this.f30139a).f24569f0);
            this.f59758g2.putAll(i5.r(this.f30139a).f24571h0);
            this.f59759h2.addAll(i5.r(this.f30139a).f24572i0);
            if (z10) {
                l1(true, true);
            }
        }
    }

    public final void j1() {
        String N0;
        if (this.T1 == 4) {
            N0 = hd.H(',', "UserSelectorLimit", h1());
        } else {
            N0 = hd.N0(2131753269, null);
        }
        h6 h6Var = this.J0;
        m2 m2Var = this.f30145c;
        new lc(m2Var, h6Var).Q(2131623982, 36, N0).k(true);
        try {
            m2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void k1(boolean z10) {
        tg0 tg0Var = this.U1;
        boolean z11 = false;
        tg0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = this.T1;
        HashSet hashSet = this.f59755c2;
        if (i7 == 4) {
            spannableStringBuilder.append((CharSequence) hd.N0(2131752611, null));
        } else if (hashSet.size() == 0) {
            if (hd.f24408a0) {
                spannableStringBuilder.append((CharSequence) hd.N0(2131749501, "GiftPremiumChooseRecipientsBtn"));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f59767p2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f59767p2, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) hd.N0(2131749501, "GiftPremiumChooseRecipientsBtn"));
            }
        } else {
            spannableStringBuilder.append((CharSequence) hd.N0(2131749488, "GiftPremiumProceedBtn"));
        }
        tg0Var.c(hashSet.size(), true);
        tg0Var.i(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        tg0Var.setEnabled(z11);
    }

    public final void l1(boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: wg.e1.l1(boolean, boolean):void");
    }

    public final void m1(boolean z10, boolean z11) {
        int R;
        int R2;
        l1(z10, z11);
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ek0 ek0Var = this.f39487o1;
            if (i10 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i10);
            if ((childAt instanceof ah.r) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f59754b2;
                if (R2 < arrayList.size()) {
                    if (i7 == -1) {
                        i7 = R;
                    }
                    ah.r rVar = (ah.r) childAt;
                    rVar.c(((xg.g) arrayList.get(R2)).f60505j, z10);
                    rVar.i(z10, 1.0f);
                    i11 = R;
                }
            }
            i10++;
        }
        if (z10) {
            this.f59762k2.k(0, i7);
            xg.h hVar = this.f59762k2;
            hVar.k(i11, hVar.b() - i11);
        }
        k1(z10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.f(this.f30139a).c(this, ls.U2);
        ls.f(this.f30139a).c(this, ls.E0);
        ls.f(this.f30139a).c(this, ls.O);
        ls.f(this.f30139a).c(this, ls.S0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(this.f30139a).n(this, ls.U2);
        ls.f(this.f30139a).n(this, ls.E0);
        ls.f(this.f30139a).n(this, ls.O);
        ls.f(this.f30139a).n(this, ls.S0);
    }

    @Override
    public final void s0() {
        super.s0();
        ek0 ek0Var = this.f39487o1;
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
