package pg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c {
    public final int f45845a;
    public final long f45846b;
    public long f45848e;
    public long f45849f;
    public long f45850g;
    public long h;
    public boolean f45851i;
    public final RectF f45847c = new RectF();
    public float f45852j = 0.0f;
    public float f45853k = 0.0f;
    public float f45854l = Float.MAX_VALUE;
    public float f45855m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public c(int i9, long j10) {
        this.f45845a = i9;
        this.f45846b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f45845a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f45850g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.f45853k;
        if (f10 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f45852j / f10) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.f45852j;
        if (f10 != 0.0f) {
            float f11 = this.f45854l;
            float f12 = this.f45855m;
            if (f11 <= f12) {
                return Math.round(((f12 - f11) / f10) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
