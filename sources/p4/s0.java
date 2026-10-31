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
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import java.util.List;
public final class s0 extends g3 implements ServiceConnection {
    public static final int G = 0;
    public n0 D;
    public boolean E;
    public mg.l F;
    public final ComponentName f44805r;
    public final com.google.android.gms.internal.cast.z f44806s;
    public final ArrayList f44807w;
    public boolean f44808x;
    public boolean f44809y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public s0(Context context, ComponentName componentName) {
        super(context, new l2.f(componentName, 22));
        this.f44807w = new ArrayList();
        this.f44805r = componentName;
        this.f44806s = new Handler();
    }

    @Override
    public final p c(String str) {
        if (str != null) {
            b2.u uVar = (b2.u) this.f5275n;
            if (uVar != null) {
                List list = (List) uVar.f2301c;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((m) list.get(i10)).d().equals(str)) {
                        q0 q0Var = new q0(this, str);
                        this.f44807w.add(q0Var);
                        if (this.E) {
                            q0Var.a(this.D);
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
            n0 n0Var = this.D;
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            if (nVar != null) {
                bundle = nVar.f44772a;
            } else {
                bundle = null;
            }
            n0Var.b(10, i10, 0, bundle, null);
        }
        r();
    }

    public final void n() {
        int i10;
        if (!this.f44809y) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f44805r);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = 4097;
                } else {
                    i10 = 1;
                }
                this.f44809y = this.f5271a.bindService(intent, this, i10);
            } catch (SecurityException unused) {
            }
        }
    }

    public final r0 o(String str, String str2) {
        b2.u uVar = (b2.u) this.f5275n;
        if (uVar != null) {
            List list = (List) uVar.f2301c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) list.get(i10)).d().equals(str)) {
                    r0 r0Var = new r0(this, str, str2);
                    this.f44807w.add(r0Var);
                    if (this.E) {
                        r0Var.a(this.D);
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
        if (this.f44809y) {
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
                        n0Var.f44778g = i10;
                        if (n0Var.b(1, i10, 4, null, null)) {
                            try {
                                n0Var.f44774a.getBinder().linkToDeath(n0Var, 0);
                                this.D = n0Var;
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
        if (this.D != null) {
            g(null);
            this.E = false;
            ArrayList arrayList = this.f44807w;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((o0) arrayList.get(i10)).c();
            }
            n0 n0Var = this.D;
            n0Var.b(2, 0, 0, null, null);
            n0Var.f44775b.f7169b.clear();
            n0Var.f44774a.getBinder().unlinkToDeath(n0Var, 0);
            n0Var.f44779i.f44806s.post(new m0(n0Var, 0));
            this.D = null;
        }
    }

    public final void q() {
        if (this.f44809y) {
            this.f44809y = false;
            p();
            try {
                this.f5271a.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    public final void r() {
        if (this.f44808x && (((n) this.h) != null || !this.f44807w.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.f44805r.flattenToShortString();
    }
}
