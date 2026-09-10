package pg;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yi;
public final class y implements wi {
    public final yi f40370a;
    public final m0 f40371b;

    public y(m0 m0Var, yi yiVar) {
        this.f40371b = m0Var;
        this.f40370a = yiVar;
    }

    @Override
    public final void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        yi yiVar = this.f40370a;
        try {
            HashMap<Object, Object> selectedPhotos = yiVar.f29378j0.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                m0 m0Var = this.f40371b;
                m0Var.f0(m0Var.h0(str, true));
                yiVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean R1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final void y0(jh jhVar) {
        jhVar.run();
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void i1(TLRPC.User user) {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
