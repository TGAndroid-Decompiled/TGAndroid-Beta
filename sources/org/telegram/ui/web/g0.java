package org.telegram.ui.web;

import android.view.View;
import android.webkit.WebView;
public final class g0 implements View.OnLongClickListener {
    public final s0 f52612a;

    public g0(s0 s0Var) {
        this.f52612a = s0Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.f52612a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            org.telegram.messenger.g0.h3(new Runnable(this) {
                public final g0 f52597b;

                {
                    this.f52597b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.e0.run():void");
                }
            });
            return true;
        } else if (hitTestResult.getType() == 5) {
            final String extra2 = hitTestResult.getExtra();
            org.telegram.messenger.g0.h3(new Runnable(this) {
                public final g0 f52597b;

                {
                    this.f52597b = this;
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
