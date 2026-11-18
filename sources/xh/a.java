package xh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import c8.l9;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.xs;
public final class a extends Path {
    public final View f60510a;
    public final Layout f60511b;
    public final Stack f60512c;
    public final List d;
    public final int f60513e;
    public final int f60514f;
    public final ArrayList f60515g;

    public a(View view, Layout layout, Stack stack, List list, int i7, int i10, ArrayList arrayList) {
        this.f60510a = view;
        this.f60511b = layout;
        this.f60512c = stack;
        this.d = list;
        this.f60513e = i7;
        this.f60514f = i10;
        this.f60515g = arrayList;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        f fVar;
        float f14;
        Stack stack = this.f60512c;
        int i7 = 0;
        if (stack != null && !stack.isEmpty()) {
            fVar = (f) stack.remove(0);
        } else {
            fVar = new f();
        }
        fVar.f60568y = false;
        ArrayList arrayList = this.f60515g;
        if (arrayList != null) {
            float f15 = (f11 + f13) / 2.0f;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                dh0 dh0Var = (dh0) arrayList.get(i7);
                if (f15 >= dh0Var.f34441b && f15 <= dh0Var.f34442c) {
                    fVar.f60568y = true;
                    break;
                }
                i7++;
            }
        }
        fVar.f60558n = -1.0f;
        ValueAnimator valueAnimator = fVar.f60562r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        fVar.f60560p = true;
        int max = (int) Math.max(f10, this.f60513e);
        int i10 = (int) f11;
        int i11 = this.f60514f;
        if (i11 <= 0) {
            f14 = 2.1474836E9f;
        } else {
            f14 = i11;
        }
        fVar.setBounds(max, i10, (int) Math.min(f12, f14), (int) f13);
        fVar.h(this.f60511b.getPaint().getColor());
        fVar.f60564t = xs.f42177c;
        int width = fVar.getBounds().width() / g0.L(6.0f);
        int i12 = f.B;
        int b10 = l9.b(width * i12, i12, f.A);
        Stack stack2 = fVar.f60549c;
        fVar.d = b10;
        while (fVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f60510a;
        if (view != null) {
            fVar.f60553i = view;
        }
        this.d.add(fVar);
    }
}
