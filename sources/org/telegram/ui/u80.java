package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class u80 implements xx {
    public final int f42346a = 0;
    public final LaunchActivity f42347b;
    public final TLRPC.User f42348c;
    public final String d;
    public final int e;

    public u80(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.f42347b = launchActivity;
        this.d = str;
        this.e = i10;
        this.f42348c = user;
    }

    @Override
    public final boolean D() {
        switch (this.f42346a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean J(ey eyVar) {
        switch (this.f42346a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, xe1 xe1Var) {
        int i12 = this.f42346a;
        int i13 = this.e;
        String str = this.d;
        TLRPC.User user = this.f42348c;
        LaunchActivity launchActivity = this.f42347b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f20406id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = MessagesController.getInstance(i13).getInputUser(user);
                SendMessagesHelper.getInstance(i13).sendGame(MessagesController.getInstance(i13).getInputPeer(j10), tL_inputMediaGame, 0L, 0L);
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    h.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    h.putLong("user_id", j10);
                } else {
                    h.putLong("chat_id", -j10);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(h, eyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).T(new sn(h), true, false);
                }
                return true;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle h10 = a1.g.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    h10.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    h10.putLong("user_id", j11);
                } else {
                    h10.putLong("chat_id", -j11);
                }
                h10.putString("attach_bot", UserObject.getPublicUsername(user));
                if (str != null) {
                    h10.putString("attach_bot_start_command", str);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(h10, eyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).T(new sn(h10), true, false);
                }
                return true;
        }
    }

    public u80(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.f42347b = launchActivity;
        this.f42348c = user;
        this.d = str;
        this.e = i10;
    }
}
