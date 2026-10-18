package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class q extends Handler {
    public boolean f49700a;
    public final p f49701b;
    public final k f49702c;

    public q(k kVar, Looper looper) {
        super(looper);
        this.f49702c = kVar;
        this.f49701b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f49700a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f49702c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f49702c.unbindService(this.f49701b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f49700a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f49700a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f49702c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f49702c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f49701b, 1);
                    this.f49700a = true;
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
