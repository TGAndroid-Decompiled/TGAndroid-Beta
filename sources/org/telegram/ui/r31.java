package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r31 implements Runnable {
    public final int f41258a;
    public final org.telegram.messenger.video.a f41259b;
    public final org.telegram.ui.Components.ad f41260c;
    public final Context d;
    public final ai.a1 f41261e;

    public r31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.ad adVar, Context context, ai.a1 a1Var, int i10) {
        this.f41258a = i10;
        this.f41259b = aVar;
        this.f41260c = adVar;
        this.d = context;
        this.f41261e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f41258a) {
            case 0:
                this.f41259b.run();
                this.f41260c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.d, 2), this.f41261e)).j();
                return;
            case 1:
                this.f41259b.run();
                this.f41260c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.d, 5), this.f41261e)).j();
                return;
            default:
                this.f41259b.run();
                this.f41260c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.d, 6), this.f41261e)).j();
                return;
        }
    }
}
