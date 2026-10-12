package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.db1;
public final class k1 implements Runnable {
    public final int f52988a = 0;
    public final org.telegram.ui.ActionBar.m2 f52989b;
    public final long f52990c;

    public k1(long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f52990c = j3;
        this.f52989b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f52988a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f52990c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f52989b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = this.f52989b;
                m2Var.presentFragment(db1.d0(m2Var.getMessagesController().getChat(Long.valueOf(-this.f52990c)), true));
                return;
        }
    }

    public k1(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        this.f52989b = m2Var;
        this.f52990c = j3;
    }
}
