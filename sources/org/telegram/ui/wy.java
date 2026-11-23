package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class wy extends dz {
    public final xy F;

    public wy(xy xyVar, Context context, int i7, int i10) {
        super(context, null, i7, i10);
        this.F = xyVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        xy xyVar = this.F;
        xyVar.d.V1.remove(tL_exportedChatlistInvite);
        xyVar.d.h1();
        xyVar.d.i1(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.x60 G = org.telegram.ui.Components.x60.G(this.F.d.f30229c, null, this);
        G.c(2131232108, org.telegram.messenger.gd.N0(2131751750, null), new Runnable(this) {
            public final wy f53053b;

            {
                this.f53053b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        wy wyVar = this.f53053b;
                        String str = wyVar.f47270y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.kc(wyVar.F.d.W1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f53053b.d();
                        return;
                    default:
                        this.f53053b.a();
                        return;
                }
            }
        }, false);
        G.c(2131232325, org.telegram.messenger.gd.N0(2131750455, null), new Runnable(this) {
            public final wy f53053b;

            {
                this.f53053b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        wy wyVar = this.f53053b;
                        String str = wyVar.f47270y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.kc(wyVar.F.d.W1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f53053b.d();
                        return;
                    default:
                        this.f53053b.a();
                        return;
                }
            }
        }, false);
        G.c(2131232113, org.telegram.messenger.gd.N0(2131751522, null), new Runnable(this) {
            public final wy f53053b;

            {
                this.f53053b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        wy wyVar = this.f53053b;
                        String str = wyVar.f47270y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.kc(wyVar.F.d.W1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f53053b.d();
                        return;
                    default:
                        this.f53053b.a();
                        return;
                }
            }
        }, true);
        if (org.telegram.messenger.gd.f24314a0) {
            G.f41873i = 3;
        }
        G.a0();
    }
}
