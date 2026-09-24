package zb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import n6.l;
import qb.j;
import w7.d8;
import w7.f0;
import x7.ja;
import x7.ka;
import x7.la;
import x7.ma;
import x7.na;
import x7.oa;
import x7.y;
public final class a implements b {
    public final Context f49107a;
    public final yb.a f49108b;
    public boolean f49109c;
    public boolean d;
    public ja e;

    public a(Context context, yb.a aVar) {
        this.f49107a = context;
        this.f49108b = aVar;
    }

    @Override
    public final ArrayList a(vb.a aVar) {
        x6.b bVar;
        if (this.e == null) {
            zzb();
        }
        ja jaVar = this.e;
        l.h(jaVar);
        if (!this.f49109c) {
            try {
                jaVar.S0(jaVar.O0(), 1);
                this.f49109c = true;
            } catch (RemoteException e) {
                throw new mb.a("Failed to init thin image labeler.", e);
            }
        }
        int i10 = aVar.e;
        int i11 = aVar.f44549b;
        int i12 = aVar.f44550c;
        int a2 = d8.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 != 35) {
                    if (i13 != 842094169) {
                        throw new mb.a(hg.c.h(aVar.e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new x6.b(null);
                }
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.f44548a;
        l.h(bitmap);
        bVar = new x6.b(bitmap);
        try {
            Parcel O0 = jaVar.O0();
            int i14 = y.f45936a;
            O0.writeStrongBinder(bVar);
            O0.writeInt(1);
            int q6 = f0.q(O0, 20293);
            f0.s(O0, 1, 4);
            O0.writeInt(i10);
            f0.s(O0, 2, 4);
            O0.writeInt(i11);
            f0.s(O0, 3, 4);
            O0.writeInt(i12);
            f0.s(O0, 4, 4);
            O0.writeInt(a2);
            f0.s(O0, 5, 8);
            O0.writeLong(elapsedRealtime);
            f0.r(O0, q6);
            Parcel Q0 = jaVar.Q0(O0, 3);
            ArrayList createTypedArrayList = Q0.createTypedArrayList(na.CREATOR);
            Q0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = createTypedArrayList.get(i15);
                i15++;
                na naVar = (na) obj;
                arrayList.add(new xb.a(naVar.f45794b, naVar.d, naVar.f45793a, naVar.f45795c));
            }
            return arrayList;
        } catch (RemoteException e7) {
            throw new mb.a("Failed to run thin image labeler.", e7);
        }
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        Context context = this.f49107a;
        if (this.e != null) {
            return;
        }
        try {
            IBinder b10 = y6.e.c(context, y6.e.f46587b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = la.f45758b;
            if (b10 == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof ma) {
                    aVar = (ma) queryLocalInterface;
                } else {
                    aVar = new a9.a(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 10);
                }
            }
            this.e = ((ka) aVar).W0(new x6.b(context), new oa(this.f49108b.f46005a, -1));
        } catch (RemoteException e) {
            throw new mb.a("Failed to create thin image labeler.", e);
        } catch (y6.b unused) {
            if (!this.d) {
                j.b(context);
                this.d = true;
            }
            throw new mb.a("Waiting for the label optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override
    public final void zzc() {
        ja jaVar = this.e;
        if (jaVar != null) {
            try {
                jaVar.S0(jaVar.O0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.e = null;
            this.f49109c = false;
        }
    }
}
