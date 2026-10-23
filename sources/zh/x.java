package zh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.xc;
public final class x implements Runnable {
    public final int f52604a = 1;
    public final String f52605b;
    public final Utilities.Callback f52606c;
    public final o2 d;

    public x(String str, Utilities.Callback callback, o2 o2Var) {
        this.f52605b = str;
        this.f52606c = callback;
        this.d = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f52604a) {
            case 0:
                String str = this.f52605b;
                Utilities.Callback callback = this.f52606c;
                o2 o2Var = this.d;
                b0.p(o2Var, 0, new x(str, callback, o2Var));
                return;
            default:
                String str2 = this.f52605b;
                if (str2 != null) {
                    this.f52606c.run(str2);
                    return;
                } else {
                    xc.a0(this.d).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                    return;
                }
        }
    }

    public x(o2 o2Var, String str, Utilities.Callback callback) {
        this.d = o2Var;
        this.f52605b = str;
        this.f52606c = callback;
    }
}
