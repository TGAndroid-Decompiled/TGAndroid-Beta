package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f45976a;
    public final o f45977b;
    public final k f45978c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f45978c = kVar;
        this.f45977b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f45976a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f45978c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f45978c.unbindService(this.f45977b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f45976a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f45976a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f45978c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f45978c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f45977b, 1);
                    this.f45976a = true;
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
