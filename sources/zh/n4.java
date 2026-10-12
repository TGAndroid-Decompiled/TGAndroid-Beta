package zh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f50861a;
    public final Utilities.Callback2 f50862b;
    public final boolean[] f50863c;

    public n4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f50861a = i10;
        this.f50862b = callback2;
        this.f50863c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50861a) {
            case 0:
                Utilities.Callback2 callback2 = this.f50862b;
                if (callback2 != null && !this.f50863c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f50862b;
                if (callback22 != null && !this.f50863c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f50862b;
                if (callback23 != null && !this.f50863c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
