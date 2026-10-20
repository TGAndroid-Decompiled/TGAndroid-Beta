package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class xh1 implements OnFailureListener {
    public final int f43221a;
    public final ei.d f43222b;

    public xh1(ei.d dVar, int i10) {
        this.f43221a = i10;
        this.f43222b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f43221a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f43222b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f43222b.setLoading(false);
                return;
        }
    }
}
