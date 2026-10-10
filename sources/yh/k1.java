package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
public final class k1 implements Runnable {
    public final int f52807a = 0;
    public final org.telegram.ui.ActionBar.n2 f52808b;
    public final long f52809c;

    public k1(long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f52809c = j3;
        this.f52808b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f52807a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f52809c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f52808b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.f52808b;
                n2Var.presentFragment(bb1.d0(n2Var.getMessagesController().getChat(Long.valueOf(-this.f52809c)), true));
                return;
        }
    }

    public k1(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        this.f52808b = n2Var;
        this.f52809c = j3;
    }
}
