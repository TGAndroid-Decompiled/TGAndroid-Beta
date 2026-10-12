package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class x31 implements a41 {
    public final org.telegram.messenger.video.a f43742a;
    public final org.telegram.ui.Components.zc f43743b;
    public final Context f43744c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d f43745e;

    public x31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.zc zcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f43742a = aVar;
        this.f43743b = zcVar;
        this.f43744c = context;
        this.d = a1Var;
        this.f43745e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new s31(this.f43742a, this.f43743b, this.f43744c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new w31(0, this.f43742a, this.f43743b), 200L);
    }

    @Override
    public final void c() {
        this.f43745e.run();
    }
}
