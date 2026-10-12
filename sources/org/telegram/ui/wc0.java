package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wc0 implements Runnable {
    public final int f41244a;
    public final Object f41245b;
    public final Object f41246c;

    public wc0(int i10, Object obj, Object obj2) {
        this.f41244a = i10;
        this.f41245b = obj;
        this.f41246c = obj2;
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
        switch (this.f41244a) {
            case 0:
                nd0 nd0Var = (nd0) this.f41245b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f41246c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new br(nd0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 1:
                nd0 nd0Var2 = (nd0) this.f41245b;
                nd0Var2.f38651c.setImageResource(R.drawable.msg_location_alert2);
                nd0Var2.d0(((LocationController.SharingLocationInfo) this.f41246c).proximityMeters);
                nd0Var2.G = false;
                return;
            case 2:
                ((EditText) this.f41245b).removeTextChangedListener((org.telegram.ui.Components.eo) this.f41246c);
                return;
            case 3:
                Runnable runnable = (Runnable) this.f41246c;
                ie0 ie0Var = ((le0) this.f41245b).f37930a;
                int i16 = 0;
                while (true) {
                    ks[] ksVarArr = ie0Var.f36949f;
                    if (i16 < ksVarArr.length) {
                        ksVarArr[i16].l(0.0f);
                        i16++;
                    } else {
                        runnable.run();
                        ie0Var.e = false;
                        return;
                    }
                }
            case 4:
                ue0 ue0Var = (ue0) this.f41245b;
                bh0 bh0Var = ue0Var.f40665y;
                bh0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(ue0Var.f40656a);
                bh0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f41246c), false);
                return;
            case 5:
                ue0 ue0Var2 = (ue0) this.f41245b;
                String str = (String) this.f41246c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ue0Var2.f40660n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                se0 se0Var = new se0(ue0Var2, 2);
                if (z10) {
                    TL_account.Password password = ue0Var2.f40660n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        se0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.m2) ue0Var2.f40665y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, se0Var, 10);
                    return;
                }
                return;
            case 6:
                mf0 mf0Var = (mf0) this.f41245b;
                mf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(mf0Var.O.fragmentView.findFocus());
                mf0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f41246c), true);
                TLRPC.FileLocation fileLocation = mf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new wc0(7, mf0Var, fileLocation));
                    return;
                }
                return;
            case 7:
                i11 = ((org.telegram.ui.ActionBar.m2) ((mf0) this.f41245b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f41246c);
                return;
            case 8:
                nf0 nf0Var = (nf0) this.f41245b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f41246c;
                bh0 bh0Var2 = nf0Var.E;
                bh0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (nf0Var.f38703r != null && nf0Var.f38704s != null && nf0Var.v != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", nf0Var.f38703r);
                        bundle.putString("phoneHash", nf0Var.f38704s);
                        bundle.putString("code", nf0Var.v);
                        bh0Var2.u1(5, true, bundle, false);
                        return;
                    }
                    bh0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 9:
                eg0 eg0Var = (eg0) this.f41245b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f41246c);
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f19548a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.yh.g(new StringBuilder("+"), eg0Var.f35544b, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f19548a.setOnDismissListener(new ag0(eg0Var, 0));
                alertDialog$Builder.o();
                return;
            case 10:
                eg0 eg0Var2 = (eg0) this.f41245b;
                eg0Var2.getClass();
                eg0Var2.f35549e0 = ((TLRPC.TL_error) this.f41246c).text;
                return;
            case 11:
                ((eg0) this.f41245b).f35566s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f41246c), false);
                return;
            case 12:
                Runnable runnable2 = (Runnable) this.f41246c;
                hs hsVar = ((eg0) this.f41245b).f35550f;
                int i17 = 0;
                while (true) {
                    ks[] ksVarArr2 = hsVar.f36949f;
                    if (i17 < ksVarArr2.length) {
                        ksVarArr2[i17].l(0.0f);
                        i17++;
                    } else {
                        runnable2.run();
                        hsVar.e = false;
                        return;
                    }
                }
            case 13:
                ((v3) this.f41245b).run((String) this.f41246c);
                return;
            case 14:
                ArrayList arrayList = (ArrayList) this.f41246c;
                bh0 bh0Var3 = ((ah0) this.f41245b).V;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !bh0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    bh0Var3.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    return;
                }
                globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bh0Var3.getParentActivity());
                alertDialog$Builder2.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.f19548a;
                a2Var.T = string;
                bh0Var3.f34559n = bh0Var3.showDialog(a2Var, true, null);
                bh0Var3.f34548c0 = true;
                return;
            case 15:
                eh0.V((eh0) this.f41245b, (org.telegram.ui.ActionBar.a2) this.f41246c);
                return;
            case 16:
                ei0 ei0Var = (ei0) this.f41245b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f41246c;
                ei0Var.f35589c0 = false;
                if (tL_error3 == null) {
                    vh0 f02 = ei0Var.f0();
                    ei0Var.f35597j0.clear();
                    ei0Var.h0(f02);
                    return;
                }
                return;
            case 17:
                ei0 ei0Var2 = ((uh0) this.f41245b).f40684a;
                vh0 f03 = ei0Var2.f0();
                ei0Var2.f35596i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f41246c));
                TLRPC.ChatFull chatFull = ei0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ei0Var2.getMessagesStorage().saveChatLinksCount(ei0Var2.f35600n, ei0Var2.d.invitesCount);
                }
                ei0Var2.h0(f03);
                return;
            case 18:
                qj0 qj0Var = (qj0) this.f41245b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f41246c;
                if (qj0Var.getParentActivity() != null) {
                    Toast.makeText(qj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 19:
                ik0 ik0Var = (ik0) this.f41245b;
                ik0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f41246c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                ik0Var.getContext().startActivity(intent);
                return;
            case 20:
                TLRPC.User user = (TLRPC.User) this.f41246c;
                ((ik0) this.f41245b).dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.f19363id));
                    return;
                }
                return;
            case 21:
                ((mt) this.f41245b).run((TLRPC.User) this.f41246c);
                return;
            case 22:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f41245b, (ArrayList) this.f41246c);
                return;
            case 23:
                ((org.telegram.ui.ActionBar.e3[]) this.f41245b)[0] = null;
                rl0.f39819a = null;
                ((boolean[]) this.f41246c)[0] = true;
                return;
            case 24:
                Runnable runnable3 = (Runnable) this.f41246c;
                for (ks ksVar : ((PasscodeActivity) this.f41245b).f32177n.f36949f) {
                    ksVar.l(0.0f);
                }
                runnable3.run();
                return;
            case 25:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f41246c;
                PasscodeActivity passcodeActivity = ((wl0) this.f41245b).f41617b;
                if (passcodeActivity.f32182y == 0) {
                    i12 = R.string.PasscodeSwitchToPassword;
                } else {
                    i12 = R.string.PasscodeSwitchToPIN;
                }
                e1Var.setText(LocaleController.getString(i12));
                if (passcodeActivity.f32182y == 0) {
                    i13 = R.drawable.msg_permissions;
                } else {
                    i13 = R.drawable.msg_pin_code;
                }
                e1Var.setIcon(i13);
                passcodeActivity.n0();
                if (passcodeActivity.h0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f32179s, true, 0.1f, false);
                    return;
                }
                return;
            case 26:
                ((PasskeysActivity) this.f41245b).Y((TL_account.Passkey) this.f41246c);
                return;
            case 27:
                un0 un0Var = (un0) this.f41245b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f41246c;
                int[] iArr = un0Var.f40771x;
                int i18 = result.type;
                if (i18 == 2) {
                    if (!(un0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = un0Var.G.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) un0Var.G.get(i19);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    un0Var.F = tL_secureRequiredType;
                                    un0Var.O1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i18 == 1) {
                    if (!(un0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = un0Var.G.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) un0Var.G.get(i20);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    un0Var.F = tL_secureRequiredType2;
                                    un0Var.O1();
                                } else {
                                    i20++;
                                }
                            }
                        }
                    }
                } else if (i18 == 3) {
                    if (!(un0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = un0Var.G.size();
                        int i21 = 0;
                        while (true) {
                            if (i21 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) un0Var.G.get(i21);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    un0Var.F = tL_secureRequiredType3;
                                    un0Var.O1();
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                } else if (i18 == 4 && !(un0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = un0Var.G.size();
                    int i22 = 0;
                    while (true) {
                        if (i22 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) un0Var.G.get(i22);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                un0Var.F = tL_secureRequiredType4;
                                un0Var.O1();
                            } else {
                                i22++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    un0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    un0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    un0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    un0Var.Y[7].setText(result.number);
                }
                int i23 = result.gender;
                if (i23 != 0) {
                    if (i23 != 1) {
                        if (i23 == 2) {
                            un0Var.f40768w = "female";
                            un0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        un0Var.f40768w = "male";
                        un0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str2 = result.nationality;
                    un0Var.f40759s = str2;
                    String str3 = (String) un0Var.Y0.get(str2);
                    if (str3 != null) {
                        un0Var.Y[5].setText(str3);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str4 = result.issuingCountry;
                    un0Var.v = str4;
                    String str5 = (String) un0Var.Y0.get(str4);
                    if (str5 != null) {
                        un0Var.Y[6].setText(str5);
                    }
                }
                int i24 = result.birthDay;
                if (i24 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    un0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i24), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i25 = result.expiryDay;
                if (i25 > 0 && (i14 = result.expiryMonth) > 0 && (i15 = result.expiryYear) > 0) {
                    iArr[0] = i15;
                    iArr[1] = i14;
                    iArr[2] = i25;
                    un0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i25), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                un0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 28:
                un0 un0Var2 = (un0) this.f41245b;
                TLObject tLObject = (TLObject) this.f41246c;
                if (tLObject != null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject;
                    un0Var2.J = password2;
                    if (!TwoStepVerificationActivity.i0(password2, false)) {
                        org.telegram.ui.Components.g5.w0(un0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.m0(un0Var2.J);
                    un0Var2.Q1();
                    if (un0Var2.Z[0].getVisibility() == 0) {
                        un0Var2.Y[0].requestFocus();
                        AndroidUtilities.showKeyboard(un0Var2.Y[0]);
                    }
                    if (un0Var2.N0 == 1) {
                        un0Var2.A1(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                un0 un0Var3 = (un0) this.f41245b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f41246c;
                if (tL_error4 == null) {
                    un0Var3.f40734f1 = true;
                    un0Var3.V0(true);
                    un0Var3.finishFragment();
                    return;
                }
                un0Var3.M1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error4.text)) {
                    org.telegram.ui.Components.g5.w0(un0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    un0Var3.L1(LocaleController.getString(R.string.AppName), tL_error4.text);
                    return;
                }
        }
    }
}
