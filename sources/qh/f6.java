package qh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f6 implements View.OnFocusChangeListener {
    public final i6 f45344a;

    public f6(i6 i6Var) {
        this.f45344a = i6Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            i6 i6Var = this.f45344a;
            i6Var.f45471f0 = true;
            xh.o oVar = new xh.o(i6Var.getContext(), 2);
            oVar.f5805a = 1;
            oVar.f50695p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((f2.j0) i6Var.d.getLayoutManager()).w0(oVar);
        }
    }
}
