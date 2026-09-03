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
public final class w90 implements ky {
    public final int f39319a = 1;
    public final LaunchActivity f39320b;
    public final String f39321c;
    public final int d;
    public final TLRPC.User e;

    public w90(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.f39320b = launchActivity;
        this.f39321c = str;
        this.d = i10;
        this.e = user;
    }

    @Override
    public final boolean C() {
        switch (this.f39319a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean I(qy qyVar) {
        switch (this.f39319a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean w(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        int i12 = this.f39319a;
        TLRPC.User user = this.e;
        int i13 = this.d;
        String str = this.f39321c;
        LaunchActivity launchActivity = this.f39320b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.f31586y1;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i14 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i14.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i14.putLong("user_id", j10);
                } else {
                    i14.putLong("chat_id", -j10);
                }
                i14.putString("attach_bot", UserObject.getPublicUsername(user));
                if (str != null) {
                    i14.putString("attach_bot_start_command", str);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(i14, qyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new zn(i14), true, false);
                }
                return true;
            default:
                Pattern pattern2 = LaunchActivity.f31586y1;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f19221id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = MessagesController.getInstance(i13).getInputUser(user);
                SendMessagesHelper.getInstance(i13).sendGame(MessagesController.getInstance(i13).getInputPeer(j11), tL_inputMediaGame, 0L, 0L);
                Bundle i15 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i15.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    i15.putLong("user_id", j11);
                } else {
                    i15.putLong("chat_id", -j11);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(i15, qyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new zn(i15), true, false);
                }
                return true;
        }
    }

    public w90(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.f39320b = launchActivity;
        this.e = user;
        this.f39321c = str;
        this.d = i10;
    }
}
