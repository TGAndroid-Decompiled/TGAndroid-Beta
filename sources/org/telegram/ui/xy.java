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
        org.telegram.ui.Components.a70 G = org.telegram.ui.Components.a70.G(this.F.d.f30145c, null, this);
        G.c(2131232105, org.telegram.messenger.hd.N0(2131751750, null), new Runnable(this) {
            public final xy f53474b;

            {
                this.f53474b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        xy xyVar = this.f53474b;
                        String str = xyVar.f47390y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.lc(xyVar.F.d.W1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f53474b.d();
                        return;
                    default:
                        this.f53474b.a();
                        return;
                }
            }
        }, false);
        G.c(2131232322, org.telegram.messenger.hd.N0(2131750455, null), new Runnable(this) {
            public final xy f53474b;

            {
                this.f53474b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        xy xyVar = this.f53474b;
                        String str = xyVar.f47390y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.lc(xyVar.F.d.W1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f53474b.d();
                        return;
                    default:
                        this.f53474b.a();
                        return;
                }
            }
        }, false);
        G.c(2131232110, org.telegram.messenger.hd.N0(2131751522, null), new Runnable(this) {
            public final xy f53474b;

            {
                this.f53474b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        xy xyVar = this.f53474b;
                        String str = xyVar.f47390y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.lc(xyVar.F.d.W1, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f53474b.d();
                        return;
                    default:
                        this.f53474b.a();
                        return;
                }
            }
        }, true);
        if (org.telegram.messenger.hd.f24408a0) {
            G.f33344i = 3;
        }
        G.a0();
    }
}
