package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class w31 implements z31 {
    public final org.telegram.messenger.video.a f38564a;
    public final org.telegram.ui.Components.vc f38565b;
    public final Context f38566c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d e;

    public w31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f38564a = aVar;
        this.f38565b = vcVar;
        this.f38566c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new s31(this.f38564a, this.f38565b, this.f38566c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ky0(19, this.f38564a, this.f38565b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
