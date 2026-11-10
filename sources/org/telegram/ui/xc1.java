package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class xc1 implements OnFailureListener {
    public final int f51690a;
    public final fi.d f51691b;

    public xc1(fi.d dVar, int i7) {
        this.f51690a = i7;
        this.f51691b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f51690a) {
            case 0:
                org.telegram.messenger.a8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f51691b.setLoading(false);
                return;
            default:
                org.telegram.messenger.a8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f51691b.setLoading(false);
                return;
        }
    }
}
