package x8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class q extends Handler {
    public boolean f49675a;
    public final p f49676b;
    public final k f49677c;

    public q(k kVar, Looper looper) {
        super(looper);
        this.f49677c = kVar;
        this.f49676b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f49675a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f49677c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f49677c.unbindService(this.f49676b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f49675a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f49675a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f49677c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f49677c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f49676b, 1);
                    this.f49675a = true;
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
