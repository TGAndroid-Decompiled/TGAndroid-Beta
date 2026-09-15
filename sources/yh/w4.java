package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class w4 implements DialogInterface.OnDismissListener {
    public final int f47937a;
    public final Utilities.Callback2 f47938b;
    public final boolean[] f47939c;

    public w4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f47937a = i10;
        this.f47938b = callback2;
        this.f47939c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47937a) {
            case 0:
                Utilities.Callback2 callback2 = this.f47938b;
                if (callback2 != null && !this.f47939c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f47938b;
                if (callback22 != null && !this.f47939c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f47938b;
                if (callback23 != null && !this.f47939c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
