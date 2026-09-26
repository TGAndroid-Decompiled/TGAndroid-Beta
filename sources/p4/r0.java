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
public final class r0 extends h3 implements ServiceConnection {
    public static final int G = 0;
    public boolean E;
    public le.b F;
    public final ComponentName f40911r;
    public final com.google.android.gms.internal.cast.c0 f40912s;
    public final ArrayList v;
    public boolean f40913w;
    public boolean f40914x;
    public m0 f40915y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public r0(Context context, ComponentName componentName) {
        super(context, new n2.e(componentName, 12));
        this.v = new ArrayList();
        this.f40911r = componentName;
        this.f40912s = new Handler();
    }

    @Override
    public final p c(String str) {
        if (str != null) {
            b2.p pVar = (b2.p) this.f6944n;
            if (pVar != null) {
                List list = (List) pVar.f3169c;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((m) list.get(i10)).d().equals(str)) {
                        p0 p0Var = new p0(this, str);
                        this.v.add(p0Var);
                        if (this.E) {
                            p0Var.a(this.f40915y);
                        }
                        r();
                        return p0Var;
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
            m0 m0Var = this.f40915y;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            if (nVar != null) {
                bundle = nVar.f40886a;
            } else {
                bundle = null;
            }
            m0Var.b(10, i10, 0, bundle, null);
        }
        r();
    }

    public final void n() {
        int i10;
        if (!this.f40914x) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f40911r);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = 4097;
                } else {
                    i10 = 1;
                }
                this.f40914x = this.f6940a.bindService(intent, this, i10);
            } catch (SecurityException unused) {
            }
        }
    }

    public final q0 o(String str, String str2) {
        b2.p pVar = (b2.p) this.f6944n;
        if (pVar != null) {
            List list = (List) pVar.f3169c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) list.get(i10)).d().equals(str)) {
                    q0 q0Var = new q0(this, str, str2);
                    this.v.add(q0Var);
                    if (this.E) {
                        q0Var.a(this.f40915y);
                    }
                    r();
                    return q0Var;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger;
        if (this.f40914x) {
            p();
            if (iBinder != null) {
                messenger = new Messenger(iBinder);
            } else {
                messenger = null;
            }
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        m0 m0Var = new m0(this, messenger);
                        int i10 = m0Var.d;
                        m0Var.d = i10 + 1;
                        m0Var.f40884g = i10;
                        if (m0Var.b(1, i10, 4, null, null)) {
                            try {
                                m0Var.f40880a.getBinder().linkToDeath(m0Var, 0);
                                this.f40915y = m0Var;
                                return;
                            } catch (RemoteException unused) {
                                m0Var.binderDied();
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
        if (this.f40915y != null) {
            g(null);
            this.E = false;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((n0) arrayList.get(i10)).c();
            }
            m0 m0Var = this.f40915y;
            m0Var.b(2, 0, 0, null, null);
            m0Var.f40881b.f9221b.clear();
            m0Var.f40880a.getBinder().unlinkToDeath(m0Var, 0);
            m0Var.f40885i.f40912s.post(new l0(m0Var, 0));
            this.f40915y = null;
        }
    }

    public final void q() {
        if (this.f40914x) {
            this.f40914x = false;
            p();
            try {
                this.f6940a.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    public final void r() {
        if (this.f40913w && (((n) this.h) != null || !this.v.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.f40911r.flattenToShortString();
    }
}
