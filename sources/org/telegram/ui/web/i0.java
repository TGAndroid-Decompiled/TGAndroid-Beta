package org.telegram.ui.web;

import android.view.View;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class i0 implements View.OnLongClickListener {
    public final w0 f39531a;

    public i0(w0 w0Var) {
        this.f39531a = w0Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.f39531a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final i0 f39503b;

                {
                    this.f39503b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g0.run():void");
                }
            });
            return true;
        } else if (hitTestResult.getType() == 5) {
            final String extra2 = hitTestResult.getExtra();
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final i0 f39503b;

                {
                    this.f39503b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g0.run():void");
                }
            });
            return true;
        } else {
            return false;
        }
    }
}
