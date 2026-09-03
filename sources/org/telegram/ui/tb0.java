package org.telegram.ui;

import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
public final class tb0 implements Executor {
    public final int f38451a;

    public tb0(int i10) {
        this.f38451a = i10;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f38451a) {
            case 0:
                AndroidUtilities.runOnUIThread(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
