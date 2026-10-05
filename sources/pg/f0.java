package pg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class f0 implements Runnable {
    public final int f44489a;
    public final ArrayList f44490b;

    public f0(ArrayList arrayList, int i10) {
        this.f44489a = i10;
        this.f44490b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f44489a) {
            case 0:
                k0.h = this.f44490b;
                k0.f44527i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f44490b;
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
