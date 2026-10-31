package x8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import org.telegram.messenger.WearAuthListenerService;
public final class f extends Handler {
    public boolean f53430a;
    public final e f53431b;
    public final WearAuthListenerService f53432c;

    public f(WearAuthListenerService wearAuthListenerService, Looper looper) {
        super(looper);
        this.f53432c = wearAuthListenerService;
        this.f53431b = new Object();
    }

    public final synchronized void a(String str) {
        if (!this.f53430a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            String valueOf = String.valueOf(this.f53432c.f14531a);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f53432c.unbindService(this.f53431b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f53430a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        synchronized (this) {
            try {
                if (!this.f53430a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(this.f53432c.f14531a)));
                    }
                    WearAuthListenerService wearAuthListenerService = this.f53432c;
                    wearAuthListenerService.bindService(wearAuthListenerService.d, this.f53431b, 1);
                    this.f53430a = true;
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
