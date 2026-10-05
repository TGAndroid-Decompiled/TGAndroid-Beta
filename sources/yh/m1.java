package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ta1;
public final class m1 implements Runnable {
    public final int f51625a = 0;
    public final org.telegram.ui.ActionBar.n2 f51626b;
    public final long f51627c;

    public m1(long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f51627c = j3;
        this.f51626b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f51625a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f51627c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f51626b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.f51626b;
                n2Var.presentFragment(ta1.b0(n2Var.getMessagesController().getChat(Long.valueOf(-this.f51627c)), true));
                return;
        }
    }

    public m1(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        this.f51626b = n2Var;
        this.f51627c = j3;
    }
}
