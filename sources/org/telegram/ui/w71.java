package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f43077a;
    public final TLRPC.Chat f43078b;
    public TLRPC.ChannelParticipantsFilter f43079c;
    public boolean f43081f;
    public boolean h;
    public boolean f43083r;
    public boolean f43084s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f43080e = new ArrayList();
    public int f43082n = -1;

    public w71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f43077a = i10;
        this.f43078b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f43079c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f43084s) {
                this.f43084s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f43084s) {
            return;
        }
        this.f43084s = false;
        int i10 = this.f43077a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f43082n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f43082n, true);
            this.f43082n = -1;
        }
        this.f43081f = false;
    }

    public final void b() {
        int size;
        if (!this.f43081f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f43079c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f19801q)) {
                this.f43081f = true;
                TLRPC.Chat chat = this.f43078b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f43079c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f43083r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f43077a).sendRequestTyped(tL_channels_getParticipants, new Object(), new e5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f19803id;
            TLRPC.Chat chat = this.f43078b;
            if (j3 == chat.f19802id && !ChatObject.isChannel(chat) && this.f43081f) {
                this.f43081f = false;
                b();
            }
        }
    }
}
