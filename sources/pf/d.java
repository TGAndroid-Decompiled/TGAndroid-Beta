package pf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f41048a;
    public final rf.a f41049b;
    public String f41050c;
    public int d;
    public int e = 0;
    public boolean f41051f = false;
    public f0 f41052g;
    public int h;
    public int f41053i;
    public View f41054j;
    public View f41055k;

    public d(Activity activity, rf.a aVar) {
        this.f41048a = activity;
        this.f41049b = aVar;
    }

    public final e a() {
        Activity activity = this.f41048a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
