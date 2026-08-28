package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class xl extends org.telegram.ui.Components.l6 {
    public final am f44538b;

    public xl(am amVar) {
        super("p2", 0);
        this.f44538b = amVar;
    }

    @Override
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).currentX = f10;
        View view = this.f44538b.f36519b.M.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
