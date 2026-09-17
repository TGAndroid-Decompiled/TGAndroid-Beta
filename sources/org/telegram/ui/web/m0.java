package org.telegram.ui.web;

import android.view.View;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class m0 implements View.OnLongClickListener {
    public final z0 f42179a;

    public m0(z0 z0Var) {
        this.f42179a = z0Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.f42179a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final m0 f42152b;

                {
                    this.f42152b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.k0.run():void");
                }
            });
            return true;
        } else if (hitTestResult.getType() == 5) {
            final String extra2 = hitTestResult.getExtra();
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final m0 f42152b;

                {
                    this.f42152b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.k0.run():void");
                }
            });
            return true;
        } else {
            return false;
        }
    }
}
