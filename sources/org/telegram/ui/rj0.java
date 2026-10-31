package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class rj0 extends FrameLayout {
    public final org.telegram.ui.Components.ei0 f41240a;

    public rj0(Context context) {
        super(context);
        ?? imageView = new ImageView(context);
        this.f41240a = imageView;
        imageView.setOnClickListener(new f50(this, 15));
        int L = org.telegram.messenger.i0.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView((View) imageView, layoutParams);
        setPadding(0, org.telegram.messenger.i0.L(32.0f), 0, 0);
        setLayoutParams(new s4.o0(-1, -2));
    }
}
