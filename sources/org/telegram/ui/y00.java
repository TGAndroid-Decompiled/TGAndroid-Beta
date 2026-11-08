package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class y00 implements View.OnClickListener {
    public final int f52028a;
    public final org.telegram.ui.Cells.c2[] f52029b;

    public y00(org.telegram.ui.Cells.c2[] c2VarArr, int i7) {
        this.f52028a = i7;
        this.f52029b = c2VarArr;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f52028a;
        org.telegram.ui.Cells.c2[] c2VarArr = this.f52029b;
        switch (i7) {
            case 0:
                Integer num = (Integer) view.getTag();
                c2VarArr[num.intValue()].c(!c2VarArr[num.intValue()].b(), true);
                return;
            case 1:
                org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                RectF rectF = ProfileActivity.S6;
                org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                c2Var2.c(!c2Var2.b(), true);
                return;
        }
    }
}
