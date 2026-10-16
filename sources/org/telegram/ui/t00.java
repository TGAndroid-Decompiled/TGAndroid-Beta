package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
public final class t00 extends d10 {
    public final u00 E;

    public t00(u00 u00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = u00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        u00 u00Var = this.E;
        u00Var.d.Y.remove(tL_exportedChatlistInvite);
        u00Var.d.U();
        u00Var.d.V(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.l80 F = org.telegram.ui.Components.l80.F(this.E.d.container, null, this);
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
            public final t00 f39638b;

            {
                this.f39638b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        t00 t00Var = this.f39638b;
                        String str = t00Var.f34838x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.zc(t00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f39638b.d();
                        return;
                    default:
                        this.f39638b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {
            public final t00 f39638b;

            {
                this.f39638b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        t00 t00Var = this.f39638b;
                        String str = t00Var.f34838x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.zc(t00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f39638b.d();
                        return;
                    default:
                        this.f39638b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {
            public final t00 f39638b;

            {
                this.f39638b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        t00 t00Var = this.f39638b;
                        String str = t00Var.f34838x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.zc(t00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f39638b.d();
                        return;
                    default:
                        this.f39638b.a();
                        return;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            F.f26650i = 3;
        }
        F.Z();
    }
}
