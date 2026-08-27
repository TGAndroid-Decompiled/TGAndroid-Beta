package zf;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.sg;

public final class x implements ei {

    public final gi f50761a;

    public final l0 f50762b;

    public x(l0 l0Var, gi giVar) {
        this.f50762b = l0Var;
        this.f50761a = giVar;
    }

    @Override
    public final boolean N0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        gi giVar = this.f50761a;
        try {
            HashMap<Object, Object> selectedPhotos = giVar.f28650f0.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            l0 l0Var = this.f50762b;
            l0Var.f0(l0Var.h0(str, true));
            giVar.dismiss();
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void y(sg sgVar) {
        sgVar.run();
    }

    @Override
    public final void F() {
    }

    @Override
    public final void I(Object obj) {
    }

    @Override
    public final void g0(TLRPC.User user) {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
