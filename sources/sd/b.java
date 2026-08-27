package sd;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import h7.k6;
import id.m;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.j;
import v0.c;
import v0.i;
import w0.d;

public final class b implements OnCompleteListener, i {

    public final m f47856a;

    public b(m mVar) {
        this.f47856a = mVar;
    }

    @Override
    public void onComplete(Task task) throws IllegalAccessException, InvocationTargetException {
        Exception exception = task.getException();
        m mVar = this.f47856a;
        if (exception != null) {
            mVar.resumeWith(k6.a(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override
    public void onError(Object obj) throws IllegalAccessException, InvocationTargetException {
        d e9 = (d) obj;
        j.e(e9, "e");
        m mVar = this.f47856a;
        if (mVar.w()) {
            mVar.resumeWith(k6.a(e9));
        }
    }

    @Override
    public void onResult(Object obj) throws IllegalAccessException, InvocationTargetException {
        c result = (c) obj;
        j.e(result, "result");
        m mVar = this.f47856a;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }
}
