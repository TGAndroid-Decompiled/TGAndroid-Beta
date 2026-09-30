package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sa1;
public final class l1 implements Runnable {
    public final int f47744a = 0;
    public final org.telegram.ui.ActionBar.m2 f47745b;
    public final long f47746c;

    public l1(long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f47746c = j3;
        this.f47745b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f47744a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f47746c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f47745b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = this.f47745b;
                m2Var.presentFragment(sa1.d0(m2Var.getMessagesController().getChat(Long.valueOf(-this.f47746c)), true));
                return;
        }
    }

    public l1(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        this.f47745b = m2Var;
        this.f47746c = j3;
    }
}
