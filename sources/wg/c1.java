package wg;

import ai.s1;
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
import bi.s2;
import c8.na;
import di.u8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.si;
import org.telegram.messenger.t1;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mg0;
import org.telegram.ui.ng0;
import org.telegram.ui.og0;
import org.telegram.ui.rv;
import org.telegram.ui.s00;
import org.telegram.ui.sc1;
public class c1 extends ja implements is {
    public static a1 F2;
    public fq A2;
    public fq B2;
    public boolean C2;
    public boolean D2;
    public int E2;
    public final int T1;
    public final og0 U1;
    public final ng0 V1;
    public final rv W1;
    public final mg0 X1;
    public final fp Y1;
    public final ah.a Z1;
    public final FrameLayout f59144a2;
    public final ArrayList f59145b2;
    public final ArrayList f59146c2;
    public final HashSet d2;
    public final ArrayList f59147e2;
    public final ArrayList f59148f2;
    public final ArrayList f59149g2;
    public final HashMap f59150h2;
    public final ArrayList f59151i2;
    public final LinkedHashMap f59152j2;
    public String f59153k2;
    public xg.i f59154l2;
    public int f59155m2;
    public final ArrayList f59156n2;
    public boolean f59157o2;
    public float f59158p2;
    public hp f59159q2;
    public final t1 f59160r2;
    public final s4.s0 f59161s2;
    public int f59162t2;
    public fq f59163u2;
    public String f59164v2;
    public s00 f59165w2;
    public z10 f59166x2;
    public final HashSet f59167y2;
    public s10 f59168z2;

    public c1(Context context, int i7, t1 t1Var, int i10, e6 e6Var) {
        super(context, null, true, false, e6Var);
        int i11;
        float f10;
        boolean z10;
        this.f59145b2 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f59146c2 = arrayList;
        HashSet hashSet = new HashSet();
        this.d2 = hashSet;
        this.f59147e2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f59148f2 = arrayList2;
        this.f59149g2 = new ArrayList();
        this.f59150h2 = new HashMap();
        this.f59151i2 = new ArrayList();
        this.f59152j2 = new LinkedHashMap();
        this.f59155m2 = org.telegram.messenger.g0.L(120.0f);
        this.f59156n2 = new ArrayList();
        this.f59157o2 = false;
        this.f59161s2 = new s4.s0(this, 9);
        this.f59162t2 = -1;
        this.f59167y2 = new HashSet();
        this.f29679a = i7;
        int i12 = j6.f28922h5;
        Q(i12);
        this.f29714s = false;
        this.T1 = i10;
        this.f59160r2 = t1Var;
        xg.i iVar = this.f59154l2;
        if (iVar != null) {
            if (i10 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            iVar.f59943y = z10;
        }
        mg0 mg0Var = new mg0(1, getContext(), e6Var);
        this.X1 = mg0Var;
        mg0Var.setOnCloseClickListener(new v0(this, 11));
        mg0Var.setText(O0());
        mg0Var.setCloseImageVisible(false);
        mg0Var.f1069f.c(false, 0.0f);
        this.f59159q2 = new hp(this, 3);
        ng0 ng0Var = new ng0(this, getContext(), e6Var, 1);
        this.V1 = ng0Var;
        q6.h(i12, ng0Var, e6Var);
        ng0Var.setOnSearchTextChange(new w0(this, 3));
        if (hashSet.isEmpty() && i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            i11 = 2131749650;
        } else {
            i11 = 2131745836;
        }
        ng0Var.f1095b.r(hd.M0(i11, null), false);
        rv rvVar = new rv(15, getContext(), this);
        this.W1 = rvVar;
        ViewGroup viewGroup = this.f29682b;
        int i13 = this.f29717u0;
        viewGroup.addView(mg0Var, 0, c8.ja.f(-2.0f, -1, 55, i13, 0, i13, 0));
        ViewGroup viewGroup2 = this.f29682b;
        int i14 = this.f29717u0;
        viewGroup2.addView(ng0Var, c8.ja.f(-2.0f, -1, 55, i14, 0, i14, 0));
        ViewGroup viewGroup3 = this.f29682b;
        int i15 = this.f29717u0;
        viewGroup3.addView(rvVar, c8.ja.f(1.0f, -1, 55, i15, 0, i15, 0));
        ah.a aVar = new ah.a(getContext(), e6Var, (uj0) null);
        this.Z1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        q6.h(i12, aVar, e6Var);
        if (i10 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i16 = j6.f28941i6;
            org.telegram.ui.Cells.y a02 = j6.a0(j6.w0(i16, this.J0), 6, 6);
            m6 M = q6.M(i16);
            linearLayout.setBackground(a02);
            q6.j(linearLayout, a02, null, M, e6Var);
            fp fpVar = new fp(24, context, e6Var);
            this.Y1 = fpVar;
            fpVar.b(j6.Fi, j6.f28959j7, j6.f28979k7);
            fpVar.setDrawUnchecked(true);
            fpVar.a(false, false);
            fpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(fpVar, c8.ja.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            q6.U(textView, j6.f28957j5, e6Var);
            i5.c.w(textView, 1, 14.0f, null, 2131751825);
            linearLayout.addView(textView, c8.ja.t(-2, -2, 16, 9, 0, 0, 0));
            na.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final c1 f59298b;

                {
                    this.f59298b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            fp fpVar2 = this.f59298b.Y1;
                            fpVar2.a(!fpVar2.f34667a.f32441q, true);
                            return;
                        default:
                            this.f59298b.k1();
                            return;
                    }
                }
            });
            aVar.addView(linearLayout, c8.ja.t(-2, -2, 17, 0, 0, 0, 8));
        }
        og0 og0Var = new og0(this, getContext(), e6Var, 1);
        this.U1 = og0Var;
        if (i10 == 4) {
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        }
        og0Var.setOnClickListener(new View.OnClickListener(this) {
            public final c1 f59298b;

            {
                this.f59298b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        fp fpVar2 = this.f59298b.Y1;
                        fpVar2.a(!fpVar2.f34667a.f32441q, true);
                        return;
                    default:
                        this.f59298b.k1();
                        return;
                }
            }
        });
        aVar.addView(og0Var, c8.ja.r(-1, 48, 87));
        if (i10 == 4) {
            ViewGroup viewGroup4 = this.f29682b;
            int i17 = this.f29717u0;
            viewGroup4.addView(aVar, c8.ja.f(-2.0f, -1, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f59144a2 = frameLayout;
        ViewGroup viewGroup5 = this.f29682b;
        int i18 = this.f29717u0;
        viewGroup5.addView(frameLayout, c8.ja.f(300.0f, -1, 87, i18, 0, i18, org.telegram.messenger.g0.L(68.0f)));
        xg.i iVar2 = this.f59154l2;
        uj0 uj0Var = this.f35931o1;
        iVar2.f59938n = arrayList;
        iVar2.f59937f = uj0Var;
        int i19 = this.f29717u0;
        if (i10 != 1) {
            f10 = 60.0f;
        } else {
            f10 = 0.0f;
        }
        uj0Var.setPadding(i19, 0, i19, org.telegram.messenger.g0.L(f10));
        this.f35931o1.j(new vh.d(this, 2));
        this.f35931o1.setOnItemClickListener(new bt(this, i10, e6Var, i7));
        if (i10 == 4) {
            this.f35931o1.setOnItemLongClickListener((jj0) new s1(this, i10, 22));
        }
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(er.h);
        kVar.C = false;
        kVar.f58564m = false;
        this.f35931o1.setItemAnimator(kVar);
        this.f35931o1.i(new ai.i0(this, 10));
        ng0Var.setText("");
        ng0Var.d.b(false);
        ng0Var.b(false, hashSet, new v0(this, 12), null);
        mg0Var.setText(O0());
        fa faVar = this.f35932p1;
        if (faVar != null) {
            faVar.setTitle(O0());
        }
        n1(false);
        j1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(si.b0(this.f29679a).f26492j1);
        }
        p1(false, true);
        if (i10 == 0 || i10 == 2) {
            q.j(i7, null, new w0(this, 0));
        }
        if (i10 != 0 && i10 != 2) {
            return;
        }
        u8.y(i7, false).U();
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

    public static c1 l1(int i7, t1 t1Var) {
        e2 Q = LaunchActivity.Q();
        if (Q == 0) {
            return null;
        }
        a1 a1Var = F2;
        if (a1Var != null) {
            return a1Var;
        }
        ?? c1Var = new c1(Q.getContext(), Q.getCurrentAccount(), t1Var, i7, Q.getResourceProvider());
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(Q)) {
            c1Var.a0(Q);
        }
        Q.showDialog(c1Var);
        F2 = c1Var;
        return c1Var;
    }

    @Override
    public final void L() {
        super.L();
        F2 = null;
        org.telegram.messenger.g0.r(this.f59161s2);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        xg.i iVar = new xg.i(getContext(), this.J0, false);
        this.f59154l2 = iVar;
        iVar.f59940s = true;
        return iVar;
    }

    @Override
    public final CharSequence O0() {
        String str = this.f59164v2;
        if (str != null) {
            return str;
        }
        int i7 = this.T1;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        return hd.M0(2131749600, null);
                    }
                    return hd.M0(2131743425, null);
                }
            } else {
                return hd.M0(2131749607, null);
            }
        }
        return hd.M0(2131749601, null);
    }

    @Override
    public final void R0(Canvas canvas, int i7) {
        float max = Math.max(i7, org.telegram.messenger.g0.f23605m - org.telegram.messenger.g0.L(8.0f)) + org.telegram.messenger.g0.L(8.0f);
        mg0 mg0Var = this.X1;
        mg0Var.setTranslationY(max);
        float translationY = mg0Var.getTranslationY() + mg0Var.getMeasuredHeight();
        ng0 ng0Var = this.V1;
        ng0Var.setTranslationY(translationY);
        float translationY2 = ng0Var.getTranslationY() + ng0Var.getMeasuredHeight();
        rv rvVar = this.W1;
        rvVar.setTranslationY(translationY2);
        int measuredHeight = ng0Var.getMeasuredHeight() + mg0Var.getMeasuredHeight();
        this.f35931o1.setTranslationY((rvVar.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.g0.L(8.0f));
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
            if (user != null && !user.bot && !q10.A(user.f28200id)) {
                long j3 = user.f28200id;
                if (j3 != 0 && !this.f59167y2.contains(Long.valueOf(j3))) {
                    Long valueOf = Long.valueOf(user.f28200id);
                    HashSet hashSet = this.d2;
                    hashSet.contains(valueOf);
                    i7 += org.telegram.messenger.g0.L(56.0f);
                    xg.h c10 = xg.h.c(user, hashSet.contains(Long.valueOf(user.f28200id)));
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
        if (i7 == ns.S2) {
            dismiss();
        } else if (i7 == ns.O) {
            org.telegram.messenger.g0.h3(new v0(this, 0));
        } else if (i7 == ns.S0) {
            org.telegram.messenger.g0.h3(new v0(this, 6));
        } else if (i7 == ns.E0) {
            org.telegram.messenger.g0.h3(new v0(this, 10));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.V1.getEditText());
        super.dismiss();
    }

    public final void e1() {
        int i7;
        if (this.d2.isEmpty() && (i7 = this.T1) != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
            if (this.f59157o2) {
                this.f59157o2 = false;
                org.telegram.messenger.g0.i3(new v0(this, 4), 10L);
            }
        } else if (!this.f59157o2) {
            this.f59157o2 = true;
            org.telegram.messenger.g0.i3(new v0(this, 3), 10L);
        }
    }

    public final void f1() {
        if (!TextUtils.isEmpty(this.f59153k2)) {
            this.f59153k2 = null;
            this.V1.setText("");
            org.telegram.messenger.g0.r(this.f59161s2);
            o1(true, true);
        }
    }

    public final xg.h g1(xg.h hVar) {
        sc1 sc1Var;
        int i7 = this.T1;
        if (i7 == 4) {
            TLRPC.User user = hVar.f59922c;
            if (user == null) {
                return hVar;
            }
            final long j3 = user.f28200id;
            ?? r22 = new View.OnClickListener(this) {
                public final c1 f59271b;

                {
                    this.f59271b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            c1 c1Var = this.f59271b;
                            HashSet hashSet = c1Var.d2;
                            hashSet.add(Long.valueOf(j3));
                            s10 s10Var = c1Var.f59168z2;
                            if (s10Var != null) {
                                s10Var.a(Boolean.FALSE, hashSet);
                                c1Var.f59168z2 = null;
                            }
                            c1Var.dismiss();
                            return;
                        default:
                            c1 c1Var2 = this.f59271b;
                            HashSet hashSet2 = c1Var2.d2;
                            hashSet2.add(Long.valueOf(j3));
                            s10 s10Var2 = c1Var2.f59168z2;
                            if (s10Var2 != null) {
                                s10Var2.a(Boolean.TRUE, hashSet2);
                                c1Var2.f59168z2 = null;
                            }
                            c1Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final c1 f59271b;

                {
                    this.f59271b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            c1 c1Var = this.f59271b;
                            HashSet hashSet = c1Var.d2;
                            hashSet.add(Long.valueOf(j3));
                            s10 s10Var = c1Var.f59168z2;
                            if (s10Var != null) {
                                s10Var.a(Boolean.FALSE, hashSet);
                                c1Var.f59168z2 = null;
                            }
                            c1Var.dismiss();
                            return;
                        default:
                            c1 c1Var2 = this.f59271b;
                            HashSet hashSet2 = c1Var2.d2;
                            hashSet2.add(Long.valueOf(j3));
                            s10 s10Var2 = c1Var2.f59168z2;
                            if (s10Var2 != null) {
                                s10Var2.a(Boolean.TRUE, hashSet2);
                                c1Var2.f59168z2 = null;
                            }
                            c1Var2.dismiss();
                            return;
                    }
                }
            };
            hVar.f59932o = r22;
            hVar.f59933p = r32;
            return hVar;
        }
        TLRPC.User user2 = hVar.f59922c;
        if (i7 == 3) {
            sc1Var = null;
        } else {
            sc1Var = new sc1(8, this, user2);
        }
        hVar.f59931n = sc1Var;
        return hVar;
    }

    public final int h1() {
        if (this.T1 == 4) {
            return Math.max(0, (np.s1(this.f29679a).Q6 - this.f59167y2.size()) - 1);
        }
        return 10;
    }

    public final void j1(boolean z10) {
        ArrayList arrayList = this.f59147e2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(g5.r(this.f29679a).f23681f0);
            this.f59150h2.putAll(g5.r(this.f29679a).f23683h0);
            this.f59151i2.addAll(g5.r(this.f29679a).f23684i0);
            if (z10) {
                o1(true, true);
            }
        }
    }

    public final void k1() {
        HashSet hashSet = this.d2;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f59156n2;
            boolean isEmpty = arrayList.isEmpty();
            int i7 = this.T1;
            if (!isEmpty || i7 == 0 || i7 == 2 || i7 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f59152j2.values()) {
                    if (hashSet.contains(Long.valueOf(user.f28200id))) {
                        arrayList2.add(user);
                    }
                }
                org.telegram.messenger.g0.v1(this.V1.getEditText());
                boolean z10 = true;
                if (i7 != 1) {
                    if (i7 == 4) {
                        s10 s10Var = this.f59168z2;
                        if (s10Var != null) {
                            fp fpVar = this.Y1;
                            s10Var.a(Boolean.valueOf((fpVar == null || !fpVar.f34667a.f32441q) ? false : false), hashSet);
                            this.f59168z2 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = q.c(q.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j3 = ((TLRPC.User) arrayList2.get(0)).f28200id;
                        if (q10.b(np.s1(m10.f24940t0).b2(j3))) {
                            i20.t(hd.a0(null, null, 2131743742, m5.t(j3)), new cc(this.f29685c, this.J0), 2131624012, 36);
                            return;
                        }
                        s2 s2Var = new s2(getContext(), this.f29679a, j3, c10, new w0(this, 1));
                        t1 t1Var = this.f59160r2;
                        s2Var.e1((t1Var == null || !t1Var.a(j3)) ? false : false);
                        s2Var.show();
                    }
                }
            }
        }
    }

    public final void m1() {
        String M0;
        if (this.T1 == 4) {
            M0 = hd.H(',', "UserSelectorLimit", h1());
        } else {
            M0 = hd.M0(2131753272, null);
        }
        e6 e6Var = this.J0;
        k2 k2Var = this.f29685c;
        new cc(k2Var, e6Var).Q(2131623982, 36, M0).k(true);
        try {
            k2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void n1(boolean z10) {
        og0 og0Var = this.U1;
        boolean z11 = false;
        og0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = this.T1;
        HashSet hashSet = this.d2;
        if (i7 == 4) {
            spannableStringBuilder.append((CharSequence) hd.M0(2131752623, null));
        } else if (hashSet.size() == 0) {
            if (hd.f24104a0) {
                spannableStringBuilder.append((CharSequence) hd.M0(2131749674, "GiftPremiumChooseRecipientsBtn"));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f59159q2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f59159q2, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) hd.M0(2131749674, "GiftPremiumChooseRecipientsBtn"));
            }
        } else {
            spannableStringBuilder.append((CharSequence) hd.M0(2131749661, "GiftPremiumProceedBtn"));
        }
        og0Var.c(hashSet.size(), true);
        og0Var.i(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        og0Var.setEnabled(z11);
    }

    public final void o1(boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: wg.c1.o1(boolean, boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.f29679a).c(this, ns.S2);
        ns.f(this.f29679a).c(this, ns.E0);
        ns.f(this.f29679a).c(this, ns.O);
        ns.f(this.f29679a).c(this, ns.S0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.f29679a).n(this, ns.S2);
        ns.f(this.f29679a).n(this, ns.E0);
        ns.f(this.f29679a).n(this, ns.O);
        ns.f(this.f29679a).n(this, ns.S0);
    }

    public final void p1(boolean z10, boolean z11) {
        int R;
        int R2;
        o1(z10, z11);
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            uj0 uj0Var = this.f35931o1;
            if (i10 >= uj0Var.getChildCount()) {
                break;
            }
            View childAt = uj0Var.getChildAt(i10);
            if ((childAt instanceof ah.r) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f59146c2;
                if (R2 < arrayList.size()) {
                    if (i7 == -1) {
                        i7 = R;
                    }
                    xg.h hVar = (xg.h) arrayList.get(R2);
                    ah.r rVar = (ah.r) childAt;
                    rVar.c(hVar.f59928k, z10);
                    TLRPC.Chat chat = hVar.f59923e;
                    float f10 = 1.0f;
                    if (chat != null) {
                        if (this.f59154l2.F(chat) > 200) {
                            f10 = 0.3f;
                        }
                        rVar.i(z10, f10);
                    } else {
                        rVar.i(z10, 1.0f);
                    }
                    i11 = R;
                }
            }
            i10++;
        }
        if (z10) {
            this.f59154l2.k(0, i7);
            xg.i iVar = this.f59154l2;
            iVar.k(i11, iVar.b() - i11);
        }
        n1(z10);
    }

    @Override
    public final void s0() {
        boolean z10;
        boolean z11;
        super.s0();
        try {
            int w02 = j6.w0(j6.Fi, this.J0);
            fq fqVar = this.B2;
            if (fqVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j6.C1(w02, fqVar.f34673a);
            }
            fq fqVar2 = this.A2;
            if (fqVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                j6.C1(w02, fqVar2.f34673a);
            }
            uj0 uj0Var = this.f35931o1;
            if (uj0Var != null) {
                for (int i7 = 0; i7 < uj0Var.getChildCount(); i7++) {
                    uj0Var.getChildAt(i7).invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
