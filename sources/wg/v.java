package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sv0;
import w7.x5;
public final class v extends FrameLayout {
    public final sv0 f48590a;

    public v(Context context, f6 f6Var) {
        super(context);
        View view = new View(context);
        addView(view, x5.n(-1, -1));
        view.setBackgroundColor(j6.v0(j6.f20761h5, f6Var));
        sv0 sv0Var = new sv0(context, f6Var);
        this.f48590a = sv0Var;
        addView(sv0Var, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(j6.V0(getContext(), R.drawable.greydivider_top, j6.f20654b7));
    }

    public void setCallBack(rv0 rv0Var) {
        this.f48590a.setCallback(rv0Var);
    }
}
