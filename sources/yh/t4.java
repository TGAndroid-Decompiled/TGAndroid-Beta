package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class t4 implements DialogInterface.OnDismissListener {
    public final int f48056a;
    public final Utilities.Callback2 f48057b;
    public final boolean[] f48058c;

    public t4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f48056a = i10;
        this.f48057b = callback2;
        this.f48058c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48056a) {
            case 0:
                Utilities.Callback2 callback2 = this.f48057b;
                if (callback2 != null && !this.f48058c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f48057b;
                if (callback22 != null && !this.f48058c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f48057b;
                if (callback23 != null && !this.f48058c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
