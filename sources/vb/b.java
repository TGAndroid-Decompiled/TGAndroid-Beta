package vb;

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
import mb.j;
import p6.m;
import z7.j1;
import z7.k2;
import z7.l0;
import z7.l3;
import z7.m4;
import z7.n6;
import z7.x;
public final class b implements a {
    public final Context f56502a;
    public final n6 f56503b;
    public final String f56504c;
    public boolean d;
    public l0 f56505e;

    public b(Context context, ub.a aVar) {
        String str;
        this.f56502a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.f56503b = new n6(1, -1, aVar.f55080a, 1);
        m6.e.f19189b.getClass();
        if (m6.e.a(context) >= 200400000) {
            str = "com.google.android.gms.vision.ica";
        } else {
            str = "com.google.android.gms.vision.dynamite";
        }
        this.f56504c = str;
    }

    @Override
    public final ArrayList a(rb.a aVar) {
        Bitmap createBitmap;
        if (this.f56505e == null) {
            zzb();
        }
        if (this.f56505e != null) {
            int i3 = aVar.f54471e;
            if (i3 != -1) {
                if (i3 != 17) {
                    if (i3 != 35) {
                        if (i3 != 842094169) {
                            throw new ib.a("Unsupported image format", 13);
                        }
                        m.g(null);
                        throw null;
                    }
                    m.g(null);
                    throw null;
                }
                m.g(null);
                throw null;
            }
            Bitmap bitmap = aVar.f54468a;
            m.g(bitmap);
            int i10 = aVar.d;
            int i11 = aVar.f54469b;
            int i12 = aVar.f54470c;
            if (i10 == 0) {
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate(i10);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
            }
            try {
                l0 l0Var = this.f56505e;
                m.g(l0Var);
                z6.b bVar = new z6.b(createBitmap);
                Parcel P0 = l0Var.P0();
                int i13 = x.f60126a;
                P0.writeStrongBinder(bVar);
                P0.writeInt(1);
                int s6 = j8.a.s(P0, 20293);
                j8.a.r(P0, 2, 4);
                P0.writeInt(-1);
                j8.a.t(P0, s6);
                Parcel R0 = l0Var.R0(P0, 1);
                m4[] m4VarArr = (m4[]) R0.createTypedArray(m4.CREATOR);
                R0.recycle();
                ArrayList arrayList = new ArrayList();
                for (m4 m4Var : m4VarArr) {
                    arrayList.add(new tb.a(m4Var.f59952c, m4Var.d, m4Var.f59951b, m4Var.f59950a));
                }
                return arrayList;
            } catch (RemoteException e10) {
                throw new ib.a("Failed to run legacy image labeler.", e10);
            }
        }
        throw new ib.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        String str = this.f56504c;
        Context context = this.f56502a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.f56505e == null) {
            try {
                IBinder b10 = a7.f.c(context, a7.f.f141b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
                int i3 = k2.f59926b;
                if (b10 == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                    if (queryLocalInterface instanceof l3) {
                        aVar = (l3) queryLocalInterface;
                    } else {
                        aVar = new b8.a(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 11);
                    }
                }
                l0 X0 = ((j1) aVar).X0(new z6.b(context), this.f56503b);
                this.f56505e = X0;
                if (X0 == null && !this.d) {
                    Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                    j.b(context);
                    this.d = true;
                }
            } catch (a7.b e10) {
                if (!str.equals("com.google.android.gms.vision.dynamite")) {
                    if (!this.d) {
                        Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                        j.b(context);
                        this.d = true;
                        return;
                    }
                    return;
                }
                throw new ib.a("Failed to load deprecated vision dynamite module.", e10);
            } catch (RemoteException e11) {
                throw new ib.a("Failed to create legacy image labeler.", e11);
            }
        }
    }

    @Override
    public final void zzc() {
        l0 l0Var = this.f56505e;
        if (l0Var != null) {
            try {
                l0Var.T0(l0Var.P0(), 2);
            } catch (RemoteException e10) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e10);
            }
            this.f56505e = null;
        }
    }
}
