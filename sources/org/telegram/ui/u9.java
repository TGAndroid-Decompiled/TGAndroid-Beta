package org.telegram.ui;

import com.google.android.gms.cast.MediaError;
public final class u9 extends h6.g {
    @Override
    public final void b(MediaError mediaError) {
        org.telegram.messenger.a8.d("Chromecast Media Error: " + mediaError);
    }

    @Override
    public final void g() {
        org.telegram.messenger.a8.b("onStatusUpdated");
        d1.f.C();
    }
}
