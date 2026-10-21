package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class zl extends org.telegram.ui.Components.s6 {
    public final cm f43774b;

    public zl(cm cmVar) {
        super("p2", 0);
        this.f43774b = cmVar;
    }

    @Override
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentX = f7;
        View view = this.f43774b.f36009b.Q.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
