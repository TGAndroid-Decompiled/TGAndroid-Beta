package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r31 implements Runnable {
    public final int f37038a;
    public final org.telegram.messenger.video.a f37039b;
    public final org.telegram.ui.Components.xc f37040c;
    public final Context d;
    public final ai.a1 e;

    public r31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ai.a1 a1Var, int i10) {
        this.f37038a = i10;
        this.f37039b = aVar;
        this.f37040c = xcVar;
        this.d = context;
        this.e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f37038a) {
            case 0:
                this.f37039b.run();
                this.f37040c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f37039b.run();
                this.f37040c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 5), this.e)).j();
                return;
            default:
                this.f37039b.run();
                this.f37040c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 6), this.e)).j();
                return;
        }
    }
}
