package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sw0;
import w7.z5;
public final class v extends FrameLayout {
    public final sw0 f47612a;
    public final View f47613b;

    public v(Context context, c6 c6Var) {
        super(context);
        View view = new View(context);
        this.f47613b = view;
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(g6.w0(g6.f19672h5, c6Var));
        sw0 sw0Var = new sw0(context, c6Var);
        this.f47612a = sw0Var;
        addView(sw0Var, z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        setBackground(g6.W0(getContext(), R.drawable.greydivider_top, g6.f19563b7));
    }

    public void setCallBack(rw0 rw0Var) {
        this.f47612a.setCallback(rw0Var);
    }
}
