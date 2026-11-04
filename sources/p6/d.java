package p6;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.ui.Components.y00;
public abstract class d {
    public static final m6.c[] D = new m6.c[0];
    public boolean A;
    public volatile h0 B;
    public final AtomicInteger C;
    public int f53214a;
    public long f53215b;
    public long f53216c;
    public int d;
    public long f53217e;
    public volatile String f53218f;
    public androidx.activity.n f53219g;
    public final Context h;
    public final Looper f53220i;
    public final l0 f53221j;
    public final c0 f53222k;
    public final Object f53223l;
    public final Object f53224m;
    public z f53225n;
    public b f53226o;
    public IInterface f53227p;
    public final ArrayList f53228q;
    public e0 f53229r;
    public int f53230s;
    public final n f53231t;
    public final n f53232u;
    public final int v;
    public final String f53233w;
    public volatile String f53234x;
    public volatile y00 f53235y;
    public m6.a f53236z;

    public d(Context context, Looper looper, l0 l0Var, int i3, n nVar, n nVar2, String str) {
        Object obj = m6.d.d;
        this.f53218f = null;
        this.f53223l = new Object();
        this.f53224m = new Object();
        this.f53228q = new ArrayList();
        this.f53230s = 1;
        this.f53236z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        m.h(context, "Context must not be null");
        this.h = context;
        m.h(looper, "Looper must not be null");
        this.f53220i = looper;
        m.h(l0Var, "Supervisor must not be null");
        this.f53221j = l0Var;
        this.f53222k = new c0(this, looper);
        this.v = i3;
        this.f53231t = nVar;
        this.f53232u = nVar2;
        this.f53233w = str;
    }

    public void a() {
        this.C.incrementAndGet();
        ArrayList arrayList = this.f53228q;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((y) arrayList.get(i3)).d();
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f53224m) {
            this.f53225n = null;
        }
        z(1, null);
    }

    public boolean b() {
        return true;
    }

    public void c(b bVar) {
        m.h(bVar, "Connection progress callbacks cannot be null.");
        this.f53226o = bVar;
        z(2, null);
    }

    public abstract int d();

    public Intent e() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean f() {
        return false;
    }

    public abstract IInterface g(IBinder iBinder);

    public final void h(String str) {
        this.f53218f = str;
        a();
    }

    public m6.c[] i() {
        return D;
    }

    public Bundle j() {
        return null;
    }

    public Bundle k() {
        return new Bundle();
    }

    public final void l(i iVar, Set set) {
        String attributionTag;
        Bundle k10 = k();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag = this.f53234x;
        } else if (this.f53235y == null) {
            attributionTag = this.f53234x;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.f53235y.f40562a;
            if (attributionSource == null) {
                attributionTag = this.f53234x;
            } else if (attributionSource.getAttributionTag() == null) {
                attributionTag = this.f53234x;
            } else {
                attributionTag = attributionSource.getAttributionTag();
            }
        }
        String str = attributionTag;
        int i3 = this.v;
        int i10 = m6.e.f19188a;
        Scope[] scopeArr = g.F;
        Bundle bundle = new Bundle();
        m6.c[] cVarArr = g.G;
        g gVar = new g(6, i3, i10, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        gVar.d = this.h.getPackageName();
        gVar.h = k10;
        if (set != null) {
            gVar.f53253f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (f()) {
            gVar.f53254n = new Account("<<default account>>", "com.google");
            if (iVar != null) {
                gVar.f53252e = iVar.asBinder();
            }
        } else if (this instanceof g8.b) {
            gVar.f53254n = null;
        }
        gVar.f53255r = D;
        gVar.f53256s = i();
        if (w()) {
            gVar.f53259y = true;
        }
        try {
            synchronized (this.f53224m) {
                try {
                    z zVar = this.f53225n;
                    if (zVar != null) {
                        zVar.H0(new d0(this, this.C.get()), gVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i11 = this.C.get();
            c0 c0Var = this.f53222k;
            c0Var.sendMessage(c0Var.obtainMessage(6, i11, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            v(8, null, null, this.C.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            v(8, null, null, this.C.get());
        }
    }

    public final IInterface m() {
        IInterface iInterface;
        synchronized (this.f53223l) {
            try {
                if (this.f53230s != 5) {
                    if (r()) {
                        IInterface iInterface2 = this.f53227p;
                        m.h(iInterface2, "Client is connected but service is null");
                        iInterface = iInterface2;
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public abstract String n();

    public abstract String o();

    public String p() {
        return "com.google.android.gms";
    }

    public boolean q() {
        if (d() >= 211700000) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        boolean z10;
        synchronized (this.f53223l) {
            if (this.f53230s == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean s() {
        boolean z10;
        synchronized (this.f53223l) {
            int i3 = this.f53230s;
            z10 = true;
            if (i3 != 2 && i3 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void t(m6.a aVar) {
        this.d = aVar.f19177b;
        this.f53217e = System.currentTimeMillis();
    }

    public void u(int i3) {
        this.f53214a = i3;
        this.f53215b = System.currentTimeMillis();
    }

    public void v(int i3, IBinder iBinder, Bundle bundle, int i10) {
        f0 f0Var = new f0(this, i3, iBinder, bundle);
        c0 c0Var = this.f53222k;
        c0Var.sendMessage(c0Var.obtainMessage(1, i10, -1, f0Var));
    }

    public boolean w() {
        return this instanceof d6.a;
    }

    public final boolean x(int i3, int i10, IInterface iInterface) {
        synchronized (this.f53223l) {
            try {
                if (this.f53230s != i3) {
                    return false;
                }
                z(i10, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y() {
        int i3;
        int i10;
        synchronized (this.f53223l) {
            i3 = this.f53230s;
        }
        if (i3 == 3) {
            this.A = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        c0 c0Var = this.f53222k;
        c0Var.sendMessage(c0Var.obtainMessage(i10, this.C.get(), 16));
    }

    public final void z(int i3, IInterface iInterface) {
        boolean z10;
        boolean z11;
        androidx.activity.n nVar;
        boolean z12 = false;
        if (i3 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (iInterface == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 == z11) {
            z12 = true;
        }
        m.b(z12);
        synchronized (this.f53223l) {
            try {
                this.f53230s = i3;
                this.f53227p = iInterface;
                Bundle bundle = null;
                if (i3 != 1) {
                    if (i3 != 2 && i3 != 3) {
                        if (i3 == 4) {
                            m.g(iInterface);
                            IInterface iInterface2 = iInterface;
                            this.f53216c = System.currentTimeMillis();
                        }
                    } else {
                        e0 e0Var = this.f53229r;
                        if (e0Var != null && (nVar = this.f53219g) != null) {
                            String str = (String) nVar.f1270c;
                            String str2 = (String) nVar.d;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 70 + String.valueOf(str2).length());
                            sb2.append("Calling connect() while still connected, missing disconnect() for ");
                            sb2.append(str);
                            sb2.append(" on ");
                            sb2.append(str2);
                            Log.e("GmsClient", sb2.toString());
                            l0 l0Var = this.f53221j;
                            String str3 = (String) this.f53219g.f1270c;
                            m.g(str3);
                            String str4 = (String) this.f53219g.d;
                            if (this.f53233w == null) {
                                this.h.getClass();
                            }
                            l0Var.c(str3, str4, e0Var, this.f53219g.f1269b);
                            this.C.incrementAndGet();
                        }
                        e0 e0Var2 = new e0(this, this.C.get());
                        this.f53229r = e0Var2;
                        String p10 = p();
                        String o10 = o();
                        boolean q10 = q();
                        this.f53219g = new androidx.activity.n(p10, o10, q10);
                        if (q10 && d() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f53219g.f1270c)));
                        }
                        l0 l0Var2 = this.f53221j;
                        String str5 = (String) this.f53219g.f1270c;
                        m.g(str5);
                        String str6 = (String) this.f53219g.d;
                        String str7 = this.f53233w;
                        if (str7 == null) {
                            str7 = this.h.getClass().getName();
                        }
                        m6.a b10 = l0Var2.b(new i0(str5, str6, this.f53219g.f1269b), e0Var2, str7);
                        if (!b10.c()) {
                            androidx.activity.n nVar2 = this.f53219g;
                            String str8 = (String) nVar2.f1270c;
                            String str9 = (String) nVar2.d;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                            sb3.append("unable to connect to service: ");
                            sb3.append(str8);
                            sb3.append(" on ");
                            sb3.append(str9);
                            Log.w("GmsClient", sb3.toString());
                            int i10 = b10.f19177b;
                            if (i10 == -1) {
                                i10 = 16;
                            }
                            if (b10.f19178c != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", b10.f19178c);
                            }
                            int i11 = this.C.get();
                            g0 g0Var = new g0(this, i10, bundle);
                            c0 c0Var = this.f53222k;
                            c0Var.sendMessage(c0Var.obtainMessage(7, i11, -1, g0Var));
                        }
                    }
                } else {
                    e0 e0Var3 = this.f53229r;
                    if (e0Var3 != null) {
                        l0 l0Var3 = this.f53221j;
                        String str10 = (String) this.f53219g.f1270c;
                        m.g(str10);
                        String str11 = (String) this.f53219g.d;
                        if (this.f53233w == null) {
                            this.h.getClass();
                        }
                        l0Var3.c(str10, str11, e0Var3, this.f53219g.f1269b);
                        this.f53229r = null;
                    }
                }
            } finally {
            }
        }
    }
}
