package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f53028a;
    public final Utilities.Callback2 f53029b;
    public final boolean[] f53030c;

    public n4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f53028a = i10;
        this.f53029b = callback2;
        this.f53030c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53028a) {
            case 0:
                Utilities.Callback2 callback2 = this.f53029b;
                if (callback2 != null && !this.f53030c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f53029b;
                if (callback22 != null && !this.f53030c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f53029b;
                if (callback23 != null && !this.f53030c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
