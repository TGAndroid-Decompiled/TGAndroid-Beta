package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class qr0 implements Utilities.Callback {
    public final int f37831a;
    public final wr0 f37832b;
    public final boolean f37833c;

    public qr0(wr0 wr0Var, boolean z4, int i10) {
        this.f37831a = i10;
        this.f37832b = wr0Var;
        this.f37833c = z4;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f37831a) {
            case 0:
                org.telegram.ui.Components.qc.F(this.f37832b.f39788b.f31705b0, this.f37833c).j();
                return;
            default:
                org.telegram.ui.Components.qc.F(this.f37832b.f39788b.f31705b0, this.f37833c).j();
                return;
        }
    }
}
