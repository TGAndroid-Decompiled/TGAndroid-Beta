package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class q extends Handler {
    public boolean f50104a;
    public final p f50105b;
    public final k f50106c;

    public q(k kVar, Looper looper) {
        super(looper);
        this.f50106c = kVar;
        this.f50105b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f50104a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f50106c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f50106c.unbindService(this.f50105b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f50104a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f50104a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f50106c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f50106c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f50105b, 1);
                    this.f50104a = true;
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
