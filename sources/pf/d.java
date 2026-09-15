package pf;

import android.app.Activity;
import android.view.View;
import i2.e0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f40783a;
    public final rf.a f40784b;
    public String f40785c;
    public int d;
    public int e = 0;
    public boolean f40786f = false;
    public e0 f40787g;
    public int h;
    public int f40788i;
    public View f40789j;
    public View f40790k;

    public d(Activity activity, rf.a aVar) {
        this.f40783a = activity;
        this.f40784b = aVar;
    }

    public final e a() {
        Activity activity = this.f40783a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
