package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t31 implements Runnable {
    public final int f40637a;
    public final org.telegram.messenger.video.a f40638b;
    public final org.telegram.ui.Components.yc f40639c;
    public final Context d;
    public final bi.s0 f40640e;

    public t31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, bi.s0 s0Var, int i10) {
        this.f40637a = i10;
        this.f40638b = aVar;
        this.f40639c = ycVar;
        this.d = context;
        this.f40640e = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f40637a) {
            case 0:
                this.f40638b.run();
                this.f40639c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 2), this.f40640e)).j();
                return;
            case 1:
                this.f40638b.run();
                this.f40639c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 5), this.f40640e)).j();
                return;
            default:
                this.f40638b.run();
                this.f40639c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 6), this.f40640e)).j();
                return;
        }
    }
}
