package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class wr implements Runnable {
    public final int f42947a;
    public final fs f42948b;
    public final TLRPC.User f42949c;

    public wr(fs fsVar, TLRPC.User user, int i10) {
        this.f42947a = i10;
        this.f42948b = fsVar;
        this.f42949c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f42947a) {
            case 0:
                fs fsVar = this.f42948b;
                TLRPC.User user = this.f42949c;
                if (user != null && fsVar.M == null && fsVar.N == null) {
                    if (user.phone == null && (str = fsVar.L) != null) {
                        user.phone = jf.b.d(str, false);
                    }
                    fsVar.f37071b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = fsVar.f37071b.f22405b;
                    g3Var.setSelection(g3Var.length());
                    fsVar.f37072c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = fsVar.getMessagesController().getUserFull(fsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        fsVar.d.setText(tL_textWithEntities);
                    } else {
                        fsVar.d.setText("");
                    }
                }
                if (fsVar.J) {
                    fsVar.d.f22405b.requestFocus();
                    AndroidUtilities.showKeyboard(fsVar.d.f22405b);
                    return;
                }
                return;
            default:
                fs.V(this.f42948b, this.f42949c);
                return;
        }
    }
}
