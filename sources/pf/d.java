package pf;

import android.app.Activity;
import android.view.View;
import i2.e0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f39909a;
    public final rf.a f39910b;
    public String f39911c;
    public int d;
    public int e = 0;
    public boolean f39912f = false;
    public e0 f39913g;
    public int h;
    public int f39914i;
    public View f39915j;
    public View f39916k;

    public d(Activity activity, rf.a aVar) {
        this.f39909a = activity;
        this.f39910b = aVar;
    }

    public final e a() {
        Activity activity = this.f39909a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
