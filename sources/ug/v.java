package ug;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ew0;
import w7.a6;
public final class v extends FrameLayout {
    public final ew0 f42725a;

    public v(Context context, f6 f6Var) {
        super(context);
        View view = new View(context);
        addView(view, a6.n(-1, -1));
        view.setBackgroundColor(j6.v0(j6.f17998h5, f6Var));
        ew0 ew0Var = new ew0(context, f6Var);
        this.f42725a = ew0Var;
        addView(ew0Var, a6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(j6.V0(getContext(), R.drawable.greydivider_top, j6.f17892b7));
    }

    public void setCallBack(dw0 dw0Var) {
        this.f42725a.setCallback(dw0Var);
    }
}
