package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f37345a;
    public final TLRPC.Chat f37346b;
    public TLRPC.ChannelParticipantsFilter f37347c;
    public boolean f37348f;
    public boolean h;
    public boolean f37350r;
    public boolean f37351s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f37349n = -1;

    public s71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f37345a = i10;
        this.f37346b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f37347c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f37351s) {
                this.f37351s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f37351s) {
            return;
        }
        this.f37351s = false;
        int i10 = this.f37345a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f37349n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f37349n, true);
            this.f37349n = -1;
        }
        this.f37348f = false;
    }

    public final void b() {
        int size;
        if (!this.f37348f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f37347c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18342q)) {
                this.f37348f = true;
                TLRPC.Chat chat = this.f37346b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f37347c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f37350r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f37345a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f18344id;
            TLRPC.Chat chat = this.f37346b;
            if (j3 == chat.f18343id && !ChatObject.isChannel(chat) && this.f37348f) {
                this.f37348f = false;
                b();
            }
        }
    }
}
