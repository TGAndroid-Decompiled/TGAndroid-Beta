package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f45692a;
    public final o f45693b;
    public final k f45694c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f45694c = kVar;
        this.f45693b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f45692a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f45694c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f45694c.unbindService(this.f45693b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f45692a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f45692a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f45694c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f45694c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f45693b, 1);
                    this.f45692a = true;
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
