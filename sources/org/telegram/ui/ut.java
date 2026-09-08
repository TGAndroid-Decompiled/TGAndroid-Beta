package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ut implements View.OnAttachStateChangeListener {
    public tt f41243a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f41243a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f41243a, NotificationCenter.emojiLoaded);
    }
}
