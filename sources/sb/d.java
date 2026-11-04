package sb;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.HashMap;
import java.util.concurrent.Callable;
import w4.f;
import y7.ha;
import y7.ia;
import y7.pa;
import y7.qa;
public final class d implements Callable {
    public final int f54696a = 1;
    public final Object f54697b;
    public final Object f54698c;

    public d(MobileVisionBase mobileVisionBase, rb.a aVar) {
        this.f54697b = mobileVisionBase;
        this.f54698c = aVar;
    }

    @Override
    public final Object call() {
        ia iaVar;
        int i3 = this.f54696a;
        Object obj = this.f54697b;
        Object obj2 = this.f54698c;
        switch (i3) {
            case 0:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj;
                rb.a aVar = (rb.a) obj2;
                HashMap hashMap = ia.f59159f;
                qa.b();
                int i10 = pa.f59246a;
                qa.b();
                if (!Boolean.parseBoolean("")) {
                    iaVar = ha.h;
                } else {
                    HashMap hashMap2 = ia.f59159f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ia("detectorTaskWithResource#run"));
                    }
                    iaVar = (ia) hashMap2.get("detectorTaskWithResource#run");
                }
                iaVar.a();
                try {
                    Object e10 = mobileVisionBase.f7968b.e(aVar);
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
                return (f) ((ShortcutInfoCompatSaverImpl) obj2).f2311b.get((String) obj);
        }
    }

    public d(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.f54698c = shortcutInfoCompatSaverImpl;
        this.f54697b = str;
    }
}
