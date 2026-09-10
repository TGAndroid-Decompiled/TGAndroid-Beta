package xh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class t4 implements DialogInterface.OnDismissListener {
    public final int f46059a;
    public final Utilities.Callback2 f46060b;
    public final boolean[] f46061c;

    public t4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f46059a = i10;
        this.f46060b = callback2;
        this.f46061c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46059a) {
            case 0:
                Utilities.Callback2 callback2 = this.f46060b;
                if (callback2 != null && !this.f46061c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f46060b;
                if (callback22 != null && !this.f46061c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f46060b;
                if (callback23 != null && !this.f46061c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
