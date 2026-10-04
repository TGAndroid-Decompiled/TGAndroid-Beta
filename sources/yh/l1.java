package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.va1;
public final class l1 implements Runnable {
    public final int f51553a = 0;
    public final org.telegram.ui.ActionBar.n2 f51554b;
    public final long f51555c;

    public l1(long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f51555c = j3;
        this.f51554b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f51553a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f51555c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f51554b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.f51554b;
                n2Var.presentFragment(va1.b0(n2Var.getMessagesController().getChat(Long.valueOf(-this.f51555c)), true));
                return;
        }
    }

    public l1(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        this.f51554b = n2Var;
        this.f51555c = j3;
    }
}
