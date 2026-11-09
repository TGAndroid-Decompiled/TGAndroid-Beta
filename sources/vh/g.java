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
import org.telegram.messenger.id;
import org.telegram.messenger.j0;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.la;
import r0.a0;
public final class g extends na implements te.b {
    public static final int f57524j2 = 0;
    public final te.c P1;
    public final te.a Q1;
    public final HashMap R1;
    public final ArrayList S1;
    public final ArrayList T1;
    public String U1;
    public m41 V1;
    public final fi.d W1;
    public final k X1;
    public final m5 Y1;
    public final w00 Z1;
    public final x3 f57525a2;
    public final HashMap f57526b2;
    public gf.g f57527c2;
    public int d2;
    public final int f57528e2;
    public final FrameLayout f57529f2;
    public HashSet f57530g2;
    public final Rect f57531h2;
    public d20 f57532i2;

    public g(Context context, g6 g6Var) {
        super(context, g6Var, true);
        String country;
        xq xqVar = xq.h;
        this.P1 = new te.c(3, this, xqVar, 350L);
        this.Q1 = new te.a(4, this, xqVar, 320L, false);
        this.R1 = new HashMap();
        this.S1 = new ArrayList();
        this.T1 = new ArrayList();
        this.f57526b2 = new HashMap();
        this.f57531h2 = new Rect();
        this.f28659x = true;
        this.f28645n = false;
        this.C1 = false;
        this.f36309s1 = false;
        this.f57528e2 = ((j0) qp.s1(this.f28621a).f24942x7.H.f13555b).f23460c;
        g0.S(getWindow());
        qj0 qj0Var = this.f36303k1;
        int i7 = this.f28654t0;
        qj0Var.setPadding(i7, 0, i7, g0.L(68.0f) + g0.f22558n);
        this.f36303k1.setClipToPadding(false);
        this.f36303k1.j(new ui(this, 27));
        this.f36303k1.setOnItemClickListener(new d(context, g6Var, this));
        fi.d dVar = new fi.d(context, g6Var, true);
        this.W1 = dVar;
        dVar.f();
        dVar.setCountFilled(true);
        dVar.setText(id.M0(2131745946, null));
        dVar.setOnClickListener(new a(this, 0));
        k kVar = new k(this, context);
        this.X1 = kVar;
        s6.U(kVar, l6.Gi, g6Var);
        kVar.setText(id.M0(2131745946, null));
        kVar.setTypeface(g0.o());
        kVar.setTextSize(1, 14.0f);
        kVar.setGravity(17);
        kVar.setPadding(g0.L(16.0f), 0, g0.L(16.0f), 0);
        kVar.setVisibility(8);
        ka.a(kVar);
        this.l1.r().addView(kVar, ha.t(-2, 48, 16, 12, 0, 12, 0));
        kVar.setOnClickListener(new a(this, 1));
        s00 s00Var = new s00(context, g6Var);
        String M0 = id.M0(2131747127, null);
        i iVar = s00Var.f37857r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new la(this, 3));
        w00 w00Var = new w00(context, this.f28621a);
        this.Z1 = w00Var;
        w00Var.setDelegate(new b(this));
        m5 m5Var = new m5(context, g6Var, this);
        this.Y1 = m5Var;
        int i10 = this.f28654t0;
        m5Var.setPadding(i10, 0, i10, 0);
        m5Var.addView(s00Var, ha.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        m5Var.addView(w00Var, ha.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        x3 x3Var = new x3(18, context, g6Var);
        this.f57525a2 = x3Var;
        x3Var.setTranslationY(g0.L(48.0f));
        x3Var.b(id.M0(2131745810, null), id.M0(2131751457, null), new a(this, 2));
        m5Var.addView(x3Var, ha.e(-1, 32, 48));
        this.f28624b.addView(m5Var, ha.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(g0.L(10.0f) + this.f28654t0, g0.L(10.0f), g0.L(10.0f) + this.f28654t0, g0.L(10.0f) + g0.f22558n);
        frameLayout.addView(dVar, ha.c(48.0f, -1));
        this.f28624b.addView(frameLayout, ha.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f57529f2 = frameLayout2;
        frameLayout2.setTranslationY((-g0.f22558n) - g0.L(68.0f));
        this.f28624b.addView(frameLayout2, ha.e(-1, 150, 80));
        v4.k kVar2 = new v4.k();
        kVar2.n(350L);
        kVar2.o(xqVar);
        kVar2.C = false;
        kVar2.f57083m = false;
        this.f36303k1.setItemAnimator(kVar2);
        this.f36303k1.i(new e(this, g6Var));
        ii.c cVar = new ii.c(this, 26);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(p10.f24470s0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (id.E0().B != null) {
            country = id.E0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new bi.j0(cVar, 24));
        a0.i(this.f28627c, new b(this));
    }

    public static void d1(g gVar, Pair pair) {
        HashMap hashMap = gVar.f57526b2;
        HashMap hashMap2 = gVar.R1;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = gVar.S1;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new c(gVar, 0));
        HashSet hashSet = gVar.f57530g2;
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
                    d20 d20Var = new d20(gVar.getContext(), tL_help_country);
                    d20Var.setOnClickListener(new a(gVar, 3));
                    gVar.Z1.a(d20Var);
                    hashMap.put(tL_help_country.iso2, d20Var);
                }
            }
        }
        gVar.V1.O(true);
        gVar.W1.c(hashMap.size(), true);
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(qj0Var, getContext(), this.f28621a, 0, true, new u1(this, 22), this.I0);
        this.V1 = m41Var;
        m41Var.f35945r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return id.M0(2131753288, null);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 3) {
            e1();
            this.f57525a2.setTranslationY(g0.L(48.0f) + f10);
            this.Y1.invalidate();
        } else if (i7 == 4) {
            q00.d(this.X1, f10);
        }
    }

    @Override
    public final void e0() {
        e1();
        f1();
    }

    public final void e1() {
        boolean z9;
        int L = g0.L(56.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.f22557m + ((int) this.P1.f55505f);
        int measuredHeight = (this.f28624b.getMeasuredHeight() - g0.f22558n) - g0.L(34.0f);
        Rect rect = this.f57531h2;
        if (rect.top == L && rect.bottom == measuredHeight) {
            z9 = false;
        } else {
            z9 = true;
        }
        rect.set(0, L, this.f28624b.getMeasuredWidth(), measuredHeight);
        qj0 qj0Var = this.f36303k1;
        qj0Var.setClipBounds(rect);
        if (z9) {
            qj0Var.invalidate();
        }
    }

    public final void f1() {
        qj0 qj0Var;
        float f10 = g0.f22563q.y;
        int i7 = 0;
        while (true) {
            qj0Var = this.f36303k1;
            if (i7 >= qj0Var.getChildCount()) {
                break;
            }
            View childAt = qj0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.f22557m, f10 + g0.L(8.0f));
        m5 m5Var = this.Y1;
        if (m5Var.getTranslationY() != max) {
            m5Var.setTranslationY(max);
            qj0Var.invalidate();
        }
    }

    public final void g1(View view) {
        d20 d20Var = (d20) view;
        if (d20Var.D) {
            this.f57532i2 = null;
            this.Z1.c(d20Var);
            String countryIso2 = d20Var.getCountryIso2();
            HashMap hashMap = this.f57526b2;
            hashMap.remove(countryIso2);
            this.W1.c(hashMap.size(), true);
            this.V1.O(true);
            return;
        }
        d20 d20Var2 = this.f57532i2;
        if (d20Var2 != null) {
            d20Var2.a();
        }
        this.f57532i2 = d20Var;
        d20Var.b();
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
