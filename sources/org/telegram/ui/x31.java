package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class x31 implements a41 {
    public final org.telegram.messenger.video.a f42607a;
    public final org.telegram.ui.Components.yc f42608b;
    public final Context f42609c;
    public final bi.s0 d;
    public final org.telegram.messenger.video.d f42610e;

    public x31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, bi.s0 s0Var, org.telegram.messenger.video.d dVar) {
        this.f42607a = aVar;
        this.f42608b = ycVar;
        this.f42609c = context;
        this.d = s0Var;
        this.f42610e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new t31(this.f42607a, this.f42608b, this.f42609c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new rx0(25, this.f42607a, this.f42608b), 200L);
    }

    @Override
    public final void c() {
        this.f42610e.run();
    }
}
