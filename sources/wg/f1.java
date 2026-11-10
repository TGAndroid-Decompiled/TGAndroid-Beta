package wg;

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
import bi.ea;
import c8.ha;
import c8.ka;
import fi.o1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t1;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ts;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o00;
import org.telegram.ui.pg0;
import org.telegram.ui.qg0;
import org.telegram.ui.rg0;
import org.telegram.ui.v00;
import zh.g1;
public class f1 extends ma implements ls {
    public static d1 E2;
    public xp A2;
    public boolean B2;
    public boolean C2;
    public int D2;
    public final int S1;
    public final rg0 T1;
    public final qg0 U1;
    public final o00 V1;
    public final pg0 W1;
    public final wo X1;
    public final ah.a Y1;
    public final FrameLayout Z1;
    public final ArrayList f57725a2;
    public final ArrayList f57726b2;
    public final HashSet f57727c2;
    public final ArrayList d2;
    public final ArrayList f57728e2;
    public final ArrayList f57729f2;
    public final HashMap f57730g2;
    public final ArrayList f57731h2;
    public final LinkedHashMap f57732i2;
    public String f57733j2;
    public xg.i f57734k2;
    public int f57735l2;
    public final ArrayList f57736m2;
    public boolean f57737n2;
    public float f57738o2;
    public yo f57739p2;
    public final t1 f57740q2;
    public final tg.y f57741r2;
    public int f57742s2;
    public xp f57743t2;
    public String f57744u2;
    public v00 f57745v2;
    public c20 f57746w2;
    public final HashSet f57747x2;
    public v10 f57748y2;
    public xp f57749z2;

    public f1(Context context, int i7, t1 t1Var, int i10, h6 h6Var) {
        super(context, null, true, false, h6Var);
        int i11;
        float f10;
        float f11;
        boolean z9;
        this.f57725a2 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f57726b2 = arrayList;
        HashSet hashSet = new HashSet();
        this.f57727c2 = hashSet;
        this.d2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f57728e2 = arrayList2;
        this.f57729f2 = new ArrayList();
        this.f57730g2 = new HashMap();
        this.f57731h2 = new ArrayList();
        this.f57732i2 = new LinkedHashMap();
        this.f57735l2 = org.telegram.messenger.g0.L(120.0f);
        this.f57736m2 = new ArrayList();
        this.f57737n2 = false;
        this.f57741r2 = new tg.y(this, 6);
        this.f57742s2 = -1;
        this.f57747x2 = new HashSet();
        this.f28669a = i7;
        int i12 = m6.f27963h5;
        P(i12);
        this.f28703s = false;
        this.S1 = i10;
        this.f57740q2 = t1Var;
        xg.i iVar = this.f57734k2;
        if (iVar != null) {
            if (i10 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            iVar.f58759y = z9;
        }
        pg0 pg0Var = new pg0(1, getContext(), h6Var);
        this.W1 = pg0Var;
        pg0Var.setOnCloseClickListener(new x0(this, 11));
        pg0Var.setText(O0());
        pg0Var.setCloseImageVisible(false);
        pg0Var.f1071f.c(false, 0.0f);
        this.f57739p2 = new yo(this, 3);
        qg0 qg0Var = new qg0(this, getContext(), h6Var, 1);
        this.U1 = qg0Var;
        t6.h(i12, qg0Var, h6Var);
        qg0Var.setOnSearchTextChange(new y0(this, 3));
        if (hashSet.isEmpty() && i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            i11 = 2131749650;
        } else {
            i11 = 2131745836;
        }
        qg0Var.f1097b.r(id.M0(i11, null), false);
        o00 o00Var = new o00(14, getContext(), this);
        this.V1 = o00Var;
        ViewGroup viewGroup = this.f28672b;
        int i13 = this.f28705t0;
        viewGroup.addView(pg0Var, 0, ha.f(-2.0f, -1, 55, i13, 0, i13, 0));
        ViewGroup viewGroup2 = this.f28672b;
        int i14 = this.f28705t0;
        viewGroup2.addView(qg0Var, ha.f(-2.0f, -1, 55, i14, 0, i14, 0));
        ViewGroup viewGroup3 = this.f28672b;
        int i15 = this.f28705t0;
        viewGroup3.addView(o00Var, ha.f(1.0f, -1, 55, i15, 0, i15, 0));
        ah.a aVar = new ah.a(getContext(), h6Var, (pj0) null);
        this.Y1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        t6.h(i12, aVar, h6Var);
        if (i10 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i16 = m6.f27982i6;
            org.telegram.ui.Cells.y a02 = m6.a0(m6.w0(i16, this.I0), 6, 6);
            p6 M = t6.M(i16);
            linearLayout.setBackground(a02);
            t6.j(linearLayout, a02, null, M, h6Var);
            wo woVar = new wo(24, context, h6Var);
            this.X1 = woVar;
            woVar.b(m6.Ci, m6.f28000j7, m6.f28020k7);
            woVar.setDrawUnchecked(true);
            woVar.a(false, false);
            woVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(woVar, ha.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            t6.U(textView, m6.f27998j5, h6Var);
            jg.g.v(textView, 1, 14.0f, null, 2131751825);
            linearLayout.addView(textView, ha.t(-2, -2, 16, 9, 0, 0, 0));
            ka.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final f1 f57705b;

                {
                    this.f57705b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            wo woVar2 = this.f57705b.X1;
                            woVar2.a(!woVar2.f40026a.f31279q, true);
                            return;
                        default:
                            this.f57705b.k1();
                            return;
                    }
                }
            });
            aVar.addView(linearLayout, ha.t(-2, -2, 17, 0, 0, 0, 8));
        }
        rg0 rg0Var = new rg0(this, getContext(), h6Var, 1);
        this.T1 = rg0Var;
        if (i10 == 4) {
            f10 = 0.0f;
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        } else {
            f10 = 0.0f;
        }
        rg0Var.setOnClickListener(new View.OnClickListener(this) {
            public final f1 f57705b;

            {
                this.f57705b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        wo woVar2 = this.f57705b.X1;
                        woVar2.a(!woVar2.f40026a.f31279q, true);
                        return;
                    default:
                        this.f57705b.k1();
                        return;
                }
            }
        });
        aVar.addView(rg0Var, ha.r(-1, 48, 87));
        if (i10 == 4) {
            ViewGroup viewGroup4 = this.f28672b;
            int i17 = this.f28705t0;
            viewGroup4.addView(aVar, ha.f(-2.0f, -1, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.Z1 = frameLayout;
        ViewGroup viewGroup5 = this.f28672b;
        int i18 = this.f28705t0;
        viewGroup5.addView(frameLayout, ha.f(300.0f, -1, 87, i18, 0, i18, org.telegram.messenger.g0.L(68.0f)));
        xg.i iVar2 = this.f57734k2;
        pj0 pj0Var = this.n1;
        iVar2.f58754n = arrayList;
        iVar2.f58753f = pj0Var;
        int i19 = this.f28705t0;
        if (i10 != 1) {
            f11 = 60.0f;
        } else {
            f11 = f10;
        }
        pj0Var.setPadding(i19, 0, i19, org.telegram.messenger.g0.L(f11));
        this.n1.j(new ti(this, 29));
        this.n1.setOnItemClickListener(new ts(this, i10, h6Var, i7));
        if (i10 == 4) {
            this.n1.setOnItemLongClickListener((ej0) new l2.q(this, i10, 19));
        }
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(wq.h);
        kVar.C = false;
        kVar.f57079m = false;
        this.n1.setItemAnimator(kVar);
        this.n1.i(new o1(this, 9));
        qg0Var.setText("");
        qg0Var.d.b(false);
        qg0Var.b(false, hashSet, new x0(this, 12), null);
        pg0Var.setText(O0());
        ia iaVar = this.f35902o1;
        if (iaVar != null) {
            iaVar.setTitle(O0());
        }
        n1(false);
        j1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(ui.b0(this.f28669a).f25825i1);
        }
        p1(false, true);
        if (i10 == 0 || i10 == 2) {
            r.j(i7, null, new y0(this, 0));
        }
        if (i10 != 0 && i10 != 2) {
            return;
        }
        ea.y(i7, false).U();
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

    public static f1 l1(int i7, t1 t1Var) {
        f2 Q = LaunchActivity.Q();
        if (Q == 0) {
            return null;
        }
        d1 d1Var = E2;
        if (d1Var != null) {
            return d1Var;
        }
        ?? f1Var = new f1(Q.getContext(), Q.getCurrentAccount(), t1Var, i7, Q.getResourceProvider());
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(Q)) {
            f1Var.a0(Q);
        }
        Q.showDialog(f1Var);
        E2 = f1Var;
        return f1Var;
    }

    @Override
    public final void K() {
        super.K();
        E2 = null;
        org.telegram.messenger.g0.r(this.f57741r2);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        xg.i iVar = new xg.i(getContext(), this.I0, false);
        this.f57734k2 = iVar;
        iVar.f58756s = true;
        return iVar;
    }

    @Override
    public final CharSequence O0() {
        String str = this.f57744u2;
        if (str != null) {
            return str;
        }
        int i7 = this.S1;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        return id.M0(2131749600, null);
                    }
                    return id.M0(2131743425, null);
                }
            } else {
                return id.M0(2131749607, null);
            }
        }
        return id.M0(2131749601, null);
    }

    @Override
    public final void R0(Canvas canvas, int i7) {
        float max = Math.max(i7, org.telegram.messenger.g0.f22561m - org.telegram.messenger.g0.L(8.0f)) + org.telegram.messenger.g0.L(8.0f);
        pg0 pg0Var = this.W1;
        pg0Var.setTranslationY(max);
        float translationY = pg0Var.getTranslationY() + pg0Var.getMeasuredHeight();
        qg0 qg0Var = this.U1;
        qg0Var.setTranslationY(translationY);
        float translationY2 = qg0Var.getTranslationY() + qg0Var.getMeasuredHeight();
        o00 o00Var = this.V1;
        o00Var.setTranslationY(translationY2);
        int measuredHeight = qg0Var.getMeasuredHeight() + pg0Var.getMeasuredHeight();
        this.n1.setTranslationY((o00Var.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void c0(Configuration configuration) {
        o1(false, true);
    }

    public final int d1(String str, ArrayList arrayList, ArrayList arrayList2) {
        int i7 = 0;
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
            if (user != null && !user.bot && !t10.A(user.f27109id)) {
                long j3 = user.f27109id;
                if (j3 != 0 && !this.f57747x2.contains(Long.valueOf(j3))) {
                    Long valueOf = Long.valueOf(user.f27109id);
                    HashSet hashSet = this.f57727c2;
                    hashSet.contains(valueOf);
                    i7 += org.telegram.messenger.g0.L(56.0f);
                    xg.h c10 = xg.h.c(user, hashSet.contains(Long.valueOf(user.f27109id)));
                    g1(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i7;
        }
        int L = org.telegram.messenger.g0.L(32.0f) + i7;
        arrayList.add(xg.h.b(str));
        arrayList.addAll(arrayList3);
        return L;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.S2) {
            dismiss();
        } else if (i7 == qs.O) {
            org.telegram.messenger.g0.h3(new x0(this, 0));
        } else if (i7 == qs.S0) {
            org.telegram.messenger.g0.h3(new x0(this, 6));
        } else if (i7 == qs.E0) {
            org.telegram.messenger.g0.h3(new x0(this, 10));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.U1.getEditText());
        super.dismiss();
    }

    public final void e1() {
        int i7;
        if (this.f57727c2.isEmpty() && (i7 = this.S1) != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
            if (this.f57737n2) {
                this.f57737n2 = false;
                org.telegram.messenger.g0.i3(new x0(this, 4), 10L);
            }
        } else if (!this.f57737n2) {
            this.f57737n2 = true;
            org.telegram.messenger.g0.i3(new x0(this, 3), 10L);
        }
    }

    public final void f1() {
        if (!TextUtils.isEmpty(this.f57733j2)) {
            this.f57733j2 = null;
            this.U1.setText("");
            org.telegram.messenger.g0.r(this.f57741r2);
            o1(true, true);
        }
    }

    public final xg.h g1(xg.h hVar) {
        a1 a1Var;
        int i7 = this.S1;
        if (i7 == 4) {
            TLRPC.User user = hVar.f58738c;
            if (user == null) {
                return hVar;
            }
            final long j3 = user.f27109id;
            ?? r22 = new View.OnClickListener(this) {
                public final f1 f57861b;

                {
                    this.f57861b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            f1 f1Var = this.f57861b;
                            HashSet hashSet = f1Var.f57727c2;
                            hashSet.add(Long.valueOf(j3));
                            v10 v10Var = f1Var.f57748y2;
                            if (v10Var != null) {
                                v10Var.a(Boolean.FALSE, hashSet);
                                f1Var.f57748y2 = null;
                            }
                            f1Var.dismiss();
                            return;
                        default:
                            f1 f1Var2 = this.f57861b;
                            HashSet hashSet2 = f1Var2.f57727c2;
                            hashSet2.add(Long.valueOf(j3));
                            v10 v10Var2 = f1Var2.f57748y2;
                            if (v10Var2 != null) {
                                v10Var2.a(Boolean.TRUE, hashSet2);
                                f1Var2.f57748y2 = null;
                            }
                            f1Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final f1 f57861b;

                {
                    this.f57861b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            f1 f1Var = this.f57861b;
                            HashSet hashSet = f1Var.f57727c2;
                            hashSet.add(Long.valueOf(j3));
                            v10 v10Var = f1Var.f57748y2;
                            if (v10Var != null) {
                                v10Var.a(Boolean.FALSE, hashSet);
                                f1Var.f57748y2 = null;
                            }
                            f1Var.dismiss();
                            return;
                        default:
                            f1 f1Var2 = this.f57861b;
                            HashSet hashSet2 = f1Var2.f57727c2;
                            hashSet2.add(Long.valueOf(j3));
                            v10 v10Var2 = f1Var2.f57748y2;
                            if (v10Var2 != null) {
                                v10Var2.a(Boolean.TRUE, hashSet2);
                                f1Var2.f57748y2 = null;
                            }
                            f1Var2.dismiss();
                            return;
                    }
                }
            };
            hVar.f58748o = r22;
            hVar.f58749p = r32;
            return hVar;
        }
        TLRPC.User user2 = hVar.f58738c;
        if (i7 == 3) {
            a1Var = null;
        } else {
            a1Var = new a1(0, this, user2);
        }
        hVar.f58747n = a1Var;
        return hVar;
    }

    public final int h1() {
        if (this.S1 == 4) {
            return Math.max(0, (qp.s1(this.f28669a).P6 - this.f57747x2.size()) - 1);
        }
        return 10;
    }

    public final void j1(boolean z9) {
        ArrayList arrayList = this.d2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(g5.r(this.f28669a).f22612e0);
            this.f57730g2.putAll(g5.r(this.f28669a).f22615g0);
            this.f57731h2.addAll(g5.r(this.f28669a).f22616h0);
            if (z9) {
                o1(true, true);
            }
        }
    }

    public final void k1() {
        HashSet hashSet = this.f57727c2;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f57736m2;
            boolean isEmpty = arrayList.isEmpty();
            int i7 = this.S1;
            if (!isEmpty || i7 == 0 || i7 == 2 || i7 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f57732i2.values()) {
                    if (hashSet.contains(Long.valueOf(user.f27109id))) {
                        arrayList2.add(user);
                    }
                }
                org.telegram.messenger.g0.v1(this.U1.getEditText());
                boolean z9 = true;
                if (i7 != 1) {
                    if (i7 == 4) {
                        v10 v10Var = this.f57748y2;
                        if (v10Var != null) {
                            wo woVar = this.X1;
                            v10Var.a(Boolean.valueOf((woVar == null || !woVar.f40026a.f31279q) ? false : false), hashSet);
                            this.f57748y2 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = r.c(r.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j3 = ((TLRPC.User) arrayList2.get(0)).f27109id;
                        if (t10.b(qp.s1(p10.f24474s0).b2(j3))) {
                            org.telegram.messenger.camera.q.s(id.a0(null, null, 2131743742, m5.t(j3)), new gc(this.f28675c, this.I0), 2131624011, 36);
                            return;
                        }
                        g1 g1Var = new g1(getContext(), this.f28669a, j3, c10, new y0(this, 1));
                        t1 t1Var = this.f57740q2;
                        g1Var.e1((t1Var == null || !t1Var.a(j3)) ? false : false);
                        g1Var.show();
                    }
                }
            }
        }
    }

    public final void m1() {
        String M0;
        if (this.S1 == 4) {
            M0 = id.H(',', "UserSelectorLimit", h1());
        } else {
            M0 = id.M0(2131753272, null);
        }
        h6 h6Var = this.I0;
        m2 m2Var = this.f28675c;
        new gc(m2Var, h6Var).Q(2131623981, 36, M0).k(true);
        try {
            m2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void n1(boolean z9) {
        rg0 rg0Var = this.T1;
        boolean z10 = false;
        rg0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = this.S1;
        HashSet hashSet = this.f57727c2;
        if (i7 == 4) {
            spannableStringBuilder.append((CharSequence) id.M0(2131752623, null));
        } else if (hashSet.size() == 0) {
            if (id.f23161a0) {
                spannableStringBuilder.append((CharSequence) id.M0(2131749674, "GiftPremiumChooseRecipientsBtn"));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f57739p2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f57739p2, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) id.M0(2131749674, "GiftPremiumChooseRecipientsBtn"));
            }
        } else {
            spannableStringBuilder.append((CharSequence) id.M0(2131749661, "GiftPremiumProceedBtn"));
        }
        rg0Var.c(hashSet.size(), true);
        rg0Var.i(spannableStringBuilder, z9, false);
        if (hashSet.size() > 0) {
            z10 = true;
        }
        rg0Var.setEnabled(z10);
    }

    public final void o1(boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: wg.f1.o1(boolean, boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f28669a).c(this, qs.S2);
        qs.f(this.f28669a).c(this, qs.E0);
        qs.f(this.f28669a).c(this, qs.O);
        qs.f(this.f28669a).c(this, qs.S0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f28669a).n(this, qs.S2);
        qs.f(this.f28669a).n(this, qs.E0);
        qs.f(this.f28669a).n(this, qs.O);
        qs.f(this.f28669a).n(this, qs.S0);
    }

    public final void p1(boolean z9, boolean z10) {
        int R;
        int R2;
        o1(z9, z10);
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            pj0 pj0Var = this.n1;
            if (i10 >= pj0Var.getChildCount()) {
                break;
            }
            View childAt = pj0Var.getChildAt(i10);
            if ((childAt instanceof ah.r) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f57726b2;
                if (R2 < arrayList.size()) {
                    if (i7 == -1) {
                        i7 = R;
                    }
                    xg.h hVar = (xg.h) arrayList.get(R2);
                    ah.r rVar = (ah.r) childAt;
                    rVar.c(hVar.f58744k, z9);
                    TLRPC.Chat chat = hVar.f58739e;
                    float f10 = 1.0f;
                    if (chat != null) {
                        if (this.f57734k2.F(chat) > 200) {
                            f10 = 0.3f;
                        }
                        rVar.i(z9, f10);
                    } else {
                        rVar.i(z9, 1.0f);
                    }
                    i11 = R;
                }
            }
            i10++;
        }
        if (z9) {
            this.f57734k2.k(0, i7);
            xg.i iVar = this.f57734k2;
            iVar.k(i11, iVar.b() - i11);
        }
        n1(z9);
    }

    @Override
    public final void s0() {
        boolean z9;
        boolean z10;
        super.s0();
        try {
            int w02 = m6.w0(m6.Ci, this.I0);
            xp xpVar = this.A2;
            if (xpVar != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                m6.C1(w02, xpVar.f40374a);
            }
            xp xpVar2 = this.f57749z2;
            if (xpVar2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                m6.C1(w02, xpVar2.f40374a);
            }
            pj0 pj0Var = this.n1;
            if (pj0Var != null) {
                for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
                    pj0Var.getChildAt(i7).invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
