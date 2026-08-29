package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ze implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, ao0 {
    public final int f45149a;
    public final Runnable f45150b;

    public ze(int i10, Runnable runnable) {
        this.f45149a = i10;
        this.f45150b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f45149a;
        Runnable runnable = this.f45150b;
        switch (i11) {
            case 9:
                Pattern pattern = LaunchActivity.f35560x1;
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
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f45149a) {
            case 0:
                this.f45150b.run();
                return;
            case 1:
                this.f45150b.run();
                return;
            default:
                Runnable runnable = this.f45150b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f45149a) {
            case 3:
                this.f45150b.run();
                return true;
            case 4:
                this.f45150b.run();
                return true;
            case 5:
                this.f45150b.run();
                return true;
            case 6:
                this.f45150b.run();
                return true;
            case 7:
                this.f45150b.run();
                return true;
            default:
                this.f45150b.run();
                return true;
        }
    }
}
