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
import w7.c0;
import w7.d8;
import x7.ka;
import x7.la;
import x7.ma;
import x7.na;
import x7.oa;
import x7.pa;
import x7.y;
public final class a implements b {
    public final Context f54533a;
    public final yb.a f54534b;
    public boolean f54535c;
    public boolean d;
    public ka f54536e;

    public a(Context context, yb.a aVar) {
        this.f54533a = context;
        this.f54534b = aVar;
    }

    @Override
    public final ArrayList a(vb.a aVar) {
        x6.b bVar;
        if (this.f54536e == null) {
            zzb();
        }
        ka kaVar = this.f54536e;
        m.h(kaVar);
        if (!this.f54535c) {
            try {
                kaVar.R0(kaVar.N0(), 1);
                this.f54535c = true;
            } catch (RemoteException e7) {
                throw new mb.a("Failed to init thin image labeler.", e7);
            }
        }
        int i10 = aVar.f49754e;
        int i11 = aVar.f49752b;
        int i12 = aVar.f49753c;
        int a2 = d8.a(aVar.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = aVar.f49754e;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 != 35) {
                    if (i13 != 842094169) {
                        throw new mb.a(hg.c.i(aVar.f49754e, "Unsupported image format: "), 3);
                    }
                } else {
                    bVar = new x6.b(null);
                }
            }
            m.h(null);
            throw null;
        }
        Bitmap bitmap = aVar.f49751a;
        m.h(bitmap);
        bVar = new x6.b(bitmap);
        try {
            Parcel N0 = kaVar.N0();
            int i14 = y.f51274a;
            N0.writeStrongBinder(bVar);
            N0.writeInt(1);
            int q6 = c0.q(N0, 20293);
            c0.s(N0, 1, 4);
            N0.writeInt(i10);
            c0.s(N0, 2, 4);
            N0.writeInt(i11);
            c0.s(N0, 3, 4);
            N0.writeInt(i12);
            c0.s(N0, 4, 4);
            N0.writeInt(a2);
            c0.s(N0, 5, 8);
            N0.writeLong(elapsedRealtime);
            c0.r(N0, q6);
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
                arrayList.add(new xb.a(oaVar.f51137b, oaVar.d, oaVar.f51136a, oaVar.f51138c));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new mb.a("Failed to run thin image labeler.", e10);
        }
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        Context context = this.f54533a;
        if (this.f54536e != null) {
            return;
        }
        try {
            IBinder b10 = y6.e.c(context, y6.e.f51955b, "com.google.android.gms.vision.ica").b("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
            int i10 = ma.f51094b;
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
            this.f54536e = ((la) aVar).V0(new x6.b(context), new pa(this.f54534b.f51347a, -1));
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
        ka kaVar = this.f54536e;
        if (kaVar != null) {
            try {
                kaVar.R0(kaVar.N0(), 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.f54536e = null;
            this.f54535c = false;
        }
    }
}
