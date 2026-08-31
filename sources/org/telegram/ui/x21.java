package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class x21 implements Runnable {
    public final int f42944a;
    public final xn f42945b;
    public final Activity f42946c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final MessageObject f42947e;

    public x21(xn xnVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, MessageObject messageObject, int i10) {
        this.f42944a = i10;
        this.f42945b = xnVar;
        this.f42946c = activity;
        this.d = g6Var;
        this.f42947e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f42944a) {
            case 0:
                xn xnVar = this.f42945b;
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f42946c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                af.g.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                af.g.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                af.g.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.f42947e;
                xnVar.Fa(messageObject);
                xnVar.Ha(messageObject);
                return;
            case 1:
                xn xnVar2 = this.f42945b;
                org.telegram.ui.Components.qc a03 = org.telegram.ui.Components.qc.a0(xnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f42946c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                af.g.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                af.g.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                af.g.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.f42947e;
                xnVar2.Fa(messageObject2);
                xnVar2.Ha(messageObject2);
                return;
            default:
                xn xnVar3 = this.f42945b;
                org.telegram.ui.Components.qc a04 = org.telegram.ui.Components.qc.a0(xnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f42946c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                af.g.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                af.g.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                af.g.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.f42947e;
                xnVar3.Fa(messageObject3);
                xnVar3.Ha(messageObject3);
                return;
        }
    }
}
