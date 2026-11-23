package org.telegram.ui;

import android.content.Context;
public final class tw implements Runnable {
    public final int f52487a;
    public final uw f52488b;

    public tw(uw uwVar, int i7) {
        this.f52487a = i7;
        this.f52488b = uwVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f52487a) {
            case 0:
                uw uwVar = this.f52488b;
                bx bxVar = uwVar.f52741o0;
                Context context = uwVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                bxVar.showDialog(new ug.k0(3, i7, context, bxVar, null));
                return;
            default:
                bx bxVar2 = this.f52488b.f52741o0;
                yv yvVar = bxVar2.N0;
                if (yvVar != null) {
                    yvVar.dismiss();
                    bxVar2.N0 = null;
                    return;
                }
                return;
        }
    }
}
