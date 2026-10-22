package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class q extends Handler {
    public boolean f49662a;
    public final p f49663b;
    public final k f49664c;

    public q(k kVar, Looper looper) {
        super(looper);
        this.f49664c = kVar;
        this.f49663b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f49662a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f49664c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f49664c.unbindService(this.f49663b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f49662a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f49662a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f49664c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f49664c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f49663b, 1);
                    this.f49662a = true;
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
