package r4;

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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.nh;
public final class s0 extends g3 implements ServiceConnection {
    public static final int H = 0;
    public n0 E;
    public boolean F;
    public e3 G;
    public final ComponentName f54355r;
    public final com.google.android.gms.internal.cast.z f54356s;
    public final ArrayList f54357w;
    public boolean f54358x;
    public boolean f54359y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public s0(Context context, ComponentName componentName) {
        super(context, new nh(componentName, 15));
        this.f54357w = new ArrayList();
        this.f54355r = componentName;
        this.f54356s = new Handler();
    }

    @Override
    public final p c(String str) {
        if (str != null) {
            ba.i iVar = (ba.i) this.f7593n;
            if (iVar != null) {
                List list = (List) iVar.f3187c;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (((m) list.get(i3)).d().equals(str)) {
                        q0 q0Var = new q0(this, str);
                        this.f54357w.add(q0Var);
                        if (this.F) {
                            q0Var.b(this.E);
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
        if (this.F) {
            n0 n0Var = this.E;
            int i3 = n0Var.d;
            n0Var.d = i3 + 1;
            if (nVar != null) {
                bundle = nVar.f54320a;
            } else {
                bundle = null;
            }
            n0Var.b(10, i3, 0, bundle, null);
        }
        r();
    }

    public final void n() {
        int i3;
        if (!this.f54359y) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f54355r);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i3 = 4097;
                } else {
                    i3 = 1;
                }
                this.f54359y = this.f7588a.bindService(intent, this, i3);
            } catch (SecurityException unused) {
            }
        }
    }

    public final r0 o(String str, String str2) {
        ba.i iVar = (ba.i) this.f7593n;
        if (iVar != null) {
            List list = (List) iVar.f3187c;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((m) list.get(i3)).d().equals(str)) {
                    r0 r0Var = new r0(this, str, str2);
                    this.f54357w.add(r0Var);
                    if (this.F) {
                        r0Var.b(this.E);
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
        if (this.f54359y) {
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
                        int i3 = n0Var.d;
                        n0Var.d = i3 + 1;
                        n0Var.f54327g = i3;
                        if (n0Var.b(1, i3, 4, null, null)) {
                            try {
                                n0Var.f54322a.getBinder().linkToDeath(n0Var, 0);
                                this.E = n0Var;
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
        if (this.E != null) {
            g(null);
            this.F = false;
            ArrayList arrayList = this.f54357w;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((o0) arrayList.get(i3)).c();
            }
            n0 n0Var = this.E;
            n0Var.b(2, 0, 0, null, null);
            n0Var.f54323b.f11681b.clear();
            n0Var.f54322a.getBinder().unlinkToDeath(n0Var, 0);
            n0Var.f54328i.f54356s.post(new m0(n0Var, 0));
            this.E = null;
        }
    }

    public final void q() {
        if (this.f54359y) {
            this.f54359y = false;
            p();
            try {
                this.f7588a.unbindService(this);
            } catch (IllegalArgumentException e10) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e10);
            }
        }
    }

    public final void r() {
        if (this.f54358x && (((n) this.h) != null || !this.f54357w.isEmpty())) {
            n();
        } else {
            q();
        }
    }

    public final String toString() {
        return "Service connection " + this.f54355r.flattenToShortString();
    }
}
