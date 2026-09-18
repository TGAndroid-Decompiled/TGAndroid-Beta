package pf;

import android.app.Activity;
import android.view.View;
import i2.e0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f40810a;
    public final rf.a f40811b;
    public String f40812c;
    public int d;
    public int e = 0;
    public boolean f40813f = false;
    public e0 f40814g;
    public int h;
    public int f40815i;
    public View f40816j;
    public View f40817k;

    public d(Activity activity, rf.a aVar) {
        this.f40810a = activity;
        this.f40811b = aVar;
    }

    public final e a() {
        Activity activity = this.f40810a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
