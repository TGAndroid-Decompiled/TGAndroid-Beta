package zf;

import android.view.View;
import hh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ys0;

public final class k implements View.OnClickListener {

    public final int f50474a;

    public final l0 f50475b;

    public k(l0 l0Var, int i10) {
        this.f50474a = i10;
        this.f50475b = l0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50474a) {
            case 0:
                l0 l0Var = this.f50475b;
                if (!l0Var.P0) {
                    l0Var.B0(0);
                } else {
                    l0Var.r0(null, true);
                }
                break;
            case 1:
                l0 l0Var2 = this.f50475b;
                int i10 = l0Var2.f50508c1;
                l0Var2.B0(1);
                l0Var2.postDelayed(new n(l0Var2, 1), 350L);
                v vVar = new v(l0Var2.getContext(), l0Var2.M1, false, false);
                vVar.f16294y = new q(l0Var2);
                vVar.q0(new eg.o(l0Var2, 5));
                vVar.setOnDismissListener(new x8(l0Var2, i10));
                vVar.show();
                PhotoViewer photoViewer = ((ys0) l0Var2).f44893k2;
                if (photoViewer.B2 != null) {
                    photoViewer.D2 = false;
                    photoViewer.u0();
                    photoViewer.B2.C();
                    break;
                }
                break;
            case 2:
                l0 l0Var3 = this.f50475b;
                j jVar = l0Var3.O0;
                if ((jVar instanceof v2) && !l0Var3.P0) {
                    v2 v2Var = (v2) jVar;
                    l0Var3.P0 = true;
                    v2Var.q();
                    View focusedView = v2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.n1 n1Var = l0Var3.N1;
                if (n1Var != null && n1Var.isShowing()) {
                    l0Var3.N1.d(true);
                    break;
                }
                break;
            case 3:
                l0.b0(this.f50475b);
                break;
            default:
                l0 l0Var4 = this.f50475b;
                l0Var4.B0(2);
                if (!(l0Var4.O0 instanceof v2)) {
                    l0Var4.j0(true);
                }
                break;
        }
    }
}
