package ug;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import b8.ke;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import gi.d7;
import java.util.concurrent.ExecutionException;
public final class m1 implements d7, Continuation {
    public final int f56158a;
    public final String f56159b;

    public m1(ke keVar, String str) {
        this.f56158a = 2;
        this.f56159b = str;
    }

    @Override
    public Bitmap f(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f56159b, options);
    }

    @Override
    public Object then(Task task) {
        switch (this.f56158a) {
            case 1:
                if (task.isSuccessful()) {
                    String str = (String) task.getResult();
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = this.f56159b;
                        if (str.endsWith(str2)) {
                            return str2;
                        }
                    }
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                throw new ExecutionException(task.getException());
            default:
                if (!task.isSuccessful()) {
                    return Tasks.forException(ke.q(task));
                }
                return Tasks.forResult(new Pair((String) task.getResult(), this.f56159b));
        }
    }

    public m1(String str, int i3) {
        this.f56158a = i3;
        this.f56159b = str;
    }
}
