package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ss0 implements Utilities.Callback {
    public final int f39940a;
    public final ys0 f39941b;
    public final boolean f39942c;

    public ss0(ys0 ys0Var, boolean z10, int i10) {
        this.f39940a = i10;
        this.f39941b = ys0Var;
        this.f39942c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f39940a) {
            case 0:
                org.telegram.ui.Components.zc.F(this.f39941b.f41955b.f31928e0, this.f39942c).j();
                return;
            default:
                org.telegram.ui.Components.zc.F(this.f39941b.f41955b.f31928e0, this.f39942c).j();
                return;
        }
    }
}
