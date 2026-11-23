package xh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import c8.m9;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.ws;
public final class a extends Path {
    public final View f60638a;
    public final Layout f60639b;
    public final Stack f60640c;
    public final List d;
    public final int f60641e;
    public final int f60642f;
    public final ArrayList f60643g;

    public a(View view, Layout layout, Stack stack, List list, int i7, int i10, ArrayList arrayList) {
        this.f60638a = view;
        this.f60639b = layout;
        this.f60640c = stack;
        this.d = list;
        this.f60641e = i7;
        this.f60642f = i10;
        this.f60643g = arrayList;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        f fVar;
        float f14;
        Stack stack = this.f60640c;
        int i7 = 0;
        if (stack != null && !stack.isEmpty()) {
            fVar = (f) stack.remove(0);
        } else {
            fVar = new f();
        }
        fVar.f60696y = false;
        ArrayList arrayList = this.f60643g;
        if (arrayList != null) {
            float f15 = (f11 + f13) / 2.0f;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                eh0 eh0Var = (eh0) arrayList.get(i7);
                if (f15 >= eh0Var.f34719b && f15 <= eh0Var.f34720c) {
                    fVar.f60696y = true;
                    break;
                }
                i7++;
            }
        }
        fVar.f60686n = -1.0f;
        ValueAnimator valueAnimator = fVar.f60690r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        fVar.f60688p = true;
        int max = (int) Math.max(f10, this.f60641e);
        int i10 = (int) f11;
        int i11 = this.f60642f;
        if (i11 <= 0) {
            f14 = 2.1474836E9f;
        } else {
            f14 = i11;
        }
        fVar.setBounds(max, i10, (int) Math.min(f12, f14), (int) f13);
        fVar.h(this.f60639b.getPaint().getColor());
        fVar.f60692t = ws.f41715c;
        int width = fVar.getBounds().width() / g0.L(6.0f);
        int i12 = f.B;
        int b10 = m9.b(width * i12, i12, f.A);
        Stack stack2 = fVar.f60677c;
        fVar.d = b10;
        while (fVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f60638a;
        if (view != null) {
            fVar.f60681i = view;
        }
        this.d.add(fVar);
    }
}
