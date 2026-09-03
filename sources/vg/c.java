package vg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c {
    public final int f49297a;
    public final long f49298b;
    public long f49300e;
    public long f49301f;
    public long f49302g;
    public long h;
    public boolean f49303i;
    public final RectF f49299c = new RectF();
    public float f49304j = 0.0f;
    public float f49305k = 0.0f;
    public float f49306l = Float.MAX_VALUE;
    public float f49307m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public c(int i10, long j10) {
        this.f49297a = i10;
        this.f49298b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f49297a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f49302g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.f49305k;
        if (f10 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f49304j / f10) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.f49304j;
        if (f10 != 0.0f) {
            float f11 = this.f49306l;
            float f12 = this.f49307m;
            if (f11 <= f12) {
                return Math.round(((f12 - f11) / f10) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
