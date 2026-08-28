package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class yl extends org.telegram.ui.Components.l6 {
    public final am f44896b;

    public yl(am amVar) {
        super("progress", 0);
        this.f44896b = amVar;
    }

    @Override
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).progress = f10;
        View view = this.f44896b.f36519b.M.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
