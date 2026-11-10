package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.wt0;
public final class v extends FrameLayout {
    public final wt0 f59499a;
    public final View f59500b;

    public v(Context context, h6 h6Var) {
        super(context);
        View view = new View(context);
        this.f59500b = view;
        addView(view, ha.o(-1, -1));
        t6.h(m6.f27963h5, view, h6Var);
        wt0 wt0Var = new wt0(context, h6Var);
        this.f59499a = wt0Var;
        addView(wt0Var, ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        t6.Z(this, getContext(), 2131231231, m6.f27854b7);
    }

    public void setCallBack(vt0 vt0Var) {
        this.f59499a.setCallback(vt0Var);
    }
}
