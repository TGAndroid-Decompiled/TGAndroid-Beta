package ph;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class j0 implements Utilities.Callback {
    public final int f41804a;
    public final n0 f41805b;

    public j0(n0 n0Var, int i10) {
        this.f41804a = i10;
        this.f41805b = n0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41804a) {
            case 0:
                Float f10 = (Float) obj;
                m0 m0Var = this.f41805b.f42030n;
                if (m0Var != null) {
                    m0Var.setProgress(f10.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                n0 n0Var = this.f41805b;
                if (n0Var.f42028c && n0Var.f42031r != null) {
                    n0Var.f42030n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    n0Var.f42028c = false;
                    n0Var.d();
                    n0Var.v = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                n0 n0Var2 = this.f41805b;
                n0Var2.f42028c = false;
                n0Var2.d();
                m0 m0Var2 = n0Var2.f42030n;
                if (m0Var2 != null) {
                    m0Var2.a();
                    n0Var2.f42030n = null;
                }
                m0 m0Var3 = new m0(n0Var2.getContext());
                n0Var2.f42030n = m0Var3;
                m0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                n0Var2.f42027b.addView(n0Var2.f42030n);
                n0Var2.v = uri2;
                return;
        }
    }
}
