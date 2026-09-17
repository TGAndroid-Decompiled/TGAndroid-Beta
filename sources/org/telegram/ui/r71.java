package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f37105a;
    public final TLRPC.Chat f37106b;
    public TLRPC.ChannelParticipantsFilter f37107c;
    public boolean f37108f;
    public boolean h;
    public boolean f37110r;
    public boolean f37111s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f37109n = -1;

    public r71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f37105a = i10;
        this.f37106b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f37107c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f37111s) {
                this.f37111s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f37111s) {
            return;
        }
        this.f37111s = false;
        int i10 = this.f37105a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f37109n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f37109n, true);
            this.f37109n = -1;
        }
        this.f37108f = false;
    }

    public final void b() {
        int size;
        if (!this.f37108f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f37107c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18120q)) {
                this.f37108f = true;
                TLRPC.Chat chat = this.f37106b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f37107c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f37110r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f37105a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f18122id;
            TLRPC.Chat chat = this.f37106b;
            if (j3 == chat.f18121id && !ChatObject.isChannel(chat) && this.f37108f) {
                this.f37108f = false;
                b();
            }
        }
    }
}
