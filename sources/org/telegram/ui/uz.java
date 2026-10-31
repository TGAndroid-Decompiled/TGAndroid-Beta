package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class uz extends c00 {
    public final vz E;

    public uz(vz vzVar, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = vzVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        vz vzVar = this.E;
        vzVar.d.R1.remove(tL_exportedChatlistInvite);
        vzVar.d.g1();
        vzVar.d.h1(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(this.E.d.f21589c, null, this);
        F.c(2131232102, org.telegram.messenger.cd.L0(2131751762, null), new Runnable(this) {
            public final uz f41971b;

            {
                this.f41971b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        uz uzVar = this.f41971b;
                        String str = uzVar.f36349y;
                        if (str != null && org.telegram.messenger.i0.g(str)) {
                            new org.telegram.ui.Components.cc(uzVar.E.d.S1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f41971b.d();
                        return;
                    default:
                        this.f41971b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232319, org.telegram.messenger.cd.L0(2131750481, null), new Runnable(this) {
            public final uz f41971b;

            {
                this.f41971b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        uz uzVar = this.f41971b;
                        String str = uzVar.f36349y;
                        if (str != null && org.telegram.messenger.i0.g(str)) {
                            new org.telegram.ui.Components.cc(uzVar.E.d.S1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f41971b.d();
                        return;
                    default:
                        this.f41971b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232107, org.telegram.messenger.cd.L0(2131751535, null), new Runnable(this) {
            public final uz f41971b;

            {
                this.f41971b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        uz uzVar = this.f41971b;
                        String str = uzVar.f36349y;
                        if (str != null && org.telegram.messenger.i0.g(str)) {
                            new org.telegram.ui.Components.cc(uzVar.E.d.S1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f41971b.d();
                        return;
                    default:
                        this.f41971b.a();
                        return;
                }
            }
        }, true);
        if (org.telegram.messenger.cd.X) {
            F.f32923i = 3;
        }
        F.Z();
    }
}
