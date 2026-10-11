package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f41625a;
    public final TLRPC.Chat f41626b;
    public TLRPC.ChannelParticipantsFilter f41627c;
    public boolean f41629f;
    public boolean h;
    public boolean f41631r;
    public boolean f41632s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f41628e = new ArrayList();
    public int f41630n = -1;

    public s71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f41625a = i10;
        this.f41626b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f41627c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f41632s) {
                this.f41632s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f41632s) {
            return;
        }
        this.f41632s = false;
        int i10 = this.f41625a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f41630n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f41630n, true);
            this.f41630n = -1;
        }
        this.f41629f = false;
    }

    public final void b() {
        int size;
        if (!this.f41629f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f41627c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20031q)) {
                this.f41629f = true;
                TLRPC.Chat chat = this.f41626b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f41627c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f41631r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f41625a).sendRequestTyped(tL_channels_getParticipants, new Object(), new a5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f20033id;
            TLRPC.Chat chat = this.f41626b;
            if (j3 == chat.f20032id && !ChatObject.isChannel(chat) && this.f41629f) {
                this.f41629f = false;
                b();
            }
        }
    }
}
