package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class xy extends ez {
    public final yy F;

    public xy(yy yyVar, Context context, int i7, int i10) {
        super(context, null, i7, i10);
        this.F = yyVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        yy yyVar = this.F;
        yyVar.d.V1.remove(tL_exportedChatlistInvite);
        yyVar.d.h1();
        yyVar.d.i1(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.y60 G = org.telegram.ui.Components.y60.G(this.F.d.f30195c, null, this);
        G.c(2131232105, org.telegram.messenger.gd.M0(2131751751, null), new Runnable(this) {
            public final xy f53556b;

            {
                this.f53556b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        xy xyVar = this.f53556b;
                        String str = xyVar.f47400y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.lc(xyVar.F.d.W1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f53556b.d();
                        return;
                    default:
                        this.f53556b.a();
                        return;
                }
            }
        }, false);
        G.c(2131232322, org.telegram.messenger.gd.M0(2131750456, null), new Runnable(this) {
            public final xy f53556b;

            {
                this.f53556b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        xy xyVar = this.f53556b;
                        String str = xyVar.f47400y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.lc(xyVar.F.d.W1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f53556b.d();
                        return;
                    default:
                        this.f53556b.a();
                        return;
                }
            }
        }, false);
        G.c(2131232110, org.telegram.messenger.gd.M0(2131751523, null), new Runnable(this) {
            public final xy f53556b;

            {
                this.f53556b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        xy xyVar = this.f53556b;
                        String str = xyVar.f47400y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.lc(xyVar.F.d.W1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f53556b.d();
                        return;
                    default:
                        this.f53556b.a();
                        return;
                }
            }
        }, true);
        if (org.telegram.messenger.gd.f24216a0) {
            G.f42356i = 3;
        }
        G.a0();
    }
}
