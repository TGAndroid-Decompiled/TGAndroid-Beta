package org.telegram.ui.web;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import hi.b5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.o41;
import org.telegram.ui.qw0;
public final class b implements q10 {
    public final int f53108a;
    public final Object f53109b;

    public b(Object obj, int i7) {
        this.f53108a = i7;
        this.f53109b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7 = this.f53108a;
        Object obj3 = this.f53109b;
        switch (i7) {
            case 0:
                final k kVar = (k) obj3;
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                i iVar = kVar.E;
                ArrayList arrayList2 = kVar.f53222y;
                if (!kVar.f53213b && arrayList2.isEmpty()) {
                    arrayList.add(l41.k(kVar.d));
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
                            jVar.f53172c = jSONObject.optDouble("rank", 0.0d);
                            arrayList4.add(jVar);
                            i10++;
                        }
                        Collections.sort(arrayList4, new qw0(7));
                        int size = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj4 = arrayList4.get(i11);
                            i11++;
                            j jVar2 = (j) obj4;
                            if (arrayList3.size() < 20) {
                                arrayList3.add(jVar2.f53170a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList2.size();
                arrayList3.size();
                if (!arrayList2.isEmpty()) {
                    arrayList.add(l41.k(kVar.f53220w));
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
                    int i13 = d.f53118b;
                    l41 K = l41.K(d.class);
                    K.A = 1;
                    K.f37018m = str;
                    K.E = onClickListener;
                    K.f37023r = z12;
                    K.f37024s = z13;
                    K.H = Boolean.TRUE;
                    K.I = kVar;
                    arrayList.add(K);
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(l41.s(gd.M0(2131742654, null), gd.M0(2131742658, null), new hi.o0(kVar, 28)));
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
                        int i15 = d.f53118b;
                        l41 K2 = l41.K(d.class);
                        K2.A = 0;
                        K2.f37018m = str2;
                        K2.E = onClickListener2;
                        K2.f37023r = z10;
                        K2.f37024s = z11;
                        K2.H = Boolean.TRUE;
                        K2.I = kVar;
                        arrayList.add(K2);
                    }
                }
                if (iVar != null) {
                    ArrayList arrayList5 = iVar.f53158a;
                    if (!arrayList5.isEmpty()) {
                        arrayList.add(l41.r(gd.M0(2131742655, null)));
                        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                            fj fjVar = (fj) arrayList5.get(i16);
                            if (!TextUtils.isEmpty(k.a(fjVar))) {
                                int i17 = g.f53140b;
                                l41 K3 = l41.K(g.class);
                                K3.A = 3;
                                K3.f37023r = true;
                                K3.I = fjVar;
                                arrayList.add(K3);
                            }
                        }
                        if (!iVar.f53162f) {
                            arrayList.add(l41.q(arrayList.size(), 32));
                            arrayList.add(l41.q(arrayList.size(), 32));
                            arrayList.add(l41.q(arrayList.size(), 32));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                b5 b5Var = (b5) obj3;
                b5Var.f58147z0 = ((Integer) obj).intValue();
                b5Var.A0 = ((Integer) obj2).intValue();
                org.telegram.messenger.g0.h3(new z0(b5Var, 19), 60L);
                return;
            case 2:
                vh.g gVar = (vh.g) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                z41 z41Var2 = (z41) obj2;
                ArrayList arrayList7 = gVar.W1;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int L = org.telegram.messenger.g0.L(13.0f) + ((org.telegram.messenger.g0.f24121q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(68.0f));
                    int L2 = org.telegram.messenger.g0.L(88.0f) + gVar.f59570h2;
                    arrayList6.add(l41.E(0, L2));
                    int i18 = L - L2;
                    int size2 = arrayList7.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        Object obj5 = arrayList7.get(i19);
                        i19++;
                        for (TLRPC.TL_help_country tL_help_country : (List) gVar.V1.get((String) obj5)) {
                            if (TextUtils.isEmpty(gVar.Y1) || wg.w0.h1(tL_help_country, org.telegram.messenger.g0.M3(gVar.Y1).toLowerCase())) {
                                i18 -= org.telegram.messenger.g0.L(44.0f);
                                boolean containsKey = gVar.f59568f2.containsKey(tL_help_country.iso2);
                                int i20 = vh.f.f59562b;
                                l41 K4 = l41.K(vh.f.class);
                                K4.f37018m = tL_help_country.iso2;
                                K4.H = tL_help_country;
                                K4.f37011e = containsKey;
                                arrayList6.add(K4);
                            }
                        }
                    }
                    arrayList6.add(l41.E(1, Math.max(0, i18)));
                    return;
                }
                return;
            case 3:
                ArrayList arrayList8 = (ArrayList) obj;
                z41 z41Var3 = (z41) obj2;
                o41 o41Var = ((vh.h) obj3).U1;
                if (o41Var != null) {
                    arrayList8.add(l41.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList8.add(l41.h(0, 0, o41Var));
                    return;
                }
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((li.d) obj3).a((TL_stats.TL_statsPollStats) obj);
                return;
        }
    }
}
