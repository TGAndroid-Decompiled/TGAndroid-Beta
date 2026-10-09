package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f41893a;
    public final TLRPC.Chat f41894b;
    public TLRPC.ChannelParticipantsFilter f41895c;
    public boolean f41897f;
    public boolean h;
    public boolean f41899r;
    public boolean f41900s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f41896e = new ArrayList();
    public int f41898n = -1;

    public t71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f41893a = i10;
        this.f41894b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f41895c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f41900s) {
                this.f41900s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f41900s) {
            return;
        }
        this.f41900s = false;
        int i10 = this.f41893a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f41898n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f41898n, true);
            this.f41898n = -1;
        }
        this.f41897f = false;
    }

    public final void b() {
        int size;
        if (!this.f41897f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f41895c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20037q)) {
                this.f41897f = true;
                TLRPC.Chat chat = this.f41894b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f41895c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f41899r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f41893a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f20039id;
            TLRPC.Chat chat = this.f41894b;
            if (j3 == chat.f20038id && !ChatObject.isChannel(chat) && this.f41897f) {
                this.f41897f = false;
                b();
            }
        }
    }
}
