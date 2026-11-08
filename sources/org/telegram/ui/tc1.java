package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class tc1 implements OnFailureListener {
    public final int f50025a;
    public final fi.d f50026b;

    public tc1(fi.d dVar, int i7) {
        this.f50025a = i7;
        this.f50026b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f50025a) {
            case 0:
                org.telegram.messenger.a8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f50026b.setLoading(false);
                return;
            default:
                org.telegram.messenger.a8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f50026b.setLoading(false);
                return;
        }
    }
}
