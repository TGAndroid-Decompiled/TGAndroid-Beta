package th;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class i0 {
    public int f49051a;
    public long f49052b;
    public int f49053c;
    public long d;
    public int e;
    public ArrayList f49054f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.f49051a).getCurrentTime();
        ArrayList arrayList = this.f49054f;
        int size = arrayList.size();
        int i10 = currentTime;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            h0 h0Var = (h0) obj;
            if (h0Var.f49010g > 0) {
                i10 = Math.min(i10, h0Var.d);
                i11 = Math.max(i11, o.b(this.f49051a, (int) h0Var.f49010g, 0) + h0Var.d);
            }
        }
        Typeface typeface = org.telegram.messenger.i0.f15999a;
        return (currentTime - i11) / (i10 - i11);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.f49051a).getCurrentTime();
        ArrayList arrayList = this.f49054f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            h0 h0Var = (h0) obj;
            long j10 = h0Var.f49010g;
            if (j10 > 0 && currentTime - h0Var.d <= o.b(this.f49051a, (int) j10, 0)) {
                i10 += (int) h0Var.f49010g;
            }
        }
        this.d = Math.max(this.d, i10);
        return i10;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.f49051a).getCurrentTime();
        ArrayList arrayList = this.f49054f;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h0 h0Var = (h0) obj;
            if (h0Var.f49010g > 0) {
                currentTime = Math.min(currentTime, h0Var.d);
            }
        }
        this.f49053c = currentTime;
    }
}
