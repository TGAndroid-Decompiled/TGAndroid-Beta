package vg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c {
    public final int f49260a;
    public final long f49261b;
    public long f49263e;
    public long f49264f;
    public long f49265g;
    public long h;
    public boolean f49266i;
    public final RectF f49262c = new RectF();
    public float f49267j = 0.0f;
    public float f49268k = 0.0f;
    public float f49269l = Float.MAX_VALUE;
    public float f49270m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public c(int i10, long j10) {
        this.f49260a = i10;
        this.f49261b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f49260a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f49265g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.f49268k;
        if (f10 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f49267j / f10) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.f49267j;
        if (f10 != 0.0f) {
            float f11 = this.f49269l;
            float f12 = this.f49270m;
            if (f11 <= f12) {
                return Math.round(((f12 - f11) / f10) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
