package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
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
public final class tv implements Runnable {
    public final int f37937a;
    public final Object f37938b;
    public final Object f37939c;

    public tv(int i10, Object obj, Object obj2) {
        this.f37937a = i10;
        this.f37938b = obj;
        this.f37939c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f37937a;
        int i12 = 0;
        Object obj = this.f37939c;
        Object obj2 = this.f37938b;
        switch (i11) {
            case 0:
                ei.k3.j(((ty) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 1:
                ty tyVar = (ty) obj2;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    g3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new nv(tyVar, 23), 300L);
                return;
            case 2:
                ty tyVar2 = (ty) obj2;
                ArrayList<Long> arrayList = (ArrayList) obj;
                MessagesController messagesController = tyVar2.getMessagesController();
                if (tyVar2.V2 == 0 && tyVar2.X2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList, i10, -1, null, 0L);
                return;
            case 3:
                CharSequence charSequence = (CharSequence) obj;
                ty tyVar3 = ((bx) obj2).f32452a;
                tyVar3.H2 = null;
                org.telegram.ui.Components.ar0 ar0Var = tyVar3.G2;
                if (ar0Var != null && ar0Var.h) {
                    ar0Var.e(charSequence, false);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.o2[] o2VarArr = (org.telegram.ui.ActionBar.o2[]) obj;
                ((px) obj2).f36560b.removeSelfFromStack();
                if (o2VarArr[1] != null) {
                    o2VarArr[0].removeSelfFromStack();
                    o2VarArr[1].finishFragment();
                    return;
                }
                o2VarArr[0].finishFragment();
                return;
            case 5:
                ArrayList arrayList2 = (ArrayList) obj;
                ty tyVar4 = ((ky) obj2).f35193b;
                tyVar4.y3 = 2;
                tyVar4.J4(true, true);
                tyVar4.x3();
                while (i12 < arrayList2.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList2.get(i12)).f18333id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i12);
                    if (tyVar4.getMessagesController().isForum(j3) || tyVar4.getMessagesController().isMonoForumWithManageRights(j3)) {
                        tyVar4.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    tyVar4.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController2 = tyVar4.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 6:
                ((ky) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 7:
                fz fzVar = (fz) obj2;
                xn xnVar = fzVar.f33657a;
                org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(xnVar.getParentActivity(), fzVar.f33657a, ((MessageObject) obj).getInputStickerSet(), null, xnVar.Y, xnVar.getResourceProvider());
                hy0Var.setCalcMandatoryInsets(xnVar.x9());
                xnVar.showDialog(hy0Var);
                return;
            case 8:
                zz zzVar = (zz) obj2;
                zzVar.getClass();
                ((org.telegram.ui.ActionBar.c2) obj).dismiss();
                a00 a00Var = zzVar.E;
                b00 b00Var = a00Var.f31933c;
                Utilities.Callback callback = b00Var.f32196x;
                if (callback != null) {
                    callback.run(b00Var.d);
                }
                a00Var.f31933c.finishFragment();
                return;
            case 9:
                e10 e10Var = (e10) obj2;
                b00 b00Var2 = new b00(e10Var.f33093r, ((v00) obj).f38404m);
                b00Var2.f32197y = new e00(e10Var, 1);
                b00Var2.f32196x = new e00(e10Var, 2);
                e10Var.presentFragment(b00Var2);
                return;
            case 10:
                e10 e10Var2 = (e10) obj2;
                Runnable runnable = (Runnable) obj;
                e10Var2.h = false;
                e10Var2.f33094s = false;
                e10Var2.f33093r.flags = e10Var2.f33097y;
                e10Var2.i0(true);
                e10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 11:
                e10 e10Var3 = (e10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = e10Var3.L;
                e10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    e10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    e10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList3.clear();
                    arrayList3.addAll(tL_chatlists_exportedInvites.invites);
                    e10Var3.w0();
                }
                e10Var3.M = 0;
                return;
            case 12:
                e10 e10Var4 = (e10) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                MessagesController.DialogFilter dialogFilter = e10Var4.f33093r;
                if (c2Var != null) {
                    try {
                        c2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                e10Var4.getMessagesController().removeFilter(dialogFilter);
                e10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                e10Var4.finishFragment();
                return;
            case 13:
                e10 e10Var5 = (e10) obj2;
                e10Var5.getClass();
                e10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 14:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f31095x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f31095x = true;
                    return;
                }
                return;
            case 15:
                FiltersSetupActivity filtersSetupActivity2 = ((c20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 16:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((g60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList5.get(i14)).f29613w != null) {
                        arrayList4.remove(((org.telegram.ui.Components.voip.u) arrayList5.get(i14)).f29613w);
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
            case 17:
                g60 g60Var = (g60) obj2;
                g60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                g60Var.dismiss();
                return;
            case 18:
                y5 y5Var = (y5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.t2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new tv(19, y5Var, ci.n0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 19:
                ((g60) ((y5) obj2).f40137b).U0.setNewColors((int[]) obj);
                return;
            case 20:
                r70.V((r70) obj2, (TLRPC.TL_error) obj);
                return;
            case 21:
                n70 n70Var = (n70) obj2;
                String str = (String) obj;
                o70 o70Var = n70Var.f35837a;
                o70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                o70Var.f36150c = o70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new mo(24, n70Var, str), 66);
                return;
            case 22:
                TLObject tLObject2 = (TLObject) obj;
                o70 o70Var2 = ((n70) obj2).f35837a;
                if (tLObject2 != null) {
                    r70.a0(o70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    r70.a0(o70Var2.h, null);
                    return;
                }
            case 23:
                q70 q70Var = (q70) obj2;
                String str2 = (String) obj;
                q70Var.h = str2;
                r70 r70Var = q70Var.f36624r;
                if (r70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f18439q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f18441q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                q70Var.f36623n = r70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new da(q70Var, str2, str2, 14), 66);
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new n(5, (k80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            case 25:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.f31098c.l();
                return;
            case 26:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new tv(25, languageSelectActivity2, new ArrayList()));
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
                int size2 = languageSelectActivity2.f31099f.size();
                while (i12 < size2) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f31099f.get(i12);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList6.add(localeInfo2);
                    }
                    i12++;
                }
                AndroidUtilities.runOnUIThread(new tv(25, languageSelectActivity2, arrayList6));
                return;
            case 27:
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
                    xn xnVar2 = new xn(bundle);
                    xnVar2.f39799ia = resolvedbusinesschatlinks;
                    launchActivity.q0(xnVar2, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.e5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 28:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.o(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.e5.u0((h) obj2, string, sb2.toString(), null);
                return;
        }
    }
}
