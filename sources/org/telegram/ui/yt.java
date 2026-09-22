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
    public final int f40030a;
    public final Object f40031b;
    public final Object f40032c;

    public yt(int i10, Object obj, Object obj2) {
        this.f40030a = i10;
        this.f40031b = obj;
        this.f40032c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.yl0 yl0Var;
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f40030a;
        int i12 = 0;
        Object obj = this.f40032c;
        Object obj2 = this.f40031b;
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
                ArrayList arrayList2 = ztVar.f40621f;
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    vt vtVar = (vt) obj3;
                    String str = vtVar.f38618a;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String lowerCase2 = str.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(vtVar.f38618a).toLowerCase();
                    String str3 = vtVar.f38619b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String lowerCase4 = str3.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(vtVar.f38619b).toLowerCase();
                    String str4 = vtVar.f38620c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = "+".concat(str4);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, lowerCase5) || str4.startsWith(lowerCase) || str2.startsWith(lowerCase)) {
                        arrayList.add(vtVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new yt(1, ztVar, arrayList));
                return;
            case 1:
                zt ztVar2 = (zt) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                bu buVar = ztVar2.h;
                if (buVar.f32562f) {
                    ztVar2.e = arrayList3;
                    if (buVar.e && (yl0Var = buVar.f32559a) != null) {
                        s4.h0 adapter = yl0Var.getAdapter();
                        zt ztVar3 = buVar.d;
                        if (adapter != ztVar3) {
                            buVar.f32559a.setAdapter(ztVar3);
                            buVar.f32559a.setFastScrollVisible(false);
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
                ei.k3.j(((uy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
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
                ((ty) obj).f37905a.postOnAnimation(new qv((uy) obj2, 14));
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
                uy uyVar3 = ((tw) obj2).f37890b;
                uyVar3.y3 = 2;
                uyVar3.A4(true, true);
                uyVar3.o3();
                while (i12 < arrayList5.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList5.get(i12)).f18347id;
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
                uy uyVar4 = ((fx) obj2).f33775a;
                uyVar4.H2 = null;
                org.telegram.ui.Components.br0 br0Var = uyVar4.G2;
                if (br0Var != null && br0Var.h) {
                    br0Var.e(charSequence, false);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((tx) obj2).f37900b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    return;
                }
                n2VarArr[0].finishFragment();
                return;
            case 12:
                gz gzVar = (gz) obj2;
                zn znVar = gzVar.f34021a;
                org.telegram.ui.Components.iy0 iy0Var = new org.telegram.ui.Components.iy0(znVar.getParentActivity(), gzVar.f34021a, ((MessageObject) obj).getInputStickerSet(), null, znVar.Y, znVar.getResourceProvider());
                iy0Var.setCalcMandatoryInsets(znVar.x9());
                znVar.showDialog(iy0Var);
                return;
            case 13:
                a00 a00Var = (a00) obj2;
                a00Var.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                b00 b00Var = a00Var.E;
                c00 c00Var = b00Var.f32246c;
                Utilities.Callback callback = c00Var.f32593x;
                if (callback != null) {
                    callback.run(c00Var.d);
                }
                b00Var.f32246c.finishFragment();
                return;
            case 14:
                f10 f10Var = (f10) obj2;
                c00 c00Var2 = new c00(f10Var.f33464r, ((w00) obj).f38658m);
                c00Var2.f32594y = new f00(f10Var, 1);
                c00Var2.f32593x = new f00(f10Var, 2);
                f10Var.presentFragment(c00Var2);
                return;
            case 15:
                f10 f10Var2 = (f10) obj2;
                Runnable runnable = (Runnable) obj;
                f10Var2.h = false;
                f10Var2.f33465s = false;
                f10Var2.f33464r.flags = f10Var2.f33468y;
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
                MessagesController.DialogFilter dialogFilter = f10Var4.f33464r;
                if (b2Var != null) {
                    try {
                        b2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
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
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f31112x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f31112x = true;
                    return;
                }
                return;
            case 20:
                FiltersSetupActivity filtersSetupActivity2 = ((e20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 21:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((i60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList8.get(i14)).f29633w != null) {
                        arrayList7.remove(((org.telegram.ui.Components.voip.u) arrayList8.get(i14)).f29633w);
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
                i60 i60Var = (i60) obj2;
                i60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                i60Var.dismiss();
                return;
            case 23:
                w5 w5Var = (w5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.s2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new yt(24, w5Var, ci.n0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 24:
                ((i60) ((w5) obj2).f38699b).U0.setNewColors((int[]) obj);
                return;
            case 25:
                t70.V((t70) obj2, (TLRPC.TL_error) obj);
                return;
            case 26:
                p70 p70Var = (p70) obj2;
                String str5 = (String) obj;
                q70 q70Var = p70Var.f36511a;
                q70Var.e = str5;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str5;
                q70Var.f36809c = q70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new oo(24, p70Var, str5), 66);
                return;
            case 27:
                TLObject tLObject2 = (TLObject) obj;
                q70 q70Var2 = ((p70) obj2).f36511a;
                if (tLObject2 != null) {
                    t70.a0(q70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    t70.a0(q70Var2.h, null);
                    return;
                }
            case 28:
                s70 s70Var = (s70) obj2;
                String str6 = (String) obj;
                s70Var.h = str6;
                t70 t70Var = s70Var.f37344r;
                if (t70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f18453q = str6;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f18455q = str6;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                s70Var.f37343n = t70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ba(s70Var, str6, str6, 14), 66);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(8, (m80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
        }
    }
}
