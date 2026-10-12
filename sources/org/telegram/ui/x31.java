package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x31 implements Runnable {
    public final int f41738a;
    public final org.telegram.messenger.video.a f41739b;
    public final org.telegram.ui.Components.zc f41740c;
    public final Context d;
    public final bi.s0 e;

    public x31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.zc zcVar, Context context, bi.s0 s0Var, int i10) {
        this.f41738a = i10;
        this.f41739b = aVar;
        this.f41740c = zcVar;
        this.d = context;
        this.e = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f41738a) {
            case 0:
                this.f41739b.run();
                this.f41740c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new tv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f41739b.run();
                this.f41740c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new tv(this.d, 5), this.e)).j();
                return;
            default:
                this.f41739b.run();
                this.f41740c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new tv(this.d, 6), this.e)).j();
                return;
        }
    }
}
