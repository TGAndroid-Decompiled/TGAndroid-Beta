package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.za1;
public final class l1 implements Runnable {
    public final int f47338a = 0;
    public final org.telegram.ui.ActionBar.n2 f47339b;
    public final long f47340c;

    public l1(long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f47340c = j3;
        this.f47339b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f47338a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f47340c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f47339b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.f47339b;
                n2Var.presentFragment(za1.d0(n2Var.getMessagesController().getChat(Long.valueOf(-this.f47340c)), true));
                return;
        }
    }

    public l1(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        this.f47339b = n2Var;
        this.f47340c = j3;
    }
}
