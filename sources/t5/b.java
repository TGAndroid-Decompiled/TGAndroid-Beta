package t5;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import c5.j;
import com.google.android.gms.internal.cast.s;
public final class b extends AsyncTask {
    public static final u5.b f47982c = new u5.b("FetchBitmapTask", null);
    public final e f47983a;
    public final j f47984b;

    public b(Context context, int i10, int i11, j jVar) {
        e eVar;
        this.f47984b = jVar;
        Context applicationContext = context.getApplicationContext();
        r5.j jVar2 = new r5.j(this);
        u5.b bVar = com.google.android.gms.internal.cast.d.f2974a;
        try {
            com.google.android.gms.internal.cast.f b10 = com.google.android.gms.internal.cast.d.b(applicationContext.getApplicationContext());
            l6.b bVar2 = new l6.b(applicationContext.getApplicationContext());
            Parcel O0 = b10.O0(b10.M0(), 8);
            int readInt = O0.readInt();
            O0.recycle();
            if (readInt >= 233700000) {
                eVar = b10.Y0(bVar2, new l6.b(this), jVar2, i10, i11);
            } else {
                eVar = b10.X0(new l6.b(this), jVar2, i10, i11);
            }
        } catch (RemoteException e6) {
            e = e6;
            com.google.android.gms.internal.cast.d.f2974a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.f47983a = eVar;
        } catch (r5.d e10) {
            e = e10;
            com.google.android.gms.internal.cast.d.f2974a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            eVar = null;
            this.f47983a = eVar;
        }
        this.f47983a = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.f47983a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel M0 = cVar.M0();
                s.c(M0, uri);
                Parcel O0 = cVar.O0(M0, 1);
                Bitmap bitmap = (Bitmap) s.a(O0, Bitmap.CREATOR);
                O0.recycle();
                return bitmap;
            } catch (RemoteException e6) {
                f47982c.a(e6, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        j jVar = this.f47984b;
        if (jVar != null) {
            a aVar = (a) jVar.f2318e;
            if (aVar != null) {
                aVar.t(bitmap);
            }
            jVar.d = null;
        }
    }
}
