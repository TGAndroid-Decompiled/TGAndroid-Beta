package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.ViewGroup;
import android.widget.Toast;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rb implements org.telegram.ui.Cells.l1 {
    public final wb f39725a;

    public rb(wb wbVar) {
        this.f39725a = wbVar;
    }

    @Override
    public final void A0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        ac acVar = this.f39725a.f41234n;
        int i10 = ac.Q0;
        acVar.P0(u1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean B1() {
        return false;
    }

    @Override
    public final void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.s(u1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle H1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ac acVar = this.f39725a.f41234n;
        org.telegram.ui.Components.hv.J(acVar, messageObject, acVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override
    public final boolean J0(long j10) {
        return false;
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(this.f39725a.f41234n.f34148o0, messageObject, 0L);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
        MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
        return playMessage;
    }

    @Override
    public final void M0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.WebPage webPage;
        int i11;
        ac acVar = this.f39725a.f41234n;
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            fo foVar = new fo(bundle);
            if (ChatObject.isForum(acVar.f34138f)) {
                long dialogId = messageObject.getDialogId();
                i11 = ((org.telegram.ui.ActionBar.m2) acVar).currentAccount;
                og.d.a(foVar, MessagesStorage.TopicKey.of(dialogId, MessageObject.getTopicId(i11, messageObject.messageOwner, true)));
            }
            acVar.presentFragment(foVar);
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                    acVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            TLRPC.User user = acVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
            TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
            String str = messageMedia2.vcard;
            String str2 = messageMedia2.first_name;
            String str3 = messageMedia2.last_name;
            try {
                File sharingDirectory = AndroidUtilities.getSharingDirectory();
                sharingDirectory.mkdirs();
                File file = new File(sharingDirectory, "vcard.vcf");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(str);
                bufferedWriter.close();
                acVar.showDialog(new org.telegram.ui.Components.of0(acVar, null, user, null, file, null, str2, str3, null));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                pf.d.s(acVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            }
        }
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final wv0 P1() {
        return null;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean Q1(long j10) {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final void R0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ac acVar = this.f39725a.f41234n;
        if (characterStyle != null) {
            MessageObject messageObject = u1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.o61) {
                org.telegram.ui.Components.o61 o61Var = (org.telegram.ui.Components.o61) characterStyle;
                AndroidUtilities.addToClipboard(o61Var.f27892a.subSequence(o61Var.f27893b, o61Var.f27894c).toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(acVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.s61) {
                Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.s61) characterStyle).getURL());
                long longValue = parseLong.longValue();
                if (longValue > 0) {
                    i13 = ((org.telegram.ui.ActionBar.m2) acVar).currentAccount;
                    TLRPC.User user = MessagesController.getInstance(i13).getUser(parseLong);
                    if (user != null) {
                        i14 = ((org.telegram.ui.ActionBar.m2) acVar).currentAccount;
                        MessagesController.getInstance(i14).openChatOrProfileWith(user, null, acVar, 0, false);
                        return;
                    }
                    return;
                }
                i11 = ((org.telegram.ui.ActionBar.m2) acVar).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    i12 = ((org.telegram.ui.ActionBar.m2) acVar).currentAccount;
                    MessagesController.getInstance(i12).openChatOrProfileWith(null, chat, acVar, 0, false);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.p61) {
                String url = ((org.telegram.ui.Components.p61) characterStyle).getURL();
                if (url.startsWith("@")) {
                    i10 = ((org.telegram.ui.ActionBar.m2) acVar).currentAccount;
                    MessagesController.getInstance(i10).openByUserName(url.substring(1), acVar, 0);
                } else if (url.startsWith("#")) {
                    yy yyVar = new yy(null);
                    yyVar.f42371n2 = url;
                    acVar.presentFragment(yyVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z10) {
                    org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) acVar.getParentActivity(), (org.telegram.ui.ActionBar.c6) null, false);
                    e3Var.fixNavigationBar();
                    e3Var.title = url2;
                    e3Var.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    mg.j jVar = new mg.j(2, this, url2);
                    e3Var.items = charSequenceArr;
                    e3Var.onClickListener = jVar;
                    acVar.showDialog(e3Var);
                } else if (characterStyle instanceof org.telegram.ui.Components.r61) {
                    String url3 = ((org.telegram.ui.Components.r61) characterStyle).getURL();
                    if (!pf.d.f(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(acVar.getParentActivity());
                        String string = LocaleController.getString(R.string.OpenUrlTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                        a2Var.R = string;
                        a2Var.T = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new m4.z0(7, acVar, url3));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        acVar.showDialog(a2Var);
                        return;
                    }
                    pf.d.o(acVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
                        if ((pf.d.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.G1;
                            if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().l(messageObject) != null) {
                                return;
                            }
                            acVar.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                    }
                    pf.d.o(acVar.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final void R1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
        MessageObject messageObject = u1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        ac acVar = this.f39725a.f41234n;
        if (dialogId == (-acVar.f34138f.f19216id)) {
            for (int i11 = 0; i11 < acVar.f34148o0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) acVar.f34148o0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    acVar.Y0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", acVar.f34138f.f19216id);
        bundle.putInt("message_id", messageObject.getRealId());
        acVar.presentFragment(new fo(bundle));
    }

    @Override
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11;
        ac acVar = this.f39725a.f41234n;
        if (chat != null && chat != acVar.f34138f) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19216id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            i11 = ((org.telegram.ui.ActionBar.m2) acVar).currentAccount;
            if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, acVar)) {
                acVar.presentFragment(new fo(bundle), true);
            }
        }
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean S1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final ih.a Y() {
        return null;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean Z0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f19363id);
        wb wbVar = this.f39725a;
        ac.p0(wbVar.f41234n, bundle, user.f19363id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        wbVar.f41234n.presentFragment(profileActivity);
    }

    @Override
    public final boolean b2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        int i10;
        int i11;
        b5 b10;
        ac acVar = this.f39725a.f41234n;
        if (user != null) {
            long j10 = user.f19363id;
            i10 = ((org.telegram.ui.ActionBar.m2) acVar).currentAccount;
            if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
                h5[] h5VarArr = {h5.d, h5.h};
                TLRPC.UserFull userFull = acVar.getMessagesController().getUserFull(user.f19363id);
                if (userFull == null) {
                    i11 = ((org.telegram.ui.ActionBar.m2) acVar).classGuid;
                    b10 = b5.b(user, i11, h5VarArr);
                } else {
                    b10 = b5.c(user, userFull, h5VarArr);
                }
                if (c2.b.g(b10)) {
                    c2.b.m().y((ViewGroup) acVar.fragmentView, acVar.getResourceProvider(), b10, new m4.z0(this, u1Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.d0.a(messageObject);
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final String g(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public final void h1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = u1Var.getMessageObject();
        wb wbVar = this.f39725a;
        if (wbVar.f41234n.f34149p0.contains(Long.valueOf(messageObject.eventId))) {
            wbVar.f41234n.f34149p0.remove(Long.valueOf(messageObject.eventId));
        } else {
            wbVar.f41234n.f34149p0.add(Long.valueOf(messageObject.eventId));
        }
        wbVar.f41234n.W0(true);
        wbVar.f41234n.R0();
        wbVar.f41234n.E.l();
    }

    @Override
    public final void j() {
        ac acVar = this.f39725a.f41234n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            pf.d.s(acVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.s(acVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final boolean l0() {
        return true;
    }

    @Override
    public final boolean l2(int i10) {
        return false;
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.b6 b6Var) {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.p9 p2() {
        return null;
    }

    @Override
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        ac acVar = this.f39725a.f41234n;
        int i10 = ac.Q0;
        acVar.P0(u1Var, 0.0f, 0.0f);
    }

    @Override
    public final void r(org.telegram.ui.Cells.u1 u1Var) {
        boolean z10;
        wb wbVar = this.f39725a;
        ac acVar = wbVar.f41234n;
        if (acVar.getParentActivity() == null) {
            return;
        }
        Context context = wbVar.f41232c;
        MessageObject messageObject = u1Var.getMessageObject();
        if (ChatObject.isChannel(acVar.f34138f) && !acVar.f34138f.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        acVar.showDialog(org.telegram.ui.Components.jr0.O0(context, messageObject, null, z10, null));
    }

    @Override
    public final void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10;
        if (user != null) {
            long j10 = user.f19363id;
            i10 = ((org.telegram.ui.ActionBar.m2) this.f39725a.f41234n).currentAccount;
            if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
                a(user);
            }
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.u1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rb.v0(org.telegram.ui.Cells.u1, float, float, boolean):void");
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final String w(long j10) {
        return null;
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void D1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void F1(MessageObject messageObject) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void L1() {
    }

    @Override
    public final void N(MessageObject messageObject) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void T0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void V0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void c2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void d0(int i10) {
    }

    @Override
    public final void f1() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void n0(String str) {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void w1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
    }

    @Override
    public final void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void O0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void W1(org.telegram.ui.Cells.u1 u1Var, long j10) {
    }

    @Override
    public final void k1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override
    public final void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void o2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public final void p1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
