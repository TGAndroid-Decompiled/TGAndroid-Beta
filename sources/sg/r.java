package sg;

import org.telegram.messenger.AndroidUtilities;
public final class r implements Runnable {
    public final int f41997a;
    public final v f41998b;

    public r(v vVar, int i10) {
        this.f41997a = i10;
        this.f41998b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f41997a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r(this.f41998b, 1));
                return;
            default:
                this.f41998b.run(null);
                return;
        }
    }
}
