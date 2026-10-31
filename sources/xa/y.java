package xa;

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
import vh.d0;
public final class y implements ServiceConnection {
    public final Context f53589a;
    public final Intent f53590b;
    public final ScheduledThreadPoolExecutor f53591c;
    public final ArrayDeque d;
    public w e;
    public boolean f53592f;

    public y(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new c5.s("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f53592f = false;
        Context applicationContext = context.getApplicationContext();
        this.f53589a = applicationContext;
        this.f53590b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f53591c = scheduledThreadPoolExecutor;
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
                w wVar = this.e;
                if (wVar != null && wVar.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.e.a((x) this.d.poll());
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
        x xVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            xVar = new x(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f53591c;
            xVar.f53588b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new wh.b(scheduledThreadPoolExecutor.schedule(new d0(xVar, 27), 20L, TimeUnit.SECONDS), 7));
            this.d.add(xVar);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return xVar.f53588b.getTask();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: xa.y.c():void");
    }

    @Override
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f53592f = false;
            if (!(iBinder instanceof w)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                ArrayDeque arrayDeque = this.d;
                while (!arrayDeque.isEmpty()) {
                    ((x) arrayDeque.poll()).f53588b.trySetResult(null);
                }
                return;
            }
            this.e = (w) iBinder;
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
