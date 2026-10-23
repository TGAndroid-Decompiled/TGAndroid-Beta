package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class zr implements Runnable {
    public final int f44193a;
    public final hs f44194b;
    public final TLRPC.User f44195c;

    public zr(hs hsVar, TLRPC.User user, int i10) {
        this.f44193a = i10;
        this.f44194b = hsVar;
        this.f44195c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f44193a) {
            case 0:
                hs hsVar = this.f44194b;
                TLRPC.User user = this.f44195c;
                if (user != null && hsVar.M == null && hsVar.N == null) {
                    if (user.phone == null && (str = hsVar.L) != null) {
                        user.phone = jf.b.d(str, false);
                    }
                    hsVar.f37919b.setText(user.first_name);
                    org.telegram.ui.Cells.f3 f3Var = hsVar.f37919b.d;
                    f3Var.setSelection(f3Var.length());
                    hsVar.f37920c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = hsVar.getMessagesController().getUserFull(hsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        hsVar.d.setText(tL_textWithEntities);
                    } else {
                        hsVar.d.setText("");
                    }
                }
                if (hsVar.J) {
                    hsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.d);
                    return;
                }
                return;
            default:
                hs.V(this.f44194b, this.f44195c);
                return;
        }
    }
}
