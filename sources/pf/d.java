package pf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f41050a;
    public final rf.a f41051b;
    public String f41052c;
    public int d;
    public int e = 0;
    public boolean f41053f = false;
    public f0 f41054g;
    public int h;
    public int f41055i;
    public View f41056j;
    public View f41057k;

    public d(Activity activity, rf.a aVar) {
        this.f41050a = activity;
        this.f41051b = aVar;
    }

    public final e a() {
        Activity activity = this.f41050a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
