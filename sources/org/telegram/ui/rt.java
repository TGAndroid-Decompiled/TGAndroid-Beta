package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class rt implements View.OnAttachStateChangeListener {
    public qt f38112a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f38112a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f38112a, NotificationCenter.emojiLoaded);
    }
}
