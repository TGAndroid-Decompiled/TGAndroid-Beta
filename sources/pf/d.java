package pf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f44399a;
    public final rf.a f44400b;
    public String f44401c;
    public int d;
    public int f44402e = 0;
    public boolean f44403f = false;
    public f0 f44404g;
    public int h;
    public int f44405i;
    public View f44406j;
    public View f44407k;

    public d(Activity activity, rf.a aVar) {
        this.f44399a = activity;
        this.f44400b = aVar;
    }

    public final e a() {
        Activity activity = this.f44399a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
