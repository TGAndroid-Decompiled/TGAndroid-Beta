package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class l0 {
    public int f48631a;
    public long f48632b;
    public int f48633c;
    public long d;
    public int e;
    public ArrayList f48634f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.f48631a).getCurrentTime();
        ArrayList arrayList = this.f48634f;
        int size = arrayList.size();
        int i10 = currentTime;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            k0 k0Var = (k0) obj;
            if (k0Var.f48579g > 0) {
                i10 = Math.min(i10, k0Var.d);
                i11 = Math.max(i11, o.b(this.f48631a, (int) k0Var.f48579g, 0) + k0Var.d);
            }
        }
        return AndroidUtilities.ilerp(currentTime, i11, i10);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.f48631a).getCurrentTime();
        ArrayList arrayList = this.f48634f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            k0 k0Var = (k0) obj;
            long j3 = k0Var.f48579g;
            if (j3 > 0 && currentTime - k0Var.d <= o.b(this.f48631a, (int) j3, 0)) {
                i10 += (int) k0Var.f48579g;
            }
        }
        this.d = Math.max(this.d, i10);
        return i10;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.f48631a).getCurrentTime();
        ArrayList arrayList = this.f48634f;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            k0 k0Var = (k0) obj;
            if (k0Var.f48579g > 0) {
                currentTime = Math.min(currentTime, k0Var.d);
            }
        }
        this.f48633c = currentTime;
    }
}
