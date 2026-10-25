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
public final class yf0 implements RequestDelegate {
    public final int f46056a;
    public final fg0 f46057b;

    public yf0(fg0 fg0Var, int i10) {
        this.f46056a = i10;
        this.f46057b = fg0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f46056a) {
            case 0:
                final fg0 fg0Var = this.f46057b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        jt jtVar;
                        switch (r4) {
                            case 0:
                                fg0 fg0Var2 = fg0Var;
                                mj0 mj0Var = fg0Var2.f39358a;
                                HashMap hashMap = fg0Var2.I;
                                ArrayList arrayList = fg0Var2.G;
                                HashMap hashMap2 = fg0Var2.H;
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
                                                obj.f40740a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f40741b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f40740a = str2;
                                                }
                                                obj.f40742c = tL_help_countryCode.country_code;
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
                                    gg0 gg0Var = fg0Var2.f39359a0;
                                    if (gg0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                                        String d = kf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    jt jtVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                jtVar = (jt) org.telegram.ui.Components.b10.h(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        jt jtVar3 = (jt) obj2;
                                                                        if (Objects.equals(jtVar3.d, string)) {
                                                                            jtVar = jtVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                jtVar = (jt) org.telegram.ui.Components.b10.h(1, list2);
                                                            }
                                                            jtVar2 = jtVar;
                                                        } else {
                                                            jtVar2 = (jt) list2.get(0);
                                                        }
                                                    }
                                                    if (jtVar2 != null) {
                                                        mj0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                mj0Var.setText(d.substring(0, 1));
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
                                fg0 fg0Var3 = fg0Var;
                                fg0Var3.M = false;
                                gg0 gg0Var2 = fg0Var3.f39359a0;
                                gg0Var2.A1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(gg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    gg0Var2.z1(6, true, bundle, false);
                                    return;
                                }
                                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final fg0 fg0Var2 = this.f46057b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        jt jtVar;
                        switch (r4) {
                            case 0:
                                fg0 fg0Var22 = fg0Var2;
                                mj0 mj0Var = fg0Var22.f39358a;
                                HashMap hashMap = fg0Var22.I;
                                ArrayList arrayList = fg0Var22.G;
                                HashMap hashMap2 = fg0Var22.H;
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
                                                obj.f40740a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f40741b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f40740a = str2;
                                                }
                                                obj.f40742c = tL_help_countryCode.country_code;
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
                                    gg0 gg0Var = fg0Var22.f39359a0;
                                    if (gg0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                                        String d = kf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    jt jtVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                jtVar = (jt) org.telegram.ui.Components.b10.h(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        jt jtVar3 = (jt) obj2;
                                                                        if (Objects.equals(jtVar3.d, string)) {
                                                                            jtVar = jtVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                jtVar = (jt) org.telegram.ui.Components.b10.h(1, list2);
                                                            }
                                                            jtVar2 = jtVar;
                                                        } else {
                                                            jtVar2 = (jt) list2.get(0);
                                                        }
                                                    }
                                                    if (jtVar2 != null) {
                                                        mj0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                mj0Var.setText(d.substring(0, 1));
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
                                fg0 fg0Var3 = fg0Var2;
                                fg0Var3.M = false;
                                gg0 gg0Var2 = fg0Var3.f39359a0;
                                gg0Var2.A1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(gg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    gg0Var2.z1(6, true, bundle, false);
                                    return;
                                }
                                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
