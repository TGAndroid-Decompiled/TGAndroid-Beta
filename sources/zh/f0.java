package zh;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class f0 implements Utilities.Callback {
    public final int f52015a;
    public final n0 f52016b;

    public f0(n0 n0Var, int i10) {
        this.f52015a = i10;
        this.f52016b = n0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f52015a) {
            case 0:
                String str = (String) obj;
                n0 n0Var = this.f52016b;
                if (n0Var.getParentActivity() != null) {
                    pf.d.r(n0Var.getParentActivity(), str);
                    return;
                }
                return;
            default:
                Uri uri = (Uri) obj;
                n0 n0Var2 = this.f52016b;
                c1 c1Var = n0Var2.d;
                if (c1Var != null && !n0Var2.isFinished) {
                    c1Var.d1(R.drawable.msg_download, LocaleController.getString(R.string.QrSavedToGallery), null);
                    return;
                }
                return;
        }
    }
}
