package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ut implements View.OnAttachStateChangeListener {
    public tt f41244a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f41244a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f41244a, NotificationCenter.emojiLoaded);
    }
}
