package vb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import c5.v;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import n6.i;
import n6.l;
import n6.t;
import qb.m;
import v7.k;
import w7.d7;
import w7.e7;
import w7.j7;
import w7.la;
import w7.na;
import w7.y6;
public final class a {
    public volatile Bitmap f49513a;
    public final int f49514b;
    public final int f49515c;
    public final int d;
    public final int f49516e;

    public a(Bitmap bitmap, int i10) {
        l.h(bitmap);
        this.f49513a = bitmap;
        this.f49514b = bitmap.getWidth();
        this.f49515c = bitmap.getHeight();
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            z10 = false;
        }
        l.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z10);
        this.d = i10;
        this.f49516e = -1;
    }

    public static a a(Bitmap bitmap, int i10) {
        la a2;
        Task task;
        a aVar;
        String a10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(bitmap, i10);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (na.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = na.a(new Object());
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
        j7 j7Var = j7.INPUT_IMAGE_CONSTRUCTION;
        Task task2 = a2.f50060e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a2.f50063i;
        if (hashMap.get(j7Var) == null) {
            task = task2;
            aVar = aVar2;
        } else {
            task = task2;
            aVar = aVar2;
            if (elapsedRealtime3 - ((Long) hashMap.get(j7Var)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
                return aVar;
            }
        }
        hashMap.put(j7Var, Long.valueOf(elapsedRealtime3));
        ?? obj = new Object();
        obj.f15797c = y6.BITMAP;
        obj.f15796b = d7.BITMAP;
        obj.d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        obj.f15799f = Integer.valueOf(height & Integer.MAX_VALUE);
        obj.f15798e = Integer.valueOf(width & Integer.MAX_VALUE);
        obj.f15795a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        obj.h = Integer.valueOf(i10 & Integer.MAX_VALUE);
        e7 e7Var = new e7(obj);
        k kVar = new k(7, false);
        kVar.d = e7Var;
        t tVar = new t(kVar);
        if (task.isSuccessful()) {
            a10 = (String) task.getResult();
        } else {
            a10 = i.f16667c.a(a2.f50062g);
        }
        m.f46089a.execute(new v(a2, tVar, a10));
        return aVar;
    }
}
