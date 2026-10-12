package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tc implements Utilities.Callback {
    public final int f42155a;
    public final Object f42156b;
    public final Object f42157c;

    public tc(int i10, Object obj, Object obj2) {
        this.f42155a = i10;
        this.f42156b = obj;
        this.f42157c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        MessageObject threadMessage;
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        String formatPluralString;
        float f7;
        float f10;
        float f11;
        int[] iArr;
        int i11 = this.f42155a;
        SendMessageChatArguments sendMessageChatArguments = null;
        TLRPC.User user = null;
        int i12 = 0;
        boolean z11 = false;
        Object obj2 = this.f42157c;
        Object obj3 = this.f42156b;
        switch (i11) {
            case 0:
                wc wcVar = (wc) obj3;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) obj2;
                View view = (View) obj;
                wcVar.getClass();
                if (view instanceof vc) {
                    vc vcVar = (vc) view;
                    vcVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, wcVar.f43130a));
                    wcVar.f43131b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        vcVar.a(peerColors.colors.get(R));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rg.j0 j0Var = (rg.j0) obj2;
                j0Var.H1((ChannelBoostsController.CanApplyBoost) obj);
                ((oe) obj3).f40676w0.showDialog(j0Var);
                return;
            case 2:
                eo eoVar = (eo) obj3;
                Long l4 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = eoVar.getMessagesController().getInputPeer(eoVar.T5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((hg.b2) obj2).f11172a;
                eoVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                sk skVar = eoVar.Y;
                if (skVar != null) {
                    skVar.setFieldText(null);
                    return;
                }
                return;
            case 3:
                eo eoVar2 = (eo) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, eoVar2.T5, eoVar2.f37356n5, eoVar2.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = eoVar2.H8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = eoVar2.S8();
                of2.suggestionParams = eoVar2.f37271g5;
                eoVar2.getSendMessagesHelper().sendMessage(of2);
                eoVar2.Y.setFieldText("");
                eoVar2.j9(false);
                return;
            case 4:
                eo eoVar3 = (eo) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l10 = (Long) obj;
                if (eoVar3.R3 == 1) {
                    org.telegram.ui.Components.g5.L(eoVar3.getParentActivity(), eoVar3.T5, new d7(eoVar3, botInlineResult, l10, 2), eoVar3.f37251ea);
                    return;
                } else {
                    eoVar3.gb(botInlineResult, true, 0, l10.longValue());
                    return;
                }
            case 5:
                eo.k1((eo) obj3, (j41[]) obj2, (org.telegram.ui.Components.s80) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((eo) obj3).f37312jb = true;
                ((org.telegram.ui.ActionBar.f6) obj2).run();
                return;
            case 7:
                eo eoVar4 = (eo) obj3;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.v0.q(R.string.PollStatsWillLater, org.telegram.ui.Components.zc.a0(eoVar4), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new th.g(eoVar4.getParentActivity(), eoVar4.f37251ea, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 8:
                eo eoVar5 = (eo) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                eoVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    eoVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 9:
                hg.b2 b2Var = (hg.b2) obj2;
                String str = (String) obj;
                eo eoVar6 = ((sj) obj3).f41937b;
                if (b2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.m2) eoVar6).currentAccount;
                    hg.c2.f(i10).k(b2Var.f11172a, str);
                }
                eoVar6.Q3 = str;
                eoVar6.f37190a1.setTitle(str);
                return;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l11 = (Long) obj;
                eo eoVar7 = ((pn) obj3).f40998a;
                if (eoVar7.i7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), eoVar7.T5, eoVar7.f37356n5, eoVar7.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = eoVar7.H8();
                    of3.dice_stake = l11.longValue();
                    eoVar7.getSendMessagesHelper().sendMessage(of3);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                eo eoVar8 = ((pn) obj3).f40998a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i13 = 0; i13 < eoVar8.f37478x0.getChildCount(); i13++) {
                        View childAt = eoVar8.f37478x0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                            if (u1Var2.getMessageObject() != null && u1Var2.getMessageObject().isSensitive()) {
                                u1Var2.h4();
                            }
                        }
                    }
                    return;
                }
                if (u1Var.getMessageObject() != null) {
                    u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                }
                u1Var.h4();
                return;
            case 12:
                pn pnVar = (pn) obj3;
                tc tcVar = (tc) obj2;
                eo eoVar9 = pnVar.f40998a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.zc.a0(eoVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                eoVar9.getMessagesController().setContentSettings(true);
                org.telegram.ui.Components.zc.a0(eoVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new an(pnVar, 8)), true)).k(true);
                tcVar.run(Boolean.TRUE);
                return;
            case 13:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((pn) obj3).f40998a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f19823id, (String) obj);
                return;
            case 14:
                ho hoVar = (ho) obj3;
                hoVar.f38477f.t(((dg.a) obj).f8347b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = hoVar.f38474b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 15:
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.tf) obj3).f30873a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j3, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                eo eoVar10 = chatActivityEnterView.P2;
                if (eoVar10 != null) {
                    sendMessageChatArguments = eoVar10.H8();
                }
                of4.sendMessageChatArguments = sendMessageChatArguments;
                of4.effect_id = chatActivityEnterView.f23749v5;
                of4.payStars = l12.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.af afVar = chatActivityEnterView.J0;
                chatActivityEnterView.f23749v5 = 0L;
                afVar.setEffect(0L);
                return;
            case 16:
                org.telegram.ui.Components.aj ajVar = (org.telegram.ui.Components.aj) obj3;
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) obj2;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i14 = ajVar.M1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i14).getInputUser(tiVar.f30883c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i14).sendRequest(tL_messages_toggleBotInAttachMenu, new so(5, ajVar, tiVar), 66);
                return;
            case 17:
                org.telegram.ui.Components.aj ajVar2 = (org.telegram.ui.Components.aj) obj3;
                ((eo) obj2).f37271g5 = (MessageSuggestionParams) obj;
                boolean J1 = ajVar2.J1(0, true, 0, ajVar2.u1(), ajVar2.Q0);
                org.telegram.ui.Components.rf rfVar = ajVar2.f24348h0;
                if (rfVar != null) {
                    rfVar.h(!J1);
                    ajVar2.f24348h0 = null;
                    return;
                }
                return;
            case 18:
                ((ei.p4) obj3).getWebViewContainer().F((String) obj2, (String) obj, false);
                return;
            case 19:
                org.telegram.ui.Components.mj mjVar = (org.telegram.ui.Components.mj) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                Long l13 = (Long) obj;
                mjVar.f28578i0 = false;
                if (l13 != null) {
                    user = messagesController.getUser(l13);
                }
                mjVar.f28577h0 = user;
                if (user == null) {
                    z11 = true;
                }
                mjVar.f28579j0 = z11;
                if (user != null) {
                    mjVar.R();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.zl zlVar = ((org.telegram.ui.Components.wl) obj3).f32434b;
                zlVar.f33425x0.b(((org.telegram.ui.Components.yl) obj2).f33123c, zlVar.f33427y0, true, 0, ((Long) obj).longValue());
                zlVar.f30574b.dismiss(true);
                return;
            case 21:
                org.telegram.ui.Components.iw iwVar = (org.telegram.ui.Components.iw) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hw(iwVar, 1));
                    return;
                }
                return;
            case 22:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.hu huVar = (org.telegram.ui.Components.hu) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                huVar.run();
                return;
            case 23:
                org.telegram.ui.Components.bz bzVar = (org.telegram.ui.Components.bz) obj3;
                org.telegram.ui.Components.cz czVar = bzVar.f24776a;
                org.telegram.ui.Components.d00 d00Var = czVar.F;
                MediaDataController mediaDataController = MediaDataController.getInstance(d00Var.f25080c1);
                String[] strArr = d00Var.W0;
                String str2 = czVar.v;
                ai.r5 r5Var = new ai.r5(bzVar, (String) obj2, (Runnable) obj, 29);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(d00Var.f25080c1).isPremium()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, r5Var, null, z10, false, true, 25);
                return;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.cz czVar2 = ((org.telegram.ui.Components.bz) obj3).f24776a;
                if (ConnectionsManager.getInstance(czVar2.F.f25080c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    org.telegram.ui.Components.cz.E(czVar2, runnable, arrayList2, false);
                    return;
                }
            case 25:
                org.telegram.ui.Components.wz wzVar = (org.telegram.ui.Components.wz) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj4 = arrayList3.get(i12);
                    i12++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(wzVar.f32590w.Q.f25080c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        wzVar.f32587n.add(new org.telegram.ui.Components.vy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 26:
                org.telegram.ui.Components.v10 v10Var = (org.telegram.ui.Components.v10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if (v10Var.f31324a0 == null && !(v10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.sc M = org.telegram.ui.Components.zc.a0(m2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, v10Var.f31329f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f30540j = 5000;
                    M.j();
                    return;
                }
                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(m2Var);
                int i15 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, v10Var.f31329f0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", v10Var.f31331h0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                org.telegram.ui.Components.sc M2 = a02.M(replaceTags, formatPluralString, i15);
                M2.f30540j = 5000;
                M2.j();
                return;
            case 27:
                View view3 = (View) obj3;
                org.telegram.ui.Components.d dVar = (org.telegram.ui.Components.d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view3.getWidth() > 0 && view3.getHeight() > 0) {
                    view3.getLocationOnScreen(new int[2]);
                    int clamp = Utilities.clamp((int) ((iArr[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int clamp2 = Utilities.clamp((int) ((iArr[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int clamp3 = Utilities.clamp((int) ((view3.getWidth() / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth() - clamp, 0);
                    int clamp4 = Utilities.clamp((int) ((view3.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight() - clamp2, 0);
                    if ((clamp != 0 || clamp2 != 0 || clamp3 != bitmap.getWidth() || clamp4 != bitmap.getHeight()) && clamp3 > 0 && clamp4 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, clamp, clamp2, clamp3, clamp4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = 0.04f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                float f12 = -0.07f;
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = -0.04f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 2.0f;
                } else {
                    f11 = 3.0f;
                }
                colorMatrix2.setSaturation(f11);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f12 = -0.2f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 28:
                MessagesController messagesController2 = (MessagesController) obj3;
                org.telegram.ui.Components.qs0 qs0Var = (org.telegram.ui.Components.qs0) obj2;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController2.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.zc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.yd(2, U)), true)).k(true);
                    }
                    qs0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    org.telegram.ui.Components.zc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Components.hw0.j((org.telegram.ui.Components.hw0) obj3, (TL_stories.StoryItem) obj2, (ai.f9) obj);
                return;
        }
    }
}
