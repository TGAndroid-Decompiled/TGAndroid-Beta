package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f43079a;
    public final TLRPC.Chat f43080b;
    public TLRPC.ChannelParticipantsFilter f43081c;
    public boolean f43083f;
    public boolean h;
    public boolean f43085r;
    public boolean f43086s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f43082e = new ArrayList();
    public int f43084n = -1;

    public w71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f43079a = i10;
        this.f43080b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f43081c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f43086s) {
                this.f43086s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f43086s) {
            return;
        }
        this.f43086s = false;
        int i10 = this.f43079a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f43084n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f43084n, true);
            this.f43084n = -1;
        }
        this.f43083f = false;
    }

    public final void b() {
        int size;
        if (!this.f43083f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f43081c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f19802q)) {
                this.f43083f = true;
                TLRPC.Chat chat = this.f43080b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f43081c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f43085r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f43079a).sendRequestTyped(tL_channels_getParticipants, new Object(), new e5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f19804id;
            TLRPC.Chat chat = this.f43080b;
            if (j3 == chat.f19803id && !ChatObject.isChannel(chat) && this.f43083f) {
                this.f43083f = false;
                b();
            }
        }
    }
}
