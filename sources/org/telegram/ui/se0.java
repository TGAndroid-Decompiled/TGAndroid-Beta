package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class se0 implements Runnable {
    public final int f39802a;
    public final Object f39803b;
    public final Object f39804c;

    public se0(int i10, Object obj, Object obj2) {
        this.f39802a = i10;
        this.f39803b = obj;
        this.f39804c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String formatPluralString;
        boolean z10;
        boolean z11;
        TLRPC.Chat chat;
        int i16;
        int i17;
        String string;
        String formatString;
        org.telegram.ui.Components.sc Q;
        String str;
        zo0 zo0Var;
        zo0 zo0Var2;
        String str2 = "";
        switch (this.f39802a) {
            case 0:
                te0 te0Var = (te0) this.f39803b;
                String str3 = (String) this.f39804c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = te0Var.f40090n.current_algo;
                boolean z12 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z12) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                qe0 qe0Var = new qe0(te0Var, 2);
                if (z12) {
                    TL_account.Password password = te0Var.f40090n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        qe0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.m2) te0Var.f40095y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, qe0Var, 10);
                    return;
                }
                return;
            case 1:
                lf0 lf0Var = (lf0) this.f39803b;
                lf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(lf0Var.O.fragmentView.findFocus());
                lf0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f39804c), true);
                TLRPC.FileLocation fileLocation = lf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new se0(2, lf0Var, fileLocation));
                    return;
                }
                return;
            case 2:
                i11 = ((org.telegram.ui.ActionBar.m2) ((lf0) this.f39803b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f39804c);
                return;
            case 3:
                mf0 mf0Var = (mf0) this.f39803b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f39804c;
                ah0 ah0Var = mf0Var.E;
                ah0Var.k1(false, true);
                if (tL_error2 == null) {
                    if (mf0Var.f37993r != null && mf0Var.f37994s != null && mf0Var.v != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", mf0Var.f37993r);
                        bundle.putString("phoneHash", mf0Var.f37994s);
                        bundle.putString("code", mf0Var.v);
                        ah0Var.u1(5, true, bundle, false);
                        return;
                    }
                    ah0Var.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 4:
                dg0 dg0Var = (dg0) this.f39803b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f39804c);
                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f19248a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.sk.g(new StringBuilder("+"), dg0Var.f34988b, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f19248a.setOnDismissListener(new zf0(dg0Var, 0));
                alertDialog$Builder.o();
                return;
            case 5:
                dg0 dg0Var2 = (dg0) this.f39803b;
                dg0Var2.getClass();
                dg0Var2.f34993e0 = ((TLRPC.TL_error) this.f39804c).text;
                return;
            case 6:
                ((dg0) this.f39803b).f35010s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f39804c), false);
                return;
            case 7:
                Runnable runnable = (Runnable) this.f39804c;
                hs hsVar = ((dg0) this.f39803b).f34994f;
                int i18 = 0;
                while (true) {
                    ks[] ksVarArr = hsVar.f36645f;
                    if (i18 < ksVarArr.length) {
                        ksVarArr[i18].l(0.0f);
                        i18++;
                    } else {
                        runnable.run();
                        hsVar.e = false;
                        return;
                    }
                }
            case 8:
                ((v3) this.f39803b).run((String) this.f39804c);
                return;
            case 9:
                ArrayList arrayList = (ArrayList) this.f39804c;
                ah0 ah0Var2 = ((zg0) this.f39803b).V;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !ah0Var2.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    ah0Var2.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    return;
                }
                globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ah0Var2.getParentActivity());
                alertDialog$Builder2.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                String string2 = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.f19248a;
                a2Var.T = string2;
                ah0Var2.f33921n = ah0Var2.showDialog(a2Var, true, null);
                ah0Var2.f33910c0 = true;
                return;
            case 10:
                dh0.V((dh0) this.f39803b, (org.telegram.ui.ActionBar.a2) this.f39804c);
                return;
            case 11:
                di0 di0Var = (di0) this.f39803b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f39804c;
                di0Var.f35035c0 = false;
                if (tL_error3 == null) {
                    uh0 f02 = di0Var.f0();
                    di0Var.f35043j0.clear();
                    di0Var.h0(f02);
                    return;
                }
                return;
            case 12:
                di0 di0Var2 = ((th0) this.f39803b).f40117a;
                uh0 f03 = di0Var2.f0();
                di0Var2.f35042i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f39804c));
                TLRPC.ChatFull chatFull = di0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    di0Var2.getMessagesStorage().saveChatLinksCount(di0Var2.f35046n, di0Var2.d.invitesCount);
                }
                di0Var2.h0(f03);
                return;
            case 13:
                pj0 pj0Var = (pj0) this.f39803b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f39804c;
                if (pj0Var.getParentActivity() != null) {
                    Toast.makeText(pj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 14:
                hk0 hk0Var = (hk0) this.f39803b;
                hk0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f39804c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                hk0Var.getContext().startActivity(intent);
                return;
            case 15:
                TLRPC.User user = (TLRPC.User) this.f39804c;
                ((hk0) this.f39803b).dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.f19063id));
                    return;
                }
                return;
            case 16:
                ((mt) this.f39803b).run((TLRPC.User) this.f39804c);
                return;
            case 17:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f39803b, (ArrayList) this.f39804c);
                return;
            case 18:
                ((org.telegram.ui.ActionBar.e3[]) this.f39803b)[0] = null;
                ql0.f39184a = null;
                ((boolean[]) this.f39804c)[0] = true;
                return;
            case 19:
                Runnable runnable2 = (Runnable) this.f39804c;
                for (ks ksVar : ((PasscodeActivity) this.f39803b).f31879n.f36645f) {
                    ksVar.l(0.0f);
                }
                runnable2.run();
                return;
            case 20:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f39804c;
                PasscodeActivity passcodeActivity = ((ul0) this.f39803b).f40428b;
                if (passcodeActivity.f31884y == 0) {
                    i12 = R.string.PasscodeSwitchToPassword;
                } else {
                    i12 = R.string.PasscodeSwitchToPIN;
                }
                e1Var.setText(LocaleController.getString(i12));
                if (passcodeActivity.f31884y == 0) {
                    i13 = R.drawable.msg_permissions;
                } else {
                    i13 = R.drawable.msg_pin_code;
                }
                e1Var.setIcon(i13);
                passcodeActivity.n0();
                if (passcodeActivity.h0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f31881s, true, 0.1f, false);
                    return;
                }
                return;
            case 21:
                ((PasskeysActivity) this.f39803b).Y((TL_account.Passkey) this.f39804c);
                return;
            case 22:
                sn0 sn0Var = (sn0) this.f39803b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f39804c;
                int[] iArr = sn0Var.f39906x;
                int i19 = result.type;
                if (i19 == 2) {
                    if (!(sn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = sn0Var.G.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) sn0Var.G.get(i20);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    sn0Var.F = tL_secureRequiredType;
                                    sn0Var.O1();
                                } else {
                                    i20++;
                                }
                            }
                        }
                    }
                } else if (i19 == 1) {
                    if (!(sn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = sn0Var.G.size();
                        int i21 = 0;
                        while (true) {
                            if (i21 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) sn0Var.G.get(i21);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    sn0Var.F = tL_secureRequiredType2;
                                    sn0Var.O1();
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                } else if (i19 == 3) {
                    if (!(sn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = sn0Var.G.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) sn0Var.G.get(i22);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    sn0Var.F = tL_secureRequiredType3;
                                    sn0Var.O1();
                                } else {
                                    i22++;
                                }
                            }
                        }
                    }
                } else if (i19 == 4 && !(sn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = sn0Var.G.size();
                    int i23 = 0;
                    while (true) {
                        if (i23 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) sn0Var.G.get(i23);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                sn0Var.F = tL_secureRequiredType4;
                                sn0Var.O1();
                            } else {
                                i23++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    sn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    sn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    sn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    sn0Var.Y[7].setText(result.number);
                }
                int i24 = result.gender;
                if (i24 != 0) {
                    if (i24 != 1) {
                        if (i24 == 2) {
                            sn0Var.f39903w = "female";
                            sn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        sn0Var.f39903w = "male";
                        sn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str4 = result.nationality;
                    sn0Var.f39894s = str4;
                    String str5 = (String) sn0Var.Y0.get(str4);
                    if (str5 != null) {
                        sn0Var.Y[5].setText(str5);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str6 = result.issuingCountry;
                    sn0Var.v = str6;
                    String str7 = (String) sn0Var.Y0.get(str6);
                    if (str7 != null) {
                        sn0Var.Y[6].setText(str7);
                    }
                }
                int i25 = result.birthDay;
                if (i25 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    sn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i25), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i26 = result.expiryDay;
                if (i26 > 0 && (i14 = result.expiryMonth) > 0 && (i15 = result.expiryYear) > 0) {
                    iArr[0] = i15;
                    iArr[1] = i14;
                    iArr[2] = i26;
                    sn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i26), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                sn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 23:
                sn0 sn0Var2 = (sn0) this.f39803b;
                TLObject tLObject = (TLObject) this.f39804c;
                if (tLObject != null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject;
                    sn0Var2.J = password2;
                    if (!TwoStepVerificationActivity.i0(password2, false)) {
                        org.telegram.ui.Components.g5.w0(sn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.m0(sn0Var2.J);
                    sn0Var2.Q1();
                    if (sn0Var2.Z[0].getVisibility() == 0) {
                        sn0Var2.Y[0].requestFocus();
                        AndroidUtilities.showKeyboard(sn0Var2.Y[0]);
                    }
                    if (sn0Var2.N0 == 1) {
                        sn0Var2.A1(true);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                sn0 sn0Var3 = (sn0) this.f39803b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f39804c;
                if (tL_error4 == null) {
                    sn0Var3.f39869f1 = true;
                    sn0Var3.V0(true);
                    sn0Var3.finishFragment();
                    return;
                }
                sn0Var3.M1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error4.text)) {
                    org.telegram.ui.Components.g5.w0(sn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    sn0Var3.L1(LocaleController.getString(R.string.AppName), tL_error4.text);
                    return;
                }
            case 25:
                ((nn0) this.f39803b).f38428a.K = ((TLRPC.TL_error) this.f39804c).text;
                return;
            case 26:
                ((ap0) this.f39803b).D0(false);
                ((View) this.f39804c).callOnClick();
                return;
            case 27:
                ap0 ap0Var = (ap0) this.f39803b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.f39804c;
                ap0Var.H0(true, false);
                if (tL_error5 == null) {
                    if (ap0Var.getParentActivity() != null) {
                        xn0 xn0Var = ap0Var.f34016d0;
                        if (xn0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(xn0Var);
                            ap0Var.f34016d0 = null;
                        }
                        ap0Var.t0();
                        return;
                    }
                    return;
                } else if (tL_error5.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.k3 k3Var = ap0Var.S;
                    try {
                        k3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                    org.telegram.ui.Cells.k3 k3Var2 = ap0Var.S;
                    k3Var2.f21135a.setText("");
                    k3Var2.f21136b = false;
                    k3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error5.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    ap0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    ap0Var.F0(LocaleController.getString(R.string.AppName), tL_error5.text);
                    return;
                }
            case 28:
                ap0.W((ap0) this.f39803b, (TLRPC.TL_payments_validatedRequestedInfo) this.f39804c);
                return;
            default:
                ap0 ap0Var2 = (ap0) this.f39803b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f39804c;
                Context parentActivity = ap0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    ap0Var2.f34009a1 = true;
                    ap0Var2.f34022f1 = 1;
                    TLRPC.InputInvoice inputInvoice = ap0Var2.f34012b1;
                    boolean z13 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    if (z13 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z13 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z13 && (zo0Var2 = ap0Var2.Z0) != null) {
                        zo0Var2.a(1);
                    }
                    ap0Var2.t0();
                    if (z13 && (zo0Var = ap0Var2.Z0) != null) {
                        zo0Var.a(ap0Var2.f34022f1);
                    }
                    long r02 = ap0Var2.r0();
                    int i27 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i27 > 0) {
                        str2 = UserObject.getForcedFirstName(ap0Var2.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i27 < 0 && (chat = ap0Var2.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str2 = chat.title;
                    }
                    long q02 = ap0Var2.q0();
                    if (z13) {
                        if (!z10 && !z11) {
                            i16 = R.raw.stars_topup;
                        } else {
                            i16 = R.raw.stars_send;
                        }
                    } else {
                        i16 = R.raw.payment_success;
                    }
                    int i28 = i16;
                    if (!z13) {
                        string = null;
                    } else {
                        if (z11) {
                            i17 = R.string.StarsGiveawaySentPopup;
                        } else if (z10) {
                            i17 = R.string.StarsGiftSentPopup;
                        } else {
                            i17 = R.string.StarsAcquired;
                        }
                        string = LocaleController.getString(i17);
                    }
                    if (z13) {
                        if (z11) {
                            formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                        } else {
                            if (z10) {
                                str = "StarsGiftSentPopupInfo";
                            } else {
                                str = "StarsAcquiredInfo";
                            }
                            formatString = LocaleController.formatPluralStringComma(str, (int) q02, str2);
                        }
                    } else {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, ap0Var2.R0[0], ap0Var2.f34033q0);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(U2);
                        if (i27 != 0 && string != null && !z11) {
                            Q = a02.K(i28, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new bo0(r02, 0));
                        } else {
                            String str8 = string;
                            if (str8 != null) {
                                Q = a02.M(str8, replaceTags, i28);
                            } else {
                                Q = a02.Q(i28, 36, replaceTags);
                            }
                        }
                        org.telegram.ui.Components.sc scVar = Q;
                        scVar.f28813r = false;
                        scVar.f28805j = 5000;
                        if (messageArr[0] != null) {
                            bi.y4 y4Var = new bi.y4(ap0Var2, scVar, z10, messageArr, 3);
                            org.telegram.ui.Components.wb wbVar = scVar.e;
                            if (wbVar != null) {
                                wbVar.setOnClickListener(y4Var);
                            }
                        }
                        scVar.k(z11);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
