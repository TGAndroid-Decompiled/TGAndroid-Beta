package org.telegram.ui;

import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
public final class sb0 implements Executor {
    public final int f41124a;

    public sb0(int i10) {
        this.f41124a = i10;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f41124a) {
            case 0:
                AndroidUtilities.runOnUIThread(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
