package zh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.xc;
public final class x implements Runnable {
    public final int f52133a = 1;
    public final String f52134b;
    public final Utilities.Callback f52135c;
    public final n2 d;

    public x(String str, Utilities.Callback callback, n2 n2Var) {
        this.f52134b = str;
        this.f52135c = callback;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f52133a) {
            case 0:
                String str = this.f52134b;
                Utilities.Callback callback = this.f52135c;
                n2 n2Var = this.d;
                b0.p(n2Var, 0, new x(str, callback, n2Var));
                return;
            default:
                String str2 = this.f52134b;
                if (str2 != null) {
                    this.f52135c.run(str2);
                    return;
                } else {
                    xc.a0(this.d).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                    return;
                }
        }
    }

    public x(n2 n2Var, String str, Utilities.Callback callback) {
        this.d = n2Var;
        this.f52134b = str;
        this.f52135c = callback;
    }
}
