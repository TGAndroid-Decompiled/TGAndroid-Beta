package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f51299a;
    public final o f51300b;
    public final k f51301c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f51301c = kVar;
        this.f51300b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f51299a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f51301c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f51301c.unbindService(this.f51300b);
        } catch (RuntimeException e7) {
            Log.e("WearableLS", "Exception when unbinding from local service", e7);
        }
        this.f51299a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f51299a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f51301c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f51301c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f51300b, 1);
                    this.f51299a = true;
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
