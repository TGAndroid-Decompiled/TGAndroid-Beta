package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class zf implements View.OnClickListener {
    public final int f44649a;
    public final zn f44650b;
    public final ArrayList f44651c;

    public zf(zn znVar, ArrayList arrayList, int i10) {
        this.f44649a = i10;
        this.f44650b = znVar;
        this.f44651c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44649a) {
            case 0:
                zn znVar = this.f44650b;
                qi qiVar = new qi(znVar, znVar, znVar.getParentActivity(), znVar.f44762ea, this.f44651c);
                qiVar.setCalcMandatoryInsets(znVar.C9());
                qiVar.setDimBehind(false);
                znVar.D7(false);
                znVar.showDialog(qiVar);
                return;
            default:
                zn znVar2 = this.f44650b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.jw(znVar2, znVar2.getParentActivity(), znVar2.f44762ea, this.f44651c).show();
                    znVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
