package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
public final class vc1 implements OnFailureListener {
    public final int f52749a;
    public final hi.d f52750b;

    public vc1(hi.d dVar, int i7) {
        this.f52749a = i7;
        this.f52750b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f52749a) {
            case 0:
                org.telegram.messenger.a8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.f52750b.setLoading(false);
                return;
            default:
                org.telegram.messenger.a8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.f52750b.setLoading(false);
                return;
        }
    }
}
