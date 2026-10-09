package pg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class f0 implements Runnable {
    public final int f45642a;
    public final ArrayList f45643b;

    public f0(ArrayList arrayList, int i10) {
        this.f45642a = i10;
        this.f45643b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f45642a) {
            case 0:
                k0.h = this.f45643b;
                k0.f45671i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f45643b;
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
