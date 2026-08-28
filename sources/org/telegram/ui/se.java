package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
public final class se implements Utilities.Callback {
    public final int f42672a;
    public final qn f42673b;

    public se(qn qnVar, int i9) {
        this.f42672a = i9;
        this.f42673b = qnVar;
    }

    @Override
    public final void run(Object obj) {
        int i9 = this.f42672a;
        qn qnVar = this.f42673b;
        switch (i9) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                qn qnVar2 = this.f42673b;
                qnVar2.f41870c5 = messageSuggestionParams;
                qnVar2.f41982l5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                qnVar2.yb(true, null, qnVar2.f41982l5, null, null, null, false, true);
                return;
            case 1:
                qnVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    qnVar.finishFragment();
                    return;
                }
                return;
            case 2:
                qnVar.da((String) obj, false);
                return;
            case 3:
                qnVar.Db((MessageSuggestionParams) obj);
                return;
            case 4:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.b21 b21Var = qnVar.N1;
                if (b21Var != null) {
                    b21Var.m(l10.longValue(), true);
                    return;
                }
                return;
            case 5:
                wr wrVar = qnVar.Z;
                wrVar.f44250c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                return;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i10 = qn.Dc;
                qnVar.Ba(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = qn.Dc;
                qnVar.Ba(intValue2);
                return;
        }
    }
}
