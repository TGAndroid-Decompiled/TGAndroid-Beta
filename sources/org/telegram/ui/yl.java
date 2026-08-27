package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

public final class yl extends org.telegram.ui.Components.l6 {

    public final cm f44843b;

    public yl(cm cmVar) {
        super("p2", 0);
        this.f44843b = cmVar;
    }

    @Override
    public final void c(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).currentX = f10;
        View view = this.f44843b.f37115b.M.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
