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
public final class wd0 implements RequestDelegate {
    public final int f53047a;
    public final ce0 f53048b;

    public wd0(ce0 ce0Var, int i7) {
        this.f53047a = i7;
        this.f53048b = ce0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f53047a) {
            case 0:
                final ce0 ce0Var = this.f53048b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        ps psVar;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ce0 ce0Var2 = ce0Var;
                        switch (i10) {
                            case 0:
                                ae0 ae0Var = ce0Var2.f46516a;
                                HashMap hashMap = ce0Var2.J;
                                ArrayList arrayList = ce0Var2.H;
                                HashMap hashMap2 = ce0Var2.I;
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
                                                obj.f50902a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f50903b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f50902a = str2;
                                                }
                                                obj.f50904c = tL_help_countryCode.country_code;
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
                                    de0 de0Var = ce0Var2.f46528h0;
                                    if (de0Var.G == 2) {
                                        i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                                        String d = pf.b.d(org.telegram.messenger.k10.i(i7).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        psVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.np.g1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            psVar = (ps) p5.c.h(1, list2);
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
                                                            psVar = (ps) p5.c.h(1, list2);
                                                        }
                                                    } else {
                                                        psVar = (ps) list2.get(0);
                                                    }
                                                    if (psVar != null) {
                                                        ae0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ae0Var.setText(d.substring(0, 1));
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
                                ce0Var2.N = false;
                                de0 de0Var2 = ce0Var2.f46528h0;
                                de0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.c5.u0(de0Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743577, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    de0Var2.M1(6, true, bundle, false);
                                    return;
                                }
                                de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final ce0 ce0Var2 = this.f53048b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        ps psVar;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ce0 ce0Var22 = ce0Var2;
                        switch (i10) {
                            case 0:
                                ae0 ae0Var = ce0Var22.f46516a;
                                HashMap hashMap = ce0Var22.J;
                                ArrayList arrayList = ce0Var22.H;
                                HashMap hashMap2 = ce0Var22.I;
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
                                                obj.f50902a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f50903b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f50902a = str2;
                                                }
                                                obj.f50904c = tL_help_countryCode.country_code;
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
                                    de0 de0Var = ce0Var22.f46528h0;
                                    if (de0Var.G == 2) {
                                        i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                                        String d = pf.b.d(org.telegram.messenger.k10.i(i7).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        psVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.np.g1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            psVar = (ps) p5.c.h(1, list2);
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
                                                            psVar = (ps) p5.c.h(1, list2);
                                                        }
                                                    } else {
                                                        psVar = (ps) list2.get(0);
                                                    }
                                                    if (psVar != null) {
                                                        ae0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ae0Var.setText(d.substring(0, 1));
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
                                ce0Var22.N = false;
                                de0 de0Var2 = ce0Var22.f46528h0;
                                de0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.c5.u0(de0Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743577, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    de0Var2.M1(6, true, bundle, false);
                                    return;
                                }
                                de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
