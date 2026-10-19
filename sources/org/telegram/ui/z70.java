package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z70 implements Runnable {
    public final int f43648a;
    public final Object f43649b;
    public final Object f43650c;

    public z70(int i10, Object obj, Object obj2) {
        this.f43648a = i10;
        this.f43649b = obj;
        this.f43650c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f43648a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f43649b;
                String str = (String) this.f43650c;
                if (str.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new lt(29, languageSelectActivity, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity.h.size();
                for (int i12 = 0; i12 < size; i12++) {
                    LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i12);
                    if (localeInfo.name.toLowerCase().startsWith(str) || localeInfo.nameEnglish.toLowerCase().startsWith(str)) {
                        arrayList.add(localeInfo);
                    }
                }
                int size2 = languageSelectActivity.f33146f.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity.f33146f.get(i13);
                    if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                        arrayList.add(localeInfo2);
                    }
                }
                AndroidUtilities.runOnUIThread(new lt(29, languageSelectActivity, arrayList));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.f43649b;
                TLObject tLObject = (TLObject) this.f43650c;
                Pattern pattern = LaunchActivity.C1;
                if (tLObject instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject;
                    MessagesController.getInstance(launchActivity.O).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.O).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.O).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    qn qnVar = new qn(bundle);
                    qnVar.ia = resolvedbusinesschatlinks;
                    launchActivity.u0(qnVar, false, true);
                    return;
                }
                launchActivity.F0(org.telegram.ui.Components.f5.M(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f43649b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f43650c;
                Pattern pattern2 = LaunchActivity.C1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 3:
                Pattern pattern3 = LaunchActivity.C1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f43650c).text);
                org.telegram.ui.Components.f5.t0((h) this.f43649b, string, sb2.toString(), null);
                return;
            case 4:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f43649b;
                String str2 = (String) this.f43650c;
                if (!launchActivity3.f33179q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f33179q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str2).getQueryParameter("ref")));
                    return;
                }
                return;
            case 5:
                Pattern pattern4 = LaunchActivity.C1;
                ((LaunchActivity) this.f43649b).k0((TL_account.Password) this.f43650c);
                return;
            case 6:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f43649b;
                Runnable runnable = (Runnable) this.f43650c;
                launchActivity4.f33179q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f33181r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f33181r0.getView().getVisibility() == 0) {
                        launchActivity4.f33181r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f33183s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f33183s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f43650c;
                if (!((LaunchActivity) this.f43649b).Q && LaunchActivity.F1) {
                    qcVar.j();
                    return;
                }
                return;
            case 8:
                Pattern pattern5 = LaunchActivity.C1;
                ((LaunchActivity) this.f43649b).t0((kc1) this.f43650c);
                return;
            case 9:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f43649b;
                pf.c cVar = (pf.c) this.f43650c;
                launchActivity5.P0 = null;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.V0 = null;
                launchActivity5.T0 = null;
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
            case 10:
                pf.c cVar2 = (pf.c) this.f43649b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f43650c;
                Pattern pattern6 = LaunchActivity.C1;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 11:
                ib0 ib0Var = (ib0) this.f43649b;
                TLObject tLObject2 = (TLObject) this.f43650c;
                ib0Var.c();
                if (tLObject2 != null) {
                    ib0Var.f37905a.k0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 12:
                ((FiltersSetupActivity) this.f43650c).X(((ib0) this.f43649b).f37905a.O());
                return;
            case 13:
                nc0 nc0Var = (nc0) this.f43649b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f43650c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new jq(nc0Var, createBitmap2, gLSurfaceView, 22));
                    return;
                }
                return;
            case 14:
                nc0 nc0Var2 = (nc0) this.f43649b;
                nc0Var2.f39496c.setImageResource(R.drawable.msg_location_alert2);
                nc0Var2.d0(((LocationController.SharingLocationInfo) this.f43650c).proximityMeters);
                nc0Var2.G = false;
                return;
            case 15:
                ((EditText) this.f43649b).removeTextChangedListener((org.telegram.ui.Components.ao) this.f43650c);
                return;
            case 16:
                Runnable runnable2 = (Runnable) this.f43650c;
                id0 id0Var = ((md0) this.f43649b).f39203a;
                int i14 = 0;
                while (true) {
                    tr[] trVarArr = id0Var.f40953f;
                    if (i14 < trVarArr.length) {
                        trVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        id0Var.e = false;
                        return;
                    }
                }
            case 17:
                vd0 vd0Var = (vd0) this.f43649b;
                dg0 dg0Var = vd0Var.f42211y;
                dg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(vd0Var.f42202a);
                dg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f43650c), false);
                return;
            case 18:
                vd0 vd0Var2 = (vd0) this.f43649b;
                String str3 = (String) this.f43650c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = vd0Var2.f42206n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                td0 td0Var = new td0(vd0Var2, 2);
                if (z10) {
                    TL_account.Password password = vd0Var2.f42206n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        td0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.n2) vd0Var2.f42211y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, td0Var, 10);
                    return;
                }
                return;
            case 19:
                ne0 ne0Var = (ne0) this.f43649b;
                ne0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(ne0Var.O.fragmentView.findFocus());
                ne0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f43650c), true);
                TLRPC.FileLocation fileLocation = ne0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new z70(20, ne0Var, fileLocation));
                    return;
                }
                return;
            case 20:
                i11 = ((org.telegram.ui.ActionBar.n2) ((ne0) this.f43649b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f43650c);
                return;
            case 21:
                oe0 oe0Var = (oe0) this.f43649b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f43650c;
                dg0 dg0Var2 = oe0Var.E;
                dg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (oe0Var.f39852r != null && oe0Var.f39853s != null && oe0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", oe0Var.f39852r);
                        bundle2.putString("phoneHash", oe0Var.f39853s);
                        bundle2.putString("code", oe0Var.v);
                        dg0Var2.u1(5, true, bundle2, false);
                        return;
                    }
                    dg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 22:
                hf0 hf0Var = (hf0) this.f43649b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f43650c);
                alertDialog$Builder.f20602a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f20602a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.kk.g(new StringBuilder("+"), hf0Var.f37588b, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f20602a.setOnDismissListener(new bf0(hf0Var, 0));
                alertDialog$Builder.o();
                return;
            case 23:
                hf0 hf0Var2 = (hf0) this.f43649b;
                hf0Var2.getClass();
                hf0Var2.f37593e0 = ((TLRPC.TL_error) this.f43650c).text;
                return;
            case 24:
                ((hf0) this.f43649b).f37610s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f43650c), false);
                return;
            case 25:
                Runnable runnable3 = (Runnable) this.f43650c;
                qr qrVar = ((hf0) this.f43649b).f37594f;
                int i15 = 0;
                while (true) {
                    tr[] trVarArr2 = qrVar.f40953f;
                    if (i15 < trVarArr2.length) {
                        trVarArr2[i15].l(0.0f);
                        i15++;
                    } else {
                        runnable3.run();
                        qrVar.e = false;
                        return;
                    }
                }
            case 26:
                ((v3) this.f43649b).run((String) this.f43650c);
                return;
            case 27:
                ArrayList arrayList2 = (ArrayList) this.f43650c;
                dg0 dg0Var3 = ((cg0) this.f43649b).V;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !dg0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    dg0Var3.getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                    return;
                }
                globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dg0Var3.getParentActivity());
                alertDialog$Builder2.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                String string2 = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20602a;
                b2Var2.T = string2;
                dg0Var3.f36376n = dg0Var3.showDialog(b2Var2, true, null);
                dg0Var3.f36365c0 = true;
                return;
            case 28:
                gg0.V((gg0) this.f43649b, (org.telegram.ui.ActionBar.b2) this.f43650c);
                return;
            default:
                ih0 ih0Var = (ih0) this.f43649b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f43650c;
                ih0Var.f37975c0 = false;
                if (tL_error3 == null) {
                    zg0 f02 = ih0Var.f0();
                    ih0Var.f37983j0.clear();
                    ih0Var.h0(f02);
                    return;
                }
                return;
        }
    }
}
