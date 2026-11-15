package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class tc1 implements OnFailureListener {
    public final int f51552a;
    public final hi.d f51553b;

    public tc1(hi.d dVar, int i7) {
        this.f51552a = i7;
        this.f51553b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f51552a) {
            case 0:
                org.telegram.messenger.a8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f51553b.setLoading(false);
                return;
            default:
                org.telegram.messenger.a8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f51553b.setLoading(false);
                return;
        }
    }
}
