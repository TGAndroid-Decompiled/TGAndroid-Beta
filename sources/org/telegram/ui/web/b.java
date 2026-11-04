package org.telegram.ui.web;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import gi.c5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.d41;
public final class b implements n10 {
    public final int f50812a;
    public final Object f50813b;

    public b(Object obj, int i3) {
        this.f50812a = i3;
        this.f50813b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i3 = this.f50812a;
        Object obj3 = this.f50813b;
        switch (i3) {
            case 0:
                final l lVar = (l) obj3;
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                j jVar = lVar.E;
                ArrayList arrayList2 = lVar.f50935y;
                if (!lVar.f50926b && arrayList2.isEmpty()) {
                    arrayList.add(r31.k(lVar.d));
                }
                SharedPreferences sharedPreferences = lVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList3 = new ArrayList();
                String string = sharedPreferences.getString("queries_json", null);
                if (string != null) {
                    try {
                        ArrayList arrayList4 = new ArrayList();
                        int i10 = 0;
                        for (JSONArray jSONArray = new JSONArray(string); i10 < jSONArray.length(); jSONArray = jSONArray) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            k kVar = new k(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                            kVar.f50920c = jSONObject.optDouble("rank", 0.0d);
                            arrayList4.add(kVar);
                            i10++;
                        }
                        Collections.sort(arrayList4, new d80(26));
                        int size = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj4 = arrayList4.get(i11);
                            i11++;
                            k kVar2 = (k) obj4;
                            if (arrayList3.size() < 20) {
                                arrayList3.add(kVar2.f50918a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList2.size();
                arrayList3.size();
                if (!arrayList2.isEmpty()) {
                    arrayList.add(r31.k(lVar.f50933w));
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
                                    org.telegram.ui.q qVar = lVar.N;
                                    if (qVar != null) {
                                        qVar.a(str);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.q qVar2 = lVar.N;
                                    if (qVar2 != null) {
                                        qVar2.a(str);
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                    int i13 = e.f50832b;
                    r31 K = r31.K(e.class);
                    K.f37640z = 1;
                    K.f37627l = str;
                    K.D = onClickListener;
                    K.f37632q = z12;
                    K.f37633r = z13;
                    K.G = Boolean.TRUE;
                    K.H = lVar;
                    arrayList.add(K);
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(r31.s(bd.M0(2131742922, null), bd.M0(2131742926, null), new ii.m(lVar, 24)));
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
                                        org.telegram.ui.q qVar = lVar.N;
                                        if (qVar != null) {
                                            qVar.a(str2);
                                            return;
                                        }
                                        return;
                                    default:
                                        org.telegram.ui.q qVar2 = lVar.N;
                                        if (qVar2 != null) {
                                            qVar2.a(str2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        int i15 = e.f50832b;
                        r31 K2 = r31.K(e.class);
                        K2.f37640z = 0;
                        K2.f37627l = str2;
                        K2.D = onClickListener2;
                        K2.f37632q = z10;
                        K2.f37633r = z11;
                        K2.G = Boolean.TRUE;
                        K2.H = lVar;
                        arrayList.add(K2);
                    }
                }
                if (jVar != null) {
                    ArrayList arrayList5 = jVar.f50906a;
                    if (!arrayList5.isEmpty()) {
                        arrayList.add(r31.r(bd.M0(2131742923, null)));
                        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                            zi ziVar = (zi) arrayList5.get(i16);
                            if (!TextUtils.isEmpty(l.a(ziVar))) {
                                int i17 = h.f50854b;
                                r31 K3 = r31.K(h.class);
                                K3.f37640z = 3;
                                K3.f37632q = true;
                                K3.H = ziVar;
                                arrayList.add(K3);
                            }
                        }
                        if (!jVar.f50910f) {
                            arrayList.add(r31.q(arrayList.size(), 32));
                            arrayList.add(r31.q(arrayList.size(), 32));
                            arrayList.add(r31.q(arrayList.size(), 32));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c5 c5Var = (c5) obj3;
                c5Var.f56271z0 = ((Integer) obj).intValue();
                c5Var.A0 = ((Integer) obj2).intValue();
                org.telegram.messenger.g0.i3(new r4.u(c5Var, 14), 60L);
                return;
            case 2:
                wh.h hVar = (wh.h) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                f41 f41Var2 = (f41) obj2;
                ArrayList arrayList7 = hVar.T1;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int L = org.telegram.messenger.g0.L(13.0f) + ((org.telegram.messenger.g0.f22608q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(68.0f));
                    int L2 = org.telegram.messenger.g0.L(88.0f) + hVar.f57773e2;
                    arrayList6.add(r31.E(0, L2));
                    int i18 = L - L2;
                    int size2 = arrayList7.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        Object obj5 = arrayList7.get(i19);
                        i19++;
                        for (TLRPC.TL_help_country tL_help_country : (List) hVar.S1.get((String) obj5)) {
                            if (TextUtils.isEmpty(hVar.V1) || xg.w0.g1(tL_help_country, org.telegram.messenger.g0.O3(hVar.V1).toLowerCase())) {
                                i18 -= org.telegram.messenger.g0.L(44.0f);
                                boolean containsKey = hVar.c2.containsKey(tL_help_country.iso2);
                                int i20 = wh.g.f57768b;
                                r31 K4 = r31.K(wh.g.class);
                                K4.f37627l = tL_help_country.iso2;
                                K4.G = tL_help_country;
                                K4.f37621e = containsKey;
                                arrayList6.add(K4);
                            }
                        }
                    }
                    arrayList6.add(r31.E(1, Math.max(0, i18)));
                    return;
                }
                return;
            case 3:
                ArrayList arrayList8 = (ArrayList) obj;
                f41 f41Var3 = (f41) obj2;
                d41 d41Var = ((wh.i) obj3).R1;
                if (d41Var != null) {
                    arrayList8.add(r31.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList8.add(r31.h(0, 0, d41Var));
                    return;
                }
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((mi.f) obj3).a((TL_stats.TL_statsPollStats) obj);
                return;
        }
    }
}
