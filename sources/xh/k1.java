package xh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fb1;
public final class k1 implements Runnable {
    public final int f45612a = 0;
    public final org.telegram.ui.ActionBar.p2 f45613b;
    public final long f45614c;

    public k1(long j3, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f45614c = j3;
        this.f45613b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f45612a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f45614c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f45613b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = this.f45613b;
                p2Var.presentFragment(fb1.d0(p2Var.getMessagesController().getChat(Long.valueOf(-this.f45614c)), true));
                return;
        }
    }

    public k1(org.telegram.ui.ActionBar.p2 p2Var, long j3) {
        this.f45613b = p2Var;
        this.f45614c = j3;
    }
}
