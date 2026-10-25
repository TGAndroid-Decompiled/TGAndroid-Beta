package y8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class q extends Handler {
    public boolean f52401a;
    public final p f52402b;
    public final k f52403c;

    public q(k kVar, Looper looper) {
        super(looper);
        this.f52403c = kVar;
        this.f52402b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f52401a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f52403c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f52403c.unbindService(this.f52402b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f52401a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f52401a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f52403c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f52403c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f52402b, 1);
                    this.f52401a = true;
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
