package w7;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public abstract class a0 {
    public static n2.w a(g2.h hVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        g2.b0 b0Var = new g2.b0(hVar);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        v7.u6.l(parse, "The uri must be set.");
        g2.m mVar = new g2.m(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i10 = 0;
        g2.m mVar2 = mVar;
        while (true) {
            try {
                g2.k kVar = new g2.k(b0Var, mVar2);
                try {
                    byte[] b10 = f9.f.b(kVar);
                    u2.u uVar = new u2.u(mVar, b0Var.f10766c, b0Var.d, SystemClock.elapsedRealtime(), 0L, b10.length);
                    mi.q qVar = new mi.q(b10);
                    qVar.f16976c = uVar;
                    n2.w wVar = new n2.w(qVar);
                    String str2 = e2.m0.f8254a;
                    try {
                        kVar.close();
                    } catch (IOException unused) {
                    }
                    return wVar;
                } catch (g2.x e) {
                    int i11 = e.f10824c;
                    String str3 = null;
                    if ((i11 == 307 || i11 == 308) && i10 < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str3 = (String) list.get(0);
                    }
                    if (str3 != null) {
                        i10++;
                        g2.l a2 = mVar2.a();
                        a2.e = Uri.parse(str3);
                        mVar2 = a2.d();
                        String str4 = e2.m0.f8254a;
                        try {
                            kVar.close();
                        } catch (IOException unused2) {
                        }
                    } else {
                        throw e;
                    }
                }
            } catch (Exception e7) {
                throw new n2.x(mVar, b0Var.f10766c, b0Var.f10764a.getResponseHeaders(), b0Var.f10765b, e7);
            }
        }
    }

    public static boolean b(Throwable th2) {
        if (Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(")) {
            return true;
        }
        return false;
    }

    public static boolean c(Throwable th2) {
        if (Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(")) {
            return true;
        }
        return false;
    }
}
