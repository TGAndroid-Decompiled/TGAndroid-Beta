package vh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.nt;
import w7.q;
public final class a extends Path {
    public final View f48360a;
    public final Layout f48361b;
    public final Stack f48362c;
    public final List d;
    public final int f48363e;
    public final int f48364f;
    public final ArrayList f48365g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f48360a = view;
        this.f48361b = layout;
        this.f48362c = stack;
        this.d = list;
        this.f48363e = i10;
        this.f48364f = i11;
        this.f48365g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f48362c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f48419y = false;
        ArrayList arrayList = this.f48365g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                bj0 bj0Var = (bj0) arrayList.get(i10);
                if (f14 >= bj0Var.f25002b && f14 <= bj0Var.f25003c) {
                    gVar.f48419y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f48409n = -1.0f;
        ValueAnimator valueAnimator = gVar.f48413r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f48411p = true;
        int max = (int) Math.max(f7, this.f48363e);
        int i11 = (int) f10;
        int i12 = this.f48364f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f48361b.getPaint().getColor());
        gVar.f48415t = nt.f29148c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = q.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f48400c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f48360a;
        if (view != null) {
            gVar.f48404i = view;
        }
        this.d.add(gVar);
    }
}
