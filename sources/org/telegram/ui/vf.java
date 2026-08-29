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
import org.telegram.tgnet.tl.TL_aicompose;
public final class vf implements Runnable {
    public final int f43575a;
    public final Object f43576b;
    public final Object f43577c;

    public vf(int i10, Object obj, Object obj2) {
        this.f43575a = i10;
        this.f43576b = obj;
        this.f43577c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f43575a;
        MessageObject messageObject = null;
        boolean z10 = true;
        boolean z11 = false;
        Object obj = this.f43577c;
        Object obj2 = this.f43576b;
        switch (i10) {
            case 0:
                ((jh.g2) obj2).run((TLRPC.User) obj);
                return;
            case 1:
                tn tnVar = (tn) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                int[] iArr = new int[2];
                s1Var.getLocationInWindow(iArr);
                nh.t3 t3Var = tnVar.f43000v1;
                t3Var.setTranslationY(s1Var.getTimeY() + ((iArr[1] - t3Var.getTop()) - AndroidUtilities.dp(120.0f)));
                tnVar.f43000v1.n(0.0f, ((((-AndroidUtilities.dp(16.0f)) + iArr[0]) + s1Var.f25461nb) + s1Var.f25433lb) - (s1Var.ob / 2.0f));
                tnVar.f43000v1.v();
                return;
            case 2:
                tn.M0((tn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                return;
            case 3:
                tn tnVar2 = (tn) obj2;
                int[] iArr2 = (int[]) obj;
                tnVar2.getClass();
                if (iArr2[0] != 0) {
                    tnVar2.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            case 4:
                ((tn) obj2).h8((vg) obj);
                return;
            case 5:
                tn tnVar3 = (tn) obj2;
                Activity parentActivity = tnVar3.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (tnVar3.f42758b8 != 0) {
                    z10 = false;
                }
                ye.d.p(parentActivity, Uri.parse(str2), z10, false);
                return;
            case 6:
                ((tn) obj2).ka((TLRPC.Chat) obj);
                return;
            case 7:
                tn.d0((tn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 8:
                tn tnVar4 = (tn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.c5.w0(tnVar4, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.c5.w0(tnVar4, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.c5.w0(tnVar4, tL_error.text);
                    return;
                }
            case 9:
                a0.h hVar = (a0.h) obj2;
                l6 l6Var = (l6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new vf(10, l6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new it0(l6Var, 28));
                return;
            case 10:
                ((l6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 11:
                tn tnVar5 = (tn) obj2;
                View view = (View) obj;
                if (tnVar5.getParentActivity() != null) {
                    tnVar5.G0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    tnVar5.G0.r(16.0f);
                    tnVar5.G0.q(true);
                    tnVar5.G0.t(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    tnVar5.G0.m(0.0f, 96.0f);
                    tnVar5.G0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - tnVar5.f43009va) - tnVar5.T0.getHeight()));
                    tnVar5.T0.addView(tnVar5.G0, i7.f6.e(-1, 100, 87));
                    nh.t3 t3Var2 = tnVar5.G0;
                    t3Var2.f18597h0 = new df(tnVar5, 7);
                    t3Var2.v();
                    org.telegram.ui.Components.h40.v.b();
                    return;
                }
                return;
            case 12:
                ((tn) obj2).T0.removeView((org.telegram.ui.Components.fk0) obj);
                return;
            case 13:
                MessageObject messageObject2 = (MessageObject) obj;
                tn tnVar6 = ((ni) obj2).f40820s;
                MessageObject messageObject3 = (MessageObject) tnVar6.f42870k6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) tnVar6.f42870k6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                tnVar6.qc(messageObject2, true);
                kg.m0.f();
                return;
            case 14:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                tn tnVar7 = ((vl) ((ym) obj2).f44908f).f43618a.M;
                int i12 = tn.Dc;
                tnVar7.Ma();
                v0Var.getMessageObject().flickerLoading = false;
                v0Var.invalidate();
                return;
            case 15:
                nh.t3 t3Var3 = (nh.t3) obj;
                tn tnVar8 = ((fn) obj2).f38212a;
                tnVar8.T0.removeView(t3Var3);
                if (t3Var3 == tnVar8.f43014w1) {
                    tnVar8.f43014w1 = null;
                    return;
                }
                return;
            case 16:
                Long l10 = (Long) obj;
                tn tnVar9 = ((zm) obj2).Y0.f38212a;
                if (l10.longValue() < 0 && (chat = tnVar9.getMessagesController().getChat(Long.valueOf(-l10.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(tnVar9);
                int i13 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i13, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 17:
                ko koVar = (ko) obj2;
                koVar.getClass();
                koVar.presentFragment(t91.d0((TLRPC.Chat) obj, true));
                return;
            case 18:
                yo yoVar = (yo) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = yoVar.getMessagesController().getInputChannel(yoVar.V);
                yoVar.f44921d0 = yoVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new x9(yoVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 19:
                yo yoVar2 = (yo) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z11 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                yoVar2.Y = z11;
                if (!z11 && yoVar2.getUserConfig().isPremium() && !yoVar2.Z && yoVar2.f44939x != null) {
                    yoVar2.Z = true;
                    yoVar2.b0();
                    yoVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new lo(yoVar2, 2));
                    return;
                }
                return;
            case 20:
                kp.U((kp) obj2, (org.telegram.ui.ActionBar.c2[]) obj);
                return;
            case 21:
                kp kpVar = (kp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    kpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    kpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                kpVar.f39985w = false;
                kpVar.f39986x = true;
                kpVar.b0();
                return;
            case 22:
                ((gp) obj2).f38646x.d.L = false;
                ((org.telegram.ui.Components.e80) obj).run();
                return;
            case 23:
                ((gp) obj2).f38646x.d.K = false;
                ((org.telegram.ui.Components.f80) obj).run();
                return;
            case 24:
                kp kpVar2 = ((gp) obj2).f38646x.d;
                kpVar2.K = false;
                kpVar2.L = false;
                ((Runnable) obj).run();
                return;
            case 25:
                gp gpVar = (gp) obj2;
                gpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                gpVar.h = true;
                gpVar.f28813c.setChecked(true);
                return;
            case 26:
                jr jrVar = (jr) obj2;
                jrVar.getClass();
                jrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f22392id, 0, true);
                return;
            case 27:
                TLRPC.User user = (TLRPC.User) obj;
                jr jrVar2 = ((yq) obj2).f44954a;
                if (org.telegram.ui.Components.tc.a(jrVar2)) {
                    org.telegram.ui.Components.tc.C(jrVar2, user.first_name).j();
                    return;
                }
                return;
            case 28:
                ((org.telegram.ui.Components.g0) obj2).f28681q0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                return;
            default:
                org.telegram.ui.Components.s sVar = (org.telegram.ui.Components.s) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                sVar.getClass();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    sVar.dismiss();
                    return;
                }
                return;
        }
    }
}
