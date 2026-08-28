package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class zr implements Runnable {
    public final int f45238a;
    public final is f45239b;
    public final TLRPC.User f45240c;

    public zr(is isVar, TLRPC.User user, int i9) {
        this.f45238a = i9;
        this.f45239b = isVar;
        this.f45240c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f45238a) {
            case 0:
                is isVar = this.f45239b;
                TLRPC.User user = this.f45240c;
                if (user != null && isVar.I == null && isVar.J == null) {
                    if (user.phone == null && (str = isVar.H) != null) {
                        user.phone = ne.b.d(str, false);
                    }
                    isVar.f39270b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = isVar.f39270b.f24544b;
                    h3Var.setSelection(h3Var.length());
                    isVar.f39271c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = isVar.getMessagesController().getUserFull(isVar.D);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        isVar.d.setText(tL_textWithEntities);
                    } else {
                        isVar.d.setText("");
                    }
                }
                if (isVar.F) {
                    isVar.d.f24544b.requestFocus();
                    AndroidUtilities.showKeyboard(isVar.d.f24544b);
                    return;
                }
                return;
            default:
                is.U(this.f45239b, this.f45240c);
                return;
        }
    }
}
