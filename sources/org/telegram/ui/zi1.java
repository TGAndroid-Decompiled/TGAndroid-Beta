package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class zi1 implements OnFailureListener {
    public final int f43973a;
    public final qh.d f43974b;

    public zi1(qh.d dVar, int i10) {
        this.f43973a = i10;
        this.f43974b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f43973a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f43974b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f43974b.setLoading(false);
                return;
        }
    }
}
