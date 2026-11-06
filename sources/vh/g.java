package vh;

import ah.i;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.m5;
import c8.ha;
import c8.ka;
import ei.k;
import hi.u1;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.j0;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.xq;
import r0.a0;
public final class g extends na implements te.b {
    public static final int f57419j2 = 0;
    public final te.c P1;
    public final te.a Q1;
    public final HashMap R1;
    public final ArrayList S1;
    public final ArrayList T1;
    public String U1;
    public l41 V1;
    public final fi.d W1;
    public final k X1;
    public final m5 Y1;
    public final v00 Z1;
    public final x3 f57420a2;
    public final HashMap f57421b2;
    public gf.g f57422c2;
    public int d2;
    public final int f57423e2;
    public final FrameLayout f57424f2;
    public HashSet f57425g2;
    public final Rect f57426h2;
    public c20 f57427i2;

    public g(Context context, f6 f6Var) {
        super(context, f6Var, true);
        String country;
        xq xqVar = xq.h;
        this.P1 = new te.c(3, this, xqVar, 350L);
        this.Q1 = new te.a(4, this, xqVar, 320L, false);
        this.R1 = new HashMap();
        this.S1 = new ArrayList();
        this.T1 = new ArrayList();
        this.f57421b2 = new HashMap();
        this.f57426h2 = new Rect();
        this.f28651x = true;
        this.f28637n = false;
        this.C1 = false;
        this.f36267s1 = false;
        this.f57423e2 = ((j0) qp.s1(this.f28613a).f24935x7.H.f13555b).f23439c;
        g0.S(getWindow());
        pj0 pj0Var = this.f36261k1;
        int i7 = this.f28646t0;
        pj0Var.setPadding(i7, 0, i7, g0.L(68.0f) + g0.f22539n);
        this.f36261k1.setClipToPadding(false);
        this.f36261k1.j(new ui(this, 27));
        this.f36261k1.setOnItemClickListener(new d(context, f6Var, this));
        fi.d dVar = new fi.d(context, f6Var, true);
        this.W1 = dVar;
        dVar.f();
        dVar.setCountFilled(true);
        dVar.setText(hd.M0(2131745947, null));
        dVar.setOnClickListener(new a(this, 0));
        k kVar = new k(this, context);
        this.X1 = kVar;
        r6.V(kVar, k6.Gi, f6Var);
        kVar.setText(hd.M0(2131745947, null));
        kVar.setTypeface(g0.o());
        kVar.setTextSize(1, 14.0f);
        kVar.setGravity(17);
        kVar.setPadding(g0.L(16.0f), 0, g0.L(16.0f), 0);
        kVar.setVisibility(8);
        ka.a(kVar);
        this.l1.q().addView(kVar, ha.t(-2, 48, 16, 12, 0, 12, 0));
        kVar.setOnClickListener(new a(this, 1));
        r00 r00Var = new r00(context, f6Var);
        String M0 = hd.M0(2131747126, null);
        i iVar = r00Var.f37441r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new org.telegram.ui.Wallet.na(this, 3));
        v00 v00Var = new v00(context, this.f28613a);
        this.Z1 = v00Var;
        v00Var.setDelegate(new b(this));
        m5 m5Var = new m5(context, f6Var, this);
        this.Y1 = m5Var;
        int i10 = this.f28646t0;
        m5Var.setPadding(i10, 0, i10, 0);
        m5Var.addView(r00Var, ha.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        m5Var.addView(v00Var, ha.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        x3 x3Var = new x3(18, context, f6Var);
        this.f57420a2 = x3Var;
        x3Var.setTranslationY(g0.L(48.0f));
        x3Var.b(hd.M0(2131745811, null), hd.M0(2131751458, null), new a(this, 2));
        m5Var.addView(x3Var, ha.e(-1, 32, 48));
        this.f28616b.addView(m5Var, ha.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(g0.L(10.0f) + this.f28646t0, g0.L(10.0f), g0.L(10.0f) + this.f28646t0, g0.L(10.0f) + g0.f22539n);
        frameLayout.addView(dVar, ha.c(48.0f, -1));
        this.f28616b.addView(frameLayout, ha.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f57424f2 = frameLayout2;
        frameLayout2.setTranslationY((-g0.f22539n) - g0.L(68.0f));
        this.f28616b.addView(frameLayout2, ha.e(-1, 150, 80));
        v4.k kVar2 = new v4.k();
        kVar2.n(350L);
        kVar2.o(xqVar);
        kVar2.C = false;
        kVar2.f56978m = false;
        this.f36261k1.setItemAnimator(kVar2);
        this.f36261k1.i(new e(this, f6Var));
        ii.c cVar = new ii.c(this, 26);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(p10.f24467s0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (hd.E0().B != null) {
            country = hd.E0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new bi.j0(cVar, 24));
        a0.i(this.f28619c, new b(this));
    }

    public static void d1(g gVar, Pair pair) {
        HashMap hashMap = gVar.f57421b2;
        HashMap hashMap2 = gVar.R1;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = gVar.S1;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new c(gVar, 0));
        HashSet hashSet = gVar.f57425g2;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        for (TLRPC.TL_help_country tL_help_country : (List) hashMap2.get((String) obj)) {
                            if (TextUtils.equals(str, tL_help_country.iso2)) {
                                break;
                            }
                        }
                    } else {
                        tL_help_country = null;
                        break;
                    }
                }
                if (tL_help_country != null) {
                    c20 c20Var = new c20(gVar.getContext(), tL_help_country);
                    c20Var.setOnClickListener(new a(gVar, 3));
                    gVar.Z1.a(c20Var);
                    hashMap.put(tL_help_country.iso2, c20Var);
                }
            }
        }
        gVar.V1.O(true);
        gVar.W1.c(hashMap.size(), true);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(pj0Var, getContext(), this.f28613a, 0, true, new u1(this, 22), this.I0);
        this.V1 = l41Var;
        l41Var.f35510r = false;
        return l41Var;
    }

    @Override
    public final CharSequence O0() {
        return hd.M0(2131753288, null);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 3) {
            e1();
            this.f57420a2.setTranslationY(g0.L(48.0f) + f10);
            this.Y1.invalidate();
        } else if (i7 == 4) {
            p00.d(this.X1, f10);
        }
    }

    @Override
    public final void e0() {
        e1();
        f1();
    }

    public final void e1() {
        boolean z9;
        int L = g0.L(56.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.f22538m + ((int) this.P1.f55400f);
        int measuredHeight = (this.f28616b.getMeasuredHeight() - g0.f22539n) - g0.L(34.0f);
        Rect rect = this.f57426h2;
        if (rect.top == L && rect.bottom == measuredHeight) {
            z9 = false;
        } else {
            z9 = true;
        }
        rect.set(0, L, this.f28616b.getMeasuredWidth(), measuredHeight);
        pj0 pj0Var = this.f36261k1;
        pj0Var.setClipBounds(rect);
        if (z9) {
            pj0Var.invalidate();
        }
    }

    public final void f1() {
        pj0 pj0Var;
        float f10 = g0.f22544q.y;
        int i7 = 0;
        while (true) {
            pj0Var = this.f36261k1;
            if (i7 >= pj0Var.getChildCount()) {
                break;
            }
            View childAt = pj0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.f22538m, f10 + g0.L(8.0f));
        m5 m5Var = this.Y1;
        if (m5Var.getTranslationY() != max) {
            m5Var.setTranslationY(max);
            pj0Var.invalidate();
        }
    }

    public final void g1(View view) {
        c20 c20Var = (c20) view;
        if (c20Var.D) {
            this.f57427i2 = null;
            this.Z1.c(c20Var);
            String countryIso2 = c20Var.getCountryIso2();
            HashMap hashMap = this.f57421b2;
            hashMap.remove(countryIso2);
            this.W1.c(hashMap.size(), true);
            this.V1.O(true);
            return;
        }
        c20 c20Var2 = this.f57427i2;
        if (c20Var2 != null) {
            c20Var2.a();
        }
        this.f57427i2 = c20Var;
        c20Var.b();
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
