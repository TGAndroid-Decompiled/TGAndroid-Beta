package uh;

import android.widget.FrameLayout;
import android.widget.ImageView;
import mg.q0;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import ph.h1;
public final class l extends ha {
    public final int P1;
    public final CharSequence Q1;
    public q51 R1;

    public l(k2 k2Var, String str, h1 h1Var) {
        super(k2Var, true, false, k2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.P1 = k2Var.getCurrentAccount();
        this.Q1 = str;
        b1();
        this.f26730r1 = 0.6f;
        this.f26733u1 = true;
        this.f26734v1 = true;
        O();
        Y0();
        uk0 uk0Var = this.f26724k1;
        int i10 = this.f21616t0;
        uk0Var.setPadding(i10, 0, i10, 0);
        this.f26724k1.setOnItemClickListener(new q0(23, this, h1Var));
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(uk0Var, getContext(), this.P1, 0, false, new qh.d(this, 14), this.I0);
        this.R1 = q51Var;
        q51Var.f29638r = false;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        return this.Q1;
    }
}
