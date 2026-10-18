package v7;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import z7.de;
import z7.gb;
import z7.hb;
import z7.ib;
import z7.xf;
import z7.zf;
public abstract class f0 {
    public static zzd a(bc.e eVar) {
        cc.b bVar = (cc.b) rb.g.c().a(cc.b.class);
        xf b10 = zf.b();
        ?? mobileVisionBase = new MobileVisionBase((cc.f) bVar.f5087a.R0(eVar), (Executor) bVar.f5088b.f45180a.get());
        ?? obj = new Object();
        obj.f16335c = gb.TYPE_THIN;
        ?? obj2 = new Object();
        obj2.f49776b = eVar.a();
        obj2.f49775a = hb.NO_ERROR;
        obj.d = new de(obj2);
        rb.m.f45199a.execute(new com.google.android.gms.internal.cast.p(b10, new a5.a((m.s3) obj, 1), ib.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, b10.c(), 8));
        return mobileVisionBase;
    }
}
