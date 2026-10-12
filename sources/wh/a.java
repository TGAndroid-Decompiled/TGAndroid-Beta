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
import w7.s;
public final class a extends Path {
    public final View f47626a;
    public final Layout f47627b;
    public final Stack f47628c;
    public final List d;
    public final int e;
    public final int f47629f;
    public final ArrayList f47630g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f47626a = view;
        this.f47627b = layout;
        this.f47628c = stack;
        this.d = list;
        this.e = i10;
        this.f47629f = i11;
        this.f47630g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f47628c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f47680y = false;
        ArrayList arrayList = this.f47630g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                pj0 pj0Var = (pj0) arrayList.get(i10);
                if (f14 >= pj0Var.f28342b && f14 <= pj0Var.f28343c) {
                    gVar.f47680y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f47670n = -1.0f;
        ValueAnimator valueAnimator = gVar.f47674r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f47672p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f47629f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f47627b.getPaint().getColor());
        gVar.f47676t = xt.f31326c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = s.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f47662c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f47626a;
        if (view != null) {
            gVar.f47665i = view;
        }
        this.d.add(gVar);
    }
}
