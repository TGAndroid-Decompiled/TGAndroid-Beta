package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.ww0;
import w7.x5;
public final class v extends FrameLayout {
    public final ww0 f49628a;
    public final View f49629b;

    public v(Context context, e6 e6Var) {
        super(context);
        View view = new View(context);
        this.f49629b = view;
        addView(view, x5.n(-1, -1));
        view.setBackgroundColor(i6.w0(i6.f20868h5, e6Var));
        ww0 ww0Var = new ww0(context, e6Var);
        this.f49628a = ww0Var;
        addView(ww0Var, x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        setBackground(i6.W0(getContext(), R.drawable.greydivider_top, i6.f20761b7));
    }

    public void setCallBack(vw0 vw0Var) {
        this.f49628a.setCallback(vw0Var);
    }
}
