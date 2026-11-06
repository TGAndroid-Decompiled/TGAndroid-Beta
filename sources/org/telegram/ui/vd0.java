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
public final class vd0 implements RequestDelegate {
    public final int f50709a;
    public final be0 f50710b;

    public vd0(be0 be0Var, int i7) {
        this.f50709a = i7;
        this.f50710b = be0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50709a) {
            case 0:
                final be0 be0Var = this.f50710b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        ms msVar;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        be0 be0Var2 = be0Var;
                        switch (i10) {
                            case 0:
                                zd0 zd0Var = be0Var2.f44290a;
                                HashMap hashMap = be0Var2.I;
                                ArrayList arrayList = be0Var2.G;
                                HashMap hashMap2 = be0Var2.H;
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
                                                obj.f47869a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f47870b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f47869a = str2;
                                                }
                                                obj.f47871c = tL_help_countryCode.country_code;
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
                                    ce0 ce0Var = be0Var2.f44301g0;
                                    if (ce0Var.F == 2) {
                                        i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                                        String d = pf.b.d(org.telegram.messenger.p10.i(i7).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        msVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            msVar = (ms) rf.b.g(1, list2);
                                                            int size = arrayList.size();
                                                            int i14 = 0;
                                                            while (true) {
                                                                if (i14 < size) {
                                                                    Object obj2 = arrayList.get(i14);
                                                                    i14++;
                                                                    ms msVar2 = (ms) obj2;
                                                                    if (Objects.equals(msVar2.d, string)) {
                                                                        msVar = msVar2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            msVar = (ms) rf.b.g(1, list2);
                                                        }
                                                    } else {
                                                        msVar = (ms) list2.get(0);
                                                    }
                                                    if (msVar != null) {
                                                        zd0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                zd0Var.setText(d.substring(0, 1));
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
                                be0Var2.M = false;
                                ce0 ce0Var2 = be0Var2.f44301g0;
                                ce0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.v4.u0(ce0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    ce0Var2.M1(6, true, bundle, false);
                                    return;
                                }
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final be0 be0Var2 = this.f50710b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        ms msVar;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        be0 be0Var22 = be0Var2;
                        switch (i10) {
                            case 0:
                                zd0 zd0Var = be0Var22.f44290a;
                                HashMap hashMap = be0Var22.I;
                                ArrayList arrayList = be0Var22.G;
                                HashMap hashMap2 = be0Var22.H;
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
                                                obj.f47869a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f47870b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f47869a = str2;
                                                }
                                                obj.f47871c = tL_help_countryCode.country_code;
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
                                    ce0 ce0Var = be0Var22.f44301g0;
                                    if (ce0Var.F == 2) {
                                        i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                                        String d = pf.b.d(org.telegram.messenger.p10.i(i7).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        msVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            msVar = (ms) rf.b.g(1, list2);
                                                            int size = arrayList.size();
                                                            int i14 = 0;
                                                            while (true) {
                                                                if (i14 < size) {
                                                                    Object obj2 = arrayList.get(i14);
                                                                    i14++;
                                                                    ms msVar2 = (ms) obj2;
                                                                    if (Objects.equals(msVar2.d, string)) {
                                                                        msVar = msVar2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            msVar = (ms) rf.b.g(1, list2);
                                                        }
                                                    } else {
                                                        msVar = (ms) list2.get(0);
                                                    }
                                                    if (msVar != null) {
                                                        zd0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                zd0Var.setText(d.substring(0, 1));
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
                                be0Var22.M = false;
                                ce0 ce0Var2 = be0Var22.f44301g0;
                                ce0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.v4.u0(ce0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    ce0Var2.M1(6, true, bundle, false);
                                    return;
                                }
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
