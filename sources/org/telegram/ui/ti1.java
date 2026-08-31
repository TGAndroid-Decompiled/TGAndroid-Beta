package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class ti1 implements OnFailureListener {
    public final int f41657a;
    public final qh.d f41658b;

    public ti1(qh.d dVar, int i10) {
        this.f41657a = i10;
        this.f41658b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f41657a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f41658b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f41658b.setLoading(false);
                return;
        }
    }
}
