package zg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c {
    public final int f55739a;
    public final long f55740b;
    public long e;
    public long f55742f;
    public long f55743g;
    public long h;
    public boolean f55744i;
    public final RectF f55741c = new RectF();
    public float f55745j = 0.0f;
    public float f55746k = 0.0f;
    public float f55747l = Float.MAX_VALUE;
    public float f55748m = 0.0f;
    public final long d = Utilities.f14520b.nextLong();

    public c(int i10, long j10) {
        this.f55739a = i10;
        this.f55740b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f55739a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f55743g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.f55746k;
        if (f7 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f55745j / f7) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.f55745j;
        if (f7 != 0.0f) {
            float f10 = this.f55747l;
            float f11 = this.f55748m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f7) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
