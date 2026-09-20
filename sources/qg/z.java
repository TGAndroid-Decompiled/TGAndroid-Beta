package qg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;
public final class z implements ti {
    public final vi f42029a;
    public final n0 f42030b;

    public z(n0 n0Var, vi viVar) {
        this.f42030b = n0Var;
        this.f42029a = viVar;
    }

    @Override
    public final void C1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        vi viVar = this.f42029a;
        try {
            HashMap<Object, Object> selectedPhotos = viVar.f29110j0.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                n0 n0Var = this.f42030b;
                n0Var.f0(n0Var.h0(str, true));
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
    public final boolean f0() {
        return false;
    }

    @Override
    public final void y0(gh ghVar) {
        ghVar.run();
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void V0(Object obj) {
    }

    @Override
    public final void k1(TLRPC.User user) {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
