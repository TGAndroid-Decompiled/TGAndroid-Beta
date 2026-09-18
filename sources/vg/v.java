package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.uv0;
import w7.x5;
public final class v extends FrameLayout {
    public final uv0 f44385a;

    public v(Context context, f6 f6Var) {
        super(context);
        View view = new View(context);
        addView(view, x5.n(-1, -1));
        view.setBackgroundColor(j6.v0(j6.f18934h5, f6Var));
        uv0 uv0Var = new uv0(context, f6Var);
        this.f44385a = uv0Var;
        addView(uv0Var, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(j6.V0(getContext(), R.drawable.greydivider_top, j6.f18827b7));
    }

    public void setCallBack(tv0 tv0Var) {
        this.f44385a.setCallback(tv0Var);
    }
}
