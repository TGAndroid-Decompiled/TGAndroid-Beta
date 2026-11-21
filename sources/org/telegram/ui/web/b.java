package org.telegram.ui.web;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import hi.a5;
import hi.o4;
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
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.qw0;
public final class b implements q10 {
    public final int f53102a;
    public final Object f53103b;

    public b(Object obj, int i7) {
        this.f53102a = i7;
        this.f53103b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7 = this.f53102a;
        Object obj3 = this.f53103b;
        switch (i7) {
            case 0:
                final k kVar = (k) obj3;
                ArrayList arrayList = (ArrayList) obj;
                c51 c51Var = (c51) obj2;
                i iVar = kVar.E;
                ArrayList arrayList2 = kVar.f53216y;
                if (!kVar.f53207b && arrayList2.isEmpty()) {
                    arrayList.add(o41.k(kVar.d));
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
                            jVar.f53166c = jSONObject.optDouble("rank", 0.0d);
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
                                arrayList3.add(jVar2.f53164a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList2.size();
                arrayList3.size();
                if (!arrayList2.isEmpty()) {
                    arrayList.add(o41.k(kVar.f53214w));
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
                    int i13 = d.f53112b;
                    o41 K = o41.K(d.class);
                    K.A = 1;
                    K.f38098m = str;
                    K.E = onClickListener;
                    K.f38103r = z12;
                    K.f38104s = z13;
                    K.H = Boolean.TRUE;
                    K.I = kVar;
                    arrayList.add(K);
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(o41.s(gd.N0(2131742648, null), gd.N0(2131742652, null), new o4(kVar, 27)));
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
                        int i15 = d.f53112b;
                        o41 K2 = o41.K(d.class);
                        K2.A = 0;
                        K2.f38098m = str2;
                        K2.E = onClickListener2;
                        K2.f38103r = z10;
                        K2.f38104s = z11;
                        K2.H = Boolean.TRUE;
                        K2.I = kVar;
                        arrayList.add(K2);
                    }
                }
                if (iVar != null) {
                    ArrayList arrayList5 = iVar.f53152a;
                    if (!arrayList5.isEmpty()) {
                        arrayList.add(o41.r(gd.N0(2131742649, null)));
                        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                            fj fjVar = (fj) arrayList5.get(i16);
                            if (!TextUtils.isEmpty(k.a(fjVar))) {
                                int i17 = g.f53134b;
                                o41 K3 = o41.K(g.class);
                                K3.A = 3;
                                K3.f38103r = true;
                                K3.I = fjVar;
                                arrayList.add(K3);
                            }
                        }
                        if (!iVar.f53156f) {
                            arrayList.add(o41.q(arrayList.size(), 32));
                            arrayList.add(o41.q(arrayList.size(), 32));
                            arrayList.add(o41.q(arrayList.size(), 32));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                a5 a5Var = (a5) obj3;
                a5Var.f58204z0 = ((Integer) obj).intValue();
                a5Var.A0 = ((Integer) obj2).intValue();
                org.telegram.messenger.g0.h3(new z0(a5Var, 19), 60L);
                return;
            case 2:
                vh.g gVar = (vh.g) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                c51 c51Var2 = (c51) obj2;
                ArrayList arrayList7 = gVar.W1;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int L = org.telegram.messenger.g0.L(13.0f) + ((org.telegram.messenger.g0.f24146q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(68.0f));
                    int L2 = org.telegram.messenger.g0.L(88.0f) + gVar.f59609h2;
                    arrayList6.add(o41.E(0, L2));
                    int i18 = L - L2;
                    int size2 = arrayList7.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        Object obj5 = arrayList7.get(i19);
                        i19++;
                        for (TLRPC.TL_help_country tL_help_country : (List) gVar.V1.get((String) obj5)) {
                            if (TextUtils.isEmpty(gVar.Y1) || wg.w0.h1(tL_help_country, org.telegram.messenger.g0.M3(gVar.Y1).toLowerCase())) {
                                i18 -= org.telegram.messenger.g0.L(44.0f);
                                boolean containsKey = gVar.f59607f2.containsKey(tL_help_country.iso2);
                                int i20 = vh.f.f59601b;
                                o41 K4 = o41.K(vh.f.class);
                                K4.f38098m = tL_help_country.iso2;
                                K4.H = tL_help_country;
                                K4.f38091e = containsKey;
                                arrayList6.add(K4);
                            }
                        }
                    }
                    arrayList6.add(o41.E(1, Math.max(0, i18)));
                    return;
                }
                return;
            case 3:
                ArrayList arrayList8 = (ArrayList) obj;
                c51 c51Var3 = (c51) obj2;
                org.telegram.ui.o41 o41Var = ((vh.h) obj3).U1;
                if (o41Var != null) {
                    arrayList8.add(o41.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList8.add(o41.h(0, 0, o41Var));
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
