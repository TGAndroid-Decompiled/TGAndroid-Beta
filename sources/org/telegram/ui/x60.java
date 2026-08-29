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
public final class x60 implements Runnable {
    public final int f44500a;
    public final Object f44501b;
    public final Object f44502c;

    public x60(int i10, Object obj, Object obj2) {
        this.f44500a = i10;
        this.f44501b = obj;
        this.f44502c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f44500a) {
            case 0:
                TLObject tLObject = (TLObject) this.f44502c;
                z60 z60Var = ((y60) this.f44501b).f44755a;
                if (tLObject != null) {
                    c70.a0(z60Var.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    c70.a0(z60Var.h, null);
                    return;
                }
            case 1:
                b70 b70Var = (b70) this.f44501b;
                String str = (String) this.f44502c;
                b70Var.h = str;
                c70 c70Var = b70Var.f36706r;
                if (c70Var.J) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f22502q = str;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f22504q = str;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                b70Var.f36705n = c70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new x9(b70Var, str, str, 14), 66);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(11, (u70) this.f44501b, (CacheByChatsController.KeepMediaException) this.f44502c), 150L);
                return;
            case 3:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f44501b;
                languageSelectActivity.f35556e = (ArrayList) this.f44502c;
                languageSelectActivity.f35555c.l();
                return;
            case 4:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f44501b;
                String str2 = (String) this.f44502c;
                if (str2.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new x60(3, languageSelectActivity2, new ArrayList()));
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
                int size2 = languageSelectActivity2.f35557f.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f35557f.get(i13);
                    if (localeInfo2.name.toLowerCase().startsWith(str2) || localeInfo2.nameEnglish.toLowerCase().startsWith(str2)) {
                        arrayList.add(localeInfo2);
                    }
                }
                AndroidUtilities.runOnUIThread(new x60(3, languageSelectActivity2, arrayList));
                return;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.f44501b;
                TLObject tLObject2 = (TLObject) this.f44502c;
                Pattern pattern = LaunchActivity.f35560x1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    MessagesController.getInstance(launchActivity.K).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.K).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.K).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    tn tnVar = new tn(bundle);
                    tnVar.f42798ea = resolvedbusinesschatlinks;
                    launchActivity.q0(tnVar, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.c5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 6:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f44501b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f44502c;
                Pattern pattern2 = LaunchActivity.f35560x1;
                MessagesController.getInstance(launchActivity2.K).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.K);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 7:
                Pattern pattern3 = LaunchActivity.f35560x1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                b.j(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f44502c).text);
                org.telegram.ui.Components.c5.u0((i) this.f44501b, string, sb2.toString(), null);
                return;
            case 8:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f44501b;
                String str3 = (String) this.f44502c;
                if (!launchActivity3.m0.getFragmentStack().isEmpty()) {
                    launchActivity3.m0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str3).getQueryParameter("ref")));
                    return;
                }
                return;
            case 9:
                Pattern pattern4 = LaunchActivity.f35560x1;
                ((LaunchActivity) this.f44501b).j0((TL_account.Password) this.f44502c);
                return;
            case 10:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f44501b;
                Runnable runnable = (Runnable) this.f44502c;
                launchActivity4.m0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f35587n0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f35587n0.getView().getVisibility() == 0) {
                        launchActivity4.f35587n0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f35589o0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f35589o0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.mc mcVar = (org.telegram.ui.Components.mc) this.f44502c;
                if (!((LaunchActivity) this.f44501b).M && LaunchActivity.A1) {
                    mcVar.j();
                    return;
                }
                return;
            case 12:
                Pattern pattern5 = LaunchActivity.f35560x1;
                ((LaunchActivity) this.f44501b).p0((qc1) this.f44502c);
                return;
            case 13:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f44501b;
                ye.c cVar = (ye.c) this.f44502c;
                launchActivity5.L0 = null;
                launchActivity5.M0 = null;
                launchActivity5.N0 = null;
                launchActivity5.O0 = null;
                launchActivity5.R0 = null;
                launchActivity5.P0 = null;
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
            case 14:
                ye.c cVar2 = (ye.c) this.f44501b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f44502c;
                Pattern pattern6 = LaunchActivity.f35560x1;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (c2Var != null) {
                    c2Var.dismiss();
                    return;
                }
                return;
            case 15:
                mb0 mb0Var = (mb0) this.f44501b;
                TLObject tLObject3 = (TLObject) this.f44502c;
                mb0Var.a();
                if (tLObject3 != null) {
                    mb0Var.f40513a.j0((TL_account.Password) tLObject3);
                    return;
                }
                return;
            case 16:
                ((FiltersSetupActivity) this.f44502c).X(((mb0) this.f44501b).f40513a.O());
                return;
            case 17:
                rc0 rc0Var = (rc0) this.f44501b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f44502c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new lq(rc0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 18:
                rc0 rc0Var2 = (rc0) this.f44501b;
                rc0Var2.f42036c.setImageResource(R.drawable.msg_location_alert2);
                rc0Var2.e0(((LocationController.SharingLocationInfo) this.f44502c).proximityMeters);
                rc0Var2.C = false;
                return;
            case 19:
                ((EditText) this.f44501b).removeTextChangedListener((ag.c0) this.f44502c);
                return;
            case 20:
                Runnable runnable2 = (Runnable) this.f44502c;
                md0 md0Var = ((pd0) this.f44501b).f41371a;
                int i14 = 0;
                while (true) {
                    ur[] urVarArr = md0Var.f42455f;
                    if (i14 < urVarArr.length) {
                        urVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        md0Var.f42454e = false;
                        return;
                    }
                }
            case 21:
                xd0 xd0Var = (xd0) this.f44501b;
                fg0 fg0Var = xd0Var.f44568y;
                fg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(xd0Var.f44558a);
                fg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f44502c), false);
                return;
            case 22:
                xd0 xd0Var2 = (xd0) this.f44501b;
                String str4 = (String) this.f44502c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = xd0Var2.f44563n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str4), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                vd0 vd0Var = new vd0(xd0Var2, 2);
                if (z10) {
                    TL_account.Password password = xd0Var2.f44563n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        vd0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.o2) xd0Var2.f44568y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, vd0Var, 10);
                    return;
                }
                return;
            case 23:
                pe0 pe0Var = (pe0) this.f44501b;
                pe0Var.K.k1(false, false);
                AndroidUtilities.hideKeyboard(pe0Var.K.fragmentView.findFocus());
                pe0Var.K.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f44502c), true);
                TLRPC.FileLocation fileLocation = pe0Var.J;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new x60(24, pe0Var, fileLocation));
                    return;
                }
                return;
            case 24:
                i11 = ((org.telegram.ui.ActionBar.o2) ((pe0) this.f44501b).K).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f44502c);
                return;
            case 25:
                qe0 qe0Var = (qe0) this.f44501b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f44502c;
                fg0 fg0Var2 = qe0Var.A;
                fg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (qe0Var.f41706r != null && qe0Var.f41707s != null && qe0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", qe0Var.f41706r);
                        bundle2.putString("phoneHash", qe0Var.f41707s);
                        bundle2.putString("code", qe0Var.v);
                        fg0Var2.u1(5, true, bundle2, false);
                        return;
                    }
                    fg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 26:
                if0 if0Var = (if0) this.f44501b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f44502c);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f22714a.P = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.x3.k(new StringBuilder("+"), if0Var.f39232b, qe.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f22714a.setOnDismissListener(new df0(if0Var, 0));
                alertDialog$Builder.o();
                return;
            case 27:
                if0 if0Var2 = (if0) this.f44501b;
                if0Var2.getClass();
                if0Var2.f39231a0 = ((TLRPC.TL_error) this.f44502c).text;
                return;
            case 28:
                ((if0) this.f44501b).f39249o0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f44502c), false);
                return;
            default:
                Runnable runnable3 = (Runnable) this.f44502c;
                sr srVar = ((if0) this.f44501b).f39239f;
                int i15 = 0;
                while (true) {
                    ur[] urVarArr2 = srVar.f42455f;
                    if (i15 < urVarArr2.length) {
                        urVarArr2[i15].l(0.0f);
                        i15++;
                    } else {
                        runnable3.run();
                        srVar.f42454e = false;
                        return;
                    }
                }
        }
    }
}
