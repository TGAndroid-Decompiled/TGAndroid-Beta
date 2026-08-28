package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r90 implements Runnable {
    public final int f42331a;
    public final long f42332b;
    public final Object f42333c;
    public final Object d;

    public r90(Object obj, long j10, Object obj2, int i9) {
        this.f42331a = i9;
        this.f42333c = obj;
        this.f42332b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        int i9 = this.f42331a;
        Object obj = this.d;
        long j10 = this.f42332b;
        Object obj2 = this.f42333c;
        switch (i9) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new jq(launchActivity, MessagesStorage.getInstance(launchActivity.K).getUser(j10), (k90) obj, 13));
                return;
            case 1:
                pc0 pc0Var = (pc0) obj2;
                TLObject tLObject = (TLObject) obj;
                if (pc0Var.E != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i10 = 0;
                    while (i10 < messages_messages.messages.size()) {
                        if (!(messages_messages.messages.get(i10).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                            messages_messages.messages.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    pc0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    pc0Var.getMessagesController().putUsers(messages_messages.users, false);
                    pc0Var.getMessagesController().putChats(messages_messages.chats, false);
                    pc0Var.getLocationController().locationsCache.k(messages_messages.messages, j10);
                    pc0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10));
                    pc0Var.h0(messages_messages.messages);
                    pc0Var.getLocationController().markLiveLoactionsAsRead(pc0Var.f41442a0);
                    if (pc0Var.F0 == null) {
                        xb0 xb0Var = new xb0(pc0Var, 4);
                        pc0Var.F0 = xb0Var;
                        AndroidUtilities.runOnUIThread(xb0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                iv0 iv0Var = (iv0) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                iv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                o2Var.presentFragment(new ProfileActivity(bundle, null));
                iv0Var.c(false);
                return;
        }
    }

    public r90(pc0 pc0Var, TLObject tLObject, long j10) {
        this.f42331a = 1;
        this.f42333c = pc0Var;
        this.d = tLObject;
        this.f42332b = j10;
    }
}
