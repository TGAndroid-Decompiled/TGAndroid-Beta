package r5;

import a5.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.u;
public final class b extends AsyncTask {
    public static final s5.b f47039c = new s5.b("FetchBitmapTask", null);
    public final e f47040a;
    public final j f47041b;

    public b(Context context, int i10, int i11, j jVar) {
        e eVar;
        this.f47041b = jVar;
        Context applicationContext = context.getApplicationContext();
        p5.j jVar2 = new p5.j(this);
        s5.b bVar = com.google.android.gms.internal.cast.e.f4087a;
        try {
            com.google.android.gms.internal.cast.g b10 = com.google.android.gms.internal.cast.e.b(applicationContext.getApplicationContext());
            j6.b bVar2 = new j6.b(applicationContext.getApplicationContext());
            Parcel O0 = b10.O0(b10.M0(), 8);
            int readInt = O0.readInt();
            O0.recycle();
            if (readInt >= 233700000) {
                eVar = b10.Y0(bVar2, new j6.b(this), jVar2, i10, i11);
            } else {
                eVar = b10.X0(new j6.b(this), jVar2, i10, i11);
            }
        } catch (RemoteException e10) {
            e = e10;
            com.google.android.gms.internal.cast.e.f4087a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.f47040a = eVar;
        } catch (p5.d e11) {
            e = e11;
            com.google.android.gms.internal.cast.e.f4087a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            eVar = null;
            this.f47040a = eVar;
        }
        this.f47040a = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.f47040a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel M0 = cVar.M0();
                u.c(M0, uri);
                Parcel O0 = cVar.O0(M0, 1);
                Bitmap bitmap = (Bitmap) u.a(O0, Bitmap.CREATOR);
                O0.recycle();
                return bitmap;
            } catch (RemoteException e10) {
                f47039c.a(e10, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        j jVar = this.f47041b;
        if (jVar != null) {
            a aVar = (a) jVar.f214e;
            if (aVar != null) {
                aVar.o0(bitmap);
            }
            jVar.d = null;
        }
    }
}
