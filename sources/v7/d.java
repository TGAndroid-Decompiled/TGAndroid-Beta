package v7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.FrameLayout;
import b6.m;
public abstract class d extends FrameLayout {
    private final j zza;

    public d(Context context) {
        super(context);
        this.zza = new j(this, context);
        setClickable(true);
    }

    public void getMapAsync(f fVar) {
        m.e("getMapAsync() must be called on the main thread");
        m.i(fVar, "callback must not be null.");
        j jVar = this.zza;
        s5.m mVar = jVar.f48963a;
        if (mVar != null) {
            mVar.j(fVar);
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
            jVar.c(bundle, new l6.c(jVar, bundle));
            if (this.zza.f48963a == null) {
                j.a(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        j jVar = this.zza;
        s5.m mVar = jVar.f48963a;
        if (mVar != null) {
            try {
                w7.g gVar = (w7.g) mVar.f47094c;
                gVar.Q0(gVar.M0(), 5);
                return;
            } catch (RemoteException e6) {
                throw new RuntimeException(e6);
            }
        }
        jVar.b(1);
    }

    public void onEnterAmbient(Bundle bundle) {
        m.e("onEnterAmbient() must be called on the main thread");
        s5.m mVar = this.zza.f48963a;
        if (mVar != null) {
            mVar.getClass();
            try {
                Bundle bundle2 = new Bundle();
                w7.d.b(bundle, bundle2);
                w7.g gVar = (w7.g) mVar.f47094c;
                Parcel M0 = gVar.M0();
                g7.b.b(M0, bundle2);
                gVar.Q0(M0, 10);
                w7.d.b(bundle2, bundle);
            } catch (RemoteException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    public void onExitAmbient() {
        m.e("onExitAmbient() must be called on the main thread");
        s5.m mVar = this.zza.f48963a;
        if (mVar != null) {
            mVar.getClass();
            try {
                w7.g gVar = (w7.g) mVar.f47094c;
                gVar.Q0(gVar.M0(), 11);
            } catch (RemoteException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    public void onLowMemory() {
        s5.m mVar = this.zza.f48963a;
        if (mVar != null) {
            try {
                w7.g gVar = (w7.g) mVar.f47094c;
                gVar.Q0(gVar.M0(), 6);
            } catch (RemoteException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    public void onPause() {
        j jVar = this.zza;
        s5.m mVar = jVar.f48963a;
        if (mVar != null) {
            try {
                w7.g gVar = (w7.g) mVar.f47094c;
                gVar.Q0(gVar.M0(), 4);
                return;
            } catch (RemoteException e6) {
                throw new RuntimeException(e6);
            }
        }
        jVar.b(5);
    }

    public void onResume() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new l6.d(jVar, 1));
    }

    public void onSaveInstanceState(Bundle bundle) {
        j jVar = this.zza;
        s5.m mVar = jVar.f48963a;
        if (mVar != null) {
            try {
                Bundle bundle2 = new Bundle();
                w7.d.b(bundle, bundle2);
                w7.g gVar = (w7.g) mVar.f47094c;
                Parcel M0 = gVar.M0();
                g7.b.b(M0, bundle2);
                Parcel L0 = gVar.L0(M0, 7);
                if (L0.readInt() != 0) {
                    bundle2.readFromParcel(L0);
                }
                L0.recycle();
                w7.d.b(bundle2, bundle);
                return;
            } catch (RemoteException e6) {
                throw new RuntimeException(e6);
            }
        }
        Bundle bundle3 = jVar.f48964b;
        if (bundle3 != null) {
            bundle.putAll(bundle3);
        }
    }

    public void onStart() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new l6.d(jVar, 0));
    }

    public void onStop() {
        j jVar = this.zza;
        s5.m mVar = jVar.f48963a;
        if (mVar != null) {
            try {
                w7.g gVar = (w7.g) mVar.f47094c;
                gVar.Q0(gVar.M0(), 13);
                return;
            } catch (RemoteException e6) {
                throw new RuntimeException(e6);
            }
        }
        jVar.b(4);
    }
}
