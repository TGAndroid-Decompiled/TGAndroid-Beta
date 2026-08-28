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
public final class x20 implements Runnable {
    public final int f44333a;
    public final Object f44334b;
    public final Object f44335c;

    public x20(int i9, Object obj, Object obj2) {
        this.f44333a = i9;
        this.f44334b = obj;
        this.f44335c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        byte[] bArr;
        int i9;
        int i10;
        switch (this.f44333a) {
            case 0:
                ((o50) ((v5) this.f44334b).f43386b).Q0.setNewColors((int[]) this.f44335c);
                return;
            case 1:
                z60.U((z60) this.f44334b, (TLRPC.TL_error) this.f44335c);
                return;
            case 2:
                v60 v60Var = (v60) this.f44334b;
                String str = (String) this.f44335c;
                w60 w60Var = v60Var.f43395a;
                w60Var.f43683e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                w60Var.f43682c = w60Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new v40(1, v60Var, str), 66);
                return;
            case 3:
                TLObject tLObject = (TLObject) this.f44335c;
                w60 w60Var2 = ((v60) this.f44334b).f43395a;
                if (tLObject != null) {
                    z60.Z(w60Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    z60.Z(w60Var2.h, null);
                    return;
                }
            case 4:
                y60 y60Var = (y60) this.f44334b;
                String str2 = (String) this.f44335c;
                y60Var.h = str2;
                z60 z60Var = y60Var.f44757r;
                if (z60Var.J) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f22490q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f22492q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                y60Var.f44756n = z60Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new y9(y60Var, str2, str2, 14), 66);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(14, (r70) this.f44334b, (CacheByChatsController.KeepMediaException) this.f44335c), 150L);
                return;
            case 6:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f44334b;
                languageSelectActivity.f35489e = (ArrayList) this.f44335c;
                languageSelectActivity.f35488c.l();
                return;
            case 7:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f44334b;
                String str3 = (String) this.f44335c;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new x20(6, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i11);
                    if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList.add(localeInfo);
                    }
                }
                int size2 = languageSelectActivity2.f35490f.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f35490f.get(i12);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList.add(localeInfo2);
                    }
                }
                AndroidUtilities.runOnUIThread(new x20(6, languageSelectActivity2, arrayList));
                return;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.f44334b;
                TLObject tLObject2 = (TLObject) this.f44335c;
                Pattern pattern = LaunchActivity.f35493x1;
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
                    qn qnVar = new qn(bundle);
                    qnVar.f41901ea = resolvedbusinesschatlinks;
                    launchActivity.q0(qnVar, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.y4.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f44334b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f44335c;
                Pattern pattern2 = LaunchActivity.f35493x1;
                MessagesController.getInstance(launchActivity2.K).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.K);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 10:
                Pattern pattern3 = LaunchActivity.f35493x1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.j2.k(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f44335c).text);
                org.telegram.ui.Components.y4.u0((h) this.f44334b, string, sb2.toString(), null);
                return;
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f44334b;
                String str4 = (String) this.f44335c;
                if (!launchActivity3.m0.getFragmentStack().isEmpty()) {
                    launchActivity3.m0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    return;
                }
                return;
            case 12:
                Pattern pattern4 = LaunchActivity.f35493x1;
                ((LaunchActivity) this.f44334b).j0((TL_account.Password) this.f44335c);
                return;
            case 13:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f44334b;
                Runnable runnable = (Runnable) this.f44335c;
                launchActivity4.m0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f35520n0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f35520n0.getView().getVisibility() == 0) {
                        launchActivity4.f35520n0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f35522o0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f35522o0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) this.f44335c;
                if (!((LaunchActivity) this.f44334b).M && LaunchActivity.A1) {
                    gcVar.j();
                    return;
                }
                return;
            case 15:
                Pattern pattern5 = LaunchActivity.f35493x1;
                ((LaunchActivity) this.f44334b).p0((oc1) this.f44335c);
                return;
            case 16:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f44334b;
                ve.d dVar = (ve.d) this.f44335c;
                launchActivity5.L0 = null;
                launchActivity5.M0 = null;
                launchActivity5.N0 = null;
                launchActivity5.O0 = null;
                launchActivity5.R0 = null;
                launchActivity5.P0 = null;
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            case 17:
                ve.d dVar2 = (ve.d) this.f44334b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f44335c;
                Pattern pattern6 = LaunchActivity.f35493x1;
                if (dVar2 != null) {
                    dVar2.b();
                }
                if (c2Var != null) {
                    c2Var.dismiss();
                    return;
                }
                return;
            case 18:
                kb0 kb0Var = (kb0) this.f44334b;
                TLObject tLObject3 = (TLObject) this.f44335c;
                kb0Var.a();
                if (tLObject3 != null) {
                    kb0Var.f39790a.j0((TL_account.Password) tLObject3);
                    return;
                }
                return;
            case 19:
                ((FiltersSetupActivity) this.f44335c).W(((kb0) this.f44334b).f39790a.O());
                return;
            case 20:
                pc0 pc0Var = (pc0) this.f44334b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f44335c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new jq(pc0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 21:
                pc0 pc0Var2 = (pc0) this.f44334b;
                pc0Var2.f41445c.setImageResource(R.drawable.msg_location_alert2);
                pc0Var2.d0(((LocationController.SharingLocationInfo) this.f44335c).proximityMeters);
                pc0Var2.C = false;
                return;
            case 22:
                ((EditText) this.f44334b).removeTextChangedListener((fh.t4) this.f44335c);
                return;
            case 23:
                Runnable runnable2 = (Runnable) this.f44335c;
                ld0 ld0Var = ((pd0) this.f44334b).f41482a;
                int i13 = 0;
                while (true) {
                    vr[] vrVarArr = ld0Var.f42755f;
                    if (i13 < vrVarArr.length) {
                        vrVarArr[i13].l(0.0f);
                        i13++;
                    } else {
                        runnable2.run();
                        ld0Var.f42754e = false;
                        return;
                    }
                }
            case 24:
                yd0 yd0Var = (yd0) this.f44334b;
                fg0 fg0Var = yd0Var.f44841y;
                fg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(yd0Var.f44831a);
                fg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f44335c), false);
                return;
            case 25:
                yd0 yd0Var2 = (yd0) this.f44334b;
                String str5 = (String) this.f44335c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = yd0Var2.f44836n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str5), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                wd0 wd0Var = new wd0(yd0Var2, 2);
                if (z10) {
                    TL_account.Password password = yd0Var2.f44836n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        wd0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i9 = ((org.telegram.ui.ActionBar.o2) yd0Var2.f44841y).currentAccount;
                    ConnectionsManager.getInstance(i9).sendRequest(tL_auth_checkPassword, wd0Var, 10);
                    return;
                }
                return;
            case 26:
                qe0 qe0Var = (qe0) this.f44334b;
                qe0Var.K.k1(false, false);
                AndroidUtilities.hideKeyboard(qe0Var.K.fragmentView.findFocus());
                qe0Var.K.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f44335c), true);
                TLRPC.FileLocation fileLocation = qe0Var.J;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new x20(27, qe0Var, fileLocation));
                    return;
                }
                return;
            case 27:
                i10 = ((org.telegram.ui.ActionBar.o2) ((qe0) this.f44334b).K).currentAccount;
                MessagesController.getInstance(i10).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f44335c);
                return;
            case 28:
                re0 re0Var = (re0) this.f44334b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f44335c;
                fg0 fg0Var2 = re0Var.A;
                fg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (re0Var.f42388r != null && re0Var.f42389s != null && re0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", re0Var.f42388r);
                        bundle2.putString("phoneHash", re0Var.f42389s);
                        bundle2.putString("code", re0Var.v);
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
            default:
                jf0 jf0Var = (jf0) this.f44334b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f44335c);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f22702a.P = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.ll.g(new StringBuilder("+"), jf0Var.f39471b, ne.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f22702a.setOnDismissListener(new ff0(jf0Var, 0));
                alertDialog$Builder.o();
                return;
        }
    }
}
