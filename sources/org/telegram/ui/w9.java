package org.telegram.ui;

import com.google.android.gms.cast.MediaError;
public final class w9 extends e6.g {
    @Override
    public final void b(MediaError mediaError) {
        org.telegram.messenger.f8.d("Chromecast Media Error: " + mediaError);
    }

    @Override
    public final void g() {
        org.telegram.messenger.f8.b("onStatusUpdated");
        b5.d.C();
    }
}
