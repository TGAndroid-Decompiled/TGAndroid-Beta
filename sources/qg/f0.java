package qg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class f0 implements Runnable {
    public final int f44944a;
    public final ArrayList f44945b;

    public f0(ArrayList arrayList, int i10) {
        this.f44944a = i10;
        this.f44945b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f44944a) {
            case 0:
                l0.h = this.f44945b;
                l0.f44977i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f44945b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((Bitmap) obj).recycle();
                }
                return;
        }
    }
}
