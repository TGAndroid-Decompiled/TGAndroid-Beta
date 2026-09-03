package qh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.gu0;
import org.telegram.ui.web.HttpGetFileTask;
public final class ta implements DialogInterface.OnCancelListener {
    public final int f46147a;
    public final Object f46148b;

    public ta(Object obj, int i10) {
        this.f46147a = i10;
        this.f46148b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f46147a) {
            case 0:
                ((l6) this.f46148b).run();
                return;
            case 1:
                ((gu0) this.f46148b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f46148b).cancel(true);
                return;
            case 3:
                th.n0 n0Var = (th.n0) this.f46148b;
                ConnectionsManager.getInstance(n0Var.d).cancelRequest(n0Var.f48214r, true);
                n0Var.f48213q = null;
                n0Var.f48214r = 0;
                return;
            default:
                ((zf.n) this.f46148b).F = false;
                return;
        }
    }
}
