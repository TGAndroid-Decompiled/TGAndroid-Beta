package wh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.st;
import w7.r;
public final class a extends Path {
    public final View f49034a;
    public final Layout f49035b;
    public final Stack f49036c;
    public final List d;
    public final int e;
    public final int f49037f;
    public final ArrayList f49038g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f49034a = view;
        this.f49035b = layout;
        this.f49036c = stack;
        this.d = list;
        this.e = i10;
        this.f49037f = i11;
        this.f49038g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f49036c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f49088y = false;
        ArrayList arrayList = this.f49038g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                lj0 lj0Var = (lj0) arrayList.get(i10);
                if (f14 >= lj0Var.f28249b && f14 <= lj0Var.f28250c) {
                    gVar.f49088y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f49078n = -1.0f;
        ValueAnimator valueAnimator = gVar.f49082r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f49080p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f49037f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f49035b.getPaint().getColor());
        gVar.f49084t = st.f30326c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = r.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f49070c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f49034a;
        if (view != null) {
            gVar.f49073i = view;
        }
        this.d.add(gVar);
    }
}
