package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class qy extends yy {
    public final ry F;

    public qy(ry ryVar, Context context, int i3, int i10) {
        super(context, null, i3, i10);
        this.F = ryVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ry ryVar = this.F;
        ryVar.d.S1.remove(tL_exportedChatlistInvite);
        ryVar.d.g1();
        ryVar.d.h1(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.f60 F = org.telegram.ui.Components.f60.F(this.F.d.f28589c, null, this);
        F.c(2131232103, org.telegram.messenger.bd.M0(2131751762, null), new Runnable(this) {
            public final qy f48706b;

            {
                this.f48706b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        qy qyVar = this.f48706b;
                        String str = qyVar.f52450y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.fc(qyVar.F.d.T1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f48706b.d();
                        return;
                    default:
                        this.f48706b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232320, org.telegram.messenger.bd.M0(2131750480, null), new Runnable(this) {
            public final qy f48706b;

            {
                this.f48706b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        qy qyVar = this.f48706b;
                        String str = qyVar.f52450y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.fc(qyVar.F.d.T1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f48706b.d();
                        return;
                    default:
                        this.f48706b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232108, org.telegram.messenger.bd.M0(2131751535, null), new Runnable(this) {
            public final qy f48706b;

            {
                this.f48706b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        qy qyVar = this.f48706b;
                        String str = qyVar.f52450y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.fc(qyVar.F.d.T1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f48706b.d();
                        return;
                    default:
                        this.f48706b.a();
                        return;
                }
            }
        }, true);
        if (org.telegram.messenger.bd.f21784a0) {
            F.f33729i = 3;
        }
        F.Z();
    }
}
