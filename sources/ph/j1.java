package ph;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fy;
import org.telegram.ui.ze1;
public final class j1 implements Utilities.Callback {
    public final ze1 f45846a;
    public final fy f45847b;
    public final long f45848c;
    public final int d;

    public j1(ze1 ze1Var, fy fyVar, long j10, int i10) {
        this.f45846a = ze1Var;
        this.f45847b = fyVar;
        this.f45848c = j10;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        String str;
        TLRPC.User user;
        int i10;
        Boolean bool = (Boolean) obj;
        ze1 ze1Var = this.f45846a;
        fy fyVar = this.f45847b;
        if (ze1Var != null) {
            ze1Var.finishFragment();
            fyVar.removeSelfFromStack();
        } else {
            fyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        long j10 = this.f45848c;
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
        tc a02 = tc.a0(U);
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
