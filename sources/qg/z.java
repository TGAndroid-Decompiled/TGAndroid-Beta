package qg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xi;
public final class z implements vi {
    public final xi f42120a;
    public final n0 f42121b;

    public z(n0 n0Var, xi xiVar) {
        this.f42121b = n0Var;
        this.f42120a = xiVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        xi xiVar = this.f42120a;
        try {
            HashMap<Object, Object> selectedPhotos = xiVar.f30282j0.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                n0 n0Var = this.f42121b;
                n0Var.f0(n0Var.h0(str, true));
                xiVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean S1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final void x0(ih ihVar) {
        ihVar.run();
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
