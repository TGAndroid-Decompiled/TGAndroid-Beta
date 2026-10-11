package qf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f46229a;
    public final sf.a f46230b;
    public String f46231c;
    public int d;
    public int f46232e = 0;
    public boolean f46233f = false;
    public f0 f46234g;
    public int h;
    public int f46235i;
    public View f46236j;
    public View f46237k;

    public d(Activity activity, sf.a aVar) {
        this.f46229a = activity;
        this.f46230b = aVar;
    }

    public final e a() {
        Activity activity = this.f46229a;
        if (activity instanceof rf.a) {
            return new e(((LaunchActivity) ((rf.a) activity)).m0, this);
        }
        return null;
    }
}
