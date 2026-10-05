package pf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f44413a;
    public final rf.a f44414b;
    public String f44415c;
    public int d;
    public int f44416e = 0;
    public boolean f44417f = false;
    public f0 f44418g;
    public int h;
    public int f44419i;
    public View f44420j;
    public View f44421k;

    public d(Activity activity, rf.a aVar) {
        this.f44413a = activity;
        this.f44414b = aVar;
    }

    public final e a() {
        Activity activity = this.f44413a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
