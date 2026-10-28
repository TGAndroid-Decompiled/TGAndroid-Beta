package xb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import m4.c;
import o6.i;
import o6.l;
import s4.d;
import sb.m;
import x7.e7;
import x7.f7;
import x7.k7;
import x7.ma;
import x7.oa;
import x7.z6;
public final class a {
    public volatile Bitmap f51765a;
    public final int f51766b;
    public final int f51767c;
    public final int d;
    public final int e;

    public a(Bitmap bitmap, int i10) {
        l.h(bitmap);
        this.f51765a = bitmap;
        this.f51766b = bitmap.getWidth();
        this.f51767c = bitmap.getHeight();
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            z10 = false;
        }
        l.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z10);
        this.d = i10;
        this.e = -1;
    }

    public static a a(Bitmap bitmap, int i10) {
        ma a2;
        Task task;
        a aVar;
        String a10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(bitmap, i10);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (oa.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = oa.a(new Object());
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        k7 k7Var = k7.INPUT_IMAGE_CONSTRUCTION;
        Task task2 = a2.e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a2.f51646i;
        if (hashMap.get(k7Var) == null) {
            task = task2;
            aVar = aVar2;
        } else {
            task = task2;
            aVar = aVar2;
            if (elapsedRealtime3 - ((Long) hashMap.get(k7Var)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
                return aVar;
            }
        }
        hashMap.put(k7Var, Long.valueOf(elapsedRealtime3));
        ?? obj = new Object();
        obj.f17845c = z6.BITMAP;
        obj.f17844b = e7.BITMAP;
        obj.d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        obj.f17846f = Integer.valueOf(height & Integer.MAX_VALUE);
        obj.e = Integer.valueOf(width & Integer.MAX_VALUE);
        obj.f17843a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        obj.h = Integer.valueOf(i10 & Integer.MAX_VALUE);
        f7 f7Var = new f7(obj);
        d dVar = new d(13, false);
        dVar.d = f7Var;
        c cVar = new c(dVar);
        if (task.isSuccessful()) {
            a10 = (String) task.getResult();
        } else {
            a10 = i.f19140c.a(a2.f51645g);
        }
        m.f48102a.execute(new q1(a2, cVar, a10));
        return aVar;
    }
}
