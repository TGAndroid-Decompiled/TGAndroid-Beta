package org.telegram.ui.web;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import hi.c5;
import hi.p5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.l41;
import org.telegram.ui.qv0;
public final class b implements s10 {
    public final int f52579a;
    public final Object f52580b;

    public b(Object obj, int i7) {
        this.f52579a = i7;
        this.f52580b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7 = this.f52579a;
        Object obj3 = this.f52580b;
        switch (i7) {
            case 0:
                final k kVar = (k) obj3;
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                i iVar = kVar.E;
                ArrayList arrayList2 = kVar.f52693y;
                if (!kVar.f52684b && arrayList2.isEmpty()) {
                    arrayList.add(b41.k(kVar.d));
                }
                SharedPreferences sharedPreferences = kVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList3 = new ArrayList();
                String string = sharedPreferences.getString("queries_json", null);
                if (string != null) {
                    try {
                        ArrayList arrayList4 = new ArrayList();
                        int i10 = 0;
                        for (JSONArray jSONArray = new JSONArray(string); i10 < jSONArray.length(); jSONArray = jSONArray) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            j jVar = new j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                            jVar.f52643c = jSONObject.optDouble("rank", 0.0d);
                            arrayList4.add(jVar);
                            i10++;
                        }
                        Collections.sort(arrayList4, new qv0(8));
                        int size = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj4 = arrayList4.get(i11);
                            i11++;
                            j jVar2 = (j) obj4;
                            if (arrayList3.size() < 20) {
                                arrayList3.add(jVar2.f52641a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList2.size();
                arrayList3.size();
                if (!arrayList2.isEmpty()) {
                    arrayList.add(b41.k(kVar.f52691w));
                }
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    final String str = (String) arrayList2.get(i12);
                    if (i12 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i12 == arrayList2.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.q qVar = kVar.N;
                                    if (qVar != null) {
                                        qVar.a(str);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.q qVar2 = kVar.N;
                                    if (qVar2 != null) {
                                        qVar2.a(str);
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                    int i13 = d.f52587b;
                    b41 K = b41.K(d.class);
                    K.f33197z = 1;
                    K.f33184l = str;
                    K.D = onClickListener;
                    K.f33189q = z12;
                    K.f33190r = z13;
                    K.G = Boolean.TRUE;
                    K.H = kVar;
                    arrayList.add(K);
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(b41.s(hd.M0(2131742912, null), hd.M0(2131742916, null), new p5(kVar, 26)));
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        final String str2 = (String) arrayList3.get(i14);
                        if (i14 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i14 == arrayList3.size() - 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        View.OnClickListener onClickListener2 = new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                switch (r3) {
                                    case 0:
                                        org.telegram.ui.q qVar = kVar.N;
                                        if (qVar != null) {
                                            qVar.a(str2);
                                            return;
                                        }
                                        return;
                                    default:
                                        org.telegram.ui.q qVar2 = kVar.N;
                                        if (qVar2 != null) {
                                            qVar2.a(str2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        int i15 = d.f52587b;
                        b41 K2 = b41.K(d.class);
                        K2.f33197z = 0;
                        K2.f33184l = str2;
                        K2.D = onClickListener2;
                        K2.f33189q = z10;
                        K2.f33190r = z11;
                        K2.G = Boolean.TRUE;
                        K2.H = kVar;
                        arrayList.add(K2);
                    }
                }
                if (iVar != null) {
                    ArrayList arrayList5 = iVar.f52629a;
                    if (!arrayList5.isEmpty()) {
                        arrayList.add(b41.r(hd.M0(2131742913, null)));
                        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                            gj gjVar = (gj) arrayList5.get(i16);
                            if (!TextUtils.isEmpty(k.a(gjVar))) {
                                int i17 = g.f52611b;
                                b41 K3 = b41.K(g.class);
                                K3.f33197z = 3;
                                K3.f33189q = true;
                                K3.H = gjVar;
                                arrayList.add(K3);
                            }
                        }
                        if (!iVar.f52633f) {
                            arrayList.add(b41.q(arrayList.size(), 32));
                            arrayList.add(b41.q(arrayList.size(), 32));
                            arrayList.add(b41.q(arrayList.size(), 32));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c5 c5Var = (c5) obj3;
                c5Var.f57580z0 = ((Integer) obj).intValue();
                c5Var.A0 = ((Integer) obj2).intValue();
                org.telegram.messenger.g0.i3(new q2.d(c5Var, 16), 60L);
                return;
            case 2:
                vh.h hVar = (vh.h) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                p41 p41Var2 = (p41) obj2;
                ArrayList arrayList7 = hVar.W1;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int L = org.telegram.messenger.g0.L(13.0f) + ((org.telegram.messenger.g0.f23611q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(68.0f));
                    int L2 = org.telegram.messenger.g0.L(88.0f) + hVar.f59005h2;
                    arrayList6.add(b41.E(0, L2));
                    int i18 = L - L2;
                    int size2 = arrayList7.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        Object obj5 = arrayList7.get(i19);
                        i19++;
                        for (TLRPC.TL_help_country tL_help_country : (List) hVar.V1.get((String) obj5)) {
                            if (TextUtils.isEmpty(hVar.Y1) || wg.u0.g1(tL_help_country, org.telegram.messenger.g0.N3(hVar.Y1).toLowerCase())) {
                                i18 -= org.telegram.messenger.g0.L(44.0f);
                                boolean containsKey = hVar.f59003f2.containsKey(tL_help_country.iso2);
                                int i20 = vh.g.f58997b;
                                b41 K4 = b41.K(vh.g.class);
                                K4.f33184l = tL_help_country.iso2;
                                K4.G = tL_help_country;
                                K4.f33178e = containsKey;
                                arrayList6.add(K4);
                            }
                        }
                    }
                    arrayList6.add(b41.E(1, Math.max(0, i18)));
                    return;
                }
                return;
            case 3:
                ArrayList arrayList8 = (ArrayList) obj;
                p41 p41Var3 = (p41) obj2;
                l41 l41Var = ((vh.i) obj3).U1;
                if (l41Var != null) {
                    arrayList8.add(b41.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList8.add(b41.h(0, 0, l41Var));
                    return;
                }
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((li.v) obj3).a((TL_stats.TL_statsPollStats) obj);
                return;
        }
    }
}
