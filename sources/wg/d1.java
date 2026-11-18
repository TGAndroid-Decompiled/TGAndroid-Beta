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
import bi.j3;
import c8.ma;
import c8.ra;
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
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.q10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.sa;
import org.telegram.ui.rg0;
import org.telegram.ui.sg0;
import org.telegram.ui.tg0;
import org.telegram.ui.uv;
import org.telegram.ui.v00;
import ug.j1;
public final class d1 extends sa implements fs {
    public final int T1;
    public final tg0 U1;
    public final sg0 V1;
    public final uv W1;
    public final rg0 X1;
    public final mp Y1;
    public final ah.a Z1;
    public final ArrayList f59738a2;
    public final ArrayList f59739b2;
    public final HashSet f59740c2;
    public final ArrayList d2;
    public final ArrayList f59741e2;
    public final ArrayList f59742f2;
    public final HashMap f59743g2;
    public final ArrayList f59744h2;
    public final LinkedHashMap f59745i2;
    public String f59746j2;
    public xg.h f59747k2;
    public int f59748l2;
    public final ArrayList f59749m2;
    public boolean f59750n2;
    public float f59751o2;
    public op f59752p2;
    public final s4.s0 f59753q2;
    public int f59754r2;
    public v00 f59755s2;
    public final HashSet f59756t2;
    public q10 f59757u2;

    public d1(Context context, int i7, fi.h0 h0Var) {
        super(context, null, true, false, h0Var);
        this.f59738a2 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f59739b2 = arrayList;
        HashSet hashSet = new HashSet();
        this.f59740c2 = hashSet;
        this.d2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f59741e2 = arrayList2;
        this.f59742f2 = new ArrayList();
        this.f59743g2 = new HashMap();
        this.f59744h2 = new ArrayList();
        this.f59745i2 = new LinkedHashMap();
        this.f59748l2 = org.telegram.messenger.g0.L(120.0f);
        this.f59749m2 = new ArrayList();
        this.f59750n2 = false;
        this.f59753q2 = new s4.s0(this, 9);
        this.f59754r2 = -1;
        this.f59756t2 = new HashSet();
        this.f30187a = i7;
        int i10 = n6.f29467h5;
        Q(i10);
        this.f30222s = false;
        this.T1 = 4;
        xg.h hVar = this.f59747k2;
        if (hVar != null) {
            hVar.f60509y = true;
        }
        rg0 rg0Var = new rg0(1, getContext(), h0Var);
        this.X1 = rg0Var;
        rg0Var.setOnCloseClickListener(new x0(this, 10));
        rg0Var.setText(P0());
        rg0Var.setCloseImageVisible(false);
        rg0Var.f1068f.c(false, 0.0f);
        this.f59752p2 = new op(this, 3);
        sg0 sg0Var = new sg0(this, getContext(), h0Var, 1);
        this.V1 = sg0Var;
        u6.h(i10, sg0Var, h0Var);
        sg0Var.setOnSearchTextChange(new y0(this, 1));
        hashSet.isEmpty();
        sg0Var.f1094b.r(gd.M0(2131745641, null), false);
        uv uvVar = new uv(15, getContext(), this);
        this.W1 = uvVar;
        ViewGroup viewGroup = this.f30190b;
        int i11 = this.f30225u0;
        viewGroup.addView(rg0Var, 0, ma.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ViewGroup viewGroup2 = this.f30190b;
        int i12 = this.f30225u0;
        viewGroup2.addView(sg0Var, ma.f(-2.0f, -1, 55, i12, 0, i12, 0));
        ViewGroup viewGroup3 = this.f30190b;
        int i13 = this.f30225u0;
        viewGroup3.addView(uvVar, ma.f(1.0f, -1, 55, i13, 0, i13, 0));
        ah.a aVar = new ah.a(getContext(), h0Var, (ck0) null);
        this.Z1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        u6.h(i10, aVar, h0Var);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i14 = n6.f29486i6;
        org.telegram.ui.Cells.y a02 = n6.a0(n6.w0(i14, this.J0), 6, 6);
        q6 M = u6.M(i14);
        linearLayout.setBackground(a02);
        u6.j(linearLayout, a02, null, M, h0Var);
        mp mpVar = new mp(24, context, h0Var);
        this.Y1 = mpVar;
        mpVar.b(n6.Fi, n6.f29504j7, n6.f29524k7);
        mpVar.setDrawUnchecked(true);
        mpVar.a(false, false);
        mpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(mpVar, ma.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        u6.U(textView, n6.f29502j5, h0Var);
        i5.c.r(14.0f, 1, 2131751814, textView, null);
        linearLayout.addView(textView, ma.t(-2, -2, 16, 9, 0, 0, 0));
        ra.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final d1 f59725b;

            {
                this.f59725b = this;
            }

            @Override
            public final void onClick(View view) {
                mp mpVar2;
                int i15 = r2;
                d1 d1Var = this.f59725b;
                boolean z10 = true;
                switch (i15) {
                    case 0:
                        d1Var.Y1.a(!mpVar2.f37598a.f32838q, true);
                        return;
                    default:
                        int i16 = d1Var.T1;
                        ArrayList arrayList3 = d1Var.f59749m2;
                        HashSet hashSet2 = d1Var.f59740c2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || i16 == 0 || i16 == 2 || i16 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : d1Var.f59745i2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.f28552id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                org.telegram.messenger.g0.v1(d1Var.V1.getEditText());
                                if (i16 != 1) {
                                    if (i16 == 4) {
                                        q10 q10Var = d1Var.f59757u2;
                                        if (q10Var != null) {
                                            mp mpVar3 = d1Var.Y1;
                                            q10Var.a(Boolean.valueOf((mpVar3 == null || !mpVar3.f37598a.f32838q) ? false : false), hashSet2);
                                            d1Var.f59757u2 = null;
                                        }
                                        d1Var.dismiss();
                                        return;
                                    }
                                    List c10 = s.c(s.b(arrayList4.size(), arrayList3));
                                    if (arrayList4.size() == 1) {
                                        long j3 = ((TLRPC.User) arrayList4.get(0)).f28552id;
                                        if (o10.b(j3)) {
                                            n10.u(gd.a0(null, null, 2131743505, n5.t(j3)), new lc(d1Var.f30193c, d1Var.J0), 2131624012, 36);
                                            return;
                                        }
                                        j3 j3Var = new j3(d1Var.getContext(), d1Var.f30187a, j3, c10, new y0(d1Var, 0));
                                        j3Var.g1(false);
                                        j3Var.show();
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
        aVar.addView(linearLayout, ma.t(-2, -2, 17, 0, 0, 0, 8));
        tg0 tg0Var = new tg0(this, getContext(), h0Var, 1);
        this.U1 = tg0Var;
        aVar.setAlpha(0.0f);
        aVar.setVisibility(8);
        tg0Var.setOnClickListener(new View.OnClickListener(this) {
            public final d1 f59725b;

            {
                this.f59725b = this;
            }

            @Override
            public final void onClick(View view) {
                mp mpVar2;
                int i15 = r2;
                d1 d1Var = this.f59725b;
                boolean z10 = true;
                switch (i15) {
                    case 0:
                        d1Var.Y1.a(!mpVar2.f37598a.f32838q, true);
                        return;
                    default:
                        int i16 = d1Var.T1;
                        ArrayList arrayList3 = d1Var.f59749m2;
                        HashSet hashSet2 = d1Var.f59740c2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || i16 == 0 || i16 == 2 || i16 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : d1Var.f59745i2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.f28552id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                org.telegram.messenger.g0.v1(d1Var.V1.getEditText());
                                if (i16 != 1) {
                                    if (i16 == 4) {
                                        q10 q10Var = d1Var.f59757u2;
                                        if (q10Var != null) {
                                            mp mpVar3 = d1Var.Y1;
                                            q10Var.a(Boolean.valueOf((mpVar3 == null || !mpVar3.f37598a.f32838q) ? false : false), hashSet2);
                                            d1Var.f59757u2 = null;
                                        }
                                        d1Var.dismiss();
                                        return;
                                    }
                                    List c10 = s.c(s.b(arrayList4.size(), arrayList3));
                                    if (arrayList4.size() == 1) {
                                        long j3 = ((TLRPC.User) arrayList4.get(0)).f28552id;
                                        if (o10.b(j3)) {
                                            n10.u(gd.a0(null, null, 2131743505, n5.t(j3)), new lc(d1Var.f30193c, d1Var.J0), 2131624012, 36);
                                            return;
                                        }
                                        j3 j3Var = new j3(d1Var.getContext(), d1Var.f30187a, j3, c10, new y0(d1Var, 0));
                                        j3Var.g1(false);
                                        j3Var.show();
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
        aVar.addView(tg0Var, ma.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f30190b;
        int i15 = this.f30225u0;
        viewGroup4.addView(aVar, ma.f(-2.0f, -1, 87, i15, 0, i15, 0));
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup viewGroup5 = this.f30190b;
        int i16 = this.f30225u0;
        viewGroup5.addView(frameLayout, ma.f(300.0f, -1, 87, i16, 0, i16, org.telegram.messenger.g0.L(68.0f)));
        xg.h hVar2 = this.f59747k2;
        ck0 ck0Var = this.f39534o1;
        hVar2.f60504n = arrayList;
        hVar2.f60503f = ck0Var;
        int i17 = this.f30225u0;
        ck0Var.setPadding(i17, 0, i17, org.telegram.messenger.g0.L(60.0f));
        this.f39534o1.j(new j1(this, 3));
        this.f39534o1.setOnItemClickListener(new c1(this, h0Var, i7));
        this.f39534o1.setOnItemLongClickListener(new c1(this));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(lr.h);
        kVar.C = false;
        kVar.f59152m = false;
        this.f39534o1.setItemAnimator(kVar);
        this.f39534o1.i(new ai.i0(this, 10));
        sg0Var.setText("");
        sg0Var.d.b(false);
        sg0Var.b(false, hashSet, new x0(this, 11), null);
        rg0Var.setText(P0());
        na naVar = this.f39535p1;
        if (naVar != null) {
            naVar.setTitle(P0());
        }
        k1(false);
        i1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(ri.d0(this.f30187a).f26620j1);
        }
        m1(false, true);
    }

    @Override
    public final void L() {
        super.L();
        org.telegram.messenger.g0.r(this.f59753q2);
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        xg.h hVar = new xg.h(getContext(), this.J0, false);
        this.f59747k2 = hVar;
        hVar.f60506s = true;
        return hVar;
    }

    @Override
    public final CharSequence P0() {
        int i7 = this.T1;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        return gd.M0(2131749425, null);
                    }
                    return gd.M0(2131743188, null);
                }
            } else {
                return gd.M0(2131749432, null);
            }
        }
        return gd.M0(2131749426, null);
    }

    @Override
    public final void S0(Canvas canvas, int i7) {
        float max = Math.max(i7, org.telegram.messenger.g0.f24112m - org.telegram.messenger.g0.L(8.0f)) + org.telegram.messenger.g0.L(8.0f);
        rg0 rg0Var = this.X1;
        rg0Var.setTranslationY(max);
        float translationY = rg0Var.getTranslationY() + rg0Var.getMeasuredHeight();
        sg0 sg0Var = this.V1;
        sg0Var.setTranslationY(translationY);
        float translationY2 = sg0Var.getTranslationY() + sg0Var.getMeasuredHeight();
        uv uvVar = this.W1;
        uvVar.setTranslationY(translationY2);
        int measuredHeight = sg0Var.getMeasuredHeight() + rg0Var.getMeasuredHeight();
        this.f39534o1.setTranslationY((uvVar.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.g0.L(8.0f));
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
            org.telegram.messenger.g0.g3(new x0(this, 0));
        } else if (i7 == ks.S0) {
            org.telegram.messenger.g0.g3(new x0(this, 6));
        } else if (i7 == ks.E0) {
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
        if (this.f59740c2.isEmpty() && (i7 = this.T1) != 1 && i7 != 2 && i7 != 4) {
            if (this.f59750n2) {
                this.f59750n2 = false;
                org.telegram.messenger.g0.h3(new x0(this, 4), 10L);
            }
        } else if (!this.f59750n2) {
            this.f59750n2 = true;
            org.telegram.messenger.g0.h3(new x0(this, 3), 10L);
        }
    }

    public final void f1() {
        if (!TextUtils.isEmpty(this.f59746j2)) {
            this.f59746j2 = null;
            this.V1.setText("");
            org.telegram.messenger.g0.r(this.f59753q2);
            l1(true, true);
        }
    }

    public final xg.g g1(xg.g gVar) {
        if (this.T1 == 4) {
            TLRPC.User user = gVar.f60490c;
            if (user == null) {
                return gVar;
            }
            final long j3 = user.f28552id;
            ?? r22 = new View.OnClickListener(this) {
                public final d1 f59862b;

                {
                    this.f59862b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            d1 d1Var = this.f59862b;
                            HashSet hashSet = d1Var.f59740c2;
                            hashSet.add(Long.valueOf(j3));
                            q10 q10Var = d1Var.f59757u2;
                            if (q10Var != null) {
                                q10Var.a(Boolean.FALSE, hashSet);
                                d1Var.f59757u2 = null;
                            }
                            d1Var.dismiss();
                            return;
                        default:
                            d1 d1Var2 = this.f59862b;
                            HashSet hashSet2 = d1Var2.f59740c2;
                            hashSet2.add(Long.valueOf(j3));
                            q10 q10Var2 = d1Var2.f59757u2;
                            if (q10Var2 != null) {
                                q10Var2.a(Boolean.TRUE, hashSet2);
                                d1Var2.f59757u2 = null;
                            }
                            d1Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final d1 f59862b;

                {
                    this.f59862b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            d1 d1Var = this.f59862b;
                            HashSet hashSet = d1Var.f59740c2;
                            hashSet.add(Long.valueOf(j3));
                            q10 q10Var = d1Var.f59757u2;
                            if (q10Var != null) {
                                q10Var.a(Boolean.FALSE, hashSet);
                                d1Var.f59757u2 = null;
                            }
                            d1Var.dismiss();
                            return;
                        default:
                            d1 d1Var2 = this.f59862b;
                            HashSet hashSet2 = d1Var2.f59740c2;
                            hashSet2.add(Long.valueOf(j3));
                            q10 q10Var2 = d1Var2.f59757u2;
                            if (q10Var2 != null) {
                                q10Var2.a(Boolean.TRUE, hashSet2);
                                d1Var2.f59757u2 = null;
                            }
                            d1Var2.dismiss();
                            return;
                    }
                }
            };
            gVar.f60499n = r22;
            gVar.f60500o = r32;
            return gVar;
        }
        gVar.f60498m = new ug.a0(3, this, gVar.f60490c);
        return gVar;
    }

    public final int h1() {
        if (this.T1 == 4) {
            return Math.max(0, (org.telegram.messenger.mp.u1(this.f30187a).S6 - this.f59756t2.size()) - 1);
        }
        return 10;
    }

    public final void i1(boolean z10) {
        ArrayList arrayList = this.d2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(i5.r(this.f30187a).f24567f0);
            this.f59743g2.putAll(i5.r(this.f30187a).f24569h0);
            this.f59744h2.addAll(i5.r(this.f30187a).f24570i0);
            if (z10) {
                l1(true, true);
            }
        }
    }

    public final void j1() {
        String M0;
        if (this.T1 == 4) {
            M0 = gd.H(',', "UserSelectorLimit", h1());
        } else {
            M0 = gd.M0(2131753270, null);
        }
        i6 i6Var = this.J0;
        n2 n2Var = this.f30193c;
        new lc(n2Var, i6Var).Q(2131623982, 36, M0).k(true);
        try {
            n2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void k1(boolean z10) {
        tg0 tg0Var = this.U1;
        boolean z11 = false;
        tg0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = this.T1;
        HashSet hashSet = this.f59740c2;
        if (i7 == 4) {
            spannableStringBuilder.append((CharSequence) gd.M0(2131752612, null));
        } else if (hashSet.size() == 0) {
            if (gd.f24213a0) {
                spannableStringBuilder.append((CharSequence) gd.M0(2131749502, "GiftPremiumChooseRecipientsBtn"));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f59752p2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f59752p2, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) gd.M0(2131749502, "GiftPremiumChooseRecipientsBtn"));
            }
        } else {
            spannableStringBuilder.append((CharSequence) gd.M0(2131749489, "GiftPremiumProceedBtn"));
        }
        tg0Var.c(hashSet.size(), true);
        tg0Var.i(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        tg0Var.setEnabled(z11);
    }

    public final void l1(boolean r26, boolean r27) {
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
            ck0 ck0Var = this.f39534o1;
            if (i10 >= ck0Var.getChildCount()) {
                break;
            }
            View childAt = ck0Var.getChildAt(i10);
            if ((childAt instanceof ah.r) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f59739b2;
                if (R2 < arrayList.size()) {
                    if (i7 == -1) {
                        i7 = R;
                    }
                    ah.r rVar = (ah.r) childAt;
                    rVar.c(((xg.g) arrayList.get(R2)).f60495j, z10);
                    rVar.i(z10, 1.0f);
                    i11 = R;
                }
            }
            i10++;
        }
        if (z10) {
            this.f59747k2.k(0, i7);
            xg.h hVar = this.f59747k2;
            hVar.k(i11, hVar.b() - i11);
        }
        k1(z10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f30187a).c(this, ks.U2);
        ks.f(this.f30187a).c(this, ks.E0);
        ks.f(this.f30187a).c(this, ks.O);
        ks.f(this.f30187a).c(this, ks.S0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f30187a).n(this, ks.U2);
        ks.f(this.f30187a).n(this, ks.E0);
        ks.f(this.f30187a).n(this, ks.O);
        ks.f(this.f30187a).n(this, ks.S0);
    }

    @Override
    public final void s0() {
        super.s0();
        ck0 ck0Var = this.f39534o1;
        if (ck0Var != null) {
            for (int i7 = 0; i7 < ck0Var.getChildCount(); i7++) {
                try {
                    ck0Var.getChildAt(i7).invalidate();
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            }
        }
    }
}
