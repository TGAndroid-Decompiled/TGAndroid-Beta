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
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t1;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l00;
import org.telegram.ui.mg0;
import org.telegram.ui.ng0;
import org.telegram.ui.og0;
import org.telegram.ui.s00;
import zh.h1;
public class f1 extends na implements ls {
    public static d1 B2;
    public int A2;
    public final int P1;
    public final og0 Q1;
    public final ng0 R1;
    public final l00 S1;
    public final mg0 T1;
    public final wo U1;
    public final ah.a V1;
    public final FrameLayout W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final HashSet Z1;
    public final ArrayList f57611a2;
    public final ArrayList f57612b2;
    public final ArrayList f57613c2;
    public final HashMap d2;
    public final ArrayList f57614e2;
    public final LinkedHashMap f57615f2;
    public String f57616g2;
    public xg.i f57617h2;
    public int f57618i2;
    public final ArrayList f57619j2;
    public boolean f57620k2;
    public float f57621l2;
    public yo f57622m2;
    public final t1 f57623n2;
    public final tg.y f57624o2;
    public int f57625p2;
    public xp f57626q2;
    public String f57627r2;
    public s00 f57628s2;
    public c20 f57629t2;
    public final HashSet f57630u2;
    public v10 f57631v2;
    public xp f57632w2;
    public xp f57633x2;
    public boolean f57634y2;
    public boolean f57635z2;

    public f1(Context context, int i7, t1 t1Var, int i10, f6 f6Var) {
        super(context, null, true, false, f6Var);
        int i11;
        float f10;
        float f11;
        boolean z9;
        this.X1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Y1 = arrayList;
        HashSet hashSet = new HashSet();
        this.Z1 = hashSet;
        this.f57611a2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f57612b2 = arrayList2;
        this.f57613c2 = new ArrayList();
        this.d2 = new HashMap();
        this.f57614e2 = new ArrayList();
        this.f57615f2 = new LinkedHashMap();
        this.f57618i2 = org.telegram.messenger.g0.L(120.0f);
        this.f57619j2 = new ArrayList();
        this.f57620k2 = false;
        this.f57624o2 = new tg.y(this, 6);
        this.f57625p2 = -1;
        this.f57630u2 = new HashSet();
        this.f28612a = i7;
        int i12 = k6.f27921h5;
        P(i12);
        this.f28643s = false;
        this.P1 = i10;
        this.f57623n2 = t1Var;
        xg.i iVar = this.f57617h2;
        if (iVar != null) {
            if (i10 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            iVar.f58632y = z9;
        }
        mg0 mg0Var = new mg0(1, getContext(), f6Var);
        this.T1 = mg0Var;
        mg0Var.setOnCloseClickListener(new x0(this, 11));
        mg0Var.setText(O0());
        mg0Var.setCloseImageVisible(false);
        mg0Var.f1071f.c(false, 0.0f);
        this.f57622m2 = new yo(this, 3);
        ng0 ng0Var = new ng0(this, getContext(), f6Var, 1);
        this.R1 = ng0Var;
        r6.i(i12, ng0Var, f6Var);
        ng0Var.setOnSearchTextChange(new y0(this, 3));
        if (hashSet.isEmpty() && i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            i11 = 2131749649;
        } else {
            i11 = 2131745837;
        }
        ng0Var.f1097b.r(hd.M0(i11, null), false);
        l00 l00Var = new l00(14, getContext(), this);
        this.S1 = l00Var;
        ViewGroup viewGroup = this.f28615b;
        int i13 = this.f28645t0;
        viewGroup.addView(mg0Var, 0, ha.f(-2.0f, -1, 55, i13, 0, i13, 0));
        ViewGroup viewGroup2 = this.f28615b;
        int i14 = this.f28645t0;
        viewGroup2.addView(ng0Var, ha.f(-2.0f, -1, 55, i14, 0, i14, 0));
        ViewGroup viewGroup3 = this.f28615b;
        int i15 = this.f28645t0;
        viewGroup3.addView(l00Var, ha.f(1.0f, -1, 55, i15, 0, i15, 0));
        ah.a aVar = new ah.a(getContext(), f6Var, (pj0) null);
        this.V1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        r6.i(i12, aVar, f6Var);
        if (i10 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i16 = k6.f27940i6;
            org.telegram.ui.Cells.y a02 = k6.a0(k6.w0(i16, this.I0), 6, 6);
            n6 N = r6.N(i16);
            linearLayout.setBackground(a02);
            r6.k(linearLayout, a02, null, N, f6Var);
            wo woVar = new wo(24, context, f6Var);
            this.U1 = woVar;
            woVar.b(k6.Ci, k6.f27958j7, k6.f27978k7);
            woVar.setDrawUnchecked(true);
            woVar.a(false, false);
            woVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(woVar, ha.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            r6.V(textView, k6.f27956j5, f6Var);
            jg.g.v(textView, 1, 14.0f, null, 2131751825);
            linearLayout.addView(textView, ha.t(-2, -2, 16, 9, 0, 0, 0));
            ka.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final f1 f57591b;

                {
                    this.f57591b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            wo woVar2 = this.f57591b.U1;
                            woVar2.a(!woVar2.f40043a.f31258q, true);
                            return;
                        default:
                            this.f57591b.k1();
                            return;
                    }
                }
            });
            aVar.addView(linearLayout, ha.t(-2, -2, 17, 0, 0, 0, 8));
        }
        og0 og0Var = new og0(this, getContext(), f6Var, 1);
        this.Q1 = og0Var;
        if (i10 == 4) {
            f10 = 0.0f;
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        } else {
            f10 = 0.0f;
        }
        og0Var.setOnClickListener(new View.OnClickListener(this) {
            public final f1 f57591b;

            {
                this.f57591b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        wo woVar2 = this.f57591b.U1;
                        woVar2.a(!woVar2.f40043a.f31258q, true);
                        return;
                    default:
                        this.f57591b.k1();
                        return;
                }
            }
        });
        aVar.addView(og0Var, ha.r(-1, 48, 87));
        if (i10 == 4) {
            ViewGroup viewGroup4 = this.f28615b;
            int i17 = this.f28645t0;
            viewGroup4.addView(aVar, ha.f(-2.0f, -1, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.W1 = frameLayout;
        ViewGroup viewGroup5 = this.f28615b;
        int i18 = this.f28645t0;
        viewGroup5.addView(frameLayout, ha.f(300.0f, -1, 87, i18, 0, i18, org.telegram.messenger.g0.L(68.0f)));
        xg.i iVar2 = this.f57617h2;
        pj0 pj0Var = this.f36328k1;
        iVar2.f58627n = arrayList;
        iVar2.f58626f = pj0Var;
        int i19 = this.f28645t0;
        if (i10 != 1) {
            f11 = 60.0f;
        } else {
            f11 = f10;
        }
        pj0Var.setPadding(i19, 0, i19, org.telegram.messenger.g0.L(f11));
        this.f36328k1.j(new ui(this, 29));
        this.f36328k1.setOnItemClickListener(new us(this, i10, f6Var, i7));
        if (i10 == 4) {
            this.f36328k1.setOnItemLongClickListener((ej0) new l2.q(this, i10, 19));
        }
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(xq.h);
        kVar.C = false;
        kVar.f56954m = false;
        this.f36328k1.setItemAnimator(kVar);
        this.f36328k1.i(new o1(this, 9));
        ng0Var.setText("");
        ng0Var.d.b(false);
        ng0Var.b(false, hashSet, new x0(this, 12), null);
        mg0Var.setText(O0());
        ja jaVar = this.l1;
        if (jaVar != null) {
            jaVar.setTitle(O0());
        }
        n1(false);
        j1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(org.telegram.messenger.ui.b0(this.f28612a).f25810i1);
        }
        p1(false, true);
        if (i10 == 0 || i10 == 2) {
            s.j(i7, null, new y0(this, 0));
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
        d1 d1Var = B2;
        if (d1Var != null) {
            return d1Var;
        }
        ?? f1Var = new f1(Q.getContext(), Q.getCurrentAccount(), t1Var, i7, Q.getResourceProvider());
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(Q)) {
            f1Var.a0(Q);
        }
        Q.showDialog(f1Var);
        B2 = f1Var;
        return f1Var;
    }

    @Override
    public final void K() {
        super.K();
        B2 = null;
        org.telegram.messenger.g0.r(this.f57624o2);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        xg.i iVar = new xg.i(getContext(), this.I0, false);
        this.f57617h2 = iVar;
        iVar.f58629s = true;
        return iVar;
    }

    @Override
    public final CharSequence O0() {
        String str = this.f57627r2;
        if (str != null) {
            return str;
        }
        int i7 = this.P1;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        return hd.M0(2131749599, null);
                    }
                    return hd.M0(2131743426, null);
                }
            } else {
                return hd.M0(2131749606, null);
            }
        }
        return hd.M0(2131749600, null);
    }

    @Override
    public final void R0(Canvas canvas, int i7) {
        float max = Math.max(i7, org.telegram.messenger.g0.f22531m - org.telegram.messenger.g0.L(8.0f)) + org.telegram.messenger.g0.L(8.0f);
        mg0 mg0Var = this.T1;
        mg0Var.setTranslationY(max);
        float translationY = mg0Var.getTranslationY() + mg0Var.getMeasuredHeight();
        ng0 ng0Var = this.R1;
        ng0Var.setTranslationY(translationY);
        float translationY2 = ng0Var.getTranslationY() + ng0Var.getMeasuredHeight();
        l00 l00Var = this.S1;
        l00Var.setTranslationY(translationY2);
        int measuredHeight = ng0Var.getMeasuredHeight() + mg0Var.getMeasuredHeight();
        this.f36328k1.setTranslationY((l00Var.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.g0.L(8.0f));
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
            if (user != null && !user.bot && !t10.A(user.f27101id)) {
                long j3 = user.f27101id;
                if (j3 != 0 && !this.f57630u2.contains(Long.valueOf(j3))) {
                    Long valueOf = Long.valueOf(user.f27101id);
                    HashSet hashSet = this.Z1;
                    hashSet.contains(valueOf);
                    i7 += org.telegram.messenger.g0.L(56.0f);
                    xg.h c10 = xg.h.c(user, hashSet.contains(Long.valueOf(user.f27101id)));
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
        org.telegram.messenger.g0.v1(this.R1.getEditText());
        super.dismiss();
    }

    public final void e1() {
        int i7;
        if (this.Z1.isEmpty() && (i7 = this.P1) != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
            if (this.f57620k2) {
                this.f57620k2 = false;
                org.telegram.messenger.g0.i3(new x0(this, 4), 10L);
            }
        } else if (!this.f57620k2) {
            this.f57620k2 = true;
            org.telegram.messenger.g0.i3(new x0(this, 3), 10L);
        }
    }

    public final void f1() {
        if (!TextUtils.isEmpty(this.f57616g2)) {
            this.f57616g2 = null;
            this.R1.setText("");
            org.telegram.messenger.g0.r(this.f57624o2);
            o1(true, true);
        }
    }

    public final xg.h g1(xg.h hVar) {
        z0 z0Var;
        int i7 = this.P1;
        if (i7 == 4) {
            TLRPC.User user = hVar.f58611c;
            if (user == null) {
                return hVar;
            }
            final long j3 = user.f27101id;
            ?? r22 = new View.OnClickListener(this) {
                public final f1 f57578b;

                {
                    this.f57578b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            f1 f1Var = this.f57578b;
                            HashSet hashSet = f1Var.Z1;
                            hashSet.add(Long.valueOf(j3));
                            v10 v10Var = f1Var.f57631v2;
                            if (v10Var != null) {
                                v10Var.a(Boolean.FALSE, hashSet);
                                f1Var.f57631v2 = null;
                            }
                            f1Var.dismiss();
                            return;
                        default:
                            f1 f1Var2 = this.f57578b;
                            HashSet hashSet2 = f1Var2.Z1;
                            hashSet2.add(Long.valueOf(j3));
                            v10 v10Var2 = f1Var2.f57631v2;
                            if (v10Var2 != null) {
                                v10Var2.a(Boolean.TRUE, hashSet2);
                                f1Var2.f57631v2 = null;
                            }
                            f1Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final f1 f57578b;

                {
                    this.f57578b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            f1 f1Var = this.f57578b;
                            HashSet hashSet = f1Var.Z1;
                            hashSet.add(Long.valueOf(j3));
                            v10 v10Var = f1Var.f57631v2;
                            if (v10Var != null) {
                                v10Var.a(Boolean.FALSE, hashSet);
                                f1Var.f57631v2 = null;
                            }
                            f1Var.dismiss();
                            return;
                        default:
                            f1 f1Var2 = this.f57578b;
                            HashSet hashSet2 = f1Var2.Z1;
                            hashSet2.add(Long.valueOf(j3));
                            v10 v10Var2 = f1Var2.f57631v2;
                            if (v10Var2 != null) {
                                v10Var2.a(Boolean.TRUE, hashSet2);
                                f1Var2.f57631v2 = null;
                            }
                            f1Var2.dismiss();
                            return;
                    }
                }
            };
            hVar.f58621o = r22;
            hVar.f58622p = r32;
            return hVar;
        }
        TLRPC.User user2 = hVar.f58611c;
        if (i7 == 3) {
            z0Var = null;
        } else {
            z0Var = new z0(1, this, user2);
        }
        hVar.f58620n = z0Var;
        return hVar;
    }

    public final int h1() {
        if (this.P1 == 4) {
            return Math.max(0, (qp.s1(this.f28612a).P6 - this.f57630u2.size()) - 1);
        }
        return 10;
    }

    public final void j1(boolean z9) {
        ArrayList arrayList = this.f57611a2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(g5.r(this.f28612a).f22582e0);
            this.d2.putAll(g5.r(this.f28612a).f22585g0);
            this.f57614e2.addAll(g5.r(this.f28612a).f22586h0);
            if (z9) {
                o1(true, true);
            }
        }
    }

    public final void k1() {
        HashSet hashSet = this.Z1;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f57619j2;
            boolean isEmpty = arrayList.isEmpty();
            int i7 = this.P1;
            if (!isEmpty || i7 == 0 || i7 == 2 || i7 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f57615f2.values()) {
                    if (hashSet.contains(Long.valueOf(user.f27101id))) {
                        arrayList2.add(user);
                    }
                }
                org.telegram.messenger.g0.v1(this.R1.getEditText());
                boolean z9 = true;
                if (i7 != 1) {
                    if (i7 == 4) {
                        v10 v10Var = this.f57631v2;
                        if (v10Var != null) {
                            wo woVar = this.U1;
                            v10Var.a(Boolean.valueOf((woVar == null || !woVar.f40043a.f31258q) ? false : false), hashSet);
                            this.f57631v2 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = s.c(s.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j3 = ((TLRPC.User) arrayList2.get(0)).f27101id;
                        if (t10.b(qp.s1(p10.f24459s0).b2(j3))) {
                            org.telegram.messenger.camera.q.s(hd.a0(null, null, 2131743743, m5.t(j3)), new hc(this.f28618c, this.I0), 2131624011, 36);
                            return;
                        }
                        h1 h1Var = new h1(getContext(), this.f28612a, j3, c10, new y0(this, 1));
                        t1 t1Var = this.f57623n2;
                        h1Var.e1((t1Var == null || !t1Var.a(j3)) ? false : false);
                        h1Var.show();
                    }
                }
            }
        }
    }

    public final void m1() {
        String M0;
        if (this.P1 == 4) {
            M0 = hd.H(',', "UserSelectorLimit", h1());
        } else {
            M0 = hd.M0(2131753272, null);
        }
        f6 f6Var = this.I0;
        l2 l2Var = this.f28618c;
        new hc(l2Var, f6Var).Q(2131623981, 36, M0).k(true);
        try {
            l2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void n1(boolean z9) {
        og0 og0Var = this.Q1;
        boolean z10 = false;
        og0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = this.P1;
        HashSet hashSet = this.Z1;
        if (i7 == 4) {
            spannableStringBuilder.append((CharSequence) hd.M0(2131752623, null));
        } else if (hashSet.size() == 0) {
            if (hd.f22871a0) {
                spannableStringBuilder.append((CharSequence) hd.M0(2131749673, "GiftPremiumChooseRecipientsBtn"));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f57622m2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f57622m2, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) hd.M0(2131749673, "GiftPremiumChooseRecipientsBtn"));
            }
        } else {
            spannableStringBuilder.append((CharSequence) hd.M0(2131749660, "GiftPremiumProceedBtn"));
        }
        og0Var.c(hashSet.size(), true);
        og0Var.i(spannableStringBuilder, z9, false);
        if (hashSet.size() > 0) {
            z10 = true;
        }
        og0Var.setEnabled(z10);
    }

    public final void o1(boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: wg.f1.o1(boolean, boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f28612a).c(this, qs.S2);
        qs.f(this.f28612a).c(this, qs.E0);
        qs.f(this.f28612a).c(this, qs.O);
        qs.f(this.f28612a).c(this, qs.S0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f28612a).n(this, qs.S2);
        qs.f(this.f28612a).n(this, qs.E0);
        qs.f(this.f28612a).n(this, qs.O);
        qs.f(this.f28612a).n(this, qs.S0);
    }

    public final void p1(boolean z9, boolean z10) {
        int R;
        int R2;
        o1(z9, z10);
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            pj0 pj0Var = this.f36328k1;
            if (i10 >= pj0Var.getChildCount()) {
                break;
            }
            View childAt = pj0Var.getChildAt(i10);
            if ((childAt instanceof ah.r) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.Y1;
                if (R2 < arrayList.size()) {
                    if (i7 == -1) {
                        i7 = R;
                    }
                    xg.h hVar = (xg.h) arrayList.get(R2);
                    ah.r rVar = (ah.r) childAt;
                    rVar.c(hVar.f58617k, z9);
                    TLRPC.Chat chat = hVar.f58612e;
                    float f10 = 1.0f;
                    if (chat != null) {
                        if (this.f57617h2.F(chat) > 200) {
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
            this.f57617h2.k(0, i7);
            xg.i iVar = this.f57617h2;
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
            int w02 = k6.w0(k6.Ci, this.I0);
            xp xpVar = this.f57633x2;
            if (xpVar != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                k6.C1(w02, xpVar.f40296a);
            }
            xp xpVar2 = this.f57632w2;
            if (xpVar2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                k6.C1(w02, xpVar2.f40296a);
            }
            pj0 pj0Var = this.f36328k1;
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
