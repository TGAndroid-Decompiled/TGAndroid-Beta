package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class yr implements Runnable {
    public final int f44957a;
    public final hs f44958b;
    public final TLRPC.User f44959c;

    public yr(hs hsVar, TLRPC.User user, int i10) {
        this.f44957a = i10;
        this.f44958b = hsVar;
        this.f44959c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f44957a) {
            case 0:
                hs hsVar = this.f44958b;
                TLRPC.User user = this.f44959c;
                if (user != null && hsVar.I == null && hsVar.J == null) {
                    if (user.phone == null && (str = hsVar.H) != null) {
                        user.phone = qe.b.d(str, false);
                    }
                    hsVar.f39004b.setText(user.first_name);
                    org.telegram.ui.Cells.e3 e3Var = hsVar.f39004b.f24387b;
                    e3Var.setSelection(e3Var.length());
                    hsVar.f39005c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = hsVar.getMessagesController().getUserFull(hsVar.D);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        hsVar.d.setText(tL_textWithEntities);
                    } else {
                        hsVar.d.setText("");
                    }
                }
                if (hsVar.F) {
                    hsVar.d.f24387b.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.f24387b);
                    return;
                }
                return;
            default:
                hs.V(this.f44958b, this.f44959c);
                return;
        }
    }
}
