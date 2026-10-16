package wh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.xt;
import w7.r;
public final class a extends Path {
    public final View f47625a;
    public final Layout f47626b;
    public final Stack f47627c;
    public final List d;
    public final int e;
    public final int f47628f;
    public final ArrayList f47629g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f47625a = view;
        this.f47626b = layout;
        this.f47627c = stack;
        this.d = list;
        this.e = i10;
        this.f47628f = i11;
        this.f47629g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f47627c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f47679y = false;
        ArrayList arrayList = this.f47629g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                pj0 pj0Var = (pj0) arrayList.get(i10);
                if (f14 >= pj0Var.f28030b && f14 <= pj0Var.f28031c) {
                    gVar.f47679y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f47669n = -1.0f;
        ValueAnimator valueAnimator = gVar.f47673r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f47671p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f47628f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f47626b.getPaint().getColor());
        gVar.f47675t = xt.f31007c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = r.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f47661c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f47625a;
        if (view != null) {
            gVar.f47664i = view;
        }
        this.d.add(gVar);
    }
}
