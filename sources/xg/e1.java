package xg;

import ai.b3;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import b8.pf;
import ci.e9;
import gi.o1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.messenger.n10;
import org.telegram.messenger.t1;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gg0;
import org.telegram.ui.hg0;
import org.telegram.ui.ig0;
import org.telegram.ui.p00;
public class e1 extends ma implements cs {
    public static c1 C2;
    public boolean A2;
    public int B2;
    public final int Q1;
    public final ig0 R1;
    public final hg0 S1;
    public final org.telegram.ui.Components.voip.r0 T1;
    public final gg0 U1;
    public final wo V1;
    public final bh.a W1;
    public final FrameLayout X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final HashSet f58673a2;
    public final ArrayList f58674b2;
    public final ArrayList c2;
    public final ArrayList f58675d2;
    public final HashMap f58676e2;
    public final ArrayList f58677f2;
    public final LinkedHashMap f58678g2;
    public String f58679h2;
    public yg.h f58680i2;
    public int f58681j2;
    public final ArrayList f58682k2;
    public boolean f58683l2;
    public float f58684m2;
    public yo f58685n2;
    public final t1 f58686o2;
    public final wi.i0 f58687p2;
    public int f58688q2;
    public xp f58689r2;
    public String f58690s2;
    public p00 f58691t2;
    public u10 f58692u2;
    public final HashSet f58693v2;
    public n10 f58694w2;
    public xp f58695x2;
    public xp f58696y2;
    public boolean f58697z2;

    public e1(Context context, int i3, t1 t1Var, int i10, e6 e6Var) {
        super(context, null, true, false, e6Var);
        int i11;
        float f10;
        float f11;
        boolean z10;
        this.Y1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Z1 = arrayList;
        HashSet hashSet = new HashSet();
        this.f58673a2 = hashSet;
        this.f58674b2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.c2 = arrayList2;
        this.f58675d2 = new ArrayList();
        this.f58676e2 = new HashMap();
        this.f58677f2 = new ArrayList();
        this.f58678g2 = new LinkedHashMap();
        this.f58681j2 = org.telegram.messenger.g0.L(120.0f);
        this.f58682k2 = new ArrayList();
        this.f58683l2 = false;
        this.f58687p2 = new wi.i0(this, 2);
        this.f58688q2 = -1;
        this.f58693v2 = new HashSet();
        this.f28583a = i3;
        int i12 = k6.f27954h5;
        P(i12);
        this.f28615s = false;
        this.Q1 = i10;
        this.f58686o2 = t1Var;
        yg.h hVar = this.f58680i2;
        if (hVar != null) {
            if (i10 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.f59469y = z10;
        }
        gg0 gg0Var = new gg0(1, getContext(), e6Var);
        this.U1 = gg0Var;
        gg0Var.setOnCloseClickListener(new x0(this, 11));
        gg0Var.setText(O0());
        gg0Var.setCloseImageVisible(false);
        gg0Var.f3311f.c(false, 0.0f);
        this.f58685n2 = new yo(this, 3);
        hg0 hg0Var = new hg0(this, getContext(), e6Var, 1);
        this.S1 = hg0Var;
        r6.i(i12, hg0Var, e6Var);
        hg0Var.setOnSearchTextChange(new y0(this, 3));
        if (hashSet.isEmpty() && i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            i11 = 2131749658;
        } else {
            i11 = 2131745846;
        }
        hg0Var.f3334b.r(bd.M0(i11, null), false);
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(16, getContext(), this);
        this.T1 = r0Var;
        ViewGroup viewGroup = this.f28586b;
        int i13 = this.f28618u0;
        viewGroup.addView(gg0Var, 0, mf.f(-2.0f, -1, 55, i13, 0, i13, 0));
        ViewGroup viewGroup2 = this.f28586b;
        int i14 = this.f28618u0;
        viewGroup2.addView(hg0Var, mf.f(-2.0f, -1, 55, i14, 0, i14, 0));
        ViewGroup viewGroup3 = this.f28586b;
        int i15 = this.f28618u0;
        viewGroup3.addView(r0Var, mf.f(1.0f, -1, 55, i15, 0, i15, 0));
        bh.a aVar = new bh.a(getContext(), e6Var, (tj0) null);
        this.W1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        r6.i(i12, aVar, e6Var);
        if (i10 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i16 = k6.f27972i6;
            org.telegram.ui.Cells.y a02 = k6.a0(k6.w0(i16, this.J0), 6, 6);
            n6 N = r6.N(i16);
            linearLayout.setBackground(a02);
            r6.k(linearLayout, a02, null, N, e6Var);
            wo woVar = new wo(24, context, e6Var);
            this.V1 = woVar;
            woVar.b(k6.Ci, k6.f27990j7, k6.f28008k7);
            woVar.setDrawUnchecked(true);
            woVar.a(false, false);
            woVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(woVar, mf.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            r6.V(textView, k6.f27988j5, e6Var);
            p1.u(textView, 1, 14.0f, null, 2131751825);
            linearLayout.addView(textView, mf.t(-2, -2, 16, 9, 0, 0, 0));
            pf.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final e1 f58658b;

                {
                    this.f58658b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            wo woVar2 = this.f58658b.V1;
                            woVar2.a(!woVar2.f40035a.f31334q, true);
                            return;
                        default:
                            this.f58658b.k1();
                            return;
                    }
                }
            });
            aVar.addView(linearLayout, mf.t(-2, -2, 17, 0, 0, 0, 8));
        }
        ig0 ig0Var = new ig0(this, getContext(), e6Var, 1);
        this.R1 = ig0Var;
        if (i10 == 4) {
            f10 = 0.0f;
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        } else {
            f10 = 0.0f;
        }
        ig0Var.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f58658b;

            {
                this.f58658b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        wo woVar2 = this.f58658b.V1;
                        woVar2.a(!woVar2.f40035a.f31334q, true);
                        return;
                    default:
                        this.f58658b.k1();
                        return;
                }
            }
        });
        aVar.addView(ig0Var, mf.r(-1, 48, 87));
        if (i10 == 4) {
            ViewGroup viewGroup4 = this.f28586b;
            int i17 = this.f28618u0;
            viewGroup4.addView(aVar, mf.f(-2.0f, -1, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.X1 = frameLayout;
        ViewGroup viewGroup5 = this.f28586b;
        int i18 = this.f28618u0;
        viewGroup5.addView(frameLayout, mf.f(300.0f, -1, 87, i18, 0, i18, org.telegram.messenger.g0.L(68.0f)));
        yg.h hVar2 = this.f58680i2;
        tj0 tj0Var = this.f36102l1;
        hVar2.f59464n = arrayList;
        hVar2.f59463f = tj0Var;
        int i19 = this.f28618u0;
        if (i10 != 1) {
            f11 = 60.0f;
        } else {
            f11 = f10;
        }
        tj0Var.setPadding(i19, 0, i19, org.telegram.messenger.g0.L(f11));
        this.f36102l1.j(new wh.d(this, 2));
        this.f36102l1.setOnItemClickListener(new o4.r0(this, i10, e6Var, i3));
        if (i10 == 4) {
            this.f36102l1.setOnItemLongClickListener((ij0) new k2.q(this, i10, 19));
        }
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(xq.h);
        kVar.C = false;
        kVar.f55567m = false;
        this.f36102l1.setItemAnimator(kVar);
        this.f36102l1.i(new o1(this, 9));
        hg0Var.setText("");
        hg0Var.d.b(false);
        hg0Var.b(false, hashSet, new x0(this, 12), null);
        gg0Var.setText(O0());
        ia iaVar = this.m1;
        if (iaVar != null) {
            iaVar.setTitle(O0());
        }
        n1(false);
        j1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(li.b0(this.f28583a).f24032j1);
        }
        p1(false, true);
        if (i10 == 0 || i10 == 2) {
            s.j(i3, null, new y0(this, 0));
        }
        if (i10 != 0 && i10 != 2) {
            return;
        }
        e9.y(i3, false).U();
    }

    public static boolean i1(Intent intent) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                        l1(0, null);
                        return true;
                    }
                }
            } else {
                String lowerCase = data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    l1(0, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static e1 l1(int i3, t1 t1Var) {
        d2 Q = LaunchActivity.Q();
        if (Q == 0) {
            return null;
        }
        c1 c1Var = C2;
        if (c1Var != null) {
            return c1Var;
        }
        ?? e1Var = new e1(Q.getContext(), Q.getCurrentAccount(), t1Var, i3, Q.getResourceProvider());
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(Q)) {
            e1Var.a0(Q);
        }
        Q.showDialog(e1Var);
        C2 = e1Var;
        return e1Var;
    }

    @Override
    public final void K() {
        super.K();
        C2 = null;
        org.telegram.messenger.g0.r(this.f58687p2);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        yg.h hVar = new yg.h(getContext(), this.J0, false);
        this.f58680i2 = hVar;
        hVar.f59466s = true;
        return hVar;
    }

    @Override
    public final CharSequence O0() {
        String str = this.f58690s2;
        if (str != null) {
            return str;
        }
        int i3 = this.Q1;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        return bd.M0(2131749608, null);
                    }
                    return bd.M0(2131743435, null);
                }
            } else {
                return bd.M0(2131749615, null);
            }
        }
        return bd.M0(2131749609, null);
    }

    @Override
    public final void R0(Canvas canvas, int i3) {
        float max = Math.max(i3, org.telegram.messenger.g0.f22602m - org.telegram.messenger.g0.L(8.0f)) + org.telegram.messenger.g0.L(8.0f);
        gg0 gg0Var = this.U1;
        gg0Var.setTranslationY(max);
        float translationY = gg0Var.getTranslationY() + gg0Var.getMeasuredHeight();
        hg0 hg0Var = this.S1;
        hg0Var.setTranslationY(translationY);
        float translationY2 = hg0Var.getTranslationY() + hg0Var.getMeasuredHeight();
        org.telegram.ui.Components.voip.r0 r0Var = this.T1;
        r0Var.setTranslationY(translationY2);
        int measuredHeight = hg0Var.getMeasuredHeight() + gg0Var.getMeasuredHeight();
        this.f36102l1.setTranslationY((r0Var.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void c0(Configuration configuration) {
        o1(false, true);
    }

    public final int d1(String str, ArrayList arrayList, ArrayList arrayList2) {
        int i3 = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !l10.A(user.f27150id)) {
                long j10 = user.f27150id;
                if (j10 != 0 && !this.f58693v2.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.f27150id);
                    HashSet hashSet = this.f58673a2;
                    hashSet.contains(valueOf);
                    i3 += org.telegram.messenger.g0.L(56.0f);
                    yg.g c2 = yg.g.c(user, hashSet.contains(Long.valueOf(user.f27150id)));
                    g1(c2);
                    arrayList3.add(c2);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i3;
        }
        int L = org.telegram.messenger.g0.L(32.0f) + i3;
        arrayList.add(yg.g.b(str));
        arrayList.addAll(arrayList3);
        return L;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.S2) {
            dismiss();
        } else if (i3 == hs.O) {
            org.telegram.messenger.g0.h3(new x0(this, 0));
        } else if (i3 == hs.S0) {
            org.telegram.messenger.g0.h3(new x0(this, 6));
        } else if (i3 == hs.E0) {
            org.telegram.messenger.g0.h3(new x0(this, 10));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.S1.getEditText());
        super.dismiss();
    }

    public final void e1() {
        int i3;
        if (this.f58673a2.isEmpty() && (i3 = this.Q1) != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (this.f58683l2) {
                this.f58683l2 = false;
                org.telegram.messenger.g0.i3(new x0(this, 4), 10L);
            }
        } else if (!this.f58683l2) {
            this.f58683l2 = true;
            org.telegram.messenger.g0.i3(new x0(this, 3), 10L);
        }
    }

    public final void f1() {
        if (!TextUtils.isEmpty(this.f58679h2)) {
            this.f58679h2 = null;
            this.S1.setText("");
            org.telegram.messenger.g0.r(this.f58687p2);
            o1(true, true);
        }
    }

    public final yg.g g1(yg.g gVar) {
        org.telegram.ui.web.d dVar;
        int i3 = this.Q1;
        if (i3 == 4) {
            TLRPC.User user = gVar.f59448c;
            if (user == null) {
                return gVar;
            }
            final long j10 = user.f27150id;
            ?? r22 = new View.OnClickListener(this) {
                public final e1 f58796b;

                {
                    this.f58796b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            e1 e1Var = this.f58796b;
                            HashSet hashSet = e1Var.f58673a2;
                            hashSet.add(Long.valueOf(j10));
                            n10 n10Var = e1Var.f58694w2;
                            if (n10Var != null) {
                                n10Var.a(Boolean.FALSE, hashSet);
                                e1Var.f58694w2 = null;
                            }
                            e1Var.dismiss();
                            return;
                        default:
                            e1 e1Var2 = this.f58796b;
                            HashSet hashSet2 = e1Var2.f58673a2;
                            hashSet2.add(Long.valueOf(j10));
                            n10 n10Var2 = e1Var2.f58694w2;
                            if (n10Var2 != null) {
                                n10Var2.a(Boolean.TRUE, hashSet2);
                                e1Var2.f58694w2 = null;
                            }
                            e1Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final e1 f58796b;

                {
                    this.f58796b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            e1 e1Var = this.f58796b;
                            HashSet hashSet = e1Var.f58673a2;
                            hashSet.add(Long.valueOf(j10));
                            n10 n10Var = e1Var.f58694w2;
                            if (n10Var != null) {
                                n10Var.a(Boolean.FALSE, hashSet);
                                e1Var.f58694w2 = null;
                            }
                            e1Var.dismiss();
                            return;
                        default:
                            e1 e1Var2 = this.f58796b;
                            HashSet hashSet2 = e1Var2.f58673a2;
                            hashSet2.add(Long.valueOf(j10));
                            n10 n10Var2 = e1Var2.f58694w2;
                            if (n10Var2 != null) {
                                n10Var2.a(Boolean.TRUE, hashSet2);
                                e1Var2.f58694w2 = null;
                            }
                            e1Var2.dismiss();
                            return;
                    }
                }
            };
            gVar.f59458o = r22;
            gVar.f59459p = r32;
            return gVar;
        }
        TLRPC.User user2 = gVar.f59448c;
        if (i3 == 3) {
            dVar = null;
        } else {
            dVar = new org.telegram.ui.web.d(7, this, user2);
        }
        gVar.f59457n = dVar;
        return gVar;
    }

    public final int h1() {
        if (this.Q1 == 4) {
            return Math.max(0, (hp.s1(this.f28583a).P6 - this.f58693v2.size()) - 1);
        }
        return 10;
    }

    public final void j1(boolean z10) {
        ArrayList arrayList = this.f58674b2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(g5.r(this.f28583a).f22653f0);
            this.f58676e2.putAll(g5.r(this.f28583a).f22655h0);
            this.f58677f2.addAll(g5.r(this.f28583a).f22656i0);
            if (z10) {
                o1(true, true);
            }
        }
    }

    public final void k1() {
        HashSet hashSet = this.f58673a2;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f58682k2;
            boolean isEmpty = arrayList.isEmpty();
            int i3 = this.Q1;
            if (!isEmpty || i3 == 0 || i3 == 2 || i3 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f58678g2.values()) {
                    if (hashSet.contains(Long.valueOf(user.f27150id))) {
                        arrayList2.add(user);
                    }
                }
                org.telegram.messenger.g0.v1(this.S1.getEditText());
                boolean z10 = true;
                if (i3 != 1) {
                    if (i3 == 4) {
                        n10 n10Var = this.f58694w2;
                        if (n10Var != null) {
                            wo woVar = this.V1;
                            n10Var.a(Boolean.valueOf((woVar == null || !woVar.f40035a.f31334q) ? false : false), hashSet);
                            this.f58694w2 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c2 = s.c(s.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j10 = ((TLRPC.User) arrayList2.get(0)).f27150id;
                        if (l10.b(hp.s1(h10.f22829t0).b2(j10))) {
                            org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131743752, m5.t(j10)), new fc(this.f28589c, this.J0), 2131624011, 36);
                            return;
                        }
                        b3 b3Var = new b3(getContext(), this.f28583a, j10, c2, new y0(this, 1));
                        t1 t1Var = this.f58686o2;
                        b3Var.e1((t1Var == null || !t1Var.a(j10)) ? false : false);
                        b3Var.show();
                    }
                }
            }
        }
    }

    public final void m1() {
        String M0;
        if (this.Q1 == 4) {
            M0 = bd.H(',', "UserSelectorLimit", h1());
        } else {
            M0 = bd.M0(2131753272, null);
        }
        e6 e6Var = this.J0;
        j2 j2Var = this.f28589c;
        new fc(j2Var, e6Var).Q(2131623981, 36, M0).k(true);
        try {
            j2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void n1(boolean z10) {
        ig0 ig0Var = this.R1;
        boolean z11 = false;
        ig0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = this.Q1;
        HashSet hashSet = this.f58673a2;
        if (i3 == 4) {
            spannableStringBuilder.append((CharSequence) bd.M0(2131752623, null));
        } else if (hashSet.size() == 0) {
            if (bd.f21784a0) {
                spannableStringBuilder.append((CharSequence) bd.M0(2131749682, "GiftPremiumChooseRecipientsBtn"));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f58685n2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f58685n2, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) bd.M0(2131749682, "GiftPremiumChooseRecipientsBtn"));
            }
        } else {
            spannableStringBuilder.append((CharSequence) bd.M0(2131749669, "GiftPremiumProceedBtn"));
        }
        ig0Var.c(hashSet.size(), true);
        ig0Var.i(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        ig0Var.setEnabled(z11);
    }

    public final void o1(boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: xg.e1.o1(boolean, boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.f28583a).c(this, hs.S2);
        hs.f(this.f28583a).c(this, hs.E0);
        hs.f(this.f28583a).c(this, hs.O);
        hs.f(this.f28583a).c(this, hs.S0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f28583a).n(this, hs.S2);
        hs.f(this.f28583a).n(this, hs.E0);
        hs.f(this.f28583a).n(this, hs.O);
        hs.f(this.f28583a).n(this, hs.S0);
    }

    public final void p1(boolean z10, boolean z11) {
        int R;
        int R2;
        o1(z10, z11);
        int i3 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            tj0 tj0Var = this.f36102l1;
            if (i10 >= tj0Var.getChildCount()) {
                break;
            }
            View childAt = tj0Var.getChildAt(i10);
            if ((childAt instanceof bh.p) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.Z1;
                if (R2 < arrayList.size()) {
                    if (i3 == -1) {
                        i3 = R;
                    }
                    yg.g gVar = (yg.g) arrayList.get(R2);
                    bh.p pVar = (bh.p) childAt;
                    pVar.c(gVar.f59454k, z10);
                    TLRPC.Chat chat = gVar.f59449e;
                    float f10 = 1.0f;
                    if (chat != null) {
                        if (this.f58680i2.F(chat) > 200) {
                            f10 = 0.3f;
                        }
                        pVar.i(z10, f10);
                    } else {
                        pVar.i(z10, 1.0f);
                    }
                    i11 = R;
                }
            }
            i10++;
        }
        if (z10) {
            this.f58680i2.k(0, i3);
            yg.h hVar = this.f58680i2;
            hVar.k(i11, hVar.b() - i11);
        }
        n1(z10);
    }

    @Override
    public final void s0() {
        boolean z10;
        boolean z11;
        super.s0();
        try {
            int w02 = k6.w0(k6.Ci, this.J0);
            xp xpVar = this.f58696y2;
            if (xpVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                k6.C1(w02, xpVar.f40438a);
            }
            xp xpVar2 = this.f58695x2;
            if (xpVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                k6.C1(w02, xpVar2.f40438a);
            }
            tj0 tj0Var = this.f36102l1;
            if (tj0Var != null) {
                for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
                    tj0Var.getChildAt(i3).invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
