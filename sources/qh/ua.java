package qh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.bu0;
import org.telegram.ui.web.HttpGetFileTask;
public final class ua implements DialogInterface.OnCancelListener {
    public final int f46167a;
    public final Object f46168b;

    public ua(Object obj, int i10) {
        this.f46167a = i10;
        this.f46168b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f46167a) {
            case 0:
                ((d6) this.f46168b).run();
                return;
            case 1:
                ((bu0) this.f46168b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f46168b).cancel(true);
                return;
            case 3:
                th.n0 n0Var = (th.n0) this.f46168b;
                ConnectionsManager.getInstance(n0Var.d).cancelRequest(n0Var.f48178r, true);
                n0Var.f48177q = null;
                n0Var.f48178r = 0;
                return;
            default:
                ((zf.n) this.f46168b).F = false;
                return;
        }
    }
}
