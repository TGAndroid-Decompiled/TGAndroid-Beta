package u2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.firebase.messaging.m;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import n2.b0;
import t9.d;
import v2.f;
import v2.g;
import v2.h;
import v2.i;
import v2.j;
import v2.k;
import v2.l;
import v2.n;
import v2.o;
import v2.q;
import v2.r;
import v2.s;
import v2.t;
import v2.u;
import v2.v;
import x2.e;

public final class c implements e {

    public final b0 f48264a;

    public final ConnectivityManager f48265b;

    public final Context f48266c;
    public final URL d;

    public final f3.a f48267e;

    public final f3.a f48268f;

    public final int f48269g;

    public c(Context context, f3.a aVar, f3.a aVar2) {
        d dVar = new d();
        v2.c cVar = v2.c.f48685a;
        dVar.d(o.class, cVar);
        dVar.d(i.class, cVar);
        f fVar = f.f48696a;
        dVar.d(s.class, fVar);
        dVar.d(l.class, fVar);
        v2.d dVar2 = v2.d.f48687a;
        dVar.d(q.class, dVar2);
        dVar.d(j.class, dVar2);
        v2.b bVar = v2.b.f48674a;
        dVar.d(v2.a.class, bVar);
        dVar.d(h.class, bVar);
        v2.e eVar = v2.e.f48690a;
        dVar.d(r.class, eVar);
        dVar.d(k.class, eVar);
        g gVar = g.f48702a;
        dVar.d(v.class, gVar);
        dVar.d(n.class, gVar);
        dVar.d = true;
        this.f48264a = new b0(dVar, 22);
        this.f48266c = context;
        this.f48265b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f48256c);
        this.f48267e = aVar2;
        this.f48268f = aVar;
        this.f48269g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e9) {
            throw new IllegalArgumentException(s3.c.e("Invalid url: ", str), e9);
        }
    }

    public final w2.h a(w2.h hVar) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.f48265b.getActiveNetworkInfo();
        m mVarC = hVar.c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) mVarC.f4606f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i10));
        mVarC.c("model", Build.MODEL);
        mVarC.c("hardware", Build.HARDWARE);
        mVarC.c("device", Build.DEVICE);
        mVarC.c("product", Build.PRODUCT);
        mVarC.c("os-uild", Build.ID);
        mVarC.c("manufacturer", Build.MANUFACTURER);
        mVarC.c("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) mVarC.f4606f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f48735a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) mVarC.f4606f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f48733a;
                subtype = 100;
            } else if (((t) t.f48733a.get(subtype)) == null) {
            }
            map = (HashMap) mVarC.f4606f;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            mVarC.c("country", Locale.getDefault().getCountry());
            mVarC.c("locale", Locale.getDefault().getLanguage());
            Context context = this.f48266c;
            mVarC.c("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e9) {
                a.a.b("CctTransportBackend", "Unable to find version code for package", e9);
            }
            mVarC.c("application_build", Integer.toString(i11));
            return mVarC.i();
        }
        SparseArray sparseArray3 = t.f48733a;
        subtype = 0;
        map = (HashMap) mVarC.f4606f;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        mVarC.c("country", Locale.getDefault().getCountry());
        mVarC.c("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f48266c;
        mVarC.c("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i11 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        mVarC.c("application_build", Integer.toString(i11));
        return mVarC.i();
    }
}
