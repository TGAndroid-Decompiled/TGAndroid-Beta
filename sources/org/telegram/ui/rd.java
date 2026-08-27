package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class rd implements Runnable {

    public final int f41905a;

    public final Object f41906b;

    public final Object f41907c;

    public rd(int i10, Object obj, Object obj2) {
        this.f41905a = i10;
        this.f41906b = obj;
        this.f41907c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.b51 b51Var;
        org.telegram.ui.Components.f01 f01Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.Chat chat;
        int i10 = this.f41905a;
        MessageObject messageObject = null;
        int i11 = 2;
        Object obj = this.f41907c;
        Object obj2 = this.f41906b;
        switch (i10) {
            case 0:
                fe feVar = (fe) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                feVar.f38102w0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    feVar.f38103x0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.k51 k51Var = feVar.W0;
                if (k51Var != null && (b51Var = k51Var.U2) != null) {
                    b51Var.N(true);
                    break;
                }
                break;
            case 1:
                ((fe) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 2:
                rn rnVar = (rn) obj2;
                org.telegram.ui.Components.f01[] f01VarArr = (org.telegram.ui.Components.f01[]) obj;
                if (!rnVar.f42063gb && (f01Var = f01VarArr[0]) != null) {
                    f01VarArr[0] = null;
                    if (rnVar.f42186r0 == f01Var) {
                        rnVar.f42186r0 = null;
                    }
                    AndroidUtilities.removeFromParent(f01Var);
                    break;
                }
                break;
            case 3:
                ((hh.i2) obj2).run((TLRPC.User) obj);
                break;
            case 4:
                rn rnVar2 = (rn) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                int[] iArr = new int[2];
                s1Var.getLocationInWindow(iArr);
                lh.w3 w3Var = rnVar2.f42240v1;
                w3Var.setTranslationY(s1Var.getTimeY() + ((iArr[1] - w3Var.getTop()) - AndroidUtilities.dp(120.0f)));
                rnVar2.f42240v1.n(0.0f, ((((-AndroidUtilities.dp(16.0f)) + iArr[0]) + s1Var.nb) + s1Var.f25421lb) - (s1Var.f25465ob / 2.0f));
                rnVar2.f42240v1.v();
                break;
            case 5:
                rn.M0((rn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 6:
                rn rnVar3 = (rn) obj2;
                int[] iArr2 = (int[]) obj;
                rnVar3.getClass();
                if (iArr2[0] != 0) {
                    rnVar3.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                }
                break;
            case 7:
                ((rn) obj2).h8((yg) obj);
                break;
            case 8:
                rn rnVar4 = (rn) obj2;
                we.e.p(rnVar4.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), rnVar4.f41995b8 == 0, false);
                break;
            case 9:
                ((rn) obj2).ka((TLRPC.Chat) obj);
                break;
            case 10:
                rn.d0((rn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 11:
                rn rnVar5 = (rn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.y4.w0(rnVar5, LocaleController.getString(R.string.SlowmodeSendError));
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.y4.w0(rnVar5, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                } else {
                    org.telegram.ui.Components.y4.w0(rnVar5, tL_error.text);
                }
                break;
            case 12:
                a0.h hVar = (a0.h) obj2;
                m6 m6Var = (m6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i12 = 0; i12 < messageObject.messageOwner.media.webpage.attributes.size(); i12++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i12);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new rd(13, m6Var, messageObject.messageOwner.media.webpage));
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new lt0(m6Var, 28));
                break;
            case 13:
                ((m6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 14:
                rn rnVar6 = (rn) obj2;
                View view = (View) obj;
                if (rnVar6.getParentActivity() != null) {
                    rnVar6.G0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    rnVar6.G0.r(16.0f);
                    rnVar6.G0.q(true);
                    rnVar6.G0.t(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    rnVar6.G0.m(0.0f, 96.0f);
                    rnVar6.G0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - rnVar6.f42248va) - rnVar6.T0.getHeight()));
                    rnVar6.T0.addView(rnVar6.G0, h7.z5.e(-1, 100, 87));
                    lh.w3 w3Var2 = rnVar6.G0;
                    w3Var2.f16984h0 = new gf(rnVar6, 7);
                    w3Var2.v();
                    org.telegram.ui.Components.y30.GuestBotPrivacy.b();
                    break;
                }
                break;
            case 15:
                ((rn) obj2).T0.removeView((org.telegram.ui.Components.wj0) obj);
                break;
            case 16:
                MessageObject messageObject2 = (MessageObject) obj;
                rn rnVar7 = ((mi) obj2).f40529s;
                MessageObject messageObject3 = (MessageObject) rnVar7.f42109k6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) rnVar7.f42109k6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                rnVar7.qc(messageObject2, true);
                ig.m0.f();
                break;
            case 17:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                rn rnVar8 = ((ul) ((wm) obj2).f44146f).f43247a.M;
                int i13 = rn.Dc;
                rnVar8.Ma();
                v0Var.getMessageObject().flickerLoading = false;
                v0Var.invalidate();
                break;
            case 18:
                lh.w3 w3Var3 = (lh.w3) obj;
                rn rnVar9 = ((dn) obj2).f37446a;
                rnVar9.T0.removeView(w3Var3);
                if (w3Var3 == rnVar9.f42253w1) {
                    rnVar9.f42253w1 = null;
                }
                break;
            case 19:
                Long l10 = (Long) obj;
                rn rnVar10 = ((xm) obj2).Y0.f37446a;
                String str = (l10.longValue() >= 0 || (chat = rnVar10.getMessagesController().getChat(Long.valueOf(-l10.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.mc.a0(rnVar10).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 20:
                jo joVar = (jo) obj2;
                joVar.getClass();
                joVar.presentFragment(q91.d0((TLRPC.Chat) obj, true));
                break;
            case 21:
                xo xoVar = (xo) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = xoVar.getMessagesController().getInputChannel(xoVar.V);
                xoVar.f44554d0 = xoVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new z9(xoVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 22:
                xo xoVar2 = (xo) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                boolean z10 = tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                xoVar2.Y = z10;
                if (!z10 && xoVar2.getUserConfig().isPremium() && !xoVar2.Z && xoVar2.f44572x != null) {
                    xoVar2.Z = true;
                    xoVar2.b0();
                    xoVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new ko(xoVar2, i11));
                    break;
                }
                break;
            case 23:
                jp.U((jp) obj2, (org.telegram.ui.ActionBar.b2[]) obj);
                break;
            case 24:
                jp jpVar = (jp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    jpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    jpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                jpVar.f39458w = false;
                jpVar.f39459x = true;
                jpVar.b0();
                break;
            case 25:
                ((fp) obj2).f38179x.d.L = false;
                ((org.telegram.ui.Components.v70) obj).run();
                break;
            case 26:
                ((fp) obj2).f38179x.d.K = false;
                ((org.telegram.ui.Components.w70) obj).run();
                break;
            case 27:
                jp jpVar2 = ((fp) obj2).f38179x.d;
                jpVar2.K = false;
                jpVar2.L = false;
                ((Runnable) obj).run();
                break;
            case 28:
                fp fpVar = (fp) obj2;
                fpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                fpVar.h = true;
                fpVar.f34530c.setChecked(true);
                break;
            default:
                lr lrVar = (lr) obj2;
                lrVar.getClass();
                lrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f22380id, 0, true);
                break;
        }
    }
}
