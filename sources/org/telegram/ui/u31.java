package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class u31 implements x31 {
    public final org.telegram.messenger.video.a f37871a;
    public final org.telegram.ui.Components.xc f37872b;
    public final Context f37873c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d e;

    public u31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f37871a = aVar;
        this.f37872b = xcVar;
        this.f37873c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new q31(this.f37871a, this.f37872b, this.f37873c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new cy0(23, this.f37871a, this.f37872b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
