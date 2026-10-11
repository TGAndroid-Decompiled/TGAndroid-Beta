package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.yw0;
import w7.x5;
public final class v extends FrameLayout {
    public final yw0 f49715a;
    public final View f49716b;

    public v(Context context, d6 d6Var) {
        super(context);
        View view = new View(context);
        this.f49716b = view;
        addView(view, x5.n(-1, -1));
        view.setBackgroundColor(h6.w0(h6.f20857h5, d6Var));
        yw0 yw0Var = new yw0(context, d6Var);
        this.f49715a = yw0Var;
        addView(yw0Var, x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        setBackground(h6.W0(getContext(), R.drawable.greydivider_top, h6.f20750b7));
    }

    public void setCallBack(xw0 xw0Var) {
        this.f49715a.setCallback(xw0Var);
    }
}
