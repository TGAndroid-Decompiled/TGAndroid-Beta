package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class x31 implements a41 {
    public final org.telegram.messenger.video.a f42579a;
    public final org.telegram.ui.Components.yc f42580b;
    public final Context f42581c;
    public final bi.s0 d;
    public final org.telegram.messenger.video.d f42582e;

    public x31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, bi.s0 s0Var, org.telegram.messenger.video.d dVar) {
        this.f42579a = aVar;
        this.f42580b = ycVar;
        this.f42581c = context;
        this.d = s0Var;
        this.f42582e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new t31(this.f42579a, this.f42580b, this.f42581c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new rx0(25, this.f42579a, this.f42580b), 200L);
    }

    @Override
    public final void c() {
        this.f42582e.run();
    }
}
