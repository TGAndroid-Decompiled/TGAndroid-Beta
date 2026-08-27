package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

public final class zl extends org.telegram.ui.Components.l6 {

    public final cm f45198b;

    public zl(cm cmVar) {
        super("progress", 0);
        this.f45198b = cmVar;
    }

    @Override
    public final void c(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).progress = f10;
        View view = this.f45198b.f37115b.M.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).progress);
    }
}
