package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f49316a;
    public final o f49317b;
    public final k f49318c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f49318c = kVar;
        this.f49317b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f49316a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f49318c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f49318c.unbindService(this.f49317b);
        } catch (RuntimeException e7) {
            Log.e("WearableLS", "Exception when unbinding from local service", e7);
        }
        this.f49316a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f49316a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f49318c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f49318c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f49317b, 1);
                    this.f49316a = true;
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
