package tg;

import org.telegram.messenger.AndroidUtilities;
public final class r implements Runnable {
    public final int f48400a;
    public final v f48401b;

    public r(v vVar, int i10) {
        this.f48400a = i10;
        this.f48401b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f48400a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r(this.f48401b, 1));
                return;
            default:
                this.f48401b.run(null);
                return;
        }
    }
}
