package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class sf implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, wo0 {
    public final int f41914a;
    public final Runnable f41915b;

    public sf(int i10, Runnable runnable) {
        this.f41914a = i10;
        this.f41915b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f41914a;
        Runnable runnable = this.f41915b;
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
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41914a) {
            case 0:
                this.f41915b.run();
                return;
            case 1:
                this.f41915b.run();
                return;
            default:
                Runnable runnable = this.f41915b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f41914a) {
            case 3:
                this.f41915b.run();
                return true;
            case 4:
                this.f41915b.run();
                return true;
            case 5:
                this.f41915b.run();
                return true;
            case 6:
                this.f41915b.run();
                return true;
            case 7:
                this.f41915b.run();
                return true;
            default:
                this.f41915b.run();
                return true;
        }
    }
}
