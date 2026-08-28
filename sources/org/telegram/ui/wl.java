package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wl extends org.telegram.ui.Components.l6 {
    @Override
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).currentScale = f10;
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentScale);
    }
}
