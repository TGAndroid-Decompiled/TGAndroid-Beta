package org.telegram.ui.web;

import android.view.View;
import android.webkit.WebView;
public final class g0 implements View.OnLongClickListener {
    public final s0 f53374a;

    public g0(s0 s0Var) {
        this.f53374a = s0Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.f53374a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            org.telegram.messenger.g0.g3(new Runnable(this) {
                public final g0 f53359b;

                {
                    this.f53359b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.e0.run():void");
                }
            });
            return true;
        } else if (hitTestResult.getType() == 5) {
            final String extra2 = hitTestResult.getExtra();
            org.telegram.messenger.g0.g3(new Runnable(this) {
                public final g0 f53359b;

                {
                    this.f53359b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.e0.run():void");
                }
            });
            return true;
        } else {
            return false;
        }
    }
}
