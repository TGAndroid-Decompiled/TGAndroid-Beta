package org.telegram.ui;

import com.google.android.gms.cast.MediaError;
import org.telegram.messenger.FileLog;
public final class w9 extends e6.g {
    @Override
    public final void b(MediaError mediaError) {
        FileLog.e("Chromecast Media Error: " + mediaError);
    }

    @Override
    public final void g() {
        FileLog.d("onStatusUpdated");
        b5.d.C();
    }
}
