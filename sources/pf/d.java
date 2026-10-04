package pf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f44398a;
    public final rf.a f44399b;
    public String f44400c;
    public int d;
    public int f44401e = 0;
    public boolean f44402f = false;
    public f0 f44403g;
    public int h;
    public int f44404i;
    public View f44405j;
    public View f44406k;

    public d(Activity activity, rf.a aVar) {
        this.f44398a = activity;
        this.f44399b = aVar;
    }

    public final e a() {
        Activity activity = this.f44398a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
