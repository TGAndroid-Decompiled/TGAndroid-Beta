package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class ty extends az {
    public final uy E;

    public ty(uy uyVar, Context context, int i7, int i10) {
        super(context, null, i7, i10);
        this.E = uyVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        uy uyVar = this.E;
        uyVar.d.R1.remove(tL_exportedChatlistInvite);
        uyVar.d.g1();
        uyVar.d.h1(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.k60 F = org.telegram.ui.Components.k60.F(this.E.d.f28618c, null, this);
        F.c(2131232103, org.telegram.messenger.hd.M0(2131751762, null), new Runnable(this) {
            public final ty f49868b;

            {
                this.f49868b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ty tyVar = this.f49868b;
                        String str = tyVar.f44133y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.hc(tyVar.E.d.S1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f49868b.d();
                        return;
                    default:
                        this.f49868b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232320, org.telegram.messenger.hd.M0(2131750471, null), new Runnable(this) {
            public final ty f49868b;

            {
                this.f49868b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ty tyVar = this.f49868b;
                        String str = tyVar.f44133y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.hc(tyVar.E.d.S1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f49868b.d();
                        return;
                    default:
                        this.f49868b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232108, org.telegram.messenger.hd.M0(2131751535, null), new Runnable(this) {
            public final ty f49868b;

            {
                this.f49868b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ty tyVar = this.f49868b;
                        String str = tyVar.f44133y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.hc(tyVar.E.d.S1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f49868b.d();
                        return;
                    default:
                        this.f49868b.a();
                        return;
                }
            }
        }, true);
        if (org.telegram.messenger.hd.f22871a0) {
            F.f35162i = 3;
        }
        F.Z();
    }
}
