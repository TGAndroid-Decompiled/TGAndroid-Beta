package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class w4 implements DialogInterface.OnDismissListener {
    public final int f47960a;
    public final Utilities.Callback2 f47961b;
    public final boolean[] f47962c;

    public w4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f47960a = i10;
        this.f47961b = callback2;
        this.f47962c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47960a) {
            case 0:
                Utilities.Callback2 callback2 = this.f47961b;
                if (callback2 != null && !this.f47962c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f47961b;
                if (callback22 != null && !this.f47962c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f47961b;
                if (callback23 != null && !this.f47962c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
