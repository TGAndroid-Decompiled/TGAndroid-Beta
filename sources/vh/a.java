package vh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.uj0;
import w7.o;
public final class a extends Path {
    public final View f49763a;
    public final Layout f49764b;
    public final Stack f49765c;
    public final List d;
    public final int f49766e;
    public final int f49767f;
    public final ArrayList f49768g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f49763a = view;
        this.f49764b = layout;
        this.f49765c = stack;
        this.d = list;
        this.f49766e = i10;
        this.f49767f = i11;
        this.f49768g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f49765c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f49822y = false;
        ArrayList arrayList = this.f49768g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                uj0 uj0Var = (uj0) arrayList.get(i10);
                if (f14 >= uj0Var.f31620b && f14 <= uj0Var.f31621c) {
                    gVar.f49822y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f49812n = -1.0f;
        ValueAnimator valueAnimator = gVar.f49816r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f49814p = true;
        int max = (int) Math.max(f7, this.f49766e);
        int i11 = (int) f10;
        int i12 = this.f49767f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f49764b.getPaint().getColor());
        gVar.f49818t = bu.f25096c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = o.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f49803c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f49763a;
        if (view != null) {
            gVar.f49807i = view;
        }
        this.d.add(gVar);
    }
}
