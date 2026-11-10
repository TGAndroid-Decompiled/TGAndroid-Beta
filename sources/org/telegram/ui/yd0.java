package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class yd0 implements RequestDelegate {
    public final int f52014a;
    public final ee0 f52015b;

    public yd0(ee0 ee0Var, int i7) {
        this.f52014a = i7;
        this.f52015b = ee0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f52014a) {
            case 0:
                final ee0 ee0Var = this.f52015b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        ps psVar;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ee0 ee0Var2 = ee0Var;
                        switch (i10) {
                            case 0:
                                ce0 ce0Var = ee0Var2.f45244a;
                                HashMap hashMap = ee0Var2.I;
                                ArrayList arrayList = ee0Var2.G;
                                HashMap hashMap2 = ee0Var2.H;
                                if (tL_error2 == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject2;
                                    for (int i11 = 0; i11 < tL_help_countriesList.countries.size(); i11++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i11);
                                        for (int i12 = 0; i12 < tL_help_country.country_codes.size(); i12++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i12);
                                            if (tL_help_countryCode != null) {
                                                ?? obj = new Object();
                                                String str = tL_help_country.name;
                                                obj.f48826a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f48827b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f48826a = str2;
                                                }
                                                obj.f48828c = tL_help_countryCode.country_code;
                                                obj.d = tL_help_country.iso2;
                                                arrayList.add(obj);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(obj);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    fe0 fe0Var = ee0Var2.f45255g0;
                                    if (fe0Var.F == 2) {
                                        i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                                        String d = pf.b.d(org.telegram.messenger.p10.i(i7).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        psVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            psVar = (ps) rf.b.g(1, list2);
                                                            int size = arrayList.size();
                                                            int i14 = 0;
                                                            while (true) {
                                                                if (i14 < size) {
                                                                    Object obj2 = arrayList.get(i14);
                                                                    i14++;
                                                                    ps psVar2 = (ps) obj2;
                                                                    if (Objects.equals(psVar2.d, string)) {
                                                                        psVar = psVar2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            psVar = (ps) rf.b.g(1, list2);
                                                        }
                                                    } else {
                                                        psVar = (ps) list2.get(0);
                                                    }
                                                    if (psVar != null) {
                                                        ce0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ce0Var.setText(d.substring(0, 1));
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ee0Var2.M = false;
                                fe0 fe0Var2 = ee0Var2.f45255g0;
                                fe0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.u4.u0(fe0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    fe0Var2.M1(6, true, bundle, false);
                                    return;
                                }
                                fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final ee0 ee0Var2 = this.f52015b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        ps psVar;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ee0 ee0Var22 = ee0Var2;
                        switch (i10) {
                            case 0:
                                ce0 ce0Var = ee0Var22.f45244a;
                                HashMap hashMap = ee0Var22.I;
                                ArrayList arrayList = ee0Var22.G;
                                HashMap hashMap2 = ee0Var22.H;
                                if (tL_error2 == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject2;
                                    for (int i11 = 0; i11 < tL_help_countriesList.countries.size(); i11++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i11);
                                        for (int i12 = 0; i12 < tL_help_country.country_codes.size(); i12++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i12);
                                            if (tL_help_countryCode != null) {
                                                ?? obj = new Object();
                                                String str = tL_help_country.name;
                                                obj.f48826a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f48827b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f48826a = str2;
                                                }
                                                obj.f48828c = tL_help_countryCode.country_code;
                                                obj.d = tL_help_country.iso2;
                                                arrayList.add(obj);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(obj);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    fe0 fe0Var = ee0Var22.f45255g0;
                                    if (fe0Var.F == 2) {
                                        i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                                        String d = pf.b.d(org.telegram.messenger.p10.i(i7).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        psVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            psVar = (ps) rf.b.g(1, list2);
                                                            int size = arrayList.size();
                                                            int i14 = 0;
                                                            while (true) {
                                                                if (i14 < size) {
                                                                    Object obj2 = arrayList.get(i14);
                                                                    i14++;
                                                                    ps psVar2 = (ps) obj2;
                                                                    if (Objects.equals(psVar2.d, string)) {
                                                                        psVar = psVar2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            psVar = (ps) rf.b.g(1, list2);
                                                        }
                                                    } else {
                                                        psVar = (ps) list2.get(0);
                                                    }
                                                    if (psVar != null) {
                                                        ce0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ce0Var.setText(d.substring(0, 1));
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ee0Var22.M = false;
                                fe0 fe0Var2 = ee0Var22.f45255g0;
                                fe0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.u4.u0(fe0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    fe0Var2.M1(6, true, bundle, false);
                                    return;
                                }
                                fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
