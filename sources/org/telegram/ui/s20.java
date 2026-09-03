package org.telegram.ui;

import android.view.View;
public final class s20 implements View.OnClickListener {
    public final int f38090a;
    public final org.telegram.ui.Cells.y1[] f38091b;

    public s20(org.telegram.ui.Cells.y1[] y1VarArr, int i10) {
        this.f38090a = i10;
        this.f38091b = y1VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38090a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.y1[] y1VarArr = this.f38091b;
                y1VarArr[intValue].c(!y1VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.y1 y1Var = this.f38091b[0];
                y1Var.c(!y1Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.y1 y1Var2 = this.f38091b[0];
                y1Var2.c(!y1Var2.b(), true);
                return;
        }
    }
}
