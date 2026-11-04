package wh;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import b8.pf;
import ci.d0;
import ci.t4;
import fi.j;
import gi.j8;
import gi.v5;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.j0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y10;
import r0.a0;
import u4.k;
public final class h extends ma implements qe.b {
    public static final int f57769k2 = 0;
    public final qe.c Q1;
    public final qe.a R1;
    public final HashMap S1;
    public final ArrayList T1;
    public final ArrayList U1;
    public String V1;
    public f41 W1;
    public final gi.d X1;
    public final j Y1;
    public final t4 Z1;
    public final r00 f57770a2;
    public final x3 f57771b2;
    public final HashMap c2;
    public v5 f57772d2;
    public int f57773e2;
    public final int f57774f2;
    public final FrameLayout f57775g2;
    public HashSet f57776h2;
    public final Rect f57777i2;
    public y10 f57778j2;

    public h(Context context, e6 e6Var) {
        super(context, e6Var, true);
        String country;
        xq xqVar = xq.h;
        this.Q1 = new qe.c(3, this, xqVar, 350L);
        this.R1 = new qe.a(4, this, xqVar, 320L, false);
        this.S1 = new HashMap();
        this.T1 = new ArrayList();
        this.U1 = new ArrayList();
        this.c2 = new HashMap();
        this.f57777i2 = new Rect();
        this.f28622x = true;
        this.f28608n = false;
        this.D1 = false;
        this.f36109t1 = false;
        this.f57774f2 = ((j0) hp.s1(this.f28583a).f23167x7.H.f13798b).f23620c;
        g0.S(getWindow());
        tj0 tj0Var = this.f36102l1;
        int i3 = this.f28618u0;
        tj0Var.setPadding(i3, 0, i3, g0.L(68.0f) + g0.f22603n);
        this.f36102l1.setClipToPadding(false);
        this.f36102l1.j(new d(this, 0));
        this.f36102l1.setOnItemClickListener(new e(context, e6Var, this));
        gi.d dVar = new gi.d(context, e6Var, true);
        this.X1 = dVar;
        dVar.f();
        dVar.setCountFilled(true);
        dVar.setText(bd.M0(2131745956, null));
        dVar.setOnClickListener(new a(this, 0));
        j jVar = new j(this, context);
        this.Y1 = jVar;
        r6.V(jVar, k6.Gi, e6Var);
        jVar.setText(bd.M0(2131745956, null));
        jVar.setTypeface(g0.o());
        jVar.setTextSize(1, 14.0f);
        jVar.setGravity(17);
        jVar.setPadding(g0.L(16.0f), 0, g0.L(16.0f), 0);
        jVar.setVisibility(8);
        pf.a(jVar);
        this.m1.q().addView(jVar, mf.t(-2, 48, 16, 12, 0, 12, 0));
        jVar.setOnClickListener(new a(this, 1));
        n00 n00Var = new n00(context, e6Var);
        String M0 = bd.M0(2131747135, null);
        bh.g gVar = n00Var.f36302r;
        gVar.setHint(M0);
        gVar.addTextChangedListener(new org.telegram.ui.Wallet.ma(this, 3));
        r00 r00Var = new r00(context, this.f28583a);
        this.f57770a2 = r00Var;
        r00Var.setDelegate(new b(this));
        t4 t4Var = new t4(context, e6Var, this);
        this.Z1 = t4Var;
        int i10 = this.f28618u0;
        t4Var.setPadding(i10, 0, i10, 0);
        t4Var.addView(n00Var, mf.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        t4Var.addView(r00Var, mf.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        x3 x3Var = new x3(18, context, e6Var);
        this.f57771b2 = x3Var;
        x3Var.setTranslationY(g0.L(48.0f));
        x3Var.b(bd.M0(2131745820, null), bd.M0(2131751458, null), new a(this, 2));
        t4Var.addView(x3Var, mf.e(-1, 32, 48));
        this.f28586b.addView(t4Var, mf.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(g0.L(10.0f) + this.f28618u0, g0.L(10.0f), g0.L(10.0f) + this.f28618u0, g0.L(10.0f) + g0.f22603n);
        frameLayout.addView(dVar, mf.c(48.0f, -1));
        this.f28586b.addView(frameLayout, mf.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f57775g2 = frameLayout2;
        frameLayout2.setTranslationY((-g0.f22603n) - g0.L(68.0f));
        this.f28586b.addView(frameLayout2, mf.e(-1, 150, 80));
        k kVar = new k();
        kVar.n(350L);
        kVar.o(xqVar);
        kVar.C = false;
        kVar.f55567m = false;
        this.f36102l1.setItemAnimator(kVar);
        this.f36102l1.i(new f(this, e6Var));
        j8 j8Var = new j8(this, 29);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(h10.f22829t0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (bd.E0().B != null) {
            country = bd.E0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new d0(j8Var, 24));
        a0.i(this.f28589c, new b(this));
    }

    public static void d1(h hVar, Pair pair) {
        HashMap hashMap = hVar.c2;
        HashMap hashMap2 = hVar.S1;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = hVar.T1;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new c(hVar, 0));
        HashSet hashSet = hVar.f57776h2;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
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
                    y10 y10Var = new y10(hVar.getContext(), tL_help_country);
                    y10Var.setOnClickListener(new a(hVar, 3));
                    hVar.f57770a2.a(y10Var);
                    hashMap.put(tL_help_country.iso2, y10Var);
                }
            }
        }
        hVar.W1.O(true);
        hVar.X1.c(hashMap.size(), true);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.f28583a, 0, true, new org.telegram.ui.web.b(this, 2), this.J0);
        this.W1 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return bd.M0(2131753288, null);
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 3) {
            e1();
            this.f57771b2.setTranslationY(g0.L(48.0f) + f10);
            this.Z1.invalidate();
        } else if (i3 == 4) {
            l00.d(this.Y1, f10);
        }
    }

    @Override
    public final void e0() {
        e1();
        f1();
    }

    public final void e1() {
        boolean z10;
        int L = g0.L(56.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.f22602m + ((int) this.Q1.f53846f);
        int measuredHeight = (this.f28586b.getMeasuredHeight() - g0.f22603n) - g0.L(34.0f);
        Rect rect = this.f57777i2;
        if (rect.top == L && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, L, this.f28586b.getMeasuredWidth(), measuredHeight);
        tj0 tj0Var = this.f36102l1;
        tj0Var.setClipBounds(rect);
        if (z10) {
            tj0Var.invalidate();
        }
    }

    public final void f1() {
        tj0 tj0Var;
        float f10 = g0.f22608q.y;
        int i3 = 0;
        while (true) {
            tj0Var = this.f36102l1;
            if (i3 >= tj0Var.getChildCount()) {
                break;
            }
            View childAt = tj0Var.getChildAt(i3);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i3++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.f22602m, f10 + g0.L(8.0f));
        t4 t4Var = this.Z1;
        if (t4Var.getTranslationY() != max) {
            t4Var.setTranslationY(max);
            tj0Var.invalidate();
        }
    }

    public final void g1(View view) {
        y10 y10Var = (y10) view;
        if (y10Var.E) {
            this.f57778j2 = null;
            this.f57770a2.c(y10Var);
            String countryIso2 = y10Var.getCountryIso2();
            HashMap hashMap = this.c2;
            hashMap.remove(countryIso2);
            this.X1.c(hashMap.size(), true);
            this.W1.O(true);
            return;
        }
        y10 y10Var2 = this.f57778j2;
        if (y10Var2 != null) {
            y10Var2.a();
        }
        this.f57778j2 = y10Var;
        y10Var.b();
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
