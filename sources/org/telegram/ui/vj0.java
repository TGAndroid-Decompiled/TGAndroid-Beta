package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.NotificationCenter;
public final class vj0 extends TextView {
    public final rt f38623a;

    public vj0(Context context) {
        super(context);
        this.f38623a = new rt(1, this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this.f38623a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this.f38623a, NotificationCenter.emojiLoaded);
    }
}
