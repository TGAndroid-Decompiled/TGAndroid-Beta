package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class vt implements View.OnAttachStateChangeListener {
    public ut f37621a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f37621a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f37621a, NotificationCenter.emojiLoaded);
    }
}
