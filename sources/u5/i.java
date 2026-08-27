package u5;

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
import c2.t0;
import com.google.firebase.messaging.s;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o0.m;
import org.telegram.ui.i6;

public final class i implements ServiceConnection {

    public int f48411a = 0;

    public final Messenger f48412b;

    public i6 f48413c;
    public final ArrayDeque d;

    public final SparseArray f48414e;

    public final k f48415f;

    public i(k kVar) {
        this.f48415f = kVar;
        t0 t0Var = new t0(Looper.getMainLooper(), new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                int i10 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i10);
                }
                i iVar = this.f48410a;
                synchronized (iVar) {
                    try {
                        j jVar = (j) iVar.f48414e.get(i10);
                        if (jVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                            return true;
                        }
                        iVar.f48414e.remove(i10);
                        iVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            jVar.b(new s("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (jVar.f48419e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    jVar.c(null);
                                    return true;
                                }
                                jVar.b(new s("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                jVar.c(bundle);
                                return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.f48412b = new Messenger(t0Var);
        this.d = new ArrayDeque();
        this.f48414e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i10 = this.f48411a;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f48411a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f48411a = 4;
            e6.a.a().b((Context) this.f48415f.f48422b, this);
            s sVar = new s(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).b(sVar);
            }
            this.d.clear();
            for (int i11 = 0; i11 < this.f48414e.size(); i11++) {
                ((j) this.f48414e.valueAt(i11)).b(sVar);
            }
            this.f48414e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f48411a == 2 && this.d.isEmpty() && this.f48414e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f48411a = 3;
                e6.a.a().b((Context) this.f48415f.f48422b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(j jVar) throws Throwable {
        Throwable th;
        try {
            try {
                int i10 = this.f48411a;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            this.d.add(jVar);
                            return true;
                        }
                        if (i10 != 2) {
                            return false;
                        }
                        this.d.add(jVar);
                        ((ScheduledExecutorService) this.f48415f.f48423c).execute(new g(this, 0));
                        return true;
                    }
                    this.d.add(jVar);
                    y5.l.k(this.f48411a == 0);
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.f48411a = 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    try {
                        e6.a aVarA = e6.a.a();
                        Context context = (Context) this.f48415f.f48422b;
                        try {
                            if (aVarA.c(context, context.getClass().getName(), intent, this, 1, null)) {
                                ((ScheduledExecutorService) this.f48415f.f48423c).schedule(new g(this, 1), 30L, TimeUnit.SECONDS);
                            } else {
                                a("Unable to bind to service");
                            }
                        } catch (SecurityException e9) {
                            e = e9;
                            b("Unable to bind to service", e);
                        }
                    } catch (SecurityException e10) {
                        e = e10;
                    }
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f48415f.f48423c).execute(new m(7, this, iBinder));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f48415f.f48423c).execute(new g(this, 2));
    }
}
