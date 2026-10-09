package qf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f46149a;
    public final sf.a f46150b;
    public String f46151c;
    public int d;
    public int f46152e = 0;
    public boolean f46153f = false;
    public f0 f46154g;
    public int h;
    public int f46155i;
    public View f46156j;
    public View f46157k;

    public d(Activity activity, sf.a aVar) {
        this.f46149a = activity;
        this.f46150b = aVar;
    }

    public final e a() {
        Activity activity = this.f46149a;
        if (activity instanceof rf.a) {
            return new e(((LaunchActivity) ((rf.a) activity)).m0, this);
        }
        return null;
    }
}
