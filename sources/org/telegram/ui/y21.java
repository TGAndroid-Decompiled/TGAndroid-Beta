package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y21 implements Runnable {
    public final int f40361a;
    public final org.telegram.messenger.video.a f40362b;
    public final org.telegram.ui.Components.qc f40363c;
    public final Context d;
    public final nh.i0 e;

    public y21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.qc qcVar, Context context, nh.i0 i0Var, int i10) {
        this.f40361a = i10;
        this.f40362b = aVar;
        this.f40363c = qcVar;
        this.d = context;
        this.e = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f40361a) {
            case 0:
                this.f40362b.run();
                this.f40363c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new lv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f40362b.run();
                this.f40363c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new lv(this.d, 5), this.e)).j();
                return;
            default:
                this.f40362b.run();
                this.f40363c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new lv(this.d, 6), this.e)).j();
                return;
        }
    }
}
