package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.fw0;
import w7.y5;
public final class v extends FrameLayout {
    public final fw0 f44637a;

    public v(Context context, d6 d6Var) {
        super(context);
        View view = new View(context);
        addView(view, y5.n(-1, -1));
        view.setBackgroundColor(h6.v0(h6.f19129h5, d6Var));
        fw0 fw0Var = new fw0(context, d6Var);
        this.f44637a = fw0Var;
        addView(fw0Var, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(h6.V0(getContext(), R.drawable.greydivider_top, h6.f19023b7));
    }

    public void setCallBack(ew0 ew0Var) {
        this.f44637a.setCallback(ew0Var);
    }
}
