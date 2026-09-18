package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f45724a;
    public final o f45725b;
    public final k f45726c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f45726c = kVar;
        this.f45725b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f45724a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f45726c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f45726c.unbindService(this.f45725b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f45724a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f45724a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f45726c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f45726c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f45725b, 1);
                    this.f45724a = true;
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
