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
import org.telegram.ui.Components.nd0;
public final class r0 extends h3 implements ServiceConnection {
    public static final int H = 0;
    public m0 E;
    public boolean F;
    public org.telegram.tgnet.g G;
    public final ComponentName f57151r;
    public final com.google.android.gms.internal.cast.y f57152s;
    public final ArrayList f57153w;
    public boolean f57154x;
    public boolean f57155y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public r0(Context context, ComponentName componentName) {
        super(context, new nd0(componentName, 12));
        this.f57153w = new ArrayList();
        this.f57151r = componentName;
        this.f57152s = new Handler();
    }

    @Override
    public final p c(String str) {
        if (str != null) {
            ca.i iVar = (ca.i) this.f7205n;
            if (iVar != null) {
                List list = (List) iVar.f5118c;
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (((m) list.get(i7)).d().equals(str)) {
                        p0 p0Var = new p0(this, str);
                        this.f57153w.add(p0Var);
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
                bundle = nVar.f57123a;
            } else {
                bundle = null;
            }
            m0Var.b(10, i7, 0, bundle, null);
        }
        r();
    }

    public final void n() {
        int i7;
        if (!this.f57155y) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f57151r);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i7 = 4097;
                } else {
                    i7 = 1;
                }
                this.f57155y = this.f7200a.bindService(intent, this, i7);
            } catch (SecurityException unused) {
            }
        }
    }

    public final q0 o(String str, String str2) {
        ca.i iVar = (ca.i) this.f7205n;
        if (iVar != null) {
            List list = (List) iVar.f5118c;
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((m) list.get(i7)).d().equals(str)) {
                    q0 q0Var = new q0(this, str, str2);
                    this.f57153w.add(q0Var);
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
        if (this.f57155y) {
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
                        m0Var.h = i7;
                        if (m0Var.b(1, i7, 4, null, null)) {
                            try {
                                m0Var.f57116a.getBinder().linkToDeath(m0Var, 0);
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
            ArrayList arrayList = this.f57153w;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((n0) arrayList.get(i7)).c();
            }
            m0 m0Var = this.E;
            m0Var.b(2, 0, 0, null, null);
            m0Var.f57117b.f12955b.clear();
            m0Var.f57116a.getBinder().unlinkToDeath(m0Var, 0);
            m0Var.f57122r.f57152s.post(new l0(m0Var, 0));
            this.E = null;
        }
    }

    public final void q() {
        if (this.f57155y) {
            this.f57155y = false;
            p();
            try {
                this.f7200a.unbindService(this);
            } catch (IllegalArgumentException e10) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e10);
            }
        }
    }

    public final void r() {
        if (this.f57154x && (((n) this.h) != null || !this.f57153w.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.f57151r.flattenToShortString();
    }
}
