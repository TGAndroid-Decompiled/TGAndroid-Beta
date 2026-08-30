package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class yc1 extends org.telegram.ui.Components.rl0 {
    public final Context f40477c;
    public final ArrayList d;
    public final boolean e;
    public final cd1 f40478f;

    public yc1(Context context, cd1 cd1Var) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        TLRPC.Chat chat;
        int i27;
        MessageObject messageObject;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        this.f40478f = cd1Var;
        int i36 = cd1Var.f33290b;
        if (i36 == 0 && Utilities.random.nextInt(100) <= 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.e = z4;
        this.f40477c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int i37 = currentTimeMillis - 3600;
        if (i36 == 2) {
            if (cd1Var.G1 >= 0) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                if (cd1Var.f33350y1 instanceof mi1) {
                    tL_message.message = LocaleController.getString(R.string.BackgroundColorSinglePreviewLine2);
                } else {
                    tL_message.message = LocaleController.getString(R.string.BackgroundPreviewLine2);
                }
                tL_message.date = currentTimeMillis - 3540;
                tL_message.dialog_id = 1L;
                tL_message.flags = 259;
                tL_message.f19205id = 1;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.out = true;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                i33 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
                tL_peerUser.user_id = UserConfig.getInstance(i33).getClientUserId();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                i34 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
                tL_peerUser2.user_id = UserConfig.getInstance(i34).getClientUserId();
                i35 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
                MessageObject messageObject2 = new MessageObject(i35, tL_message, true, false);
                messageObject2.eventId = 1L;
                messageObject2.resetLayout();
                arrayList.add(messageObject2);
            }
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            if (cd1Var.G1 < 0) {
                chat = cd1Var.getMessagesController().getChat(Long.valueOf(-cd1Var.G1));
            } else {
                chat = null;
            }
            if (chat != null) {
                tL_message2.message = LocaleController.getString(R.string.ChannelBackgroundMessagePreview);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                tL_message3.message = LocaleController.getString(R.string.ChannelBackgroundMessageReplyText);
                i32 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
                MessageObject messageObject3 = new MessageObject(i32, tL_message3, true, false);
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message2.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = chat.f19184id;
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message2.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = chat.f19184id;
                messageObject = messageObject3;
            } else {
                if (cd1Var.G1 != 0) {
                    tL_message2.message = LocaleController.getString(R.string.BackgroundColorSinglePreviewLine3);
                } else if (cd1Var.f33350y1 instanceof mi1) {
                    tL_message2.message = LocaleController.getString(R.string.BackgroundColorSinglePreviewLine1);
                } else {
                    tL_message2.message = LocaleController.getString(R.string.BackgroundPreviewLine1);
                }
                tL_message2.from_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_message2.peer_id = tL_peerUser3;
                i27 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
                tL_peerUser3.user_id = UserConfig.getInstance(i27).getClientUserId();
                messageObject = null;
            }
            int i38 = currentTimeMillis - 3540;
            tL_message2.date = i38;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = 265;
            tL_message2.f19205id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            i28 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            MessageObject messageObject4 = new MessageObject(i28, (TLRPC.Message) tL_message2, messageObject, true, false);
            if (messageObject != null) {
                messageObject4.customReplyName = LocaleController.getString(R.string.ChannelBackgroundMessageReplyName);
            }
            messageObject4.eventId = 1L;
            messageObject4.resetLayout();
            arrayList.add(messageObject4);
            if (cd1Var.G1 != 0 && cd1Var.f33322n0 == null) {
                TLRPC.User user = cd1Var.getMessagesController().getUser(Long.valueOf(cd1Var.G1));
                TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                tL_message4.message = "";
                i29 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
                MessageObject messageObject5 = new MessageObject(i29, tL_message4, true, false);
                messageObject5.eventId = 1L;
                messageObject5.contentType = 5;
                arrayList.add(messageObject5);
                TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
                if (user != null) {
                    tL_message5.message = LocaleController.formatString(R.string.ChatBackgroundHint, UserObject.getFirstName(user));
                } else {
                    tL_message5.message = LocaleController.getString(R.string.ChannelBackgroundHint);
                }
                tL_message5.date = i38;
                tL_message5.dialog_id = 1L;
                tL_message5.flags = 265;
                tL_message5.from_id = new TLRPC.TL_peerUser();
                tL_message5.f19205id = 1;
                tL_message5.media = new TLRPC.TL_messageMediaEmpty();
                tL_message5.out = false;
                TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                tL_message5.peer_id = tL_peerUser4;
                i30 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
                tL_peerUser4.user_id = UserConfig.getInstance(i30).getClientUserId();
                i31 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
                MessageObject messageObject6 = new MessageObject(i31, tL_message5, true, false);
                messageObject6.eventId = 1L;
                messageObject6.resetLayout();
                messageObject6.contentType = 1;
                arrayList.add(messageObject6);
            }
        } else if (i36 == 1) {
            TLRPC.TL_message tL_message6 = new TLRPC.TL_message();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message6.media = tL_messageMediaDocument;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            TLRPC.Document document = tL_message6.media.document;
            document.mime_type = "audio/mp3";
            document.file_reference = new byte[0];
            document.f19190id = -2147483648L;
            document.size = 2621440L;
            document.dc_id = Integer.MIN_VALUE;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = LocaleController.getString(R.string.NewThemePreviewReply2) + ".mp3";
            tL_message6.media.document.attributes.add(tL_documentAttributeFilename);
            int i39 = currentTimeMillis + (-3540);
            tL_message6.date = i39;
            tL_message6.dialog_id = 1L;
            tL_message6.flags = 259;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message6.from_id = tL_peerUser5;
            tL_peerUser5.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            tL_message6.f19205id = 1;
            tL_message6.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message6.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            MessageObject messageObject7 = new MessageObject(UserConfig.selectedAccount, tL_message6, true, false);
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                TLRPC.TL_message tL_message7 = new TLRPC.TL_message();
                tL_message7.message = "this is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text";
                tL_message7.date = currentTimeMillis - 2640;
                tL_message7.dialog_id = 1L;
                tL_message7.flags = 259;
                TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
                tL_message7.from_id = tL_peerUser7;
                tL_peerUser7.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                tL_message7.f19205id = 1;
                tL_message7.media = new TLRPC.TL_messageMediaEmpty();
                tL_message7.out = true;
                TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
                tL_message7.peer_id = tL_peerUser8;
                tL_peerUser8.user_id = 0L;
                MessageObject messageObject8 = new MessageObject(UserConfig.selectedAccount, tL_message7, true, false);
                messageObject8.resetLayout();
                messageObject8.eventId = 1L;
                arrayList.add(messageObject8);
            }
            TLRPC.TL_message tL_message8 = new TLRPC.TL_message();
            String string = LocaleController.getString(R.string.NewThemePreviewLine3);
            StringBuilder sb = new StringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                sb.replace(lastIndexOf, lastIndexOf + 1, "");
                sb.replace(indexOf, indexOf + 1, "");
                TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                tL_messageEntityTextUrl.offset = indexOf;
                tL_messageEntityTextUrl.length = (lastIndexOf - indexOf) - 1;
                tL_messageEntityTextUrl.url = "https://telegram.org";
                tL_message8.entities.add(tL_messageEntityTextUrl);
            }
            tL_message8.message = sb.toString();
            tL_message8.date = currentTimeMillis - 2640;
            tL_message8.dialog_id = 1L;
            tL_message8.flags = 259;
            TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
            tL_message8.from_id = tL_peerUser9;
            tL_peerUser9.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            tL_message8.f19205id = 1;
            tL_message8.media = new TLRPC.TL_messageMediaEmpty();
            tL_message8.out = true;
            TLRPC.TL_peerUser tL_peerUser10 = new TLRPC.TL_peerUser();
            tL_message8.peer_id = tL_peerUser10;
            tL_peerUser10.user_id = 0L;
            MessageObject messageObject9 = new MessageObject(UserConfig.selectedAccount, tL_message8, true, false);
            messageObject9.resetLayout();
            messageObject9.eventId = 1L;
            arrayList.add(messageObject9);
            TLRPC.TL_message tL_message9 = new TLRPC.TL_message();
            tL_message9.message = LocaleController.getString(R.string.NewThemePreviewLine1);
            tL_message9.date = i39;
            tL_message9.dialog_id = 1L;
            tL_message9.flags = 265;
            tL_message9.from_id = new TLRPC.TL_peerUser();
            tL_message9.f19205id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message9.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 16;
            tL_messageReplyHeader.reply_to_msg_id = 5;
            tL_message9.media = new TLRPC.TL_messageMediaEmpty();
            tL_message9.out = false;
            TLRPC.TL_peerUser tL_peerUser11 = new TLRPC.TL_peerUser();
            tL_message9.peer_id = tL_peerUser11;
            tL_peerUser11.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            MessageObject messageObject10 = new MessageObject(UserConfig.selectedAccount, tL_message9, true, false);
            messageObject10.customReplyName = LocaleController.getString(R.string.NewThemePreviewName);
            messageObject9.customReplyName = "Test User";
            messageObject10.eventId = 1L;
            messageObject10.resetLayout();
            messageObject10.replyMessageObject = messageObject7;
            messageObject9.replyMessageObject = messageObject10;
            arrayList.add(messageObject10);
            arrayList.add(messageObject7);
            TLRPC.TL_message tL_message10 = new TLRPC.TL_message();
            tL_message10.date = currentTimeMillis - 3480;
            tL_message10.dialog_id = 1L;
            tL_message10.flags = 259;
            tL_message10.out = false;
            tL_message10.from_id = new TLRPC.TL_peerUser();
            tL_message10.f19205id = 1;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
            tL_message10.media = tL_messageMediaDocument2;
            tL_messageMediaDocument2.flags |= 3;
            tL_messageMediaDocument2.document = new TLRPC.TL_document();
            TLRPC.Document document2 = tL_message10.media.document;
            document2.mime_type = "audio/ogg";
            document2.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.flags = 1028;
            tL_documentAttributeAudio.duration = 3.0d;
            tL_documentAttributeAudio.voice = true;
            tL_documentAttributeAudio.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
            tL_message10.media.document.attributes.add(tL_documentAttributeAudio);
            tL_message10.out = true;
            TLRPC.TL_peerUser tL_peerUser12 = new TLRPC.TL_peerUser();
            tL_message10.peer_id = tL_peerUser12;
            tL_peerUser12.user_id = 0L;
            i26 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            MessageObject messageObject11 = new MessageObject(i26, tL_message10, true, false);
            messageObject11.audioProgressSec = 1;
            messageObject11.audioProgress = 0.3f;
            messageObject11.useCustomPhoto = true;
            arrayList.add(messageObject11);
        } else if (z4) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            tL_user.f19331id = 2147483647L;
            tL_user.first_name = "Me";
            TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
            tL_user2.f19331id = 2147483646L;
            tL_user2.first_name = "Serj";
            ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
            arrayList2.add(tL_user);
            arrayList2.add(tL_user2);
            i22 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            MessagesController.getInstance(i22).putUsers(arrayList2, true);
            TLRPC.TL_message tL_message11 = new TLRPC.TL_message();
            tL_message11.message = "Guess why Half-Life 3 was never released.";
            int i40 = currentTimeMillis - 2640;
            tL_message11.date = i40;
            tL_message11.dialog_id = -1L;
            tL_message11.flags = 259;
            tL_message11.f19205id = 2147483646;
            tL_message11.media = new TLRPC.TL_messageMediaEmpty();
            tL_message11.out = false;
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_message11.peer_id = tL_peerChat;
            tL_peerChat.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser13 = new TLRPC.TL_peerUser();
            tL_message11.from_id = tL_peerUser13;
            tL_peerUser13.user_id = tL_user2.f19331id;
            i23 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            arrayList.add(new MessageObject(i23, tL_message11, true, false));
            TLRPC.TL_message tL_message12 = new TLRPC.TL_message();
            tL_message12.message = "No.\nAnd every unnecessary ping of the dev delays the release for 10 days.\nEvery request for ETA delays the release for 2 weeks.";
            tL_message12.date = i40;
            tL_message12.dialog_id = -1L;
            tL_message12.flags = 259;
            tL_message12.f19205id = 1;
            tL_message12.media = new TLRPC.TL_messageMediaEmpty();
            tL_message12.out = false;
            TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
            tL_message12.peer_id = tL_peerChat2;
            tL_peerChat2.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser14 = new TLRPC.TL_peerUser();
            tL_message12.from_id = tL_peerUser14;
            tL_peerUser14.user_id = tL_user2.f19331id;
            i24 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            arrayList.add(new MessageObject(i24, tL_message12, true, false));
            TLRPC.TL_message tL_message13 = new TLRPC.TL_message();
            tL_message13.message = "Is source code for Android coming anytime soon?";
            tL_message13.date = currentTimeMillis - 3000;
            tL_message13.dialog_id = -1L;
            tL_message13.flags = 259;
            tL_message13.f19205id = 1;
            tL_message13.media = new TLRPC.TL_messageMediaEmpty();
            tL_message13.out = false;
            TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
            tL_message13.peer_id = tL_peerChat3;
            tL_peerChat3.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser15 = new TLRPC.TL_peerUser();
            tL_message13.from_id = tL_peerUser15;
            tL_peerUser15.user_id = tL_user.f19331id;
            i25 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            arrayList.add(new MessageObject(i25, tL_message13, true, false));
        } else {
            TLRPC.TL_message tL_message14 = new TLRPC.TL_message();
            tL_message14.message = LocaleController.getString(R.string.ThemePreviewLine1);
            int i41 = currentTimeMillis - 3540;
            tL_message14.date = i41;
            tL_message14.dialog_id = 1L;
            tL_message14.flags = 259;
            TLRPC.TL_peerUser tL_peerUser16 = new TLRPC.TL_peerUser();
            tL_message14.from_id = tL_peerUser16;
            i10 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            tL_peerUser16.user_id = UserConfig.getInstance(i10).getClientUserId();
            tL_message14.f19205id = 1;
            tL_message14.media = new TLRPC.TL_messageMediaEmpty();
            tL_message14.out = true;
            TLRPC.TL_peerUser tL_peerUser17 = new TLRPC.TL_peerUser();
            tL_message14.peer_id = tL_peerUser17;
            tL_peerUser17.user_id = 0L;
            i11 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            MessageObject messageObject12 = new MessageObject(i11, tL_message14, true, false);
            TLRPC.TL_message tL_message15 = new TLRPC.TL_message();
            tL_message15.message = LocaleController.getString(R.string.ThemePreviewLine2);
            tL_message15.date = currentTimeMillis - 2640;
            tL_message15.dialog_id = 1L;
            tL_message15.flags = 259;
            TLRPC.TL_peerUser tL_peerUser18 = new TLRPC.TL_peerUser();
            tL_message15.from_id = tL_peerUser18;
            i12 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            tL_peerUser18.user_id = UserConfig.getInstance(i12).getClientUserId();
            tL_message15.f19205id = 1;
            tL_message15.media = new TLRPC.TL_messageMediaEmpty();
            tL_message15.out = true;
            TLRPC.TL_peerUser tL_peerUser19 = new TLRPC.TL_peerUser();
            tL_message15.peer_id = tL_peerUser19;
            tL_peerUser19.user_id = 0L;
            i13 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            arrayList.add(new MessageObject(i13, tL_message15, true, false));
            TLRPC.TL_message tL_message16 = new TLRPC.TL_message();
            tL_message16.date = currentTimeMillis - 3470;
            tL_message16.dialog_id = 1L;
            tL_message16.flags = 259;
            tL_message16.from_id = new TLRPC.TL_peerUser();
            tL_message16.f19205id = 5;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
            tL_message16.media = tL_messageMediaDocument3;
            tL_messageMediaDocument3.flags |= 3;
            tL_messageMediaDocument3.document = new TLRPC.TL_document();
            TLRPC.Document document3 = tL_message16.media.document;
            document3.mime_type = "audio/mp4";
            document3.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio2.duration = 243.0d;
            tL_documentAttributeAudio2.performer = LocaleController.getString(R.string.ThemePreviewSongPerformer);
            tL_documentAttributeAudio2.title = LocaleController.getString(R.string.ThemePreviewSongTitle);
            tL_message16.media.document.attributes.add(tL_documentAttributeAudio2);
            tL_message16.out = false;
            TLRPC.TL_peerUser tL_peerUser20 = new TLRPC.TL_peerUser();
            tL_message16.peer_id = tL_peerUser20;
            i14 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            tL_peerUser20.user_id = UserConfig.getInstance(i14).getClientUserId();
            i15 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            arrayList.add(new MessageObject(i15, tL_message16, true, false));
            TLRPC.TL_message tL_message17 = new TLRPC.TL_message();
            tL_message17.message = LocaleController.getString(R.string.ThemePreviewLine3);
            tL_message17.date = i41;
            tL_message17.dialog_id = 1L;
            tL_message17.flags = 265;
            tL_message17.from_id = new TLRPC.TL_peerUser();
            tL_message17.f19205id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
            tL_message17.reply_to = tL_messageReplyHeader2;
            tL_messageReplyHeader2.flags |= 16;
            tL_messageReplyHeader2.reply_to_msg_id = 5;
            tL_message17.media = new TLRPC.TL_messageMediaEmpty();
            tL_message17.out = false;
            TLRPC.TL_peerUser tL_peerUser21 = new TLRPC.TL_peerUser();
            tL_message17.peer_id = tL_peerUser21;
            i16 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            tL_peerUser21.user_id = UserConfig.getInstance(i16).getClientUserId();
            i17 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            MessageObject messageObject13 = new MessageObject(i17, tL_message17, true, false);
            messageObject13.customReplyName = LocaleController.getString(R.string.ThemePreviewLine3Reply);
            messageObject13.replyMessageObject = messageObject12;
            arrayList.add(messageObject13);
            TLRPC.TL_message tL_message18 = new TLRPC.TL_message();
            tL_message18.date = currentTimeMillis - 3480;
            tL_message18.dialog_id = 1L;
            tL_message18.flags = 259;
            TLRPC.TL_peerUser tL_peerUser22 = new TLRPC.TL_peerUser();
            tL_message18.from_id = tL_peerUser22;
            i18 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            tL_peerUser22.user_id = UserConfig.getInstance(i18).getClientUserId();
            tL_message18.f19205id = 1;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
            tL_message18.media = tL_messageMediaDocument4;
            tL_messageMediaDocument4.flags |= 3;
            tL_messageMediaDocument4.document = new TLRPC.TL_document();
            TLRPC.Document document4 = tL_message18.media.document;
            document4.mime_type = "audio/ogg";
            document4.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio3 = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio3.flags = 1028;
            tL_documentAttributeAudio3.duration = 3.0d;
            tL_documentAttributeAudio3.voice = true;
            tL_documentAttributeAudio3.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
            tL_message18.media.document.attributes.add(tL_documentAttributeAudio3);
            tL_message18.out = true;
            TLRPC.TL_peerUser tL_peerUser23 = new TLRPC.TL_peerUser();
            tL_message18.peer_id = tL_peerUser23;
            tL_peerUser23.user_id = 0L;
            i19 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            MessageObject messageObject14 = new MessageObject(i19, tL_message18, true, false);
            messageObject14.audioProgressSec = 1;
            messageObject14.audioProgress = 0.3f;
            messageObject14.useCustomPhoto = true;
            arrayList.add(messageObject14);
            arrayList.add(messageObject12);
            TLRPC.TL_message tL_message19 = new TLRPC.TL_message();
            tL_message19.date = currentTimeMillis - 3590;
            tL_message19.dialog_id = 1L;
            tL_message19.flags = 257;
            tL_message19.from_id = new TLRPC.TL_peerUser();
            tL_message19.f19205id = 1;
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
            tL_message19.media = tL_messageMediaPhoto;
            tL_messageMediaPhoto.flags |= 3;
            tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
            TLRPC.Photo photo = tL_message19.media.photo;
            photo.file_reference = new byte[0];
            photo.has_stickers = false;
            photo.f19208id = 1L;
            photo.access_hash = 0L;
            photo.date = i37;
            TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
            tL_photoSize.size = 0;
            tL_photoSize.f19209w = 500;
            tL_photoSize.h = 302;
            tL_photoSize.type = "s";
            tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
            tL_message19.media.photo.sizes.add(tL_photoSize);
            tL_message19.message = LocaleController.getString(R.string.ThemePreviewLine4);
            tL_message19.out = false;
            TLRPC.TL_peerUser tL_peerUser24 = new TLRPC.TL_peerUser();
            tL_message19.peer_id = tL_peerUser24;
            i20 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            tL_peerUser24.user_id = UserConfig.getInstance(i20).getClientUserId();
            i21 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            MessageObject messageObject15 = new MessageObject(i21, tL_message19, true, false);
            messageObject15.useCustomPhoto = true;
            arrayList.add(messageObject15);
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    public final boolean F() {
        cd1 cd1Var = this.f40478f;
        int i10 = cd1Var.f33290b;
        if (cd1Var.f33343w0 == null || i10 != 1 || cd1Var.f33321n != 3 || cd1Var.f33333s.f19765g == 0) {
            if (cd1Var.f33340v0 != null) {
                if (i10 != 2 && (i10 != 1 || cd1Var.f33321n != 2)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        int size = this.d.size();
        if (F()) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int j(int i10) {
        if (F()) {
            if (i10 == 0) {
                if (this.f40478f.f33321n == 3) {
                    return 3;
                }
                return 2;
            }
            i10--;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                return ((MessageObject) arrayList.get(i10)).contentType;
            }
            return 4;
        }
        return 4;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        int i11 = l1Var.f5788f;
        if (i11 != 2 && i11 != 3) {
            if (F()) {
                i10--;
            }
            ArrayList arrayList = this.d;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            View view = l1Var.f5785a;
            boolean z12 = view instanceof org.telegram.ui.Cells.t1;
            cd1 cd1Var = this.f40478f;
            if (z12) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                boolean z13 = false;
                t1Var.K7 = false;
                int i12 = i10 - 1;
                int j10 = j(i12);
                int i13 = i10 + 1;
                int j11 = j(i13);
                if (!(messageObject.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && j10 == l1Var.f5788f) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(i12);
                    if (messageObject2.isOutOwner() == messageObject.isOutOwner() && Math.abs(messageObject2.messageOwner.date - messageObject.messageOwner.date) <= 300) {
                        z4 = true;
                        if (j11 != l1Var.f5788f && i13 < arrayList.size()) {
                            MessageObject messageObject3 = (MessageObject) arrayList.get(i13);
                            if (!(messageObject3.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject3.isOutOwner() == messageObject.isOutOwner() && Math.abs(messageObject3.messageOwner.date - messageObject.messageOwner.date) <= 300) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z10 = z11;
                        } else {
                            z10 = false;
                        }
                        t1Var.K7 = (!this.e || cd1Var.G1 < 0) ? true : true;
                        t1Var.setFullyDraw(true);
                        t1Var.X3(messageObject, null, z4, z10, false, false);
                    }
                }
                z4 = false;
                if (j11 != l1Var.f5788f) {
                }
                z10 = false;
                t1Var.K7 = (!this.e || cd1Var.G1 < 0) ? true : true;
                t1Var.setFullyDraw(true);
                t1Var.X3(messageObject, null, z4, z10, false, false);
            } else if (view instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                v0Var.setMessageObject(messageObject);
                v0Var.setAlpha(1.0f);
                cd1Var.V0();
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t1 t1Var;
        int i11;
        cd1 cd1Var = this.f40478f;
        if (i10 == 0) {
            i11 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            org.telegram.ui.Cells.t1 t1Var2 = new org.telegram.ui.Cells.t1(this.f40477c, i11, false, null, new ov0(this, 5));
            t1Var2.setDelegate(new db.a(17));
            t1Var = t1Var2;
        } else {
            Context context = this.f40477c;
            if (i10 == 1) {
                org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, cd1Var.f33287a, false);
                v0Var.setDelegate(new h7.u(17));
                t1Var = v0Var;
            } else if (i10 == 2) {
                if (cd1Var.f33340v0.getParent() != null) {
                    ((ViewGroup) cd1Var.f33340v0.getParent()).removeView(cd1Var.f33340v0);
                }
                a51 a51Var = new a51(context, 3);
                a51Var.addView(cd1Var.f33340v0, k7.b6.e(-1, 76, 17));
                t1Var = a51Var;
            } else if (i10 == 5) {
                t1Var = new org.telegram.ui.Components.hn(cd1Var.getParentActivity(), 23);
            } else {
                if (cd1Var.f33343w0.getParent() != null) {
                    ((ViewGroup) cd1Var.f33343w0.getParent()).removeView(cd1Var.f33343w0);
                }
                a51 a51Var2 = new a51(context, 4);
                a51Var2.addView(cd1Var.f33343w0, k7.b6.e(-1, 76, 17));
                t1Var = a51Var2;
            }
        }
        return yh.o(t1Var, t1Var, -1, -2);
    }
}
