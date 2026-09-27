package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gw0;
import w7.y5;
public final class v extends FrameLayout {
    public final gw0 f44684a;

    public v(Context context, e6 e6Var) {
        super(context);
        View view = new View(context);
        addView(view, y5.n(-1, -1));
        view.setBackgroundColor(i6.v0(i6.f19128h5, e6Var));
        gw0 gw0Var = new gw0(context, e6Var);
        this.f44684a = gw0Var;
        addView(gw0Var, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(i6.V0(getContext(), R.drawable.greydivider_top, i6.f19021b7));
    }

    public void setCallBack(fw0 fw0Var) {
        this.f44684a.setCallback(fw0Var);
    }
}
