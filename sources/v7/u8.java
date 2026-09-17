package v7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class u8 {
    public static final Object a(Task task, kd.c cVar) {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (!task.isCanceled()) {
                    return task.getResult();
                }
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            throw exception;
        }
        zd.m mVar = new zd.m(1, t8.b(cVar));
        mVar.s();
        task.addOnCompleteListener(je.a.f13648a, new a4.m(mVar, 27));
        Object r10 = mVar.r();
        jd.a aVar = jd.a.f13640a;
        return r10;
    }
}
