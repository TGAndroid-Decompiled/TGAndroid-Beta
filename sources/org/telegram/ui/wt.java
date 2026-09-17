package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class wt implements View.OnAttachStateChangeListener {
    public vt f39166a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f39166a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f39166a, NotificationCenter.emojiLoaded);
    }
}
