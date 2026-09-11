package w7;

import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public abstract class z {
    public static byte[] a(g2.h hVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        g2.b0 b0Var = new g2.b0(hVar);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        e2.d.i(parse, "The uri must be set.");
        g2.m mVar = new g2.m(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i10 = 0;
        g2.m mVar2 = mVar;
        int i11 = 0;
        while (true) {
            try {
                g2.k kVar = new g2.k(b0Var, mVar2);
                try {
                    byte[] b10 = f9.b.b(kVar);
                    String str2 = e2.d0.f8737a;
                    try {
                        kVar.close();
                    } catch (IOException unused) {
                    }
                    return b10;
                } catch (g2.x e7) {
                    int i12 = e7.d;
                    String str3 = null;
                    if ((i12 == 307 || i12 == 308) && i11 < 5 && (map2 = e7.f10365e) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str3 = (String) list.get(i10);
                    }
                    if (str3 != null) {
                        i11++;
                        g2.l a2 = mVar2.a();
                        a2.f10326e = Uri.parse(str3);
                        mVar2 = a2.d();
                        String str4 = e2.d0.f8737a;
                        try {
                            kVar.close();
                        } catch (IOException unused2) {
                        }
                    } else {
                        throw e7;
                    }
                }
            } catch (Exception e10) {
                throw new n2.v(mVar, b0Var.f10298c, b0Var.f10296a.getResponseHeaders(), b0Var.f10297b, e10);
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
