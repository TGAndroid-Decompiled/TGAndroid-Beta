package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f45947a;
    public final o f45948b;
    public final k f45949c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f45949c = kVar;
        this.f45948b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f45947a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f45949c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f45949c.unbindService(this.f45948b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f45947a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f45947a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f45949c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f45949c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f45948b, 1);
                    this.f45947a = true;
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
