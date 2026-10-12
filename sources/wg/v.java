package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sw0;
import w7.a6;
public final class v extends FrameLayout {
    public final sw0 f47613a;
    public final View f47614b;

    public v(Context context, c6 c6Var) {
        super(context);
        View view = new View(context);
        this.f47614b = view;
        addView(view, a6.n(-1, -1));
        view.setBackgroundColor(g6.w0(g6.f19972h5, c6Var));
        sw0 sw0Var = new sw0(context, c6Var);
        this.f47613a = sw0Var;
        addView(sw0Var, a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        setBackground(g6.W0(getContext(), R.drawable.greydivider_top, g6.f19863b7));
    }

    public void setCallBack(rw0 rw0Var) {
        this.f47613a.setCallback(rw0Var);
    }
}
