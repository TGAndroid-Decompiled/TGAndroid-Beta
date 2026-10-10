package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class v31 implements y31 {
    public final org.telegram.messenger.video.a f42679a;
    public final org.telegram.ui.Components.ad f42680b;
    public final Context f42681c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d f42682e;

    public v31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.ad adVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f42679a = aVar;
        this.f42680b = adVar;
        this.f42681c = context;
        this.d = a1Var;
        this.f42682e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new r31(this.f42679a, this.f42680b, this.f42681c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new n31(3, this.f42679a, this.f42680b), 200L);
    }

    @Override
    public final void c() {
        this.f42682e.run();
    }
}
