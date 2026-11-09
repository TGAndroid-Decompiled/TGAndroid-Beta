package org.telegram.ui.web;

import android.view.View;
import android.webkit.WebView;
public final class h0 implements View.OnLongClickListener {
    public final u0 f51135a;

    public h0(u0 u0Var) {
        this.f51135a = u0Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.f51135a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            org.telegram.messenger.g0.h3(new Runnable(this) {
                public final h0 f51108b;

                {
                    this.f51108b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.f0.run():void");
                }
            });
            return true;
        } else if (hitTestResult.getType() == 5) {
            final String extra2 = hitTestResult.getExtra();
            org.telegram.messenger.g0.h3(new Runnable(this) {
                public final h0 f51108b;

                {
                    this.f51108b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.f0.run():void");
                }
            });
            return true;
        } else {
            return false;
        }
    }
}
