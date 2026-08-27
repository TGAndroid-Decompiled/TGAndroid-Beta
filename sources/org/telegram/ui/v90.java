package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class v90 implements Runnable {

    public final int f43390a;

    public final long f43391b;

    public final Object f43392c;
    public final Object d;

    public v90(Object obj, long j10, Object obj2, int i10) {
        this.f43390a = i10;
        this.f43392c = obj;
        this.f43391b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        int i10 = this.f43390a;
        Object obj = this.d;
        long j10 = this.f43391b;
        Object obj2 = this.f43392c;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new lq(launchActivity, MessagesStorage.getInstance(launchActivity.K).getUser(j10), (o90) obj, 13));
                break;
            case 1:
                tc0 tc0Var = (tc0) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tc0Var.E != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i11 = 0;
                    while (i11 < messages_messages.messages.size()) {
                        if (!(messages_messages.messages.get(i11).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                            messages_messages.messages.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    tc0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    tc0Var.getMessagesController().putUsers(messages_messages.users, false);
                    tc0Var.getMessagesController().putChats(messages_messages.chats, false);
                    tc0Var.getLocationController().locationsCache.k(messages_messages.messages, j10);
                    tc0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10));
                    tc0Var.i0(messages_messages.messages);
                    tc0Var.getLocationController().markLiveLoactionsAsRead(tc0Var.f42856a0);
                    if (tc0Var.F0 == null) {
                        cc0 cc0Var = new cc0(tc0Var, 4);
                        tc0Var.F0 = cc0Var;
                        AndroidUtilities.runOnUIThread(cc0Var, 5000L);
                    }
                    break;
                }
                break;
            default:
                jv0 jv0Var = (jv0) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                jv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                n2Var.presentFragment(new ProfileActivity(bundle, null));
                jv0Var.c(false);
                break;
        }
    }

    public v90(tc0 tc0Var, TLObject tLObject, long j10) {
        this.f43390a = 1;
        this.f43392c = tc0Var;
        this.d = tLObject;
        this.f43391b = j10;
    }
}
