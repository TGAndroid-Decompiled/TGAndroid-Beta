package yb;

import a8.g0;
import a8.v1;
import a8.w2;
import a8.x3;
import a8.y4;
import a8.y6;
import a8.z0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c8.wb;
import java.util.ArrayList;
import java.util.Locale;
import pb.j;
import q6.m;
public final class b implements a {
    public final Context f59243a;
    public final y6 f59244b;
    public final String f59245c;
    public boolean d;
    public z0 f59246e;

    public b(Context context, xb.a aVar) {
        String str;
        this.f59243a = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.f59244b = new y6(1, -1, aVar.f57549a, 1);
        n6.e.f20498b.getClass();
        if (n6.e.a(context) >= 200400000) {
            str = "com.google.android.gms.vision.ica";
        } else {
            str = "com.google.android.gms.vision.dynamite";
        }
        this.f59245c = str;
    }

    @Override
    public final ArrayList a(ub.a aVar) {
        Bitmap createBitmap;
        if (this.f59246e == null) {
            zzb();
        }
        if (this.f59246e != null) {
            int i7 = aVar.f56401e;
            if (i7 != -1) {
                if (i7 != 17) {
                    if (i7 != 35) {
                        if (i7 != 842094169) {
                            throw new lb.a("Unsupported image format", 13);
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
            Bitmap bitmap = aVar.f56398a;
            m.g(bitmap);
            int i10 = aVar.d;
            int i11 = aVar.f56399b;
            int i12 = aVar.f56400c;
            if (i10 == 0) {
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate(i10);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
            }
            try {
                z0 z0Var = this.f59246e;
                m.g(z0Var);
                a7.b bVar = new a7.b(createBitmap);
                Parcel P0 = z0Var.P0();
                int i13 = g0.f404a;
                P0.writeStrongBinder(bVar);
                P0.writeInt(1);
                int r10 = wb.r(P0, 20293);
                wb.q(P0, 2, 4);
                P0.writeInt(-1);
                wb.s(P0, r10);
                Parcel R0 = z0Var.R0(P0, 1);
                y4[] y4VarArr = (y4[]) R0.createTypedArray(y4.CREATOR);
                R0.recycle();
                ArrayList arrayList = new ArrayList();
                for (y4 y4Var : y4VarArr) {
                    arrayList.add(new wb.a(y4Var.f715c, y4Var.d, y4Var.f714b, y4Var.f713a));
                }
                return arrayList;
            } catch (RemoteException e10) {
                throw new lb.a("Failed to run legacy image labeler.", e10);
            }
        }
        throw new lb.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
    }

    @Override
    public final void zzb() {
        IInterface aVar;
        String str = this.f59245c;
        Context context = this.f59243a;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.f59246e == null) {
            try {
                IBinder b10 = b7.f.c(context, b7.f.f2994b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
                int i7 = w2.f692b;
                if (b10 == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                    if (queryLocalInterface instanceof x3) {
                        aVar = (x3) queryLocalInterface;
                    } else {
                        aVar = new a8.a(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 0);
                    }
                }
                z0 X0 = ((v1) aVar).X0(new a7.b(context), this.f59244b);
                this.f59246e = X0;
                if (X0 == null && !this.d) {
                    Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                    j.b(context);
                    this.d = true;
                }
            } catch (RemoteException e10) {
                throw new lb.a("Failed to create legacy image labeler.", e10);
            } catch (b7.b e11) {
                if (!str.equals("com.google.android.gms.vision.dynamite")) {
                    if (!this.d) {
                        Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                        j.b(context);
                        this.d = true;
                        return;
                    }
                    return;
                }
                throw new lb.a("Failed to load deprecated vision dynamite module.", e11);
            }
        }
    }

    @Override
    public final void zzc() {
        z0 z0Var = this.f59246e;
        if (z0Var != null) {
            try {
                z0Var.T0(z0Var.P0(), 2);
            } catch (RemoteException e10) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e10);
            }
            this.f59246e = null;
        }
    }
}
