package zb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import n6.l;
import qb.j;
import w7.d0;
import x7.j1;
import x7.k2;
import x7.l3;
import x7.m0;
import x7.m4;
import x7.n6;
import x7.y;
public final class c implements b {
    public final Context f54305a;
    public final n6 f54306b;
    public final String f54307c;
    public boolean d;
    public m0 f54308e;

    public c(Context context, yb.a aVar) {
        String str;
        this.f54305a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.f54306b = new n6(1, -1, aVar.f51111a, 1);
        k6.e.f14707b.getClass();
        if (k6.e.a(context) >= 200400000) {
            str = "com.google.android.gms.vision.ica";
        } else {
            str = "com.google.android.gms.vision.dynamite";
        }
        this.f54307c = str;
    }

    @Override
    public final ArrayList a(vb.a aVar) {
        Bitmap createBitmap;
        if (this.f54308e == null) {
            zzb();
        }
        if (this.f54308e != null) {
            int i10 = aVar.f49518e;
            if (i10 != -1) {
                if (i10 != 17) {
                    if (i10 != 35) {
                        if (i10 != 842094169) {
                            throw new mb.a("Unsupported image format", 13);
                        }
                        l.h(null);
                        throw null;
                    }
                    l.h(null);
                    throw null;
                }
                l.h(null);
                throw null;
            }
            Bitmap bitmap = aVar.f49515a;
            l.h(bitmap);
            int i11 = aVar.d;
            int i12 = aVar.f49516b;
            int i13 = aVar.f49517c;
            if (i11 == 0) {
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i12, i13);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate(i11);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i12, i13, matrix, true);
            }
            try {
                m0 m0Var = this.f54308e;
                l.h(m0Var);
                x6.b bVar = new x6.b(createBitmap);
                Parcel N0 = m0Var.N0();
                int i14 = y.f51037a;
                N0.writeStrongBinder(bVar);
                N0.writeInt(1);
                int q6 = d0.q(N0, 20293);
                d0.s(N0, 2, 4);
                N0.writeInt(-1);
                d0.r(N0, q6);
                Parcel P0 = m0Var.P0(N0, 1);
                m4[] m4VarArr = (m4[]) P0.createTypedArray(m4.CREATOR);
                P0.recycle();
                ArrayList arrayList = new ArrayList();
                for (m4 m4Var : m4VarArr) {
                    arrayList.add(new xb.a(m4Var.f50852c, m4Var.d, m4Var.f50851b, m4Var.f50850a));
                }
                return arrayList;
            } catch (RemoteException e7) {
                throw new mb.a("Failed to run legacy image labeler.", e7);
            }
        }
        throw new mb.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        String str = this.f54307c;
        Context context = this.f54305a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.f54308e == null) {
            try {
                IBinder b10 = y6.e.c(context, y6.e.f51723b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
                int i10 = k2.f50832b;
                if (b10 == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                    if (queryLocalInterface instanceof l3) {
                        aVar = (l3) queryLocalInterface;
                    } else {
                        aVar = new a9.a(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 10);
                    }
                }
                m0 V0 = ((j1) aVar).V0(new x6.b(context), this.f54306b);
                this.f54308e = V0;
                if (V0 == null && !this.d) {
                    Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                    j.b(context);
                    this.d = true;
                }
            } catch (RemoteException e7) {
                throw new mb.a("Failed to create legacy image labeler.", e7);
            } catch (y6.b e10) {
                if (!str.equals("com.google.android.gms.vision.dynamite")) {
                    if (!this.d) {
                        Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                        j.b(context);
                        this.d = true;
                        return;
                    }
                    return;
                }
                throw new mb.a("Failed to load deprecated vision dynamite module.", e10);
            }
        }
    }

    @Override
    public final void zzc() {
        m0 m0Var = this.f54308e;
        if (m0Var != null) {
            try {
                m0Var.R0(m0Var.N0(), 2);
            } catch (RemoteException e7) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e7);
            }
            this.f54308e = null;
        }
    }
}
