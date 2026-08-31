package org.telegram.ui;

import android.view.View;
public final class r20 implements View.OnClickListener {
    public final int f40754a;
    public final org.telegram.ui.Cells.z1[] f40755b;

    public r20(org.telegram.ui.Cells.z1[] z1VarArr, int i10) {
        this.f40754a = i10;
        this.f40755b = z1VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40754a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.z1[] z1VarArr = this.f40755b;
                z1VarArr[intValue].c(!z1VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.z1 z1Var = this.f40755b[0];
                z1Var.c(!z1Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.z1 z1Var2 = this.f40755b[0];
                z1Var2.c(!z1Var2.b(), true);
                return;
        }
    }
}
