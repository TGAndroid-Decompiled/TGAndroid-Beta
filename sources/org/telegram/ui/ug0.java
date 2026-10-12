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
public final class ug0 implements RequestDelegate {
    public final int f40677a;
    public final ah0 f40678b;

    public ug0(ah0 ah0Var, int i10) {
        this.f40677a = i10;
        this.f40678b = ah0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40677a) {
            case 0:
                final ah0 ah0Var = this.f40678b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        au auVar;
                        switch (r4) {
                            case 0:
                                ah0 ah0Var2 = ah0Var;
                                gk0 gk0Var = ah0Var2.f34215a;
                                HashMap hashMap = ah0Var2.G;
                                ArrayList arrayList = ah0Var2.E;
                                HashMap hashMap2 = ah0Var2.F;
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
                                                obj.f34339a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f34340b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f34339a = str2;
                                                }
                                                obj.f34341c = tL_help_countryCode.country_code;
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
                                    bh0 bh0Var = ah0Var2.V;
                                    if (bh0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
                                        String d = jf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    au auVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                auVar = (au) t8.b.g(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        au auVar3 = (au) obj2;
                                                                        if (Objects.equals(auVar3.d, string)) {
                                                                            auVar = auVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                auVar = (au) t8.b.g(1, list2);
                                                            }
                                                            auVar2 = auVar;
                                                        } else {
                                                            auVar2 = (au) list2.get(0);
                                                        }
                                                    }
                                                    if (auVar2 != null) {
                                                        gk0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                gk0Var.setText(d.substring(0, 1));
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
                                ah0 ah0Var3 = ah0Var;
                                ah0Var3.K = false;
                                bh0 bh0Var2 = ah0Var3.V;
                                bh0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(bh0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bh0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final ah0 ah0Var2 = this.f40678b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        au auVar;
                        switch (r4) {
                            case 0:
                                ah0 ah0Var22 = ah0Var2;
                                gk0 gk0Var = ah0Var22.f34215a;
                                HashMap hashMap = ah0Var22.G;
                                ArrayList arrayList = ah0Var22.E;
                                HashMap hashMap2 = ah0Var22.F;
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
                                                obj.f34339a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.f34340b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.f34339a = str2;
                                                }
                                                obj.f34341c = tL_help_countryCode.country_code;
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
                                    bh0 bh0Var = ah0Var22.V;
                                    if (bh0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
                                        String d = jf.b.d(UserConfig.getInstance(i10).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i13 = 4; i13 >= 1; i13--) {
                                                    String substring = d.substring(0, i13);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    au auVar2 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                auVar = (au) t8.b.g(1, list2);
                                                                int size = arrayList.size();
                                                                int i14 = 0;
                                                                while (true) {
                                                                    if (i14 < size) {
                                                                        Object obj2 = arrayList.get(i14);
                                                                        i14++;
                                                                        au auVar3 = (au) obj2;
                                                                        if (Objects.equals(auVar3.d, string)) {
                                                                            auVar = auVar3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                auVar = (au) t8.b.g(1, list2);
                                                            }
                                                            auVar2 = auVar;
                                                        } else {
                                                            auVar2 = (au) list2.get(0);
                                                        }
                                                    }
                                                    if (auVar2 != null) {
                                                        gk0Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                gk0Var.setText(d.substring(0, 1));
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
                                ah0 ah0Var3 = ah0Var2;
                                ah0Var3.K = false;
                                bh0 bh0Var2 = ah0Var3.V;
                                bh0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(bh0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bh0Var2.u1(6, true, bundle, false);
                                    return;
                                }
                                bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
