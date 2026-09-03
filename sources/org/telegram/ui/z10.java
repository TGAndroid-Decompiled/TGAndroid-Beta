package org.telegram.ui;

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
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class z10 implements Runnable {
    public final int f43765a;
    public final Object f43766b;
    public final Object f43767c;

    public z10(int i10, Object obj, Object obj2) {
        this.f43765a = i10;
        this.f43766b = obj;
        this.f43767c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        byte[] bArr;
        int i10;
        int i11 = this.f43765a;
        int i12 = 0;
        Object obj = this.f43767c;
        Object obj2 = this.f43766b;
        switch (i11) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = ((a20) obj2).f35001e;
                filtersSetupActivity.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ((d60) obj2).V1;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList2.get(i13)).f32394w != null) {
                        arrayList.remove(((org.telegram.ui.Components.voip.u) arrayList2.get(i13)).f32394w);
                    }
                }
                while (i12 < arrayList.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i12);
                    if (videoParticipant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                    }
                    i12++;
                }
                return;
            case 2:
                d60 d60Var = (d60) obj2;
                d60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                d60Var.dismiss();
                return;
            case 3:
                z5 z5Var = (z5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.t2) obj).f32357e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new z10(4, z5Var, qh.g0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 4:
                ((d60) ((z5) obj2).f43799b).R0.setNewColors((int[]) obj);
                return;
            case 5:
                n70.V((n70) obj2, (TLRPC.TL_error) obj);
                return;
            case 6:
                j70 j70Var = (j70) obj2;
                String str = (String) obj;
                k70 k70Var = j70Var.f37855a;
                k70Var.f38201e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                k70Var.f38200c = k70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new lo(24, j70Var, str), 66);
                return;
            case 7:
                TLObject tLObject = (TLObject) obj;
                k70 k70Var2 = ((j70) obj2).f37855a;
                if (tLObject != null) {
                    n70.a0(k70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    n70.a0(k70Var2.h, null);
                    return;
                }
            case 8:
                m70 m70Var = (m70) obj2;
                String str2 = (String) obj;
                m70Var.h = str2;
                n70 n70Var = m70Var.f38874r;
                if (n70Var.K) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f20955q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f20957q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                m70Var.f38873n = n70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ba(m70Var, str2, str2, 14), 66);
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(18, (e80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            case 10:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.f34130e = (ArrayList) obj;
                languageSelectActivity.f34129c.l();
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new z10(10, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList3 = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i14 = 0; i14 < size; i14++) {
                    LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i14);
                    if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList3.add(localeInfo);
                    }
                }
                int size2 = languageSelectActivity2.f34131f.size();
                while (i12 < size2) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f34131f.get(i12);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList3.add(localeInfo2);
                    }
                    i12++;
                }
                AndroidUtilities.runOnUIThread(new z10(10, languageSelectActivity2, arrayList3));
                return;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject2 = (TLObject) obj;
                Pattern pattern = LaunchActivity.f34134y1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    MessagesController.getInstance(launchActivity.L).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.L).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.L).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    xn xnVar = new xn(bundle);
                    xnVar.fa = resolvedbusinesschatlinks;
                    launchActivity.q0(xnVar, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.z4.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 13:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                Pattern pattern2 = LaunchActivity.f34134y1;
                MessagesController.getInstance(launchActivity2.L).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.L);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 14:
                Pattern pattern3 = LaunchActivity.f34134y1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb = new StringBuilder();
                b.i(R.string.ErrorOccurred, "\n", sb);
                sb.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.z4.u0((i) obj2, string, sb.toString(), null);
                return;
            case 15:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str4 = (String) obj;
                if (!launchActivity3.f34160n0.getFragmentStack().isEmpty()) {
                    launchActivity3.f34160n0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    return;
                }
                return;
            case 16:
                Pattern pattern4 = LaunchActivity.f34134y1;
                ((LaunchActivity) obj2).j0((TL_account.Password) obj);
                return;
            case 17:
                LaunchActivity launchActivity4 = (LaunchActivity) obj2;
                Runnable runnable = (Runnable) obj;
                launchActivity4.f34160n0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f34162o0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f34162o0.getView().getVisibility() == 0) {
                        launchActivity4.f34162o0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f34164p0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f34164p0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.ic icVar = (org.telegram.ui.Components.ic) obj;
                if (!((LaunchActivity) obj2).N && LaunchActivity.B1) {
                    icVar.j();
                    return;
                }
                return;
            case 19:
                Pattern pattern5 = LaunchActivity.f34134y1;
                ((LaunchActivity) obj2).p0((jd1) obj);
                return;
            case 20:
                LaunchActivity launchActivity5 = (LaunchActivity) obj2;
                af.f fVar = (af.f) obj;
                launchActivity5.M0 = null;
                launchActivity5.N0 = null;
                launchActivity5.O0 = null;
                launchActivity5.P0 = null;
                launchActivity5.S0 = null;
                launchActivity5.Q0 = null;
                if (fVar != null) {
                    fVar.b();
                    return;
                }
                return;
            case 21:
                af.f fVar2 = (af.f) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                Pattern pattern6 = LaunchActivity.f34134y1;
                if (fVar2 != null) {
                    fVar2.b();
                }
                if (d2Var != null) {
                    d2Var.dismiss();
                    return;
                }
                return;
            case 22:
                xb0 xb0Var = (xb0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                xb0Var.a();
                if (tLObject3 != null) {
                    xb0Var.f43000a.j0((TL_account.Password) tLObject3);
                    return;
                }
                return;
            case 23:
                ((FiltersSetupActivity) obj).X(((xb0) obj2).f43000a.O());
                return;
            case 24:
                bd0 bd0Var = (bd0) obj2;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new sq(bd0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 25:
                bd0 bd0Var2 = (bd0) obj2;
                bd0Var2.f35472c.setImageResource(R.drawable.msg_location_alert2);
                bd0Var2.e0(((LocationController.SharingLocationInfo) obj).proximityMeters);
                bd0Var2.D = false;
                return;
            case 26:
                ((EditText) obj2).removeTextChangedListener((dg.b0) obj);
                return;
            case 27:
                Runnable runnable2 = (Runnable) obj;
                wd0 wd0Var = ((zd0) obj2).f43912a;
                int i15 = 0;
                while (true) {
                    cs[] csVarArr = wd0Var.f44011f;
                    if (i15 < csVarArr.length) {
                        csVarArr[i15].l(0.0f);
                        i15++;
                    } else {
                        runnable2.run();
                        wd0Var.f44010e = false;
                        return;
                    }
                }
            case 28:
                he0 he0Var = (he0) obj2;
                og0 og0Var = he0Var.f37353y;
                og0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(he0Var.f37343a);
                og0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            default:
                he0 he0Var2 = (he0) obj2;
                String str5 = (String) obj;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = he0Var2.f37348n.current_algo;
                boolean z4 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z4) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str5), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                fe0 fe0Var = new fe0(he0Var2, 2);
                if (z4) {
                    TL_account.Password password = he0Var2.f37348n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        fe0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.p2) he0Var2.f37353y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, fe0Var, 10);
                    return;
                }
                return;
        }
    }
}
