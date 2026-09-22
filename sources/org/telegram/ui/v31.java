package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class v31 implements y31 {
    public final org.telegram.messenger.video.a f38409a;
    public final org.telegram.ui.Components.xc f38410b;
    public final Context f38411c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d e;

    public v31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f38409a = aVar;
        this.f38410b = xcVar;
        this.f38411c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new r31(this.f38409a, this.f38410b, this.f38411c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new rx0(25, this.f38409a, this.f38410b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
