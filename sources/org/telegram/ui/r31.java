package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r31 implements Runnable {
    public final int f41260a;
    public final org.telegram.messenger.video.a f41261b;
    public final org.telegram.ui.Components.ad f41262c;
    public final Context d;
    public final ai.a1 f41263e;

    public r31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.ad adVar, Context context, ai.a1 a1Var, int i10) {
        this.f41260a = i10;
        this.f41261b = aVar;
        this.f41262c = adVar;
        this.d = context;
        this.f41263e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f41260a) {
            case 0:
                this.f41261b.run();
                this.f41262c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.d, 2), this.f41263e)).j();
                return;
            case 1:
                this.f41261b.run();
                this.f41262c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.d, 5), this.f41263e)).j();
                return;
            default:
                this.f41261b.run();
                this.f41262c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.d, 6), this.f41263e)).j();
                return;
        }
    }
}
