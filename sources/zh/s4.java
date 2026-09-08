package zh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class s4 implements DialogInterface.OnDismissListener {
    public final int f52594a;
    public final Utilities.Callback2 f52595b;
    public final boolean[] f52596c;

    public s4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f52594a = i10;
        this.f52595b = callback2;
        this.f52596c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52594a) {
            case 0:
                Utilities.Callback2 callback2 = this.f52595b;
                if (callback2 != null && !this.f52596c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f52595b;
                if (callback22 != null && !this.f52596c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f52595b;
                if (callback23 != null && !this.f52596c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
