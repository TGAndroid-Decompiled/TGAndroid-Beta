package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f41659a;
    public final TLRPC.Chat f41660b;
    public TLRPC.ChannelParticipantsFilter f41661c;
    public boolean f41663f;
    public boolean h;
    public boolean f41665r;
    public boolean f41666s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f41662e = new ArrayList();
    public int f41664n = -1;

    public s71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f41659a = i10;
        this.f41660b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f41661c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f41666s) {
                this.f41666s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f41666s) {
            return;
        }
        this.f41666s = false;
        int i10 = this.f41659a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f41664n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f41664n, true);
            this.f41664n = -1;
        }
        this.f41663f = false;
    }

    public final void b() {
        int size;
        if (!this.f41663f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f41661c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20067q)) {
                this.f41663f = true;
                TLRPC.Chat chat = this.f41660b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f41661c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f41665r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f41659a).sendRequestTyped(tL_channels_getParticipants, new Object(), new a5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f20069id;
            TLRPC.Chat chat = this.f41660b;
            if (j3 == chat.f20068id && !ChatObject.isChannel(chat) && this.f41663f) {
                this.f41663f = false;
                b();
            }
        }
    }
}
