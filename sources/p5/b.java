package p5;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.u;
import n5.j;
public final class b extends AsyncTask {
    public static final q5.b f45458c = new q5.b("FetchBitmapTask", null);
    public final e f45459a;
    public final b3.b f45460b;

    public b(Context context, int i9, int i10, b3.b bVar) {
        e eVar;
        this.f45460b = bVar;
        Context applicationContext = context.getApplicationContext();
        j jVar = new j(this);
        q5.b bVar2 = com.google.android.gms.internal.cast.e.f3087a;
        try {
            com.google.android.gms.internal.cast.g b10 = com.google.android.gms.internal.cast.e.b(applicationContext.getApplicationContext());
            h6.b bVar3 = new h6.b(applicationContext.getApplicationContext());
            Parcel O0 = b10.O0(b10.M0(), 8);
            int readInt = O0.readInt();
            O0.recycle();
            if (readInt >= 233700000) {
                eVar = b10.Y0(bVar3, new h6.b(this), jVar, i9, i10);
            } else {
                eVar = b10.X0(new h6.b(this), jVar, i9, i10);
            }
        } catch (RemoteException e10) {
            e = e10;
            com.google.android.gms.internal.cast.e.f3087a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.f45459a = eVar;
        } catch (n5.d e11) {
            e = e11;
            com.google.android.gms.internal.cast.e.f3087a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.f45459a = eVar;
        }
        this.f45459a = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.f45459a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel M0 = cVar.M0();
                u.c(M0, uri);
                Parcel O0 = cVar.O0(M0, 1);
                Bitmap bitmap = (Bitmap) u.a(O0, Bitmap.CREATOR);
                O0.recycle();
                return bitmap;
            } catch (RemoteException e10) {
                f45458c.a(e10, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        b3.b bVar = this.f45460b;
        if (bVar != null) {
            a aVar = (a) bVar.f1416e;
            if (aVar != null) {
                aVar.y0(bitmap);
            }
            bVar.d = null;
        }
    }
}
