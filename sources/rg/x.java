package rg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ti;
public final class x implements ri {
    public final ti f45696a;
    public final m0 f45697b;

    public x(m0 m0Var, ti tiVar) {
        this.f45697b = m0Var;
        this.f45696a = tiVar;
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ti tiVar = this.f45696a;
        try {
            HashMap<Object, Object> selectedPhotos = tiVar.f30546j0.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                m0 m0Var = this.f45697b;
                m0Var.f0(m0Var.h0(str, true));
                tiVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean p0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void u(gh ghVar) {
        ghVar.run();
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void E() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void O(Object obj) {
    }

    @Override
    public final void X(TLRPC.User user) {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
