package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
public final class xz extends g00 {
    public final yz E;

    public xz(yz yzVar, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = yzVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        yz yzVar = this.E;
        yzVar.d.Y.remove(tL_exportedChatlistInvite);
        yzVar.d.U();
        yzVar.d.V(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.i80 F = org.telegram.ui.Components.i80.F(this.E.d.container, null, this);
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
            public final xz f42974b;

            {
                this.f42974b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        xz xzVar = this.f42974b;
                        String str = xzVar.f37161x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(xzVar.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f42974b.d();
                        return;
                    default:
                        this.f42974b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {
            public final xz f42974b;

            {
                this.f42974b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        xz xzVar = this.f42974b;
                        String str = xzVar.f37161x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(xzVar.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f42974b.d();
                        return;
                    default:
                        this.f42974b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {
            public final xz f42974b;

            {
                this.f42974b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        xz xzVar = this.f42974b;
                        String str = xzVar.f37161x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(xzVar.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f42974b.d();
                        return;
                    default:
                        this.f42974b.a();
                        return;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            F.f27118i = 3;
        }
        F.Z();
    }
}
