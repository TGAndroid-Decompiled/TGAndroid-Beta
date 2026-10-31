package w7;

import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import z7.ce;
import z7.fb;
import z7.gb;
import z7.hb;
import z7.xf;
import z7.zf;
public abstract class w7 {
    public static zzd a(tb.d dVar) {
        ub.b bVar = (ub.b) jb.g.c().a(ub.b.class);
        xf b10 = zf.b();
        ?? mobileVisionBase = new MobileVisionBase((ub.d) bVar.f50201a.R0(dVar), (Executor) bVar.f50202b.f9778a.get());
        ?? obj = new Object();
        obj.f12520c = fb.TYPE_THIN;
        u9.b bVar2 = new u9.b(11);
        bVar2.f50195c = dVar.a();
        bVar2.f50194b = gb.NO_ERROR;
        obj.d = new ce(bVar2);
        jb.m.f9797a.execute(new com.google.android.gms.internal.cast.o(b10, new a5.a((m.p3) obj, 1), hb.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, b10.c(), 8));
        return mobileVisionBase;
    }
}
