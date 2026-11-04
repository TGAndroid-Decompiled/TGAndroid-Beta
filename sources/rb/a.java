package rb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p6.j;
import p6.m;
import p7.d;
import w9.b;
import y7.e7;
import y7.f7;
import y7.k7;
import y7.ma;
import y7.oa;
import y7.z6;
public final class a {
    public volatile Bitmap f54468a;
    public final int f54469b;
    public final int f54470c;
    public final int d;
    public final int f54471e;

    public a(Bitmap bitmap, int i3) {
        m.g(bitmap);
        this.f54468a = bitmap;
        this.f54469b = bitmap.getWidth();
        this.f54470c = bitmap.getHeight();
        boolean z10 = true;
        if (i3 != 0 && i3 != 90 && i3 != 180 && i3 != 270) {
            z10 = false;
        }
        m.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z10);
        this.d = i3;
        this.f54471e = -1;
    }

    public static a a(Bitmap bitmap, int i3) {
        ma a10;
        Task task;
        a aVar;
        String a11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(bitmap, i3);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (oa.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a10 = oa.a(new Object());
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
        Task task2 = a10.f59221e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a10.f59224i;
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
        obj.f18684c = z6.BITMAP;
        obj.f18683b = e7.BITMAP;
        obj.d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        obj.f18686f = Integer.valueOf(height & Integer.MAX_VALUE);
        obj.f18685e = Integer.valueOf(width & Integer.MAX_VALUE);
        obj.f18682a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        obj.f18687g = Integer.valueOf(i3 & Integer.MAX_VALUE);
        f7 f7Var = new f7(obj);
        d dVar = new d(26, false);
        dVar.f53346c = f7Var;
        b bVar = new b(dVar);
        if (task.isSuccessful()) {
            a11 = (String) task.getResult();
        } else {
            a11 = j.f53268c.a(a10.f59223g);
        }
        mb.m.f19245a.execute(new j1(a10, bVar, a11));
        return aVar;
    }
}
