package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class v4 implements DialogInterface.OnDismissListener {
    public final int f47843a;
    public final Utilities.Callback2 f47844b;
    public final boolean[] f47845c;

    public v4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f47843a = i10;
        this.f47844b = callback2;
        this.f47845c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47843a) {
            case 0:
                Utilities.Callback2 callback2 = this.f47844b;
                if (callback2 != null && !this.f47845c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f47844b;
                if (callback22 != null && !this.f47845c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f47844b;
                if (callback23 != null && !this.f47845c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
