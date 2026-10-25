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
import li.e3;
import org.telegram.ui.Components.voip.j1;
public final class r0 extends g3 implements ServiceConnection {
    public static final int G = 0;
    public boolean E;
    public j1 F;
    public final ComponentName f46748r;
    public final com.google.android.gms.internal.cast.y f46749s;
    public final ArrayList v;
    public boolean f46750w;
    public boolean f46751x;
    public m0 f46752y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public r0(Context context, ComponentName componentName) {
        super(context, new e3(componentName, 14));
        this.v = new ArrayList();
        this.f46748r = componentName;
        this.f46749s = new Handler();
    }

    @Override
    public final p c(String str) {
        if (str != null) {
            b2.u uVar = (b2.u) this.f7393n;
            if (uVar != null) {
                List list = (List) uVar.f3464c;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((m) list.get(i10)).d().equals(str)) {
                        p0 p0Var = new p0(this, str);
                        this.v.add(p0Var);
                        if (this.E) {
                            p0Var.a(this.f46752y);
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
            m0 m0Var = this.f46752y;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            if (nVar != null) {
                bundle = nVar.f46723a;
            } else {
                bundle = null;
            }
            m0Var.b(10, i10, 0, bundle, null);
        }
        r();
    }

    public final void n() {
        int i10;
        if (!this.f46751x) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f46748r);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = 4097;
                } else {
                    i10 = 1;
                }
                this.f46751x = this.f7389a.bindService(intent, this, i10);
            } catch (SecurityException unused) {
            }
        }
    }

    public final q0 o(String str, String str2) {
        b2.u uVar = (b2.u) this.f7393n;
        if (uVar != null) {
            List list = (List) uVar.f3464c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) list.get(i10)).d().equals(str)) {
                    q0 q0Var = new q0(this, str, str2);
                    this.v.add(q0Var);
                    if (this.E) {
                        q0Var.a(this.f46752y);
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
        if (this.f46751x) {
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
                        m0Var.f46721g = i10;
                        if (m0Var.b(1, i10, 4, null, null)) {
                            try {
                                m0Var.f46717a.getBinder().linkToDeath(m0Var, 0);
                                this.f46752y = m0Var;
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
        if (this.f46752y != null) {
            g(null);
            this.E = false;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((n0) arrayList.get(i10)).c();
            }
            m0 m0Var = this.f46752y;
            m0Var.b(2, 0, 0, null, null);
            m0Var.f46718b.f12116b.clear();
            m0Var.f46717a.getBinder().unlinkToDeath(m0Var, 0);
            m0Var.f46722i.f46749s.post(new l0(m0Var, 0));
            this.f46752y = null;
        }
    }

    public final void q() {
        if (this.f46751x) {
            this.f46751x = false;
            p();
            try {
                this.f7389a.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    public final void r() {
        if (this.f46750w && (((n) this.h) != null || !this.v.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.f46748r.flattenToShortString();
    }
}
