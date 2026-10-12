package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.db1;
public final class k1 implements Runnable {
    public final int f53000a = 0;
    public final org.telegram.ui.ActionBar.m2 f53001b;
    public final long f53002c;

    public k1(long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f53002c = j3;
        this.f53001b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f53000a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f53002c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f53001b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = this.f53001b;
                m2Var.presentFragment(db1.d0(m2Var.getMessagesController().getChat(Long.valueOf(-this.f53002c)), true));
                return;
        }
    }

    public k1(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        this.f53001b = m2Var;
        this.f53002c = j3;
    }
}
