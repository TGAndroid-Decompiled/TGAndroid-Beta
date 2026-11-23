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
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.zs;
public final class a extends Path {
    public final View f60520a;
    public final Layout f60521b;
    public final Stack f60522c;
    public final List d;
    public final int f60523e;
    public final int f60524f;
    public final ArrayList f60525g;

    public a(View view, Layout layout, Stack stack, List list, int i7, int i10, ArrayList arrayList) {
        this.f60520a = view;
        this.f60521b = layout;
        this.f60522c = stack;
        this.d = list;
        this.f60523e = i7;
        this.f60524f = i10;
        this.f60525g = arrayList;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        f fVar;
        float f14;
        Stack stack = this.f60522c;
        int i7 = 0;
        if (stack != null && !stack.isEmpty()) {
            fVar = (f) stack.remove(0);
        } else {
            fVar = new f();
        }
        fVar.f60578y = false;
        ArrayList arrayList = this.f60525g;
        if (arrayList != null) {
            float f15 = (f11 + f13) / 2.0f;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                fh0 fh0Var = (fh0) arrayList.get(i7);
                if (f15 >= fh0Var.f35214b && f15 <= fh0Var.f35215c) {
                    fVar.f60578y = true;
                    break;
                }
                i7++;
            }
        }
        fVar.f60568n = -1.0f;
        ValueAnimator valueAnimator = fVar.f60572r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        fVar.f60570p = true;
        int max = (int) Math.max(f10, this.f60523e);
        int i10 = (int) f11;
        int i11 = this.f60524f;
        if (i11 <= 0) {
            f14 = 2.1474836E9f;
        } else {
            f14 = i11;
        }
        fVar.setBounds(max, i10, (int) Math.min(f12, f14), (int) f13);
        fVar.h(this.f60521b.getPaint().getColor());
        fVar.f60574t = zs.f42933c;
        int width = fVar.getBounds().width() / g0.L(6.0f);
        int i12 = f.B;
        int b10 = m9.b(width * i12, i12, f.A);
        Stack stack2 = fVar.f60559c;
        fVar.d = b10;
        while (fVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f60520a;
        if (view != null) {
            fVar.f60563i = view;
        }
        this.d.add(fVar);
    }
}
