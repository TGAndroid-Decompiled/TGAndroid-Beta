package ph;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.gu0;
import org.telegram.ui.web.HttpGetFileTask;
public final class wa implements DialogInterface.OnCancelListener {
    public final int f42550a;
    public final Object f42551b;

    public wa(Object obj, int i10) {
        this.f42550a = i10;
        this.f42551b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f42550a) {
            case 0:
                ((e6) this.f42551b).run();
                return;
            case 1:
                ((gu0) this.f42551b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f42551b).cancel(true);
                return;
            case 3:
                sh.n0 n0Var = (sh.n0) this.f42551b;
                ConnectionsManager.getInstance(n0Var.d).cancelRequest(n0Var.f44459r, true);
                n0Var.f44458q = null;
                n0Var.f44459r = 0;
                return;
            default:
                ((yf.n) this.f42551b).F = false;
                return;
        }
    }
}
