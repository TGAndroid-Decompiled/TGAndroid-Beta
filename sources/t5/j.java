package t5;

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
import org.telegram.ui.Cells.e3;
import org.telegram.ui.fm;
public final class j implements ServiceConnection {
    public int f47689a = 0;
    public final Messenger f47690b;
    public e3 f47691c;
    public final ArrayDeque d;
    public final SparseArray f47692e;
    public final l f47693f;

    public j(l lVar) {
        this.f47693f = lVar;
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                int i9 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i9);
                }
                j jVar = j.this;
                synchronized (jVar) {
                    try {
                        k kVar = (k) jVar.f47692e.get(i9);
                        if (kVar == 0) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i9);
                            return true;
                        }
                        jVar.f47692e.remove(i9);
                        jVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            kVar.b(new Exception("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (kVar.f47697e) {
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
        this.f47690b = new Messenger(handler);
        this.d = new ArrayDeque();
        this.f47692e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i9 = this.f47689a;
            if (i9 != 0) {
                if (i9 != 1 && i9 != 2) {
                    if (i9 != 3) {
                        return;
                    }
                    this.f47689a = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f47689a = 4;
                d6.a.a().b((Context) this.f47693f.f47700b, this);
                ?? exc = new Exception(str, securityException);
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).b(exc);
                }
                this.d.clear();
                for (int i10 = 0; i10 < this.f47692e.size(); i10++) {
                    ((k) this.f47692e.valueAt(i10)).b(exc);
                }
                this.f47692e.clear();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f47689a == 2 && this.d.isEmpty() && this.f47692e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f47689a = 3;
                d6.a.a().b((Context) this.f47693f.f47700b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(k kVar) {
        Throwable th;
        int i9;
        boolean z10;
        d6.a a2;
        Context context;
        try {
            try {
                i9 = this.f47689a;
                z10 = false;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            return false;
                        }
                        this.d.add(kVar);
                        ((ScheduledExecutorService) this.f47693f.f47701c).execute(new h(this, 0));
                        return true;
                    }
                    this.d.add(kVar);
                    return true;
                }
                this.d.add(kVar);
                if (this.f47689a == 0) {
                    z10 = true;
                }
                x5.l.k(z10);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f47689a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a2 = d6.a.a();
                    context = (Context) this.f47693f.f47700b;
                } catch (SecurityException e10) {
                    e = e10;
                }
                try {
                    if (!a2.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        a("Unable to bind to service");
                    } else {
                        ((ScheduledExecutorService) this.f47693f.f47701c).schedule(new h(this, 1), 30L, TimeUnit.SECONDS);
                    }
                } catch (SecurityException e11) {
                    e = e11;
                    b("Unable to bind to service", e);
                    return true;
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f47693f.f47701c).execute(new fm(this, iBinder, false, 6));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f47693f.f47701c).execute(new h(this, 2));
    }
}
