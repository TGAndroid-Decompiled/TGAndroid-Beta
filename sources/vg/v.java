package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.xw0;
import w7.x5;
public final class v extends FrameLayout {
    public final xw0 f49672a;
    public final View f49673b;

    public v(Context context, e6 e6Var) {
        super(context);
        View view = new View(context);
        this.f49673b = view;
        addView(view, x5.n(-1, -1));
        view.setBackgroundColor(i6.w0(i6.f20872h5, e6Var));
        xw0 xw0Var = new xw0(context, e6Var);
        this.f49672a = xw0Var;
        addView(xw0Var, x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        setBackground(i6.W0(getContext(), R.drawable.greydivider_top, i6.f20765b7));
    }

    public void setCallBack(ww0 ww0Var) {
        this.f49672a.setCallback(ww0Var);
    }
}
