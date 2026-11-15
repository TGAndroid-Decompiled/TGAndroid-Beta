package xh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import c8.i9;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.tg0;
public final class a extends Path {
    public final View f59944a;
    public final Layout f59945b;
    public final Stack f59946c;
    public final List d;
    public final int f59947e;
    public final int f59948f;
    public final ArrayList f59949g;

    public a(View view, Layout layout, Stack stack, List list, int i7, int i10, ArrayList arrayList) {
        this.f59944a = view;
        this.f59945b = layout;
        this.f59946c = stack;
        this.d = list;
        this.f59947e = i7;
        this.f59948f = i10;
        this.f59949g = arrayList;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        f fVar;
        float f14;
        Stack stack = this.f59946c;
        int i7 = 0;
        if (stack != null && !stack.isEmpty()) {
            fVar = (f) stack.remove(0);
        } else {
            fVar = new f();
        }
        fVar.f60002y = false;
        ArrayList arrayList = this.f59949g;
        if (arrayList != null) {
            float f15 = (f11 + f13) / 2.0f;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                tg0 tg0Var = (tg0) arrayList.get(i7);
                if (f15 >= tg0Var.f39694b && f15 <= tg0Var.f39695c) {
                    fVar.f60002y = true;
                    break;
                }
                i7++;
            }
        }
        fVar.f59992n = -1.0f;
        ValueAnimator valueAnimator = fVar.f59996r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        fVar.f59994p = true;
        int max = (int) Math.max(f10, this.f59947e);
        int i10 = (int) f11;
        int i11 = this.f59948f;
        if (i11 <= 0) {
            f14 = 2.1474836E9f;
        } else {
            f14 = i11;
        }
        fVar.setBounds(max, i10, (int) Math.min(f12, f14), (int) f13);
        fVar.h(this.f59945b.getPaint().getColor());
        fVar.f59998t = qs.f38756c;
        int width = fVar.getBounds().width() / g0.L(6.0f);
        int i12 = f.B;
        int b10 = i9.b(width * i12, i12, f.A);
        Stack stack2 = fVar.f59983c;
        fVar.d = b10;
        while (fVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f59944a;
        if (view != null) {
            fVar.f59987i = view;
        }
        this.d.add(fVar);
    }
}
