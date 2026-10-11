package qf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f46263a;
    public final sf.a f46264b;
    public String f46265c;
    public int d;
    public int f46266e = 0;
    public boolean f46267f = false;
    public f0 f46268g;
    public int h;
    public int f46269i;
    public View f46270j;
    public View f46271k;

    public d(Activity activity, sf.a aVar) {
        this.f46263a = activity;
        this.f46264b = aVar;
    }

    public final e a() {
        Activity activity = this.f46263a;
        if (activity instanceof rf.a) {
            return new e(((LaunchActivity) ((rf.a) activity)).m0, this);
        }
        return null;
    }
}
