package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f51106a;
    public final o f51107b;
    public final k f51108c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f51108c = kVar;
        this.f51107b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f51106a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f51108c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f51108c.unbindService(this.f51107b);
        } catch (RuntimeException e7) {
            Log.e("WearableLS", "Exception when unbinding from local service", e7);
        }
        this.f51106a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f51106a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f51108c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f51108c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f51107b, 1);
                    this.f51106a = true;
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
