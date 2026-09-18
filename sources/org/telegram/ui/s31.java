package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s31 implements Runnable {
    public final int f37380a;
    public final org.telegram.messenger.video.a f37381b;
    public final org.telegram.ui.Components.vc f37382c;
    public final Context d;
    public final ai.a1 e;

    public s31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, Context context, ai.a1 a1Var, int i10) {
        this.f37380a = i10;
        this.f37381b = aVar;
        this.f37382c = vcVar;
        this.d = context;
        this.e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f37380a) {
            case 0:
                this.f37381b.run();
                this.f37382c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f37381b.run();
                this.f37382c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.d, 5), this.e)).j();
                return;
            default:
                this.f37381b.run();
                this.f37382c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.d, 6), this.e)).j();
                return;
        }
    }
}
