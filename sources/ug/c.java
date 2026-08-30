package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c {
    public final int f45497a;
    public final long f45498b;
    public long e;
    public long f45500f;
    public long f45501g;
    public long h;
    public boolean f45502i;
    public final RectF f45499c = new RectF();
    public float f45503j = 0.0f;
    public float f45504k = 0.0f;
    public float f45505l = Float.MAX_VALUE;
    public float f45506m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public c(int i10, long j10) {
        this.f45497a = i10;
        this.f45498b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f45497a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f45501g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.f45504k;
        if (f10 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f45503j / f10) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.f45503j;
        if (f10 != 0.0f) {
            float f11 = this.f45505l;
            float f12 = this.f45506m;
            if (f11 <= f12) {
                return Math.round(((f12 - f11) / f10) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
