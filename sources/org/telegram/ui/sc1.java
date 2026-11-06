package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class sc1 implements OnFailureListener {
    public final int f49748a;
    public final fi.d f49749b;

    public sc1(fi.d dVar, int i7) {
        this.f49748a = i7;
        this.f49749b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f49748a) {
            case 0:
                org.telegram.messenger.a8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f49749b.setLoading(false);
                return;
            default:
                org.telegram.messenger.a8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f49749b.setLoading(false);
                return;
        }
    }
}
