package za;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class a0 implements ServiceConnection {
    public final Context f60278a;
    public final Intent f60279b;
    public final ScheduledThreadPoolExecutor f60280c;
    public final ArrayDeque d;
    public y f60281e;
    public boolean f60282f;

    public a0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new e5.r("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f60282f = false;
        Context applicationContext = context.getApplicationContext();
        this.f60278a = applicationContext;
        this.f60279b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f60280c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                y yVar = this.f60281e;
                if (yVar != null && yVar.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.f60281e.a((z) this.d.poll());
                } else {
                    c();
                    return;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Task b(Intent intent) {
        z zVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            zVar = new z(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f60280c;
            zVar.f60346b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new xg.c(scheduledThreadPoolExecutor.schedule(new xf.c(zVar, 8), 20L, TimeUnit.SECONDS), 11));
            this.d.add(zVar);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return zVar.f60346b.getTask();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: za.a0.c():void");
    }

    @Override
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f60282f = false;
            if (!(iBinder instanceof y)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                ArrayDeque arrayDeque = this.d;
                while (!arrayDeque.isEmpty()) {
                    ((z) arrayDeque.poll()).f60346b.trySetResult(null);
                }
                return;
            }
            this.f60281e = (y) iBinder;
            a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
