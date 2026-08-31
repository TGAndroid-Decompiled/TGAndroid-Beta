package qh;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class j0 implements Utilities.Callback {
    public final int f45452a;
    public final n0 f45453b;

    public j0(n0 n0Var, int i10) {
        this.f45452a = i10;
        this.f45453b = n0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f45452a) {
            case 0:
                Float f10 = (Float) obj;
                m0 m0Var = this.f45453b.f45750n;
                if (m0Var != null) {
                    m0Var.setProgress(f10.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                n0 n0Var = this.f45453b;
                if (n0Var.f45747c && n0Var.f45751r != null) {
                    n0Var.f45750n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    n0Var.f45747c = false;
                    n0Var.d();
                    n0Var.v = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                n0 n0Var2 = this.f45453b;
                n0Var2.f45747c = false;
                n0Var2.d();
                m0 m0Var2 = n0Var2.f45750n;
                if (m0Var2 != null) {
                    m0Var2.a();
                    n0Var2.f45750n = null;
                }
                m0 m0Var3 = new m0(n0Var2.getContext());
                n0Var2.f45750n = m0Var3;
                m0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                n0Var2.f45746b.addView(n0Var2.f45750n);
                n0Var2.v = uri2;
                return;
        }
    }
}
