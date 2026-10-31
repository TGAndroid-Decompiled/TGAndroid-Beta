package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class u10 implements View.OnClickListener {
    public final int f41988a;
    public final org.telegram.ui.Cells.c2[] f41989b;

    public u10(org.telegram.ui.Cells.c2[] c2VarArr, int i10) {
        this.f41988a = i10;
        this.f41989b = c2VarArr;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f41988a;
        org.telegram.ui.Cells.c2[] c2VarArr = this.f41989b;
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
                RectF rectF = ProfileActivity.R6;
                org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                c2Var2.c(!c2Var2.b(), true);
                return;
        }
    }
}
