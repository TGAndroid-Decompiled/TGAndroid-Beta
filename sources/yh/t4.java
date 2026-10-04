package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class t4 implements DialogInterface.OnDismissListener {
    public final int f52013a;
    public final Utilities.Callback2 f52014b;
    public final boolean[] f52015c;

    public t4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f52013a = i10;
        this.f52014b = callback2;
        this.f52015c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52013a) {
            case 0:
                Utilities.Callback2 callback2 = this.f52014b;
                if (callback2 != null && !this.f52015c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f52014b;
                if (callback22 != null && !this.f52015c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f52014b;
                if (callback23 != null && !this.f52015c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
