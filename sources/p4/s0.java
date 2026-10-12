package p4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import java.util.List;
public final class s0 extends h3 implements ServiceConnection {
    public static final int G = 0;
    public boolean E;
    public m4.x F;
    public final ComponentName f45313r;
    public final com.google.android.gms.internal.cast.a0 f45314s;
    public final ArrayList v;
    public boolean f45315w;
    public boolean f45316x;
    public n0 f45317y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public s0(Context context, ComponentName componentName) {
        super(context, new k2.g0(componentName, 17));
        this.v = new ArrayList();
        this.f45313r = componentName;
        this.f45314s = new Handler();
    }

    @Override
    public final p c(String str) {
        if (str != null) {
            b2.p pVar = (b2.p) this.f7546n;
            if (pVar != null) {
                List list = (List) pVar.f3504c;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((m) list.get(i10)).d().equals(str)) {
                        q0 q0Var = new q0(this, str);
                        this.v.add(q0Var);
                        if (this.E) {
                            q0Var.a(this.f45317y);
                        }
                        r();
                        return q0Var;
                    }
                }
                return null;
            }
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Override
    public final q d(String str) {
        if (str != null) {
            return o(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override
    public final q e(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return o(str, str2);
            }
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override
    public final void f(n nVar) {
        Bundle bundle;
        if (this.E) {
            n0 n0Var = this.f45317y;
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            if (nVar != null) {
                bundle = nVar.f45277a;
            } else {
                bundle = null;
            }
            n0Var.b(10, i10, 0, bundle, null);
        }
        r();
    }

    public final void n() {
        int i10;
        if (!this.f45316x) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f45313r);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = 4097;
                } else {
                    i10 = 1;
                }
                this.f45316x = this.f7541a.bindService(intent, this, i10);
            } catch (SecurityException unused) {
            }
        }
    }

    public final r0 o(String str, String str2) {
        b2.p pVar = (b2.p) this.f7546n;
        if (pVar != null) {
            List list = (List) pVar.f3504c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) list.get(i10)).d().equals(str)) {
                    r0 r0Var = new r0(this, str, str2);
                    this.v.add(r0Var);
                    if (this.E) {
                        r0Var.a(this.f45317y);
                    }
                    r();
                    return r0Var;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger;
        if (this.f45316x) {
            p();
            if (iBinder != null) {
                messenger = new Messenger(iBinder);
            } else {
                messenger = null;
            }
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        n0 n0Var = new n0(this, messenger);
                        int i10 = n0Var.d;
                        n0Var.d = i10 + 1;
                        n0Var.f45284g = i10;
                        if (n0Var.b(1, i10, 4, null, null)) {
                            try {
                                n0Var.f45279a.getBinder().linkToDeath(n0Var, 0);
                                this.f45317y = n0Var;
                                return;
                            } catch (RemoteException unused) {
                                n0Var.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        p();
    }

    public final void p() {
        if (this.f45317y != null) {
            g(null);
            this.E = false;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((o0) arrayList.get(i10)).c();
            }
            n0 n0Var = this.f45317y;
            n0Var.b(2, 0, 0, null, null);
            n0Var.f45280b.f10107b.clear();
            n0Var.f45279a.getBinder().unlinkToDeath(n0Var, 0);
            n0Var.f45285i.f45314s.post(new m0(n0Var, 0));
            this.f45317y = null;
        }
    }

    public final void q() {
        if (this.f45316x) {
            this.f45316x = false;
            p();
            try {
                this.f7541a.unbindService(this);
            } catch (IllegalArgumentException e7) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e7);
            }
        }
    }

    public final void r() {
        if (this.f45315w && (((n) this.h) != null || !this.v.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.f45313r.flattenToShortString();
    }
}
