package vh;

import ai.e1;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.na;
import di.k4;
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
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ou;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Wallet.i9;
import r0.a0;
import ug.p1;
import v4.k;
public final class h extends ja implements te.b {
    public static final int f58998n2 = 0;
    public final te.c T1;
    public final te.a U1;
    public final HashMap V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public String Y1;
    public p41 Z1;
    public final hi.d f58999a2;
    public final j f59000b2;
    public final k4 f59001c2;
    public final z00 d2;
    public final x3 f59002e2;
    public final HashMap f59003f2;
    public ou f59004g2;
    public int f59005h2;
    public final int f59006i2;
    public final FrameLayout f59007j2;
    public HashSet f59008k2;
    public final Rect f59009l2;
    public f20 f59010m2;

    public h(Context context, e6 e6Var) {
        super(context, e6Var, true);
        String country;
        er erVar = er.h;
        this.T1 = new te.c(3, this, erVar, 350L);
        this.U1 = new te.a(4, this, erVar, 320L, false);
        this.V1 = new HashMap();
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.f59003f2 = new HashMap();
        this.f59009l2 = new Rect();
        this.f29721x = true;
        this.f29707n = false;
        this.G1 = false;
        this.f35939w1 = false;
        this.f59006i2 = ((j0) np.s1(this.f29679a).f25451y7.H.f15881b).f24498c;
        g0.S(getWindow());
        uj0 uj0Var = this.f35931o1;
        int i7 = this.f29717u0;
        uj0Var.setPadding(i7, 0, i7, g0.L(68.0f) + g0.f23606n);
        this.f35931o1.setClipToPadding(false);
        this.f35931o1.j(new d(this, 0));
        this.f35931o1.setOnItemClickListener(new e(context, e6Var, this));
        hi.d dVar = new hi.d(context, e6Var, true);
        this.f58999a2 = dVar;
        dVar.f();
        dVar.setCountFilled(true);
        dVar.setText(hd.M0(2131745946, null));
        dVar.setOnClickListener(new a(this, 0));
        j jVar = new j(this, context);
        this.f59000b2 = jVar;
        q6.U(jVar, j6.Ji, e6Var);
        jVar.setText(hd.M0(2131745946, null));
        jVar.setTypeface(g0.o());
        jVar.setTextSize(1, 14.0f);
        jVar.setGravity(17);
        jVar.setPadding(g0.L(16.0f), 0, g0.L(16.0f), 0);
        jVar.setVisibility(8);
        na.a(jVar);
        this.f35932p1.s().addView(jVar, c8.ja.t(-2, 48, 16, 12, 0, 12, 0));
        jVar.setOnClickListener(new a(this, 1));
        v00 v00Var = new v00(context, e6Var);
        String M0 = hd.M0(2131747127, null);
        ah.i iVar = v00Var.f40202r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new i9(this, 5));
        z00 z00Var = new z00(context, this.f29679a);
        this.d2 = z00Var;
        z00Var.setDelegate(new b(this));
        k4 k4Var = new k4(context, e6Var, this);
        this.f59001c2 = k4Var;
        int i10 = this.f29717u0;
        k4Var.setPadding(i10, 0, i10, 0);
        k4Var.addView(v00Var, c8.ja.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        k4Var.addView(z00Var, c8.ja.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        x3 x3Var = new x3(18, context, e6Var);
        this.f59002e2 = x3Var;
        x3Var.setTranslationY(g0.L(48.0f));
        x3Var.b(hd.M0(2131745810, null), hd.M0(2131751457, null), new a(this, 2));
        k4Var.addView(x3Var, c8.ja.e(-1, 32, 48));
        this.f29682b.addView(k4Var, c8.ja.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(g0.L(10.0f) + this.f29717u0, g0.L(10.0f), g0.L(10.0f) + this.f29717u0, g0.L(10.0f) + g0.f23606n);
        frameLayout.addView(dVar, c8.ja.c(48.0f, -1));
        this.f29682b.addView(frameLayout, c8.ja.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f59007j2 = frameLayout2;
        frameLayout2.setTranslationY((-g0.f23606n) - g0.L(68.0f));
        this.f29682b.addView(frameLayout2, c8.ja.e(-1, 150, 80));
        k kVar = new k();
        kVar.n(350L);
        kVar.o(erVar);
        kVar.C = false;
        kVar.f58564m = false;
        this.f35931o1.setItemAnimator(kVar);
        this.f35931o1.i(new f(this, e6Var));
        p1 p1Var = new p1(this, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(m10.f24940t0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (hd.E0().B != null) {
            country = hd.E0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new e1(p1Var, 25));
        a0.i(this.f29685c, new b(this));
    }

    public static void d1(h hVar, Pair pair) {
        HashMap hashMap = hVar.f59003f2;
        HashMap hashMap2 = hVar.V1;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = hVar.W1;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new c(hVar, 0));
        HashSet hashSet = hVar.f59008k2;
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
                    f20 f20Var = new f20(hVar.getContext(), tL_help_country);
                    f20Var.setOnClickListener(new a(hVar, 3));
                    hVar.d2.a(f20Var);
                    hashMap.put(tL_help_country.iso2, f20Var);
                }
            }
        }
        hVar.Z1.O(true);
        hVar.f58999a2.c(hashMap.size(), true);
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 3) {
            e1();
            this.f59002e2.setTranslationY(g0.L(48.0f) + f10);
            this.f59001c2.invalidate();
        } else if (i7 == 4) {
            t00.d(this.f59000b2, f10);
        }
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.f29679a, 0, true, new org.telegram.ui.web.b(this, 2), this.J0);
        this.Z1 = p41Var;
        p41Var.f38199r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return hd.M0(2131753288, null);
    }

    @Override
    public final void e0() {
        e1();
        f1();
    }

    public final void e1() {
        boolean z10;
        int L = g0.L(56.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.f23605m + ((int) this.T1.f57091f);
        int measuredHeight = (this.f29682b.getMeasuredHeight() - g0.f23606n) - g0.L(34.0f);
        Rect rect = this.f59009l2;
        if (rect.top == L && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, L, this.f29682b.getMeasuredWidth(), measuredHeight);
        uj0 uj0Var = this.f35931o1;
        uj0Var.setClipBounds(rect);
        if (z10) {
            uj0Var.invalidate();
        }
    }

    public final void f1() {
        uj0 uj0Var;
        float f10 = g0.f23611q.y;
        int i7 = 0;
        while (true) {
            uj0Var = this.f35931o1;
            if (i7 >= uj0Var.getChildCount()) {
                break;
            }
            View childAt = uj0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.f23605m, f10 + g0.L(8.0f));
        k4 k4Var = this.f59001c2;
        if (k4Var.getTranslationY() != max) {
            k4Var.setTranslationY(max);
            uj0Var.invalidate();
        }
    }

    public final void g1(View view) {
        f20 f20Var = (f20) view;
        if (f20Var.E) {
            this.f59010m2 = null;
            this.d2.c(f20Var);
            String countryIso2 = f20Var.getCountryIso2();
            HashMap hashMap = this.f59003f2;
            hashMap.remove(countryIso2);
            this.f58999a2.c(hashMap.size(), true);
            this.Z1.O(true);
            return;
        }
        f20 f20Var2 = this.f59010m2;
        if (f20Var2 != null) {
            f20Var2.a();
        }
        this.f59010m2 = f20Var;
        f20Var.b();
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
