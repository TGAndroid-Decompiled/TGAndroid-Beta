package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class r20 extends f2.v0 {
    public final r50 f41845a;

    public r20(r50 r50Var) {
        this.f41845a = r50Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        int i10;
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            l50 l50Var = this.f41845a.L;
            int i11 = l50Var.C;
            if (R >= i11 && R < l50Var.D) {
                int i12 = R - i11;
                if (r50.B3) {
                    i10 = 6;
                } else {
                    i10 = 2;
                }
                int i13 = i12 % i10;
                if (i13 == 0) {
                    rect.right = AndroidUtilities.dp(2.0f);
                } else if (i13 == i10 - 1) {
                    rect.left = AndroidUtilities.dp(2.0f);
                } else {
                    rect.left = AndroidUtilities.dp(1.0f);
                }
            }
        }
    }
}
