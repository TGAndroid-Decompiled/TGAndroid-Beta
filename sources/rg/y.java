package rg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;
public final class y implements ti {
    public final vi f44605a;
    public final o0 f44606b;

    public y(o0 o0Var, vi viVar) {
        this.f44606b = o0Var;
        this.f44605a = viVar;
    }

    @Override
    public final void g0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        vi viVar = this.f44605a;
        try {
            HashMap<Object, Object> selectedPhotos = viVar.f30013j0.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                o0 o0Var = this.f44606b;
                o0Var.f0(o0Var.h0(str, true));
                viVar.dismiss();
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
    public final void v(hh hhVar) {
        hhVar.run();
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void U(Object obj) {
    }

    @Override
    public final void W(TLRPC.User user) {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
