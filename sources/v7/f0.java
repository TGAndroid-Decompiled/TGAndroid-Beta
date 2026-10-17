package v7;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import z7.ag;
import z7.ee;
import z7.hb;
import z7.ib;
import z7.jb;
import z7.yf;
public abstract class f0 {
    public static zzd a(bc.e eVar) {
        cc.b bVar = (cc.b) rb.g.c().a(cc.b.class);
        yf b10 = ag.b();
        ?? mobileVisionBase = new MobileVisionBase((cc.f) bVar.f5086a.R0(eVar), (Executor) bVar.f5087b.f45206a.get());
        ?? obj = new Object();
        obj.f16330c = hb.TYPE_THIN;
        ?? obj2 = new Object();
        obj2.f49798b = eVar.a();
        obj2.f49797a = ib.NO_ERROR;
        obj.d = new ee(obj2);
        rb.m.f45225a.execute(new com.google.android.gms.internal.cast.p(b10, new a5.a((m.s3) obj, 1), jb.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, b10.c(), 8));
        return mobileVisionBase;
    }
}
