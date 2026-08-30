package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class v21 implements Runnable {
    public final int f39067a;
    public final xn f39068b;
    public final Activity f39069c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final MessageObject e;

    public v21(xn xnVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.f39067a = i10;
        this.f39068b = xnVar;
        this.f39069c = activity;
        this.d = f6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f39067a) {
            case 0:
                xn xnVar = this.f39068b;
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f39069c;
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
                MessageObject messageObject = this.e;
                xnVar.Fa(messageObject);
                xnVar.Ha(messageObject);
                return;
            case 1:
                xn xnVar2 = this.f39068b;
                org.telegram.ui.Components.qc a03 = org.telegram.ui.Components.qc.a0(xnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f39069c;
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
                MessageObject messageObject2 = this.e;
                xnVar2.Fa(messageObject2);
                xnVar2.Ha(messageObject2);
                return;
            default:
                xn xnVar3 = this.f39068b;
                org.telegram.ui.Components.qc a04 = org.telegram.ui.Components.qc.a0(xnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f39069c;
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
                MessageObject messageObject3 = this.e;
                xnVar3.Fa(messageObject3);
                xnVar3.Ha(messageObject3);
                return;
        }
    }
}
