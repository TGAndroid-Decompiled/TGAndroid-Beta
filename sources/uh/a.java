package uh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.yi0;
import w7.q;
public final class a extends Path {
    public final View f42737a;
    public final Layout f42738b;
    public final Stack f42739c;
    public final List d;
    public final int e;
    public final int f42740f;
    public final ArrayList f42741g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f42737a = view;
        this.f42738b = layout;
        this.f42739c = stack;
        this.d = list;
        this.e = i10;
        this.f42740f = i11;
        this.f42741g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        h hVar;
        float f13;
        Stack stack = this.f42739c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            hVar = (h) stack.remove(0);
        } else {
            hVar = new h();
        }
        hVar.f42792y = false;
        ArrayList arrayList = this.f42741g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                yi0 yi0Var = (yi0) arrayList.get(i10);
                if (f14 >= yi0Var.f29434b && f14 <= yi0Var.f29435c) {
                    hVar.f42792y = true;
                    break;
                }
                i10++;
            }
        }
        hVar.f42782n = -1.0f;
        ValueAnimator valueAnimator = hVar.f42786r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        hVar.f42784p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f42740f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        hVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        hVar.h(this.f42738b.getPaint().getColor());
        hVar.f42788t = pt.f26248c;
        int width = hVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = h.B;
        int b10 = q.b(width * i13, i13, h.A);
        Stack stack2 = hVar.f42774c;
        hVar.d = b10;
        while (hVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f42737a;
        if (view != null) {
            hVar.f42777i = view;
        }
        this.d.add(hVar);
    }
}
