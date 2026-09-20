package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f37323a;
    public final TLRPC.Chat f37324b;
    public TLRPC.ChannelParticipantsFilter f37325c;
    public boolean f37326f;
    public boolean h;
    public boolean f37328r;
    public boolean f37329s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f37327n = -1;

    public s71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f37323a = i10;
        this.f37324b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f37325c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f37329s) {
                this.f37329s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f37329s) {
            return;
        }
        this.f37329s = false;
        int i10 = this.f37323a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f37327n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f37327n, true);
            this.f37327n = -1;
        }
        this.f37326f = false;
    }

    public final void b() {
        int size;
        if (!this.f37326f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f37325c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18327q)) {
                this.f37326f = true;
                TLRPC.Chat chat = this.f37324b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f37325c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f37328r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f37323a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f18329id;
            TLRPC.Chat chat = this.f37324b;
            if (j3 == chat.f18328id && !ChatObject.isChannel(chat) && this.f37326f) {
                this.f37326f = false;
                b();
            }
        }
    }
}
