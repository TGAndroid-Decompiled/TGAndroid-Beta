package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class tc1 implements OnFailureListener {
    public final int f51551a;
    public final hi.d f51552b;

    public tc1(hi.d dVar, int i7) {
        this.f51551a = i7;
        this.f51552b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f51551a) {
            case 0:
                org.telegram.messenger.a8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f51552b.setLoading(false);
                return;
            default:
                org.telegram.messenger.a8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f51552b.setLoading(false);
                return;
        }
    }
}
