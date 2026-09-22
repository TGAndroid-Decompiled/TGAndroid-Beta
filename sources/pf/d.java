package pf;

import android.app.Activity;
import android.view.View;
import i2.e0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f41099a;
    public final rf.a f41100b;
    public String f41101c;
    public int d;
    public int e = 0;
    public boolean f41102f = false;
    public e0 f41103g;
    public int h;
    public int f41104i;
    public View f41105j;
    public View f41106k;

    public d(Activity activity, rf.a aVar) {
        this.f41099a = activity;
        this.f41100b = aVar;
    }

    public final e a() {
        Activity activity = this.f41099a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
