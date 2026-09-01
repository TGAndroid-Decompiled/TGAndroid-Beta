package vg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c {
    public final int f49261a;
    public final long f49262b;
    public long f49264e;
    public long f49265f;
    public long f49266g;
    public long h;
    public boolean f49267i;
    public final RectF f49263c = new RectF();
    public float f49268j = 0.0f;
    public float f49269k = 0.0f;
    public float f49270l = Float.MAX_VALUE;
    public float f49271m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public c(int i10, long j10) {
        this.f49261a = i10;
        this.f49262b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f49261a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f49266g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.f49269k;
        if (f10 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f49268j / f10) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.f49268j;
        if (f10 != 0.0f) {
            float f11 = this.f49270l;
            float f12 = this.f49271m;
            if (f11 <= f12) {
                return Math.round(((f12 - f11) / f10) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
