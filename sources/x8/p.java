package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f45646a;
    public final o f45647b;
    public final k f45648c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f45648c = kVar;
        this.f45647b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f45646a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f45648c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f45648c.unbindService(this.f45647b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f45646a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f45646a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f45648c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f45648c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f45647b, 1);
                    this.f45646a = true;
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
