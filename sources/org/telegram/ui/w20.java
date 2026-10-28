package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class w20 extends s4.n0 {
    public final x50 f44498a;

    public w20(x50 x50Var) {
        this.f44498a = x50Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        int i10;
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            r50 r50Var = this.f44498a.P;
            int i11 = r50Var.G;
            if (R >= i11 && R < r50Var.H) {
                int i12 = R - i11;
                if (x50.F3) {
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
