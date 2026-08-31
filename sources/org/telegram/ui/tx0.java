package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tx0 implements Runnable {
    public final int f41731a;
    public final ProfileActivity f41732b;
    public final TLRPC.TL_error f41733c;
    public final TLObject d;
    public final TLRPC.TL_channels_getParticipants f41734e;

    public tx0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f41731a = i10;
        this.f41732b = profileActivity;
        this.f41733c = tL_error;
        this.d = tLObject;
        this.f41734e = tL_channels_getParticipants;
    }

    @Override
    public final void run() {
        switch (this.f41731a) {
            case 0:
                ProfileActivity profileActivity = this.f41732b;
                profileActivity.getNotificationCenter().doOnIdle(new tx0(profileActivity, this.f41733c, this.d, this.f41734e, 1));
                return;
            default:
                ProfileActivity profileActivity2 = this.f41732b;
                if (this.f41733c == null) {
                    profileActivity2.getClass();
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) this.d;
                    profileActivity2.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                    profileActivity2.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                    if (tL_channels_channelParticipants.users.size() < 200) {
                        profileActivity2.A1 = true;
                    }
                    if (this.f41734e.offset == 0) {
                        profileActivity2.f34735z1.b();
                        profileActivity2.f34683r2.participants = new TLRPC.TL_chatParticipants();
                        profileActivity2.getMessagesStorage().putUsersAndChats(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                        profileActivity2.getMessagesStorage().updateChannelUsers(profileActivity2.f34577c1, tL_channels_channelParticipants.participants);
                    }
                    for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        tL_chatChannelParticipant.channelParticipant = channelParticipant;
                        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                        long peerId = MessageObject.getPeerId(channelParticipant.peer);
                        tL_chatChannelParticipant.user_id = peerId;
                        tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                        if (profileActivity2.f34735z1.h(peerId) < 0) {
                            TLRPC.ChatFull chatFull = profileActivity2.f34683r2;
                            if (chatFull.participants == null) {
                                chatFull.participants = new TLRPC.TL_chatParticipants();
                            }
                            profileActivity2.f34683r2.participants.participants.add(tL_chatChannelParticipant);
                            profileActivity2.f34735z1.k(tL_chatChannelParticipant, tL_chatChannelParticipant.user_id);
                        }
                    }
                }
                profileActivity2.f34729y1 = false;
                profileActivity2.F4();
                profileActivity2.e5(true, false);
                return;
        }
    }
}
