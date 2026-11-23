package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class vc1 implements OnFailureListener {
    public final int f52795a;
    public final hi.e f52796b;

    public vc1(hi.e eVar, int i7) {
        this.f52795a = i7;
        this.f52796b = eVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f52795a) {
            case 0:
                org.telegram.messenger.a8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f52796b.setLoading(false);
                return;
            default:
                org.telegram.messenger.a8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f52796b.setLoading(false);
                return;
        }
    }
}
