package x9;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import r0.i0;
import r0.l1;
public final class l implements SuccessContinuation, r0.n {
    public Object f48299a;
    public Object f48300b;

    public l(Object obj, Object obj2) {
        this.f48299a = obj;
        this.f48300b = obj2;
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        z4.g gVar = (z4.g) this.f48300b;
        l1 g10 = i0.g(view, l1Var);
        if (g10.f43497a.n()) {
            return g10;
        }
        Rect rect = (Rect) this.f48299a;
        rect.left = g10.b();
        rect.top = g10.d();
        rect.right = g10.c();
        rect.bottom = g10.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            l1 b10 = i0.b(gVar.getChildAt(i10), g10);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g10.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void a() {
        String str = (String) this.f48299a;
        try {
            ca.c cVar = (ca.c) this.f48300b;
            cVar.getClass();
            new File(cVar.f4678b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override
    public Task then(Object obj) {
        ea.a aVar = (ea.a) obj;
        u4.f fVar = (u4.f) this.f48300b;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        n3.b bVar = (n3.b) fVar.f46204c;
        n.b((n) ((n3.b) fVar.f46204c).f15704c);
        ((n) bVar.f15704c).f48313m.y((Executor) this.f48299a, null);
        ((n) bVar.f15704c).f48317q.trySetResult(null);
        return Tasks.forResult(null);
    }
}
