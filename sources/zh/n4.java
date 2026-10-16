package zh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f50862a;
    public final Utilities.Callback2 f50863b;
    public final boolean[] f50864c;

    public n4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f50862a = i10;
        this.f50863b = callback2;
        this.f50864c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50862a) {
            case 0:
                Utilities.Callback2 callback2 = this.f50863b;
                if (callback2 != null && !this.f50864c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f50863b;
                if (callback22 != null && !this.f50864c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f50863b;
                if (callback23 != null && !this.f50864c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
