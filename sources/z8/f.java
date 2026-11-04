package z8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import org.telegram.messenger.WearAuthListenerService;
public final class f extends Handler {
    public boolean f60153a;
    public final e f60154b;
    public final WearAuthListenerService f60155c;

    public f(WearAuthListenerService wearAuthListenerService, Looper looper) {
        super(looper);
        this.f60155c = wearAuthListenerService;
        this.f60154b = new Object();
    }

    public final synchronized void a(String str) {
        if (!this.f60153a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            String valueOf = String.valueOf(this.f60155c.f21399a);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f60155c.unbindService(this.f60154b);
        } catch (RuntimeException e10) {
            Log.e("WearableLS", "Exception when unbinding from local service", e10);
        }
        this.f60153a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        synchronized (this) {
            try {
                if (!this.f60153a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(this.f60155c.f21399a)));
                    }
                    WearAuthListenerService wearAuthListenerService = this.f60155c;
                    wearAuthListenerService.bindService(wearAuthListenerService.d, this.f60154b, 1);
                    this.f60153a = true;
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
