package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f51060a;
    public final o f51061b;
    public final k f51062c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f51062c = kVar;
        this.f51061b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f51060a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f51062c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f51062c.unbindService(this.f51061b);
        } catch (RuntimeException e7) {
            Log.e("WearableLS", "Exception when unbinding from local service", e7);
        }
        this.f51060a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f51060a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f51062c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f51062c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f51061b, 1);
                    this.f51060a = true;
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
