package pf;

import android.app.Activity;
import android.view.View;
import i2.e0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f41079a;
    public final rf.a f41080b;
    public String f41081c;
    public int d;
    public int e = 0;
    public boolean f41082f = false;
    public e0 f41083g;
    public int h;
    public int f41084i;
    public View f41085j;
    public View f41086k;

    public d(Activity activity, rf.a aVar) {
        this.f41079a = activity;
        this.f41080b = aVar;
    }

    public final e a() {
        Activity activity = this.f41079a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
