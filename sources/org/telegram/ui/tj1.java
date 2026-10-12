package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class tj1 implements OnFailureListener {
    public final int f40402a;
    public final di.d f40403b;

    public tj1(di.d dVar, int i10) {
        this.f40402a = i10;
        this.f40403b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f40402a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f40403b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f40403b.setLoading(false);
                return;
        }
    }
}
