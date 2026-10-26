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
public final class t80 implements ux {
    public final int f43699a = 0;
    public final LaunchActivity f43700b;
    public final TLRPC.User f43701c;
    public final String d;
    public final int e;

    public t80(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.f43700b = launchActivity;
        this.d = str;
        this.e = i10;
        this.f43701c = user;
    }

    @Override
    public final boolean C() {
        switch (this.f43699a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean K(cy cyVar) {
        switch (this.f43699a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        int i12 = this.f43699a;
        int i13 = this.e;
        String str = this.d;
        TLRPC.User user = this.f43701c;
        LaunchActivity launchActivity = this.f43700b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f22089id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = MessagesController.getInstance(i13).getInputUser(user);
                SendMessagesHelper.getInstance(i13).sendGame(MessagesController.getInstance(i13).getInputPeer(j10), tL_inputMediaGame, 0L, 0L);
                Bundle i14 = a1.g.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i14.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i14.putLong("user_id", j10);
                } else {
                    i14.putLong("chat_id", -j10);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(i14, cyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).U(new un(i14), true, false);
                }
                return true;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i15 = a1.g.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i15.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    i15.putLong("user_id", j11);
                } else {
                    i15.putLong("chat_id", -j11);
                }
                i15.putString("attach_bot", UserObject.getPublicUsername(user));
                if (str != null) {
                    i15.putString("attach_bot_start_command", str);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(i15, cyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).U(new un(i15), true, false);
                }
                return true;
        }
    }

    public t80(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.f43700b = launchActivity;
        this.f43701c = user;
        this.d = str;
        this.e = i10;
    }
}
