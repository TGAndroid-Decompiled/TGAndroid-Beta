package t7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.FrameLayout;
import l3.g0;
import z5.l;
public abstract class d extends FrameLayout {
    private final j zza;

    public d(Context context) {
        super(context);
        this.zza = new j(this, context);
        setClickable(true);
    }

    public void getMapAsync(f fVar) {
        l.e("getMapAsync() must be called on the main thread");
        l.i(fVar, "callback must not be null.");
        j jVar = this.zza;
        g0 g0Var = jVar.f48175a;
        if (g0Var != null) {
            g0Var.t(fVar);
        } else {
            jVar.h.add(fVar);
        }
    }

    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            j jVar = this.zza;
            jVar.getClass();
            jVar.c(bundle, new j6.c(jVar, bundle));
            if (this.zza.f48175a == null) {
                j.a(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        j jVar = this.zza;
        g0 g0Var = jVar.f48175a;
        if (g0Var != null) {
            try {
                u7.g gVar = (u7.g) g0Var.f14097c;
                gVar.Q0(gVar.M0(), 5);
                return;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        jVar.b(1);
    }

    public void onEnterAmbient(Bundle bundle) {
        l.e("onEnterAmbient() must be called on the main thread");
        g0 g0Var = this.zza.f48175a;
        if (g0Var != null) {
            g0Var.getClass();
            try {
                Bundle bundle2 = new Bundle();
                u7.d.b(bundle, bundle2);
                u7.g gVar = (u7.g) g0Var.f14097c;
                Parcel M0 = gVar.M0();
                e7.b.b(M0, bundle2);
                gVar.Q0(M0, 10);
                u7.d.b(bundle2, bundle);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void onExitAmbient() {
        l.e("onExitAmbient() must be called on the main thread");
        g0 g0Var = this.zza.f48175a;
        if (g0Var != null) {
            g0Var.getClass();
            try {
                u7.g gVar = (u7.g) g0Var.f14097c;
                gVar.Q0(gVar.M0(), 11);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void onLowMemory() {
        g0 g0Var = this.zza.f48175a;
        if (g0Var != null) {
            try {
                u7.g gVar = (u7.g) g0Var.f14097c;
                gVar.Q0(gVar.M0(), 6);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void onPause() {
        j jVar = this.zza;
        g0 g0Var = jVar.f48175a;
        if (g0Var != null) {
            try {
                u7.g gVar = (u7.g) g0Var.f14097c;
                gVar.Q0(gVar.M0(), 4);
                return;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        jVar.b(5);
    }

    public void onResume() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new j6.d(jVar, 1));
    }

    public void onSaveInstanceState(Bundle bundle) {
        j jVar = this.zza;
        g0 g0Var = jVar.f48175a;
        if (g0Var != null) {
            try {
                Bundle bundle2 = new Bundle();
                u7.d.b(bundle, bundle2);
                u7.g gVar = (u7.g) g0Var.f14097c;
                Parcel M0 = gVar.M0();
                e7.b.b(M0, bundle2);
                Parcel L0 = gVar.L0(M0, 7);
                if (L0.readInt() != 0) {
                    bundle2.readFromParcel(L0);
                }
                L0.recycle();
                u7.d.b(bundle2, bundle);
                return;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        Bundle bundle3 = jVar.f48176b;
        if (bundle3 != null) {
            bundle.putAll(bundle3);
        }
    }

    public void onStart() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new j6.d(jVar, 0));
    }

    public void onStop() {
        j jVar = this.zza;
        g0 g0Var = jVar.f48175a;
        if (g0Var != null) {
            try {
                u7.g gVar = (u7.g) g0Var.f14097c;
                gVar.Q0(gVar.M0(), 13);
                return;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        jVar.b(4);
    }
}
