package pf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f41051a;
    public final rf.a f41052b;
    public String f41053c;
    public int d;
    public int e = 0;
    public boolean f41054f = false;
    public f0 f41055g;
    public int h;
    public int f41056i;
    public View f41057j;
    public View f41058k;

    public d(Activity activity, rf.a aVar) {
        this.f41051a = activity;
        this.f41052b = aVar;
    }

    public final e a() {
        Activity activity = this.f41051a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
