package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class yi1 implements OnFailureListener {
    public final int f40287a;
    public final ph.d f40288b;

    public yi1(ph.d dVar, int i10) {
        this.f40287a = i10;
        this.f40288b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f40287a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f40288b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f40288b.setLoading(false);
                return;
        }
    }
}
