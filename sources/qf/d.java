package qf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f44371a;
    public final sf.a f44372b;
    public String f44373c;
    public int d;
    public int f44374e = 0;
    public boolean f44375f = false;
    public f0 f44376g;
    public int h;
    public int f44377i;
    public View f44378j;
    public View f44379k;

    public d(Activity activity, sf.a aVar) {
        this.f44371a = activity;
        this.f44372b = aVar;
    }

    public final e a() {
        Activity activity = this.f44371a;
        if (activity instanceof rf.a) {
            return new e(((LaunchActivity) ((rf.a) activity)).m0, this);
        }
        return null;
    }
}
