package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f46082a;
    public final o f46083b;
    public final k f46084c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f46084c = kVar;
        this.f46083b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f46082a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f46084c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f46084c.unbindService(this.f46083b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f46082a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f46082a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f46084c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f46084c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f46083b, 1);
                    this.f46082a = true;
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
