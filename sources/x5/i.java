package x5;

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
import b6.m;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.az;
import q5.c0;
public final class i implements ServiceConnection {
    public int f46883a = 0;
    public final Messenger f46884b;
    public c0 f46885c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final k f46886f;

    public i(k kVar) {
        this.f46886f = kVar;
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                int i10 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i10);
                }
                i iVar = i.this;
                synchronized (iVar) {
                    try {
                        j jVar = (j) iVar.e.get(i10);
                        if (jVar == 0) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                            return true;
                        }
                        iVar.e.remove(i10);
                        iVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            jVar.b(new Exception("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (jVar.e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    jVar.c(null);
                                    return true;
                                }
                                jVar.b(new Exception("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                jVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.f46884b = new Messenger(handler);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i10 = this.f46883a;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    this.f46883a = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f46883a = 4;
                h6.a.a().b((Context) this.f46886f.f46891b, this);
                ?? exc = new Exception(str, securityException);
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).b(exc);
                }
                this.d.clear();
                for (int i11 = 0; i11 < this.e.size(); i11++) {
                    ((j) this.e.valueAt(i11)).b(exc);
                }
                this.e.clear();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f46883a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f46883a = 3;
                h6.a.a().b((Context) this.f46886f.f46891b, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean d(j jVar) {
        Throwable th2;
        int i10;
        boolean z4;
        h6.a a2;
        Context context;
        try {
            try {
                i10 = this.f46883a;
                z4 = false;
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
                        this.d.add(jVar);
                        ((ScheduledExecutorService) this.f46886f.f46892c).execute(new g(this, 0));
                        return true;
                    }
                    this.d.add(jVar);
                    return true;
                }
                this.d.add(jVar);
                if (this.f46883a == 0) {
                    z4 = true;
                }
                m.k(z4);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f46883a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a2 = h6.a.a();
                    context = (Context) this.f46886f.f46891b;
                } catch (SecurityException e) {
                    e = e;
                }
                try {
                    if (!a2.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        a("Unable to bind to service");
                    } else {
                        ((ScheduledExecutorService) this.f46886f.f46892c).schedule(new g(this, 1), 30L, TimeUnit.SECONDS);
                    }
                } catch (SecurityException e6) {
                    e = e6;
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
        ((ScheduledExecutorService) this.f46886f.f46892c).execute(new az(this, iBinder, false, 12));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f46886f.f46892c).execute(new g(this, 2));
    }
}
