package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class yr implements Runnable {
    public final int f43496a;
    public final hs f43497b;
    public final TLRPC.User f43498c;

    public yr(hs hsVar, TLRPC.User user, int i10) {
        this.f43496a = i10;
        this.f43497b = hsVar;
        this.f43498c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f43496a) {
            case 0:
                hs hsVar = this.f43497b;
                TLRPC.User user = this.f43498c;
                if (user != null && hsVar.M == null && hsVar.N == null) {
                    if (user.phone == null && (str = hsVar.L) != null) {
                        user.phone = jf.b.d(str, false);
                    }
                    hsVar.f37632b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = hsVar.f37632b.f22405b;
                    g3Var.setSelection(g3Var.length());
                    hsVar.f37633c.setText(user.last_name);
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
                    hsVar.d.f22405b.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.f22405b);
                    return;
                }
                return;
            default:
                hs.V(this.f43497b, this.f43498c);
                return;
        }
    }
}
