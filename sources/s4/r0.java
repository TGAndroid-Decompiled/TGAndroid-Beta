package s4;

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
import org.telegram.messenger.ou;
public final class r0 extends h3 implements ServiceConnection {
    public static final int H = 0;
    public m0 E;
    public boolean F;
    public org.telegram.ui.ActionBar.z G;
    public final ComponentName f56451r;
    public final com.google.android.gms.internal.cast.y f56452s;
    public final ArrayList f56453w;
    public boolean f56454x;
    public boolean f56455y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public r0(Context context, ComponentName componentName) {
        super(context, new ou(componentName, 22));
        this.f56453w = new ArrayList();
        this.f56451r = componentName;
        this.f56452s = new Handler();
    }

    @Override
    public final p c(String str) {
        if (str != null) {
            ca.i iVar = (ca.i) this.f6931n;
            if (iVar != null) {
                List list = (List) iVar.f4844c;
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (((m) list.get(i7)).d().equals(str)) {
                        p0 p0Var = new p0(this, str);
                        this.f56453w.add(p0Var);
                        if (this.F) {
                            p0Var.a(this.E);
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
        if (this.F) {
            m0 m0Var = this.E;
            int i7 = m0Var.d;
            m0Var.d = i7 + 1;
            if (nVar != null) {
                bundle = nVar.f56423a;
            } else {
                bundle = null;
            }
            m0Var.b(10, i7, 0, bundle, null);
        }
        r();
    }

    public final void n() {
        int i7;
        if (!this.f56455y) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f56451r);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i7 = 4097;
                } else {
                    i7 = 1;
                }
                this.f56455y = this.f6926a.bindService(intent, this, i7);
            } catch (SecurityException unused) {
            }
        }
    }

    public final q0 o(String str, String str2) {
        ca.i iVar = (ca.i) this.f6931n;
        if (iVar != null) {
            List list = (List) iVar.f4844c;
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((m) list.get(i7)).d().equals(str)) {
                    q0 q0Var = new q0(this, str, str2);
                    this.f56453w.add(q0Var);
                    if (this.F) {
                        q0Var.a(this.E);
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
        if (this.f56455y) {
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
                        int i7 = m0Var.d;
                        m0Var.d = i7 + 1;
                        m0Var.f56421g = i7;
                        if (m0Var.b(1, i7, 4, null, null)) {
                            try {
                                m0Var.f56416a.getBinder().linkToDeath(m0Var, 0);
                                this.E = m0Var;
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
        if (this.E != null) {
            g(null);
            this.F = false;
            ArrayList arrayList = this.f56453w;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((n0) arrayList.get(i7)).c();
            }
            m0 m0Var = this.E;
            m0Var.b(2, 0, 0, null, null);
            m0Var.f56417b.f12647b.clear();
            m0Var.f56416a.getBinder().unlinkToDeath(m0Var, 0);
            m0Var.f56422i.f56452s.post(new l0(m0Var, 0));
            this.E = null;
        }
    }

    public final void q() {
        if (this.f56455y) {
            this.f56455y = false;
            p();
            try {
                this.f6926a.unbindService(this);
            } catch (IllegalArgumentException e10) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e10);
            }
        }
    }

    public final void r() {
        if (this.f56454x && (((n) this.h) != null || !this.f56453w.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.f56451r.flattenToShortString();
    }
}
