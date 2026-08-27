package p5;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.t;
import n5.k;

public final class b extends AsyncTask {

    public static final r5.b f45464c = new r5.b("FetchBitmapTask", null);

    public final e f45465a;

    public final af.h f45466b;

    public b(Context context, int i10, int i11, af.h hVar) {
        e eVarY0;
        this.f45466b = hVar;
        Context applicationContext = context.getApplicationContext();
        k kVar = new k(this);
        r5.b bVar = com.google.android.gms.internal.cast.e.f3517a;
        try {
            com.google.android.gms.internal.cast.g gVarB = com.google.android.gms.internal.cast.e.b(applicationContext.getApplicationContext());
            i6.b bVar2 = new i6.b(applicationContext.getApplicationContext());
            Parcel parcelO0 = gVarB.O0(gVarB.M0(), 8);
            int i12 = parcelO0.readInt();
            parcelO0.recycle();
            eVarY0 = i12 >= 233700000 ? gVarB.Y0(bVar2, new i6.b(this), kVar, i10, i11) : gVarB.X0(new i6.b(this), kVar, i10, i11);
        } catch (RemoteException e9) {
            e = e9;
            com.google.android.gms.internal.cast.e.f3517a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVarY0 = null;
        } catch (n5.d e10) {
            e = e10;
            com.google.android.gms.internal.cast.e.f3517a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVarY0 = null;
        }
        this.f45465a = eVarY0;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.f45465a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel parcelM0 = cVar.M0();
                t.c(parcelM0, uri);
                Parcel parcelO0 = cVar.O0(parcelM0, 1);
                Bitmap bitmap = (Bitmap) t.a(parcelO0, Bitmap.CREATOR);
                parcelO0.recycle();
                return bitmap;
            } catch (RemoteException e9) {
                f45464c.a(e9, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        af.h hVar = this.f45466b;
        if (hVar != null) {
            a aVar = (a) hVar.f277e;
            if (aVar != null) {
                aVar.z0(bitmap);
            }
            hVar.d = null;
        }
    }
}
