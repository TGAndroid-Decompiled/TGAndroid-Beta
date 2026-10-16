package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class sj1 implements OnFailureListener {
    public final int f39834a;
    public final di.d f39835b;

    public sj1(di.d dVar, int i10) {
        this.f39834a = i10;
        this.f39835b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f39834a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f39835b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f39835b.setLoading(false);
                return;
        }
    }
}
