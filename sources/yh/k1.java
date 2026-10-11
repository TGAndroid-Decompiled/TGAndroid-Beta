package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ab1;
public final class k1 implements Runnable {
    public final int f52851a = 0;
    public final org.telegram.ui.ActionBar.m2 f52852b;
    public final long f52853c;

    public k1(long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f52853c = j3;
        this.f52852b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f52851a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f52853c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f52852b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = this.f52852b;
                m2Var.presentFragment(ab1.d0(m2Var.getMessagesController().getChat(Long.valueOf(-this.f52853c)), true));
                return;
        }
    }

    public k1(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        this.f52852b = m2Var;
        this.f52853c = j3;
    }
}
