package vh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.zi0;
import w7.q;
public final class a extends Path {
    public final View f44636a;
    public final Layout f44637b;
    public final Stack f44638c;
    public final List d;
    public final int e;
    public final int f44639f;
    public final ArrayList f44640g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f44636a = view;
        this.f44637b = layout;
        this.f44638c = stack;
        this.d = list;
        this.e = i10;
        this.f44639f = i11;
        this.f44640g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f44638c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f44690y = false;
        ArrayList arrayList = this.f44640g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                zi0 zi0Var = (zi0) arrayList.get(i10);
                if (f14 >= zi0Var.f30898b && f14 <= zi0Var.f30899c) {
                    gVar.f44690y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f44680n = -1.0f;
        ValueAnimator valueAnimator = gVar.f44684r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f44682p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f44639f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f44637b.getPaint().getColor());
        gVar.f44686t = lt.f26188c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = q.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f44672c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f44636a;
        if (view != null) {
            gVar.f44675i = view;
        }
        this.d.add(gVar);
    }
}
