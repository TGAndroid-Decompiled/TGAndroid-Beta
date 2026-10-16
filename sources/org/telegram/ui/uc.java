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
public final class uc implements Utilities.Callback {
    public final int f40365a;
    public final Object f40366b;
    public final Object f40367c;

    public uc(int i10, Object obj, Object obj2) {
        this.f40365a = i10;
        this.f40366b = obj;
        this.f40367c = obj2;
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
        int i11 = this.f40365a;
        SendMessageChatArguments sendMessageChatArguments = null;
        TLRPC.User user = null;
        int i12 = 0;
        boolean z11 = false;
        Object obj2 = this.f40367c;
        Object obj3 = this.f40366b;
        switch (i11) {
            case 0:
                xc xcVar = (xc) obj3;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) obj2;
                View view = (View) obj;
                xcVar.getClass();
                if (view instanceof wc) {
                    wc wcVar = (wc) view;
                    wcVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, xcVar.f41538a));
                    xcVar.f41539b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        wcVar.a(peerColors.colors.get(R));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sg.j0 j0Var = (sg.j0) obj2;
                j0Var.H1((ChannelBoostsController.CanApplyBoost) obj);
                ((qe) obj3).f39138w0.showDialog(j0Var);
                return;
            case 2:
                fo foVar = (fo) obj3;
                Long l4 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = foVar.getMessagesController().getInputPeer(foVar.T5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((ig.a2) obj2).f11438a;
                foVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                sk skVar = foVar.Y;
                if (skVar != null) {
                    skVar.setFieldText(null);
                    return;
                }
                return;
            case 3:
                fo foVar2 = (fo) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, foVar2.T5, foVar2.f35739n5, foVar2.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = foVar2.H8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = foVar2.S8();
                of2.suggestionParams = foVar2.f35653g5;
                foVar2.getSendMessagesHelper().sendMessage(of2);
                foVar2.Y.setFieldText("");
                foVar2.j9(false);
                return;
            case 4:
                fo foVar3 = (fo) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l10 = (Long) obj;
                if (foVar3.R3 == 1) {
                    org.telegram.ui.Components.g5.L(foVar3.getParentActivity(), foVar3.T5, new f7(foVar3, botInlineResult, l10, 2), foVar3.f35633ea);
                    return;
                } else {
                    foVar3.gb(botInlineResult, true, 0, l10.longValue());
                    return;
                }
            case 5:
                fo.k1((fo) obj3, (n41[]) obj2, (org.telegram.ui.Components.l80) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((fo) obj3).f35695jb = true;
                ((jd) obj2).run();
                return;
            case 7:
                fo foVar4 = (fo) obj3;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.g0.q(R.string.PollStatsWillLater, org.telegram.ui.Components.zc.a0(foVar4), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new uh.g(foVar4.getParentActivity(), foVar4.f35633ea, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 8:
                fo foVar5 = (fo) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                foVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    foVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 9:
                ig.a2 a2Var = (ig.a2) obj2;
                String str = (String) obj;
                fo foVar6 = ((sj) obj3).f39833b;
                if (a2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.m2) foVar6).currentAccount;
                    ig.b2.f(i10).k(a2Var.f11438a, str);
                }
                foVar6.Q3 = str;
                foVar6.f35573a1.setTitle(str);
                return;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l11 = (Long) obj;
                fo foVar7 = ((qn) obj3).f39190a;
                if (foVar7.i7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), foVar7.T5, foVar7.f35739n5, foVar7.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = foVar7.H8();
                    of3.dice_stake = l11.longValue();
                    foVar7.getSendMessagesHelper().sendMessage(of3);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                fo foVar8 = ((qn) obj3).f39190a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i13 = 0; i13 < foVar8.f35861x0.getChildCount(); i13++) {
                        View childAt = foVar8.f35861x0.getChildAt(i13);
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
                qn qnVar = (qn) obj3;
                uc ucVar = (uc) obj2;
                fo foVar9 = qnVar.f39190a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.zc.a0(foVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                foVar9.getMessagesController().setContentSettings(true);
                org.telegram.ui.Components.zc.a0(foVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new bn(qnVar, 8)), true)).k(true);
                ucVar.run(Boolean.TRUE);
                return;
            case 13:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((qn) obj3).f39190a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f18937id, (String) obj);
                return;
            case 14:
                io ioVar = (io) obj3;
                ioVar.f36843f.t(((eg.a) obj).f8767b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = ioVar.f36841b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 15:
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.qf) obj3).f28276a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j10, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                fo foVar10 = chatActivityEnterView.P2;
                if (foVar10 != null) {
                    sendMessageChatArguments = foVar10.H8();
                }
                of4.sendMessageChatArguments = sendMessageChatArguments;
                of4.effect_id = chatActivityEnterView.S4;
                of4.payStars = l12.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.ze zeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                zeVar.setEffect(0L);
                return;
            case 16:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) obj3;
                org.telegram.ui.Components.oi oiVar = (org.telegram.ui.Components.oi) obj2;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i14 = viVar.M1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i14).getInputUser(oiVar.f27652c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i14).sendRequest(tL_messages_toggleBotInAttachMenu, new to(5, viVar, oiVar), 66);
                return;
            case 17:
                org.telegram.ui.Components.vi viVar2 = (org.telegram.ui.Components.vi) obj3;
                ((fo) obj2).f35653g5 = (MessageSuggestionParams) obj;
                boolean J1 = viVar2.J1(0, true, 0, viVar2.u1(), viVar2.Q0);
                org.telegram.ui.Components.of ofVar = viVar2.f29678h0;
                if (ofVar != null) {
                    ofVar.h(!J1);
                    viVar2.f29678h0 = null;
                    return;
                }
                return;
            case 18:
                ((fi.q4) obj3).getWebViewContainer().F((String) obj2, (String) obj, false);
                return;
            case 19:
                org.telegram.ui.Components.hj hjVar = (org.telegram.ui.Components.hj) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                Long l13 = (Long) obj;
                hjVar.f25331i0 = false;
                if (l13 != null) {
                    user = messagesController.getUser(l13);
                }
                hjVar.f25330h0 = user;
                if (user == null) {
                    z11 = true;
                }
                hjVar.f25332j0 = z11;
                if (user != null) {
                    hjVar.R();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.tl tlVar = ((org.telegram.ui.Components.ql) obj3).f28321b;
                tlVar.f29119x0.b(((org.telegram.ui.Components.sl) obj2).f28855c, tlVar.f29121y0, true, 0, ((Long) obj).longValue());
                tlVar.f27360b.dismiss(true);
                return;
            case 21:
                org.telegram.ui.Components.bw bwVar = (org.telegram.ui.Components.bw) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.aw(bwVar, 1));
                    return;
                }
                return;
            case 22:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.vm vmVar = (org.telegram.ui.Components.vm) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                vmVar.run();
                return;
            case 23:
                org.telegram.ui.Components.uy uyVar = (org.telegram.ui.Components.uy) obj3;
                org.telegram.ui.Components.vy vyVar = uyVar.f29486a;
                org.telegram.ui.Components.wz wzVar = vyVar.F;
                MediaDataController mediaDataController = MediaDataController.getInstance(wzVar.f30707c1);
                String[] strArr = wzVar.W0;
                String str2 = vyVar.v;
                androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(29, uyVar, (Runnable) obj, (String) obj2);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(wzVar.f30707c1).isPremium()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, aVar, null, z10, false, true, 25);
                return;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.vy vyVar2 = ((org.telegram.ui.Components.uy) obj3).f29486a;
                if (ConnectionsManager.getInstance(vyVar2.F.f30707c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    org.telegram.ui.Components.vy.E(vyVar2, runnable, arrayList2, false);
                    return;
                }
            case 25:
                org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) obj3;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(pzVar.f28140w.Q.f30707c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        pzVar.f28137n.add(new org.telegram.ui.Components.oy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 26:
                org.telegram.ui.Components.o10 o10Var = (org.telegram.ui.Components.o10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if (o10Var.f27471a0 == null && !(o10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.sc M = org.telegram.ui.Components.zc.a0(m2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, o10Var.f27476f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f28805j = 5000;
                    M.j();
                    return;
                }
                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(m2Var);
                int i15 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, o10Var.f27476f0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", o10Var.f27478h0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                org.telegram.ui.Components.sc M2 = a02.M(replaceTags, formatPluralString, i15);
                M2.f28805j = 5000;
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
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f7 = 0.04f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                float f12 = -0.07f;
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f10 = -0.04f;
                } else {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f11 = 2.0f;
                } else {
                    f11 = 3.0f;
                }
                colorMatrix2.setSaturation(f11);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
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
                org.telegram.ui.Components.gs0 gs0Var = (org.telegram.ui.Components.gs0) obj2;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController2.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.zc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.ud(2, U)), true)).k(true);
                    }
                    gs0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    org.telegram.ui.Components.zc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Components.xv0.j((org.telegram.ui.Components.xv0) obj3, (TL_stories.StoryItem) obj2, (bi.p8) obj);
                return;
        }
    }
}
