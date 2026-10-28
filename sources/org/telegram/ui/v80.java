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
public final class v80 implements xx {
    public final int f44208a = 0;
    public final LaunchActivity f44209b;
    public final TLRPC.User f44210c;
    public final String d;
    public final int e;

    public v80(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.f44209b = launchActivity;
        this.d = str;
        this.e = i10;
        this.f44210c = user;
    }

    @Override
    public final boolean C() {
        switch (this.f44208a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean K(ey eyVar) {
        switch (this.f44208a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        int i12 = this.f44208a;
        int i13 = this.e;
        String str = this.d;
        TLRPC.User user = this.f44210c;
        LaunchActivity launchActivity = this.f44209b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f22090id = tL_inputGameShortName;
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
                if (MessagesController.getInstance(i13).checkCanOpenChat(i14, eyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).U(new wn(i14), true, false);
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
                if (MessagesController.getInstance(i13).checkCanOpenChat(i15, eyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).U(new wn(i15), true, false);
                }
                return true;
        }
    }

    public v80(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.f44209b = launchActivity;
        this.f44210c = user;
        this.d = str;
        this.e = i10;
    }
}
