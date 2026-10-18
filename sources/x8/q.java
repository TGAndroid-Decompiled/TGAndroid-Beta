package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class q extends Handler {
    public boolean f49653a;
    public final p f49654b;
    public final k f49655c;

    public q(k kVar, Looper looper) {
        super(looper);
        this.f49655c = kVar;
        this.f49654b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f49653a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f49655c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f49655c.unbindService(this.f49654b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f49653a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f49653a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f49655c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f49655c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f49654b, 1);
                    this.f49653a = true;
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
