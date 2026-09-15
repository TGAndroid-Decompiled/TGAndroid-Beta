package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ya1;
public final class l1 implements Runnable {
    public final int f47396a = 0;
    public final org.telegram.ui.ActionBar.n2 f47397b;
    public final long f47398c;

    public l1(long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f47398c = j3;
        this.f47397b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f47396a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f47398c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f47397b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.f47397b;
                n2Var.presentFragment(ya1.d0(n2Var.getMessagesController().getChat(Long.valueOf(-this.f47398c)), true));
                return;
        }
    }

    public l1(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        this.f47397b = n2Var;
        this.f47398c = j3;
    }
}
