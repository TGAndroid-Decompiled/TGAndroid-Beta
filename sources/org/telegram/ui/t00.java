package org.telegram.ui;

import android.content.DialogInterface;
public final class t00 implements DialogInterface.OnDismissListener {
    public final int f49661a;
    public final x30 f49662b;

    public t00(x30 x30Var, int i3) {
        this.f49661a = i3;
        this.f49662b = x30Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f49661a) {
            case 0:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (this.f49662b.f51778p2 && (T instanceof wm)) {
                    ((wm) T).ta(true, true);
                    return;
                }
                return;
            case 1:
                this.f49662b.dismiss();
                return;
            case 2:
                this.f49662b.f51812w3 = null;
                return;
            default:
                this.f49662b.f51751j2 = null;
                return;
        }
    }
}
