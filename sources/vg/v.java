package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gw0;
import w7.y5;
public final class v extends FrameLayout {
    public final gw0 f44676a;

    public v(Context context, f6 f6Var) {
        super(context);
        View view = new View(context);
        addView(view, y5.n(-1, -1));
        view.setBackgroundColor(j6.v0(j6.f19180h5, f6Var));
        gw0 gw0Var = new gw0(context, f6Var);
        this.f44676a = gw0Var;
        addView(gw0Var, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(j6.V0(getContext(), R.drawable.greydivider_top, j6.f19073b7));
    }

    public void setCallBack(fw0 fw0Var) {
        this.f44676a.setCallback(fw0Var);
    }
}
