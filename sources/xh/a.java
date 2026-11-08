package xh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import c8.j9;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.qg0;
public final class a extends Path {
    public final View f58753a;
    public final Layout f58754b;
    public final Stack f58755c;
    public final List d;
    public final int f58756e;
    public final int f58757f;
    public final ArrayList f58758g;

    public a(View view, Layout layout, Stack stack, List list, int i7, int i10, ArrayList arrayList) {
        this.f58753a = view;
        this.f58754b = layout;
        this.f58755c = stack;
        this.d = list;
        this.f58756e = i7;
        this.f58757f = i10;
        this.f58758g = arrayList;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        f fVar;
        float f14;
        Stack stack = this.f58755c;
        int i7 = 0;
        if (stack != null && !stack.isEmpty()) {
            fVar = (f) stack.remove(0);
        } else {
            fVar = new f();
        }
        fVar.f58811y = false;
        ArrayList arrayList = this.f58758g;
        if (arrayList != null) {
            float f15 = (f11 + f13) / 2.0f;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                qg0 qg0Var = (qg0) arrayList.get(i7);
                if (f15 >= qg0Var.f37321b && f15 <= qg0Var.f37322c) {
                    fVar.f58811y = true;
                    break;
                }
                i7++;
            }
        }
        fVar.f58801n = -1.0f;
        ValueAnimator valueAnimator = fVar.f58805r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        fVar.f58803p = true;
        int max = (int) Math.max(f10, this.f58756e);
        int i10 = (int) f11;
        int i11 = this.f58757f;
        if (i11 <= 0) {
            f14 = 2.1474836E9f;
        } else {
            f14 = i11;
        }
        fVar.setBounds(max, i10, (int) Math.min(f12, f14), (int) f13);
        fVar.h(this.f58754b.getPaint().getColor());
        fVar.f58807t = ks.f35428c;
        int width = fVar.getBounds().width() / g0.L(6.0f);
        int i12 = f.B;
        int b10 = j9.b(width * i12, i12, f.A);
        Stack stack2 = fVar.f58792c;
        fVar.d = b10;
        while (fVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f58753a;
        if (view != null) {
            fVar.f58796i = view;
        }
        this.d.add(fVar);
    }
}
