package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class uh implements Runnable {
    public final int f37973a;
    public final Object f37974b;
    public final Object f37975c;

    public uh(int i10, Object obj, Object obj2) {
        this.f37973a = i10;
        this.f37975c = obj;
        this.f37974b = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f37973a;
        MessageObject messageObject = null;
        boolean z10 = false;
        Object obj = this.f37974b;
        Object obj2 = this.f37975c;
        switch (i10) {
            case 0:
                a0.i iVar = (a0.i) obj2;
                m6 m6Var = (m6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new uh(m6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new mu0(m6Var, 28));
                return;
            case 1:
                ((m6) obj).run(Boolean.TRUE, (TLRPC.WebPage) obj2);
                return;
            case 2:
                bo boVar = (bo) obj2;
                View view = (View) obj;
                if (boVar.getParentActivity() != null) {
                    boVar.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    boVar.K0.q(16.0f);
                    boVar.K0.p(true);
                    boVar.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    boVar.K0.l(0.0f, 96.0f);
                    boVar.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - boVar.f32554za) - boVar.X0.getHeight()));
                    boVar.X0.addView(boVar.K0, w7.x5.e(-1, 100, 87));
                    ci.f4 f4Var = boVar.K0;
                    f4Var.f4635l0 = new qf(boVar, 7);
                    f4Var.u();
                    org.telegram.ui.Components.j40.v.b();
                    return;
                }
                return;
            case 3:
                ((bo) obj2).X0.removeView((org.telegram.ui.Components.fk0) obj);
                return;
            case 4:
                MessageObject messageObject2 = (MessageObject) obj;
                bo boVar2 = ((wi) obj2).f39241s;
                MessageObject messageObject3 = (MessageObject) boVar2.f32410o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) boVar2.f32410o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                boVar2.qc(messageObject2, true);
                zg.l0.f();
                return;
            case 5:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                bo boVar3 = ((em) ((gn) obj2).f33896f).f33375a.Q;
                int i12 = bo.Gc;
                boVar3.Ma();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                return;
            case 6:
                ci.f4 f4Var2 = (ci.f4) obj;
                bo boVar4 = ((nn) obj2).f36017a;
                boVar4.X0.removeView(f4Var2);
                if (f4Var2 == boVar4.A1) {
                    boVar4.A1 = null;
                    return;
                }
                return;
            case 7:
                Long l4 = (Long) obj;
                bo boVar5 = ((hn) obj2).f34333c1.f36017a;
                if (l4.longValue() < 0 && (chat = boVar5.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar5);
                int i13 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i13, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 8:
                wo woVar = (wo) obj2;
                woVar.getClass();
                woVar.presentFragment(za1.d0((TLRPC.Chat) obj, true));
                return;
            case 9:
                kp kpVar = (kp) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = kpVar.getMessagesController().getInputChannel(kpVar.Z);
                kpVar.f35214h0 = kpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new aa(kpVar, str2, tL_channels_checkUsername, 6), 2);
                return;
            case 10:
                kp kpVar2 = (kp) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                z10 = (tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                kpVar2.f35208c0 = z10;
                if (!z10 && kpVar2.getUserConfig().isPremium() && !kpVar2.f35209d0 && kpVar2.f35230x != null) {
                    kpVar2.f35209d0 = true;
                    kpVar2.b0();
                    kpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new xo(kpVar2, 2));
                    return;
                }
                return;
            case 11:
                wp.U((wp) obj2, (org.telegram.ui.ActionBar.b2[]) obj);
                return;
            case 12:
                wp wpVar = (wp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    wpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    wpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                wpVar.f39350w = false;
                wpVar.f39351x = true;
                wpVar.b0();
                return;
            case 13:
                ((sp) obj2).f37431x.d.P = false;
                ((org.telegram.ui.Components.i80) obj).run();
                return;
            case 14:
                ((sp) obj2).f37431x.d.O = false;
                ((org.telegram.ui.Components.j80) obj).run();
                return;
            case 15:
                wp wpVar2 = ((sp) obj2).f37431x.d;
                wpVar2.O = false;
                wpVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 16:
                sp spVar = (sp) obj2;
                spVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                spVar.h = true;
                spVar.f25562c.setChecked(true);
                return;
            case 17:
                ur urVar = (ur) obj2;
                urVar.getClass();
                urVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f18109id, 0, true);
                return;
            case 18:
                TLRPC.User user = (TLRPC.User) obj;
                ur urVar2 = ((jr) obj2).f34974a;
                if (org.telegram.ui.Components.vc.a(urVar2)) {
                    org.telegram.ui.Components.vc.C(urVar2, user.first_name).j();
                    return;
                }
                return;
            case 19:
                ((org.telegram.ui.Components.e0) obj2).f23470u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                return;
            case 20:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                qVar.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    return;
                }
                return;
            case 21:
                f01 f01Var = (f01) obj;
                if (((boolean[]) obj2)[0]) {
                    f01Var.run();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.ba baVar = (org.telegram.ui.Components.ba) obj2;
                TLObject tLObject2 = (TLObject) obj;
                baVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    baVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.oc ocVar = (org.telegram.ui.Components.oc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                ocVar.f26755n = true;
                org.telegram.ui.Components.sb sbVar = ocVar.e;
                if (sbVar instanceof org.telegram.ui.Components.tb) {
                    org.telegram.ui.Components.ub ubVar = (org.telegram.ui.Components.ub) ((org.telegram.ui.Components.tb) sbVar);
                    ubVar.f29679b.setText(charSequence);
                    AndroidUtilities.updateViewShow(ubVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(ubVar.f29679b, true, false, true);
                }
                ocVar.i(true);
                return;
            case 24:
                boolean[] zArr = (boolean[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.Components.jd) obj2).removeView((ci.f4) obj);
                return;
            case 26:
                int i14 = ChatActivityEnterView.f21727n5;
                ((ChatActivityEnterView) obj2).removeView((ci.f4) obj);
                return;
            case 27:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                int i15 = ChatActivityEnterView.f21727n5;
                chatActivityEnterView.setFieldText((CharSequence) obj);
                chatActivityEnterView.W = null;
                return;
            case 28:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                int i16 = ChatActivityEnterView.f21727n5;
                ((org.telegram.ui.Components.qd) obj).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.P2, true);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView3 = ((org.telegram.ui.Components.qg) obj2).V;
                chatActivityEnterView3.f21780i1 = chatActivityEnterView3.f21774h1.getAudioRightMs() - chatActivityEnterView3.f21774h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f21774h1.getAudioLeftMs(), chatActivityEnterView3.f21774h1.getAudioRightMs(), (org.telegram.ui.Components.ng) obj);
                return;
        }
    }

    public uh(m6 m6Var, TLRPC.WebPage webPage) {
        this.f37973a = 1;
        this.f37974b = m6Var;
        this.f37975c = webPage;
    }
}
