package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class u31 implements x31 {
    public final org.telegram.messenger.video.a f37848a;
    public final org.telegram.ui.Components.vc f37849b;
    public final Context f37850c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d e;

    public u31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f37848a = aVar;
        this.f37849b = vcVar;
        this.f37850c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new q31(this.f37848a, this.f37849b, this.f37850c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new iy0(19, this.f37848a, this.f37849b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
