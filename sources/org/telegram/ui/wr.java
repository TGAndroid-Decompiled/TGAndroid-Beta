package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class wr implements Runnable {
    public final int f42948a;
    public final fs f42949b;
    public final TLRPC.User f42950c;

    public wr(fs fsVar, TLRPC.User user, int i10) {
        this.f42948a = i10;
        this.f42949b = fsVar;
        this.f42950c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f42948a) {
            case 0:
                fs fsVar = this.f42949b;
                TLRPC.User user = this.f42950c;
                if (user != null && fsVar.M == null && fsVar.N == null) {
                    if (user.phone == null && (str = fsVar.L) != null) {
                        user.phone = jf.b.d(str, false);
                    }
                    fsVar.f37072b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = fsVar.f37072b.f22406b;
                    g3Var.setSelection(g3Var.length());
                    fsVar.f37073c.setText(user.last_name);
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
                    fsVar.d.f22406b.requestFocus();
                    AndroidUtilities.showKeyboard(fsVar.d.f22406b);
                    return;
                }
                return;
            default:
                fs.V(this.f42949b, this.f42950c);
                return;
        }
    }
}
