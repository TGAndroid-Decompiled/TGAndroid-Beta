package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class xh1 implements OnFailureListener {
    public final int f43211a;
    public final ei.d f43212b;

    public xh1(ei.d dVar, int i10) {
        this.f43211a = i10;
        this.f43212b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f43211a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f43212b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f43212b.setLoading(false);
                return;
        }
    }
}
