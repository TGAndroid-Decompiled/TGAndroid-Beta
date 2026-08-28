package xe;

import android.app.Activity;
import android.view.View;
import h3.k0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f49133a;
    public final ze.a f49134b;
    public String f49135c;
    public int d;
    public int f49136e = 0;
    public boolean f49137f = false;
    public k0 f49138g;
    public int h;
    public int f49139i;
    public View f49140j;
    public View f49141k;

    public c(Activity activity, ze.a aVar) {
        this.f49133a = activity;
        this.f49134b = aVar;
    }

    public final d a() {
        Activity activity = this.f49133a;
        if (activity instanceof ye.a) {
            return new d(((LaunchActivity) ((ye.a) activity)).f35512i0, this);
        }
        return null;
    }
}
