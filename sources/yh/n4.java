package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class n4 implements DialogInterface.OnDismissListener {
    public final int f53131a;
    public final Utilities.Callback2 f53132b;
    public final boolean[] f53133c;

    public n4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.f53131a = i10;
        this.f53132b = callback2;
        this.f53133c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53131a) {
            case 0:
                Utilities.Callback2 callback2 = this.f53132b;
                if (callback2 != null && !this.f53133c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback22 = this.f53132b;
                if (callback22 != null && !this.f53133c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback23 = this.f53132b;
                if (callback23 != null && !this.f53133c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
