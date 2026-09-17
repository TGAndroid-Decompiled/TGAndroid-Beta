package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t31 implements Runnable {
    public final int f40610a;
    public final org.telegram.messenger.video.a f40611b;
    public final org.telegram.ui.Components.yc f40612c;
    public final Context d;
    public final bi.s0 f40613e;

    public t31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, bi.s0 s0Var, int i10) {
        this.f40610a = i10;
        this.f40611b = aVar;
        this.f40612c = ycVar;
        this.d = context;
        this.f40613e = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f40610a) {
            case 0:
                this.f40611b.run();
                this.f40612c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 2), this.f40613e)).j();
                return;
            case 1:
                this.f40611b.run();
                this.f40612c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 5), this.f40613e)).j();
                return;
            default:
                this.f40611b.run();
                this.f40612c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 6), this.f40613e)).j();
                return;
        }
    }
}
