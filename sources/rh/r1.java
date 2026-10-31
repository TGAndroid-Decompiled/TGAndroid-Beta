package rh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.u61;
public final class r1 implements Runnable {
    public final int f47395a = 0;
    public final org.telegram.ui.ActionBar.k2 f47396b;
    public final long f47397c;

    public r1(long j10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f47397c = j10;
        this.f47396b = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f47395a) {
            case 0:
                Bundle bundle = new Bundle();
                long j10 = this.f47397c;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f47396b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.k2 k2Var = this.f47396b;
                k2Var.presentFragment(u61.f0(k2Var.getMessagesController().L0(Long.valueOf(-this.f47397c)), true));
                return;
        }
    }

    public r1(org.telegram.ui.ActionBar.k2 k2Var, long j10) {
        this.f47396b = k2Var;
        this.f47397c = j10;
    }
}
