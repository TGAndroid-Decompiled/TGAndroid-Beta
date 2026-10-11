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
import n6.m;
import qb.j;
import w7.d0;
import w7.d8;
import x7.ka;
import x7.la;
import x7.ma;
import x7.na;
import x7.oa;
import x7.pa;
import x7.y;
public final class a implements b {
    public final Context f54388a;
    public final yb.a f54389b;
    public boolean f54390c;
    public boolean d;
    public ka f54391e;

    public a(Context context, yb.a aVar) {
        this.f54388a = context;
        this.f54389b = aVar;
    }

    @Override
    public final ArrayList a(vb.a aVar) {
        x6.b bVar;
        if (this.f54391e == null) {
            zzb();
        }
        ka kaVar = this.f54391e;
        m.h(kaVar);
        if (!this.f54390c) {
            try {
                kaVar.R0(kaVar.N0(), 1);
                this.f54390c = true;
            } catch (RemoteException e7) {
                throw new mb.a("Failed to init thin image labeler.", e7);
            }
        }
        int i10 = aVar.f49605e;
        int i11 = aVar.f49603b;
        int i12 = aVar.f49604c;
        int a2 = d8.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.f49605e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 != 35) {
                    if (i13 != 842094169) {
                        throw new mb.a(hg.c.h(aVar.f49605e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new x6.b(null);
                }
            }
            m.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.f49602a;
        m.h(bitmap);
        bVar = new x6.b(bitmap);
        try {
            Parcel N0 = kaVar.N0();
            int i14 = y.f51125a;
            N0.writeStrongBinder(bVar);
            N0.writeInt(1);
            int q6 = d0.q(N0, 20293);
            d0.s(N0, 1, 4);
            N0.writeInt(i10);
            d0.s(N0, 2, 4);
            N0.writeInt(i11);
            d0.s(N0, 3, 4);
            N0.writeInt(i12);
            d0.s(N0, 4, 4);
            N0.writeInt(a2);
            d0.s(N0, 5, 8);
            N0.writeLong(elapsedRealtime);
            d0.r(N0, q6);
            Parcel P0 = kaVar.P0(N0, 3);
            ArrayList createTypedArrayList = P0.createTypedArrayList(oa.CREATOR);
            P0.recycle();
            ArrayList arrayList = new ArrayList();
            int size = createTypedArrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = createTypedArrayList.get(i15);
                i15++;
                oa oaVar = (oa) obj;
                arrayList.add(new xb.a(oaVar.f50988b, oaVar.d, oaVar.f50987a, oaVar.f50989c));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new mb.a("Failed to run thin image labeler.", e10);
        }
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        Context context = this.f54388a;
        if (this.f54391e != null) {
            return;
        }
        try {
            IBinder b10 = y6.e.c(context, y6.e.f51810b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = ma.f50945b;
            if (b10 == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                if (queryLocalInterface instanceof na) {
                    aVar = (na) queryLocalInterface;
                } else {
                    aVar = new a9.a(b10, "com.google.mlkit.vision.label.aidls.IImageLabelerCreator", 10);
                }
            }
            this.f54391e = ((la) aVar).V0(new x6.b(context), new pa(this.f54389b.f51198a, -1));
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
        ka kaVar = this.f54391e;
        if (kaVar != null) {
            try {
                kaVar.R0(kaVar.N0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.f54391e = null;
            this.f54390c = false;
        }
    }
}
