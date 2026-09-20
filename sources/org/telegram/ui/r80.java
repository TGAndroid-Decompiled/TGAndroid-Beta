package org.telegram.ui;

import android.app.Activity;
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
public final class r80 implements Runnable {
    public final int f37063a;
    public final Object f37064b;
    public final Object f37065c;

    public r80(int i10, Object obj, Object obj2) {
        this.f37063a = i10;
        this.f37064b = obj;
        this.f37065c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f37063a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f37064b;
                languageSelectActivity.e = (ArrayList) this.f37065c;
                languageSelectActivity.f31094c.l();
                return;
            case 1:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f37064b;
                String str = (String) this.f37065c;
                if (str.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new r80(0, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i12 = 0; i12 < size; i12++) {
                    LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i12);
                    if (localeInfo.name.toLowerCase().startsWith(str) || localeInfo.nameEnglish.toLowerCase().startsWith(str)) {
                        arrayList.add(localeInfo);
                    }
                }
                int size2 = languageSelectActivity2.f31095f.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f31095f.get(i13);
                    if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                        arrayList.add(localeInfo2);
                    }
                }
                AndroidUtilities.runOnUIThread(new r80(0, languageSelectActivity2, arrayList));
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.f37064b;
                TLObject tLObject = (TLObject) this.f37065c;
                Pattern pattern = LaunchActivity.B1;
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
                    zn znVar = new zn(bundle);
                    znVar.f40352ia = resolvedbusinesschatlinks;
                    launchActivity.q0(znVar, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.d5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f37064b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f37065c;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j3, j3, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.o(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f37065c).text);
                org.telegram.ui.Components.d5.u0((h) this.f37064b, string, sb2.toString(), null);
                return;
            case 5:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f37064b;
                String str2 = (String) this.f37065c;
                if (!launchActivity3.f31128q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f31128q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str2).getQueryParameter("ref")));
                    return;
                }
                return;
            case 6:
                Pattern pattern4 = LaunchActivity.B1;
                ((LaunchActivity) this.f37064b).j0((TL_account.Password) this.f37065c);
                return;
            case 7:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f37064b;
                Runnable runnable = (Runnable) this.f37065c;
                launchActivity4.f31128q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f31130r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f31130r0.getView().getVisibility() == 0) {
                        launchActivity4.f31130r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f31132s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f31132s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.pc pcVar = (org.telegram.ui.Components.pc) this.f37065c;
                if (!((LaunchActivity) this.f37064b).Q && LaunchActivity.E1) {
                    pcVar.j();
                    return;
                }
                return;
            case 9:
                Pattern pattern5 = LaunchActivity.B1;
                ((LaunchActivity) this.f37064b).p0((xd1) this.f37065c);
                return;
            case 10:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f37064b;
                nf.e eVar = (nf.e) this.f37065c;
                launchActivity5.P0 = null;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.V0 = null;
                launchActivity5.T0 = null;
                if (eVar != null) {
                    eVar.b();
                    return;
                }
                return;
            case 11:
                nf.e eVar2 = (nf.e) this.f37064b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f37065c;
                Pattern pattern6 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 12:
                hc0 hc0Var = (hc0) this.f37064b;
                TLObject tLObject2 = (TLObject) this.f37065c;
                hc0Var.a();
                if (tLObject2 != null) {
                    hc0Var.f34164a.j0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 13:
                ((FiltersSetupActivity) this.f37065c).X(((hc0) this.f37064b).f34164a.O());
                return;
            case 14:
                kd0 kd0Var = (kd0) this.f37064b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f37065c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new vq(kd0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 15:
                kd0 kd0Var2 = (kd0) this.f37064b;
                kd0Var2.f35097c.setImageResource(R.drawable.msg_location_alert2);
                kd0Var2.e0(((LocationController.SharingLocationInfo) this.f37065c).proximityMeters);
                kd0Var2.G = false;
                return;
            case 16:
                ((EditText) this.f37064b).removeTextChangedListener((org.telegram.ui.Components.qn) this.f37065c);
                return;
            case 17:
                Runnable runnable2 = (Runnable) this.f37065c;
                fe0 fe0Var = ((ie0) this.f37064b).f34539a;
                int i14 = 0;
                while (true) {
                    gs[] gsVarArr = fe0Var.f33125f;
                    if (i14 < gsVarArr.length) {
                        gsVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        fe0Var.e = false;
                        return;
                    }
                }
            case 18:
                re0 re0Var = (re0) this.f37064b;
                yg0 yg0Var = re0Var.f37135y;
                yg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(re0Var.f37126a);
                yg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f37065c), false);
                return;
            case 19:
                re0 re0Var2 = (re0) this.f37064b;
                String str3 = (String) this.f37065c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = re0Var2.f37130n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                pe0 pe0Var = new pe0(re0Var2, 2);
                if (z10) {
                    TL_account.Password password = re0Var2.f37130n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        pe0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.n2) re0Var2.f37135y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, pe0Var, 10);
                    return;
                }
                return;
            case 20:
                jf0 jf0Var = (jf0) this.f37064b;
                jf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(jf0Var.O.fragmentView.findFocus());
                jf0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f37065c), true);
                TLRPC.FileLocation fileLocation = jf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new r80(21, jf0Var, fileLocation));
                    return;
                }
                return;
            case 21:
                i11 = ((org.telegram.ui.ActionBar.n2) ((jf0) this.f37064b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f37065c);
                return;
            case 22:
                kf0 kf0Var = (kf0) this.f37064b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f37065c;
                yg0 yg0Var2 = kf0Var.E;
                yg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (kf0Var.f35168r != null && kf0Var.f35169s != null && kf0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", kf0Var.f35168r);
                        bundle2.putString("phoneHash", kf0Var.f35169s);
                        bundle2.putString("code", kf0Var.v);
                        yg0Var2.u1(5, true, bundle2, false);
                        return;
                    }
                    yg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 23:
                bg0 bg0Var = (bg0) this.f37064b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f37065c);
                alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f18654a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.rk.h(new StringBuilder("+"), bg0Var.f32414b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f18654a.setOnDismissListener(new xf0(bg0Var, 0));
                alertDialog$Builder.o();
                return;
            case 24:
                bg0 bg0Var2 = (bg0) this.f37064b;
                bg0Var2.getClass();
                bg0Var2.f32419e0 = ((TLRPC.TL_error) this.f37065c).text;
                return;
            case 25:
                ((bg0) this.f37064b).f32436s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f37065c), false);
                return;
            case 26:
                Runnable runnable3 = (Runnable) this.f37065c;
                ds dsVar = ((bg0) this.f37064b).f32420f;
                int i15 = 0;
                while (true) {
                    gs[] gsVarArr2 = dsVar.f33125f;
                    if (i15 < gsVarArr2.length) {
                        gsVarArr2[i15].l(0.0f);
                        i15++;
                    } else {
                        runnable3.run();
                        dsVar.e = false;
                        return;
                    }
                }
            case 27:
                ((s3) this.f37064b).run((String) this.f37065c);
                return;
            case 28:
                ai0 ai0Var = (ai0) this.f37064b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f37065c;
                ai0Var.f32076c0 = false;
                if (tL_error3 == null) {
                    rh0 f02 = ai0Var.f0();
                    ai0Var.f32084j0.clear();
                    ai0Var.h0(f02);
                    return;
                }
                return;
            default:
                ai0 ai0Var2 = ((qh0) this.f37064b).f36917a;
                rh0 f03 = ai0Var2.f0();
                ai0Var2.f32083i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f37065c));
                TLRPC.ChatFull chatFull = ai0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ai0Var2.getMessagesStorage().saveChatLinksCount(ai0Var2.f32087n, ai0Var2.d.invitesCount);
                }
                ai0Var2.h0(f03);
                return;
        }
    }
}
