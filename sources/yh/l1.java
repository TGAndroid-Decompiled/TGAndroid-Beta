package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ab1;
public final class l1 implements Runnable {
    public final int f47419a = 0;
    public final org.telegram.ui.ActionBar.o2 f47420b;
    public final long f47421c;

    public l1(long j3, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f47421c = j3;
        this.f47420b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f47419a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f47421c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f47420b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = this.f47420b;
                o2Var.presentFragment(ab1.d0(o2Var.getMessagesController().getChat(Long.valueOf(-this.f47421c)), true));
                return;
        }
    }

    public l1(org.telegram.ui.ActionBar.o2 o2Var, long j3) {
        this.f47420b = o2Var;
        this.f47421c = j3;
    }
}
