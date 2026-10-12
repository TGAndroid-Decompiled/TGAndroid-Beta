package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class zl0 extends FrameLayout {
    public final org.telegram.ui.Components.bk0 f42646a;

    public zl0(Context context) {
        super(context);
        ?? imageView = new ImageView(context);
        this.f42646a = imageView;
        imageView.setOnClickListener(new t60(this, 13));
        int dp = AndroidUtilities.dp(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, dp);
        layoutParams.gravity = 1;
        addView((View) imageView, layoutParams);
        setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
        setLayoutParams(new s4.o0(-1, -2));
    }
}
