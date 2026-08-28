package org.telegram.ui;

import android.app.Activity;
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
    public final int f42364a;
    public final Object f42365b;
    public final Object f42366c;

    public rd(int i9, Object obj, Object obj2) {
        this.f42364a = i9;
        this.f42365b = obj;
        this.f42366c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.z41 z41Var;
        org.telegram.ui.Components.d01 d01Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i9 = this.f42364a;
        MessageObject messageObject = null;
        boolean z10 = true;
        boolean z11 = false;
        Object obj = this.f42366c;
        Object obj2 = this.f42365b;
        switch (i9) {
            case 0:
                fe feVar = (fe) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                feVar.f38240w0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    feVar.f38241x0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.i51 i51Var = feVar.W0;
                if (i51Var != null && (z41Var = i51Var.U2) != null) {
                    z41Var.N(true);
                    return;
                }
                return;
            case 1:
                ((fe) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                return;
            case 2:
                qn qnVar = (qn) obj2;
                org.telegram.ui.Components.d01[] d01VarArr = (org.telegram.ui.Components.d01[]) obj;
                if (!qnVar.f41927gb && (d01Var = d01VarArr[0]) != null) {
                    d01VarArr[0] = null;
                    if (qnVar.f42050r0 == d01Var) {
                        qnVar.f42050r0 = null;
                    }
                    AndroidUtilities.removeFromParent(d01Var);
                    return;
                }
                return;
            case 3:
                ((gh.i2) obj2).run((TLRPC.User) obj);
                return;
            case 4:
                qn qnVar2 = (qn) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                int[] iArr = new int[2];
                t1Var.getLocationInWindow(iArr);
                kh.x3 x3Var = qnVar2.f42104v1;
                x3Var.setTranslationY(t1Var.getTimeY() + ((iArr[1] - x3Var.getTop()) - AndroidUtilities.dp(120.0f)));
                qnVar2.f42104v1.n(0.0f, ((((-AndroidUtilities.dp(16.0f)) + iArr[0]) + t1Var.f25497nb) + t1Var.f25468lb) - (t1Var.ob / 2.0f));
                qnVar2.f42104v1.v();
                return;
            case 5:
                qn.M0((qn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                return;
            case 6:
                qn qnVar3 = (qn) obj2;
                int[] iArr2 = (int[]) obj;
                qnVar3.getClass();
                if (iArr2[0] != 0) {
                    qnVar3.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            case 7:
                ((qn) obj2).h8((wg) obj);
                return;
            case 8:
                qn qnVar4 = (qn) obj2;
                Activity parentActivity = qnVar4.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (qnVar4.f41860b8 != 0) {
                    z10 = false;
                }
                ve.e.p(parentActivity, Uri.parse(str2), z10, false);
                return;
            case 9:
                ((qn) obj2).ka((TLRPC.Chat) obj);
                return;
            case 10:
                qn.c0((qn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 11:
                qn qnVar5 = (qn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.y4.w0(qnVar5, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.y4.w0(qnVar5, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.y4.w0(qnVar5, tL_error.text);
                    return;
                }
            case 12:
                a0.h hVar = (a0.h) obj2;
                l6 l6Var = (l6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i10 = 0; i10 < messageObject.messageOwner.media.webpage.attributes.size(); i10++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i10);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new rd(13, l6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new kt0(l6Var, 28));
                return;
            case 13:
                ((l6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 14:
                qn qnVar6 = (qn) obj2;
                View view = (View) obj;
                if (qnVar6.getParentActivity() != null) {
                    qnVar6.G0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    qnVar6.G0.r(16.0f);
                    qnVar6.G0.q(true);
                    qnVar6.G0.t(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    qnVar6.G0.m(0.0f, 96.0f);
                    qnVar6.G0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - qnVar6.va) - qnVar6.T0.getHeight()));
                    qnVar6.T0.addView(qnVar6.G0, g7.e6.e(-1, 100, 87));
                    kh.x3 x3Var2 = qnVar6.G0;
                    x3Var2.f16352h0 = new gf(qnVar6, 7);
                    x3Var2.v();
                    org.telegram.ui.Components.t30.v.b();
                    return;
                }
                return;
            case 15:
                ((qn) obj2).T0.removeView((org.telegram.ui.Components.uj0) obj);
                return;
            case 16:
                MessageObject messageObject2 = (MessageObject) obj;
                qn qnVar7 = ((ki) obj2).f39852s;
                MessageObject messageObject3 = (MessageObject) qnVar7.f41972k6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) qnVar7.f41972k6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                qnVar7.qc(messageObject2, true);
                hg.n0.f();
                return;
            case 17:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                qn qnVar8 = ((tl) ((vm) obj2).f43515f).f43027a.M;
                int i11 = qn.Dc;
                qnVar8.Ma();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                return;
            case 18:
                kh.x3 x3Var3 = (kh.x3) obj;
                qn qnVar9 = ((cn) obj2).f37236a;
                qnVar9.T0.removeView(x3Var3);
                if (x3Var3 == qnVar9.f42115w1) {
                    qnVar9.f42115w1 = null;
                    return;
                }
                return;
            case 19:
                Long l10 = (Long) obj;
                qn qnVar10 = ((wm) obj2).Y0.f37236a;
                if (l10.longValue() < 0 && (chat = qnVar10.getMessagesController().getChat(Long.valueOf(-l10.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(qnVar10);
                int i12 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i12, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 20:
                ho hoVar = (ho) obj2;
                hoVar.getClass();
                hoVar.presentFragment(s91.c0((TLRPC.Chat) obj, true));
                return;
            case 21:
                vo voVar = (vo) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = voVar.getMessagesController().getInputChannel(voVar.V);
                voVar.f43530d0 = voVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new y9(voVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 22:
                vo voVar2 = (vo) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z11 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                voVar2.Y = z11;
                if (!z11 && voVar2.getUserConfig().isPremium() && !voVar2.Z && voVar2.f43548x != null) {
                    voVar2.Z = true;
                    voVar2.a0();
                    voVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new io(voVar2, 2));
                    return;
                }
                return;
            case 23:
                hp.T((hp) obj2, (org.telegram.ui.ActionBar.c2[]) obj);
                return;
            case 24:
                hp hpVar = (hp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    hpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    hpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                hpVar.f38889w = false;
                hpVar.f38890x = true;
                hpVar.a0();
                return;
            case 25:
                ((dp) obj2).f37576x.d.L = false;
                ((org.telegram.ui.Components.r70) obj).run();
                return;
            case 26:
                ((dp) obj2).f37576x.d.K = false;
                ((org.telegram.ui.Components.s70) obj).run();
                return;
            case 27:
                hp hpVar2 = ((dp) obj2).f37576x.d;
                hpVar2.K = false;
                hpVar2.L = false;
                ((Runnable) obj).run();
                return;
            case 28:
                dp dpVar = (dp) obj2;
                dpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                dpVar.h = true;
                dpVar.f32639c.setChecked(true);
                return;
            default:
                jr jrVar = (jr) obj2;
                jrVar.getClass();
                jrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f22380id, 0, true);
                return;
        }
    }
}
