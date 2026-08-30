package ph;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.zt0;
public final class wa implements DialogInterface.OnCancelListener {
    public final int f42516a;
    public final Object f42517b;

    public wa(Object obj, int i10) {
        this.f42516a = i10;
        this.f42517b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f42516a) {
            case 0:
                ((f6) this.f42517b).run();
                return;
            case 1:
                ((zt0) this.f42517b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f42517b).cancel(true);
                return;
            case 3:
                sh.o0 o0Var = (sh.o0) this.f42517b;
                ConnectionsManager.getInstance(o0Var.d).cancelRequest(o0Var.f44398r, true);
                o0Var.f44397q = null;
                o0Var.f44398r = 0;
                return;
            default:
                ((yf.n) this.f42517b).F = false;
                return;
        }
    }
}
