package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
public final class uv implements Runnable {
    public final int f37346a;
    public final Object f37347b;
    public final Object f37348c;

    public uv(int i10, Object obj, Object obj2) {
        this.f37346a = i10;
        this.f37347b = obj;
        this.f37348c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f37346a;
        int i12 = 0;
        Object obj = this.f37348c;
        Object obj2 = this.f37347b;
        switch (i11) {
            case 0:
                wy.e0((wy) obj2, (String) obj);
                return;
            case 1:
                di.n3.j(((wy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 2:
                wy wyVar = (wy) obj2;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj;
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new rv(wyVar, 24), 300L);
                return;
            case 3:
                ((vy) obj).f37645a.postOnAnimation(new rv((wy) obj2, 14));
                return;
            case 4:
                wy wyVar2 = (wy) obj2;
                ArrayList<Long> arrayList = (ArrayList) obj;
                MessagesController messagesController = wyVar2.getMessagesController();
                if (wyVar2.V2 == 0 && wyVar2.X2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList, i10, -1, null, 0L);
                return;
            case 5:
                ArrayList arrayList2 = (ArrayList) obj;
                wy wyVar3 = ((vw) obj2).f37634b;
                wyVar3.y3 = 2;
                wyVar3.A4(true, true);
                wyVar3.o3();
                while (i12 < arrayList2.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList2.get(i12)).f17199id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i12);
                    if (wyVar3.getMessagesController().isForum(j3) || wyVar3.getMessagesController().isMonoForumWithManageRights(j3)) {
                        wyVar3.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    wyVar3.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController2 = wyVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 6:
                ((vw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 7:
                CharSequence charSequence = (CharSequence) obj;
                wy wyVar4 = ((hx) obj2).f33481a;
                wyVar4.H2 = null;
                org.telegram.ui.Components.xq0 xq0Var = wyVar4.G2;
                if (xq0Var != null && xq0Var.h) {
                    xq0Var.e(charSequence, false);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.p2[] p2VarArr = (org.telegram.ui.ActionBar.p2[]) obj;
                ((vx) obj2).f37644b.removeSelfFromStack();
                if (p2VarArr[1] != null) {
                    p2VarArr[0].removeSelfFromStack();
                    p2VarArr[1].finishFragment();
                    return;
                }
                p2VarArr[0].finishFragment();
                return;
            case 9:
                iz izVar = (iz) obj2;
                eo eoVar = izVar.f33815a;
                org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(eoVar.getParentActivity(), izVar.f33815a, ((MessageObject) obj).getInputStickerSet(), null, eoVar.Y, eoVar.getResourceProvider());
                hy0Var.setCalcMandatoryInsets(eoVar.x9());
                eoVar.showDialog(hy0Var);
                return;
            case 10:
                c00 c00Var = (c00) obj2;
                c00Var.getClass();
                ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                d00 d00Var = c00Var.E;
                e00 e00Var = d00Var.f31799c;
                Utilities.Callback callback = e00Var.f32010x;
                if (callback != null) {
                    callback.run(e00Var.d);
                }
                d00Var.f31799c.finishFragment();
                return;
            case 11:
                h10 h10Var = (h10) obj2;
                e00 e00Var2 = new e00(h10Var.f33237r, ((y00) obj).f38864m);
                e00Var2.f32011y = new h00(h10Var, 1);
                e00Var2.f32010x = new h00(h10Var, 2);
                h10Var.presentFragment(e00Var2);
                return;
            case 12:
                h10 h10Var2 = (h10) obj2;
                Runnable runnable = (Runnable) obj;
                h10Var2.h = false;
                h10Var2.f33238s = false;
                h10Var2.f33237r.flags = h10Var2.f33241y;
                h10Var2.i0(true);
                h10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                h10 h10Var3 = (h10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = h10Var3.L;
                h10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    h10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    h10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList3.clear();
                    arrayList3.addAll(tL_chatlists_exportedInvites.invites);
                    h10Var3.w0();
                }
                h10Var3.M = 0;
                return;
            case 14:
                h10 h10Var4 = (h10) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                MessagesController.DialogFilter dialogFilter = h10Var4.f33237r;
                if (d2Var != null) {
                    try {
                        d2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                h10Var4.getMessagesController().removeFilter(dialogFilter);
                h10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                h10Var4.finishFragment();
                return;
            case 15:
                h10 h10Var5 = (h10) obj2;
                h10Var5.getClass();
                h10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 16:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f29920x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f29920x = true;
                    return;
                }
                return;
            case 17:
                FiltersSetupActivity filtersSetupActivity2 = ((f20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 18:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((j60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList5.get(i14)).f28437w != null) {
                        arrayList4.remove(((org.telegram.ui.Components.voip.t) arrayList5.get(i14)).f28437w);
                    }
                }
                while (i12 < arrayList4.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList4.get(i12);
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
            case 19:
                j60 j60Var = (j60) obj2;
                j60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                j60Var.dismiss();
                return;
            case 20:
                x5 x5Var = (x5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.r2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new uv(21, x5Var, bi.r0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 21:
                ((j60) ((x5) obj2).f38583b).U0.setNewColors((int[]) obj);
                return;
            case 22:
                s70.V((s70) obj2, (TLRPC.TL_error) obj);
                return;
            case 23:
                o70 o70Var = (o70) obj2;
                String str = (String) obj;
                p70 p70Var = o70Var.f35409a;
                p70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                p70Var.f35694c = p70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new org.telegram.ui.Components.th(19, o70Var, str), 66);
                return;
            case 24:
                TLObject tLObject2 = (TLObject) obj;
                p70 p70Var2 = ((o70) obj2).f35409a;
                if (tLObject2 != null) {
                    s70.a0(p70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    s70.a0(p70Var2.h, null);
                    return;
                }
            case 25:
                r70 r70Var = (r70) obj2;
                String str2 = (String) obj;
                r70Var.h = str2;
                s70 s70Var = r70Var.f36253r;
                if (s70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f17305q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f17307q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                r70Var.f36252n = s70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(r70Var, str2, str2, 14), 66);
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new n(5, (m80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            case 27:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.f29923c.l();
                return;
            case 28:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new uv(27, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList6 = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i15 = 0; i15 < size; i15++) {
                    LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i15);
                    if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList6.add(localeInfo);
                    }
                }
                int size2 = languageSelectActivity2.f29924f.size();
                while (i12 < size2) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f29924f.get(i12);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList6.add(localeInfo2);
                    }
                    i12++;
                }
                AndroidUtilities.runOnUIThread(new uv(27, languageSelectActivity2, arrayList6));
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject3 = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject3 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject3;
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
                    eo eoVar2 = new eo(bundle);
                    eoVar2.f32364ia = resolvedbusinesschatlinks;
                    launchActivity.q0(eoVar2, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.d5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
        }
    }
}
