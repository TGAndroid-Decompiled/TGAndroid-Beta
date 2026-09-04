package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t31 implements Runnable {
    public final int f40609a;
    public final org.telegram.messenger.video.a f40610b;
    public final org.telegram.ui.Components.yc f40611c;
    public final Context d;
    public final bi.s0 f40612e;

    public t31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, bi.s0 s0Var, int i10) {
        this.f40609a = i10;
        this.f40610b = aVar;
        this.f40611c = ycVar;
        this.d = context;
        this.f40612e = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f40609a) {
            case 0:
                this.f40610b.run();
                this.f40611c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 2), this.f40612e)).j();
                return;
            case 1:
                this.f40610b.run();
                this.f40611c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 5), this.f40612e)).j();
                return;
            default:
                this.f40610b.run();
                this.f40611c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 6), this.f40612e)).j();
                return;
        }
    }
}
