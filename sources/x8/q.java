package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class q extends Handler {
    public boolean f50105a;
    public final p f50106b;
    public final k f50107c;

    public q(k kVar, Looper looper) {
        super(looper);
        this.f50107c = kVar;
        this.f50106b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f50105a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f50107c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f50107c.unbindService(this.f50106b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f50105a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f50105a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f50107c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f50107c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f50106b, 1);
                    this.f50105a = true;
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
