package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

public final class se implements Utilities.Callback {

    public final int f42602a;

    public final rn f42603b;

    public se(rn rnVar, int i10) {
        this.f42602a = i10;
        this.f42603b = rnVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f42602a;
        rn rnVar = this.f42603b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                rn rnVar2 = this.f42603b;
                rnVar2.f42006c5 = messageSuggestionParams;
                rnVar2.f42119l5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                rnVar2.yb(true, null, rnVar2.f42119l5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
                rnVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    rnVar.finishFragment();
                }
                break;
            case 2:
                rnVar.da((String) obj, false);
                break;
            case 3:
                rnVar.Db((MessageSuggestionParams) obj);
                break;
            case 4:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.d21 d21Var = rnVar.N1;
                if (d21Var != null) {
                    d21Var.m(l10.longValue(), true);
                }
                break;
            case 5:
                xr xrVar = rnVar.Z;
                xrVar.f44599c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                break;
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                int i11 = rn.Dc;
                rnVar.Ba(iIntValue);
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                int i12 = rn.Dc;
                rnVar.Ba(iIntValue2);
                break;
        }
    }
}
