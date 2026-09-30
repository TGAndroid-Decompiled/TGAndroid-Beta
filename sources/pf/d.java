package pf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f41052a;
    public final rf.a f41053b;
    public String f41054c;
    public int d;
    public int e = 0;
    public boolean f41055f = false;
    public f0 f41056g;
    public int h;
    public int f41057i;
    public View f41058j;
    public View f41059k;

    public d(Activity activity, rf.a aVar) {
        this.f41052a = activity;
        this.f41053b = aVar;
    }

    public final e a() {
        Activity activity = this.f41052a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
