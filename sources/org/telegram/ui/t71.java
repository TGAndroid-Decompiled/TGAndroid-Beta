package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t71 extends org.telegram.ui.Components.bk0 {
    public final Context f52197c;
    public final ArrayList d;
    public final boolean f52198e;
    public final x71 f52199f;

    public t71(Context context, x71 x71Var) {
        boolean z10;
        int i7;
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
        TLRPC.Chat chat;
        int i26;
        org.telegram.messenger.fj fjVar;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        this.f52199f = x71Var;
        int i35 = x71Var.f53686b;
        if (i35 == 0 && Utilities.f22780b.nextInt(100) <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f52198e = z10;
        this.f52197c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int i36 = currentTimeMillis - 3600;
        if (i35 == 2) {
            if (x71Var.L1 >= 0) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                if (x71Var.D1 instanceof rc1) {
                    tL_message.message = org.telegram.messenger.gd.M0(2131753745, null);
                } else {
                    tL_message.message = org.telegram.messenger.gd.M0(2131753737, null);
                }
                tL_message.date = currentTimeMillis - 3540;
                tL_message.dialog_id = 1L;
                tL_message.flags = 259;
                tL_message.f28426id = 1;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.out = true;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                i32 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
                tL_peerUser.user_id = org.telegram.messenger.j10.i(i32).e();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                i33 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
                tL_peerUser2.user_id = org.telegram.messenger.j10.i(i33).e();
                i34 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
                org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(i34, tL_message, true, false);
                fjVar2.T = 1L;
                fjVar2.S1 = false;
                arrayList.add(fjVar2);
            }
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            if (x71Var.L1 < 0) {
                chat = x71Var.getMessagesController().O0(Long.valueOf(-x71Var.L1));
            } else {
                chat = null;
            }
            if (chat != null) {
                tL_message2.message = org.telegram.messenger.gd.M0(2131752445, null);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                tL_message3.message = org.telegram.messenger.gd.M0(2131752443, null);
                i31 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
                org.telegram.messenger.fj fjVar3 = new org.telegram.messenger.fj(i31, tL_message3, true, false);
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message2.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = chat.f28405id;
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message2.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = chat.f28405id;
                fjVar = fjVar3;
            } else {
                if (x71Var.L1 != 0) {
                    tL_message2.message = org.telegram.messenger.gd.M0(2131753744, null);
                } else if (x71Var.D1 instanceof rc1) {
                    tL_message2.message = org.telegram.messenger.gd.M0(2131753746, null);
                } else {
                    tL_message2.message = org.telegram.messenger.gd.M0(2131753738, null);
                }
                tL_message2.from_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_message2.peer_id = tL_peerUser3;
                i26 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
                tL_peerUser3.user_id = org.telegram.messenger.j10.i(i26).e();
                fjVar = null;
            }
            int i37 = currentTimeMillis - 3540;
            tL_message2.date = i37;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = 265;
            tL_message2.f28426id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            i27 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            org.telegram.messenger.fj fjVar4 = new org.telegram.messenger.fj(i27, tL_message2, fjVar, true, false);
            if (fjVar != null) {
                fjVar4.D0 = org.telegram.messenger.gd.M0(2131752444, null);
            }
            fjVar4.T = 1L;
            fjVar4.S1 = false;
            arrayList.add(fjVar4);
            if (x71Var.L1 != 0 && x71Var.f53734s0 == null) {
                TLRPC.User c22 = x71Var.getMessagesController().c2(Long.valueOf(x71Var.L1));
                TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                tL_message4.message = "";
                i28 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
                org.telegram.messenger.fj fjVar5 = new org.telegram.messenger.fj(i28, tL_message4, true, false);
                fjVar5.T = 1L;
                fjVar5.U = 5;
                arrayList.add(fjVar5);
                TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
                if (c22 != null) {
                    tL_message5.message = org.telegram.messenger.gd.a0(null, null, 2131752232, org.telegram.messenger.o10.k(c22, true));
                } else {
                    tL_message5.message = org.telegram.messenger.gd.M0(2131752446, null);
                }
                tL_message5.date = i37;
                tL_message5.dialog_id = 1L;
                tL_message5.flags = 265;
                tL_message5.from_id = new TLRPC.TL_peerUser();
                tL_message5.f28426id = 1;
                tL_message5.media = new TLRPC.TL_messageMediaEmpty();
                tL_message5.out = false;
                TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                tL_message5.peer_id = tL_peerUser4;
                i29 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
                tL_peerUser4.user_id = org.telegram.messenger.j10.i(i29).e();
                i30 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
                org.telegram.messenger.fj fjVar6 = new org.telegram.messenger.fj(i30, tL_message5, true, false);
                fjVar6.T = 1L;
                fjVar6.S1 = false;
                fjVar6.U = 1;
                arrayList.add(fjVar6);
                return;
            }
            return;
        }
        boolean z11 = z10;
        if (i35 == 1) {
            TLRPC.TL_message tL_message6 = new TLRPC.TL_message();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message6.media = tL_messageMediaDocument;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            TLRPC.Document document = tL_message6.media.document;
            document.mime_type = "audio/mp3";
            document.file_reference = new byte[0];
            document.f28411id = -2147483648L;
            document.size = 2621440L;
            document.dc_id = Integer.MIN_VALUE;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = org.telegram.messenger.gd.M0(2131748061, null) + ".mp3";
            tL_message6.media.document.attributes.add(tL_documentAttributeFilename);
            int i38 = currentTimeMillis + (-3540);
            tL_message6.date = i38;
            tL_message6.dialog_id = 1L;
            tL_message6.flags = 259;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message6.from_id = tL_peerUser5;
            tL_peerUser5.user_id = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).e();
            tL_message6.f28426id = 1;
            tL_message6.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message6.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            org.telegram.messenger.fj fjVar7 = new org.telegram.messenger.fj(org.telegram.messenger.j10.f24773t0, tL_message6, true, false);
            boolean z12 = org.telegram.messenger.s2.f26723a;
            TLRPC.TL_message tL_message7 = new TLRPC.TL_message();
            String M0 = org.telegram.messenger.gd.M0(2131748064, null);
            StringBuilder sb2 = new StringBuilder(M0);
            int indexOf = M0.indexOf(42);
            int lastIndexOf = M0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                sb2.replace(lastIndexOf, lastIndexOf + 1, "");
                sb2.replace(indexOf, indexOf + 1, "");
                TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                tL_messageEntityTextUrl.offset = indexOf;
                tL_messageEntityTextUrl.length = (lastIndexOf - indexOf) - 1;
                tL_messageEntityTextUrl.url = "https://telegram.org";
                tL_message7.entities.add(tL_messageEntityTextUrl);
            }
            tL_message7.message = sb2.toString();
            tL_message7.date = currentTimeMillis - 2640;
            tL_message7.dialog_id = 1L;
            tL_message7.flags = 259;
            TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
            tL_message7.from_id = tL_peerUser7;
            tL_peerUser7.user_id = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).e();
            tL_message7.f28426id = 1;
            tL_message7.media = new TLRPC.TL_messageMediaEmpty();
            tL_message7.out = true;
            TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
            tL_message7.peer_id = tL_peerUser8;
            tL_peerUser8.user_id = 0L;
            org.telegram.messenger.fj fjVar8 = new org.telegram.messenger.fj(org.telegram.messenger.j10.f24773t0, tL_message7, true, false);
            fjVar8.S1 = false;
            fjVar8.T = 1L;
            arrayList.add(fjVar8);
            TLRPC.TL_message tL_message8 = new TLRPC.TL_message();
            tL_message8.message = org.telegram.messenger.gd.M0(2131748065, null);
            tL_message8.date = i38;
            tL_message8.dialog_id = 1L;
            tL_message8.flags = 265;
            tL_message8.from_id = new TLRPC.TL_peerUser();
            tL_message8.f28426id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message8.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 16;
            tL_messageReplyHeader.reply_to_msg_id = 5;
            tL_message8.media = new TLRPC.TL_messageMediaEmpty();
            tL_message8.out = false;
            TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
            tL_message8.peer_id = tL_peerUser9;
            tL_peerUser9.user_id = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).e();
            org.telegram.messenger.fj fjVar9 = new org.telegram.messenger.fj(org.telegram.messenger.j10.f24773t0, tL_message8, true, false);
            fjVar9.D0 = org.telegram.messenger.gd.M0(2131748063, null);
            fjVar8.D0 = "Test User";
            fjVar9.T = 1L;
            fjVar9.S1 = false;
            fjVar9.C = fjVar7;
            fjVar8.C = fjVar9;
            arrayList.add(fjVar9);
            arrayList.add(fjVar7);
            TLRPC.TL_message tL_message9 = new TLRPC.TL_message();
            tL_message9.date = currentTimeMillis - 3480;
            tL_message9.dialog_id = 1L;
            tL_message9.flags = 259;
            tL_message9.out = false;
            tL_message9.from_id = new TLRPC.TL_peerUser();
            tL_message9.f28426id = 1;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
            tL_message9.media = tL_messageMediaDocument2;
            tL_messageMediaDocument2.flags |= 3;
            tL_messageMediaDocument2.document = new TLRPC.TL_document();
            TLRPC.Document document2 = tL_message9.media.document;
            document2.mime_type = "audio/ogg";
            document2.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.flags = 1028;
            tL_documentAttributeAudio.duration = 3.0d;
            tL_documentAttributeAudio.voice = true;
            tL_documentAttributeAudio.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
            tL_message9.media.document.attributes.add(tL_documentAttributeAudio);
            tL_message9.out = true;
            TLRPC.TL_peerUser tL_peerUser10 = new TLRPC.TL_peerUser();
            tL_message9.peer_id = tL_peerUser10;
            tL_peerUser10.user_id = 0L;
            i25 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            org.telegram.messenger.fj fjVar10 = new org.telegram.messenger.fj(i25, tL_message9, true, false);
            fjVar10.f23960i0 = 1;
            fjVar10.f23928b0 = 0.3f;
            fjVar10.E0 = true;
            arrayList.add(fjVar10);
        } else if (z11) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            tL_user.f28554id = 2147483647L;
            tL_user.first_name = "Me";
            TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
            tL_user2.f28554id = 2147483646L;
            tL_user2.first_name = "Serj";
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(tL_user);
            arrayList2.add(tL_user2);
            i21 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            org.telegram.messenger.mp.u1(i21).f4(arrayList2, true);
            TLRPC.TL_message tL_message10 = new TLRPC.TL_message();
            tL_message10.message = "Guess why Half-Life 3 was never released.";
            int i39 = currentTimeMillis - 2640;
            tL_message10.date = i39;
            tL_message10.dialog_id = -1L;
            tL_message10.flags = 259;
            tL_message10.f28426id = 2147483646;
            tL_message10.media = new TLRPC.TL_messageMediaEmpty();
            tL_message10.out = false;
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_message10.peer_id = tL_peerChat;
            tL_peerChat.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser11 = new TLRPC.TL_peerUser();
            tL_message10.from_id = tL_peerUser11;
            tL_peerUser11.user_id = tL_user2.f28554id;
            i22 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            arrayList.add(new org.telegram.messenger.fj(i22, tL_message10, true, false));
            TLRPC.TL_message tL_message11 = new TLRPC.TL_message();
            tL_message11.message = "No.\nAnd every unnecessary ping of the dev delays the release for 10 days.\nEvery request for ETA delays the release for 2 weeks.";
            tL_message11.date = i39;
            tL_message11.dialog_id = -1L;
            tL_message11.flags = 259;
            tL_message11.f28426id = 1;
            tL_message11.media = new TLRPC.TL_messageMediaEmpty();
            tL_message11.out = false;
            TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
            tL_message11.peer_id = tL_peerChat2;
            tL_peerChat2.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser12 = new TLRPC.TL_peerUser();
            tL_message11.from_id = tL_peerUser12;
            tL_peerUser12.user_id = tL_user2.f28554id;
            i23 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            arrayList.add(new org.telegram.messenger.fj(i23, tL_message11, true, false));
            TLRPC.TL_message tL_message12 = new TLRPC.TL_message();
            tL_message12.message = "Is source code for Android coming anytime soon?";
            tL_message12.date = currentTimeMillis - 3000;
            tL_message12.dialog_id = -1L;
            tL_message12.flags = 259;
            tL_message12.f28426id = 1;
            tL_message12.media = new TLRPC.TL_messageMediaEmpty();
            tL_message12.out = false;
            TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
            tL_message12.peer_id = tL_peerChat3;
            tL_peerChat3.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser13 = new TLRPC.TL_peerUser();
            tL_message12.from_id = tL_peerUser13;
            tL_peerUser13.user_id = tL_user.f28554id;
            i24 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            arrayList.add(new org.telegram.messenger.fj(i24, tL_message12, true, false));
        } else {
            TLRPC.TL_message tL_message13 = new TLRPC.TL_message();
            tL_message13.message = org.telegram.messenger.gd.M0(2131743920, null);
            int i40 = currentTimeMillis - 3540;
            tL_message13.date = i40;
            tL_message13.dialog_id = 1L;
            tL_message13.flags = 259;
            TLRPC.TL_peerUser tL_peerUser14 = new TLRPC.TL_peerUser();
            tL_message13.from_id = tL_peerUser14;
            i7 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            tL_peerUser14.user_id = org.telegram.messenger.j10.i(i7).e();
            tL_message13.f28426id = 1;
            tL_message13.media = new TLRPC.TL_messageMediaEmpty();
            tL_message13.out = true;
            TLRPC.TL_peerUser tL_peerUser15 = new TLRPC.TL_peerUser();
            tL_message13.peer_id = tL_peerUser15;
            tL_peerUser15.user_id = 0L;
            i10 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            org.telegram.messenger.fj fjVar11 = new org.telegram.messenger.fj(i10, tL_message13, true, false);
            TLRPC.TL_message tL_message14 = new TLRPC.TL_message();
            tL_message14.message = org.telegram.messenger.gd.M0(2131743919, null);
            tL_message14.date = currentTimeMillis - 2640;
            tL_message14.dialog_id = 1L;
            tL_message14.flags = 259;
            TLRPC.TL_peerUser tL_peerUser16 = new TLRPC.TL_peerUser();
            tL_message14.from_id = tL_peerUser16;
            i11 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            tL_peerUser16.user_id = org.telegram.messenger.j10.i(i11).e();
            tL_message14.f28426id = 1;
            tL_message14.media = new TLRPC.TL_messageMediaEmpty();
            tL_message14.out = true;
            TLRPC.TL_peerUser tL_peerUser17 = new TLRPC.TL_peerUser();
            tL_message14.peer_id = tL_peerUser17;
            tL_peerUser17.user_id = 0L;
            i12 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            arrayList.add(new org.telegram.messenger.fj(i12, tL_message14, true, false));
            TLRPC.TL_message tL_message15 = new TLRPC.TL_message();
            tL_message15.date = currentTimeMillis - 3470;
            tL_message15.dialog_id = 1L;
            tL_message15.flags = 259;
            tL_message15.from_id = new TLRPC.TL_peerUser();
            tL_message15.f28426id = 5;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
            tL_message15.media = tL_messageMediaDocument3;
            tL_messageMediaDocument3.flags |= 3;
            tL_messageMediaDocument3.document = new TLRPC.TL_document();
            TLRPC.Document document3 = tL_message15.media.document;
            document3.mime_type = "audio/mp4";
            document3.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio2.duration = 243.0d;
            tL_documentAttributeAudio2.performer = org.telegram.messenger.gd.M0(2131743915, null);
            tL_documentAttributeAudio2.title = org.telegram.messenger.gd.M0(2131743914, null);
            tL_message15.media.document.attributes.add(tL_documentAttributeAudio2);
            tL_message15.out = false;
            TLRPC.TL_peerUser tL_peerUser18 = new TLRPC.TL_peerUser();
            tL_message15.peer_id = tL_peerUser18;
            i13 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            tL_peerUser18.user_id = org.telegram.messenger.j10.i(i13).e();
            i14 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            arrayList.add(new org.telegram.messenger.fj(i14, tL_message15, true, false));
            TLRPC.TL_message tL_message16 = new TLRPC.TL_message();
            tL_message16.message = org.telegram.messenger.gd.M0(2131743918, null);
            tL_message16.date = i40;
            tL_message16.dialog_id = 1L;
            tL_message16.flags = 265;
            tL_message16.from_id = new TLRPC.TL_peerUser();
            tL_message16.f28426id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
            tL_message16.reply_to = tL_messageReplyHeader2;
            tL_messageReplyHeader2.flags |= 16;
            tL_messageReplyHeader2.reply_to_msg_id = 5;
            tL_message16.media = new TLRPC.TL_messageMediaEmpty();
            tL_message16.out = false;
            TLRPC.TL_peerUser tL_peerUser19 = new TLRPC.TL_peerUser();
            tL_message16.peer_id = tL_peerUser19;
            i15 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            tL_peerUser19.user_id = org.telegram.messenger.j10.i(i15).e();
            i16 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            org.telegram.messenger.fj fjVar12 = new org.telegram.messenger.fj(i16, tL_message16, true, false);
            fjVar12.D0 = org.telegram.messenger.gd.M0(2131743917, null);
            fjVar12.C = fjVar11;
            arrayList.add(fjVar12);
            TLRPC.TL_message tL_message17 = new TLRPC.TL_message();
            tL_message17.date = currentTimeMillis - 3480;
            tL_message17.dialog_id = 1L;
            tL_message17.flags = 259;
            TLRPC.TL_peerUser tL_peerUser20 = new TLRPC.TL_peerUser();
            tL_message17.from_id = tL_peerUser20;
            i17 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            tL_peerUser20.user_id = org.telegram.messenger.j10.i(i17).e();
            tL_message17.f28426id = 1;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
            tL_message17.media = tL_messageMediaDocument4;
            tL_messageMediaDocument4.flags |= 3;
            tL_messageMediaDocument4.document = new TLRPC.TL_document();
            TLRPC.Document document4 = tL_message17.media.document;
            document4.mime_type = "audio/ogg";
            document4.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio3 = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio3.flags = 1028;
            tL_documentAttributeAudio3.duration = 3.0d;
            tL_documentAttributeAudio3.voice = true;
            tL_documentAttributeAudio3.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
            tL_message17.media.document.attributes.add(tL_documentAttributeAudio3);
            tL_message17.out = true;
            TLRPC.TL_peerUser tL_peerUser21 = new TLRPC.TL_peerUser();
            tL_message17.peer_id = tL_peerUser21;
            tL_peerUser21.user_id = 0L;
            i18 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            org.telegram.messenger.fj fjVar13 = new org.telegram.messenger.fj(i18, tL_message17, true, false);
            fjVar13.f23960i0 = 1;
            fjVar13.f23928b0 = 0.3f;
            fjVar13.E0 = true;
            arrayList.add(fjVar13);
            arrayList.add(fjVar11);
            TLRPC.TL_message tL_message18 = new TLRPC.TL_message();
            tL_message18.date = currentTimeMillis - 3590;
            tL_message18.dialog_id = 1L;
            tL_message18.flags = 257;
            tL_message18.from_id = new TLRPC.TL_peerUser();
            tL_message18.f28426id = 1;
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
            tL_message18.media = tL_messageMediaPhoto;
            tL_messageMediaPhoto.flags |= 3;
            tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
            TLRPC.Photo photo = tL_message18.media.photo;
            photo.file_reference = new byte[0];
            photo.has_stickers = false;
            photo.f28429id = 1L;
            photo.access_hash = 0L;
            photo.date = i36;
            TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
            tL_photoSize.size = 0;
            tL_photoSize.f28430w = 500;
            tL_photoSize.h = 302;
            tL_photoSize.type = "s";
            tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
            tL_message18.media.photo.sizes.add(tL_photoSize);
            tL_message18.message = org.telegram.messenger.gd.M0(2131743916, null);
            tL_message18.out = false;
            TLRPC.TL_peerUser tL_peerUser22 = new TLRPC.TL_peerUser();
            tL_message18.peer_id = tL_peerUser22;
            i19 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            tL_peerUser22.user_id = org.telegram.messenger.j10.i(i19).e();
            i20 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            org.telegram.messenger.fj fjVar14 = new org.telegram.messenger.fj(i20, tL_message18, true, false);
            fjVar14.E0 = true;
            arrayList.add(fjVar14);
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final boolean F() {
        x71 x71Var = this.f52199f;
        int i7 = x71Var.f53686b;
        if (x71Var.B0 == null || i7 != 1 || x71Var.f53722n != 3 || x71Var.f53742w.f29175g == 0) {
            if (x71Var.A0 != null) {
                if (i7 != 2 && (i7 != 1 || x71Var.f53722n != 2)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int b() {
        int size = this.d.size();
        if (F()) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int d(int i7) {
        if (F()) {
            if (i7 == 0) {
                if (this.f52199f.f53722n == 3) {
                    return 3;
                }
                return 2;
            }
            i7--;
        }
        if (i7 >= 0) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.fj) arrayList.get(i7)).U;
            }
            return 4;
        }
        return 4;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = f1Var.f59126f;
        if (i10 != 2 && i10 != 3) {
            if (F()) {
                i7--;
            }
            ArrayList arrayList = this.d;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
            View view = f1Var.f59122a;
            boolean z13 = view instanceof org.telegram.ui.Cells.q1;
            x71 x71Var = this.f52199f;
            if (z13) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                boolean z14 = false;
                q1Var.f31347f6 = false;
                int i11 = i7 - 1;
                int d = d(i11);
                int i12 = i7 + 1;
                int d2 = d(i12);
                if (!(fjVar.f23968k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == f1Var.f59126f) {
                    org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i11);
                    if (fjVar2.P3() == fjVar.P3() && Math.abs(fjVar2.f23968k.date - fjVar.f23968k.date) <= 300) {
                        z10 = true;
                        if (d2 != f1Var.f59126f && i12 < arrayList.size()) {
                            org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList.get(i12);
                            if (!(fjVar3.f23968k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && fjVar3.P3() == fjVar.P3() && Math.abs(fjVar3.f23968k.date - fjVar.f23968k.date) <= 300) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z11 = z12;
                        } else {
                            z11 = false;
                        }
                        if (!this.f52198e || x71Var.L1 < 0) {
                            z14 = true;
                        }
                        q1Var.f31347f6 = z14;
                        q1Var.setFullyDraw(true);
                        q1Var.y3(fjVar, null, z10, z11, false, false);
                    }
                }
                z10 = false;
                if (d2 != f1Var.f59126f) {
                }
                z11 = false;
                if (!this.f52198e) {
                }
                z14 = true;
                q1Var.f31347f6 = z14;
                q1Var.setFullyDraw(true);
                q1Var.y3(fjVar, null, z10, z11, false, false);
            } else if (view instanceof org.telegram.ui.Cells.u0) {
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) view;
                u0Var.setMessageObject(fjVar);
                u0Var.setAlpha(1.0f);
                x71Var.a1();
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.q1 q1Var;
        int i10;
        x71 x71Var = this.f52199f;
        if (i7 == 0) {
            i10 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            org.telegram.ui.Cells.q1 q1Var2 = new org.telegram.ui.Cells.q1(this.f52197c, i10, false, null, new ij(this, 2));
            q1Var2.setDelegate(new nb.a(20));
            q1Var = q1Var2;
        } else {
            Context context = this.f52197c;
            if (i7 == 1) {
                org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(context, x71Var.f53682a, false);
                u0Var.setDelegate(new pb.b(20));
                q1Var = u0Var;
            } else if (i7 == 2) {
                if (x71Var.A0.getParent() != null) {
                    ((ViewGroup) x71Var.A0.getParent()).removeView(x71Var.A0);
                }
                hh0 hh0Var = new hh0(context, 11);
                hh0Var.addView(x71Var.A0, c8.ma.e(-1, 76, 17));
                q1Var = hh0Var;
            } else if (i7 == 5) {
                q1Var = new org.telegram.ui.Components.jn(x71Var.getParentActivity(), 25);
            } else {
                if (x71Var.B0.getParent() != null) {
                    ((ViewGroup) x71Var.B0.getParent()).removeView(x71Var.B0);
                }
                hh0 hh0Var2 = new hh0(context, 12);
                hh0Var2.addView(x71Var.B0, c8.ma.e(-1, 76, 17));
                q1Var = hh0Var2;
            }
        }
        return i5.c.q(q1Var, q1Var, -1, -2);
    }
}
