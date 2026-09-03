package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ur0 implements Utilities.Callback {
    public final int f41921a;
    public final ds0 f41922b;

    public ur0(ds0 ds0Var, int i10) {
        this.f41921a = i10;
        this.f41922b = ds0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f41921a) {
            case 0:
                new org.telegram.ui.Components.qc(this.f41922b.f36251b.f34230b0, null).m(org.telegram.ui.Components.pc.f30031r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.qc(this.f41922b.f36251b.f34230b0, null).m(org.telegram.ui.Components.pc.f30031r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
