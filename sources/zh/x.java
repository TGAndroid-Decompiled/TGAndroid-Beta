package zh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.xc;
public final class x implements Runnable {
    public final int f52138a = 1;
    public final String f52139b;
    public final Utilities.Callback f52140c;
    public final n2 d;

    public x(String str, Utilities.Callback callback, n2 n2Var) {
        this.f52139b = str;
        this.f52140c = callback;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f52138a) {
            case 0:
                String str = this.f52139b;
                Utilities.Callback callback = this.f52140c;
                n2 n2Var = this.d;
                b0.p(n2Var, 0, new x(str, callback, n2Var));
                return;
            default:
                String str2 = this.f52139b;
                if (str2 != null) {
                    this.f52140c.run(str2);
                    return;
                } else {
                    xc.a0(this.d).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                    return;
                }
        }
    }

    public x(n2 n2Var, String str, Utilities.Callback callback) {
        this.d = n2Var;
        this.f52139b = str;
        this.f52140c = callback;
    }
}
