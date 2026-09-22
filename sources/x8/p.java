package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f46015a;
    public final o f46016b;
    public final k f46017c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f46017c = kVar;
        this.f46016b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f46015a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f46017c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f46017c.unbindService(this.f46016b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f46015a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f46015a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f46017c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f46017c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f46016b, 1);
                    this.f46015a = true;
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
