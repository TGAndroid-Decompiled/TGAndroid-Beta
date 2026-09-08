package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class x31 implements a41 {
    public final org.telegram.messenger.video.a f42606a;
    public final org.telegram.ui.Components.yc f42607b;
    public final Context f42608c;
    public final bi.s0 d;
    public final org.telegram.messenger.video.d f42609e;

    public x31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, bi.s0 s0Var, org.telegram.messenger.video.d dVar) {
        this.f42606a = aVar;
        this.f42607b = ycVar;
        this.f42608c = context;
        this.d = s0Var;
        this.f42609e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new t31(this.f42606a, this.f42607b, this.f42608c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new rx0(25, this.f42606a, this.f42607b), 200L);
    }

    @Override
    public final void c() {
        this.f42609e.run();
    }
}
