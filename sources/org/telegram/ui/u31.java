package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class u31 implements x31 {
    public final org.telegram.messenger.video.a f42379a;
    public final org.telegram.ui.Components.ad f42380b;
    public final Context f42381c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d f42382e;

    public u31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.ad adVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f42379a = aVar;
        this.f42380b = adVar;
        this.f42381c = context;
        this.d = a1Var;
        this.f42382e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new q31(this.f42379a, this.f42380b, this.f42381c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new m31(2, this.f42379a, this.f42380b), 200L);
    }

    @Override
    public final void c() {
        this.f42382e.run();
    }
}
