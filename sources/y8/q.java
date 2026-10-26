package y8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class q extends Handler {
    public boolean f52404a;
    public final p f52405b;
    public final k f52406c;

    public q(k kVar, Looper looper) {
        super(looper);
        this.f52406c = kVar;
        this.f52405b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f52404a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f52406c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f52406c.unbindService(this.f52405b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f52404a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f52404a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f52406c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f52406c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f52405b, 1);
                    this.f52404a = true;
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
