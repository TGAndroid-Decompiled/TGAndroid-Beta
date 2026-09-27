package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class tc0 extends gg.t0 {
    public boolean m0;
    public final fd0 f37754n0;

    public tc0(fd0 fd0Var, Context context, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context, i10, j3, false, e6Var, false, z10, z11);
        this.f37754n0 = fd0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f37754n0.r0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        fd0 fd0Var = this.f37754n0;
        MessageObject messageObject = fd0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    zc0 zc0Var = (zc0) arrayList.get(i12);
                    if (zc0Var != null && !UserObject.isUserSelf(zc0Var.f40467c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                fd0Var.f33498i0 = ((zc0) arrayList.get(0)).f40465a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.w0 w0Var = fd0Var.Z;
            if (i10 != 1) {
                i11 = 8;
            }
            w0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
