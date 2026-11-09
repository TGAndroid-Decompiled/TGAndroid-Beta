package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.Components.xt0;
public final class v extends FrameLayout {
    public final xt0 f59501a;
    public final View f59502b;

    public v(Context context, g6 g6Var) {
        super(context);
        View view = new View(context);
        this.f59502b = view;
        addView(view, ha.o(-1, -1));
        s6.h(l6.f27938h5, view, g6Var);
        xt0 xt0Var = new xt0(context, g6Var);
        this.f59501a = xt0Var;
        addView(xt0Var, ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        s6.Z(this, getContext(), 2131231231, l6.f27829b7);
    }

    public void setCallBack(wt0 wt0Var) {
        this.f59501a.setCallback(wt0Var);
    }
}
