package qg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class c {

    public final int f46513a;

    public final long f46514b;

    public long f46516e;

    public long f46517f;

    public long f46518g;
    public long h;

    public boolean f46519i;

    public final RectF f46515c = new RectF();

    public float f46520j = 0.0f;

    public float f46521k = 0.0f;

    public float f46522l = Float.MAX_VALUE;

    public float f46523m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public c(int i10, long j10) {
        this.f46513a = i10;
        this.f46514b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f46513a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f46518g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.f46521k;
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = f10 == 0.0f ? 1000 : Math.round((this.f46520j / f10) * 1000.0f);
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.f46520j;
        if (f10 == 0.0f) {
            return 0;
        }
        float f11 = this.f46522l;
        float f12 = this.f46523m;
        if (f11 > f12) {
            return 0;
        }
        return Math.round(((f12 - f11) / f10) * 1000.0f);
    }
}
