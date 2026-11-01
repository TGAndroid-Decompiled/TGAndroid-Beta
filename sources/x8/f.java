package x8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import org.telegram.messenger.WearAuthListenerService;
public final class f extends Handler {
    public boolean f53448a;
    public final e f53449b;
    public final WearAuthListenerService f53450c;

    public f(WearAuthListenerService wearAuthListenerService, Looper looper) {
        super(looper);
        this.f53450c = wearAuthListenerService;
        this.f53449b = new Object();
    }

    public final synchronized void a(String str) {
        if (!this.f53448a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            String valueOf = String.valueOf(this.f53450c.f14532a);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f53450c.unbindService(this.f53449b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f53448a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        synchronized (this) {
            try {
                if (!this.f53448a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(this.f53450c.f14532a)));
                    }
                    WearAuthListenerService wearAuthListenerService = this.f53450c;
                    wearAuthListenerService.bindService(wearAuthListenerService.d, this.f53449b, 1);
                    this.f53448a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            super.dispatchMessage(message);
            if (!hasMessages(0)) {
                a("dispatch");
            }
        } catch (Throwable th3) {
            if (!hasMessages(0)) {
                a("dispatch");
            }
            throw th3;
        }
    }
}
