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
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class ug implements Runnable {
    public final int f42549a;
    public final Object f42550b;
    public final Object f42551c;

    public ug(int i10, Object obj, Object obj2) {
        this.f42549a = i10;
        this.f42550b = obj;
        this.f42551c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f42549a;
        MessageObject messageObject = null;
        boolean z10 = true;
        boolean z11 = false;
        Object obj = this.f42551c;
        Object obj2 = this.f42550b;
        switch (i10) {
            case 0:
                ((sa) obj2).run((TLRPC.User) obj);
                return;
            case 1:
                zn znVar = (zn) obj2;
                int[] iArr = (int[]) obj;
                znVar.getClass();
                if (iArr[0] != 0) {
                    znVar.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 2:
                zn znVar2 = (zn) obj2;
                Activity parentActivity = znVar2.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (znVar2.f44772f8 != 0) {
                    z10 = false;
                }
                of.f.p(parentActivity, Uri.parse(str2), z10, false);
                return;
            case 3:
                ((zn) obj2).k8((mh) obj);
                return;
            case 4:
                ((zn) obj2).pa((TLRPC.Chat) obj);
                return;
            case 5:
                zn.r0((zn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 6:
                zn znVar3 = (zn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.g5.v0(znVar3, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.g5.v0(znVar3, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.g5.v0(znVar3, tL_error.text);
                    return;
                }
            case 7:
                a0.i iVar = (a0.i) obj2;
                k6 k6Var = (k6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new ug(8, k6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new mu0(k6Var, 29));
                return;
            case 8:
                ((k6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 9:
                zn znVar4 = (zn) obj2;
                View view = (View) obj;
                if (znVar4.getParentActivity() != null) {
                    znVar4.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    znVar4.K0.q(16.0f);
                    znVar4.K0.p(true);
                    znVar4.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    znVar4.K0.l(0.0f, 96.0f);
                    znVar4.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - znVar4.Aa) - znVar4.X0.getHeight()));
                    znVar4.X0.addView(znVar4.K0, w7.x5.e(-1, 100, 87));
                    ci.d4 d4Var = znVar4.K0;
                    d4Var.f4917l0 = new le(znVar4, 26);
                    d4Var.u();
                    org.telegram.ui.Components.b50.f24856w.b();
                    return;
                }
                return;
            case 10:
                ((zn) obj2).X0.removeView((org.telegram.ui.Components.ml0) obj);
                return;
            case 11:
                MessageObject messageObject2 = (MessageObject) obj;
                zn znVar5 = ((wi) obj2).f43788s;
                MessageObject messageObject3 = (MessageObject) znVar5.f44879o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) znVar5.f44879o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                znVar5.uc(messageObject2, true);
                zg.j0.f();
                return;
            case 12:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                zn znVar6 = ((dm) ((en) obj2).f37406f).f37050a.Q;
                int i12 = zn.Hc;
                znVar6.Qa();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                return;
            case 13:
                ci.d4 d4Var2 = (ci.d4) obj;
                zn znVar7 = ((ln) obj2).f39701a;
                znVar7.X0.removeView(d4Var2);
                if (d4Var2 == znVar7.A1) {
                    znVar7.A1 = null;
                    return;
                }
                return;
            case 14:
                Long l4 = (Long) obj;
                zn znVar8 = ((fn) obj2).f37722c1.f39701a;
                if (l4.longValue() < 0 && (chat = znVar8.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(znVar8);
                int i13 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i13, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 15:
                uo uoVar = (uo) obj2;
                uoVar.getClass();
                uoVar.presentFragment(ab1.d0((TLRPC.Chat) obj, true));
                return;
            case 16:
                ip ipVar = (ip) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = ipVar.getMessagesController().getInputChannel(ipVar.Z);
                ipVar.f38747h0 = ipVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new aa(ipVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 17:
                ip ipVar2 = (ip) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z11 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                ipVar2.f38740c0 = z11;
                if (!z11 && ipVar2.getUserConfig().isPremium() && !ipVar2.f38741d0 && ipVar2.f38763x != null) {
                    ipVar2.f38741d0 = true;
                    ipVar2.b0();
                    ipVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new vo(ipVar2, 2));
                    return;
                }
                return;
            case 18:
                up.U((up) obj2, (org.telegram.ui.ActionBar.a2[]) obj);
                return;
            case 19:
                up upVar = (up) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    upVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    upVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                upVar.f42742w = false;
                upVar.f42743x = true;
                upVar.b0();
                return;
            case 20:
                ((qp) obj2).f41215x.d.P = false;
                ((org.telegram.ui.Components.l90) obj).run();
                return;
            case 21:
                ((qp) obj2).f41215x.d.O = false;
                ((org.telegram.ui.Components.m90) obj).run();
                return;
            case 22:
                up upVar2 = ((qp) obj2).f41215x.d;
                upVar2.O = false;
                upVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 23:
                qp qpVar = (qp) obj2;
                qpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                qpVar.h = true;
                qpVar.f29009c.setChecked(true);
                return;
            case 24:
                sr srVar = (sr) obj2;
                srVar.getClass();
                srVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f20032id, 0, true);
                return;
            case 25:
                TLRPC.User user = (TLRPC.User) obj;
                sr srVar2 = ((hr) obj2).f38494a;
                if (org.telegram.ui.Components.ad.a(srVar2)) {
                    org.telegram.ui.Components.ad.C(srVar2, user.first_name).j();
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.Components.e0) obj2).f25780u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                return;
            case 27:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                qVar.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    return;
                }
                return;
            case 28:
                mz0 mz0Var = (mz0) obj;
                if (((boolean[]) obj2)[0]) {
                    mz0Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) obj2;
                TLObject tLObject2 = (TLObject) obj;
                faVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    faVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
        }
    }
}
