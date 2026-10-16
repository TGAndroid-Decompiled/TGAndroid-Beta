package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class qo implements org.telegram.ui.ActionBar.z1, MessagesStorage.LongCallback, gd0, MessagesStorage.BooleanCallback {
    public final int f39196a;
    public final zo f39197b;

    public qo(zo zoVar, int i10) {
        this.f39196a = i10;
        this.f39197b = zoVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        zo zoVar = this.f39197b;
        TLRPC.ChatFull chatFull = zoVar.f42396y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        zoVar.p0(false, true);
        zoVar.getMessagesController().loadFullChat(zoVar.f42392w0, 0, true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39196a) {
            case 0:
                this.f39197b.j0();
                return;
            case 1:
                this.f39197b.finishFragment();
                return;
            case 2:
                this.f39197b.j0();
                return;
            default:
                this.f39197b.finishFragment();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        zo zoVar = this.f39197b;
        zoVar.getClass();
        if (AndroidUtilities.isTablet()) {
            zoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-zoVar.f42392w0));
        } else {
            zoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        zoVar.finishFragment();
        zoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-zoVar.f42394x0.f18916id), null, zoVar.f42394x0, Boolean.valueOf(z10));
    }

    @Override
    public void run(long j10) {
        switch (this.f39196a) {
            case 4:
                this.f39197b.t0(Long.valueOf(j10));
                return;
            default:
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                zo zoVar = this.f39197b;
                if (i10 == 0) {
                    zoVar.N0 = false;
                    return;
                }
                zoVar.f42392w0 = j10;
                zoVar.f42394x0 = zoVar.getMessagesController().getChat(Long.valueOf(j10));
                zoVar.N0 = false;
                TLRPC.ChatFull chatFull = zoVar.f42396y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                zoVar.j0();
                return;
        }
    }
}
