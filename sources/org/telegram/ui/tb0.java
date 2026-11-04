package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tb0 implements Runnable {
    public final int f49765a;
    public final Object f49766b;
    public final Object f49767c;

    public tb0(int i3, Object obj, Object obj2) {
        this.f49765a = i3;
        this.f49766b = obj;
        this.f49767c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String G;
        switch (this.f49765a) {
            case 0:
                vb0 vb0Var = (vb0) this.f49766b;
                xd0 xd0Var = vb0Var.E;
                xd0Var.t1(false, false);
                org.telegram.messenger.g0.v1(vb0Var.f50441a);
                xd0Var.x1((TLRPC.TL_auth_authorization) ((TLObject) this.f49767c), false);
                return;
            case 1:
                vb0 vb0Var2 = (vb0) this.f49766b;
                String str = (String) this.f49767c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = vb0Var2.f50446n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = org.telegram.messenger.hv.c(org.telegram.messenger.g0.h1(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                sb0 sb0Var = new sb0(vb0Var2, 2);
                if (z10) {
                    TL_account.Password password = vb0Var2.f50446n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.hv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        sb0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = d;
                    i3 = ((org.telegram.ui.ActionBar.d2) vb0Var2.E).currentAccount;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_auth_checkPassword, sb0Var, 10);
                    return;
                }
                return;
            case 2:
                nc0 nc0Var = (nc0) this.f49766b;
                nc0Var.P.t1(false, false);
                org.telegram.messenger.g0.v1(nc0Var.P.fragmentView.findFocus());
                nc0Var.P.x1((TLRPC.TL_auth_authorization) ((TLObject) this.f49767c), true);
                TLRPC.FileLocation fileLocation = nc0Var.O;
                if (fileLocation != null) {
                    Utilities.f21388f.c(new tb0(3, nc0Var, fileLocation));
                    return;
                }
                return;
            case 3:
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.f49767c;
                i10 = ((org.telegram.ui.ActionBar.d2) ((nc0) this.f49766b).P).currentAccount;
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i10);
                if (fileLocation2 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(org.telegram.messenger.w7.z(4));
                    sb2.append("/");
                    sb2.append(fileLocation2.volume_id);
                    sb2.append("_");
                    s12.O2 = a1.g.o(fileLocation2.local_id, ".jpg", sb2);
                    s12.getFileLoader().i0(false, 16777216, s12.O2, true);
                    return;
                }
                return;
            case 4:
                oc0 oc0Var = (oc0) this.f49766b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f49767c;
                xd0 xd0Var2 = oc0Var.H;
                xd0Var2.t1(false, true);
                if (tL_error2 == null) {
                    if (oc0Var.f48263r != null && oc0Var.f48264s != null && oc0Var.f48265w != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", oc0Var.f48263r);
                        bundle.putString("phoneHash", oc0Var.f48264s);
                        bundle.putString("code", oc0Var.f48265w);
                        xd0Var2.D1(5, true, bundle, false);
                        return;
                    }
                    xd0Var2.D1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131746125, "ResetAccountCancelledAlert"));
                    return;
                } else {
                    xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                    return;
                }
            case 5:
                dd0 dd0Var = (dd0) this.f49766b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f49767c);
                alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131752579, null);
                alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.a0("CancelLinkSuccess", null, 2131752580, org.telegram.messenger.k5.i(new StringBuilder("+"), dd0Var.f44637b, mf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752041, null), null);
                alertDialog$Builder.f27343a.setOnDismissListener(new zc0(dd0Var, 0));
                alertDialog$Builder.p();
                return;
            case 6:
                dd0 dd0Var2 = (dd0) this.f49766b;
                dd0Var2.getClass();
                dd0Var2.f44647h0 = ((TLRPC.TL_error) this.f49767c).text;
                return;
            case 7:
                ((dd0) this.f49766b).f44663v0.x1((TLRPC.TL_auth_authorization) ((TLObject) this.f49767c), false);
                return;
            case 8:
                Runnable runnable = (Runnable) this.f49767c;
                xq xqVar = ((dd0) this.f49766b).f44644f;
                int i15 = 0;
                while (true) {
                    zq[] zqVarArr = xqVar.f52078f;
                    if (i15 < zqVarArr.length) {
                        zqVarArr[i15].C(0.0f);
                        i15++;
                    } else {
                        runnable.run();
                        xqVar.f52077e = false;
                        return;
                    }
                }
            case 9:
                ((s3) this.f49766b).a((String) this.f49767c);
                return;
            case 10:
                ArrayList arrayList = (ArrayList) this.f49767c;
                xd0 xd0Var3 = ((wd0) this.f49766b).f50785b0;
                SharedPreferences e12 = org.telegram.messenger.hp.e1();
                if (!e12.getBoolean("firstloginshow", true) && !xd0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    xd0Var3.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    return;
                }
                e12.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xd0Var3.getParentActivity());
                int i16 = org.telegram.ui.ActionBar.k6.L5;
                alertDialog$Builder2.m(2131624066, 46, org.telegram.ui.ActionBar.k6.x0(null, i16, false), null);
                alertDialog$Builder2.n(i16, null);
                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131751771, "Continue"), null);
                String M0 = org.telegram.messenger.bd.M0(2131754278, "AllowFillNumber");
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder2.f27343a;
                s1Var.U = M0;
                xd0Var3.f51963n = xd0Var3.showDialog(s1Var, true, null);
                xd0Var3.f51952d0 = true;
                return;
            case 11:
                zd0.Z((zd0) this.f49766b, (org.telegram.ui.ActionBar.s1) this.f49767c);
                return;
            case 12:
                xe0 xe0Var = (xe0) this.f49766b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f49767c;
                xe0Var.f51989d0 = false;
                if (tL_error3 == null) {
                    pe0 l02 = xe0Var.l0();
                    xe0Var.f51998k0.clear();
                    xe0Var.n0(l02);
                    return;
                }
                return;
            case 13:
                xe0 xe0Var2 = ((oe0) this.f49766b).f48278a;
                pe0 l03 = xe0Var2.l0();
                xe0Var2.f51997j0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f49767c));
                TLRPC.ChatFull chatFull = xe0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    xe0Var2.getMessagesStorage().w1(xe0Var2.d.invitesCount, xe0Var2.f52000n);
                }
                xe0Var2.n0(l03);
                return;
            case 14:
                dg0 dg0Var = (dg0) this.f49766b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f49767c;
                if (dg0Var.getParentActivity() != null) {
                    Toast.makeText(dg0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 15:
                vg0 vg0Var = (vg0) this.f49766b;
                vg0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f49767c)));
                intent.putExtra("sms_body", org.telegram.messenger.bd.a0(null, null, 2131749124, "https://telegram.org/dl"));
                vg0Var.getContext().startActivity(intent);
                return;
            case 16:
                TLRPC.User user = (TLRPC.User) this.f49767c;
                ((vg0) this.f49766b).dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.A4(user.f27150id));
                    return;
                }
                return;
            case 17:
                ((org.telegram.ui.Components.ei) this.f49766b).a((TLRPC.User) this.f49767c);
                return;
            case 18:
                NotificationsCustomSettingsActivity.b0((NotificationsCustomSettingsActivity) this.f49766b, (ArrayList) this.f49767c);
                return;
            case 19:
                ((org.telegram.ui.ActionBar.t2[]) this.f49766b)[0] = null;
                yh0.f52282a = null;
                ((boolean[]) this.f49767c)[0] = true;
                return;
            case 20:
                Runnable runnable2 = (Runnable) this.f49767c;
                for (zq zqVar : ((PasscodeActivity) this.f49766b).f41359n.f52078f) {
                    zqVar.C(0.0f);
                }
                runnable2.run();
                return;
            case 21:
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.f49767c;
                PasscodeActivity passcodeActivity = (PasscodeActivity) ((fi0) this.f49766b).f45290c;
                if (passcodeActivity.E == 0) {
                    i11 = 2131747661;
                } else {
                    i11 = 2131747662;
                }
                y0Var.setText(org.telegram.messenger.bd.M0(i11, null));
                if (passcodeActivity.E == 0) {
                    i12 = 2131232276;
                } else {
                    i12 = 2131232294;
                }
                y0Var.setIcon(i12);
                passcodeActivity.y0();
                if (passcodeActivity.s0()) {
                    passcodeActivity.h.setInputType(524417);
                    org.telegram.messenger.g0.Z3(passcodeActivity.f41361s, true, 0.1f, true, false);
                    return;
                }
                return;
            case 22:
                ((PasskeysActivity) this.f49766b).d0((TL_account.Passkey) this.f49767c);
                return;
            case 23:
                yj0 yj0Var = (yj0) this.f49766b;
                org.telegram.messenger.rr rrVar = (org.telegram.messenger.rr) this.f49767c;
                int[] iArr = yj0Var.f52339y;
                int i17 = rrVar.f25201a;
                if (i17 == 2) {
                    if (!(yj0Var.G.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = yj0Var.H.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) yj0Var.H.get(i18);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    yj0Var.G = tL_secureRequiredType;
                                    yj0Var.U1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i17 == 1) {
                    if (!(yj0Var.G.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = yj0Var.H.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) yj0Var.H.get(i19);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    yj0Var.G = tL_secureRequiredType2;
                                    yj0Var.U1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i17 == 3) {
                    if (!(yj0Var.G.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = yj0Var.H.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) yj0Var.H.get(i20);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    yj0Var.G = tL_secureRequiredType3;
                                    yj0Var.U1();
                                } else {
                                    i20++;
                                }
                            }
                        }
                    }
                } else if (i17 == 4 && !(yj0Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = yj0Var.H.size();
                    int i21 = 0;
                    while (true) {
                        if (i21 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) yj0Var.H.get(i21);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                yj0Var.G = tL_secureRequiredType4;
                                yj0Var.U1();
                            } else {
                                i21++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(rrVar.f25202b)) {
                    yj0Var.Z[0].setText(rrVar.f25202b);
                }
                if (!TextUtils.isEmpty(rrVar.d)) {
                    yj0Var.Z[1].setText(rrVar.d);
                }
                if (!TextUtils.isEmpty(rrVar.f25203c)) {
                    yj0Var.Z[2].setText(rrVar.f25203c);
                }
                if (!TextUtils.isEmpty(rrVar.f25204e)) {
                    yj0Var.Z[7].setText(rrVar.f25204e);
                }
                int i22 = rrVar.f25212n;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 == 2) {
                            yj0Var.f52336x = "female";
                            yj0Var.Z[4].setText(org.telegram.messenger.bd.M0(2131747577, null));
                        }
                    } else {
                        yj0Var.f52336x = "male";
                        yj0Var.Z[4].setText(org.telegram.messenger.bd.M0(2131747516, null));
                    }
                }
                if (!TextUtils.isEmpty(rrVar.f25211m)) {
                    String str2 = rrVar.f25211m;
                    yj0Var.f52324s = str2;
                    String str3 = (String) yj0Var.Z0.get(str2);
                    if (str3 != null) {
                        yj0Var.Z[5].setText(str3);
                    }
                }
                if (!TextUtils.isEmpty(rrVar.f25210l)) {
                    String str4 = rrVar.f25210l;
                    yj0Var.f52333w = str4;
                    String str5 = (String) yj0Var.Z0.get(str4);
                    if (str5 != null) {
                        yj0Var.Z[6].setText(str5);
                    }
                }
                int i23 = rrVar.f25209k;
                if (i23 > 0 && rrVar.f25208j > 0 && rrVar.f25207i > 0) {
                    yj0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(rrVar.f25208j), Integer.valueOf(rrVar.f25207i)));
                }
                int i24 = rrVar.h;
                if (i24 > 0 && (i13 = rrVar.f25206g) > 0 && (i14 = rrVar.f25205f) > 0) {
                    iArr[0] = i14;
                    iArr[1] = i13;
                    iArr[2] = i24;
                    yj0Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i24), Integer.valueOf(rrVar.f25206g), Integer.valueOf(rrVar.f25205f)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                yj0Var.Z[8].setText(org.telegram.messenger.bd.M0(2131747502, null));
                return;
            case 24:
                yj0 yj0Var2 = (yj0) this.f49766b;
                TLObject tLObject = (TLObject) this.f49767c;
                if (tLObject != null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject;
                    yj0Var2.K = password2;
                    if (!TwoStepVerificationActivity.n0(password2, false)) {
                        org.telegram.ui.Components.t4.w0(yj0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                        return;
                    }
                    TwoStepVerificationActivity.r0(yj0Var2.K);
                    yj0Var2.W1();
                    if (yj0Var2.f52285a0[0].getVisibility() == 0) {
                        yj0Var2.Z[0].requestFocus();
                        org.telegram.messenger.g0.K3(yj0Var2.Z[0]);
                    }
                    if (yj0Var2.O0 == 1) {
                        yj0Var2.F1(true);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                yj0 yj0Var3 = (yj0) this.f49766b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f49767c;
                if (tL_error4 == null) {
                    yj0Var3.f52302g1 = true;
                    yj0Var3.a1(true);
                    yj0Var3.finishFragment();
                    return;
                }
                yj0Var3.R1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error4.text)) {
                    org.telegram.ui.Components.t4.w0(yj0Var3.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                    return;
                } else {
                    yj0Var3.Q1(org.telegram.messenger.bd.M0(2131689472, null), tL_error4.text);
                    return;
                }
            case 26:
                ((tj0) this.f49766b).f49818a.L = ((TLRPC.TL_error) this.f49767c).text;
                return;
            case 27:
                ((dl0) this.f49766b).J0(false);
                ((View) this.f49767c).callOnClick();
                return;
            case 28:
                dl0 dl0Var = (dl0) this.f49766b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.f49767c;
                dl0Var.N0(true, false);
                if (tL_error5 == null) {
                    if (dl0Var.getParentActivity() != null) {
                        ek0 ek0Var = dl0Var.f44748e0;
                        if (ek0Var != null) {
                            org.telegram.messenger.g0.r(ek0Var);
                            dl0Var.f44748e0 = null;
                        }
                        dl0Var.z0();
                        return;
                    }
                    return;
                } else if (tL_error5.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.l3 l3Var = dl0Var.T;
                    try {
                        l3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.G3(2.5f, l3Var, null);
                    org.telegram.ui.Cells.l3 l3Var2 = dl0Var.T;
                    l3Var2.f29547a.setText("");
                    l3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error5.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    dl0Var.L0(org.telegram.messenger.bd.M0(2131689472, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G));
                    return;
                } else {
                    dl0Var.L0(org.telegram.messenger.bd.M0(2131689472, null), tL_error5.text);
                    return;
                }
            default:
                dl0.b0((dl0) this.f49766b, (TLRPC.TL_payments_validatedRequestedInfo) this.f49767c);
                return;
        }
    }
}
