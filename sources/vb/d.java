package vb;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.HashMap;
import java.util.concurrent.Callable;
import x4.f;
import z7.ha;
import z7.ia;
import z7.pa;
import z7.qa;
public final class d implements Callable {
    public final int f57312a = 1;
    public final Object f57313b;
    public final Object f57314c;

    public d(MobileVisionBase mobileVisionBase, ub.a aVar) {
        this.f57313b = mobileVisionBase;
        this.f57314c = aVar;
    }

    @Override
    public final Object call() {
        ia iaVar;
        int i7 = this.f57312a;
        Object obj = this.f57313b;
        Object obj2 = this.f57314c;
        switch (i7) {
            case 0:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj;
                ub.a aVar = (ub.a) obj2;
                HashMap hashMap = ia.f59835f;
                qa.b();
                int i10 = pa.f59922a;
                qa.b();
                if (!Boolean.parseBoolean("")) {
                    iaVar = ha.h;
                } else {
                    HashMap hashMap2 = ia.f59835f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ia("detectorTaskWithResource#run"));
                    }
                    iaVar = (ia) hashMap2.get("detectorTaskWithResource#run");
                }
                iaVar.a();
                try {
                    Object e10 = mobileVisionBase.f7913b.e(aVar);
                    iaVar.close();
                    return e10;
                } catch (Throwable th2) {
                    try {
                        iaVar.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
            default:
                return (f) ((ShortcutInfoCompatSaverImpl) obj2).f2879b.get((String) obj);
        }
    }

    public d(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.f57314c = shortcutInfoCompatSaverImpl;
        this.f57313b = str;
    }
}
