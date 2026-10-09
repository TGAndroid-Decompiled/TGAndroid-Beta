package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class v31 implements y31 {
    public final org.telegram.messenger.video.a f42633a;
    public final org.telegram.ui.Components.ad f42634b;
    public final Context f42635c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d f42636e;

    public v31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.ad adVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f42633a = aVar;
        this.f42634b = adVar;
        this.f42635c = context;
        this.d = a1Var;
        this.f42636e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new r31(this.f42633a, this.f42634b, this.f42635c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new n31(3, this.f42633a, this.f42634b), 200L);
    }

    @Override
    public final void c() {
        this.f42636e.run();
    }
}
