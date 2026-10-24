package wh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.qt;
import w7.r;
public final class a extends Path {
    public final View f49463a;
    public final Layout f49464b;
    public final Stack f49465c;
    public final List d;
    public final int e;
    public final int f49466f;
    public final ArrayList f49467g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f49463a = view;
        this.f49464b = layout;
        this.f49465c = stack;
        this.d = list;
        this.e = i10;
        this.f49466f = i11;
        this.f49467g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f49465c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f49517y = false;
        ArrayList arrayList = this.f49467g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                oj0 oj0Var = (oj0) arrayList.get(i10);
                if (f14 >= oj0Var.f29307b && f14 <= oj0Var.f29308c) {
                    gVar.f49517y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f49507n = -1.0f;
        ValueAnimator valueAnimator = gVar.f49511r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f49509p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f49466f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f49464b.getPaint().getColor());
        gVar.f49513t = qt.f29993c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = r.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f49499c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f49463a;
        if (view != null) {
            gVar.f49502i = view;
        }
        this.d.add(gVar);
    }
}
