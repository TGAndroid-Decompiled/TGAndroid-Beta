package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class t10 implements View.OnClickListener {
    public final int f41509a;
    public final org.telegram.ui.Cells.c2[] f41510b;

    public t10(org.telegram.ui.Cells.c2[] c2VarArr, int i10) {
        this.f41509a = i10;
        this.f41510b = c2VarArr;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f41509a;
        org.telegram.ui.Cells.c2[] c2VarArr = this.f41510b;
        switch (i10) {
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
