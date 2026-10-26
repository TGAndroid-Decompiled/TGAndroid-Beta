package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tx0 implements Runnable {
    public final int f43931a;
    public final ProfileActivity f43932b;
    public final TLRPC.TL_error f43933c;
    public final TLObject d;
    public final TLRPC.TL_channels_getParticipants e;

    public tx0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f43931a = i10;
        this.f43932b = profileActivity;
        this.f43933c = tL_error;
        this.d = tLObject;
        this.e = tL_channels_getParticipants;
    }

    @Override
    public final void run() {
        switch (this.f43931a) {
            case 0:
                int i10 = ProfileActivity.R6;
                ProfileActivity profileActivity = this.f43932b;
                profileActivity.getNotificationCenter().doOnIdle(new tx0(profileActivity, this.f43933c, this.d, this.e, 1));
                return;
            default:
                ProfileActivity profileActivity2 = this.f43932b;
                if (this.f43933c == null) {
                    int i11 = ProfileActivity.R6;
                    profileActivity2.getClass();
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) this.d;
                    profileActivity2.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                    profileActivity2.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                    if (tL_channels_channelParticipants.users.size() < 200) {
                        profileActivity2.D1 = true;
                    }
                    if (this.e.offset == 0) {
                        profileActivity2.C1.b();
                        profileActivity2.f36091u2.participants = new TLRPC.TL_chatParticipants();
                        profileActivity2.getMessagesStorage().putUsersAndChats(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                        profileActivity2.getMessagesStorage().updateChannelUsers(profileActivity2.f35987f1, tL_channels_channelParticipants.participants);
                    }
                    for (int i12 = 0; i12 < tL_channels_channelParticipants.participants.size(); i12++) {
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                        tL_chatChannelParticipant.channelParticipant = channelParticipant;
                        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                        long peerId = MessageObject.getPeerId(channelParticipant.peer);
                        tL_chatChannelParticipant.user_id = peerId;
                        tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                        if (profileActivity2.C1.h(peerId) < 0) {
                            TLRPC.ChatFull chatFull = profileActivity2.f36091u2;
                            if (chatFull.participants == null) {
                                chatFull.participants = new TLRPC.TL_chatParticipants();
                            }
                            profileActivity2.f36091u2.participants.participants.add(tL_chatChannelParticipant);
                            profileActivity2.C1.k(tL_chatChannelParticipant, tL_chatChannelParticipant.user_id);
                        }
                    }
                }
                profileActivity2.B1 = false;
                profileActivity2.N4();
                profileActivity2.p5(true, false);
                return;
        }
    }
}
