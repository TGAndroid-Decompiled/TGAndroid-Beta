package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
public final class xz extends g00 {
    public final yz A;

    public xz(yz yzVar, Context context, int i9, int i10) {
        super(context, null, i9, i10);
        this.A = yzVar;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        yz yzVar = this.A;
        yzVar.d.U.remove(tL_exportedChatlistInvite);
        yzVar.d.S();
        yzVar.d.T(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.x60 F = org.telegram.ui.Components.x60.F(this.A.d.container, null, this);
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
            public final xz f44283b;

            {
                this.f44283b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        xz xzVar = this.f44283b;
                        String str = xzVar.f38400x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.oc(xzVar.A.d.V, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f44283b.d();
                        return;
                    default:
                        this.f44283b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {
            public final xz f44283b;

            {
                this.f44283b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        xz xzVar = this.f44283b;
                        String str = xzVar.f38400x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.oc(xzVar.A.d.V, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f44283b.d();
                        return;
                    default:
                        this.f44283b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {
            public final xz f44283b;

            {
                this.f44283b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        xz xzVar = this.f44283b;
                        String str = xzVar.f38400x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.oc(xzVar.A.d.V, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f44283b.d();
                        return;
                    default:
                        this.f44283b.a();
                        return;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            F.f34562i = 3;
        }
        F.Z();
    }
}
