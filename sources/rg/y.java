package rg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.ri;
public final class y implements pi {
    public final ri f46140a;
    public final m0 f46141b;

    public y(m0 m0Var, ri riVar) {
        this.f46141b = m0Var;
        this.f46140a = riVar;
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ri riVar = this.f46140a;
        try {
            HashMap<Object, Object> selectedPhotos = riVar.f30158j0.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                m0 m0Var = this.f46141b;
                m0Var.e0(m0Var.g0(str, true));
                riVar.dismiss();
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
    public final void r(eh ehVar) {
        ehVar.run();
    }

    @Override
    public final boolean u() {
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
