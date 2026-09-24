package pf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f41036a;
    public final rf.a f41037b;
    public String f41038c;
    public int d;
    public int e = 0;
    public boolean f41039f = false;
    public f0 f41040g;
    public int h;
    public int f41041i;
    public View f41042j;
    public View f41043k;

    public d(Activity activity, rf.a aVar) {
        this.f41036a = activity;
        this.f41037b = aVar;
    }

    public final e a() {
        Activity activity = this.f41036a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
