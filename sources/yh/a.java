package yh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import b8.be;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.tg0;
public final class a extends Path {
    public final View f59470a;
    public final Layout f59471b;
    public final Stack f59472c;
    public final List d;
    public final int f59473e;
    public final int f59474f;
    public final ArrayList f59475g;

    public a(View view, Layout layout, Stack stack, List list, int i3, int i10, ArrayList arrayList) {
        this.f59470a = view;
        this.f59471b = layout;
        this.f59472c = stack;
        this.d = list;
        this.f59473e = i3;
        this.f59474f = i10;
        this.f59475g = arrayList;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        f fVar;
        float f14;
        Stack stack = this.f59472c;
        int i3 = 0;
        if (stack != null && !stack.isEmpty()) {
            fVar = (f) stack.remove(0);
        } else {
            fVar = new f();
        }
        fVar.f59528y = false;
        ArrayList arrayList = this.f59475g;
        if (arrayList != null) {
            float f15 = (f11 + f13) / 2.0f;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                tg0 tg0Var = (tg0) arrayList.get(i3);
                if (f15 >= tg0Var.f38410b && f15 <= tg0Var.f38411c) {
                    fVar.f59528y = true;
                    break;
                }
                i3++;
            }
        }
        fVar.f59518n = -1.0f;
        ValueAnimator valueAnimator = fVar.f59522r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        fVar.f59520p = true;
        int max = (int) Math.max(f10, this.f59473e);
        int i10 = (int) f11;
        int i11 = this.f59474f;
        if (i11 <= 0) {
            f14 = 2.1474836E9f;
        } else {
            f14 = i11;
        }
        fVar.setBounds(max, i10, (int) Math.min(f12, f14), (int) f13);
        fVar.h(this.f59471b.getPaint().getColor());
        fVar.f59524t = ks.f35476c;
        int width = fVar.getBounds().width() / g0.L(6.0f);
        int i12 = f.B;
        int b10 = be.b(width * i12, i12, f.A);
        Stack stack2 = fVar.f59509c;
        fVar.d = b10;
        while (fVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f59470a;
        if (view != null) {
            fVar.f59513i = view;
        }
        this.d.add(fVar);
    }
}
