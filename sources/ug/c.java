package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c {
    public final int f45561a;
    public final long f45562b;
    public long e;
    public long f45564f;
    public long f45565g;
    public long h;
    public boolean f45566i;
    public final RectF f45563c = new RectF();
    public float f45567j = 0.0f;
    public float f45568k = 0.0f;
    public float f45569l = Float.MAX_VALUE;
    public float f45570m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public c(int i10, long j10) {
        this.f45561a = i10;
        this.f45562b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f45561a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f45565g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.f45568k;
        if (f10 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f45567j / f10) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.f45567j;
        if (f10 != 0.0f) {
            float f11 = this.f45569l;
            float f12 = this.f45570m;
            if (f11 <= f12) {
                return Math.round(((f12 - f11) / f10) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
