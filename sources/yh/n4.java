package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f52994a;
    public final Utilities.Callback2 f52995b;
    public final boolean[] f52996c;

    public n4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f52994a = i10;
        this.f52995b = callback2;
        this.f52996c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52994a) {
            case 0:
                Utilities.Callback2 callback2 = this.f52995b;
                if (callback2 != null && !this.f52996c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f52995b;
                if (callback22 != null && !this.f52996c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f52995b;
                if (callback23 != null && !this.f52996c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
