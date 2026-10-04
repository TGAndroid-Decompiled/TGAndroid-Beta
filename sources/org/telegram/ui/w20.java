package org.telegram.ui;

import android.view.View;
public final class w20 implements View.OnClickListener {
    public final int f41891a;
    public final org.telegram.ui.Cells.a2[] f41892b;

    public w20(org.telegram.ui.Cells.a2[] a2VarArr, int i10) {
        this.f41891a = i10;
        this.f41892b = a2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41891a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.a2[] a2VarArr = this.f41892b;
                a2VarArr[intValue].c(!a2VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.a2 a2Var = this.f41892b[0];
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.a2 a2Var2 = this.f41892b[0];
                a2Var2.c(!a2Var2.b(), true);
                return;
        }
    }
}
