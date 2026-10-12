package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class x31 implements a41 {
    public final org.telegram.messenger.video.a f43747a;
    public final org.telegram.ui.Components.zc f43748b;
    public final Context f43749c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d f43750e;

    public x31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.zc zcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f43747a = aVar;
        this.f43748b = zcVar;
        this.f43749c = context;
        this.d = a1Var;
        this.f43750e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new s31(this.f43747a, this.f43748b, this.f43749c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new u31(1, this.f43747a, this.f43748b), 200L);
    }

    @Override
    public final void c() {
        this.f43750e.run();
    }
}
