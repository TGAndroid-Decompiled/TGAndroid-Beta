package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
public final class u00 extends e10 {
    public final v00 E;

    public u00(v00 v00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = v00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        v00 v00Var = this.E;
        v00Var.d.Y.remove(tL_exportedChatlistInvite);
        v00Var.d.U();
        v00Var.d.V(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.m80 F = org.telegram.ui.Components.m80.F(this.E.d.container, null, this);
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
            public final u00 f40258b;

            {
                this.f40258b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u00 u00Var = this.f40258b;
                        String str = u00Var.f35433x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.zc(u00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f40258b.d();
                        return;
                    default:
                        this.f40258b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {
            public final u00 f40258b;

            {
                this.f40258b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u00 u00Var = this.f40258b;
                        String str = u00Var.f35433x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.zc(u00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f40258b.d();
                        return;
                    default:
                        this.f40258b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {
            public final u00 f40258b;

            {
                this.f40258b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u00 u00Var = this.f40258b;
                        String str = u00Var.f35433x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.zc(u00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f40258b.d();
                        return;
                    default:
                        this.f40258b.a();
                        return;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            F.f27280i = 3;
        }
        F.Z();
    }
}
