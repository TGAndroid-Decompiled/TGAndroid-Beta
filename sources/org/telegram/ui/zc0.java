package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class zc0 extends FrameLayout {
    public final HashMap f40444a;
    public final cd0 f40445b;

    public zc0(cd0 cd0Var, Context context) {
        super(context);
        this.f40445b = cd0Var;
        this.f40444a = new HashMap();
    }

    public final void a() {
        IMapsProvider.IMap iMap = this.f40445b.I;
        if (iMap != null) {
            IMapsProvider.IProjection projection = iMap.getProjection();
            for (Map.Entry entry : this.f40444a.entrySet()) {
                View view = (View) entry.getValue();
                Point screenLocation = projection.toScreenLocation(((IMapsProvider.IMarker) entry.getKey()).getPosition());
                view.setTranslationX(screenLocation.x - (view.getMeasuredWidth() / 2));
                view.setTranslationY(AndroidUtilities.dp(22.0f) + (screenLocation.y - view.getMeasuredHeight()));
            }
        }
    }
}
