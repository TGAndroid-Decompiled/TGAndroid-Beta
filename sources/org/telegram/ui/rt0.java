package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rt0 implements Runnable {
    public final int f49284a;
    public final ProfileActivity f49285b;
    public final TLRPC.TL_error f49286c;
    public final TLObject d;
    public final TLRPC.TL_channels_getParticipants f49287e;

    public rt0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i3) {
        this.f49284a = i3;
        this.f49285b = profileActivity;
        this.f49286c = tL_error;
        this.d = tLObject;
        this.f49287e = tL_channels_getParticipants;
    }

    @Override
    public final void run() {
        switch (this.f49284a) {
            case 0:
                RectF rectF = ProfileActivity.T6;
                ProfileActivity profileActivity = this.f49285b;
                profileActivity.getNotificationCenter().d(new rt0(profileActivity, this.f49286c, this.d, this.f49287e, 1));
                return;
            default:
                ProfileActivity profileActivity2 = this.f49285b;
                if (this.f49286c == null) {
                    RectF rectF2 = ProfileActivity.T6;
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) this.d;
                    profileActivity2.getMessagesController().Y3(tL_channels_channelParticipants.users, false);
                    profileActivity2.getMessagesController().S3(tL_channels_channelParticipants.chats, false);
                    if (tL_channels_channelParticipants.users.size() < 200) {
                        profileActivity2.D1 = true;
                    }
                    if (this.f49287e.offset == 0) {
                        profileActivity2.C1.b();
                        profileActivity2.f41861u2.participants = new TLRPC.TL_chatParticipants();
                        profileActivity2.getMessagesStorage().m1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                        org.telegram.messenger.qr messagesStorage = profileActivity2.getMessagesStorage();
                        messagesStorage.f24934a.c(new org.telegram.messenger.dr(messagesStorage, profileActivity2.f41759f1, tL_channels_channelParticipants.participants, 2));
                    }
                    for (int i3 = 0; i3 < tL_channels_channelParticipants.participants.size(); i3++) {
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i3);
                        tL_chatChannelParticipant.channelParticipant = channelParticipant;
                        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                        long C1 = org.telegram.messenger.zi.C1(channelParticipant.peer);
                        tL_chatChannelParticipant.user_id = C1;
                        tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                        if (profileActivity2.C1.h(C1) < 0) {
                            TLRPC.ChatFull chatFull = profileActivity2.f41861u2;
                            if (chatFull.participants == null) {
                                chatFull.participants = new TLRPC.TL_chatParticipants();
                            }
                            profileActivity2.f41861u2.participants.participants.add(tL_chatChannelParticipant);
                            profileActivity2.C1.k(tL_chatChannelParticipant, tL_chatChannelParticipant.user_id);
                        }
                    }
                }
                profileActivity2.B1 = false;
                profileActivity2.T4();
                profileActivity2.D5(true, false);
                return;
        }
    }
}
