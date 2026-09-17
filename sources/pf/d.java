package pf;

import android.app.Activity;
import android.view.View;
import i2.e0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f40805a;
    public final rf.a f40806b;
    public String f40807c;
    public int d;
    public int e = 0;
    public boolean f40808f = false;
    public e0 f40809g;
    public int h;
    public int f40810i;
    public View f40811j;
    public View f40812k;

    public d(Activity activity, rf.a aVar) {
        this.f40805a = activity;
        this.f40806b = aVar;
    }

    public final e a() {
        Activity activity = this.f40805a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
