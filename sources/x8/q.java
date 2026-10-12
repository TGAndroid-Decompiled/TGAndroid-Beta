package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class q extends Handler {
    public boolean f48267a;
    public final p f48268b;
    public final k f48269c;

    public q(k kVar, Looper looper) {
        super(looper);
        this.f48269c = kVar;
        this.f48268b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f48267a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f48269c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f48269c.unbindService(this.f48268b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f48267a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f48267a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f48269c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f48269c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f48268b, 1);
                    this.f48267a = true;
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
