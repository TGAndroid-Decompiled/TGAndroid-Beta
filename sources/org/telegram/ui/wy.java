package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class wy extends dz {
    public final xy E;

    public wy(xy xyVar, Context context, int i7, int i10) {
        super(context, null, i7, i10);
        this.E = xyVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        xy xyVar = this.E;
        xyVar.d.U1.remove(tL_exportedChatlistInvite);
        xyVar.d.g1();
        xyVar.d.h1(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.k60 F = org.telegram.ui.Components.k60.F(this.E.d.f28675c, null, this);
        F.c(2131232103, org.telegram.messenger.id.M0(2131751762, null), new Runnable(this) {
            public final wy f50825b;

            {
                this.f50825b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        wy wyVar = this.f50825b;
                        String str = wyVar.f45081y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.gc(wyVar.E.d.V1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f50825b.d();
                        return;
                    default:
                        this.f50825b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232320, org.telegram.messenger.id.M0(2131750472, null), new Runnable(this) {
            public final wy f50825b;

            {
                this.f50825b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        wy wyVar = this.f50825b;
                        String str = wyVar.f45081y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.gc(wyVar.E.d.V1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f50825b.d();
                        return;
                    default:
                        this.f50825b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232108, org.telegram.messenger.id.M0(2131751534, null), new Runnable(this) {
            public final wy f50825b;

            {
                this.f50825b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        wy wyVar = this.f50825b;
                        String str = wyVar.f45081y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.gc(wyVar.E.d.V1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f50825b.d();
                        return;
                    default:
                        this.f50825b.a();
                        return;
                }
            }
        }, true);
        if (org.telegram.messenger.id.f23161a0) {
            F.f35201i = 3;
        }
        F.Z();
    }
}
