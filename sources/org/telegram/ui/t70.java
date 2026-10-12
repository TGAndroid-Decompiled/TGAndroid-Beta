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
import org.telegram.messenger.CacheByChatsController;
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
public final class t70 implements Runnable {
    public final int f42111a;
    public final Object f42112b;
    public final Object f42113c;

    public t70(int i10, Object obj, Object obj2) {
        this.f42111a = i10;
        this.f42112b = obj;
        this.f42113c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f42111a) {
            case 0:
                u70 u70Var = (u70) this.f42112b;
                String str = (String) this.f42113c;
                u70Var.h = str;
                v70 v70Var = u70Var.f42390r;
                if (v70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f19912q = str;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f19914q = str;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                u70Var.f42389n = v70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ea(u70Var, str, str, 14), 66);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.f6(6, (o80) this.f42112b, (CacheByChatsController.KeepMediaException) this.f42113c), 150L);
                return;
            case 2:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f42112b;
                languageSelectActivity.f33610e = (ArrayList) this.f42113c;
                languageSelectActivity.f33609c.l();
                return;
            case 3:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f42112b;
                String str2 = (String) this.f42113c;
                if (str2.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new t70(2, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i12 = 0; i12 < size; i12++) {
                    LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i12);
                    if (localeInfo.name.toLowerCase().startsWith(str2) || localeInfo.nameEnglish.toLowerCase().startsWith(str2)) {
                        arrayList.add(localeInfo);
                    }
                }
                int size2 = languageSelectActivity2.f33611f.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f33611f.get(i13);
                    if (localeInfo2.name.toLowerCase().startsWith(str2) || localeInfo2.nameEnglish.toLowerCase().startsWith(str2)) {
                        arrayList.add(localeInfo2);
                    }
                }
                AndroidUtilities.runOnUIThread(new t70(2, languageSelectActivity2, arrayList));
                return;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) this.f42112b;
                TLObject tLObject = (TLObject) this.f42113c;
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
                    eo eoVar = new eo(bundle);
                    eoVar.f37299ia = resolvedbusinesschatlinks;
                    launchActivity.q0(eoVar, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.g5.M(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 5:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f42112b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f42113c;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j3, j3, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 6:
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f42113c).text);
                org.telegram.ui.Components.g5.t0((h) this.f42112b, string, sb2.toString(), null);
                return;
            case 7:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f42112b;
                String str3 = (String) this.f42113c;
                if (!launchActivity3.f33644q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f33644q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str3).getQueryParameter("ref")));
                    return;
                }
                return;
            case 8:
                Pattern pattern4 = LaunchActivity.B1;
                ((LaunchActivity) this.f42112b).j0((TL_account.Password) this.f42113c);
                return;
            case 9:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f42112b;
                Runnable runnable = (Runnable) this.f42113c;
                launchActivity4.f33644q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f33646r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f33646r0.getView().getVisibility() == 0) {
                        launchActivity4.f33646r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f33648s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f33648s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) this.f42113c;
                if (!((LaunchActivity) this.f42112b).Q && LaunchActivity.E1) {
                    scVar.j();
                    return;
                }
                return;
            case 11:
                Pattern pattern5 = LaunchActivity.B1;
                ((LaunchActivity) this.f42112b).p0((zd1) this.f42113c);
                return;
            case 12:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f42112b;
                of.e eVar = (of.e) this.f42113c;
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
            case 13:
                of.e eVar2 = (of.e) this.f42112b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f42113c;
                Pattern pattern6 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 14:
                fc0 fc0Var = (fc0) this.f42112b;
                TLObject tLObject2 = (TLObject) this.f42113c;
                fc0Var.c();
                if (tLObject2 != null) {
                    fc0Var.f37710a.j0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 15:
                ((FiltersSetupActivity) this.f42113c).X(((fc0) this.f42112b).f37710a.O());
                return;
            case 16:
                id0 id0Var = (id0) this.f42112b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f42113c;
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
            case 17:
                id0 id0Var2 = (id0) this.f42112b;
                id0Var2.f38846c.setImageResource(R.drawable.msg_location_alert2);
                id0Var2.d0(((LocationController.SharingLocationInfo) this.f42113c).proximityMeters);
                id0Var2.G = false;
                return;
            case 18:
                ((EditText) this.f42112b).removeTextChangedListener((org.telegram.ui.Components.jo) this.f42113c);
                return;
            case 19:
                Runnable runnable2 = (Runnable) this.f42113c;
                de0 de0Var = ((ge0) this.f42112b).f38018a;
                int i14 = 0;
                while (true) {
                    hs[] hsVarArr = de0Var.f37837f;
                    if (i14 < hsVarArr.length) {
                        hsVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        de0Var.f37836e = false;
                        return;
                    }
                }
            case 20:
                pe0 pe0Var = (pe0) this.f42112b;
                xg0 xg0Var = pe0Var.f40944y;
                xg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(pe0Var.f40934a);
                xg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f42113c), false);
                return;
            case 21:
                pe0 pe0Var2 = (pe0) this.f42112b;
                String str4 = (String) this.f42113c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = pe0Var2.f40939n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str4), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                ne0 ne0Var = new ne0(pe0Var2, 2);
                if (z10) {
                    TL_account.Password password = pe0Var2.f40939n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        ne0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.m2) pe0Var2.f40944y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, ne0Var, 10);
                    return;
                }
                return;
            case 22:
                hf0 hf0Var = (hf0) this.f42112b;
                hf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(hf0Var.O.fragmentView.findFocus());
                hf0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f42113c), true);
                TLRPC.FileLocation fileLocation = hf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new t70(23, hf0Var, fileLocation));
                    return;
                }
                return;
            case 23:
                i11 = ((org.telegram.ui.ActionBar.m2) ((hf0) this.f42112b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f42113c);
                return;
            case 24:
                if0 if0Var = (if0) this.f42112b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f42113c;
                xg0 xg0Var2 = if0Var.E;
                xg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (if0Var.f38894r != null && if0Var.f38895s != null && if0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", if0Var.f38894r);
                        bundle2.putString("phoneHash", if0Var.f38895s);
                        bundle2.putString("code", if0Var.v);
                        xg0Var2.u1(5, true, bundle2, false);
                        return;
                    }
                    xg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 25:
                zf0 zf0Var = (zf0) this.f42112b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f42113c);
                alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f20141a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.am.g(new StringBuilder("+"), zf0Var.f44810b, hf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f20141a.setOnDismissListener(new vf0(zf0Var, 0));
                alertDialog$Builder.o();
                return;
            case 26:
                zf0 zf0Var2 = (zf0) this.f42112b;
                zf0Var2.getClass();
                zf0Var2.f44816e0 = ((TLRPC.TL_error) this.f42113c).text;
                return;
            case 27:
                ((zf0) this.f42112b).f44833s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f42113c), false);
                return;
            case 28:
                Runnable runnable3 = (Runnable) this.f42113c;
                fs fsVar = ((zf0) this.f42112b).f44817f;
                int i15 = 0;
                while (true) {
                    hs[] hsVarArr2 = fsVar.f37837f;
                    if (i15 < hsVarArr2.length) {
                        hsVarArr2[i15].l(0.0f);
                        i15++;
                    } else {
                        runnable3.run();
                        fsVar.f37836e = false;
                        return;
                    }
                }
            default:
                ((t3) this.f42112b).run((String) this.f42113c);
                return;
        }
    }
}
