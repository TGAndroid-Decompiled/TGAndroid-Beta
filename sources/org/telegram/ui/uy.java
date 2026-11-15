package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class uy extends bz {
    public final vy F;

    public uy(vy vyVar, Context context, int i7, int i10) {
        super(context, null, i7, i10);
        this.F = vyVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        vy vyVar = this.F;
        vyVar.d.V1.remove(tL_exportedChatlistInvite);
        vyVar.d.g1();
        vyVar.d.h1(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.m60 F = org.telegram.ui.Components.m60.F(this.F.d.f29685c, null, this);
        F.c(2131232104, org.telegram.messenger.hd.M0(2131751762, null), new Runnable(this) {
            public final uy f51698b;

            {
                this.f51698b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        uy uyVar = this.f51698b;
                        String str = uyVar.f45852y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.cc(uyVar.F.d.W1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f51698b.d();
                        return;
                    default:
                        this.f51698b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232321, org.telegram.messenger.hd.M0(2131750472, null), new Runnable(this) {
            public final uy f51698b;

            {
                this.f51698b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        uy uyVar = this.f51698b;
                        String str = uyVar.f45852y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.cc(uyVar.F.d.W1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f51698b.d();
                        return;
                    default:
                        this.f51698b.a();
                        return;
                }
            }
        }, false);
        F.c(2131232109, org.telegram.messenger.hd.M0(2131751534, null), new Runnable(this) {
            public final uy f51698b;

            {
                this.f51698b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        uy uyVar = this.f51698b;
                        String str = uyVar.f45852y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.cc(uyVar.F.d.W1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f51698b.d();
                        return;
                    default:
                        this.f51698b.a();
                        return;
                }
            }
        }, true);
        if (org.telegram.messenger.hd.f24104a0) {
            F.f37093i = 3;
        }
        F.Z();
    }
}
