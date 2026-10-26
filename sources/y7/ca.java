package y7;

import a8.gg;
import a8.hg;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class ca {
    public static r f52098k;
    public static final w f52099l;
    public final String f52100a;
    public final String f52101b;
    public final aa f52102c;
    public final sb.k d;
    public final Task e;
    public final Task f52103f;
    public final String f52104g;
    public final int h;
    public final HashMap f52105i = new HashMap();
    public final HashMap f52106j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f52099l = new w(objArr);
    }

    public ca(Context context, sb.k kVar, aa aaVar) {
        int i10;
        this.f52100a = context.getPackageName();
        this.f52101b = sb.c.a(context);
        this.d = kVar;
        this.f52102c = aaVar;
        fa.b();
        this.f52104g = "play-services-mlkit-image-labeling";
        sb.f a2 = sb.f.a();
        gg ggVar = new gg(this, 9);
        a2.getClass();
        this.e = sb.f.b(ggVar);
        sb.f a10 = sb.f.a();
        kVar.getClass();
        hg hgVar = new hg(kVar, 4);
        a10.getClass();
        this.f52103f = sb.f.b(hgVar);
        w wVar = f52099l;
        if (wVar.containsKey("play-services-mlkit-image-labeling")) {
            i10 = z6.e.d(context, (String) wVar.get("play-services-mlkit-image-labeling"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return o6.i.f19141c.a(this.f52104g);
    }

    public final boolean c(m7 m7Var, long j10) {
        HashMap hashMap = this.f52105i;
        if (hashMap.get(m7Var) == null || j10 - ((Long) hashMap.get(m7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
