package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class t4 implements DialogInterface.OnDismissListener {
    public final int f48054a;
    public final Utilities.Callback2 f48055b;
    public final boolean[] f48056c;

    public t4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f48054a = i10;
        this.f48055b = callback2;
        this.f48056c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48054a) {
            case 0:
                Utilities.Callback2 callback2 = this.f48055b;
                if (callback2 != null && !this.f48056c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f48055b;
                if (callback22 != null && !this.f48056c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f48055b;
                if (callback23 != null && !this.f48056c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
