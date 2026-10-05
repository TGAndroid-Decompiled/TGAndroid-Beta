package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f49784a;
    public final o f49785b;
    public final k f49786c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f49786c = kVar;
        this.f49785b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f49784a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f49786c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f49786c.unbindService(this.f49785b);
        } catch (RuntimeException e7) {
            Log.e("WearableLS", "Exception when unbinding from local service", e7);
        }
        this.f49784a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f49784a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f49786c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f49786c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f49785b, 1);
                    this.f49784a = true;
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
