package zh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.xc;
public final class x implements Runnable {
    public final int f52131a = 1;
    public final String f52132b;
    public final Utilities.Callback f52133c;
    public final n2 d;

    public x(String str, Utilities.Callback callback, n2 n2Var) {
        this.f52132b = str;
        this.f52133c = callback;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f52131a) {
            case 0:
                String str = this.f52132b;
                Utilities.Callback callback = this.f52133c;
                n2 n2Var = this.d;
                b0.p(n2Var, 0, new x(str, callback, n2Var));
                return;
            default:
                String str2 = this.f52132b;
                if (str2 != null) {
                    this.f52133c.run(str2);
                    return;
                } else {
                    xc.a0(this.d).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                    return;
                }
        }
    }

    public x(n2 n2Var, String str, Utilities.Callback callback) {
        this.d = n2Var;
        this.f52132b = str;
        this.f52133c = callback;
    }
}
