package vh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.wj0;
public final class a extends Path {
    public final View f49878a;
    public final Layout f49879b;
    public final Stack f49880c;
    public final List d;
    public final int f49881e;
    public final int f49882f;
    public final ArrayList f49883g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f49878a = view;
        this.f49879b = layout;
        this.f49880c = stack;
        this.d = list;
        this.f49881e = i10;
        this.f49882f = i11;
        this.f49883g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f49880c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f49937y = false;
        ArrayList arrayList = this.f49883g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                wj0 wj0Var = (wj0) arrayList.get(i10);
                if (f14 >= wj0Var.f32426b && f14 <= wj0Var.f32427c) {
                    gVar.f49937y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f49927n = -1.0f;
        ValueAnimator valueAnimator = gVar.f49931r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f49929p = true;
        int max = (int) Math.max(f7, this.f49881e);
        int i11 = (int) f10;
        int i12 = this.f49882f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f49879b.getPaint().getColor());
        gVar.f49933t = du.f25465c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = w7.n.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f49918c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f49878a;
        if (view != null) {
            gVar.f49922i = view;
        }
        this.d.add(gVar);
    }
}
