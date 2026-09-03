package qh;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class j0 implements Utilities.Callback {
    public final int f45515a;
    public final n0 f45516b;

    public j0(n0 n0Var, int i10) {
        this.f45515a = i10;
        this.f45516b = n0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f45515a) {
            case 0:
                Float f10 = (Float) obj;
                m0 m0Var = this.f45516b.f45787n;
                if (m0Var != null) {
                    m0Var.setProgress(f10.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                n0 n0Var = this.f45516b;
                if (n0Var.f45784c && n0Var.f45788r != null) {
                    n0Var.f45787n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    n0Var.f45784c = false;
                    n0Var.d();
                    n0Var.v = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                n0 n0Var2 = this.f45516b;
                n0Var2.f45784c = false;
                n0Var2.d();
                m0 m0Var2 = n0Var2.f45787n;
                if (m0Var2 != null) {
                    m0Var2.a();
                    n0Var2.f45787n = null;
                }
                m0 m0Var3 = new m0(n0Var2.getContext());
                n0Var2.f45787n = m0Var3;
                m0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                n0Var2.f45783b.addView(n0Var2.f45787n);
                n0Var2.v = uri2;
                return;
        }
    }
}
