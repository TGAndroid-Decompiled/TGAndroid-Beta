package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class yr implements Runnable {
    public final int f43470a;
    public final hs f43471b;
    public final TLRPC.User f43472c;

    public yr(hs hsVar, TLRPC.User user, int i10) {
        this.f43470a = i10;
        this.f43471b = hsVar;
        this.f43472c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f43470a) {
            case 0:
                hs hsVar = this.f43471b;
                TLRPC.User user = this.f43472c;
                if (user != null && hsVar.M == null && hsVar.N == null) {
                    if (user.phone == null && (str = hsVar.L) != null) {
                        user.phone = jf.b.d(str, false);
                    }
                    hsVar.f37619b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = hsVar.f37619b.f22401b;
                    g3Var.setSelection(g3Var.length());
                    hsVar.f37620c.setText(user.last_name);
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
                    hsVar.d.f22401b.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.f22401b);
                    return;
                }
                return;
            default:
                hs.V(this.f43471b, this.f43472c);
                return;
        }
    }
}
