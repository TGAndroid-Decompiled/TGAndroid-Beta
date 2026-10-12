package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.cx0;
import w7.w5;
public final class v extends FrameLayout {
    public final cx0 f49864a;
    public final View f49865b;

    public v(Context context, c6 c6Var) {
        super(context);
        View view = new View(context);
        this.f49865b = view;
        addView(view, w5.n(-1, -1));
        view.setBackgroundColor(h6.w0(h6.f20631h5, c6Var));
        cx0 cx0Var = new cx0(context, c6Var);
        this.f49864a = cx0Var;
        addView(cx0Var, w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        setBackground(h6.W0(getContext(), R.drawable.greydivider_top, h6.f20524b7));
    }

    public void setCallBack(bx0 bx0Var) {
        this.f49864a.setCallback(bx0Var);
    }
}
