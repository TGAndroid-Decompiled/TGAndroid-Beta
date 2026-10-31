package uh;

import android.widget.FrameLayout;
import android.widget.ImageView;
import mg.q0;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import ph.h1;
public final class l extends ha {
    public final int P1;
    public final CharSequence Q1;
    public p51 R1;

    public l(k2 k2Var, String str, h1 h1Var) {
        super(k2Var, true, false, k2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.P1 = k2Var.getCurrentAccount();
        this.Q1 = str;
        b1();
        this.f26672r1 = 0.6f;
        this.f26675u1 = true;
        this.f26676v1 = true;
        O();
        Y0();
        tk0 tk0Var = this.f26666k1;
        int i10 = this.f21615t0;
        tk0Var.setPadding(i10, 0, i10, 0);
        this.f26666k1.setOnItemClickListener(new q0(23, this, h1Var));
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.P1, 0, false, new qh.d(this, 14), this.I0);
        this.R1 = p51Var;
        p51Var.f29295r = false;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        return this.Q1;
    }
}
