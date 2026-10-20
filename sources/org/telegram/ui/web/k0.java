package org.telegram.ui.web;

import android.view.View;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class k0 implements View.OnLongClickListener {
    public final x0 f42704a;

    public k0(x0 x0Var) {
        this.f42704a = x0Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.f42704a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final k0 f42677b;

                {
                    this.f42677b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.i0.run():void");
                }
            });
            return true;
        } else if (hitTestResult.getType() == 5) {
            final String extra2 = hitTestResult.getExtra();
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final k0 f42677b;

                {
                    this.f42677b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.i0.run():void");
                }
            });
            return true;
        } else {
            return false;
        }
    }
}
