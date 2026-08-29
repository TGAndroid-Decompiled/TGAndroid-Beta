package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class yl extends org.telegram.ui.Components.q6 {
    @Override
    public final void b(Object obj, float f9) {
        ((MessageObject.SendAnimationData) obj).currentScale = f9;
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentScale);
    }
}
