package sg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ti;
public final class z implements ri {
    public final ti f48595a;
    public final n0 f48596b;

    public z(n0 n0Var, ti tiVar) {
        this.f48596b = n0Var;
        this.f48595a = tiVar;
    }

    @Override
    public final void A(gh ghVar) {
        ghVar.run();
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ti tiVar = this.f48595a;
        try {
            HashMap<Object, Object> selectedPhotos = tiVar.f33033j0.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                n0 n0Var = this.f48596b;
                n0Var.d0(n0Var.f0(str, true));
                tiVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean x0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void R() {
    }

    @Override
    public final void T(Object obj) {
    }

    @Override
    public final void Y(TLRPC.User user) {
    }

    @Override
    public final void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
