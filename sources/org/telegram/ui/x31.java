package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x31 implements Runnable {
    public final int f41422a;
    public final org.telegram.messenger.video.a f41423b;
    public final org.telegram.ui.Components.zc f41424c;
    public final Context d;
    public final bi.s0 e;

    public x31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.zc zcVar, Context context, bi.s0 s0Var, int i10) {
        this.f41422a = i10;
        this.f41423b = aVar;
        this.f41424c = zcVar;
        this.d = context;
        this.e = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f41422a) {
            case 0:
                this.f41423b.run();
                this.f41424c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new tv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f41423b.run();
                this.f41424c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new tv(this.d, 5), this.e)).j();
                return;
            default:
                this.f41423b.run();
                this.f41424c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new tv(this.d, 6), this.e)).j();
                return;
        }
    }
}
