package org.telegram.ui.web;

import android.view.View;
import android.webkit.WebView;
public final class h0 implements View.OnLongClickListener {
    public final u0 f51154a;

    public h0(u0 u0Var) {
        this.f51154a = u0Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.f51154a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            org.telegram.messenger.g0.h3(new Runnable(this) {
                public final h0 f51127b;

                {
                    this.f51127b = this;
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
                public final h0 f51127b;

                {
                    this.f51127b = this;
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
