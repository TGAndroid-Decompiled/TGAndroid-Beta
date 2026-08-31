package t;

import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
public final class c {
    public static final c f47823b;
    public final HashSet f47824a;

    static {
        new c(Collections.EMPTY_LIST);
        new c(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new c(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class));
        new c(Arrays.asList(ForegroundCarColorSpan.class));
        f47823b = new c(Arrays.asList(DistanceSpan.class, DurationSpan.class));
        new c(Arrays.asList(DistanceSpan.class, DurationSpan.class, CarIconSpan.class));
        new c(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new c(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    public c(List list) {
        this.f47824a = new HashSet(list);
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.f47824a.contains(cls)) {
                throw new IllegalArgumentException("CarSpan type is not allowed: ".concat(cls.getSimpleName()));
            }
        }
    }
}
