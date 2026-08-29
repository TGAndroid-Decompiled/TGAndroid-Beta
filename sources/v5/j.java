package v5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public final class j implements ServiceConnection {
    public int f49416a = 0;
    public final Messenger f49417b;
    public oc.i f49418c;
    public final ArrayDeque d;
    public final SparseArray f49419e;
    public final l f49420f;

    public j(l lVar) {
        this.f49420f = lVar;
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                int i10 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i10);
                }
                j jVar = j.this;
                synchronized (jVar) {
                    try {
                        k kVar = (k) jVar.f49419e.get(i10);
                        if (kVar == 0) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                            return true;
                        }
                        jVar.f49419e.remove(i10);
                        jVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            kVar.b(new Exception("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (kVar.f49424e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    kVar.c(null);
                                    return true;
                                }
                                kVar.b(new Exception("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                kVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.f49417b = new Messenger(handler);
        this.d = new ArrayDeque();
        this.f49419e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i10 = this.f49416a;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    this.f49416a = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f49416a = 4;
                f6.a.a().b((Context) this.f49420f.f49427b, this);
                ?? exc = new Exception(str, securityException);
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).b(exc);
                }
                this.d.clear();
                for (int i11 = 0; i11 < this.f49419e.size(); i11++) {
                    ((k) this.f49419e.valueAt(i11)).b(exc);
                }
                this.f49419e.clear();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f49416a == 2 && this.d.isEmpty() && this.f49419e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f49416a = 3;
                f6.a.a().b((Context) this.f49420f.f49427b, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean d(k kVar) {
        Throwable th2;
        int i10;
        boolean z10;
        f6.a a2;
        Context context;
        try {
            try {
                i10 = this.f49416a;
                z10 = false;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                throw th2;
            }
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return false;
                        }
                        this.d.add(kVar);
                        ((ScheduledExecutorService) this.f49420f.f49428c).execute(new h(this, 0));
                        return true;
                    }
                    this.d.add(kVar);
                    return true;
                }
                this.d.add(kVar);
                if (this.f49416a == 0) {
                    z10 = true;
                }
                z5.l.k(z10);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f49416a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a2 = f6.a.a();
                    context = (Context) this.f49420f.f49427b;
                } catch (SecurityException e10) {
                    e = e10;
                }
                try {
                    if (!a2.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        a("Unable to bind to service");
                    } else {
                        ((ScheduledExecutorService) this.f49420f.f49428c).schedule(new h(this, 1), 30L, TimeUnit.SECONDS);
                    }
                } catch (SecurityException e11) {
                    e = e11;
                    b("Unable to bind to service", e);
                    return true;
                }
                return true;
            } catch (Throwable th4) {
                th2 = th4;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f49420f.f49428c).execute(new od.i(this, iBinder, false, 11));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f49420f.f49428c).execute(new h(this, 2));
    }
}
