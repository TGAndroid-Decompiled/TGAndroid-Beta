package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nw0;
import w7.z5;
public final class v extends FrameLayout {
    public final nw0 f48999a;
    public final View f49000b;

    public v(Context context, d6 d6Var) {
        super(context);
        View view = new View(context);
        this.f49000b = view;
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(h6.w0(h6.f21057h5, d6Var));
        nw0 nw0Var = new nw0(context, d6Var);
        this.f48999a = nw0Var;
        addView(nw0Var, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(h6.W0(getContext(), R.drawable.greydivider_top, h6.f20948b7));
    }

    public void setCallBack(mw0 mw0Var) {
        this.f48999a.setCallback(mw0Var);
    }
}
