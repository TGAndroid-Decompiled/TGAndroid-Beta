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
import android.widget.ImageView;
import android.widget.Toast;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
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
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wb0 implements Runnable {
    public final int f45092a;
    public final Object f45093b;
    public final Object f45094c;

    public wb0(int i10, Object obj, Object obj2) {
        this.f45092a = i10;
        this.f45093b = obj;
        this.f45094c = obj2;
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
        switch (this.f45092a) {
            case 0:
                pc0 pc0Var = (pc0) this.f45093b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f45094c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new nq(pc0Var, createBitmap2, gLSurfaceView, 23));
                    return;
                }
                return;
            case 1:
                pc0 pc0Var2 = (pc0) this.f45093b;
                pc0Var2.f42429c.setImageResource(R.drawable.msg_location_alert2);
                pc0Var2.f0(((LocationController.SharingLocationInfo) this.f45094c).proximityMeters);
                pc0Var2.G = false;
                return;
            case 2:
                ((EditText) this.f45093b).removeTextChangedListener((org.telegram.ui.Components.bo) this.f45094c);
                return;
            case 3:
                Runnable runnable = (Runnable) this.f45094c;
                ld0 ld0Var = ((od0) this.f45093b).f42151a;
                int i16 = 0;
                while (true) {
                    xr[] xrVarArr = ld0Var.f44894f;
                    if (i16 < xrVarArr.length) {
                        xrVarArr[i16].l(0.0f);
                        i16++;
                    } else {
                        runnable.run();
                        ld0Var.e = false;
                        return;
                    }
                }
            case 4:
                yd0 yd0Var = (yd0) this.f45093b;
                gg0 gg0Var = yd0Var.f46041y;
                gg0Var.p1(false, false);
                AndroidUtilities.hideKeyboard(yd0Var.f46032a);
                gg0Var.t1((TLRPC.TL_auth_authorization) ((TLObject) this.f45094c), false);
                return;
            case 5:
                yd0 yd0Var2 = (yd0) this.f45093b;
                String str = (String) this.f45094c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = yd0Var2.f46036n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                vd0 vd0Var = new vd0(yd0Var2, 2);
                if (z10) {
                    TL_account.Password password = yd0Var2.f46036n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        vd0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.r2) yd0Var2.f46041y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, vd0Var, 10);
                    return;
                }
                return;
            case 6:
                re0 re0Var = (re0) this.f45093b;
                re0Var.O.p1(false, false);
                AndroidUtilities.hideKeyboard(re0Var.O.fragmentView.findFocus());
                re0Var.O.t1((TLRPC.TL_auth_authorization) ((TLObject) this.f45094c), true);
                TLRPC.FileLocation fileLocation = re0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new wb0(7, re0Var, fileLocation));
                    return;
                }
                return;
            case 7:
                i11 = ((org.telegram.ui.ActionBar.r2) ((re0) this.f45093b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f45094c);
                return;
            case 8:
                se0 se0Var = (se0) this.f45093b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f45094c;
                gg0 gg0Var2 = se0Var.G;
                gg0Var2.p1(false, true);
                if (tL_error2 == null) {
                    if (se0Var.f43483r != null && se0Var.f43484s != null && se0Var.v != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", se0Var.f43483r);
                        bundle.putString("phoneHash", se0Var.f43484s);
                        bundle.putString("code", se0Var.v);
                        gg0Var2.z1(5, true, bundle, false);
                        return;
                    }
                    gg0Var2.z1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 9:
                jf0 jf0Var = (jf0) this.f45093b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f45094c);
                alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f22366a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.vh.g(new StringBuilder("+"), jf0Var.f40592b, kf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f22366a.setOnDismissListener(new ff0(jf0Var, 0));
                alertDialog$Builder.p();
                return;
            case 10:
                jf0 jf0Var2 = (jf0) this.f45093b;
                jf0Var2.getClass();
                jf0Var2.f40600g0 = ((TLRPC.TL_error) this.f45094c).text;
                return;
            case 11:
                ((jf0) this.f45093b).f40616u0.t1((TLRPC.TL_auth_authorization) ((TLObject) this.f45094c), false);
                return;
            case 12:
                Runnable runnable2 = (Runnable) this.f45094c;
                vr vrVar = ((jf0) this.f45093b).f40598f;
                int i17 = 0;
                while (true) {
                    xr[] xrVarArr2 = vrVar.f44894f;
                    if (i17 < xrVarArr2.length) {
                        xrVarArr2[i17].l(0.0f);
                        i17++;
                    } else {
                        runnable2.run();
                        vrVar.e = false;
                        return;
                    }
                }
            case 13:
                ((t3) this.f45093b).run((String) this.f45094c);
                return;
            case 14:
                ArrayList arrayList = (ArrayList) this.f45094c;
                gg0 gg0Var3 = ((fg0) this.f45093b).f39359a0;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !gg0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    gg0Var3.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    return;
                }
                globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gg0Var3.getParentActivity());
                int i18 = R.raw.incoming_calls;
                int i19 = org.telegram.ui.ActionBar.y6.L5;
                alertDialog$Builder2.m(i18, 46, org.telegram.ui.ActionBar.y6.x0(null, i19, false), null);
                alertDialog$Builder2.n(i19, null);
                alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder2.f22366a;
                e2Var.T = string;
                gg0Var3.f39664n = gg0Var3.showDialog(e2Var, true, null);
                gg0Var3.f39653c0 = true;
                return;
            case 15:
                jg0.V((jg0) this.f45093b, (org.telegram.ui.ActionBar.e2) this.f45094c);
                return;
            case 16:
                jh0 jh0Var = (jh0) this.f45093b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f45094c;
                jh0Var.f40647c0 = false;
                if (tL_error3 == null) {
                    ah0 h02 = jh0Var.h0();
                    jh0Var.f40655j0.clear();
                    jh0Var.j0(h02);
                    return;
                }
                return;
            case 17:
                jh0 jh0Var2 = ((zg0) this.f45093b).f46285a;
                ah0 h03 = jh0Var2.h0();
                jh0Var2.f40654i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f45094c));
                TLRPC.ChatFull chatFull = jh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    jh0Var2.getMessagesStorage().saveChatLinksCount(jh0Var2.f40658n, jh0Var2.d.invitesCount);
                }
                jh0Var2.j0(h03);
                return;
            case 18:
                vi0 vi0Var = (vi0) this.f45093b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f45094c;
                if (vi0Var.getParentActivity() != null) {
                    Toast.makeText(vi0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 19:
                oj0 oj0Var = (oj0) this.f45093b;
                oj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f45094c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                oj0Var.getContext().startActivity(intent);
                return;
            case 20:
                TLRPC.User user = (TLRPC.User) this.f45094c;
                ((oj0) this.f45093b).dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.t4(user.f22174id));
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.oy) this.f45093b).run((TLRPC.User) this.f45094c);
                return;
            case 22:
                xj0 xj0Var = (xj0) this.f45093b;
                TLObject tLObject = (TLObject) this.f45094c;
                ArrayList arrayList2 = xj0Var.f45782c;
                vj0[] vj0VarArr = xj0Var.f45781b;
                HashSet hashSet = xj0Var.e;
                HashSet hashSet2 = xj0Var.d;
                if (!xj0Var.h) {
                    xj0Var.f45784n = false;
                    if (!(tLObject instanceof TL_feed.TL_interestCategories)) {
                        xj0Var.f45785r = true;
                        xj0.o0(vj0VarArr[0]);
                        return;
                    }
                    TL_feed.TL_interestCategories tL_interestCategories = (TL_feed.TL_interestCategories) tLObject;
                    arrayList2.clear();
                    arrayList2.addAll(tL_interestCategories.categories);
                    if (!xj0Var.f45783f && hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(tL_interestCategories.selected);
                        hashSet.clear();
                        hashSet.addAll(tL_interestCategories.selected);
                    }
                    xj0Var.p0(false);
                    xj0.o0(vj0VarArr[0]);
                    return;
                }
                return;
            case 23:
                xj0.W((xj0) this.f45093b, (ImageView) this.f45094c);
                return;
            case 24:
                NotificationsCustomSettingsActivity.X((NotificationsCustomSettingsActivity) this.f45093b, (ArrayList) this.f45094c);
                return;
            case 25:
                ((org.telegram.ui.ActionBar.k3[]) this.f45093b)[0] = null;
                dl0.f38903a = null;
                ((boolean[]) this.f45094c)[0] = true;
                return;
            case 26:
                Runnable runnable3 = (Runnable) this.f45094c;
                for (xr xrVar : ((PasscodeActivity) this.f45093b).f35594n.f44894f) {
                    xrVar.l(0.0f);
                }
                runnable3.run();
                return;
            case 27:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f45094c;
                PasscodeActivity passcodeActivity = ((kl0) this.f45093b).f40960b;
                if (passcodeActivity.f35599y == 0) {
                    i12 = R.string.PasscodeSwitchToPassword;
                } else {
                    i12 = R.string.PasscodeSwitchToPIN;
                }
                g1Var.setText(LocaleController.getString(i12));
                if (passcodeActivity.f35599y == 0) {
                    i13 = R.drawable.msg_permissions;
                } else {
                    i13 = R.drawable.msg_pin_code;
                }
                g1Var.setIcon(i13);
                passcodeActivity.u0();
                if (passcodeActivity.o0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f35596s, true, 0.1f, false);
                    return;
                }
                return;
            case 28:
                ((PasskeysActivity) this.f45093b).Z((TL_account.Passkey) this.f45094c);
                return;
            default:
                in0 in0Var = (in0) this.f45093b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f45094c;
                int[] iArr = in0Var.f40321x;
                int i20 = result.type;
                if (i20 == 2) {
                    if (!(in0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = in0Var.G.size();
                        int i21 = 0;
                        while (true) {
                            if (i21 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) in0Var.G.get(i21);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    in0Var.F = tL_secureRequiredType;
                                    in0Var.Q1();
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                } else if (i20 == 1) {
                    if (!(in0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = in0Var.G.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) in0Var.G.get(i22);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    in0Var.F = tL_secureRequiredType2;
                                    in0Var.Q1();
                                } else {
                                    i22++;
                                }
                            }
                        }
                    }
                } else if (i20 == 3) {
                    if (!(in0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = in0Var.G.size();
                        int i23 = 0;
                        while (true) {
                            if (i23 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) in0Var.G.get(i23);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    in0Var.F = tL_secureRequiredType3;
                                    in0Var.Q1();
                                } else {
                                    i23++;
                                }
                            }
                        }
                    }
                } else if (i20 == 4 && !(in0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = in0Var.G.size();
                    int i24 = 0;
                    while (true) {
                        if (i24 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) in0Var.G.get(i24);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                in0Var.F = tL_secureRequiredType4;
                                in0Var.Q1();
                            } else {
                                i24++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    in0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    in0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    in0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    in0Var.Y[7].setText(result.number);
                }
                int i25 = result.gender;
                if (i25 != 0) {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            in0Var.f40318w = "female";
                            in0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        in0Var.f40318w = "male";
                        in0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str2 = result.nationality;
                    in0Var.f40309s = str2;
                    String str3 = (String) in0Var.Y0.get(str2);
                    if (str3 != null) {
                        in0Var.Y[5].setText(str3);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str4 = result.issuingCountry;
                    in0Var.v = str4;
                    String str5 = (String) in0Var.Y0.get(str4);
                    if (str5 != null) {
                        in0Var.Y[6].setText(str5);
                    }
                }
                int i26 = result.birthDay;
                if (i26 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    in0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i26), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i27 = result.expiryDay;
                if (i27 > 0 && (i14 = result.expiryMonth) > 0 && (i15 = result.expiryYear) > 0) {
                    iArr[0] = i15;
                    iArr[1] = i14;
                    iArr[2] = i27;
                    in0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i27), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                in0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
        }
    }
}
