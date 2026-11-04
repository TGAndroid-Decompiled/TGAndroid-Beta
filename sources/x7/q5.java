package x7;

import b8.cg;
import b8.hg;
import b8.ie;
import b8.kg;
import b8.lb;
import b8.nb;
import b8.ob;
import b8.og;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
public abstract class q5 {
    public static zzd a(wb.d dVar) {
        xb.b bVar = (xb.b) mb.g.c().a(xb.b.class);
        hg e10 = og.e();
        ?? mobileVisionBase = new MobileVisionBase((xb.d) bVar.f58596a.R0(dVar), (Executor) bVar.f58597b.f19226a.get());
        fa.f fVar = new fa.f(1);
        fVar.d = lb.TYPE_THIN;
        ?? obj = new Object();
        obj.f53182b = dVar.a();
        obj.f53181a = nb.NO_ERROR;
        fVar.f11541e = new ie(obj);
        mb.m.f19245a.execute(new cg(e10, new kg(fVar, 1), ob.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, e10.c(), 0));
        return mobileVisionBase;
    }
}
