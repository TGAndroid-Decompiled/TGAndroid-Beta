package ua;

import a3.s;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e3.i0;
import e3.n;
import i2.l;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.Components.y00;
import org.telegram.ui.lp0;
import org.telegram.ui.xm0;
import tg.t0;
import w2.c1;
import z9.m;
public final class b implements t0, s, SuccessContinuation, zd.b {
    public final int f55782a;
    public Object f55783b;
    public Object f55784c;

    public b(int i3) {
        this.f55782a = i3;
    }

    public static ua.b a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: ua.b.a(android.content.Context):ua.b");
    }

    @Override
    public Object L(Uri uri, l lVar) {
        v2.a aVar = (v2.a) ((s) this.f55783b).L(uri, lVar);
        List list = (List) this.f55784c;
        if (list != null && !list.isEmpty()) {
            return (v2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public void N() {
        lp0 lp0Var = (lp0) this.f55784c;
        lp0Var.f55981p0.f55239a.o();
        lp0Var.V0.setViewHidden(false);
    }

    @Override
    public java.lang.Object U(zd.c r6, hd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: ua.b.U(zd.c, hd.c):java.lang.Object");
    }

    @Override
    public void Z() {
        lp0 lp0Var = (lp0) this.f55784c;
        if (lp0Var.C0 != null) {
            lp0Var.r0(null, true);
        }
        lp0Var.V0.setViewHidden(true);
    }

    public void b() {
        try {
            ((FileLock) this.f55784c).release();
            ((FileChannel) this.f55783b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public i0 c(int i3) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f55783b;
            if (i10 < iArr.length) {
                if (i3 == iArr[i10]) {
                    return ((c1[]) this.f55784c)[i10];
                }
                i10++;
            } else {
                g2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i3);
                return new n();
            }
        }
    }

    @Override
    public void f() {
        ((xm0) this.f55783b).run();
    }

    @Override
    public void k() {
        r0 r0Var = ((lp0) this.f55784c).H0;
        if (r0Var != null) {
            r0Var.invalidate();
        }
    }

    @Override
    public void m() {
        lp0 lp0Var = (lp0) this.f55784c;
        if (lp0Var.U0) {
            lp0Var.U0 = false;
            return;
        }
        lp0Var.f55967d1.b(1);
        lp0Var.C((tg.h) tg.h.f55183a.get(0));
    }

    @Override
    public boolean q() {
        boolean z10;
        lp0 lp0Var = (lp0) this.f55784c;
        if (lp0Var.C0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            lp0Var.r0(null, true);
        }
        return z10;
    }

    @Override
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        m mVar = (m) this.f55784c;
        if (!bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
            }
            fa.f fVar = mVar.f60200g;
            for (File file : fa.f.i(((File) fVar.d).listFiles(m.f60193r))) {
                file.delete();
            }
            fa.f fVar2 = mVar.f60205m.f60258b.f11535b;
            fa.d.b(fa.f.i(((File) fVar2.f11542f).listFiles()));
            fa.d.b(fa.f.i(((File) fVar2.h).listFiles()));
            fa.d.b(fa.f.i(((File) fVar2.f11543n).listFiles()));
            mVar.f60209q.trySetResult(null);
            return Tasks.forResult(null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
        }
        boolean booleanValue = bool.booleanValue();
        z9.s sVar = mVar.f60196b;
        if (booleanValue) {
            sVar.h.trySetResult(null);
            return ((Task) this.f55783b).onSuccessTask(mVar.f60198e.f286a, new y00(this));
        }
        sVar.getClass();
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public String toString() {
        switch (this.f55782a) {
            case 6:
                try {
                    if (((zb.b) this.f55784c) == null) {
                        this.f55784c = ((zb.e) this.f55783b).a();
                    }
                    return ((zb.b) this.f55784c).toString();
                } catch (yb.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public b(int i3, Object obj, Object obj2) {
        this.f55782a = i3;
        this.f55783b = obj;
        this.f55784c = obj2;
    }

    public b(Object obj, Object obj2, boolean z10, int i3) {
        this.f55782a = i3;
        this.f55784c = obj;
        this.f55783b = obj2;
    }

    public b() {
        this.f55782a = 10;
        this.f55783b = new AtomicInteger();
        this.f55784c = new AtomicInteger();
    }

    public b(zb.e eVar) {
        this.f55782a = 6;
        this.f55783b = eVar;
    }
}
