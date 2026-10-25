package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class u20 extends s4.n0 {
    public final v50 f43980a;

    public u20(v50 v50Var) {
        this.f43980a = v50Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        int i10;
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            p50 p50Var = this.f43980a.P;
            int i11 = p50Var.G;
            if (R >= i11 && R < p50Var.H) {
                int i12 = R - i11;
                if (v50.F3) {
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
