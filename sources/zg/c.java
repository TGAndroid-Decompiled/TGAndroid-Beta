package zg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c {
    public final int f55721a;
    public final long f55722b;
    public long e;
    public long f55724f;
    public long f55725g;
    public long h;
    public boolean f55726i;
    public final RectF f55723c = new RectF();
    public float f55727j = 0.0f;
    public float f55728k = 0.0f;
    public float f55729l = Float.MAX_VALUE;
    public float f55730m = 0.0f;
    public final long d = Utilities.f14519b.nextLong();

    public c(int i10, long j10) {
        this.f55721a = i10;
        this.f55722b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        int round;
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.f55721a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.f55725g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.f55728k;
        if (f7 == 0.0f) {
            round = 1000;
        } else {
            round = Math.round((this.f55727j / f7) * 1000.0f);
        }
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = round;
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.f55727j;
        if (f7 != 0.0f) {
            float f10 = this.f55729l;
            float f11 = this.f55730m;
            if (f10 <= f11) {
                return Math.round(((f11 - f10) / f7) * 1000.0f);
            }
            return 0;
        }
        return 0;
    }
}
