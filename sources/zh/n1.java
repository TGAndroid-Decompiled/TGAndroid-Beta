package zh;

import org.telegram.messenger.AndroidUtilities;
public final class n1 implements Runnable {
    public final int f48699a;
    public final Runnable f48700b;
    public final long f48701c;

    public n1(int i10, long j3, Runnable runnable) {
        this.f48699a = i10;
        this.f48700b = runnable;
        this.f48701c = j3;
    }

    @Override
    public final void run() {
        switch (this.f48699a) {
            case 0:
                Runnable runnable = this.f48700b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f48701c)));
                return;
            case 1:
                Runnable runnable2 = this.f48700b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f48701c)));
                return;
            default:
                Runnable runnable3 = this.f48700b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f48701c)));
                return;
        }
    }
}
