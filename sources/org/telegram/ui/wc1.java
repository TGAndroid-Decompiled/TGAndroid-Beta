package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class wc1 implements OnFailureListener {
    public final int f51033a;
    public final fi.d f51034b;

    public wc1(fi.d dVar, int i7) {
        this.f51033a = i7;
        this.f51034b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f51033a) {
            case 0:
                org.telegram.messenger.a8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f51034b.setLoading(false);
                return;
            default:
                org.telegram.messenger.a8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f51034b.setLoading(false);
                return;
        }
    }
}
