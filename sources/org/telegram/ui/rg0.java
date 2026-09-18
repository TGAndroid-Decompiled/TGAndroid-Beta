package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class rg0 implements RequestDelegate {
    public final int f37229a;
    public final xg0 f37230b;

    public rg0(xg0 xg0Var, int i10) {
        this.f37229a = i10;
        this.f37230b = xg0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37229a) {
            case 0:
                final xg0 xg0Var = this.f37230b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        xt xtVar;
                        switch (r4) {
                            case 0:
                                xg0 xg0Var2 = xg0Var;
                                ck0 ck0Var = xg0Var2.f39619a;
                                HashMap hashMap = xg0Var2.G;
                                ArrayList arrayList = xg0Var2.E;
                                HashMap hashMap2 = xg0Var2.F;
                                if (tL_error == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                                    for (int i11 = 0; i11 < tL_help_countriesList.countries.size(); i11++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i11);
                                        for (int i12 = 0; i12 < tL_help_country.country_codes.size(); i12++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i12);
                                            if (tL_help_countryCode != null) {
                                                ?? obj = new Object();
                                                String str = tL_help_country.name;
                                                obj.f39700a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f39701b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f39700a = str2;
                                                }
                                                obj.f39702c = tL_help_countryCode.country_code;
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
                                    yg0 yg0Var = xg0Var2.V;
                                    if (yg0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                                        String d = gf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    xt xtVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                xtVar = (xt) org.telegram.ui.Cells.p6.g(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        xt xtVar3 = (xt) obj2;
                                                                        if (Objects.equals(xtVar3.d, string)) {
                                                                            xtVar = xtVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                xtVar = (xt) org.telegram.ui.Cells.p6.g(1, list2);
                                                            }
                                                            xtVar2 = xtVar;
                                                        } else {
                                                            xtVar2 = (xt) list2.get(0);
                                                        }
                                                    }
                                                    if (xtVar2 != null) {
                                                        ck0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ck0Var.setText(d.substring(0, 1));
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
                                xg0 xg0Var3 = xg0Var;
                                xg0Var3.K = false;
                                yg0 yg0Var2 = xg0Var3.V;
                                yg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.c5.x0(yg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    yg0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final xg0 xg0Var2 = this.f37230b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        xt xtVar;
                        switch (r4) {
                            case 0:
                                xg0 xg0Var22 = xg0Var2;
                                ck0 ck0Var = xg0Var22.f39619a;
                                HashMap hashMap = xg0Var22.G;
                                ArrayList arrayList = xg0Var22.E;
                                HashMap hashMap2 = xg0Var22.F;
                                if (tL_error == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                                    for (int i11 = 0; i11 < tL_help_countriesList.countries.size(); i11++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i11);
                                        for (int i12 = 0; i12 < tL_help_country.country_codes.size(); i12++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i12);
                                            if (tL_help_countryCode != null) {
                                                ?? obj = new Object();
                                                String str = tL_help_country.name;
                                                obj.f39700a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f39701b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f39700a = str2;
                                                }
                                                obj.f39702c = tL_help_countryCode.country_code;
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
                                    yg0 yg0Var = xg0Var22.V;
                                    if (yg0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                                        String d = gf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    xt xtVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                xtVar = (xt) org.telegram.ui.Cells.p6.g(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        xt xtVar3 = (xt) obj2;
                                                                        if (Objects.equals(xtVar3.d, string)) {
                                                                            xtVar = xtVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                xtVar = (xt) org.telegram.ui.Cells.p6.g(1, list2);
                                                            }
                                                            xtVar2 = xtVar;
                                                        } else {
                                                            xtVar2 = (xt) list2.get(0);
                                                        }
                                                    }
                                                    if (xtVar2 != null) {
                                                        ck0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                ck0Var.setText(d.substring(0, 1));
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
                                xg0 xg0Var3 = xg0Var2;
                                xg0Var3.K = false;
                                yg0 yg0Var2 = xg0Var3.V;
                                yg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.c5.x0(yg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    yg0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
