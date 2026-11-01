package vh;

import android.content.Context;
import android.content.Intent;
public final class i9 implements org.telegram.ui.ActionBar.u1 {
    public final int f51302a;
    public final Context f51303b;

    public i9(Context context, int i10) {
        this.f51302a = i10;
        this.f51303b = context;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f51302a) {
            case 0:
                try {
                    this.f51303b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f51303b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
