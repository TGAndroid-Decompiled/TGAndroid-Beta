package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class t4 implements DialogInterface.OnDismissListener {
    public final int f48055a;
    public final Utilities.Callback2 f48056b;
    public final boolean[] f48057c;

    public t4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f48055a = i10;
        this.f48056b = callback2;
        this.f48057c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48055a) {
            case 0:
                Utilities.Callback2 callback2 = this.f48056b;
                if (callback2 != null && !this.f48057c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f48056b;
                if (callback22 != null && !this.f48057c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f48056b;
                if (callback23 != null && !this.f48057c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
