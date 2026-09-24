package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ew0;
import w7.y5;
public final class v extends FrameLayout {
    public final ew0 f44624a;

    public v(Context context, d6 d6Var) {
        super(context);
        View view = new View(context);
        addView(view, y5.n(-1, -1));
        view.setBackgroundColor(h6.v0(h6.f19115h5, d6Var));
        ew0 ew0Var = new ew0(context, d6Var);
        this.f44624a = ew0Var;
        addView(ew0Var, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(h6.V0(getContext(), R.drawable.greydivider_top, h6.f19009b7));
    }

    public void setCallBack(dw0 dw0Var) {
        this.f44624a.setCallback(dw0Var);
    }
}
