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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class w10 implements Runnable {
    public final int f39242a;
    public final Object f39243b;
    public final Object f39244c;

    public w10(int i10, Object obj, Object obj2) {
        this.f39242a = i10;
        this.f39243b = obj;
        this.f39244c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.f39242a;
        int i11 = 0;
        Object obj = this.f39244c;
        Object obj2 = this.f39243b;
        switch (i10) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f31579x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f31579x = true;
                    return;
                }
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = ((b20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ((e60) obj2).V1;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList2.get(i12)).f29919w != null) {
                        arrayList.remove(((org.telegram.ui.Components.voip.t) arrayList2.get(i12)).f29919w);
                    }
                }
                while (i11 < arrayList.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i11);
                    if (videoParticipant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                    }
                    i11++;
                }
                return;
            case 3:
                e60 e60Var = (e60) obj2;
                e60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                e60Var.dismiss();
                return;
            case 4:
                b6 b6Var = (b6) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.s2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new w10(5, b6Var, ph.g0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                ((e60) ((b6) obj2).f32745b).R0.setNewColors((int[]) obj);
                return;
            case 6:
                o70.V((o70) obj2, (TLRPC.TL_error) obj);
                return;
            case 7:
                k70 k70Var = (k70) obj2;
                String str = (String) obj;
                l70 l70Var = k70Var.f35437a;
                l70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                l70Var.f35669c = l70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new no(24, k70Var, str), 66);
                return;
            case 8:
                TLObject tLObject = (TLObject) obj;
                l70 l70Var2 = ((k70) obj2).f35437a;
                if (tLObject != null) {
                    o70.a0(l70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    o70.a0(l70Var2.h, null);
                    return;
                }
            case 9:
                n70 n70Var = (n70) obj2;
                String str2 = (String) obj;
                n70Var.h = str2;
                o70 o70Var = n70Var.f36401r;
                if (o70Var.K) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f19269q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f19271q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                n70Var.f36400n = o70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new da(n70Var, str2, str2, 14), 66);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(19, (f80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.f31582c.l();
                return;
            case 12:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new w10(11, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList3 = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i13 = 0; i13 < size; i13++) {
                    LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i13);
                    if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList3.add(localeInfo);
                    }
                }
                int size2 = languageSelectActivity2.f31583f.size();
                while (i11 < size2) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f31583f.get(i11);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList3.add(localeInfo2);
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(new w10(11, languageSelectActivity2, arrayList3));
                return;
            case 13:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject2 = (TLObject) obj;
                Pattern pattern = LaunchActivity.f31586y1;
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
                    zn znVar = new zn(bundle);
                    znVar.fa = resolvedbusinesschatlinks;
                    launchActivity.q0(znVar, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.z4.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 14:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                Pattern pattern2 = LaunchActivity.f31586y1;
                MessagesController.getInstance(launchActivity2.L).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.L);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 15:
                Pattern pattern3 = LaunchActivity.f31586y1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb = new StringBuilder();
                b.i(R.string.ErrorOccurred, "\n", sb);
                sb.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.z4.u0((i) obj2, string, sb.toString(), null);
                return;
            case 16:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str4 = (String) obj;
                if (!launchActivity3.f31612n0.getFragmentStack().isEmpty()) {
                    launchActivity3.f31612n0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    return;
                }
                return;
            case 17:
                Pattern pattern4 = LaunchActivity.f31586y1;
                ((LaunchActivity) obj2).j0((TL_account.Password) obj);
                return;
            case 18:
                LaunchActivity launchActivity4 = (LaunchActivity) obj2;
                Runnable runnable = (Runnable) obj;
                launchActivity4.f31612n0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f31614o0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f31614o0.getView().getVisibility() == 0) {
                        launchActivity4.f31614o0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f31616p0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f31616p0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.ic icVar = (org.telegram.ui.Components.ic) obj;
                if (!((LaunchActivity) obj2).N && LaunchActivity.B1) {
                    icVar.j();
                    return;
                }
                return;
            case 20:
                Pattern pattern5 = LaunchActivity.f31586y1;
                ((LaunchActivity) obj2).p0((jd1) obj);
                return;
            case 21:
                LaunchActivity launchActivity5 = (LaunchActivity) obj2;
                ze.c cVar = (ze.c) obj;
                launchActivity5.M0 = null;
                launchActivity5.N0 = null;
                launchActivity5.O0 = null;
                launchActivity5.P0 = null;
                launchActivity5.S0 = null;
                launchActivity5.Q0 = null;
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
            case 22:
                ze.c cVar2 = (ze.c) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                Pattern pattern6 = LaunchActivity.f31586y1;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (d2Var != null) {
                    d2Var.dismiss();
                    return;
                }
                return;
            case 23:
                yb0 yb0Var = (yb0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                yb0Var.a();
                if (tLObject3 != null) {
                    yb0Var.f40221a.j0((TL_account.Password) tLObject3);
                    return;
                }
                return;
            case 24:
                ((FiltersSetupActivity) obj2).X(((yb0) obj).f40221a.O());
                return;
            case 25:
                cd0 cd0Var = (cd0) obj2;
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
                    AndroidUtilities.runOnUIThread(new tq(cd0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 26:
                cd0 cd0Var2 = (cd0) obj2;
                cd0Var2.f33087c.setImageResource(R.drawable.msg_location_alert2);
                cd0Var2.e0(((LocationController.SharingLocationInfo) obj).proximityMeters);
                cd0Var2.D = false;
                return;
            case 27:
                ((EditText) obj2).removeTextChangedListener((cg.b0) obj);
                return;
            case 28:
                Runnable runnable2 = (Runnable) obj;
                xd0 xd0Var = ((ae0) obj2).f32561a;
                int i14 = 0;
                while (true) {
                    ds[] dsVarArr = xd0Var.f32635f;
                    if (i14 < dsVarArr.length) {
                        dsVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        xd0Var.e = false;
                        return;
                    }
                }
            default:
                je0 je0Var = (je0) obj2;
                pg0 pg0Var = je0Var.f35261y;
                pg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(je0Var.f35252a);
                pg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
        }
    }

    public w10(yb0 yb0Var, FiltersSetupActivity filtersSetupActivity) {
        this.f39242a = 24;
        this.f39244c = yb0Var;
        this.f39243b = filtersSetupActivity;
    }
}
