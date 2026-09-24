package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f45960a;
    public final o f45961b;
    public final k f45962c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f45962c = kVar;
        this.f45961b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f45960a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f45962c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f45962c.unbindService(this.f45961b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f45960a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f45960a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f45962c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f45962c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f45961b, 1);
                    this.f45960a = true;
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
