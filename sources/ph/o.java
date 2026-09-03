package ph;

import android.widget.FrameLayout;
import android.widget.ImageView;
import eg.p1;
import hg.v0;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.web.d1;
public final class o extends sa {
    public final int U;
    public final CharSequence V;
    public w51 W;

    public o(p2 p2Var, String str, d1 d1Var) {
        super(p2Var.getParentActivity(), p2Var, true, false, false, 1, p2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.U = p2Var.getCurrentAccount();
        this.V = str;
        N();
        this.v = 0.6f;
        this.f31022y = true;
        this.B = true;
        fixNavigationBar();
        J();
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new v0(23, this, d1Var));
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(sl0Var, getContext(), this.U, 0, false, new p1(this, 25), this.resourcesProvider);
        this.W = w51Var;
        w51Var.f32651r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return this.V;
    }
}
