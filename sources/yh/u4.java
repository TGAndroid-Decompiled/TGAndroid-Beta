package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class u4 implements DialogInterface.OnDismissListener {
    public final int f52082a;
    public final Utilities.Callback2 f52083b;
    public final boolean[] f52084c;

    public u4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f52082a = i10;
        this.f52083b = callback2;
        this.f52084c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52082a) {
            case 0:
                Utilities.Callback2 callback2 = this.f52083b;
                if (callback2 != null && !this.f52084c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f52083b;
                if (callback22 != null && !this.f52084c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f52083b;
                if (callback23 != null && !this.f52084c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
