package qg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;
public final class z implements ti {
    public final vi f41722a;
    public final p0 f41723b;

    public z(p0 p0Var, vi viVar) {
        this.f41723b = p0Var;
        this.f41722a = viVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        vi viVar = this.f41722a;
        try {
            HashMap<Object, Object> selectedPhotos = viVar.f28762j0.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                p0 p0Var = this.f41723b;
                p0Var.f0(p0Var.h0(str, true));
                viVar.dismiss();
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
    public final void x0(fh fhVar) {
        fhVar.run();
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
