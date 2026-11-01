package org.telegram.ui.web;

import android.view.View;
import android.webkit.WebView;
public final class h0 implements View.OnLongClickListener {
    public final v0 f42855a;

    public h0(v0 v0Var) {
        this.f42855a = v0Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.f42855a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            org.telegram.messenger.i0.g3(new Runnable(this) {
                public final h0 f42831b;

                {
                    this.f42831b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.f0.run():void");
                }
            });
            return true;
        } else if (hitTestResult.getType() == 5) {
            final String extra2 = hitTestResult.getExtra();
            org.telegram.messenger.i0.g3(new Runnable(this) {
                public final h0 f42831b;

                {
                    this.f42831b = this;
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
