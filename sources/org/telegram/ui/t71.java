package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f41939a;
    public final TLRPC.Chat f41940b;
    public TLRPC.ChannelParticipantsFilter f41941c;
    public boolean f41943f;
    public boolean h;
    public boolean f41945r;
    public boolean f41946s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f41942e = new ArrayList();
    public int f41944n = -1;

    public t71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f41939a = i10;
        this.f41940b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f41941c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f41946s) {
                this.f41946s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f41946s) {
            return;
        }
        this.f41946s = false;
        int i10 = this.f41939a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f41944n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f41944n, true);
            this.f41944n = -1;
        }
        this.f41943f = false;
    }

    public final void b() {
        int size;
        if (!this.f41943f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f41941c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20041q)) {
                this.f41943f = true;
                TLRPC.Chat chat = this.f41940b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f41941c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f41945r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f41939a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f20043id;
            TLRPC.Chat chat = this.f41940b;
            if (j3 == chat.f20042id && !ChatObject.isChannel(chat) && this.f41943f) {
                this.f41943f = false;
                b();
            }
        }
    }
}
