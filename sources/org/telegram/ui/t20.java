package org.telegram.ui;

import android.view.View;
public final class t20 implements View.OnClickListener {
    public final int f37508a;
    public final org.telegram.ui.Cells.z1[] f37509b;

    public t20(org.telegram.ui.Cells.z1[] z1VarArr, int i10) {
        this.f37508a = i10;
        this.f37509b = z1VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37508a) {
            case 0:
                Integer num = (Integer) view.getTag();
                int intValue = num.intValue();
                org.telegram.ui.Cells.z1[] z1VarArr = this.f37509b;
                z1VarArr[intValue].c(!z1VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.z1 z1Var = this.f37509b[0];
                z1Var.c(!z1Var.b(), true);
                return;
            default:
                org.telegram.ui.Cells.z1 z1Var2 = this.f37509b[0];
                z1Var2.c(!z1Var2.b(), true);
                return;
        }
    }
}
