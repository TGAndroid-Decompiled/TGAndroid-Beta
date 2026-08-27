package org.telegram.ui;

import com.google.android.gms.cast.MediaError;
import org.telegram.messenger.FileLog;

public final class v9 extends o5.g {
    @Override
    public final void b(MediaError mediaError) {
        FileLog.e("Chromecast Media Error: " + mediaError);
    }

    @Override
    public final void g() {
        FileLog.d("onStatusUpdated");
        d1.f.B();
    }
}
