package sg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c {
    public final int f48025a;
    public final long f48026b;
    public long f48028e;
    public long f48029f;
    public long f48030g;
    public long h;
    public boolean f48031i;
    public final RectF f48027c = new RectF();
    public float f48032j = 0.0f;
    public float f48033k = 0.0f;
    public float f48034l = Float.MAX_VALUE;
    public float f48035m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public c(int i10, long j10) {
        this.f48025a = i10;
        this.f48026b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f48025a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f48030g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f9 = this.f48033k;
        if (f9 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f48032j / f9) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f9 = this.f48032j;
        if (f9 != 0.0f) {
            float f10 = this.f48034l;
            float f11 = this.f48035m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f9) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
