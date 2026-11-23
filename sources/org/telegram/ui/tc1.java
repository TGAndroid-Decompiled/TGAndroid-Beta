package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class tc1 implements OnFailureListener {
    public final int f52359a;
    public final hi.e f52360b;

    public tc1(hi.e eVar, int i7) {
        this.f52359a = i7;
        this.f52360b = eVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f52359a) {
            case 0:
                org.telegram.messenger.a8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f52360b.setLoading(false);
                return;
            default:
                org.telegram.messenger.a8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f52360b.setLoading(false);
                return;
        }
    }
}
