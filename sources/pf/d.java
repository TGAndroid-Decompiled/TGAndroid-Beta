package pf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f41049a;
    public final rf.a f41050b;
    public String f41051c;
    public int d;
    public int e = 0;
    public boolean f41052f = false;
    public f0 f41053g;
    public int h;
    public int f41054i;
    public View f41055j;
    public View f41056k;

    public d(Activity activity, rf.a aVar) {
        this.f41049a = activity;
        this.f41050b = aVar;
    }

    public final e a() {
        Activity activity = this.f41049a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
