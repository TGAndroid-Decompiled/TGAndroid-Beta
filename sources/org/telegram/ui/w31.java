package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class w31 implements z31 {
    public final org.telegram.messenger.video.a f38569a;
    public final org.telegram.ui.Components.vc f38570b;
    public final Context f38571c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d e;

    public w31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f38569a = aVar;
        this.f38570b = vcVar;
        this.f38571c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new s31(this.f38569a, this.f38570b, this.f38571c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ky0(19, this.f38569a, this.f38570b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
