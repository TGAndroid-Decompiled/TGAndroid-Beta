package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class xh1 implements OnFailureListener {
    public final int f43224a;
    public final ei.d f43225b;

    public xh1(ei.d dVar, int i10) {
        this.f43224a = i10;
        this.f43225b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f43224a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f43225b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f43225b.setLoading(false);
                return;
        }
    }
}
