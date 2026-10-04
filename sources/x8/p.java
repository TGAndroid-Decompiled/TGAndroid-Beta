package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f49769a;
    public final o f49770b;
    public final k f49771c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f49771c = kVar;
        this.f49770b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f49769a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f49771c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f49771c.unbindService(this.f49770b);
        } catch (RuntimeException e7) {
            Log.e("WearableLS", "Exception when unbinding from local service", e7);
        }
        this.f49769a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f49769a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f49771c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f49771c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f49770b, 1);
                    this.f49769a = true;
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
