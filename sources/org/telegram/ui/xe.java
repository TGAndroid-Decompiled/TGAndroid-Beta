package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
public final class xe implements Utilities.Callback {
    public final int f43038a;
    public final xn f43039b;

    public xe(xn xnVar, int i10) {
        this.f43038a = i10;
        this.f43039b = xnVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f43038a;
        xn xnVar = this.f43039b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                xn xnVar2 = this.f43039b;
                xnVar2.f43157d5 = messageSuggestionParams;
                xnVar2.f43269m5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                xnVar2.yb(true, null, xnVar2.f43269m5, null, null, null, false, true);
                return;
            case 1:
                xnVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    xnVar.finishFragment();
                    return;
                }
                return;
            case 2:
                xnVar.da((String) obj, false);
                return;
            case 3:
                xnVar.Db((MessageSuggestionParams) obj);
                return;
            case 4:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.x21 x21Var = xnVar.O1;
                if (x21Var != null) {
                    x21Var.m(l10.longValue(), true);
                    return;
                }
                return;
            case 5:
                ds dsVar = xnVar.f43113a0;
                dsVar.f36294c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                return;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = xn.Ec;
                xnVar.Ba(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = xn.Ec;
                xnVar.Ba(intValue2);
                return;
        }
    }
}
