package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sa1;
public final class l1 implements Runnable {
    public final int f47636a = 0;
    public final org.telegram.ui.ActionBar.m2 f47637b;
    public final long f47638c;

    public l1(long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f47638c = j3;
        this.f47637b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f47636a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f47638c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f47637b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = this.f47637b;
                m2Var.presentFragment(sa1.d0(m2Var.getMessagesController().getChat(Long.valueOf(-this.f47638c)), true));
                return;
        }
    }

    public l1(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        this.f47637b = m2Var;
        this.f47638c = j3;
    }
}
