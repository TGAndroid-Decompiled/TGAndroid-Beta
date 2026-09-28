package org.telegram.ui;

import android.view.View;
public final class r20 implements View.OnClickListener {
    public final int f37172a;
    public final org.telegram.ui.Cells.a2[] f37173b;

    public r20(org.telegram.ui.Cells.a2[] a2VarArr, int i10) {
        this.f37172a = i10;
        this.f37173b = a2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37172a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.a2[] a2VarArr = this.f37173b;
                a2VarArr[intValue].c(!a2VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.a2 a2Var = this.f37173b[0];
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.a2 a2Var2 = this.f37173b[0];
                a2Var2.c(!a2Var2.b(), true);
                return;
        }
    }
}
