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
public final class rd0 implements RequestDelegate {
    public final int f49204a;
    public final wd0 f49205b;

    public rd0(wd0 wd0Var, int i3) {
        this.f49204a = i3;
        this.f49205b = wd0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f49204a) {
            case 0:
                final wd0 wd0Var = this.f49205b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3;
                        ks ksVar;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        wd0 wd0Var2 = wd0Var;
                        switch (i10) {
                            case 0:
                                ud0 ud0Var = wd0Var2.f50782a;
                                HashMap hashMap = wd0Var2.J;
                                ArrayList arrayList = wd0Var2.H;
                                HashMap hashMap2 = wd0Var2.I;
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
                                                obj.f47004a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f47005b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f47004a = str2;
                                                }
                                                obj.f47006c = tL_help_countryCode.country_code;
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
                                    xd0 xd0Var = wd0Var2.f50785b0;
                                    if (xd0Var.G == 2) {
                                        i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                        String d = mf.b.d(org.telegram.messenger.h10.i(i3).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        ksVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.hp.e1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            ksVar = (ks) t4.c.d(1, list2);
                                                            int size = arrayList.size();
                                                            int i14 = 0;
                                                            while (true) {
                                                                if (i14 < size) {
                                                                    Object obj2 = arrayList.get(i14);
                                                                    i14++;
                                                                    ks ksVar2 = (ks) obj2;
                                                                    if (Objects.equals(ksVar2.d, string)) {
                                                                        ksVar = ksVar2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            ksVar = (ks) t4.c.d(1, list2);
                                                        }
                                                    } else {
                                                        ksVar = (ks) list2.get(0);
                                                    }
                                                    if (ksVar != null) {
                                                        ud0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ud0Var.setText(d.substring(0, 1));
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
                                wd0Var2.N = false;
                                xd0 xd0Var2 = wd0Var2.f50785b0;
                                xd0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.t4.w0(xd0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    xd0Var2.D1(6, true, bundle, false);
                                    return;
                                }
                                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final wd0 wd0Var2 = this.f49205b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3;
                        ks ksVar;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        wd0 wd0Var22 = wd0Var2;
                        switch (i10) {
                            case 0:
                                ud0 ud0Var = wd0Var22.f50782a;
                                HashMap hashMap = wd0Var22.J;
                                ArrayList arrayList = wd0Var22.H;
                                HashMap hashMap2 = wd0Var22.I;
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
                                                obj.f47004a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f47005b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f47004a = str2;
                                                }
                                                obj.f47006c = tL_help_countryCode.country_code;
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
                                    xd0 xd0Var = wd0Var22.f50785b0;
                                    if (xd0Var.G == 2) {
                                        i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                        String d = mf.b.d(org.telegram.messenger.h10.i(i3).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        ksVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.hp.e1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            ksVar = (ks) t4.c.d(1, list2);
                                                            int size = arrayList.size();
                                                            int i14 = 0;
                                                            while (true) {
                                                                if (i14 < size) {
                                                                    Object obj2 = arrayList.get(i14);
                                                                    i14++;
                                                                    ks ksVar2 = (ks) obj2;
                                                                    if (Objects.equals(ksVar2.d, string)) {
                                                                        ksVar = ksVar2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            ksVar = (ks) t4.c.d(1, list2);
                                                        }
                                                    } else {
                                                        ksVar = (ks) list2.get(0);
                                                    }
                                                    if (ksVar != null) {
                                                        ud0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ud0Var.setText(d.substring(0, 1));
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
                                wd0Var22.N = false;
                                xd0 xd0Var2 = wd0Var22.f50785b0;
                                xd0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.t4.w0(xd0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    xd0Var2.D1(6, true, bundle, false);
                                    return;
                                }
                                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
