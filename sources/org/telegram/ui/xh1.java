package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class xh1 implements OnFailureListener {
    public final int f43215a;
    public final ei.d f43216b;

    public xh1(ei.d dVar, int i10) {
        this.f43215a = i10;
        this.f43216b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f43215a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f43216b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f43216b.setLoading(false);
                return;
        }
    }
}
