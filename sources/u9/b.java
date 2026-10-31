package u9;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import c3.k0;
import c3.n;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import m5.e;
import n6.p;
import r0.h0;
import r0.j1;
import r0.m;
import u2.c1;
import x7.g8;
import yc.i;
import z4.g;
public final class b implements wd.b, SuccessContinuation, we.b, m {
    public final int f50193a;
    public Object f50194b;
    public Object f50195c;

    public b(int i10) {
        this.f50193a = i10;
    }

    @Override
    public j1 R0(View view, j1 j1Var) {
        g gVar = (g) this.f50195c;
        j1 g10 = h0.g(view, j1Var);
        if (g10.f46132a.n()) {
            return g10;
        }
        Rect rect = (Rect) this.f50194b;
        rect.left = g10.b();
        rect.top = g10.d();
        rect.right = g10.c();
        rect.bottom = g10.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            j1 b10 = h0.b(gVar.getChildAt(i10), g10);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g10.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public we.a a(e eVar) {
        int i10;
        List list = (List) this.f50195c;
        List list2 = (List) eVar.f13013b;
        if (list2 != null) {
            i10 = list2.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new i(eVar, (List) this.f50194b, list);
    }

    public void b() {
        String str = (String) this.f50194b;
        try {
            ca.c cVar = (ca.c) this.f50195c;
            cVar.getClass();
            new File(cVar.f4084b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    public k0 c(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f50194b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((c1[]) this.f50195c)[i11];
                }
                i11++;
            } else {
                e2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new n();
            }
        }
    }

    @Override
    public java.lang.Object p(wd.c r6, ed.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: u9.b.p(wd.c, ed.c):java.lang.Object");
    }

    @Override
    public Task then(Object obj) {
        ea.c cVar = (ea.c) obj;
        pb.d dVar = (pb.d) this.f50195c;
        if (cVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        g8 g8Var = (g8) dVar.f44903c;
        x9.n.b((x9.n) ((g8) dVar.f44903c).f53165c);
        ((x9.n) g8Var.f53165c).f53477m.w((Executor) this.f50194b, null);
        ((x9.n) g8Var.f53165c).f53481q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f50193a) {
            case 2:
                try {
                    if (((wb.b) this.f50195c) == null) {
                        this.f50195c = ((wb.e) this.f50194b).a();
                    }
                    return ((wb.b) this.f50195c).toString();
                } catch (vb.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public b(int i10, Object obj, Object obj2) {
        this.f50193a = i10;
        this.f50194b = obj;
        this.f50195c = obj2;
    }

    public b(wb.e eVar) {
        this.f50193a = 2;
        this.f50194b = eVar;
    }

    public b(Context context, int i10) {
        this.f50193a = i10;
        switch (i10) {
            case 6:
                this.f50195c = new AtomicLong(-1L);
                this.f50194b = new j(context, p6.b.f44848k, new p("mlkit:vision"), com.google.android.gms.common.api.i.f4346c);
                return;
            default:
                this.f50194b = context;
                this.f50195c = null;
                return;
        }
    }

    public b(pb.d dVar, Executor executor) {
        this.f50193a = 7;
        this.f50195c = dVar;
        this.f50194b = executor;
    }

    public b(g gVar) {
        this.f50193a = 10;
        this.f50195c = gVar;
        this.f50194b = new Rect();
    }
}
