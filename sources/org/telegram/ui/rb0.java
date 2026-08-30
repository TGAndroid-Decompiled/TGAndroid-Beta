package org.telegram.ui;

import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
public final class rb0 implements Executor {
    public final int f37969a;

    public rb0(int i10) {
        this.f37969a = i10;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f37969a) {
            case 0:
                AndroidUtilities.runOnUIThread(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
