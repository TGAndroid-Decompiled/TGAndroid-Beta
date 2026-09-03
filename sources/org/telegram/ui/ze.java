package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
public final class ze implements Utilities.Callback {
    public final int f40457a;
    public final zn f40458b;

    public ze(zn znVar, int i10) {
        this.f40457a = i10;
        this.f40458b = znVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f40457a;
        zn znVar = this.f40458b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                zn znVar2 = this.f40458b;
                znVar2.f40555d5 = messageSuggestionParams;
                znVar2.f40666m5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                znVar2.yb(true, null, znVar2.f40666m5, null, null, null, false, true);
                return;
            case 1:
                znVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    znVar.finishFragment();
                    return;
                }
                return;
            case 2:
                znVar.da((String) obj, false);
                return;
            case 3:
                znVar.Db((MessageSuggestionParams) obj);
                return;
            case 4:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.w21 w21Var = znVar.O1;
                if (w21Var != null) {
                    w21Var.m(l10.longValue(), true);
                    return;
                }
                return;
            case 5:
                es esVar = znVar.f40511a0;
                esVar.f33845c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                return;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = zn.Ec;
                znVar.Ba(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = zn.Ec;
                znVar.Ba(intValue2);
                return;
        }
    }
}
