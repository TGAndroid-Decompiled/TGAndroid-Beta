package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class zl extends org.telegram.ui.Components.q6 {
    public final dm f45256b;

    public zl(dm dmVar) {
        super("p2", 0);
        this.f45256b = dmVar;
    }

    @Override
    public final void b(Object obj, float f9) {
        ((MessageObject.SendAnimationData) obj).currentX = f9;
        View view = this.f45256b.f37560b.M.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
