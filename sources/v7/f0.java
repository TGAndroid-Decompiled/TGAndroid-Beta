package v7;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import z7.ce;
import z7.fb;
import z7.gb;
import z7.hb;
import z7.wf;
import z7.zf;
public abstract class f0 {
    public static zzd a(bc.e eVar) {
        cc.b bVar = (cc.b) rb.g.c().a(cc.b.class);
        wf b10 = zf.b();
        ?? mobileVisionBase = new MobileVisionBase((cc.f) bVar.f5089a.R0(eVar), (Executor) bVar.f5090b.f45603a.get());
        ?? obj = new Object();
        obj.f16399c = fb.TYPE_THIN;
        ?? obj2 = new Object();
        obj2.f51134b = eVar.a();
        obj2.f51133a = gb.NO_ERROR;
        obj.d = new ce(obj2);
        rb.m.f45622a.execute(new com.google.android.gms.internal.cast.p(b10, new a5.a((m.s3) obj, 1), hb.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, b10.c(), 8));
        return mobileVisionBase;
    }
}
