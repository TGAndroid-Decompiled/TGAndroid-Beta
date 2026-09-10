package org.telegram.ui.web;

import android.view.View;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class l0 implements View.OnLongClickListener {
    public final y0 f38007a;

    public l0(y0 y0Var) {
        this.f38007a = y0Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.f38007a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final l0 f37978b;

                {
                    this.f37978b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.j0.run():void");
                }
            });
            return true;
        } else if (hitTestResult.getType() == 5) {
            final String extra2 = hitTestResult.getExtra();
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final l0 f37978b;

                {
                    this.f37978b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.j0.run():void");
                }
            });
            return true;
        } else {
            return false;
        }
    }
}
