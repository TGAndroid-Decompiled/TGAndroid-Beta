package qf;

import org.telegram.messenger.AndroidUtilities;

public final class i implements Runnable {

    public final int f46320a;

    public final m f46321b;

    public i(m mVar, int i10) {
        this.f46320a = i10;
        this.f46321b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f46320a) {
            case 0:
                m.Y(this.f46321b);
                break;
            case 1:
                m.Z(this.f46321b);
                break;
            default:
                i iVar = this.f46321b.d;
                AndroidUtilities.cancelRunOnUIThread(iVar);
                AndroidUtilities.runOnUIThread(iVar, 5000L);
                break;
        }
    }
}
