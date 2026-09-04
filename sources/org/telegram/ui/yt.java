package org.telegram.ui;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class yt implements Runnable {
    public final int f43202a;
    public final Object f43203b;
    public final Object f43204c;

    public yt(int i10, Object obj, Object obj2) {
        this.f43202a = i10;
        this.f43203b = obj;
        this.f43204c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ll0 ll0Var;
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f43202a;
        int i12 = 0;
        Object obj = this.f43204c;
        Object obj2 = this.f43203b;
        switch (i11) {
            case 0:
                zt ztVar = (zt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new yt(1, ztVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = ztVar.f43514f;
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    vt vtVar = (vt) obj3;
                    String str = vtVar.f41693a;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String lowerCase2 = str.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(vtVar.f41693a).toLowerCase();
                    String str3 = vtVar.f41694b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String lowerCase4 = str3.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(vtVar.f41694b).toLowerCase();
                    String str4 = vtVar.f41695c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = "+".concat(str4);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, lowerCase5) || str4.startsWith(lowerCase) || str2.startsWith(lowerCase)) {
                        arrayList.add(vtVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new yt(1, ztVar, arrayList));
                return;
            case 1:
                zt ztVar2 = (zt) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                bu buVar = ztVar2.h;
                if (buVar.f34927f) {
                    ztVar2.f43513e = arrayList3;
                    if (buVar.f34926e && (ll0Var = buVar.f34923a) != null) {
                        s4.h0 adapter = ll0Var.getAdapter();
                        zt ztVar3 = buVar.d;
                        if (adapter != ztVar3) {
                            buVar.f34923a.setAdapter(ztVar3);
                            buVar.f34923a.setFastScrollVisible(false);
                        }
                    }
                    ztVar2.l();
                    return;
                }
                return;
            case 2:
                du.P((du) obj2, (TLRPC.Updates) obj);
                return;
            case 3:
                uy.e0((uy) obj2, (String) obj);
                return;
            case 4:
                fi.k3.j(((uy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 5:
                uy uyVar = (uy) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new qv(uyVar, 24), 300L);
                return;
            case 6:
                ((ty) obj).f40858a.postOnAnimation(new qv((uy) obj2, 14));
                return;
            case 7:
                uy uyVar2 = (uy) obj2;
                ArrayList<Long> arrayList4 = (ArrayList) obj;
                MessagesController messagesController = uyVar2.getMessagesController();
                if (uyVar2.V2 == 0 && uyVar2.X2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList4, i10, -1, null, 0L);
                return;
            case 8:
                ArrayList arrayList5 = (ArrayList) obj;
                uy uyVar3 = ((tw) obj2).f40841b;
                uyVar3.y3 = 2;
                uyVar3.A4(true, true);
                uyVar3.o3();
                while (i12 < arrayList5.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList5.get(i12)).f19873id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i12);
                    if (uyVar3.getMessagesController().isForum(j3) || uyVar3.getMessagesController().isMonoForumWithManageRights(j3)) {
                        uyVar3.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    uyVar3.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController2 = uyVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 9:
                ((tw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 10:
                CharSequence charSequence = (CharSequence) obj;
                uy uyVar4 = ((fx) obj2).f36489a;
                uyVar4.H2 = null;
                org.telegram.ui.Components.mq0 mq0Var = uyVar4.G2;
                if (mq0Var != null && mq0Var.h) {
                    mq0Var.e(charSequence, false);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((tx) obj2).f40852b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    return;
                }
                n2VarArr[0].finishFragment();
                return;
            case 12:
                gz gzVar = (gz) obj2;
                co coVar = gzVar.f36812a;
                org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(coVar.getParentActivity(), gzVar.f36812a, ((MessageObject) obj).getInputStickerSet(), null, coVar.Y, coVar.getResourceProvider());
                ux0Var.setCalcMandatoryInsets(coVar.x9());
                coVar.showDialog(ux0Var);
                return;
            case 13:
                a00 a00Var = (a00) obj2;
                a00Var.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                b00 b00Var = a00Var.E;
                c00 c00Var = b00Var.f34579c;
                Utilities.Callback callback = c00Var.f34962x;
                if (callback != null) {
                    callback.run(c00Var.d);
                }
                b00Var.f34579c.finishFragment();
                return;
            case 14:
                f10 f10Var = (f10) obj2;
                c00 c00Var2 = new c00(f10Var.f36228r, ((w00) obj).f41740m);
                c00Var2.f34963y = new f00(f10Var, 1);
                c00Var2.f34962x = new f00(f10Var, 2);
                f10Var.presentFragment(c00Var2);
                return;
            case 15:
                f10 f10Var2 = (f10) obj2;
                Runnable runnable = (Runnable) obj;
                f10Var2.h = false;
                f10Var2.f36229s = false;
                f10Var2.f36228r.flags = f10Var2.f36232y;
                f10Var2.i0(true);
                f10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                f10 f10Var3 = (f10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList6 = f10Var3.L;
                f10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    f10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    f10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList6.clear();
                    arrayList6.addAll(tL_chatlists_exportedInvites.invites);
                    f10Var3.w0();
                }
                f10Var3.M = 0;
                return;
            case 17:
                f10 f10Var4 = (f10) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = f10Var4.f36228r;
                if (b2Var != null) {
                    try {
                        b2Var.dismiss();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                f10Var4.getMessagesController().removeFilter(dialogFilter);
                f10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                f10Var4.finishFragment();
                return;
            case 18:
                f10 f10Var5 = (f10) obj2;
                f10Var5.getClass();
                f10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 19:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f33415x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f33415x = true;
                    return;
                }
                return;
            case 20:
                FiltersSetupActivity filtersSetupActivity2 = ((e20) obj2).f35912e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 21:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((j60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList8.get(i14)).f31833w != null) {
                        arrayList7.remove(((org.telegram.ui.Components.voip.t) arrayList8.get(i14)).f31833w);
                    }
                }
                while (i12 < arrayList7.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList7.get(i12);
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
            case 22:
                j60 j60Var = (j60) obj2;
                j60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                j60Var.dismiss();
                return;
            case 23:
                w5 w5Var = (w5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.q2) obj).f31742e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new yt(24, w5Var, di.n0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 24:
                ((j60) ((w5) obj2).f41762b).U0.setNewColors((int[]) obj);
                return;
            case 25:
                u70.V((u70) obj2, (TLRPC.TL_error) obj);
                return;
            case 26:
                q70 q70Var = (q70) obj2;
                String str5 = (String) obj;
                r70 r70Var = q70Var.f39748a;
                r70Var.f40087e = str5;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str5;
                r70Var.f40086c = r70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ro(24, q70Var, str5), 66);
                return;
            case 27:
                TLObject tLObject2 = (TLObject) obj;
                r70 r70Var2 = ((q70) obj2).f39748a;
                if (tLObject2 != null) {
                    u70.a0(r70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    u70.a0(r70Var2.h, null);
                    return;
                }
            case 28:
                t70 t70Var = (t70) obj2;
                String str6 = (String) obj;
                t70Var.h = str6;
                u70 u70Var = t70Var.f40647r;
                if (u70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f19979q = str6;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f19981q = str6;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                t70Var.f40646n = u70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(t70Var, str6, str6, 14), 66);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(8, (m80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
        }
    }
}
