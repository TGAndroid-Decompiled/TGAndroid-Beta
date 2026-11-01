package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class tz extends b00 {
    public final uz E;

    public tz(uz uzVar, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = uzVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        uz uzVar = this.E;
        uzVar.d.R1.remove(tL_exportedChatlistInvite);
        uzVar.d.g1();
        uzVar.d.h1(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(this.E.d.f21590c, null, this);
        F.c(2131232102, org.telegram.messenger.dd.L0(2131751762, null), new Runnable(this) {
            public final tz f41491b;

            {
                this.f41491b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        tz tzVar = this.f41491b;
                        String str = tzVar.f35884y;
                        if (str != null && org.telegram.messenger.i0.g(str)) {
                            new org.telegram.ui.Components.cc(tzVar.E.d.S1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f41491b.d();
                        return;
                    default:
                        this.f41491b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232319, org.telegram.messenger.dd.L0(2131750481, null), new Runnable(this) {
            public final tz f41491b;

            {
                this.f41491b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        tz tzVar = this.f41491b;
                        String str = tzVar.f35884y;
                        if (str != null && org.telegram.messenger.i0.g(str)) {
                            new org.telegram.ui.Components.cc(tzVar.E.d.S1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f41491b.d();
                        return;
                    default:
                        this.f41491b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232107, org.telegram.messenger.dd.L0(2131751535, null), new Runnable(this) {
            public final tz f41491b;

            {
                this.f41491b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        tz tzVar = this.f41491b;
                        String str = tzVar.f35884y;
                        if (str != null && org.telegram.messenger.i0.g(str)) {
                            new org.telegram.ui.Components.cc(tzVar.E.d.S1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f41491b.d();
                        return;
                    default:
                        this.f41491b.a();
                        return;
                }
            }
        }, true);
        if (org.telegram.messenger.dd.X) {
            F.f33026i = 3;
        }
        F.Z();
    }
}
