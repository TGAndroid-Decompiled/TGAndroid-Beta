package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class vy extends cz {
    public final wy E;

    public vy(wy wyVar, Context context, int i7, int i10) {
        super(context, null, i7, i10);
        this.E = wyVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        wy wyVar = this.E;
        wyVar.d.R1.remove(tL_exportedChatlistInvite);
        wyVar.d.g1();
        wyVar.d.h1(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.l60 F = org.telegram.ui.Components.l60.F(this.E.d.f28627c, null, this);
        F.c(2131232103, org.telegram.messenger.id.M0(2131751762, null), new Runnable(this) {
            public final vy f50496b;

            {
                this.f50496b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        vy vyVar = this.f50496b;
                        String str = vyVar.f44783y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.hc(vyVar.E.d.S1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f50496b.d();
                        return;
                    default:
                        this.f50496b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232320, org.telegram.messenger.id.M0(2131750472, null), new Runnable(this) {
            public final vy f50496b;

            {
                this.f50496b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        vy vyVar = this.f50496b;
                        String str = vyVar.f44783y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.hc(vyVar.E.d.S1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f50496b.d();
                        return;
                    default:
                        this.f50496b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232108, org.telegram.messenger.id.M0(2131751534, null), new Runnable(this) {
            public final vy f50496b;

            {
                this.f50496b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        vy vyVar = this.f50496b;
                        String str = vyVar.f44783y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.hc(vyVar.E.d.S1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f50496b.d();
                        return;
                    default:
                        this.f50496b.a();
                        return;
                }
            }
        }, true);
        if (org.telegram.messenger.id.f23157a0) {
            F.f35599i = 3;
        }
        F.Z();
    }
}
