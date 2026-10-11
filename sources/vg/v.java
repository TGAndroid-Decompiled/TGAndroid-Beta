package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.xw0;
import w7.x5;
public final class v extends FrameLayout {
    public final xw0 f49749a;
    public final View f49750b;

    public v(Context context, d6 d6Var) {
        super(context);
        View view = new View(context);
        this.f49750b = view;
        addView(view, x5.n(-1, -1));
        view.setBackgroundColor(h6.w0(h6.f20893h5, d6Var));
        xw0 xw0Var = new xw0(context, d6Var);
        this.f49749a = xw0Var;
        addView(xw0Var, x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        setBackground(h6.W0(getContext(), R.drawable.greydivider_top, h6.f20786b7));
    }

    public void setCallBack(ww0 ww0Var) {
        this.f49749a.setCallback(ww0Var);
    }
}
