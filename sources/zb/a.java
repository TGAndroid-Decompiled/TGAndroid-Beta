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
import w7.c8;
import w7.e0;
import x7.ja;
import x7.ka;
import x7.la;
import x7.ma;
import x7.na;
import x7.oa;
import x7.y;
public final class a implements b {
    public final Context f51494a;
    public final yb.a f51495b;
    public boolean f51496c;
    public boolean d;
    public ja f51497e;

    public a(Context context, yb.a aVar) {
        this.f51494a = context;
        this.f51495b = aVar;
    }

    @Override
    public final ArrayList a(vb.a aVar) {
        x6.b bVar;
        if (this.f51497e == null) {
            zzb();
        }
        ja jaVar = this.f51497e;
        l.h(jaVar);
        if (!this.f51496c) {
            try {
                jaVar.S0(jaVar.O0(), 1);
                this.f51496c = true;
            } catch (RemoteException e7) {
                throw new mb.a("Failed to init thin image labeler.", e7);
            }
        }
        int i10 = aVar.f47771e;
        int i11 = aVar.f47769b;
        int i12 = aVar.f47770c;
        int a2 = c8.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.f47771e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 != 35) {
                    if (i13 != 842094169) {
                        throw new mb.a(i2.g.i(aVar.f47771e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new x6.b(null);
                }
            }
            l.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.f47768a;
        l.h(bitmap);
        bVar = new x6.b(bitmap);
        try {
            Parcel O0 = jaVar.O0();
            int i14 = y.f49262a;
            O0.writeStrongBinder(bVar);
            O0.writeInt(1);
            int q6 = e0.q(O0, 20293);
            e0.s(O0, 1, 4);
            O0.writeInt(i10);
            e0.s(O0, 2, 4);
            O0.writeInt(i11);
            e0.s(O0, 3, 4);
            O0.writeInt(i12);
            e0.s(O0, 4, 4);
            O0.writeInt(a2);
            e0.s(O0, 5, 8);
            O0.writeLong(elapsedRealtime);
            e0.r(O0, q6);
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
                arrayList.add(new xb.a(naVar.f49110b, naVar.d, naVar.f49109a, naVar.f49111c));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new mb.a("Failed to run thin image labeler.", e10);
        }
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        Context context = this.f51494a;
        if (this.f51497e != null) {
            return;
        }
        try {
            IBinder b10 = y6.e.c(context, y6.e.f49545b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = la.f49070b;
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
            this.f51497e = ((ka) aVar).W0(new x6.b(context), new oa(this.f51495b.f49335a, -1));
        } catch (RemoteException e7) {
            throw new mb.a("Failed to create thin image labeler.", e7);
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
        ja jaVar = this.f51497e;
        if (jaVar != null) {
            try {
                jaVar.S0(jaVar.O0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.f51497e = null;
            this.f51496c = false;
        }
    }
}
