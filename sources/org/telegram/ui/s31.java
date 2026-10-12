package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s31 implements Runnable {
    public final int f41796a;
    public final org.telegram.messenger.video.a f41797b;
    public final org.telegram.ui.Components.zc f41798c;
    public final Context d;
    public final ai.a1 f41799e;

    public s31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.zc zcVar, Context context, ai.a1 a1Var, int i10) {
        this.f41796a = i10;
        this.f41797b = aVar;
        this.f41798c = zcVar;
        this.d = context;
        this.f41799e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f41796a) {
            case 0:
                this.f41797b.run();
                this.f41798c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.d, 2), this.f41799e)).j();
                return;
            case 1:
                this.f41797b.run();
                this.f41798c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.d, 5), this.f41799e)).j();
                return;
            default:
                this.f41797b.run();
                this.f41798c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.d, 6), this.f41799e)).j();
                return;
        }
    }
}
