package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pw0;
import w7.z5;
public final class v extends FrameLayout {
    public final pw0 f49005a;
    public final View f49006b;

    public v(Context context, d6 d6Var) {
        super(context);
        View view = new View(context);
        this.f49006b = view;
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(h6.w0(h6.f21061h5, d6Var));
        pw0 pw0Var = new pw0(context, d6Var);
        this.f49005a = pw0Var;
        addView(pw0Var, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(h6.W0(getContext(), R.drawable.greydivider_top, h6.f20952b7));
    }

    public void setCallBack(ow0 ow0Var) {
        this.f49005a.setCallback(ow0Var);
    }
}
