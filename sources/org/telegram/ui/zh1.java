package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;
public final class zh1 implements OnFailureListener {
    public final int f43776a;
    public final ei.d f43777b;

    public zh1(ei.d dVar, int i10) {
        this.f43776a = i10;
        this.f43777b = dVar;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f43776a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.f43777b.setLoading(false);
                return;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.f43777b.setLoading(false);
                return;
        }
    }
}
