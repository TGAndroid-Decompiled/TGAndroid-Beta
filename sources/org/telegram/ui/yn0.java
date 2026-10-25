package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
public final class yn0 extends WebView {
    public yn0(Context context) {
        super(context);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
