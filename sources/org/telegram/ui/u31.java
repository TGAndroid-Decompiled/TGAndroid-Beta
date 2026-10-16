package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class u31 implements Runnable {
    public final int f40254a;
    public final fo f40255b;
    public final Activity f40256c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final MessageObject e;

    public u31(fo foVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.f40254a = i10;
        this.f40255b = foVar;
        this.f40256c = activity;
        this.d = c6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f40254a) {
            case 0:
                fo foVar = this.f40255b;
                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(foVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f40256c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                foVar.Ja(messageObject);
                foVar.La(messageObject);
                return;
            case 1:
                fo foVar2 = this.f40255b;
                org.telegram.ui.Components.zc a03 = org.telegram.ui.Components.zc.a0(foVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f40256c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                foVar2.Ja(messageObject2);
                foVar2.La(messageObject2);
                return;
            default:
                fo foVar3 = this.f40255b;
                org.telegram.ui.Components.zc a04 = org.telegram.ui.Components.zc.a0(foVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f40256c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                foVar3.Ja(messageObject3);
                foVar3.La(messageObject3);
                return;
        }
    }
}
