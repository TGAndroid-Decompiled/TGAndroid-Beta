package yf;

import android.view.View;
import gh.y8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.xs0;
public final class k implements View.OnClickListener {
    public final int f49895a;
    public final l0 f49896b;

    public k(l0 l0Var, int i9) {
        this.f49895a = i9;
        this.f49896b = l0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49895a) {
            case 0:
                l0 l0Var = this.f49896b;
                if (l0Var.P0) {
                    l0Var.r0(null, true);
                    return;
                } else {
                    l0Var.B0(0);
                    return;
                }
            case 1:
                l0 l0Var2 = this.f49896b;
                int i9 = l0Var2.f49930c1;
                l0Var2.B0(1);
                l0Var2.postDelayed(new n(l0Var2, 1), 350L);
                kh.n2 n2Var = new kh.n2(l0Var2.getContext(), l0Var2.M1, false, false);
                n2Var.f15742y = new q(l0Var2);
                n2Var.p0(new dg.o(l0Var2, 5));
                n2Var.setOnDismissListener(new y8(l0Var2, i9));
                n2Var.show();
                PhotoViewer photoViewer = ((xs0) l0Var2).f44585k2;
                if (photoViewer.B2 != null) {
                    photoViewer.D2 = false;
                    photoViewer.t0();
                    photoViewer.B2.C();
                    return;
                }
                return;
            case 2:
                l0 l0Var3 = this.f49896b;
                j jVar = l0Var3.O0;
                if ((jVar instanceof v2) && !l0Var3.P0) {
                    v2 v2Var = (v2) jVar;
                    l0Var3.P0 = true;
                    v2Var.q();
                    View focusedView = v2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.o1 o1Var = l0Var3.N1;
                if (o1Var != null && o1Var.isShowing()) {
                    l0Var3.N1.d(true);
                    return;
                }
                return;
            case 3:
                l0.b0(this.f49896b);
                return;
            default:
                l0 l0Var4 = this.f49896b;
                l0Var4.B0(2);
                if (!(l0Var4.O0 instanceof v2)) {
                    l0Var4.j0(true);
                    return;
                }
                return;
        }
    }
}
