package vh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.wj0;
public final class a extends Path {
    public final View f49870a;
    public final Layout f49871b;
    public final Stack f49872c;
    public final List d;
    public final int f49873e;
    public final int f49874f;
    public final ArrayList f49875g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f49870a = view;
        this.f49871b = layout;
        this.f49872c = stack;
        this.d = list;
        this.f49873e = i10;
        this.f49874f = i11;
        this.f49875g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f49872c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f49929y = false;
        ArrayList arrayList = this.f49875g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                wj0 wj0Var = (wj0) arrayList.get(i10);
                if (f14 >= wj0Var.f32426b && f14 <= wj0Var.f32427c) {
                    gVar.f49929y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f49919n = -1.0f;
        ValueAnimator valueAnimator = gVar.f49923r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f49921p = true;
        int max = (int) Math.max(f7, this.f49873e);
        int i11 = (int) f10;
        int i12 = this.f49874f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f49871b.getPaint().getColor());
        gVar.f49925t = cu.f25017c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = w7.n.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f49910c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f49870a;
        if (view != null) {
            gVar.f49914i = view;
        }
        this.d.add(gVar);
    }
}
