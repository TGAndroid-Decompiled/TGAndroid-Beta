package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sw0;
import w7.z5;
public final class v extends FrameLayout {
    public final sw0 f49451a;
    public final View f49452b;

    public v(Context context, g6 g6Var) {
        super(context);
        View view = new View(context);
        this.f49452b = view;
        addView(view, z5.n(-1, -1));
        r6.i(k6.f21254h5, view, g6Var);
        sw0 sw0Var = new sw0(context, g6Var);
        this.f49451a = sw0Var;
        addView(sw0Var, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        r6.b0(R.drawable.greydivider_top, k6.f21145b7, getContext(), this, null);
    }

    public void setCallBack(rw0 rw0Var) {
        this.f49451a.setCallback(rw0Var);
    }
}
