package wh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.oi0;
public final class a extends Path {
    public final View f48604a;
    public final Layout f48605b;
    public final Stack f48606c;
    public final List d;
    public final int f48607e;
    public final int f48608f;
    public final ArrayList f48609g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f48604a = view;
        this.f48605b = layout;
        this.f48606c = stack;
        this.d = list;
        this.f48607e = i10;
        this.f48608f = i11;
        this.f48609g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        h hVar;
        float f13;
        Stack stack = this.f48606c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            hVar = (h) stack.remove(0);
        } else {
            hVar = new h();
        }
        hVar.f48664y = false;
        ArrayList arrayList = this.f48609g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                oi0 oi0Var = (oi0) arrayList.get(i10);
                if (f14 >= oi0Var.f29105b && f14 <= oi0Var.f29106c) {
                    hVar.f48664y = true;
                    break;
                }
                i10++;
            }
        }
        hVar.f48654n = -1.0f;
        ValueAnimator valueAnimator = hVar.f48658r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        hVar.f48656p = true;
        int max = (int) Math.max(f7, this.f48607e);
        int i11 = (int) f10;
        int i12 = this.f48608f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        hVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        hVar.h(this.f48605b.getPaint().getColor());
        hVar.f48660t = jt.f27595c;
        int width = hVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = h.B;
        int b10 = w7.p.b(width * i13, i13, h.A);
        Stack stack2 = hVar.f48645c;
        hVar.d = b10;
        while (hVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f48604a;
        if (view != null) {
            hVar.f48649i = view;
        }
        this.d.add(hVar);
    }
}
