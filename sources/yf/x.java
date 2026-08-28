package yf;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.wg;
public final class x implements ii {
    public final ki f50166a;
    public final l0 f50167b;

    public x(l0 l0Var, ki kiVar) {
        this.f50167b = l0Var;
        this.f50166a = kiVar;
    }

    @Override
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        ki kiVar = this.f50166a;
        try {
            HashMap<Object, Object> selectedPhotos = kiVar.f30114f0.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                l0 l0Var = this.f50167b;
                l0Var.f0(l0Var.h0(str, true));
                kiVar.dismiss();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void t(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final boolean t0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void A(Object obj) {
    }

    @Override
    public final void E(TLRPC.User user) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}
