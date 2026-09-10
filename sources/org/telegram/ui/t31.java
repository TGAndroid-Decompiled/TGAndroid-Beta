package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class t31 implements Runnable {
    public final int f36830a;
    public final eo f36831b;
    public final Activity f36832c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final MessageObject e;

    public t31(eo eoVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.f36830a = i10;
        this.f36831b = eoVar;
        this.f36832c = activity;
        this.d = f6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f36830a) {
            case 0:
                eo eoVar = this.f36831b;
                org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(eoVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f36832c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                eoVar.Fa(messageObject);
                eoVar.Ha(messageObject);
                return;
            case 1:
                eo eoVar2 = this.f36831b;
                org.telegram.ui.Components.wc a03 = org.telegram.ui.Components.wc.a0(eoVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f36832c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                eoVar2.Fa(messageObject2);
                eoVar2.Ha(messageObject2);
                return;
            default:
                eo eoVar3 = this.f36831b;
                org.telegram.ui.Components.wc a04 = org.telegram.ui.Components.wc.a0(eoVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f36832c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                eoVar3.Fa(messageObject3);
                eoVar3.Ha(messageObject3);
                return;
        }
    }
}
