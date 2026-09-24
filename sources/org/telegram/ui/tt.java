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
public final class tt implements Runnable {
    public final int f38216a;
    public final Object f38217b;
    public final Object f38218c;

    public tt(int i10, Object obj, Object obj2) {
        this.f38216a = i10;
        this.f38217b = obj;
        this.f38218c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.wl0 wl0Var;
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f38216a;
        int i12 = 0;
        Object obj = this.f38218c;
        Object obj2 = this.f38217b;
        switch (i11) {
            case 0:
                ut utVar = (ut) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new tt(1, utVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = utVar.f38538f;
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    qt qtVar = (qt) obj3;
                    String str = qtVar.f36969a;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String lowerCase2 = str.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(qtVar.f36969a).toLowerCase();
                    String str3 = qtVar.f36970b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String lowerCase4 = str3.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(qtVar.f36970b).toLowerCase();
                    String str4 = qtVar.f36971c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = "+".concat(str4);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, lowerCase5) || str4.startsWith(lowerCase) || str2.startsWith(lowerCase)) {
                        arrayList.add(qtVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new tt(1, utVar, arrayList));
                return;
            case 1:
                ut utVar2 = (ut) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                wt wtVar = utVar2.h;
                if (wtVar.f39740f) {
                    utVar2.e = arrayList3;
                    if (wtVar.e && (wl0Var = wtVar.f39737a) != null) {
                        s4.h0 adapter = wl0Var.getAdapter();
                        ut utVar3 = wtVar.d;
                        if (adapter != utVar3) {
                            wtVar.f39737a.setAdapter(utVar3);
                            wtVar.f39737a.setFastScrollVisible(false);
                        }
                    }
                    utVar2.l();
                    return;
                }
                return;
            case 2:
                yt.P((yt) obj2, (TLRPC.Updates) obj);
                return;
            case 3:
                qy.d0((qy) obj2, (String) obj);
                return;
            case 4:
                ei.k3.j(((qy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 5:
                qy qyVar = (qy) obj2;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new lv(qyVar, 24), 300L);
                return;
            case 6:
                ((py) obj).f36679a.postOnAnimation(new lv((qy) obj2, 14));
                return;
            case 7:
                qy qyVar2 = (qy) obj2;
                ArrayList<Long> arrayList4 = (ArrayList) obj;
                MessagesController messagesController = qyVar2.getMessagesController();
                if (qyVar2.V2 == 0 && qyVar2.X2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList4, i10, -1, null, 0L);
                return;
            case 8:
                ArrayList arrayList5 = (ArrayList) obj;
                qy qyVar3 = ((pw) obj2).f36671b;
                qyVar3.y3 = 2;
                qyVar3.A4(true, true);
                qyVar3.o3();
                while (i12 < arrayList5.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList5.get(i12)).f18325id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i12);
                    if (qyVar3.getMessagesController().isForum(j3) || qyVar3.getMessagesController().isMonoForumWithManageRights(j3)) {
                        qyVar3.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    qyVar3.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController2 = qyVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 9:
                ((pw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 10:
                CharSequence charSequence = (CharSequence) obj;
                qy qyVar4 = ((bx) obj2).f32492a;
                qyVar4.H2 = null;
                org.telegram.ui.Components.zq0 zq0Var = qyVar4.G2;
                if (zq0Var != null && zq0Var.h) {
                    zq0Var.e(charSequence, false);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.m2[] m2VarArr = (org.telegram.ui.ActionBar.m2[]) obj;
                ((px) obj2).f36676b.removeSelfFromStack();
                if (m2VarArr[1] != null) {
                    m2VarArr[0].removeSelfFromStack();
                    m2VarArr[1].finishFragment();
                    return;
                }
                m2VarArr[0].finishFragment();
                return;
            case 12:
                cz czVar = (cz) obj2;
                wn wnVar = czVar.f32804a;
                org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(wnVar.getParentActivity(), czVar.f32804a, ((MessageObject) obj).getInputStickerSet(), null, wnVar.Y, wnVar.getResourceProvider());
                fy0Var.setCalcMandatoryInsets(wnVar.x9());
                wnVar.showDialog(fy0Var);
                return;
            case 13:
                wz wzVar = (wz) obj2;
                wzVar.getClass();
                ((org.telegram.ui.ActionBar.a2) obj).dismiss();
                xz xzVar = wzVar.E;
                yz yzVar = xzVar.f39992c;
                Utilities.Callback callback = yzVar.f40276x;
                if (callback != null) {
                    callback.run(yzVar.d);
                }
                xzVar.f39992c.finishFragment();
                return;
            case 14:
                b10 b10Var = (b10) obj2;
                yz yzVar2 = new yz(b10Var.f32265r, ((s00) obj).f37547m);
                yzVar2.f40277y = new b00(b10Var, 1);
                yzVar2.f40276x = new b00(b10Var, 2);
                b10Var.presentFragment(yzVar2);
                return;
            case 15:
                b10 b10Var2 = (b10) obj2;
                Runnable runnable = (Runnable) obj;
                b10Var2.h = false;
                b10Var2.f32266s = false;
                b10Var2.f32265r.flags = b10Var2.f32269y;
                b10Var2.i0(true);
                b10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                b10 b10Var3 = (b10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList6 = b10Var3.L;
                b10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    b10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    b10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList6.clear();
                    arrayList6.addAll(tL_chatlists_exportedInvites.invites);
                    b10Var3.w0();
                }
                b10Var3.M = 0;
                return;
            case 17:
                b10 b10Var4 = (b10) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj;
                MessagesController.DialogFilter dialogFilter = b10Var4.f32265r;
                if (a2Var != null) {
                    try {
                        a2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                b10Var4.getMessagesController().removeFilter(dialogFilter);
                b10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                b10Var4.finishFragment();
                return;
            case 18:
                b10 b10Var5 = (b10) obj2;
                b10Var5.getClass();
                b10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 19:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f31079x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f31079x = true;
                    return;
                }
                return;
            case 20:
                FiltersSetupActivity filtersSetupActivity2 = ((z10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 21:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((d60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList8.get(i14)).f29661w != null) {
                        arrayList7.remove(((org.telegram.ui.Components.voip.u) arrayList8.get(i14)).f29661w);
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
                d60 d60Var = (d60) obj2;
                d60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                d60Var.dismiss();
                return;
            case 23:
                w5 w5Var = (w5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.t2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new tt(24, w5Var, ci.n0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 24:
                ((d60) ((w5) obj2).f38880b).U0.setNewColors((int[]) obj);
                return;
            case 25:
                o70.V((o70) obj2, (TLRPC.TL_error) obj);
                return;
            case 26:
                k70 k70Var = (k70) obj2;
                String str5 = (String) obj;
                l70 l70Var = k70Var.f34946a;
                l70Var.e = str5;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str5;
                l70Var.f35203c = l70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new lo(24, k70Var, str5), 66);
                return;
            case 27:
                TLObject tLObject2 = (TLObject) obj;
                l70 l70Var2 = ((k70) obj2).f34946a;
                if (tLObject2 != null) {
                    o70.a0(l70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    o70.a0(l70Var2.h, null);
                    return;
                }
            case 28:
                n70 n70Var = (n70) obj2;
                String str6 = (String) obj;
                n70Var.h = str6;
                o70 o70Var = n70Var.f35746r;
                if (o70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f18431q = str6;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f18433q = str6;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                n70Var.f35745n = o70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(n70Var, str6, str6, 14), 66);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(8, (h80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
        }
    }
}
