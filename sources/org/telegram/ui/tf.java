package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class tf implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, bp0 {
    public final int f40373a;
    public final Runnable f40374b;

    public tf(int i10, Runnable runnable) {
        this.f40373a = i10;
        this.f40374b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f40373a;
        Runnable runnable = this.f40374b;
        switch (i11) {
            case 9:
                Pattern pattern = LaunchActivity.B1;
                if (i10 == 1) {
                    runnable.run();
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40373a) {
            case 0:
                this.f40374b.run();
                return;
            case 1:
                this.f40374b.run();
                return;
            default:
                Runnable runnable = this.f40374b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f40373a) {
            case 3:
                this.f40374b.run();
                return true;
            case 4:
                this.f40374b.run();
                return true;
            case 5:
                this.f40374b.run();
                return true;
            case 6:
                this.f40374b.run();
                return true;
            case 7:
                this.f40374b.run();
                return true;
            default:
                this.f40374b.run();
                return true;
        }
    }
}
