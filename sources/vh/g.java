package vh;

import ah.i;
import ai.e1;
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
import org.telegram.messenger.gd;
import org.telegram.messenger.j0;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Wallet.i9;
import r0.a0;
import ug.j1;
import ug.z;
import v4.k;
public final class g extends sa implements te.b {
    public static final int f59564n2 = 0;
    public final te.c T1;
    public final te.a U1;
    public final HashMap V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public String Y1;
    public z41 Z1;
    public final hi.d f59565a2;
    public final j f59566b2;
    public final n4 f59567c2;
    public final g10 d2;
    public final y3 f59568e2;
    public final HashMap f59569f2;
    public hn f59570g2;
    public int f59571h2;
    public final int f59572i2;
    public final FrameLayout f59573j2;
    public HashSet f59574k2;
    public final Rect f59575l2;
    public m20 f59576m2;

    public g(Context context, i6 i6Var) {
        super(context, i6Var, true);
        String country;
        lr lrVar = lr.h;
        this.T1 = new te.c(3, this, lrVar, 350L);
        this.U1 = new te.a(4, this, lrVar, 320L, false);
        this.V1 = new HashMap();
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.f59569f2 = new HashMap();
        this.f59575l2 = new Rect();
        this.f30229x = true;
        this.f30215n = false;
        this.G1 = false;
        this.f39542w1 = false;
        this.f59572i2 = ((j0) mp.u1(this.f30187a).A7.M.f15536b).f24764c;
        g0.S(getWindow());
        ck0 ck0Var = this.f39534o1;
        int i7 = this.f30225u0;
        ck0Var.setPadding(i7, 0, i7, g0.L(68.0f) + g0.f24113n);
        this.f39534o1.setClipToPadding(false);
        this.f39534o1.j(new j1(this, 1));
        this.f39534o1.setOnItemClickListener(new d(context, i6Var, this));
        hi.d dVar = new hi.d(context, i6Var, true);
        this.f59565a2 = dVar;
        dVar.f();
        dVar.setCountFilled(true);
        dVar.setText(gd.M0(2131745751, null));
        dVar.setOnClickListener(new a(this, 0));
        j jVar = new j(this, context);
        this.f59566b2 = jVar;
        u6.U(jVar, n6.Ji, i6Var);
        jVar.setText(gd.M0(2131745751, null));
        jVar.setTypeface(g0.o());
        jVar.setTextSize(1, 14.0f);
        jVar.setGravity(17);
        jVar.setPadding(g0.L(16.0f), 0, g0.L(16.0f), 0);
        jVar.setVisibility(8);
        ra.a(jVar);
        this.f39535p1.t().addView(jVar, ma.t(-2, 48, 16, 12, 0, 12, 0));
        jVar.setOnClickListener(new a(this, 1));
        c10 c10Var = new c10(context, i6Var);
        String M0 = gd.M0(2131746934, null);
        i iVar = c10Var.f33845r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new i9(this, 6));
        g10 g10Var = new g10(context, this.f30187a);
        this.d2 = g10Var;
        g10Var.setDelegate(new b(this));
        n4 n4Var = new n4(context, i6Var, this);
        this.f59567c2 = n4Var;
        int i10 = this.f30225u0;
        n4Var.setPadding(i10, 0, i10, 0);
        n4Var.addView(c10Var, ma.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        n4Var.addView(g10Var, ma.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        y3 y3Var = new y3(18, context, i6Var);
        this.f59568e2 = y3Var;
        y3Var.setTranslationY(g0.L(48.0f));
        y3Var.b(gd.M0(2131745615, null), gd.M0(2131751446, null), new a(this, 2));
        n4Var.addView(y3Var, ma.e(-1, 32, 48));
        this.f30190b.addView(n4Var, ma.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(g0.L(10.0f) + this.f30225u0, g0.L(10.0f), g0.L(10.0f) + this.f30225u0, g0.L(10.0f) + g0.f24113n);
        frameLayout.addView(dVar, ma.c(48.0f, -1));
        this.f30190b.addView(frameLayout, ma.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f59573j2 = frameLayout2;
        frameLayout2.setTranslationY((-g0.f24113n) - g0.L(68.0f));
        this.f30190b.addView(frameLayout2, ma.e(-1, 150, 80));
        k kVar = new k();
        kVar.n(350L);
        kVar.o(lrVar);
        kVar.C = false;
        kVar.f59152m = false;
        this.f39534o1.setItemAnimator(kVar);
        this.f39534o1.i(new e(this, i6Var));
        z zVar = new z(this, 2);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(j10.f24770t0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (gd.E0().B != null) {
            country = gd.E0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new e1(zVar, 27));
        a0.i(this.f30193c, new b(this));
    }

    public static void e1(g gVar, Pair pair) {
        HashMap hashMap = gVar.f59569f2;
        HashMap hashMap2 = gVar.V1;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = gVar.W1;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new c(gVar, 0));
        HashSet hashSet = gVar.f59574k2;
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
                    m20 m20Var = new m20(gVar.getContext(), tL_help_country);
                    m20Var.setOnClickListener(new a(gVar, 3));
                    gVar.d2.a(m20Var);
                    hashMap.put(tL_help_country.iso2, m20Var);
                }
            }
        }
        gVar.Z1.O(true);
        gVar.f59565a2.c(hashMap.size(), true);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 3) {
            f1();
            this.f59568e2.setTranslationY(g0.L(48.0f) + f10);
            this.f59567c2.invalidate();
        } else if (i7 == 4) {
            a10.d(this.f59566b2, f10);
        }
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.f30187a, 0, true, new org.telegram.ui.web.b(this, 2), this.J0);
        this.Z1 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        return gd.M0(2131753286, null);
    }

    @Override
    public final void e0() {
        f1();
        g1();
    }

    public final void f1() {
        boolean z10;
        int L = g0.L(56.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.f24112m + ((int) this.T1.f57663f);
        int measuredHeight = (this.f30190b.getMeasuredHeight() - g0.f24113n) - g0.L(34.0f);
        Rect rect = this.f59575l2;
        if (rect.top == L && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, L, this.f30190b.getMeasuredWidth(), measuredHeight);
        ck0 ck0Var = this.f39534o1;
        ck0Var.setClipBounds(rect);
        if (z10) {
            ck0Var.invalidate();
        }
    }

    public final void g1() {
        ck0 ck0Var;
        float f10 = g0.f24118q.y;
        int i7 = 0;
        while (true) {
            ck0Var = this.f39534o1;
            if (i7 >= ck0Var.getChildCount()) {
                break;
            }
            View childAt = ck0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.f24112m, f10 + g0.L(8.0f));
        n4 n4Var = this.f59567c2;
        if (n4Var.getTranslationY() != max) {
            n4Var.setTranslationY(max);
            ck0Var.invalidate();
        }
    }

    public final void h1(View view) {
        m20 m20Var = (m20) view;
        if (m20Var.E) {
            this.f59576m2 = null;
            this.d2.c(m20Var);
            String countryIso2 = m20Var.getCountryIso2();
            HashMap hashMap = this.f59569f2;
            hashMap.remove(countryIso2);
            this.f59565a2.c(hashMap.size(), true);
            this.Z1.O(true);
            return;
        }
        m20 m20Var2 = this.f59576m2;
        if (m20Var2 != null) {
            m20Var2.a();
        }
        this.f59576m2 = m20Var;
        m20Var.b();
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
