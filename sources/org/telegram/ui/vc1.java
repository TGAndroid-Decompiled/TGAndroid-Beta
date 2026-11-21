package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class vc1 implements OnFailureListener {
    public final int f52791a;
    public final hi.e f52792b;

    public vc1(hi.e eVar, int i7) {
        this.f52791a = i7;
        this.f52792b = eVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f52791a) {
            case 0:
                org.telegram.messenger.a8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f52792b.setLoading(false);
                return;
            default:
                org.telegram.messenger.a8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f52792b.setLoading(false);
                return;
        }
    }
}
