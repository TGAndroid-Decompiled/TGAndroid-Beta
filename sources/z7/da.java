package z7;

import android.content.Context;
import b8.dg;
import b8.eg;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class da {
    public static r f59839k;
    public static final w f59840l;
    public final String f59841a;
    public final String f59842b;
    public final ba f59843c;
    public final mb.k d;
    public final Task f59844e;
    public final Task f59845f;
    public final String f59846g;
    public final int h;
    public final HashMap f59847i = new HashMap();
    public final HashMap f59848j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f59840l = new w(objArr);
    }

    public da(Context context, mb.k kVar, ba baVar) {
        int i3;
        this.f59841a = context.getPackageName();
        this.f59842b = mb.c.a(context);
        this.d = kVar;
        this.f59843c = baVar;
        ga.b();
        this.f59846g = "play-services-mlkit-image-labeling";
        mb.f a10 = mb.f.a();
        dg dgVar = new dg(this, 9);
        a10.getClass();
        this.f59844e = mb.f.b(dgVar);
        mb.f a11 = mb.f.a();
        kVar.getClass();
        eg egVar = new eg(kVar, 4);
        a11.getClass();
        this.f59845f = mb.f.b(egVar);
        w wVar = f59840l;
        if (wVar.containsKey("play-services-mlkit-image-labeling")) {
            i3 = a7.f.d(context, (String) wVar.get("play-services-mlkit-image-labeling"), false);
        } else {
            i3 = -1;
        }
        this.h = i3;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.f59844e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return p6.j.f53268c.a(this.f59846g);
    }

    public final boolean c(n7 n7Var, long j10) {
        HashMap hashMap = this.f59847i;
        if (hashMap.get(n7Var) == null || j10 - ((Long) hashMap.get(n7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
