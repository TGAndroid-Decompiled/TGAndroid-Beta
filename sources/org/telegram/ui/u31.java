package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class u31 implements x31 {
    public final org.telegram.messenger.video.a f42345a;
    public final org.telegram.ui.Components.ad f42346b;
    public final Context f42347c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d f42348e;

    public u31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.ad adVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f42345a = aVar;
        this.f42346b = adVar;
        this.f42347c = context;
        this.d = a1Var;
        this.f42348e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new q31(this.f42345a, this.f42346b, this.f42347c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new m31(2, this.f42345a, this.f42346b), 200L);
    }

    @Override
    public final void c() {
        this.f42348e.run();
    }
}
