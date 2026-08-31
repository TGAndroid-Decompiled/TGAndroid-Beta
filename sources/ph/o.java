package ph;

import android.widget.FrameLayout;
import android.widget.ImageView;
import eg.p1;
import hg.v0;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.web.d1;
public final class o extends sa {
    public final int U;
    public final CharSequence V;
    public x51 W;

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
        tl0 tl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new v0(23, this, d1Var));
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(tl0Var, getContext(), this.U, 0, false, new p1(this, 25), this.resourcesProvider);
        this.W = x51Var;
        x51Var.f32957r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return this.V;
    }
}
