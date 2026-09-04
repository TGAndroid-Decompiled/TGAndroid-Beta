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
    public final int f40097a;
    public final Object f40098b;
    public final Object f40099c;

    public r80(int i10, Object obj, Object obj2) {
        this.f40097a = i10;
        this.f40098b = obj;
        this.f40099c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f40097a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f40098b;
                languageSelectActivity.f33419e = (ArrayList) this.f40099c;
                languageSelectActivity.f33418c.l();
                return;
            case 1:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f40098b;
                String str = (String) this.f40099c;
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
                int size2 = languageSelectActivity2.f33420f.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f33420f.get(i13);
                    if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                        arrayList.add(localeInfo2);
                    }
                }
                AndroidUtilities.runOnUIThread(new r80(0, languageSelectActivity2, arrayList));
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.f40098b;
                TLObject tLObject = (TLObject) this.f40099c;
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
                    co coVar = new co(bundle);
                    coVar.f35295ia = resolvedbusinesschatlinks;
                    launchActivity.q0(coVar, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.e5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f40098b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f40099c;
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
                org.telegram.messenger.wl.l(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f40099c).text);
                org.telegram.ui.Components.e5.u0((h) this.f40098b, string, sb2.toString(), null);
                return;
            case 5:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f40098b;
                String str2 = (String) this.f40099c;
                if (!launchActivity3.f33453q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f33453q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str2).getQueryParameter("ref")));
                    return;
                }
                return;
            case 6:
                Pattern pattern4 = LaunchActivity.B1;
                ((LaunchActivity) this.f40098b).j0((TL_account.Password) this.f40099c);
                return;
            case 7:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f40098b;
                Runnable runnable = (Runnable) this.f40099c;
                launchActivity4.f33453q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f33455r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f33455r0.getView().getVisibility() == 0) {
                        launchActivity4.f33455r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f33457s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f33457s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f40099c;
                if (!((LaunchActivity) this.f40098b).Q && LaunchActivity.E1) {
                    qcVar.j();
                    return;
                }
                return;
            case 9:
                Pattern pattern5 = LaunchActivity.B1;
                ((LaunchActivity) this.f40098b).p0((wd1) this.f40099c);
                return;
            case 10:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f40098b;
                of.e eVar = (of.e) this.f40099c;
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
                of.e eVar2 = (of.e) this.f40098b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f40099c;
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
                fc0 fc0Var = (fc0) this.f40098b;
                TLObject tLObject2 = (TLObject) this.f40099c;
                fc0Var.a();
                if (tLObject2 != null) {
                    fc0Var.f36367a.j0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 13:
                ((FiltersSetupActivity) this.f40099c).X(((fc0) this.f40098b).f36367a.O());
                return;
            case 14:
                id0 id0Var = (id0) this.f40098b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f40099c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new yq(id0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 15:
                id0 id0Var2 = (id0) this.f40098b;
                id0Var2.f37307c.setImageResource(R.drawable.msg_location_alert2);
                id0Var2.e0(((LocationController.SharingLocationInfo) this.f40099c).proximityMeters);
                id0Var2.G = false;
                return;
            case 16:
                ((EditText) this.f40098b).removeTextChangedListener((org.telegram.ui.Components.pn) this.f40099c);
                return;
            case 17:
                Runnable runnable2 = (Runnable) this.f40099c;
                de0 de0Var = ((ge0) this.f40098b).f36642a;
                int i14 = 0;
                while (true) {
                    gs[] gsVarArr = de0Var.f36163f;
                    if (i14 < gsVarArr.length) {
                        gsVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        de0Var.f36162e = false;
                        return;
                    }
                }
            case 18:
                pe0 pe0Var = (pe0) this.f40098b;
                wg0 wg0Var = pe0Var.f39493y;
                wg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(pe0Var.f39483a);
                wg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f40099c), false);
                return;
            case 19:
                pe0 pe0Var2 = (pe0) this.f40098b;
                String str3 = (String) this.f40099c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = pe0Var2.f39488n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                ne0 ne0Var = new ne0(pe0Var2, 2);
                if (z10) {
                    TL_account.Password password = pe0Var2.f39488n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        ne0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.n2) pe0Var2.f39493y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, ne0Var, 10);
                    return;
                }
                return;
            case 20:
                hf0 hf0Var = (hf0) this.f40098b;
                hf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(hf0Var.O.fragmentView.findFocus());
                hf0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f40099c), true);
                TLRPC.FileLocation fileLocation = hf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new r80(21, hf0Var, fileLocation));
                    return;
                }
                return;
            case 21:
                i11 = ((org.telegram.ui.ActionBar.n2) ((hf0) this.f40098b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f40099c);
                return;
            case 22:
                if0 if0Var = (if0) this.f40098b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f40099c;
                wg0 wg0Var2 = if0Var.E;
                wg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (if0Var.f37355r != null && if0Var.f37356s != null && if0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", if0Var.f37355r);
                        bundle2.putString("phoneHash", if0Var.f37356s);
                        bundle2.putString("code", if0Var.v);
                        wg0Var2.u1(5, true, bundle2, false);
                        return;
                    }
                    wg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 23:
                zf0 zf0Var = (zf0) this.f40098b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f40099c);
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f20198a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.w1.j(new StringBuilder("+"), zf0Var.f43398b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f20198a.setOnDismissListener(new vf0(zf0Var, 0));
                alertDialog$Builder.o();
                return;
            case 24:
                zf0 zf0Var2 = (zf0) this.f40098b;
                zf0Var2.getClass();
                zf0Var2.f43404e0 = ((TLRPC.TL_error) this.f40099c).text;
                return;
            case 25:
                ((zf0) this.f40098b).f43421s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f40099c), false);
                return;
            case 26:
                Runnable runnable3 = (Runnable) this.f40099c;
                es esVar = ((zf0) this.f40098b).f43405f;
                int i15 = 0;
                while (true) {
                    gs[] gsVarArr2 = esVar.f36163f;
                    if (i15 < gsVarArr2.length) {
                        gsVarArr2[i15].l(0.0f);
                        i15++;
                    } else {
                        runnable3.run();
                        esVar.f36162e = false;
                        return;
                    }
                }
            case 27:
                ((t3) this.f40098b).run((String) this.f40099c);
                return;
            case 28:
                yh0 yh0Var = (yh0) this.f40098b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f40099c;
                yh0Var.f43124c0 = false;
                if (tL_error3 == null) {
                    ph0 f02 = yh0Var.f0();
                    yh0Var.f43133j0.clear();
                    yh0Var.h0(f02);
                    return;
                }
                return;
            default:
                yh0 yh0Var2 = ((oh0) this.f40098b).f39250a;
                ph0 f03 = yh0Var2.f0();
                yh0Var2.f43132i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f40099c));
                TLRPC.ChatFull chatFull = yh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    yh0Var2.getMessagesStorage().saveChatLinksCount(yh0Var2.f43136n, yh0Var2.d.invitesCount);
                }
                yh0Var2.h0(f03);
                return;
        }
    }
}
