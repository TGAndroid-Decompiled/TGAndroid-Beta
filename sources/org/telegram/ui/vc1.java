package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class vc1 implements OnFailureListener {
    public final int f52770a;
    public final hi.d f52771b;

    public vc1(hi.d dVar, int i7) {
        this.f52770a = i7;
        this.f52771b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f52770a) {
            case 0:
                org.telegram.messenger.a8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f52771b.setLoading(false);
                return;
            default:
                org.telegram.messenger.a8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f52771b.setLoading(false);
                return;
        }
    }
}
