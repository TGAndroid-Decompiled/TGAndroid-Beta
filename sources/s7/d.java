package s7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.FrameLayout;
import y5.l;

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
        j9.a aVar = jVar.f47812a;
        if (aVar != null) {
            aVar.B(fVar);
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
            jVar.c(bundle, new i6.c(jVar, bundle));
            if (this.zza.f47812a == null) {
                j.a(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        j jVar = this.zza;
        j9.a aVar = jVar.f47812a;
        if (aVar == null) {
            jVar.b(1);
            return;
        }
        try {
            t7.g gVar = (t7.g) aVar.f12864c;
            gVar.Q0(gVar.M0(), 5);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public void onEnterAmbient(Bundle bundle) {
        l.e("onEnterAmbient() must be called on the main thread");
        j9.a aVar = this.zza.f47812a;
        if (aVar != null) {
            aVar.getClass();
            try {
                Bundle bundle2 = new Bundle();
                t7.d.b(bundle, bundle2);
                t7.g gVar = (t7.g) aVar.f12864c;
                Parcel parcelM0 = gVar.M0();
                d7.b.b(parcelM0, bundle2);
                gVar.Q0(parcelM0, 10);
                t7.d.b(bundle2, bundle);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }
    }

    public void onExitAmbient() {
        l.e("onExitAmbient() must be called on the main thread");
        j9.a aVar = this.zza.f47812a;
        if (aVar != null) {
            aVar.getClass();
            try {
                t7.g gVar = (t7.g) aVar.f12864c;
                gVar.Q0(gVar.M0(), 11);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }
    }

    public void onLowMemory() {
        j9.a aVar = this.zza.f47812a;
        if (aVar != null) {
            try {
                t7.g gVar = (t7.g) aVar.f12864c;
                gVar.Q0(gVar.M0(), 6);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }
    }

    public void onPause() {
        j jVar = this.zza;
        j9.a aVar = jVar.f47812a;
        if (aVar == null) {
            jVar.b(5);
            return;
        }
        try {
            t7.g gVar = (t7.g) aVar.f12864c;
            gVar.Q0(gVar.M0(), 4);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public void onResume() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new i6.d(jVar, 1));
    }

    public void onSaveInstanceState(Bundle bundle) {
        j jVar = this.zza;
        j9.a aVar = jVar.f47812a;
        if (aVar == null) {
            Bundle bundle2 = jVar.f47813b;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
                return;
            }
            return;
        }
        try {
            Bundle bundle3 = new Bundle();
            t7.d.b(bundle, bundle3);
            t7.g gVar = (t7.g) aVar.f12864c;
            Parcel parcelM0 = gVar.M0();
            d7.b.b(parcelM0, bundle3);
            Parcel parcelL0 = gVar.L0(parcelM0, 7);
            if (parcelL0.readInt() != 0) {
                bundle3.readFromParcel(parcelL0);
            }
            parcelL0.recycle();
            t7.d.b(bundle3, bundle);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public void onStart() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new i6.d(jVar, 0));
    }

    public void onStop() {
        j jVar = this.zza;
        j9.a aVar = jVar.f47812a;
        if (aVar == null) {
            jVar.b(4);
            return;
        }
        try {
            t7.g gVar = (t7.g) aVar.f12864c;
            gVar.Q0(gVar.M0(), 13);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }
}
