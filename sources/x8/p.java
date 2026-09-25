package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f45975a;
    public final o f45976b;
    public final k f45977c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f45977c = kVar;
        this.f45976b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f45975a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f45977c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f45977c.unbindService(this.f45976b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f45975a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f45975a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f45977c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f45977c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f45976b, 1);
                    this.f45975a = true;
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
