package org.telegram.ui;

import android.view.View;
public final class u20 implements View.OnClickListener {
    public final int f42355a;
    public final org.telegram.ui.Cells.a2[] f42356b;

    public u20(org.telegram.ui.Cells.a2[] a2VarArr, int i10) {
        this.f42355a = i10;
        this.f42356b = a2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42355a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.a2[] a2VarArr = this.f42356b;
                a2VarArr[intValue].c(!a2VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.a2 a2Var = this.f42356b[0];
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.a2 a2Var2 = this.f42356b[0];
                a2Var2.c(!a2Var2.b(), true);
                return;
        }
    }
}
