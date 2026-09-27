package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class t4 implements DialogInterface.OnDismissListener {
    public final int f48103a;
    public final Utilities.Callback2 f48104b;
    public final boolean[] f48105c;

    public t4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f48103a = i10;
        this.f48104b = callback2;
        this.f48105c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48103a) {
            case 0:
                Utilities.Callback2 callback2 = this.f48104b;
                if (callback2 != null && !this.f48105c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f48104b;
                if (callback22 != null && !this.f48105c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f48104b;
                if (callback23 != null && !this.f48105c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
