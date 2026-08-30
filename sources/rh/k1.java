package rh;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kf1;
import org.telegram.ui.oy;
public final class k1 implements Utilities.Callback {
    public final kf1 f43576a;
    public final oy f43577b;
    public final long f43578c;
    public final int d;

    public k1(kf1 kf1Var, oy oyVar, long j10, int i10) {
        this.f43576a = kf1Var;
        this.f43577b = oyVar;
        this.f43578c = j10;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        String str;
        TLRPC.User user;
        int i10;
        Boolean bool = (Boolean) obj;
        kf1 kf1Var = this.f43576a;
        oy oyVar = this.f43577b;
        if (kf1Var != null) {
            kf1Var.finishFragment();
            oyVar.removeSelfFromStack();
        } else {
            oyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        long j10 = this.f43578c;
        int i11 = this.d;
        if (j10 >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user2);
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
            if (chat == null) {
                str = "";
                user = chat;
            } else {
                str = chat.title;
                user = chat;
            }
        }
        qc a02 = qc.a0(U);
        if (bool.booleanValue()) {
            i10 = R.string.BotSentRevokeVerifyRequest;
        } else {
            i10 = R.string.BotSentVerifyRequest;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, str));
        a02.getClass();
        a02.V(Arrays.asList(user), replaceTags, null, null).k(false);
    }
}
