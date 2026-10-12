package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f53143a;
    public final Utilities.Callback2 f53144b;
    public final boolean[] f53145c;

    public n4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f53143a = i10;
        this.f53144b = callback2;
        this.f53145c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53143a) {
            case 0:
                Utilities.Callback2 callback2 = this.f53144b;
                if (callback2 != null && !this.f53145c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f53144b;
                if (callback22 != null && !this.f53145c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f53144b;
                if (callback23 != null && !this.f53145c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
