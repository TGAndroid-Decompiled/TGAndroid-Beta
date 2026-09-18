package pf;

import android.app.Activity;
import android.view.View;
import i2.e0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f41038a;
    public final rf.a f41039b;
    public String f41040c;
    public int d;
    public int e = 0;
    public boolean f41041f = false;
    public e0 f41042g;
    public int h;
    public int f41043i;
    public View f41044j;
    public View f41045k;

    public d(Activity activity, rf.a aVar) {
        this.f41038a = activity;
        this.f41039b = aVar;
    }

    public final e a() {
        Activity activity = this.f41038a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
