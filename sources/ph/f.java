package ph;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.j1;
import f2.v0;
import org.telegram.ui.Cells.r7;
public final class f extends v0 {
    public final int f44380a;
    public final l f44381b;

    public f(l lVar, int i10) {
        this.f44380a = i10;
        this.f44381b = lVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, j1 j1Var) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f44380a) {
            case 0:
                if (view instanceof r7) {
                    r7 r7Var = (r7) view;
                    l lVar = this.f44381b;
                    lVar.f44395f.getClass();
                    int R = RecyclerView.R(r7Var);
                    int i10 = lVar.h.J;
                    boolean z13 = true;
                    if (R < i10) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    r7Var.U = z4;
                    int i11 = R % i10;
                    if (i11 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r7Var.S = z10;
                    if (i11 != i10 - 1) {
                        z13 = false;
                    }
                    r7Var.T = z13;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    return;
                }
                rect.left = 0;
                rect.top = 0;
                rect.bottom = 0;
                rect.right = 0;
                return;
            default:
                if (view instanceof r7) {
                    r7 r7Var2 = (r7) view;
                    l lVar2 = this.f44381b;
                    lVar2.f44397r.getClass();
                    int R2 = RecyclerView.R(r7Var2);
                    int i12 = lVar2.f44398s.J;
                    boolean z14 = true;
                    if (R2 < i12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r7Var2.U = z11;
                    int i13 = R2 % i12;
                    if (i13 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    r7Var2.S = z12;
                    if (i13 != i12 - 1) {
                        z14 = false;
                    }
                    r7Var2.T = z14;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    return;
                }
                rect.left = 0;
                rect.top = 0;
                rect.bottom = 0;
                rect.right = 0;
                return;
        }
    }
}
