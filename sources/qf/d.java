package qf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f44370a;
    public final sf.a f44371b;
    public String f44372c;
    public int d;
    public int f44373e = 0;
    public boolean f44374f = false;
    public f0 f44375g;
    public int h;
    public int f44376i;
    public View f44377j;
    public View f44378k;

    public d(Activity activity, sf.a aVar) {
        this.f44370a = activity;
        this.f44371b = aVar;
    }

    public final e a() {
        Activity activity = this.f44370a;
        if (activity instanceof rf.a) {
            return new e(((LaunchActivity) ((rf.a) activity)).m0, this);
        }
        return null;
    }
}
