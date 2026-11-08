package ub;

import a9.h;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import q6.j;
import q6.m;
import sg.i0;
import y7.d6;
import z7.e7;
import z7.f7;
import z7.k7;
import z7.ma;
import z7.oa;
import z7.z6;
public final class a {
    public volatile Bitmap f56489a;
    public final int f56490b;
    public final int f56491c;
    public final int d;
    public final int f56492e;

    public a(int i7, Bitmap bitmap) {
        m.g(bitmap);
        this.f56489a = bitmap;
        this.f56490b = bitmap.getWidth();
        this.f56491c = bitmap.getHeight();
        boolean z9 = true;
        if (i7 != 0 && i7 != 90 && i7 != 180 && i7 != 270) {
            z9 = false;
        }
        m.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z9);
        this.d = i7;
        this.f56492e = -1;
    }

    public static a a(int i7, Bitmap bitmap) {
        ma a10;
        Task task;
        a aVar;
        String a11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(i7, bitmap);
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
        Task task2 = a10.f59896e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a10.f59899i;
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
        obj.f19230c = z6.BITMAP;
        obj.f19229b = e7.BITMAP;
        obj.d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        obj.f19232f = Integer.valueOf(height & Integer.MAX_VALUE);
        obj.f19231e = Integer.valueOf(width & Integer.MAX_VALUE);
        obj.f19228a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        obj.f19233g = Integer.valueOf(i7 & Integer.MAX_VALUE);
        f7 f7Var = new f7(obj);
        ?? obj2 = new Object();
        obj2.f59003c = f7Var;
        i0 i0Var = new i0((d6) obj2);
        if (task.isSuccessful()) {
            a11 = (String) task.getResult();
        } else {
            a11 = j.f53891c.a(a10.f59898g);
        }
        pb.m.f53544a.execute(new h(a10, i0Var, a11));
        return aVar;
    }
}
