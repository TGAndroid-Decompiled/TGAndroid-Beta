package pf;

import android.app.Activity;
import android.view.View;
import i2.e0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f40779a;
    public final rf.a f40780b;
    public String f40781c;
    public int d;
    public int e = 0;
    public boolean f40782f = false;
    public e0 f40783g;
    public int h;
    public int f40784i;
    public View f40785j;
    public View f40786k;

    public d(Activity activity, rf.a aVar) {
        this.f40779a = activity;
        this.f40780b = aVar;
    }

    public final e a() {
        Activity activity = this.f40779a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
