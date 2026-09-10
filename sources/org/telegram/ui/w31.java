package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w31 implements Runnable {
    public final int f37696a;
    public final org.telegram.messenger.video.a f37697b;
    public final org.telegram.ui.Components.wc f37698c;
    public final Context d;
    public final org.telegram.ui.Components.bq0 e;

    public w31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, Context context, org.telegram.ui.Components.bq0 bq0Var, int i10) {
        this.f37696a = i10;
        this.f37697b = aVar;
        this.f37698c = wcVar;
        this.d = context;
        this.e = bq0Var;
    }

    @Override
    public final void run() {
        switch (this.f37696a) {
            case 0:
                this.f37697b.run();
                this.f37698c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f37697b.run();
                this.f37698c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.d, 5), this.e)).j();
                return;
            default:
                this.f37697b.run();
                this.f37698c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.d, 6), this.e)).j();
                return;
        }
    }
}
