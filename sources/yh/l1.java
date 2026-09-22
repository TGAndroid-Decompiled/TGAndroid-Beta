package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
public final class l1 implements Runnable {
    public final int f47693a = 0;
    public final org.telegram.ui.ActionBar.n2 f47694b;
    public final long f47695c;

    public l1(long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f47695c = j3;
        this.f47694b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f47693a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f47695c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f47694b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.f47694b;
                n2Var.presentFragment(bb1.d0(n2Var.getMessagesController().getChat(Long.valueOf(-this.f47695c)), true));
                return;
        }
    }

    public l1(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        this.f47694b = n2Var;
        this.f47695c = j3;
    }
}
