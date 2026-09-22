package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class v31 implements y31 {
    public final org.telegram.messenger.video.a f38353a;
    public final org.telegram.ui.Components.vc f38354b;
    public final Context f38355c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d e;

    public v31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f38353a = aVar;
        this.f38354b = vcVar;
        this.f38355c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new r31(this.f38353a, this.f38354b, this.f38355c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new iy0(19, this.f38353a, this.f38354b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
