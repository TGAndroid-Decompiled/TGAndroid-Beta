package org.telegram.ui;

import android.view.View;
public final class w20 implements View.OnClickListener {
    public final int f43028a;
    public final org.telegram.ui.Cells.a2[] f43029b;

    public w20(org.telegram.ui.Cells.a2[] a2VarArr, int i10) {
        this.f43028a = i10;
        this.f43029b = a2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43028a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.a2[] a2VarArr = this.f43029b;
                a2VarArr[intValue].c(!a2VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.a2 a2Var = this.f43029b[0];
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.a2 a2Var2 = this.f43029b[0];
                a2Var2.c(!a2Var2.b(), true);
                return;
        }
    }
}
