package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
public final class zz extends i00 {
    public final a00 E;

    public zz(a00 a00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = a00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        a00 a00Var = this.E;
        a00Var.d.Y.remove(tL_exportedChatlistInvite);
        a00Var.d.U();
        a00Var.d.V(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.i80 F = org.telegram.ui.Components.i80.F(this.E.d.container, null, this);
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
            public final zz f43531b;

            {
                this.f43531b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        zz zzVar = this.f43531b;
                        String str = zzVar.f37726x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(zzVar.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f43531b.d();
                        return;
                    default:
                        this.f43531b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {
            public final zz f43531b;

            {
                this.f43531b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        zz zzVar = this.f43531b;
                        String str = zzVar.f37726x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(zzVar.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f43531b.d();
                        return;
                    default:
                        this.f43531b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {
            public final zz f43531b;

            {
                this.f43531b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        zz zzVar = this.f43531b;
                        String str = zzVar.f37726x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(zzVar.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f43531b.d();
                        return;
                    default:
                        this.f43531b.a();
                        return;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            F.f27123i = 3;
        }
        F.Z();
    }
}
