package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f52925a;
    public final Utilities.Callback2 f52926b;
    public final boolean[] f52927c;

    public n4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f52925a = i10;
        this.f52926b = callback2;
        this.f52927c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52925a) {
            case 0:
                Utilities.Callback2 callback2 = this.f52926b;
                if (callback2 != null && !this.f52927c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f52926b;
                if (callback22 != null && !this.f52927c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f52926b;
                if (callback23 != null && !this.f52927c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
