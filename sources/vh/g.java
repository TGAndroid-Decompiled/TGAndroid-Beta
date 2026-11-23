package vh;

import ah.i;
import ai.g1;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import c8.ra;
import di.n4;
import gi.j;
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
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Wallet.i9;
import r0.a0;
import ug.i1;
import ug.z;
import v4.k;
public final class g extends sa implements te.b {
    public static final int f59606n2 = 0;
    public final te.c T1;
    public final te.a U1;
    public final HashMap V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public String Y1;
    public c51 Z1;
    public final hi.e f59607a2;
    public final j f59608b2;
    public final n4 f59609c2;
    public final j10 d2;
    public final y3 f59610e2;
    public final HashMap f59611f2;
    public jn f59612g2;
    public int f59613h2;
    public final int f59614i2;
    public final FrameLayout f59615j2;
    public HashSet f59616k2;
    public final Rect f59617l2;
    public p20 f59618m2;

    public g(Context context, h6 h6Var) {
        super(context, h6Var, true);
        String country;
        nr nrVar = nr.h;
        this.T1 = new te.c(3, this, nrVar, 350L);
        this.U1 = new te.a(4, this, nrVar, 320L, false);
        this.V1 = new HashMap();
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.f59611f2 = new HashMap();
        this.f59617l2 = new Rect();
        this.f30215x = true;
        this.f30201n = false;
        this.G1 = false;
        this.f39539w1 = false;
        this.f59614i2 = ((j0) np.u1(this.f30173a).A7.M.f15508b).f24812c;
        g0.S(getWindow());
        ek0 ek0Var = this.f39531o1;
        int i7 = this.f30211u0;
        ek0Var.setPadding(i7, 0, i7, g0.L(68.0f) + g0.f24041n);
        this.f39531o1.setClipToPadding(false);
        this.f39531o1.j(new i1(this, 1));
        this.f39531o1.setOnItemClickListener(new d(context, h6Var, this));
        hi.e eVar = new hi.e(context, h6Var, true);
        this.f59607a2 = eVar;
        eVar.f();
        eVar.setCountFilled(true);
        eVar.setText(hd.N0(2131745750, null));
        eVar.setOnClickListener(new a(this, 0));
        j jVar = new j(this, context);
        this.f59608b2 = jVar;
        t6.U(jVar, m6.Ji, h6Var);
        jVar.setText(hd.N0(2131745750, null));
        jVar.setTypeface(g0.o());
        jVar.setTextSize(1, 14.0f);
        jVar.setGravity(17);
        jVar.setPadding(g0.L(16.0f), 0, g0.L(16.0f), 0);
        jVar.setVisibility(8);
        ra.a(jVar);
        this.f39532p1.s().addView(jVar, ma.t(-2, 48, 16, 12, 0, 12, 0));
        jVar.setOnClickListener(new a(this, 1));
        e10 e10Var = new e10(context, h6Var);
        String N0 = hd.N0(2131746933, null);
        i iVar = e10Var.f34642r;
        iVar.setHint(N0);
        iVar.addTextChangedListener(new i9(this, 6));
        j10 j10Var = new j10(context, this.f30173a);
        this.d2 = j10Var;
        j10Var.setDelegate(new b(this));
        n4 n4Var = new n4(context, h6Var, this);
        this.f59609c2 = n4Var;
        int i10 = this.f30211u0;
        n4Var.setPadding(i10, 0, i10, 0);
        n4Var.addView(e10Var, ma.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        n4Var.addView(j10Var, ma.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        y3 y3Var = new y3(18, context, h6Var);
        this.f59610e2 = y3Var;
        y3Var.setTranslationY(g0.L(48.0f));
        y3Var.b(hd.N0(2131745614, null), hd.N0(2131751445, null), new a(this, 2));
        n4Var.addView(y3Var, ma.e(-1, 32, 48));
        this.f30176b.addView(n4Var, ma.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(g0.L(10.0f) + this.f30211u0, g0.L(10.0f), g0.L(10.0f) + this.f30211u0, g0.L(10.0f) + g0.f24041n);
        frameLayout.addView(eVar, ma.c(48.0f, -1));
        this.f30176b.addView(frameLayout, ma.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f59615j2 = frameLayout2;
        frameLayout2.setTranslationY((-g0.f24041n) - g0.L(68.0f));
        this.f30176b.addView(frameLayout2, ma.e(-1, 150, 80));
        k kVar = new k();
        kVar.n(350L);
        kVar.o(nrVar);
        kVar.C = false;
        kVar.f59194m = false;
        this.f39531o1.setItemAnimator(kVar);
        this.f39531o1.i(new e(this, h6Var));
        z zVar = new z(this, 2);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(k10.f24968t0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (hd.E0().B != null) {
            country = hd.E0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new g1(zVar, 27));
        a0.i(this.f30179c, new b(this));
    }

    public static void e1(g gVar, Pair pair) {
        HashMap hashMap = gVar.f59611f2;
        HashMap hashMap2 = gVar.V1;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = gVar.W1;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new c(gVar, 0));
        HashSet hashSet = gVar.f59616k2;
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
                    p20 p20Var = new p20(gVar.getContext(), tL_help_country);
                    p20Var.setOnClickListener(new a(gVar, 3));
                    gVar.d2.a(p20Var);
                    hashMap.put(tL_help_country.iso2, p20Var);
                }
            }
        }
        gVar.Z1.O(true);
        gVar.f59607a2.c(hashMap.size(), true);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 3) {
            f1();
            this.f59610e2.setTranslationY(g0.L(48.0f) + f10);
            this.f59609c2.invalidate();
        } else if (i7 == 4) {
            c10.d(this.f59608b2, f10);
        }
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.f30173a, 0, true, new org.telegram.ui.web.b(this, 2), this.J0);
        this.Z1 = c51Var;
        c51Var.f34062r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        return hd.N0(2131753285, null);
    }

    @Override
    public final void e0() {
        f1();
        g1();
    }

    public final void f1() {
        boolean z10;
        int L = g0.L(56.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.f24040m + ((int) this.T1.f57706f);
        int measuredHeight = (this.f30176b.getMeasuredHeight() - g0.f24041n) - g0.L(34.0f);
        Rect rect = this.f59617l2;
        if (rect.top == L && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, L, this.f30176b.getMeasuredWidth(), measuredHeight);
        ek0 ek0Var = this.f39531o1;
        ek0Var.setClipBounds(rect);
        if (z10) {
            ek0Var.invalidate();
        }
    }

    public final void g1() {
        ek0 ek0Var;
        float f10 = g0.f24046q.y;
        int i7 = 0;
        while (true) {
            ek0Var = this.f39531o1;
            if (i7 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.f24040m, f10 + g0.L(8.0f));
        n4 n4Var = this.f59609c2;
        if (n4Var.getTranslationY() != max) {
            n4Var.setTranslationY(max);
            ek0Var.invalidate();
        }
    }

    public final void h1(View view) {
        p20 p20Var = (p20) view;
        if (p20Var.E) {
            this.f59618m2 = null;
            this.d2.c(p20Var);
            String countryIso2 = p20Var.getCountryIso2();
            HashMap hashMap = this.f59611f2;
            hashMap.remove(countryIso2);
            this.f59607a2.c(hashMap.size(), true);
            this.Z1.O(true);
            return;
        }
        p20 p20Var2 = this.f59618m2;
        if (p20Var2 != null) {
            p20Var2.a();
        }
        this.f59618m2 = p20Var;
        p20Var.b();
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
